package ru.CryptoPro.ssl.util;

import defpackage.ny61;
import java.security.AccessController;
import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.pref_store.PrefStore;
import ru.CryptoPro.ssl.SSLLogger;

/* loaded from: classes4.dex */
public class TLSSettings {
    public static final String DEFAULT_SETTINGS_CLASS_NAME = "ru.CryptoPro.ssl.ServerSettings";
    public static final String DEFAULT_SSPI_CLASS_NAME = "ru.CryptoPro.sspiSSL.SSPISSL";
    public static final int DEF_CASH_SIZE = 20;
    public static final int DEF_CASH_TIME = 24;
    public static final boolean DEF_CLIENT_FIXED_DH_ALLOWED = false;
    public static final String DEF_CRl_LOCATION = "";
    public static final boolean DEF_ENABLE_REVOCATION = true;
    public static final boolean DEF_ENABLE_REVOCATION_OFFLINE = false;
    public static final boolean DEF_ENABLE_REVOCATION_ONLINE = true;
    public static final int DEF_RI_SUPPORT_REQUIRED = 1;
    public static final int RI_SUPPORT_DISABLE = 0;
    public static final int RI_SUPPORT_ENABLE = 1;
    public static final int RI_SUPPORT_REQUIRE = 2;
    public static final String TLS_CLIENT_DISABLE_ISSUER_CHECK_PREF_NAME = "tls_client_disable_issuer_check";
    public static final String TLS_PROHIBIT_DISABLED_VALIDATION_PREF_NAME = "tls_prohibit_disabled_validation";
    public static final JCPPref a;
    public static PrefStore prefStore;

    /* renamed from: ru.CryptoPro.ssl.util.TLSSettings$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty("javax.net.ssl.sessionCacheSize");
        }
    }

    public static final class SystemTlsClientDisableIssuerCheckHolder {
        public static final Boolean a = Boolean.valueOf(GetProperty.getBooleanProperty(TLSSettings.TLS_CLIENT_DISABLE_ISSUER_CHECK_PREF_NAME, false));
    }

    public static final class SystemTlsProhibitDisableValidationHolder {
        public static final Boolean a = Boolean.valueOf(GetProperty.getBooleanProperty(TLSSettings.TLS_PROHIBIT_DISABLED_VALIDATION_PREF_NAME, true));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TlsProviderType {
        public static final TlsProviderType JavaTls;
        public static final TlsProviderType SpiTls;
        private static final /* synthetic */ TlsProviderType[] a;

        static {
            TlsProviderType tlsProviderType = new TlsProviderType("JavaTls", 0);
            JavaTls = tlsProviderType;
            TlsProviderType tlsProviderType2 = new TlsProviderType("SpiTls", 1);
            SpiTls = tlsProviderType2;
            a = new TlsProviderType[]{tlsProviderType, tlsProviderType2};
        }

        public static TlsProviderType valueOf(String str) {
            return (TlsProviderType) Enum.valueOf(TlsProviderType.class, str);
        }

