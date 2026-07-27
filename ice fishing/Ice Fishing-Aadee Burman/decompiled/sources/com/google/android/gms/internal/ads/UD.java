package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class UD extends AbstractC2772Sd implements ScheduledFuture, N3.a, Future {

    /* renamed from: M, reason: collision with root package name */
    public final AbstractC3287hD f27911M;

    /* renamed from: N, reason: collision with root package name */
    public final ScheduledFuture f27912N;

    public UD(AbstractC3287hD abstractC3287hD, ScheduledFuture scheduledFuture) {
        super(28);
        this.f27911M = abstractC3287hD;
        this.f27912N = scheduledFuture;
    }

    @Override // N3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f27911M.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean cancel = this.f27911M.cancel(z3);
        if (cancel) {
            this.f27912N.cancel(z3);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f27912N.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f27911M.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f27912N.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27911M.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27911M.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2772Sd
    public final /* synthetic */ Object m() {
        return this.f27911M;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f27911M.get(j6, timeUnit);
    }
}
