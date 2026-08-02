package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class AFi1lSDK implements AFi1oSDK {
    private String getRevenue;

    private static String AFAdRevenueData(Activity activity) {
        Uri k_ = AFb1qSDK.k_(activity != null ? activity.getIntent() : null);
        String obj = k_ != null ? k_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (AFAdRevenueData(obj)) {
            return null;
        }
        return obj;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final String getMediationNetwork(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final void getMonetizationNetwork(Activity activity) {
        activity.getClass();
        String str = this.getRevenue;
        if (str == null || str.length() == 0) {
            this.getRevenue = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final String getRevenue(Activity activity) {
        String str = this.getRevenue;
        this.getRevenue = null;
        return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
    }

    private static boolean AFAdRevenueData(String str) {
        return StringsKt__StringsJVMKt.startsWith(str, "android-app://", false);
    }
}
