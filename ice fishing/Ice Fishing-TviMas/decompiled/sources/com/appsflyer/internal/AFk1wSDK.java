package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class AFk1wSDK {
    public String getMediationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFk1wSDK(Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
