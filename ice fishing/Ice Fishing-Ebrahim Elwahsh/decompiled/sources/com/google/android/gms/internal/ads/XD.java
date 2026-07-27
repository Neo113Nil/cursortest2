package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class XD extends C3157eg implements TD {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f28620v;

    public XD(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f28620v = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j9, TimeUnit timeUnit) {
        RunnableFutureC3083dE runnableFutureC3083dE = new RunnableFutureC3083dE(Executors.callable(runnable, null));
        return new VD(runnableFutureC3083dE, this.f28620v.schedule(runnableFutureC3083dE, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j9, long j10, TimeUnit timeUnit) {
        WD wd = new WD(runnable);
        return new VD(wd, this.f28620v.scheduleAtFixedRate(wd, j9, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j9, long j10, TimeUnit timeUnit) {
        WD wd = new WD(runnable);
        return new VD(wd, this.f28620v.scheduleWithFixedDelay(wd, j9, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j9, TimeUnit timeUnit) {
        RunnableFutureC3083dE runnableFutureC3083dE = new RunnableFutureC3083dE(callable);
        return new VD(runnableFutureC3083dE, this.f28620v.schedule(runnableFutureC3083dE, j9, timeUnit));
    }
}
