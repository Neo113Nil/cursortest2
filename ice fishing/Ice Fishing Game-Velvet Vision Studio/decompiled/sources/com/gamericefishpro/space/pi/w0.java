package com.gamericefishpro.space.pi;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends v0 implements f0 {
    public final Executor i;

    public w0(Executor executor) {
        this.i = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // com.gamericefishpro.space.pi.f0
    public final void C(long j, h hVar) {
        Executor executor = this.i;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            com.gamericefishpro.space.va.a aVar = new com.gamericefishpro.space.va.a(23, this, hVar);
            CoroutineContext coroutineContext = hVar.w;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(aVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                a0.g(coroutineContext, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            hVar.v(new e(0, scheduledFutureSchedule));
        } else {
            b0.C.C(j, hVar);
        }
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.i.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            a0.g(coroutineContext, cancellationException);
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.wi.d.i.P(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.i;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w0) && ((w0) obj).i == this.i;
    }

    public final int hashCode() {
        return System.identityHashCode(this.i);
    }

    @Override // com.gamericefishpro.space.pi.f0
    public final m0 l(long j, z1 z1Var, CoroutineContext coroutineContext) {
        Executor executor = this.i;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(z1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                a0.g(coroutineContext, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new l0(scheduledFutureSchedule) : b0.C.l(j, z1Var, coroutineContext);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final String toString() {
        return this.i.toString();
    }
}
