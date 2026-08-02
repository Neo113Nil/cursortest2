package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class UD extends AbstractC2792Sd implements ScheduledFuture, P3.a, Future {

    /* renamed from: M, reason: collision with root package name */
    public final AbstractC3310hD f28708M;

    /* renamed from: N, reason: collision with root package name */
    public final ScheduledFuture f28709N;

    public UD(AbstractC3310hD abstractC3310hD, ScheduledFuture scheduledFuture) {
        super(28);
        this.f28708M = abstractC3310hD;
        this.f28709N = scheduledFuture;
    }

    @Override // P3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f28708M.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean cancel = this.f28708M.cancel(z6);
        if (cancel) {
            this.f28709N.cancel(z6);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f28709N.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f28708M.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f28709N.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f28708M.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f28708M.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2792Sd
    public final /* synthetic */ Object m() {
        return this.f28708M;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f28708M.get(j6, timeUnit);
    }
}
