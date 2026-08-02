package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AFk1wSDK {
    public String AFAdRevenueData;
    public final WeakReference<Context> getMonetizationNetwork;

    public AFk1wSDK(@NonNull Context context) {
        this.getMonetizationNetwork = new WeakReference<>(context);
    }
}
