package com.google.android.gms.internal.wearable;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbk extends zzbh implements ScheduledExecutorService, zzbg {
    final ScheduledExecutorService zza;

    zzbk(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzbo zzn = zzbo.zzn(runnable, null);
        return new zzbi(zzn, scheduledExecutorService.schedule(zzn, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzbj zzbjVar = new zzbj(runnable);
        return new zzbi(zzbjVar, this.zza.scheduleAtFixedRate(zzbjVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzbj zzbjVar = new zzbj(runnable);
        return new zzbi(zzbjVar, this.zza.scheduleWithFixedDelay(zzbjVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzbo zzboVar = new zzbo(callable);
        return new zzbi(zzboVar, this.zza.schedule(zzboVar, j, timeUnit));
    }
}
