package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.a;

/* loaded from: classes9.dex */
public final class zko extends yko implements fph {
    public final Executor b;

    public zko(Executor executor) {
        Method method;
        this.b = executor;
        Method method2 = bxd.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = bxd.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.yko
    public final Executor R() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.fph
    public final void d(long j, j18 j18Var) {
        Executor executor = this.b;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            tqs tqsVar = new tqs(13, this, j18Var);
            fse fseVar = j18Var.x;
            try {
                scheduledFuture = scheduledExecutorService.schedule(tqsVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                a.e(fseVar, uh6.b("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            j18Var.x(new pv7(scheduledFuture));
        } else {
            dbh.D.d(j, j18Var);
        }
    }

    @Override // defpackage.fph
    public final m1k e(long j, Runnable runnable, fse fseVar) {
        Executor executor = this.b;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                a.e(fseVar, uh6.b("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new l1k(scheduledFuture) : dbh.D.e(j, runnable, fseVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zko) && ((zko) obj).b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        try {
            this.b.execute(runnable);
        } catch (RejectedExecutionException e) {
            a.e(fseVar, uh6.b("The task was rejected", e));
            sjh sjhVar = uyj.a;
            mdh.b.o(fseVar, runnable);
        }
    }

    @Override // defpackage.jse
    public final String toString() {
        return this.b.toString();
    }
}
