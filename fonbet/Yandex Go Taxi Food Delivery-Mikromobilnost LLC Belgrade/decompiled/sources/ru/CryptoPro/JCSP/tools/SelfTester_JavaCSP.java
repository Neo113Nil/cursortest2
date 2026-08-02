package ru.CryptoPro.JCSP.tools;

import defpackage.d7g0;
import java.security.Provider;
import java.security.Security;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.SelfTesterBase;
import ru.CryptoPro.JCP.tools.SelfTesterException;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.JCSPLoggerInternal;

/* loaded from: classes4.dex */
public class SelfTester_JavaCSP extends SelfTesterBase {
    public static final String PARAM_JAR_CLASSES_JavaCSP = "SelfTester_jar_classes_java_csp";
    public static final String THREAD_NAME = "SelfTester-JavaCSP";
    private static final String a = "SelfTester_external_classNames_java_csp";
    private static final String b = "ru.CryptoPro.JCSP.JCSPInstaller";
    private static final Object c = new Object();
    private static final SelfTester_JavaCSP d = new SelfTester_JavaCSP();

    private SelfTester_JavaCSP() {
        super(new JCSPLoggerInternal(), b, "", PARAM_JAR_CLASSES_JavaCSP, a);
    }

    public static void addExternalTest(String str) {
        SelfTesterBase.addTest(SelfTester_JavaCSP.class, str, a);
    }

    public static void addJarVerifyTest(String str) {
        SelfTesterBase.addTest(SelfTester_JavaCSP.class, str, PARAM_JAR_CLASSES_JavaCSP);
    }

    public static void check() throws SelfTesterException {
        if (Platform.isAndroid) {
            return;
        }
        SelfTester_JavaCSP selfTester_JavaCSP = d;
        if (selfTester_JavaCSP != null) {
            selfTester_JavaCSP.checkInternal();
        } else {
            d7g0.n("SelfTester Error: tester initialization is incorrect");
        }
    }

    public static void checkClass(Class cls) throws SelfTesterException {
        check();
        String str = Platform.CP_IBM866;
    }

    public static int getTestsAmount() {
        return d.testsAmount;
    }

    public static void removeExternalTest(String str) {
        SelfTesterBase.removeTest(SelfTester_JavaCSP.class, str, a);
    }

    public static void removeJarVerifyTest(String str) {
        SelfTesterBase.removeTest(SelfTester_JavaCSP.class, str, PARAM_JAR_CLASSES_JavaCSP);
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterBase
    public boolean checkProvider() {
        Provider provider = Security.getProvider(getProviderName());
        if (provider != null && provider.getClass().equals(getProviderClass())) {
            return true;
        }
        Security.addProvider(new JCSP());
        Provider provider2 = Security.getProvider(getProviderName());
        return provider2 != null && provider2.getClass().equals(getProviderClass());
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterJar
    public Class getPrefHolder() {
        return SelfTester_JavaCSP.class;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterBase
    public Class getProviderClass() {
        return JCSP.class;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterBase
    public String getProviderName() {
        return "JCSP";
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterJar
    public Object getSync() {
        return c;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterBase
    public String getThreadName() {
        return THREAD_NAME;
    }

    public static void check(int i) throws SelfTesterException {
        check();
        d.checkInternal(i);
    }
}
