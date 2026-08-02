package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes4.dex */
public abstract class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    public static final /* synthetic */ int $r8$clinit = 0;

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int isGooglePlayServicesAvailable(Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, 13400000);
    }
}
