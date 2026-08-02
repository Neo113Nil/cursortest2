package ru.CryptoPro.JCSP;

import defpackage.s2u0;
import java.security.ProviderException;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.ActionTools;
import ru.CryptoPro.JCP.tools.StarterBase;
import ru.CryptoPro.JCSP.MSCAPI.CAPI;
import ru.CryptoPro.JCSP.tools.SelfTester_JavaCSP;

/* loaded from: classes4.dex */
public final class Starter extends StarterBase {

    public static class cl_0 {
        private static final Starter a = new Starter();

        private cl_0() {
        }
    }

    private Starter() {
        JCSPLogger.info(new StarterBase.StarterBeginInfo("Java CSP", JCSP.getJarVersion()).addExtraData(CAPI.CSP_PROVIDER_INFO.toString()).toString());
        JCSPLogger.info(new StarterBase.StarterEndInfo("Java CSP", ActionTools.executeWithTime(new s2u0(1)).getTime()).toString());
    }

    public static void check(Class cls) throws ProviderException {
        getInstance().checkInternal(cls);
    }

    private void checkInternal(Class cls) throws ProviderException {
        SelfTester_JavaCSP.checkClass(cls);
    }

    private static Starter getInstance() {
        return cl_0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$new$0() {
        try {
            SelfTester_JavaCSP.check();
            JCPRes.load();
            return null;
        } catch (Throwable th) {
            JCSPLogger.fatal("Error occurred during loading %s.", th);
            throw new ProviderException(th.getMessage(), th);
        }
    }
}
