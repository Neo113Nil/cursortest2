package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class p5j extends ito {
    public final ScheduledExecutorService a;
    public volatile boolean b;

    public p5j(ThreadFactory threadFactory) {
        boolean z = mto.a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (mto.a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            mto.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.a = newScheduledThreadPool;
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.shutdownNow();
    }

    @Override // defpackage.ito
    public final ka8 b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b ? t4b.a : e(runnable, j, timeUnit, null);
    }

    @Override // defpackage.ito
    public final void d(qij qijVar) {
        b(qijVar, 0L, null);
    }

    public final gto e(Runnable runnable, long j, TimeUnit timeUnit, uq5 uq5Var) {
        gto gtoVar = new gto(runnable, uq5Var);
        if (uq5Var != null && !uq5Var.b(gtoVar)) {
            return gtoVar;
        }
        ScheduledExecutorService scheduledExecutorService = this.a;
        try {
            gtoVar.b(j <= 0 ? scheduledExecutorService.submit((Callable) gtoVar) : scheduledExecutorService.schedule((Callable) gtoVar, j, timeUnit));
            return gtoVar;
        } catch (RejectedExecutionException e) {
            if (uq5Var != null) {
                uq5Var.e(gtoVar);
            }
            y5g.g0(e);
            return gtoVar;
        }
    }
}
