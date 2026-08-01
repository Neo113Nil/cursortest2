package com.adjust.sdk;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class StoreInfoUtil {
    public static String getInitiatingPackageName(Context context) {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT < 30) {
                return null;
            }
            installSourceInfo = packageManager.getInstallSourceInfo(packageName);
            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
            return initiatingPackageName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean getIsSystemApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return Boolean.TRUE;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static Boolean getIsUpdatedSystemApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 128) != 0) {
                return Boolean.TRUE;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String getOriginatingPackageName(Context context) {
        InstallSourceInfo installSourceInfo;
        String originatingPackageName;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT < 30) {
                return null;
            }
            installSourceInfo = packageManager.getInstallSourceInfo(packageName);
            originatingPackageName = installSourceInfo.getOriginatingPackageName();
            return originatingPackageName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getStoreIdFromSystem(Context context) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT < 30) {
                return packageManager.getInstallerPackageName(packageName);
            }
            installSourceInfo = packageManager.getInstallSourceInfo(packageName);
            installingPackageName = installSourceInfo.getInstallingPackageName();
            return installingPackageName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static AdjustStoreInfo getStoreInfoFromClient(AdjustConfig adjustConfig, Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return adjustConfig.storeInfo;
            }
            String string = bundle.getString("ADJUST_STORE_NAME");
            if (string != null && !string.isEmpty()) {
                String string2 = bundle.getString("ADJUST_STORE_APP_ID");
                AdjustStoreInfo adjustStoreInfo = new AdjustStoreInfo(string);
                adjustStoreInfo.setStoreAppId(string2);
                return adjustStoreInfo;
            }
            return adjustConfig.storeInfo;
        } catch (Exception unused) {
            return adjustConfig.storeInfo;
        }
    }
}
