package ru.CryptoPro.JCSP;

import java.security.Provider;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class JCSPParameters extends Provider {
    public JCSPParameters(String str, double d, String str2) {
        super(str, d, str2);
    }

    public static boolean a(int i) {
        try {
            return !HProv.enumInstalledProviders(i).isEmpty();
        } catch (Error | Exception e) {
            JCSPLogger.thrown(e);
            return false;
        }
    }

    public static boolean isECDSACSPInstalled() {
        return a(16);
    }

    public static boolean isEDDSACSPInstalled() {
        return a(32);
    }

    public static boolean isRSACSPInstalled() {
        return a(24);
    }
}
