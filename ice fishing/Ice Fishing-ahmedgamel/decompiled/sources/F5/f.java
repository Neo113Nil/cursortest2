package F5;

import java.util.List;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public interface f {
    String getApiBaseUrl();

    String getAppId();

    String getAppIdForHeaders();

    String getAppPackageId();

    String getAppState();

    String getAppVersion();

    String getCrashStoragePath();

    String getCurrentThreadName();

    String getDeviceManufacturer();

    String getDeviceModel();

    List getEnabledFeatureFlags();

    Object getInstallId(InterfaceC5240d interfaceC5240d);

    long getMinFileAgeForReadMillis();

    String getOnesignalId();

    String getOsBuildId();

    String getOsName();

    String getOsVersion();

    long getProcessUptime();

    String getPushSubscriptionId();

    String getRemoteLogLevel();

    String getSdkBase();

    String getSdkBaseVersion();

    String getSdkWrapper();

    String getSdkWrapperVersion();

    boolean isOtelExporterLoggingEnabled();
}
