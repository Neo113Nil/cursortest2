package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class WD extends C3383ig implements SD {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f29123v;

    public WD(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f29123v = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        RunnableFutureC2989bE runnableFutureC2989bE = new RunnableFutureC2989bE(Executors.callable(runnable, null));
        return new UD(runnableFutureC2989bE, this.f29123v.schedule(runnableFutureC2989bE, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j9, TimeUnit timeUnit) {
        VD vd = new VD(runnable);
        return new UD(vd, this.f29123v.scheduleAtFixedRate(vd, j6, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j9, TimeUnit timeUnit) {
        VD vd = new VD(runnable);
        return new UD(vd, this.f29123v.scheduleWithFixedDelay(vd, j6, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        RunnableFutureC2989bE runnableFutureC2989bE = new RunnableFutureC2989bE(callable);
        return new UD(runnableFutureC2989bE, this.f29123v.schedule(runnableFutureC2989bE, j6, timeUnit));
    }
}
