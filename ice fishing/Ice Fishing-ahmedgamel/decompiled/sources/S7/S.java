package S7;

import com.google.android.gms.internal.ads.LD;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class S extends Q implements C {

    /* renamed from: v, reason: collision with root package name */
    public final Executor f2935v;

    public S(Executor executor) {
        Method method;
        this.f2935v = executor;
        Method method2 = X7.c.f3827a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = X7.c.f3827a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // S7.C
    public final H b(long j6, t0 t0Var, InterfaceC5272i interfaceC5272i) {
        Executor executor = this.f2935v;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(t0Var, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                AbstractC0406y.d(interfaceC5272i, cancellationException);
            }
        }
        return scheduledFuture != null ? new G(scheduledFuture) : RunnableC0407z.f3016C.b(j6, t0Var, interfaceC5272i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2935v;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof S) && ((S) obj).f2935v == this.f2935v;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2935v);
    }

    @Override // S7.C
    public final void k(long j6, C0389g c0389g) {
        Executor executor = this.f2935v;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new LD(23, this, c0389g), j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                AbstractC0406y.d(c0389g.f2964x, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            c0389g.t(new C0387e(0, scheduledFuture));
        } else {
            RunnableC0407z.f3016C.k(j6, c0389g);
        }
    }

    @Override // S7.AbstractC0402u
    public final void p(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        try {
            this.f2935v.execute(runnable);
        } catch (RejectedExecutionException e9) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e9);
            AbstractC0406y.d(interfaceC5272i, cancellationException);
            F.f2917c.p(interfaceC5272i, runnable);
        }
    }

    @Override // S7.AbstractC0402u
    public final String toString() {
        return this.f2935v.toString();
    }
}
