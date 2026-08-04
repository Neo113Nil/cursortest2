package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1mSDK {
    public final Intent getCurrencyIso4217Code;
    public final String getMonetizationNetwork;
    public final String getRevenue;

    public AFh1mSDK(Activity activity, AFi1mSDK aFi1mSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        this.getCurrencyIso4217Code = activity.getIntent();
        this.getRevenue = aFi1mSDK.getCurrencyIso4217Code(activity);
        this.getMonetizationNetwork = aFi1mSDK.getMediationNetwork(activity);
    }
}
