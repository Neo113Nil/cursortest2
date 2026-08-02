package ru.CryptoPro.JCSP;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.Locale;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.CAPIIntegrity;
import ru.CryptoPro.JCSP.MSCAPI.CAPISupport;
import ru.CryptoPro.JCSP.state.ChangeWorkingDirectoryEvent;
import ru.CryptoPro.JCSP.state.CheckIntegrityEvent;
import ru.CryptoPro.JCSP.state.CheckLicenseEvent;
import ru.CryptoPro.JCSP.state.CreateInfrastructureEvent;
import ru.CryptoPro.JCSP.state.CreateResourcesEvent;
import ru.CryptoPro.JCSP.state.CreateSystemStoresEvent;
import ru.CryptoPro.JCSP.state.EditConfigEvent;
import ru.CryptoPro.JCSP.state.ErrorEvent;
import ru.CryptoPro.JCSP.state.LoadingNativeLibraryEvent;
import ru.CryptoPro.JCSP.state.ResolveNativeLibraryEvent;
import ru.CryptoPro.JCSP.state.ResultEvent;
import ru.CryptoPro.JCSP.state.StartEvent;
import ru.CryptoPro.JCSP.support.ChangeWorkDirectory;
import ru.cprocsp.ACSP.tools.common.CSPTool;
import ru.cprocsp.ACSP.tools.common.Constants;
import ru.cprocsp.ACSP.tools.common.Infrastructure;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.cprocsp.ACSP.tools.config.ConfigInterface;
import ru.cprocsp.ACSP.tools.config.ConfigUpdater;
import ru.cprocsp.ACSP.tools.integrity.ACSPIntegrity;
import ru.cprocsp.ACSP.tools.integrity.IntegrityInterface;
import ru.cprocsp.ACSP.tools.license.CSPLicense;
import ru.cprocsp.ACSP.tools.license.LicenseInterface;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class NCSPConfig extends CSPConfigBase implements Constants {

    /* renamed from: ru.CryptoPro.JCSP.NCSPConfig$1InitLoggerHolder, reason: invalid class name */
    public final class C1InitLoggerHolder {
        static final InitLogger initLogger = new InitLogger() { // from class: ru.CryptoPro.JCSP.NCSPConfig.1InitLoggerHolder.1
            @Override // ru.CryptoPro.JCSP.InitLogger
            public void error(String str) {
                Log.e(LogConstants.APP_LOGGER_TAG, str);
            }

            @Override // ru.CryptoPro.JCSP.InitLogger
            public void info(String str) {
                Log.i(LogConstants.APP_LOGGER_TAG, str);
            }

            @Override // ru.CryptoPro.JCSP.InitLogger
            public void verbose(String str) {
            }

            @Override // ru.CryptoPro.JCSP.InitLogger
            public void warning(String str) {
            }

            @Override // ru.CryptoPro.JCSP.InitLogger
            public void error(String str, Throwable th) {
                Log.e(LogConstants.APP_LOGGER_TAG, str, th);
            }
        };

        public C1InitLoggerHolder() {
        }
    }

    public static synchronized int init(Context context, InitCallback initCallback) {
        int init;
        synchronized (NCSPConfig.class) {
            init = CSPConfigBase.init(context, false, null, initCallback, new NCSPConfig());
        }
        return init;
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public void editConfig(boolean z) {
        String staticCspNativeLibraryPath = CSPInternalConfig.getStaticCspNativeLibraryPath();
        initLogger().verbose("Saving library path " + staticCspNativeLibraryPath + "...");
        if (CAPISupport.supportRegistryPutString(ConfigConstants.CONFIG_LibraryPath_path, staticCspNativeLibraryPath) != 0) {
            initLogger().error("Couldn't save library path " + staticCspNativeLibraryPath + ". Third-party support libraries for tokens and cards might not work.");
        }
        String language = Locale.getDefault().getLanguage();
        String str = ClearCryptoProPrefs.COUNTRY;
        if (!language.equalsIgnoreCase(ClearCryptoProPrefs.COUNTRY)) {
            str = "en";
        }
        initLogger().verbose("Saving locale language " + str + "...");
        if (CAPISupport.supportRegistryPutString(ConfigConstants.CONFIG_AndroidLocale_Language, str) != 0) {
            initLogger().error("Couldn't save language " + str + Extension.DOT_CHAR);
        }
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public void initJavaPreferences() {
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public void initJavaSettings(Infrastructure infrastructure) {
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public boolean initJavaTrustStore(Infrastructure infrastructure, InitCallback initCallback) {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public InitLogger initLogger() {
        return C1InitLoggerHolder.initLogger;
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public void internalInit(Context context, InitCallback initCallback) {
        int i;
        initLogger().info("Initializing...");
        initCallback.onStart(new StartEvent());
        Throwable th = null;
        if (!isAndroidPlatform()) {
            initLogger().error("Initializing is supported in OS Android only!");
            this.initializeError = 9;
        } else if (context == null) {
            initLogger().error("The context is null.");
            this.initializeError = 1;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                initLogger().error("The application context is null.");
                this.initializeError = 10;
            } else {
                LoadingNativeLibraryEvent loadingNativeLibraryEvent = new LoadingNativeLibraryEvent();
                initCallback.onLoadingNativeLibrary(loadingNativeLibraryEvent);
                CSPInternalConfig.init((Application) applicationContext, loadingNativeLibraryEvent.isAllowFindRemoteLibrary());
                boolean isEmbedded = CSPInternalConfig.isEmbedded();
                boolean isCspUnpacked = CSPInternalConfig.isCspUnpacked();
                InitLogger initLogger = initLogger();
                StringBuilder sb = new StringBuilder("CSP is ");
                sb.append(isEmbedded ? "embedded" : "remote");
                sb.append(" and ");
                sb.append(isCspUnpacked ? "unpacked (legacy packaging)." : "not unpacked.");
                initLogger.verbose(sb.toString());
                String staticCspNativeLibraryPath = CSPInternalConfig.getStaticCspNativeLibraryPath();
                initCallback.onResolveNativeLibrary(new ResolveNativeLibraryEvent(staticCspNativeLibraryPath));
                if (staticCspNativeLibraryPath == null || !isCspUnpacked) {
                    initLogger().warning("CSP native library path is null. Following properties might be set: android:extractNativeLibs=\"false\" in Manifest.xml, and/or jniLibs { useLegacyPackaging false } in build.gradle.");
                }
                initLogger().verbose("Reading system parameters...");
                CSPTool cSPTool = new CSPTool(applicationContext);
                Infrastructure appInfrastructure = cSPTool.getAppInfrastructure();
                String applicationPath = appInfrastructure.getApplicationPath();
                initJavaSettings(appInfrastructure);
                initLogger().verbose("Setting directory for bio statistics...");
                CSPInternalConfig.setBioStatisticsDirectory(applicationPath);
                try {
                    initLogger().verbose("Creating CSP infrastructure...");
                    initCallback.onCreateInfrastructure(new CreateInfrastructureEvent(applicationPath));
                    cSPTool.createInfrastructure();
                    ConfigUpdater configUpdater = new ConfigUpdater(applicationContext);
                    boolean needUpdate = configUpdater.needUpdate();
                    InitLogger initLogger2 = initLogger();
                    StringBuilder sb2 = new StringBuilder("Configuration update is ");
                    sb2.append(needUpdate ? "needed" : "not needed");
                    sb2.append(Extension.DOT_CHAR);
                    initLogger2.verbose(sb2.toString());
                    try {
                        initLogger().verbose("Copying license.ini, config.ini...");
                        initCallback.onCreateResources(new CreateResourcesEvent(needUpdate));
                        cSPTool.copyEtcResources(needUpdate);
                        if (needUpdate) {
                            InitLogger initLogger3 = initLogger();
                            StringBuilder sb3 = new StringBuilder("Configuration has ");
                            sb3.append(configUpdater.markUpdated() ? "" : "NOT ");
                            sb3.append("been marked as updated.");
                            initLogger3.verbose(sb3.toString());
                        }
                        try {
                            initLogger().verbose("Copying root.sto...");
                            initCallback.onCreateSystemStores(new CreateSystemStoresEvent());
                            cSPTool.copySystemStores();
                            try {
                                initLogger().verbose("Changing the working directory to " + applicationPath);
                                initCallback.onChangeWorkingDirectory(new ChangeWorkingDirectoryEvent(applicationPath));
                                initLogger().verbose("ChangeWorkDirectory.load...");
                                ChangeWorkDirectory.load(staticCspNativeLibraryPath, isCspUnpacked);
                                i = ChangeWorkDirectory.changeWD(applicationPath);
                            } catch (Throwable th2) {
                                th = th2;
                                i = 4;
                            }
                            if (i != 0) {
                                if (th != null) {
                                    initLogger().error("Changing working directory to " + applicationPath + " failed.", th);
                                } else {
                                    initLogger().error("Changing working directory to " + applicationPath + " failed.");
                                }
                                this.initializeError = 4;
                            } else {
                                try {
                                    initLogger().verbose("Preparing config.ini...");
                                    CAPISupport.load(staticCspNativeLibraryPath, isCspUnpacked);
                                    ConfigInterface prepareConfig = prepareConfig(appInfrastructure);
                                    initLogger().verbose("Editing config.ini...");
                                    editConfig(needUpdate);
                                    initCallback.onEditConfig(new EditConfigEvent(needUpdate));
                                    if (initJavaTrustStore(appInfrastructure, initCallback)) {
                                        try {
                                            initLogger().verbose("Preparing license.ini...");
                                            CSPLicense.load(staticCspNativeLibraryPath, isCspUnpacked);
                                            try {
                                                initLogger().verbose("Reading license.ini...");
                                                LicenseInterface prepareLicense = prepareLicense(appInfrastructure);
                                                if (initCallback.onCheckLicense(new CheckLicenseEvent())) {
                                                    if (prepareLicense == null) {
                                                        initLogger().warning("License object has not implementation.");
                                                    } else if (prepareLicense.checkAndSave() != 0) {
                                                        initLogger().error("The license is invalid.");
                                                    }
                                                }
                                                try {
                                                    initLogger().verbose("Preparing integrity data...");
                                                    CAPIIntegrity.load(staticCspNativeLibraryPath, isCspUnpacked);
                                                    initLogger().verbose("Reading integrity data...");
                                                    IntegrityInterface prepareIntegrity = prepareIntegrity(appInfrastructure);
                                                    initCallback.onCheckIntegrity(new CheckIntegrityEvent());
                                                    if (prepareIntegrity.check(true) != 0) {
                                                        initLogger().error("The integrity control is broken.");
                                                        this.initializeError = 12;
                                                    } else {
                                                        initJavaPreferences();
                                                        initLogger().verbose("Saving provider data...");
                                                        this.providerInfo = new CSPProviderInfo(prepareLicense, prepareIntegrity, prepareConfig);
                                                        initLogger().info("Initializing completed successfully.");
                                                        this.initializeError = 0;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    initLogger().error("Integrity error.", th);
                                                    this.initializeError = 8;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                initLogger().error("License read error.", th);
                                                this.initializeError = 5;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            initLogger().error("License init error.", th);
                                            this.initializeError = 13;
                                        }
                                    } else {
                                        initLogger().error("Couldn't create java trust store.");
                                        this.initializeError = 6;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    initLogger().error("Config error.", th);
                                    this.initializeError = 7;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            initLogger().error("System resource error.", th);
                            this.initializeError = 3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        initLogger().error("Resource error.", th);
                        this.initializeError = 3;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    initLogger().error("Infrastructure error.", th);
                    this.initializeError = 2;
                }
            }
        }
        int i2 = this.initializeError;
        if (i2 == 0) {
            initCallback.onSuccess(new ResultEvent());
        } else {
            initCallback.onError(new ErrorEvent(i2, th));
        }
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public boolean isAndroidPlatform() {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public ConfigInterface prepareConfig(Infrastructure infrastructure) throws Exception {
        return null;
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public IntegrityInterface prepareIntegrity(Infrastructure infrastructure) throws Exception {
        return new ACSPIntegrity(CSPInternalConfig.getApplicationContext());
    }

    @Override // ru.CryptoPro.JCSP.CSPConfigBase
    public LicenseInterface prepareLicense(Infrastructure infrastructure) throws Exception {
        return null;
    }

    public static synchronized int init(Context context) {
        int init;
        synchronized (NCSPConfig.class) {
            init = init(context, new InitCallbackImpl());
        }
        return init;
    }
}
