package ru.cprocsp.ACSP.tools;

import android.content.Context;
import java.security.Security;
import ru.CryptoPro.JCSP.CSPConfig;
import ru.CryptoPro.JCSP.InitCallback;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.JavaConfigLayer;
import ru.CryptoPro.reprov.RevCheck;
import ru.cprocsp.ACSP.tools.store.util.UtilKeyStore;
import ru.cprocsp.NGate.tools.log.Logger;

/* loaded from: classes4.dex */
public class ProviderInit {
    public static synchronized int initCSP(Context context, String str, InitCallback initCallback) {
        int init;
        synchronized (ProviderInit.class) {
            try {
                Logger.init(str);
                init = CSPConfig.init(context, initCallback);
                if (init == 0) {
                    JavaConfigLayer.baseInitJavaSettings();
                    if (Security.getProvider("JCSP") == null) {
                        Security.addProvider(new JCSP());
                    }
                    if (Security.getProvider(RevCheck.PROVIDER_NAME) == null) {
                        Security.addProvider(new RevCheck());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return init;
    }

    public static synchronized int initCSPAndStore(Context context, String str, InitCallback initCallback) {
        int initCSP;
        synchronized (ProviderInit.class) {
            initCSP = initCSP(context, str, initCallback);
            if (initCSP == 0) {
                UtilKeyStore.initAndCheck(context);
            }
        }
        return initCSP;
    }
}
