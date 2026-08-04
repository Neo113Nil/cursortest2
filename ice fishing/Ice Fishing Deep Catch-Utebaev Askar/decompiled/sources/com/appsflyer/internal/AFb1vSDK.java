package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1vSDK {
    public static Boolean getCurrencyIso4217Code;
    static String getRevenue;

    public static AFb1tSDK b_(ContentResolver contentResolver) {
        String string;
        if (!getMonetizationNetwork() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i2 == 0) {
            return new AFb1tSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i2 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            string = "";
        }
        return new AFb1tSDK(string, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    public static AFb1tSDK getCurrencyIso4217Code(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = getRevenue;
        boolean z = str != null;
        if (z) {
            lat = null;
        } else {
            Boolean bool = getCurrencyIso4217Code;
            if ((bool == null || !bool.booleanValue()) && !(getCurrencyIso4217Code == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id;
                        } catch (Throwable unused) {
                            str = id;
                            AFLogger.afDebugLog("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        AFb1tSDK aFb1tSDK = new AFb1tSDK(str, lat);
        aFb1tSDK.getMediationNetwork = Boolean.valueOf(z);
        return aFb1tSDK;
    }

    private static boolean getMonetizationNetwork() {
        Boolean bool = getCurrencyIso4217Code;
        return bool == null || bool.booleanValue();
    }
}
