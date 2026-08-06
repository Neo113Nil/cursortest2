package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dw extends defpackage.cw implements defpackage.uo {
    public final java.util.concurrent.Executor QiMR8OkAhezm;

    public dw(java.util.concurrent.Executor executor) {
        this.QiMR8OkAhezm = executor;
        if (executor instanceof java.util.concurrent.ScheduledThreadPoolExecutor) {
            ((java.util.concurrent.ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.uo
    public final defpackage.cr QiMR8OkAhezm(long j, defpackage.ho1 ho1Var, defpackage.jm jmVar) {
        java.util.concurrent.Executor executor = this.QiMR8OkAhezm;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(ho1Var, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e) {
                java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected");
                cancellationException.initCause(e);
                defpackage.b80.P05cfTpS5W5L(jmVar, cancellationException);
            }
        }
        return scheduledFuture != null ? new defpackage.br(scheduledFuture) : defpackage.un.XntWc4eZSQ8j.QiMR8OkAhezm(j, ho1Var, jmVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.Executor executor = this.QiMR8OkAhezm;
        java.util.concurrent.ExecutorService executorService = executor instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.uo
    public final void e6mdH7fiFuta(long j, defpackage.dd ddVar) {
        java.util.concurrent.Executor executor = this.QiMR8OkAhezm;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            defpackage.vc vcVar = new defpackage.vc(4, this, ddVar);
            defpackage.jm jmVar = ddVar.e6mdH7fiFuta;
            try {
                scheduledFuture = scheduledExecutorService.schedule(vcVar, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e) {
                java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected");
                cancellationException.initCause(e);
                defpackage.b80.P05cfTpS5W5L(jmVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            ddVar.dG7RjM6DqYVL(new defpackage.yc(0, scheduledFuture));
        } else {
            defpackage.un.XntWc4eZSQ8j.e6mdH7fiFuta(j, ddVar);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dw) && ((defpackage.dw) obj).QiMR8OkAhezm == this.QiMR8OkAhezm;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.QiMR8OkAhezm);
    }

    @Override // defpackage.lm
    public final void jjTN4uUnoyEn(defpackage.jm jmVar, java.lang.Runnable runnable) {
        try {
            this.QiMR8OkAhezm.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected");
            cancellationException.initCause(e);
            defpackage.b80.P05cfTpS5W5L(jmVar, cancellationException);
            defpackage.jo joVar = defpackage.tq.ZpBGe2uQfcn8;
            defpackage.co.QiMR8OkAhezm.jjTN4uUnoyEn(jmVar, runnable);
        }
    }

    @Override // defpackage.lm
    public final java.lang.String toString() {
        return this.QiMR8OkAhezm.toString();
    }
}
