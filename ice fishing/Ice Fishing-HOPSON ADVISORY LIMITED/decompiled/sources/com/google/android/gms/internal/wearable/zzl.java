package com.google.android.gms.internal.wearable;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzl {
    public static final int zza;
    private static volatile boolean zzb = false;

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, 0, intent, i2);
    }
}
