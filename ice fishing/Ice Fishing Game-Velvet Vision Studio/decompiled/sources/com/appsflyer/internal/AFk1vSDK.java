package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFk1vSDK {
    public String getCurrencyIso4217Code;
    public final WeakReference<Context> getMonetizationNetwork;

    public AFk1vSDK(Context context) {
        this.getMonetizationNetwork = new WeakReference<>(context);
    }
}
