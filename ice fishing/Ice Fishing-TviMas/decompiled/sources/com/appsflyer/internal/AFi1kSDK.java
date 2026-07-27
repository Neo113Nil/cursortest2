package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class AFi1kSDK implements AFi1mSDK {
    private String getMediationNetwork;

    @Override // com.appsflyer.internal.AFi1mSDK
    public final void AFAdRevenueData(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0) {
            this.getMediationNetwork = getRevenue(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final String getMediationNetwork(Activity activity) {
        String str = this.getMediationNetwork;
        this.getMediationNetwork = null;
        String str2 = str;
        return (str2 == null || str2.length() == 0) ? getRevenue(activity) : str;
    }

    private static String getRevenue(Activity activity) {
        Uri s_ = AFc1bSDK.s_(activity != null ? activity.getIntent() : null);
        String obj = s_ != null ? s_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (getRevenue(obj)) {
            return null;
        }
        return obj;
    }

    private static boolean getRevenue(String str) {
        return StringsKt.startsWith$default(str, "android-app://", false, 2, (Object) null);
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final String getCurrencyIso4217Code(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }
}
