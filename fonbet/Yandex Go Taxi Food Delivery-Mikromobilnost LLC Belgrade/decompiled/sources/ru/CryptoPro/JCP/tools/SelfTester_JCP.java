package ru.CryptoPro.JCP.tools;

import defpackage.d7g0;
import java.security.Provider;
import java.security.Security;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.logger.JCPLoggerInternal;

/* loaded from: classes4.dex */
public final class SelfTester_JCP extends SelfTesterBase {
    public static final int CONST_ELLIPTIC = 32768;
    public static final int CONST_ELLIPTIC_2012_512 = 131072;
    public static final int DECRYPT_CBC = 67108864;
    public static final int DECRYPT_CFB = 33554432;
    public static final int DECRYPT_CNT = 134217728;
    public static final int DECRYPT_ECB = 16777216;
    public static final int DIGEST = 1;
    public static final int DIGEST_2012_256 = 262144;
    public static final int DIGEST_2012_512 = 524288;
    public static final int DIGEST_STEP = 2;
    public static final int DIGEST_STORE = 16384;
    public static final int ENCRYPT_CBC = 4194304;
    public static final int ENCRYPT_CFB = 2097152;
    public static final int ENCRYPT_CNT = 8388608;
    public static final int ENCRYPT_ECB = 1048576;
    public static final int IMITA = 268435456;
    public static final int POW_MOD_EL = 4096;
    public static final int SIGNATURE_EL = 4;
    public static final int SIGNATURE_EL_2012_256_01Test = 16;
    public static final int SIGNATURE_EL_2012_256_Edw = 64;
    public static final int SIGNATURE_EL_2012_512_A = 256;
    public static final int SIGNATURE_EL_2012_512_C_Edw = 1024;
    public static final int TEST_LICENSE = 65536;
    public static final int TEST_PHI = 8192;
    public static final String THREAD_NAME = "SelfTester-JCP";
    public static final int VERIFY_EL = 8;
    public static final int VERIFY_EL_2012_256_01Test = 32;
    public static final int VERIFY_EL_2012_256_Edw = 128;
    public static final int VERIFY_EL_2012_512_A = 512;
    public static final int VERIFY_EL_2012_512_C_Edw = 2048;
    public static final Object w = new Object();
    public static final String PARAM_JAR_CLASSES_JCP = "SelfTester_jar_classes_jcp";
    public static final SelfTester_JCP x = new SelfTester_JCP(new JCPLoggerInternal(), "ru.CryptoPro.JCP.Install.JCPInstaller", SelfTests.DEFAULT_TESTS_STRING_JCP, PARAM_JAR_CLASSES_JCP, "SelfTester_external_classNames_jcp");

    public static void addExternalTest(String str) {
        SelfTesterBase.addTest(SelfTester_JCP.class, str, "SelfTester_external_classNames_jcp");
    }

    public static void addJarVerifyTest(String str) {
        SelfTesterBase.addTest(SelfTester_JCP.class, str, PARAM_JAR_CLASSES_JCP);
    }

    public static void check() throws SelfTesterException {
        if (Platform.isAndroid) {
            return;
        }
        SelfTester_JCP selfTester_JCP = x;
        if (selfTester_JCP != null) {
            selfTester_JCP.checkInternal();
        } else {
            d7g0.n("SelfTester Error: tester initialization is incorrect");
        }
    }

    public static void checkClass(Class cls) throws SelfTesterException {
        check();
        String str = Platform.CP_IBM866;
    }

    public static int getTestsAmount() {
        return x.testsAmount;
    }

    public static void removeExternalTest(String str) {
        SelfTesterBase.removeTest(SelfTester_JCP.class, str, "SelfTester_external_classNames_jcp");
    }

    public static void removeJarVerifyTest(String str) {
        SelfTesterBase.removeTest(SelfTester_JCP.class, str, PARAM_JAR_CLASSES_JCP);
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterBase
    public boolean checkProvider() {
        Provider provider = Security.getProvider(getProviderName());
        if (provider != null && provider.getClass().equals(getProviderClass())) {
            return true;
        }
        Security.addProvider(new JCP());
        Provider provider2 = Security.getProvider(getProviderName());
        return provider2 != null && provider2.getClass().equals(getProviderClass());
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterJar
    public Class getPrefHolder() {
        return SelfTester_JCP.class;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterBase
    public Class getProviderClass() {
        return JCP.class;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterBase
    public String getProviderName() {
        return "JCP";
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterJar
    public Object getSync() {
        return w;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterBase
    public String getThreadName() {
        return THREAD_NAME;
    }

    public static void check(int i) throws SelfTesterException {
        check();
        x.checkInternal(i);
    }
}
