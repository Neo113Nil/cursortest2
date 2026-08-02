package ru.CryptoPro.JCSP;

import defpackage.oyr;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCSP.support.BKSTrustStore;
import ru.CryptoPro.reprov.RevCheck;
import ru.CryptoPro.reprov.RevocationSettings;
import ru.CryptoPro.ssl.util.TLSSettings;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
public abstract class JavaConfigLayer extends NCSPConfig implements SSLProviderConstants {
    protected String bksTrustStorePath = null;

    /* renamed from: ru.CryptoPro.JCSP.JavaConfigLayer$1InitLoggerHolder, reason: invalid class name */
    public final class C1InitLoggerHolder {
        static final InitLogger initLogger = new InitLogger() { // from class: ru.CryptoPro.JCSP.JavaConfigLayer.1InitLoggerHolder.1
            @Override // ru.CryptoPro.JCSP.InitLogger
            public void error(String str) {
                JCPLogger.fatal(str);
            }

            @Override // ru.CryptoPro.JCSP.InitLogger
            public void info(String str) {
                JCPLogger.info(str);
            }

            @Override // ru.CryptoPro.JCSP.InitLogger
            public void verbose(String str) {
                JCPLogger.fine(str);
            }

            @Override // ru.CryptoPro.JCSP.InitLogger
            public void warning(String str) {
                JCPLogger.warning(str);
            }

            @Override // ru.CryptoPro.JCSP.InitLogger
            public void error(String str, Throwable th) {
                JCPLogger.fatal(str, th);
            }
        };
    }

    public static synchronized void baseInitJavaProviders(ConfigOptions configOptions) {
        synchronized (JavaConfigLayer.class) {
            try {
                if (!CSPConfigBase.isInitiated()) {
                    throw new IllegalStateException("Java providers could not be initialized without successful CSPConfig.init().");
                }
                if (Security.getProvider("JCSP") == null) {
                    Security.addProvider(new JCSP());
                }
                if (Security.getProvider(RevCheck.PROVIDER_NAME) == null) {
                    Security.addProvider(new RevCheck());
                }
                String str = (configOptions == null || !configOptions.isEnabledSSPITlsProvider()) ? SSLProviderConstants.CP_SSL_PROVIDER : "ru.CryptoPro.sspiSSL.SSPISSL";
                try {
                    Security.removeProvider("JTLS");
                    Security.addProvider((Provider) Class.forName(str).newInstance());
                } catch (Throwable th) {
                    internalInitLogger().error("Loading of TLS provider " + str + " failed.", th);
                }
                cpSSLConfig.setDefaultSSLProvider("JCSP");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void baseInitJavaSettings() {
        synchronized (JavaConfigLayer.class) {
            System.setProperty("com.sun.security.enableCRLDP", "true");
            System.setProperty("com.ibm.security.enableCRLDP", "true");
            System.setProperty("com.sun.security.crl.timeout", "5");
            System.setProperty("ru.CryptoPro.crl.read_timeout", "5");
            System.setProperty("ru.CryptoPro.CAdES.validate_tsp", "false");
        }
    }

    public static synchronized void extendedInitJavaSettings() {
        synchronized (JavaConfigLayer.class) {
            baseInitJavaSettings();
            System.setProperty("ngate_set_jcsp_if_gost", "true");
            System.setProperty(TLSSettings.TLS_CLIENT_DISABLE_ISSUER_CHECK_PREF_NAME, "true");
            System.setProperty(RevocationSettings.DISABLE_DEFAULT_PKIX_PREF_NAME, "true");
            String bksTrustStoreType = getBksTrustStoreType();
            String bksTrustStoreFile = getBksTrustStoreFile();
            String bksTrustStorePassword = getBksTrustStorePassword();
            System.setProperty("javax.net.ssl.trustStoreType", bksTrustStoreType);
            System.setProperty("javax.net.ssl.trustStore", bksTrustStoreFile);
            System.setProperty("javax.net.ssl.trustStorePassword", bksTrustStorePassword);
            System.setProperty("com.sun.security.enableAIAcaIssuers", "true");
            System.setProperty("ru.CryptoPro.reprov.enableAIAcaIssuers", "true");
        }
    }

    public static String getBksTrustStore() {
        CSPConfigBase cSPConfigBase = CSPConfigBase.INSTANCE;
        if (cSPConfigBase instanceof CSPConfig) {
            return ((CSPConfig) cSPConfigBase).bksTrustStorePath;
        }
        internalInitLogger().info("CSP has not been initialized.");
        return null;
    }

    public static String getBksTrustStoreFile() {
        if (getBksTrustStore() == null) {
            internalInitLogger().info("CSP has not been initialized.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getBksTrustStore());
        return oyr.t(sb, File.separator, "cacerts");
    }

    public static String getBksTrustStorePassword() {
        return String.valueOf(BKSTrustStore.STORAGE_PASSWORD);
    }

    public static String getBksTrustStoreType() {
        return BKSTrustStore.STORAGE_TYPE;
    }

    private static InitLogger internalInitLogger() {
        return C1InitLoggerHolder.initLogger;
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public synchronized void extendedInit(ExtendedOptions extendedOptions, InitCallback initCallback) {
        try {
            if (this.initializeError == 0) {
                ConfigOptions configOptions = extendedOptions instanceof ConfigOptions ? (ConfigOptions) extendedOptions : null;
                Security.setProperty("ssl.KeyManagerFactory.algorithm", "GostX509");
                Security.setProperty("ssl.TrustManagerFactory.algorithm", "GostX509");
                String str = (configOptions == null || !configOptions.isEnabledSSPITlsProvider()) ? SSLProviderConstants.CP_SSL_PACKAGE : SSLProviderConstants.SSP_SSL_PACKAGE;
                internalInitLogger().info("Expected TLS provider package is ".concat(str));
                Security.setProperty("ssl.SocketFactory.provider", str.concat(".SSLSocketFactoryImpl"));
                Security.setProperty("ssl.ServerSocketFactory.provider", str.concat(".SSLServerSocketFactoryImpl"));
                baseInitJavaSettings();
                baseInitJavaProviders(configOptions);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public InitLogger initLogger() {
        return internalInitLogger();
    }
}
