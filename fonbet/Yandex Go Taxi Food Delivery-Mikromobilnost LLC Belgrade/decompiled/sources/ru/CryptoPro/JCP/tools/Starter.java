package ru.CryptoPro.JCP.tools;

import defpackage.s2u0;
import java.security.ProviderException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.StarterBase;

/* loaded from: classes4.dex */
public final class Starter extends StarterBase {

    public static class StarterInstanceHolder {
        private static final Starter INSTANCE = new Starter();

        private StarterInstanceHolder() {
        }
    }

    private Starter() {
        JCPLogger.info(new StarterBase.StarterBeginInfo("JCP", JCP.getJarVersion()).toString());
        JCPLogger.info(new StarterBase.StarterEndInfo("JCP", ActionTools.executeWithTime(new s2u0(0)).getTime()).toString());
    }

    public static void check(Class cls) throws ProviderException {
        getInstance().checkInternal(cls);
    }

    private void checkInternal(Class cls) throws ProviderException {
        SelfTester_JCP.checkClass(cls);
    }

    private static Starter getInstance() {
        return StarterInstanceHolder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$new$0() {
        try {
            SelfTester_JCP.check();
            CPRandom.check();
            JCPRes.load();
            return null;
        } catch (Throwable th) {
            JCPLogger.fatal("Error occurred during loading %s.", th);
            throw new ProviderException(th.getMessage(), th);
        }
    }
}
