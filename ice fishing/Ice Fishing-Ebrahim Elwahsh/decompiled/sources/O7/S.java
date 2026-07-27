package O7;

import B2.RunnableC0272f;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class S extends Q implements C {

    /* renamed from: v, reason: collision with root package name */
    public final Executor f2571v;

    public S(Executor executor) {
        Method method;
        this.f2571v = executor;
        Method method2 = T7.c.f3133a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = T7.c.f3133a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // O7.C
    public final H b(long j9, t0 t0Var, InterfaceC5138i interfaceC5138i) {
        Executor executor = this.f2571v;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(t0Var, j9, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e6);
                AbstractC0399y.d(interfaceC5138i, cancellationException);
            }
        }
        return scheduledFuture != null ? new G(scheduledFuture) : RunnableC0400z.f2652C.b(j9, t0Var, interfaceC5138i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2571v;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof S) && ((S) obj).f2571v == this.f2571v;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2571v);
    }

    @Override // O7.C
    public final void k(long j9, C0382g c0382g) {
        Executor executor = this.f2571v;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new RunnableC0272f(17, this, c0382g), j9, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e6);
                AbstractC0399y.d(c0382g.f2600x, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            c0382g.t(new C0380e(0, scheduledFuture));
        } else {
            RunnableC0400z.f2652C.k(j9, c0382g);
        }
    }

    @Override // O7.AbstractC0395u
    public final void p(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        try {
            this.f2571v.execute(runnable);
        } catch (RejectedExecutionException e6) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e6);
            AbstractC0399y.d(interfaceC5138i, cancellationException);
            F.f2553c.p(interfaceC5138i, runnable);
        }
    }

    @Override // O7.AbstractC0395u
    public final String toString() {
        return this.f2571v.toString();
    }
}
