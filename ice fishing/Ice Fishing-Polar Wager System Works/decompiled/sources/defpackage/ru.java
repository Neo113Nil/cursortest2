package defpackage;

/* loaded from: classes.dex */
public final class ru extends defpackage.qu implements defpackage.jn {
    public final java.util.concurrent.Executor AARZUJiTa;

    public ru(java.util.concurrent.Executor executor) {
        this.AARZUJiTa = executor;
        if (executor instanceof java.util.concurrent.ScheduledThreadPoolExecutor) {
            ((java.util.concurrent.ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.jn
    public final defpackage.kq AARZUJiTa(long j, defpackage.zg1 zg1Var, defpackage.lj ljVar) {
        java.util.concurrent.Executor executor = this.AARZUJiTa;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(zg1Var, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e) {
                java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected");
                cancellationException.initCause(e);
                defpackage.x80.riuEU0zW4(ljVar, cancellationException);
            }
        }
        return scheduledFuture != null ? new defpackage.jq(scheduledFuture) : defpackage.nm.QoRHpC4k.AARZUJiTa(j, zg1Var, ljVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.Executor executor = this.AARZUJiTa;
        java.util.concurrent.ExecutorService executorService = executor instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ru) && ((defpackage.ru) obj).AARZUJiTa == this.AARZUJiTa;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.AARZUJiTa);
    }

    @Override // defpackage.jn
    public final void riuEU0zW4(long j, defpackage.bb bbVar) {
        java.util.concurrent.Executor executor = this.AARZUJiTa;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            defpackage.d30 d30Var = new defpackage.d30(this, bbVar, 2);
            defpackage.lj ljVar = bbVar.riuEU0zW4;
            try {
                scheduledFuture = scheduledExecutorService.schedule(d30Var, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e) {
                java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected");
                cancellationException.initCause(e);
                defpackage.x80.riuEU0zW4(ljVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            bbVar.C0U8sNJm(new defpackage.ya(0, scheduledFuture));
        } else {
            defpackage.nm.QoRHpC4k.riuEU0zW4(j, bbVar);
        }
    }

    @Override // defpackage.nj
    public final java.lang.String toString() {
        return this.AARZUJiTa.toString();
    }

    @Override // defpackage.nj
    public final void v5iciZok(defpackage.lj ljVar, java.lang.Runnable runnable) {
        try {
            this.AARZUJiTa.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected");
            cancellationException.initCause(e);
            defpackage.x80.riuEU0zW4(ljVar, cancellationException);
            defpackage.bn bnVar = defpackage.bq.IHQe1A4L2xu;
            defpackage.vm.AARZUJiTa.v5iciZok(ljVar, runnable);
        }
    }
}
