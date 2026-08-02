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
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class S extends Q implements C {

    /* renamed from: v, reason: collision with root package name */
    public final Executor f3018v;

    public S(Executor executor) {
        Method method;
        this.f3018v = executor;
        Method method2 = X7.c.f3782a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = X7.c.f3782a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // S7.C
    public final H b(long j6, t0 t0Var, InterfaceC5245i interfaceC5245i) {
        Executor executor = this.f3018v;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(t0Var, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                AbstractC0410y.d(interfaceC5245i, cancellationException);
            }
        }
        return scheduledFuture != null ? new G(scheduledFuture) : RunnableC0411z.f3099C.b(j6, t0Var, interfaceC5245i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f3018v;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof S) && ((S) obj).f3018v == this.f3018v;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3018v);
    }

    @Override // S7.C
    public final void k(long j6, C0393g c0393g) {
        Executor executor = this.f3018v;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new LD(22, this, c0393g), j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                AbstractC0410y.d(c0393g.f3047x, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            c0393g.t(new C0391e(0, scheduledFuture));
        } else {
            RunnableC0411z.f3099C.k(j6, c0393g);
        }
    }

    @Override // S7.AbstractC0406u
    public final void p(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        try {
            this.f3018v.execute(runnable);
        } catch (RejectedExecutionException e9) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e9);
            AbstractC0410y.d(interfaceC5245i, cancellationException);
            F.f3000c.p(interfaceC5245i, runnable);
        }
    }

    @Override // S7.AbstractC0406u
    public final String toString() {
        return this.f3018v.toString();
    }
}
