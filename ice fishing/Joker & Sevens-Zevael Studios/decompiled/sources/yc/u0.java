package yc;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 extends t0 implements f0 {

    /* renamed from: i, reason: collision with root package name */
    public final Executor f8907i;

    public u0(Executor executor) {
        Method method;
        this.f8907i = executor;
        Method method2 = dd.c.f1848a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = dd.c.f1848a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f8907i;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u0) && ((u0) obj).f8907i == this.f8907i;
    }

    @Override // yc.f0
    public final k0 f(long j3, w1 w1Var, fc.i iVar) {
        Executor executor = this.f8907i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(w1Var, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a0.c(iVar, cancellationException);
            }
        }
        return scheduledFuture != null ? new j0(scheduledFuture) : b0.f8832p.f(j3, w1Var, iVar);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8907i);
    }

    @Override // yc.f0
    public final void s(long j3, g gVar) {
        Executor executor = this.f8907i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            dd.i iVar = new dd.i(24, this, gVar, false);
            fc.i iVar2 = gVar.f8849k;
            try {
                scheduledFuture = scheduledExecutorService.schedule(iVar, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a0.c(iVar2, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            gVar.t(new e(0, scheduledFuture));
        } else {
            b0.f8832p.s(j3, gVar);
        }
    }

    @Override // yc.u
    public final String toString() {
        return this.f8907i.toString();
    }

    @Override // yc.u
    public final void w(fc.i iVar, Runnable runnable) {
        try {
            this.f8907i.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            a0.c(iVar, cancellationException);
            i0.f8861c.w(iVar, runnable);
        }
    }
}
