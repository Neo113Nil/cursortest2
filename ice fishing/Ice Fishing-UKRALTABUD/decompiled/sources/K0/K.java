package K0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class K extends J implements InterfaceC0049z {

    /* renamed from: h, reason: collision with root package name */
    public final Executor f474h;

    public K(Executor executor) {
        Method method;
        this.f474h = executor;
        Method method2 = P0.c.f867a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = P0.c.f867a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // K0.AbstractC0043t
    public final void c(v0.i iVar, Runnable runnable) {
        try {
            this.f474h.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            Q q2 = (Q) iVar.i(C0044u.f534g);
            if (q2 != null) {
                q2.a(cancellationException);
            }
            C.f464b.c(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f474h;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof K) && ((K) obj).f474h == this.f474h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f474h);
    }

    @Override // K0.AbstractC0043t
    public final String toString() {
        return this.f474h.toString();
    }
}
