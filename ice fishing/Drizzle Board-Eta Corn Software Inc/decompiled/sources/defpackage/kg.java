package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kg extends jg implements ub {
    public final Executor wxUZMvaN;

    public kg(Executor executor) {
        this.wxUZMvaN = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.ub
    public final void P7K7Inc8(long j, m3 m3Var) {
        Executor executor = this.wxUZMvaN;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            XrPeKzBk xrPeKzBk = new XrPeKzBk(this, m3Var, 9, false);
            l9 l9Var = m3Var.P7K7Inc8;
            try {
                scheduledFuture = scheduledExecutorService.schedule(xrPeKzBk, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                vn vnVar = (vn) l9Var.OnDfzHZD(re.VgvYg0wo);
                if (vnVar != null) {
                    vnVar.b2ZJblxo(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            m3Var.FySoLYna(new i3(0, scheduledFuture));
        } else {
            ua.ow5vqvCr.P7K7Inc8(j, m3Var);
        }
    }

    @Override // defpackage.n9
    public final void RXQxj5Oe(l9 l9Var, Runnable runnable) {
        try {
            this.wxUZMvaN.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            vn vnVar = (vn) l9Var.OnDfzHZD(re.VgvYg0wo);
            if (vnVar != null) {
                vnVar.b2ZJblxo(cancellationException);
            }
            hb hbVar = ed.qoPGr6Ce;
            xa.wxUZMvaN.RXQxj5Oe(l9Var, runnable);
        }
    }

    @Override // defpackage.ub
    public final kd VgvYg0wo(long j, pc0 pc0Var, l9 l9Var) {
        Executor executor = this.wxUZMvaN;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(pc0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                vn vnVar = (vn) l9Var.OnDfzHZD(re.VgvYg0wo);
                if (vnVar != null) {
                    vnVar.b2ZJblxo(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new jd(scheduledFuture) : ua.ow5vqvCr.VgvYg0wo(j, pc0Var, l9Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.wxUZMvaN;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kg) && ((kg) obj).wxUZMvaN == this.wxUZMvaN;
    }

    public final int hashCode() {
        return System.identityHashCode(this.wxUZMvaN);
    }

    @Override // defpackage.n9
    public final String toString() {
        return this.wxUZMvaN.toString();
    }
}
