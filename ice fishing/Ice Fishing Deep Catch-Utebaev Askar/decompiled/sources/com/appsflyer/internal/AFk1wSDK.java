package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1wSDK {
    public String getMediationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFk1wSDK(Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
