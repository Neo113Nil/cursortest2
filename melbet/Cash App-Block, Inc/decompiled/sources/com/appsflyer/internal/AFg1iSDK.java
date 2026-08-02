package com.appsflyer.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class AFg1iSDK {
    public static boolean getMonetizationNetwork(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
