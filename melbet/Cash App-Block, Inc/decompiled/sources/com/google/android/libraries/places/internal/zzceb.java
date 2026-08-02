package com.google.android.libraries.places.internal;

import com.google.common.base.Stopwatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public final class zzceb {
    public final ScheduledExecutorService zza;
    public final Executor zzb;
    public final zzmu zzc;
    public final Stopwatch zzd;
    public long zze;
    public boolean zzf;
    public ScheduledFuture zzg;

    public zzceb(zzmu zzmuVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch) {
        this.zzc = zzmuVar;
        this.zzb = executor;
        this.zza = scheduledExecutorService;
        this.zzd = stopwatch;
        stopwatch.start();
    }
}
