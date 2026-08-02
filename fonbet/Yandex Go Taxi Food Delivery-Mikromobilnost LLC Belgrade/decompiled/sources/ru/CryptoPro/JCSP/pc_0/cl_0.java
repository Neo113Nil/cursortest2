package ru.CryptoPro.JCSP.pc_0;

import java.io.PrintStream;
import ru.CryptoPro.JCSP.tools.SelfTester_JavaCSP;

/* loaded from: classes4.dex */
public class cl_0 {
    public static void a(PrintStream printStream) {
        int testsAmount = SelfTester_JavaCSP.getTestsAmount();
        printStream.getClass();
        int i = 0;
        while (i < testsAmount) {
            int i2 = i + 1;
            try {
                SelfTester_JavaCSP.check(i);
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

    public static void a(String[] strArr) {
        a(System.out);
    }
}
