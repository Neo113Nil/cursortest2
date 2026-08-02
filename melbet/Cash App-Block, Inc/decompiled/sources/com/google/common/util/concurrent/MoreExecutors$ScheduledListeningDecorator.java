package com.google.common.util.concurrent;

import coil3.size.SizeKt;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.libraries.places.internal.zzfo;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class MoreExecutors$ScheduledListeningDecorator extends AbstractExecutorService implements ScheduledExecutorService, ExecutorService, AutoCloseable {
    public final ScheduledExecutorService delegate;
    public final ScheduledExecutorService delegate$1;

    /* loaded from: classes4.dex */
    public final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture implements Runnable {
        public final Runnable delegate;

        public NeverSuccessfulListenableFutureTask(Runnable runnable) {
            runnable.getClass();
            this.delegate = runnable;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String pendingToString() {
            return "task=[" + this.delegate + "]";
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.delegate.run();
            } catch (Throwable th) {
                setException(th);
                throw th;
            }
        }
    }

    public MoreExecutors$ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.delegate$1 = scheduledExecutorService;
        this.delegate = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.delegate$1.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ScheduledExecutorService scheduledExecutorService;
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = (scheduledExecutorService = this.delegate$1).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = scheduledExecutorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.delegate$1.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.delegate$1.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.delegate$1.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new TrustedListenableFutureTask(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(Executors.callable(runnable, null));
        return new ListenableScheduledTask(trustedListenableFutureTask, this.delegate.schedule(trustedListenableFutureTask, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
        return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
        return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.delegate$1.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.delegate$1.shutdownNow();
    }

    public final ListenableFuture submit(zzpn zzpnVar) {
        return (ListenableFuture) super.submit((Runnable) zzpnVar);
    }

    public final String toString() {
        return super.toString() + "[" + this.delegate$1 + "]";
    }

    public final class ListenableScheduledTask extends SizeKt implements ScheduledFuture, ListenableFuture, Future {
        public final AbstractFuture delegate;
        public final ScheduledFuture scheduledDelegate;

        public ListenableScheduledTask(AbstractFuture abstractFuture, ScheduledFuture scheduledFuture) {
            super(17);
            this.delegate = abstractFuture;
            this.scheduledDelegate = scheduledFuture;
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            this.delegate.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            boolean cancel$com$google$common$util$concurrent$ForwardingFuture = cancel$com$google$common$util$concurrent$ForwardingFuture(z);
            if (cancel$com$google$common$util$concurrent$ForwardingFuture) {
                this.scheduledDelegate.cancel(z);
            }
            return cancel$com$google$common$util$concurrent$ForwardingFuture;
        }

        public final boolean cancel$com$google$common$util$concurrent$ForwardingFuture(boolean z) {
            return this.delegate.cancel(z);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            return this.scheduledDelegate.compareTo(delayed);
        }

        @Override // coil3.size.SizeKt
        public final Object delegate() {
            return this.delegate;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return this.scheduledDelegate.getDelay(timeUnit);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.delegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return this.delegate.get(j, timeUnit);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    public final ListenableFuture submit(zzfo zzfoVar) {
        return (ListenableFuture) super.submit((Callable) zzfoVar);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new TrustedListenableFutureTask(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(callable);
        return new ListenableScheduledTask(trustedListenableFutureTask, this.delegate.schedule(trustedListenableFutureTask, j, timeUnit));
    }
}
