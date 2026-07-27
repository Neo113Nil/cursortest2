package L0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class K extends J implements InterfaceC0067z {

    /* renamed from: g, reason: collision with root package name */
    public final Executor f622g;

    public K(Executor executor) {
        Method method;
        this.f622g = executor;
        Method method2 = Q0.c.f876a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = Q0.c.f876a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // L0.AbstractC0061t
    public final void c(v0.i iVar, Runnable runnable) {
        try {
            this.f622g.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            Q q2 = (Q) iVar.i(C0062u.f682f);
            if (q2 != null) {
                q2.a(cancellationException);
            }
            C.f612b.c(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f622g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof K) && ((K) obj).f622g == this.f622g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f622g);
    }

    @Override // L0.AbstractC0061t
    public final String toString() {
        return this.f622g.toString();
    }
}
