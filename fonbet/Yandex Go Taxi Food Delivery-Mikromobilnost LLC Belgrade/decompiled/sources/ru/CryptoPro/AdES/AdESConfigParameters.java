package ru.CryptoPro.AdES;

import java.security.AccessController;
import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public class AdESConfigParameters {
    public static final String PREF_NAME = "AdESConfigParameters_desync_class_default";
    public static final long TIMEOUT_MAX = 120000;
    private static long defaultDesyncTimeout = loadDefaultDesyncTimeout();
    private static final Object SyncObject = new Object();

    public static long getDefaultDesyncTimeout() {
        long j;
        synchronized (SyncObject) {
            j = defaultDesyncTimeout;
        }
        return j;
    }

    private static long loadDefaultDesyncTimeout() {
        long j;
        try {
            j = ((Long) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.AdES.AdESConfigParameters.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return Long.valueOf(new JCPPref(AdESConfigParameters.class).getLong(AdESConfigParameters.PREF_NAME, -1L));
                }
            })).longValue();
        } catch (Exception unused) {
            j = -1;
        }
        if (j == -1) {
            return 120000L;
        }
        return j;
    }

    public static void putDefaultDesyncTimeout(long j) {
        JCPPref jCPPref = new JCPPref(AdESConfigParameters.class);
        synchronized (SyncObject) {
            jCPPref.putLong(PREF_NAME, j);
            defaultDesyncTimeout = j;
        }
    }
}
