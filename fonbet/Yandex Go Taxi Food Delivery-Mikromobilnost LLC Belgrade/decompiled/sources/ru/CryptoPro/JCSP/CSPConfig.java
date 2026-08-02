package ru.CryptoPro.JCSP;

import android.app.Application;
import android.content.Context;
import defpackage.ny61;
import defpackage.oyr;
import java.io.File;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.pref_store.AndroidPrefStore;
import ru.CryptoPro.JCSP.state.CreateTrustStoresEvent;
import ru.CryptoPro.JCSP.support.BKSTrustStore;
import ru.CryptoPro.reprov.RevocationSettings;
import ru.CryptoPro.ssl.util.TLSSettings;
import ru.cprocsp.ACSP.tools.common.CSPTool;
import ru.cprocsp.ACSP.tools.common.Infrastructure;
import ru.cprocsp.ACSP.tools.config.Config;
import ru.cprocsp.ACSP.tools.config.ConfigInterface;
import ru.cprocsp.ACSP.tools.integrity.ACSPIntegrity;
import ru.cprocsp.ACSP.tools.integrity.IntegrityInterface;
import ru.cprocsp.ACSP.tools.license.ACSPLicense;
import ru.cprocsp.ACSP.tools.license.LicenseInterface;

/* loaded from: classes4.dex */
public class CSPConfig extends JavaConfigLayer {
    public static synchronized int init(Context context, InitCallback initCallback) {
        int init;
        synchronized (CSPConfig.class) {
            init = CSPConfigBase.init(context, false, null, initCallback, new CSPConfig());
        }
        return init;
    }

    public static synchronized int initEx(Context context, ConfigOptions configOptions, InitCallback initCallback) {
        int init;
        synchronized (CSPConfig.class) {
            init = CSPConfigBase.init(context, true, configOptions, initCallback, new CSPConfig());
        }
        return init;
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public void editConfig(boolean z) {
        Application applicationContext = CSPInternalConfig.getApplicationContext();
        String configFile = new CSPTool(applicationContext).getAppInfrastructure().getConfigFile();
        initLogger().verbose("Reading configuration...");
        try {
            Config config = new Config(applicationContext, configFile, false);
            initLogger().verbose("Setting library path...");
            String staticCspNativeLibraryPath = CSPInternalConfig.getStaticCspNativeLibraryPath();
            if (!config.setLibraryPath(staticCspNativeLibraryPath)) {
                initLogger().warning("Couldn't set library path to " + staticCspNativeLibraryPath + ". Third-party support libraries for tokens and cards might not work.");
            }
            initLogger().verbose("Setting locale language...");
            if (config.setLocaleLanguage("")) {
                return;
            }
            initLogger().warning("Couldn't set language to " + staticCspNativeLibraryPath + Extension.DOT_CHAR);
        } catch (Exception e) {
            ny61.j(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public void initJavaPreferences() {
        initLogger().verbose("Initializing preference store for TLS...");
        TLSSettings.init(new AndroidPrefStore(CSPInternalConfig.getApplicationContext()));
        initLogger().verbose("Initializing preference store for Revocation Provider...");
        RevocationSettings.init(new AndroidPrefStore(CSPInternalConfig.getApplicationContext()));
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public void initJavaSettings(Infrastructure infrastructure) {
        initLogger().verbose("Setting directory prefix for JCP provider...");
        System.setProperty(JCP.ANDROID_APP_DIRECTORY_PREF_NAME, infrastructure.getApplicationPath());
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public boolean initJavaTrustStore(Infrastructure infrastructure, InitCallback initCallback) {
        StringBuilder sb = new StringBuilder();
        sb.append(infrastructure.getApplicationPath());
        this.bksTrustStorePath = oyr.t(sb, File.separator, BKSTrustStore.STORAGE_DIRECTORY);
        initLogger().verbose("Creating/updating the trust store " + this.bksTrustStorePath + "...");
        initCallback.onCreateTrustStores(new CreateTrustStoresEvent());
        return BKSTrustStore.createOrUpdateTrustStore(CSPInternalConfig.getApplicationContext(), this.bksTrustStorePath, "cacerts", BKSTrustStore.STORAGE_PASSWORD);
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public boolean isAndroidPlatform() {
        return Platform.isAndroid;
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public ConfigInterface prepareConfig(Infrastructure infrastructure) throws Exception {
        return new Config(CSPInternalConfig.getApplicationContext(), infrastructure.getConfigFile(), false);
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public IntegrityInterface prepareIntegrity(Infrastructure infrastructure) throws Exception {
        return new ACSPIntegrity(CSPInternalConfig.getApplicationContext());
    }

    @Override // ru.CryptoPro.JCSP.NCSPConfig, ru.CryptoPro.JCSP.CSPConfigBase
    public LicenseInterface prepareLicense(Infrastructure infrastructure) throws Exception {
        return new ACSPLicense(infrastructure.getLicenseFile());
    }

    public static synchronized int initEx(Context context, ConfigOptions configOptions) {
        int initEx;
        synchronized (CSPConfig.class) {
            initEx = initEx(context, configOptions, new InitCallbackImpl());
        }
        return initEx;
    }

    public static synchronized int init(Context context) {
        int init;
        synchronized (CSPConfig.class) {
            init = init(context, new InitCallbackImpl());
        }
        return init;
    }

    public static synchronized int initEx(Context context) {
        int initEx;
        synchronized (CSPConfig.class) {
            initEx = initEx(context, CSPConfigOptions.DEFAULT);
        }
        return initEx;
    }
}
