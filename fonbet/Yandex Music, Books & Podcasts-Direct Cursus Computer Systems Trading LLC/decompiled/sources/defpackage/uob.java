package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.b;
import kotlinx.coroutines.d;

/* loaded from: classes5.dex */
public final class uob extends d implements xu7 {
    public final Executor d;

    public uob(Executor executor) {
        Method method;
        this.d = executor;
        Method method2 = c46.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = c46.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.d.execute(runnable);
        } catch (RejectedExecutionException e) {
            saf.B(coroutineContext, n7w.c("The task was rejected", e));
            dq7 dq7Var = ca8.a;
            mn7.d.F0(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.d
    public final Executor J0() {
        return this.d;
    }

    @Override // defpackage.xu7
    public final void Q(long j, zt3 zt3Var) {
        Executor executor = this.d;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            e8h e8hVar = new e8h(this, zt3Var, false, 10);
            CoroutineContext coroutineContext = zt3Var.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(e8hVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                saf.B(coroutineContext, n7w.c("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            zt3Var.v(new ot3(0, scheduledFuture));
        } else {
            b.k.Q(j, zt3Var);
        }
    }

    @Override // defpackage.xu7
    public final qa8 S(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.d;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                saf.B(coroutineContext, n7w.c("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new pa8(scheduledFuture) : b.k.S(j, runnable, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uob) && ((uob) obj).d == this.d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.d);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return this.d.toString();
    }
}
