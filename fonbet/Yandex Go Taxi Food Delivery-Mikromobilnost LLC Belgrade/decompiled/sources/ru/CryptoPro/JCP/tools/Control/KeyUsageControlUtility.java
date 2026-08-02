package ru.CryptoPro.JCP.tools.Control;

import defpackage.nzs;
import defpackage.puu0;
import java.security.AccessController;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public class KeyUsageControlUtility {
    public static final String DEFAULT_PREF_NAME = "StrengthenedKeyUsageControl";
    public static final Object b = new Object();
    public static boolean a = ((Boolean) AccessController.doPrivileged(new puu0(2))).booleanValue();

    public static boolean ifWrite() {
        return nzs.u(KeyUsageControlUtility.class);
    }

    public static boolean isStrictModeEnabled() {
        boolean z;
        synchronized (b) {
            z = a;
        }
        return z;
    }

    public static void setStrictModeEnabled(boolean z, boolean z2) {
        JCPPref jCPPref = new JCPPref(KeyUsageControlUtility.class);
        synchronized (b) {
            jCPPref.putBoolean(DEFAULT_PREF_NAME, z);
            a = z;
            if (z2) {
                try {
                    jCPPref.sync();
                } catch (BackingStoreException unused) {
                }
            }
            if (a && !InternalGostPrivateKey.isCheckOfPKUPEnabled()) {
                InternalGostPrivateKey.setCheckPKUPEnabled(true, z2);
            }
        }
    }

    public static void setStrictModeEnabled(boolean z) {
        setStrictModeEnabled(z, false);
    }
}
