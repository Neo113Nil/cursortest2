package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import com.google.common.base.Ticker;

/* loaded from: classes4.dex */
public abstract class zzxh {
    public static final Ticker zza;

    static {
        zzxf zzxfVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzxfVar = new zzxf(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzxfVar = new zzxf(1);
        }
        zza = zzxfVar;
    }
}
