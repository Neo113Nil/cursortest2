package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.Random;

/* loaded from: classes4.dex */
public final class zzbyl {
    public final Random zza = new Random();
    public final long zzc = 120000000000L;
    public long zzd = 1000000000;

    public final long zza() {
        long j = this.zzd;
        double d = j;
        this.zzd = Math.min((long) (1.6d * d), this.zzc);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        Trace.checkArgument(d2 >= d3);
        return j + ((long) ((this.zza.nextDouble() * (d2 - d3)) + d3));
    }
}
