import java.util.Scanner;

public class FourArithmeticOperation {
    public static int score=0;
    public static void main(String []args){

        int num1,num2,num3;

        String randomOperator1,randomOperator2;//操作符
        float result; //运算结果，题目数目的格式化（便于计算分数）
        float countFormat;

        Random random = new Random();
        System.out.print("请输入题目个数:");
        Scanner scanner = new Scanner(System.in);
        int inputExerciseCount=scanner.nextInt();
        float inputAnswer;


        for(int j=0;j<inputExerciseCount;j++){

            randomOperator1=random.randomOperator();
            randomOperator2=random.randomOperator();
            num1=random.randomNumber();
            num2=random.randomNumber();
            num3=random.randomNumber();
           int temp;//交换数字的中间变量
            countFormat= ((float)1/(float)inputExerciseCount);
            System.out.print("<"+(j+1)+">"+"、");
            switch (randomOperator1){
                case "+":
                    switch (randomOperator2){
                        case "+":
                            result=(float)(num1+num2+num3);
                            System.out.print(num1+"+"+num2+"+"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "-":
                            while ((num1+num2)-num3<0){
                                num3=random.randomNumber();
                            }
                            result=(float)(num1+num2-num3);
                            System.out.print(num1+"+"+num2+"-"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "*":
                            result=(float)(num1+num2*num3);
                            System.out.print(num1+"+"+num2+"*"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "/":
                           if(num3==0){
                            num3=1;
                          }
                           result=num1+(float)num2/num3;
                           System.out.print(num1+"+"+num2+"/"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                           break;
                    }
                    break;
                case "-":
                    switch (randomOperator2){
                        case "+":
                            //避免产生负数
                            if(num1-num2<0){
                                temp=num1;
                                num1=num2;
                                num2=temp;
                            }
                            result=(float)num1-num2+num3;
                            System.out.print(num1+"-"+num2+"+"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "-":
                            while (num1-num2-num3<0){
                                num1=random.randomNumber();
                                num2=random.randomNumber();
                                num3=random.randomNumber();
                            }
                            result=(float)num1-num2-num3;
                            System.out.print(num1+"-"+num2+"-"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "*":
                            while (num1-num2*num3<0){
                            num1=random.randomNumber();
                            num2=random.randomNumber();
                            num3=random.randomNumber();
                        }
                            result=(float)num1-(num2*num3);
                            System.out.print(num1+"-"+num2+"*"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "/":
                            if(num3==0){
                                num3=1;
                            }
                            while (num1-num2/num3<0){
                                num1=random.randomNumber();
                                num2=random.randomNumber();
                                num3=random.randomNumber();
                                if(num3==0){
                                    num3=1;
                                }
                            }
                            if(num3==0){
                                num3=1;
                            }
                            result=num1-(float)num2/num3;
                            System.out.print(num1+"-"+num2+"/"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                    }
                    break;
                case "*":
                    switch (randomOperator2){
                        case "+":
                            result=(float)num1*num2+num3;
                            System.out.print(num1+"*"+num2+"+"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "-":
                            result=(float)num1*num2-num3;
                            while (num1*num2-num3<0){
                                num1=random.randomNumber();
                                num2=random.randomNumber();
                                num3=random.randomNumber();
                            }
                            System.out.print(num1+"*"+num2+"-"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "*":
                            result= (float) num1*num2*num3;
                            System.out.print(num1+"*"+num2+"*"+num3+"=");
                            inputAnswer= scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "/":
                            if(num3==0){
                                num3=1;
                            }
                            result=(float)num1*num2/num3;
                            System.out.print(num1+"*"+num2+"/"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                    }
                    break;
                case "/":
                    switch (randomOperator2){

                        case "+":
                            if(num2==0){
                                num2=1;
                            }
                            result=(float)num1/num2+num3;
                            System.out.print(num1+"/"+num2+"+"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "-":
                            if(num2==0){
                                num2=1;
                            }
                            while (num1/num2-num3<0){
                                num1=random.randomNumber();
                                num2=random.randomNumber();
                                num3=random.randomNumber();
                                if(num2==0){
                                    num2=1;
                                }
                            }

                            result=(float)num1/num2-num3;
                            System.out.print(num1+"/"+num2+"-"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "*":
                            if(num2==0){
                                num2=1;
                            }
                            result=(float)num1/num2*num3;
                            System.out.print(num1+"/"+num2+"*"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                        case "/":
                            if(num2==0){
                                num2=1;
                            }
                            result=(float) num1/num2+num3;
                            System.out.print(num1+"/"+num2+"+"+num3+"=");
                            inputAnswer=scanner.nextFloat();
                            check(inputAnswer,result,countFormat);
                            break;
                    }
                    break;
            }
        }
        System.out.print("共"+inputExerciseCount+"道题目，累计得分："+score);

    }
    public static void check(float answer, float result, float countFormat){
        if(Math.abs(answer-result)<0.01){
            System.out.println("答对了！");
            score= (int) (score+countFormat*100);
        }
        else {
            System.out.println("答错了，正确答案是："+String.format("%.2f",result));
        }
    }
}
