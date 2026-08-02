package ru.CryptoPro.JCP.VMInspector;

import java.io.PrintStream;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public class SelfTestersTests {
    public static void check(PrintStream printStream) {
        int testsAmount = SelfTester_JCP.getTestsAmount();
        printStream.getClass();
        int i = 0;
        while (i < testsAmount) {
            int i2 = i + 1;
            try {
                SelfTester_JCP.check(i);
                e = null;
            } catch (Exception e) {
                e = e;
            }
            if (e != null) {
                e.printStackTrace(printStream);
            }
            i = i2;
        }
    }

    public static void main(String[] strArr) {
        check(System.out);
    }
}
