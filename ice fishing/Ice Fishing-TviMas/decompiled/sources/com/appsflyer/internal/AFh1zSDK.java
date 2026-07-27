package com.appsflyer.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public final class AFh1zSDK {
    public static boolean getRevenue(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
