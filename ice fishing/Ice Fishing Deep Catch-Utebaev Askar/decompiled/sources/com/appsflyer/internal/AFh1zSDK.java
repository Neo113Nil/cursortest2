package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1zSDK {
    public static boolean getRevenue(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
