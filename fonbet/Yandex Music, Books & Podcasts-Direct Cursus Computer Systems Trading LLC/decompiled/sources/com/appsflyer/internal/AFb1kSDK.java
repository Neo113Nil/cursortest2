package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class AFb1kSDK {
    private static String getRevenue;

    public static synchronized String getMonetizationNetwork(AFc1sSDK aFc1sSDK) {
        String str;
        synchronized (AFb1kSDK.class) {
            try {
                if (getRevenue == null) {
                    String AFAdRevenueData = aFc1sSDK.AFAdRevenueData("AF_INSTALLATION", (String) null);
                    if (AFAdRevenueData != null) {
                        getRevenue = AFAdRevenueData;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentTimeMillis);
                        sb.append("-");
                        sb.append(Math.abs(new SecureRandom().nextLong()));
                        String obj = sb.toString();
                        getRevenue = obj;
                        aFc1sSDK.getRevenue("AF_INSTALLATION", obj);
                    }
                    if (getRevenue != null) {
                        AppsFlyerProperties.getInstance().set("uid", getRevenue);
                    }
                }
                str = getRevenue;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
