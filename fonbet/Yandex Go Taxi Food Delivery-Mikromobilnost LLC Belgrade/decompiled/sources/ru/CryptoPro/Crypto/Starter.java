package ru.CryptoPro.Crypto;

import defpackage.aw61;
import defpackage.s2u0;
import java.security.ProviderException;
import ru.CryptoPro.Crypto.tools.SelfTester_Crypt;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.ActionTools;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.StarterBase;

/* loaded from: classes4.dex */
public final class Starter extends StarterBase {
    private Starter() {
        JCPLogger.info(new StarterBase.StarterBeginInfo("crypto module", JCP.getJarVersion()).toString());
        JCPLogger.info(new StarterBase.StarterEndInfo("crypto module", ActionTools.executeWithTime(new s2u0(2)).getTime()).toString());
    }

    public static void check(Class cls) throws ProviderException {
        getInstance().checkInternal(cls);
    }

    private void checkInternal(Class cls) throws ProviderException {
        SelfTester_Crypt.checkClass(cls);
    }

    private static Starter getInstance() {
        return aw61.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$new$0() {
        try {
            SelfTester_Crypt.check();
            CPRandom.check();
            JCPRes.load();
            return null;
        } catch (Throwable th) {
            JCPLogger.fatal("Error occurred during loading %s.", th);
            throw new ProviderException(th.getMessage(), th);
        }
    }
}
