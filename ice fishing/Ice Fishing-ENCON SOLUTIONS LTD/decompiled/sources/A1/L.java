package A1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class L extends K implements A {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f13c;

    public L(Executor executor) {
        Method method;
        this.f13c = executor;
        Method method2 = F1.c.f596a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = F1.c.f596a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f13c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof L) && ((L) obj).f13c == this.f13c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13c);
    }

    @Override // A1.AbstractC0018t
    public final void j(l1.i iVar, Runnable runnable) {
        try {
            this.f13c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            S s2 = (S) iVar.m(C0019u.f73b);
            if (s2 != null) {
                s2.a(cancellationException);
            }
            D.f3b.j(iVar, runnable);
        }
    }

    @Override // A1.AbstractC0018t
    public final String toString() {
        return this.f13c.toString();
    }
}
