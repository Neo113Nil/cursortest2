package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.compose.material3.MenuKt;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
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
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1oSDK(i3, i, i2, i4, str);
        } catch (Exception e) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.DMA, "TCF data collection exception", e, false, false, false, false, MenuKt.InTransitionDuration, null);
            return null;
        }
    }
}
