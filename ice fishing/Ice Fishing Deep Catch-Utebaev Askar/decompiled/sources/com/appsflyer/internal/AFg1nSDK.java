package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1nSDK implements AFg1qSDK {
    private final Context getMediationNetwork;
    private final AppsFlyerProperties getRevenue;

    public AFg1nSDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getMediationNetwork = context;
        this.getRevenue = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final AFg1oSDK getCurrencyIso4217Code() {
        String string;
        if (!Boolean.parseBoolean(this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getMediationNetwork);
            int i2 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i5 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i2 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1oSDK(i4, i2, i3, i5, str);
        } catch (Exception e2) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.DMA, "TCF data collection exception", e2, false, false, false, false, 120, null);
            return null;
        }
    }
}
