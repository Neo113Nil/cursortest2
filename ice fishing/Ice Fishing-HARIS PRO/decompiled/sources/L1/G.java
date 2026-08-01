package L1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class G extends F implements InterfaceC0021w {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f531c;

    public G(Executor executor) {
        Method method;
        this.f531c = executor;
        Method method2 = Q1.c.f939a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = Q1.c.f939a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // L1.AbstractC0015p
    public final void b(v1.i iVar, Runnable runnable) {
        try {
            this.f531c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            K k2 = (K) iVar.e(C0016q.f576b);
            if (k2 != null) {
                ((T) k2).i(cancellationException);
            }
            AbstractC0023y.f587b.b(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f531c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && ((G) obj).f531c == this.f531c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f531c);
    }

    @Override // L1.AbstractC0015p
    public final String toString() {
        return this.f531c.toString();
    }
}
