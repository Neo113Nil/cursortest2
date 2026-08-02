package ru.CryptoPro.reprov;

import defpackage.bx61;
import defpackage.kx61;
import defpackage.vx61;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.pref_store.PrefStore;

/* loaded from: classes4.dex */
public class RevocationSettings {
    public static final String DISABLE_DEFAULT_PKIX_PREF_NAME = "disable_default_pkix";
    public static final String DISABLE_ENROLL_CERT_TYPE_EXT_CHECKER_PREF_NAME = "disable_enroll_cert_type_ext_checker";
    public static final String DISABLE_TSP_CERT_APP_EXT_CHECKER_PREF_NAME = "disable_tsp_cert_app_ext_checker";
    public static final JCPPref a = new JCPPref(RevocationSettings.class);
    public static PrefStore prefStore;

    public static byte[] convertToBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16777216];
        while (true) {
            int read = inputStream.read(bArr, 0, 16777216);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static boolean getDisableDefaultPkix() {
        boolean z;
        if (bx61.a) {
            return true;
        }
        if (Platform.isAndroid) {
            PrefStore prefStore2 = prefStore;
            if (prefStore2 != null) {
                z = prefStore2.getBoolean(DISABLE_DEFAULT_PKIX_PREF_NAME, false);
            } else {
                JCPLogger.warning("RevocationSettings have not been initialized.");
                z = false;
            }
        } else {
            z = a.getBoolean(DISABLE_DEFAULT_PKIX_PREF_NAME, false);
        }
        return z;
    }

    public static boolean getDisableEnrollCertTypeExtChecker() {
        boolean z;
        if (kx61.a) {
            return true;
        }
        if (Platform.isAndroid) {
            PrefStore prefStore2 = prefStore;
            if (prefStore2 != null) {
                z = prefStore2.getBoolean(DISABLE_ENROLL_CERT_TYPE_EXT_CHECKER_PREF_NAME, false);
            } else {
                JCPLogger.warning("RevocationSettings have not been initialized.");
                z = false;
            }
        } else {
            z = a.getBoolean(DISABLE_ENROLL_CERT_TYPE_EXT_CHECKER_PREF_NAME, false);
        }
        return z;
    }

    public static boolean getDisableTSPCertAppExtChecker() {
        boolean z;
        if (vx61.a) {
            return true;
        }
        if (Platform.isAndroid) {
            PrefStore prefStore2 = prefStore;
            if (prefStore2 != null) {
                z = prefStore2.getBoolean(DISABLE_TSP_CERT_APP_EXT_CHECKER_PREF_NAME, false);
            } else {
                JCPLogger.warning("RevocationSettings have not been initialized.");
                z = false;
            }
        } else {
            z = a.getBoolean(DISABLE_TSP_CERT_APP_EXT_CHECKER_PREF_NAME, false);
        }
        return z;
    }

    public static synchronized void init(PrefStore prefStore2) {
        synchronized (RevocationSettings.class) {
            if (!Platform.isAndroid) {
                throw new RuntimeException("Initializing is supported in OS Google Android only!");
            }
            if (prefStore == null) {
                prefStore = prefStore2;
            }
        }
    }

    public static boolean setDisableDefaultPkix(boolean z) {
        if (!Platform.isAndroid) {
            a.putBoolean(DISABLE_DEFAULT_PKIX_PREF_NAME, z);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putBoolean(DISABLE_DEFAULT_PKIX_PREF_NAME, z);
        }
        JCPLogger.warning("RevocationSettings have not been initialized.");
        return false;
    }

    public static boolean setDisableEnrollCertTypeExtChecker(boolean z) {
        if (!Platform.isAndroid) {
            a.putBoolean(DISABLE_ENROLL_CERT_TYPE_EXT_CHECKER_PREF_NAME, z);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putBoolean(DISABLE_ENROLL_CERT_TYPE_EXT_CHECKER_PREF_NAME, z);
        }
        JCPLogger.warning("RevocationSettings have not been initialized.");
        return false;
    }

    public static boolean setDisableTSPCertAppExtChecker(boolean z) {
        if (!Platform.isAndroid) {
            a.putBoolean(DISABLE_TSP_CERT_APP_EXT_CHECKER_PREF_NAME, z);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putBoolean(DISABLE_TSP_CERT_APP_EXT_CHECKER_PREF_NAME, z);
        }
        JCPLogger.warning("RevocationSettings have not been initialized.");
        return false;
    }
}
