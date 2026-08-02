package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class xdi extends ltg implements ScheduledFuture, lcg, Future {
    public final v6 q;
    public final ScheduledFuture r;

    public xdi(v6 v6Var, ScheduledFuture scheduledFuture) {
        super(25);
        this.q = v6Var;
        this.r = scheduledFuture;
    }

    @Override // defpackage.ltg
    public final Object B() {
        return this.q;
    }

    public final boolean P(boolean z) {
        return this.q.cancel(z);
    }

    @Override // defpackage.lcg
    public final void a(Runnable runnable, Executor executor) {
        this.q.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean P = P(z);
        if (P) {
            this.r.cancel(z);
        }
        return P;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.r.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.q.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.r.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.q.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.q.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.q.get(j, timeUnit);
    }
}
