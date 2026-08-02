package ru.CryptoPro.JCP.tools;

import defpackage.d7g0;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.logger.JCPLoggerInternal;

/* loaded from: classes4.dex */
public class SelfTester_Auxiliary extends SelfTesterJar {
    public static final String PARAM_JAR_CLASSES_Auxiliary = "SelfTester_jar_classes_java_auxiliary25";
    public static final boolean w;
    public static final Object x;
    public static final SelfTester_Auxiliary y;

    static {
        boolean booleanProperty = GetProperty.getBooleanProperty("use_selftester_auxiliary", false);
        w = booleanProperty;
        x = new Object();
        y = booleanProperty ? new SelfTester_Auxiliary() : null;
    }

    public SelfTester_Auxiliary() {
        super(new JCPLoggerInternal(), "ru.CryptoPro.JCPRequest.GostCertificateRequest;ru.CryptoPro.reprov.CPCertPathBuilder;ru.CryptoPro.reprov.array.DerValue;ru.CryptoPro.ssl.SSLContextImpl;ru.CryptoPro.JCPxml.XmlInit;ru.CryptoPro.AdES.external.signature.AdESSigner;ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure;ru.CryptoPro.CAdES.AbstractCAdESSignature;ru.CryptoPro.XAdES.XAdESSigner;ru.CryptoPro.JCP.ControlPane.PageLicense;ru.CryptoPro.sspiSSL.SSLContextImpl", PARAM_JAR_CLASSES_Auxiliary);
    }

    public static void check() throws SelfTesterException {
        if (!Platform.isAndroid && w && y == null) {
            d7g0.n("SelfTester Error: tester initialization is incorrect");
        }
    }

    public static void checkClass(Class cls) throws SelfTesterException {
        check();
        String str = Platform.CP_IBM866;
    }

    public static int getTestsAmount() {
        if (w) {
            return y.testsAmount;
        }
        return 0;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterJar
    public Class getPrefHolder() {
        return SelfTester_Auxiliary.class;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterJar
    public Object getSync() {
        return x;
    }
}
