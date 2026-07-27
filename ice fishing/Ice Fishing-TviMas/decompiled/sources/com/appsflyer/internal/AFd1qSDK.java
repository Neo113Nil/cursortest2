package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class AFd1qSDK {
    private static String getMediationNetwork = "331";
    public final AFd1tSDK AFAdRevenueData;
    private final Executor component2;
    private Bundle component4 = null;
    public String getCurrencyIso4217Code = "";
    public final AFd1nSDK getMonetizationNetwork;
    public final AFd1rSDK getRevenue;

    public AFd1qSDK(AFd1nSDK aFd1nSDK, AFd1rSDK aFd1rSDK, AFd1tSDK aFd1tSDK, Executor executor) {
        this.getMonetizationNetwork = aFd1nSDK;
        this.getRevenue = aFd1rSDK;
        this.AFAdRevenueData = aFd1tSDK;
        this.component2 = executor;
    }

    public static String getCurrencyIso4217Code() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getRevenue() {
        return "6.15.2";
    }

    public static String getMediationNetwork() {
        return UUID.randomUUID().toString();
    }

    public static String AFAdRevenueData() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final boolean component1() {
        return !this.AFAdRevenueData.getMonetizationNetwork();
    }

    public final String getRevenue(String str) {
        Object obj;
        try {
            if (this.component4 == null) {
                this.component4 = ((PackageItemInfo) this.getMonetizationNetwork.AFAdRevenueData.getPackageManager().getApplicationInfo(this.getMonetizationNetwork.AFAdRevenueData.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.component4;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Could not load manifest metadata!").append(th.getMessage()).toString(), th);
            return null;
        }
    }

    public final boolean AFAdRevenueData(String str, boolean z) {
        String revenue = getRevenue(str);
        return revenue != null ? Boolean.parseBoolean(revenue) : z;
    }

    public static String areAllFieldsValid() {
        return new StringBuilder("version: 6.15.2 (build ").append(getMediationNetwork).append(")").toString();
    }

    public final String component4() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getRevenue("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public static boolean getMonetizationNetwork(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFh1vSDK.PUBLIC_API, "Could not check if app is pre installed", e);
        }
        return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }

    public final String AFAdRevenueData(Context context) {
        try {
            return new AFb1mSDK(context, this.component2).getMediationNetwork();
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th, true, false, false);
            return null;
        }
    }

    public final String getMonetizationNetwork() {
        AFh1pSDK aFh1pSDK = this.AFAdRevenueData.component4;
        AFb1tSDK aFb1tSDK = aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.AFAdRevenueData, aFh1pSDK.areAllFieldsValid) : null;
        if (aFb1tSDK != null) {
            return aFb1tSDK.getRevenue;
        }
        return null;
    }

    public final String AFAdRevenueData(String str) {
        try {
            int identifier = this.getMonetizationNetwork.AFAdRevenueData.getResources().getIdentifier(str, "string", this.getMonetizationNetwork.AFAdRevenueData.getPackageName());
            if (identifier != 0) {
                return this.getMonetizationNetwork.AFAdRevenueData.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            AFLogger.afErrorLog(new StringBuilder("Could not load string resource!").append(e.getMessage()).toString(), e);
            return null;
        }
    }
}
