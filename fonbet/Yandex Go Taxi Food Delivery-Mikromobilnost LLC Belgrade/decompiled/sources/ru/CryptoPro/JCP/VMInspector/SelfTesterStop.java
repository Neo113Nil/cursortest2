package ru.CryptoPro.JCP.VMInspector;

import java.security.KeyPairGenerator;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.tools.SelfTester_JavaCSP;

/* loaded from: classes4.dex */
public class SelfTesterStop {
    private SelfTesterStop() {
    }

    public static void main(String[] strArr) throws Exception {
        String str;
        Inspector.print("Cryptographic module disabling verify.");
        Thread thread = null;
        try {
            String defaultDigestSignatureProvider = PaneDefaultProvider.getDefaultDigestSignatureProvider(null);
            String str2 = defaultDigestSignatureProvider.equalsIgnoreCase("JCP") ? SelfTester_JCP.THREAD_NAME : SelfTester_JavaCSP.THREAD_NAME;
            Inspector.print(str2.concat(" run."));
            Inspector.print(defaultDigestSignatureProvider.concat(" verify."));
            if (KeyPairGenerator.getInstance(JCP.GOST_EL_DEGREE_NAME, defaultDigestSignatureProvider) == null) {
                throw new Exception();
            }
            Inspector.print(str2.concat(" search."));
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            Thread[] threadArr = new Thread[threadGroup.activeCount()];
            int enumerate = threadGroup.enumerate(threadArr);
            for (int i = 0; i < enumerate; i++) {
                if (threadArr[i].getName().equals(str2)) {
                    thread = threadArr[i];
                }
            }
            if (thread == null) {
                throw new Exception();
            }
            Inspector.print(str2 + " stop.");
            thread.interrupt();
            thread.join();
            Inspector.print("Verify...");
            try {
                if (KeyPairGenerator.getInstance(JCP.GOST_EL_DEGREE_NAME, defaultDigestSignatureProvider) != null) {
                    throw new Exception();
                }
                throw new Exception();
            } catch (Exception e) {
                Inspector.print("OK: error.");
                Inspector.print(e);
                Inspector.print("Recover...");
                try {
                    thread.start();
                } catch (Exception e2) {
                    Inspector.print("Recover not successful.");
                    Inspector.print(e2);
                }
                Inspector.print("Verify...");
                try {
                } catch (Exception e3) {
                    Inspector.print("OK: error.");
                    Inspector.print(e3);
                    str = Inspector.STR_TEST_PASSED;
                }
                if (KeyPairGenerator.getInstance(JCP.GOST_EL_DEGREE_NAME, defaultDigestSignatureProvider) == null) {
                    throw new Exception();
                }
                str = Inspector.STR_TEST_FAILED;
                Inspector.print(str);
            }
        } catch (Exception e4) {
            Inspector.print(e4);
        }
    }
}
