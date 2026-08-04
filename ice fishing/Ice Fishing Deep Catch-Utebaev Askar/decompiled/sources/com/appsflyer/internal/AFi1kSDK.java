package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1kSDK implements AFi1mSDK {
    private String getMediationNetwork;

    private static String getRevenue(Activity activity) {
        Uri uriS_ = AFc1bSDK.s_(activity != null ? activity.getIntent() : null);
        String string = uriS_ != null ? uriS_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (getRevenue(string)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final void AFAdRevenueData(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0) {
            this.getMediationNetwork = getRevenue(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final String getCurrencyIso4217Code(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final String getMediationNetwork(Activity activity) {
        String str = this.getMediationNetwork;
        this.getMediationNetwork = null;
        return !(str == null || str.length() == 0) ? str : getRevenue(activity);
    }

    private static boolean getRevenue(String str) {
        return kotlin.text.o.d(str, "android-app://");
    }
}
