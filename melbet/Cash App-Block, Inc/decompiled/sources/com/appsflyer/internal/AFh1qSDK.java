package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class AFh1qSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final Intent getMonetizationNetwork;

    public AFh1qSDK(Activity activity, AFi1oSDK aFi1oSDK) {
        activity.getClass();
        aFi1oSDK.getClass();
        this.getMonetizationNetwork = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1oSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1oSDK.getRevenue(activity);
    }
}
