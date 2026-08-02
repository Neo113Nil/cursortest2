package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public abstract class zzar {
    public static final zzap zza;

    static {
        zzap zzapVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzapVar = new zzap(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzapVar = new zzap(1);
        }
        zza = zzapVar;
    }
}
