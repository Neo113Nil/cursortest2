package com.google.android.gms.internal.location;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
public final class zzda extends GoogleApi {
    public static int zba = 1;

    public synchronized int zba() {
        int i;
        try {
            i = zba;
            if (i == 1) {
                Context context = this.zab;
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context, 12451000);
                if (isGooglePlayServicesAvailable == 0) {
                    i = 4;
                    zba = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null) != null || DynamiteModule.getLocalVersion(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    zba = 2;
                } else {
                    i = 3;
                    zba = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
