package ru.CryptoPro.JCSP;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv10;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import ru.cprocsp.ACSP.tools.common.CSPConstants;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class CSPInternalConfig implements LogConstants, CSPConstants {
    private static final String DEV_LINK = "https://docs.cryptopro.ru/android/samples/ACSPClientApp/build_sample_app?id=%d0%a1%d0%b1%d0%be%d1%80%d0%ba%d0%b0-%d1%81%d0%be%d0%b1%d1%81%d1%82%d0%b2%d0%b5%d0%bd%d0%bd%d0%be%d0%b3%d0%be-%d0%bf%d1%80%d0%b8%d0%bb%d0%be%d0%b6%d0%b5%d0%bd%d0%b8%d1%8f-%d1%81-%d0%bf%d1%80%d0%be%d0%b2%d0%b0%d0%b9%d0%b4%d0%b5%d1%80%d0%be%d0%bc-%c2%ab%d0%9a%d1%80%d0%b8%d0%bf%d1%82%d0%be%d0%9f%d1%80%d0%be-csp%c2%bb";
    public static CSPInternalConfig INSTANCE;
    private static final AtomicReference<Application> applicationContext = new AtomicReference<>(null);
    private boolean allowFindRemoteLibrary;
    private String cspLibPath;
    private PackageInfo embeddedCSPPackage;
    private boolean isDebuggable;
    private PackageInfo remoteCSPPackage;
    private boolean needLogBioStatistics = false;
    private String bioStatisticsDirectory = null;

    private CSPInternalConfig(Application application, boolean z) {
        this.cspLibPath = null;
        this.embeddedCSPPackage = null;
        this.remoteCSPPackage = null;
        this.isDebuggable = false;
        this.allowFindRemoteLibrary = false;
        AtomicReference<Application> atomicReference = applicationContext;
        while (!atomicReference.compareAndSet(null, application)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.allowFindRemoteLibrary = z;
        this.embeddedCSPPackage = resolveEmbeddedCSPInstalled(application);
        if (z) {
            this.remoteCSPPackage = resolveRemoteCSPInstalled(application);
        }
        this.cspLibPath = resolveCspNativeLibraryPath();
        this.isDebuggable = (application.getApplicationInfo().flags & 2) != 0;
    }

    public static Application getApplicationContext() {
        if (isInitiated()) {
            return applicationContext.get();
        }
        ny61.r("CryptoPro CSP has not been initialized. init() must be called first.");
        return null;
    }

    public static String getBioStatisticsDirectory() {
        if (isInitiated()) {
            return INSTANCE.bioStatisticsDirectory;
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "CryptoPro CSP has not been initialized.");
        return null;
    }

    private String getCspNativeLibraryPath() {
        if (isInitiated()) {
            return this.cspLibPath;
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "CryptoPro CSP has not been initialized.");
        return null;
    }

    public static String getStaticCspNativeLibraryPath() {
        if (isInitiated()) {
            return INSTANCE.getCspNativeLibraryPath();
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "CryptoPro CSP has not been initialized.");
        return null;
    }

    public static synchronized void init(Application application, boolean z) {
        synchronized (CSPInternalConfig.class) {
            if (INSTANCE == null) {
                INSTANCE = new CSPInternalConfig(application, z);
            }
        }
    }

    public static boolean isCspUnpacked() {
        if (isInitiated()) {
            return nativeLibraryExistsOnDisk(INSTANCE.cspLibPath);
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "CryptoPro CSP has not been initialized.");
        return false;
    }

    public static boolean isDebuggable() {
        if (isInitiated()) {
            return INSTANCE.isDebuggable;
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "CryptoPro CSP has not been initialized.");
        return false;
    }

    public static boolean isEmbedded() {
        if (isInitiated()) {
            return INSTANCE.embeddedCSPPackage != null;
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "CryptoPro CSP has not been initialized.");
        return false;
    }

    public static synchronized boolean isInitiated() {
        boolean z;
        synchronized (CSPInternalConfig.class) {
            z = INSTANCE != null;
        }
        return z;
    }

    private static boolean nativeLibraryExistsOnDisk(String str) {
        return new File(oyr.t(qv10.t(str), File.separator, CSPConstants.CSP_JNI_FILE)).exists();
    }

    public static boolean needLogBioStatistics() {
        if (isInitiated()) {
            return INSTANCE.needLogBioStatistics;
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "CryptoPro CSP has not been initialized.");
        return false;
    }

    private String resolveCspNativeLibraryPath() {
        String str;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        PackageInfo packageInfo2 = this.embeddedCSPPackage;
        if (packageInfo2 == null || (applicationInfo2 = packageInfo2.applicationInfo) == null) {
            str = null;
        } else {
            str = applicationInfo2.nativeLibraryDir;
            if (nativeLibraryExistsOnDisk(str)) {
                return str;
            }
        }
        if (this.allowFindRemoteLibrary && (packageInfo = this.remoteCSPPackage) != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            String str2 = applicationInfo.nativeLibraryDir;
            if (nativeLibraryExistsOnDisk(str2)) {
                this.embeddedCSPPackage = null;
                return str2;
            }
        }
        if (str != null) {
            return str;
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "Error occurred, no CSP found. Library path is null.");
        return null;
    }

    private PackageInfo resolveEmbeddedCSPInstalled(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return null;
        }
    }

    private PackageInfo resolveRemoteCSPInstalled(Application application) {
        try {
            return application.getPackageManager().getPackageInfo("ru.cprocsp.ACSP", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static void setBioStatisticsDirectory(String str) {
        if (isInitiated()) {
            INSTANCE.bioStatisticsDirectory = str;
        }
    }

    public static void setNeedLogBioStatistics(boolean z) {
        if (isInitiated()) {
            INSTANCE.needLogBioStatistics = z;
        }
    }

    public static synchronized void init(Application application) {
        synchronized (CSPInternalConfig.class) {
            init(application, false);
        }
    }
}
