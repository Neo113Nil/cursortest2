package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1qSDK {
    public static JSONObject getCurrencyIso4217Code(String str) {
        JSONObject revenue = AFg1mSDK.getRevenue(str);
        if (revenue != null) {
            try {
                if (revenue.has("ol_id")) {
                    String optString = revenue.optString("ol_scheme", null);
                    String optString2 = revenue.optString("ol_domain", null);
                    String optString3 = revenue.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                        return revenue;
                    }
                }
            } catch (Throwable th) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.GENERAL;
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                aFLogger.e(aFh1zSDK, sb.toString(), th, false, false, true);
                AFa1zSDK.getMonetizationNetwork().AFAdRevenueData().copy().getMonetizationNetwork();
                AFa1zSDK.getMonetizationNetwork().AFAdRevenueData().copy().AFAdRevenueData();
            }
        }
        return revenue;
    }
}
