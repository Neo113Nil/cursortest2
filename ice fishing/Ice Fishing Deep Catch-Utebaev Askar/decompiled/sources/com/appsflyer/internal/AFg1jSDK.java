package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass2;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1jSDK {
    public static String getMediationNetwork;
    public final AFd1rSDK AFAdRevenueData;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFb1rSDK.getRevenue);
        getMediationNetwork = sb.toString();
    }

    public AFg1jSDK(Context context) {
        this.AFAdRevenueData = AFb1rSDK.getRevenue().getMonetizationNetwork(context);
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            return AFb1qSDK.c_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    public static boolean getRevenue(AFd1rSDK aFd1rSDK) {
        return aFd1rSDK.getMediationNetwork("sentRegisterRequestToAF");
    }

    public final AFg1mSDK getMediationNetwork() {
        String string;
        String string2;
        String monetizationNetwork = this.AFAdRevenueData.getMonetizationNetwork("afUninstallToken", (String) null);
        long mediationNetwork = this.AFAdRevenueData.getMediationNetwork("afUninstallToken_received_time", 0L);
        boolean mediationNetwork2 = this.AFAdRevenueData.getMediationNetwork("afUninstallToken_queued");
        this.AFAdRevenueData.getRevenue("afUninstallToken_queued", false);
        if (monetizationNetwork == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            monetizationNetwork = strArrSplit[strArrSplit.length - 1];
        }
        if (mediationNetwork == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    mediationNetwork = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (monetizationNetwork != null) {
            return new AFg1mSDK(monetizationNetwork, mediationNetwork, mediationNetwork2);
        }
        return null;
    }

    public static void getMediationNetwork(String str) {
        AFd1kSDK monetizationNetwork = AFb1rSDK.getRevenue().getMonetizationNetwork();
        AFf1cSDK aFf1cSDK = new AFf1cSDK(str, monetizationNetwork);
        AFe1aSDK aFe1aSDKCopy = monetizationNetwork.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new AnonymousClass2(aFf1cSDK));
    }
}
