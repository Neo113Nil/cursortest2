package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFg1rSDK {
    private final PackageManager AFAdRevenueData;
    private final Map<String, Object> getMonetizationNetwork;
    private final String getRevenue;

    public AFg1rSDK(AFd1nSDK aFd1nSDK, AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.getMonetizationNetwork = new LinkedHashMap();
        Context context = aFd1nSDK.AFAdRevenueData;
        this.AFAdRevenueData = context != null ? context.getPackageManager() : null;
        String packageName = aFd1qSDK.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.getRevenue = packageName;
    }

    public final Map<String, Object> getRevenue() {
        InstallSourceInfo installSourceInfo;
        String installerPackageName;
        if (this.getMonetizationNetwork.isEmpty()) {
            try {
                PackageManager packageManager = this.AFAdRevenueData;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.getRevenue)) != null) {
                    this.getMonetizationNetwork.put("installer_package", installerPackageName);
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.getMonetizationNetwork;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.getRevenue;
                PackageManager packageManager2 = this.AFAdRevenueData;
                if (packageManager2 != null && (installSourceInfo = packageManager2.getInstallSourceInfo(str)) != null) {
                    Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                    linkedHashMap = new LinkedHashMap();
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.getMonetizationNetwork;
    }
}
