package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzkx extends zzku implements ScheduledExecutorService {
    public final ScheduledExecutorService zza;

    public zzkx(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzku, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                z = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z2) {
                    shutdownNow();
                }
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzlc zzlcVar = new zzlc(Executors.callable(runnable, null));
        return new zzkv(zzlcVar, this.zza.schedule(zzlcVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzkw zzkwVar = new zzkw(runnable);
        return new zzkv(zzkwVar, this.zza.scheduleAtFixedRate(zzkwVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzkw zzkwVar = new zzkw(runnable);
        return new zzkv(zzkwVar, this.zza.scheduleWithFixedDelay(zzkwVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzlc zzlcVar = new zzlc(callable);
        return new zzkv(zzlcVar, this.zza.schedule(zzlcVar, j, timeUnit));
    }
}