        public static TlsProviderType[] values() {
            return (TlsProviderType[]) a.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    static {
        String str;
        Class<TLSSettings> cls = TLSSettings.class;
        if (!Platform.isAndroid) {
            try {
                try {
                    cls = initTlsSettings(DEFAULT_SETTINGS_CLASS_NAME);
                } catch (ClassNotFoundException | NoClassDefFoundError e) {
                    th = e;
                    str = "No one SSL provider found.";
                    SSLLogger.fatal(str, th);
                    cls = null;
                    if (cls != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    str = "Error occurred during ru.CryptoPro.sspiSSL.SSPISSL class loading.";
                    SSLLogger.fatal(str, th);
                    cls = null;
                    if (cls != null) {
                    }
                }
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                initTlsSettings("ru.CryptoPro.sspiSSL.SSPISSL");
            } catch (Throwable th2) {
                th = th2;
                str = "Error occurred during ru.CryptoPro.ssl.ServerSettings class loading.";
                SSLLogger.fatal(str, th);
                cls = null;
            }
        }
        if (cls != null) {
            a = new JCPPref(cls);
        } else {
            ny61.g("TLS settings not found.");
        }
    }

    public static int a() {
        int i = 20;
        try {
            String str = (String) AccessController.doPrivileged(new AnonymousClass1());
            if (str != null) {
                i = Integer.valueOf(str).intValue();
            }
        } catch (Exception unused) {
        }
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public static int getDefaultAuth() {
        if (!Platform.isAndroid) {
            return a.getInt("Client_auth_default", 0);
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.getInt("Client_auth_default", 0);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return 0;
    }

    public static String getDefaultCRLLocation() {
        return "";
    }

    public static boolean getDefaultCRLRevocationOffline() {
        return false;
    }

    public static boolean getDefaultCRLRevocationOnline() {
        return false;
    }

    public static boolean getDefaultEnableRevocation() {
        if (!Platform.isAndroid) {
            return a.getBoolean("Enable_revocation_default", true);
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.getBoolean("Enable_revocation_default", true);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return true;
    }

    public static int getDefaultRiSupportRequired() {
        if (!Platform.isAndroid) {
            return a.getInt("RI_support", 1);
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.getInt("RI_support", 1);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return 1;
    }

    public static int getDefaultSize() {
        if (!Platform.isAndroid) {
            return a.getInt("Session_cache_size_default", a());
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.getInt("Session_cache_size_default", a());
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return a();
    }

    public static TlsProviderType getDefaultTLSProvider(TlsProviderType tlsProviderType) {
        if (!Platform.isAndroid) {
            SSLLogger.warning("TLSSettings#getDefaultTLSProvider is for Android only.");
            return tlsProviderType;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return TlsProviderType.values()[prefStore2.getInt("Provider_default", tlsProviderType.ordinal())];
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return tlsProviderType;
    }

    public static int getDefaultTime() {
        if (!Platform.isAndroid) {
            return a.getInt("Session_time_default", 24);
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.getInt("Session_time_default", 24);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return 24;
    }

    public static boolean getTlsClientDisableIssuerCheck() {
        boolean z;
        if (SystemTlsClientDisableIssuerCheckHolder.a.booleanValue()) {
            return true;
        }
        if (Platform.isAndroid) {
            PrefStore prefStore2 = prefStore;
            if (prefStore2 != null) {
                z = prefStore2.getBoolean(TLS_CLIENT_DISABLE_ISSUER_CHECK_PREF_NAME, false);
            } else {
                SSLLogger.warning("TLSSettings have not been initialized.");
                z = false;
            }
        } else {
            z = a.getBoolean(TLS_CLIENT_DISABLE_ISSUER_CHECK_PREF_NAME, false);
        }
        return z;
    }

    public static boolean getTlsClientFixedDhAllowed() {
        return false;
    }

    public static boolean getTlsClientStrictCertVerify() {
        if (!Platform.isAndroid) {
            return a.getBoolean("tls_client_strict_certificate_verify", true);
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.getBoolean("tls_client_strict_certificate_verify", true);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return true;
    }

    public static boolean getTlsProhibitDisabledValidation() {
        boolean z;
        if (!SystemTlsProhibitDisableValidationHolder.a.booleanValue()) {
            return false;
        }
        if (Platform.isAndroid) {
            PrefStore prefStore2 = prefStore;
            if (prefStore2 != null) {
                z = prefStore2.getBoolean(TLS_PROHIBIT_DISABLED_VALIDATION_PREF_NAME, true);
            } else {
                SSLLogger.warning("TLSSettings have not been initialized.");
                z = true;
            }
        } else {
            z = a.getBoolean(TLS_PROHIBIT_DISABLED_VALIDATION_PREF_NAME, true);
        }
        return z;
    }

    public static boolean ifWrite() {
        if (Platform.isAndroid) {
            return true;
        }
        return a.isWriteAvailable();
    }

    public static synchronized void init(PrefStore prefStore2) {
        synchronized (TLSSettings.class) {
            if (!Platform.isAndroid) {
                throw new RuntimeException("Initializing is supported in OS Google Android only!");
            }
            if (prefStore == null) {
                prefStore = prefStore2;
            }
        }
    }

    public static Class initTlsSettings(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return Class.forName(str, false, Thread.currentThread().getContextClassLoader());
        }
    }

    public static boolean setDefaultAuth(int i) {
        if (!Platform.isAndroid) {
            a.putInt("Client_auth_default", i);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putInt("Client_auth_default", i);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return false;
    }

    public static boolean setDefaultCRLLocation(String str) {
        return true;
    }

    public static boolean setDefaultCRLRevocationOffline(boolean z) {
        return true;
    }

    public static boolean setDefaultCRLRevocationOnline(boolean z) {
        return true;
    }

    public static boolean setDefaultEnableRevocation(boolean z) {
        if (!Platform.isAndroid) {
            a.putBoolean("Enable_revocation_default", z);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putBoolean("Enable_revocation_default", z);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return false;
    }

    public static boolean setDefaultRiSupportRequired(int i) {
        if (!Platform.isAndroid) {
            a.putInt("RI_support", i);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putInt("RI_support", i);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return false;
    }

    public static boolean setDefaultSize(int i) {
        if (!Platform.isAndroid) {
            a.putInt("Session_cache_size_default", i);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putInt("Session_cache_size_default", i);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return false;
    }

    public static boolean setDefaultTLSProvider(TlsProviderType tlsProviderType) {
        String str;
        if (Platform.isAndroid) {
            PrefStore prefStore2 = prefStore;
            if (prefStore2 != null) {
                return prefStore2.putInt("Provider_default", tlsProviderType.ordinal());
            }
            str = "TLSSettings have not been initialized.";
        } else {
            str = "TLSSettings#setDefaultTLSProvider is for Android only.";
        }
        SSLLogger.warning(str);
        return false;
    }

    public static boolean setDefaultTime(int i) {
        if (!Platform.isAndroid) {
            a.putInt("Session_time_default", i);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putInt("Session_time_default", i);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return false;
    }

    public static boolean setTlsClientDisableIssuerCheck(boolean z) {
        if (!Platform.isAndroid) {
            a.putBoolean(TLS_CLIENT_DISABLE_ISSUER_CHECK_PREF_NAME, z);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putBoolean(TLS_CLIENT_DISABLE_ISSUER_CHECK_PREF_NAME, z);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return false;
    }

    public static boolean setTlsClientFixedDhAllowed(boolean z) {
        return true;
    }

    public static boolean setTlsClientStrictCertVerify(boolean z) {
        if (!Platform.isAndroid) {
            a.putBoolean("tls_client_strict_certificate_verify", z);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putBoolean("tls_client_strict_certificate_verify", z);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return false;
    }

    public static boolean setTlsProhibitDisabledValidation(boolean z) {
        if (!Platform.isAndroid) {
            a.putBoolean(TLS_PROHIBIT_DISABLED_VALIDATION_PREF_NAME, z);
            return true;
        }
        PrefStore prefStore2 = prefStore;
        if (prefStore2 != null) {
            return prefStore2.putBoolean(TLS_PROHIBIT_DISABLED_VALIDATION_PREF_NAME, z);
        }
        SSLLogger.warning("TLSSettings have not been initialized.");
        return false;
    }
}
