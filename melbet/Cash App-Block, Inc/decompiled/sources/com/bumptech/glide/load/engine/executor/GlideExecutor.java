package com.bumptech.glide.load.engine.executor;

import com.bugsnag.android.Client;
import com.google.android.gms.dynamite.zza;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class GlideExecutor implements ExecutorService, AutoCloseable {
    public static volatile int bestThreadCount;
    public final ThreadPoolExecutor delegate;

    public final class DefaultPriorityThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new zza(runnable);
        }
    }

    public final class DefaultThreadFactory implements ThreadFactory {
        public final DefaultPriorityThreadFactory delegate;
        public final String name;
        public final boolean preventNetworkOperations;
        public final AtomicInteger threadNum = new AtomicInteger();
        public final GlideExecutor$UncaughtThrowableStrategy$2 uncaughtThrowableStrategy = GlideExecutor$UncaughtThrowableStrategy$2.DEFAULT;

        public DefaultThreadFactory(DefaultPriorityThreadFactory defaultPriorityThreadFactory, String str, boolean z) {
            this.delegate = defaultPriorityThreadFactory;
            this.name = str;
            this.preventNetworkOperations = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Client.AnonymousClass4 anonymousClass4 = new Client.AnonymousClass4(this, runnable, false, 12);
            this.delegate.getClass();
            zza zzaVar = new zza(anonymousClass4);
            zzaVar.setName("glide-" + this.name + "-thread-" + this.threadNum.getAndIncrement());
            return zzaVar;
        }
    }

    public GlideExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.delegate = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ThreadPoolExecutor threadPoolExecutor;
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = (threadPoolExecutor = this.delegate).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
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
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.delegate.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.delegate.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    public final String toString() {
        return this.delegate.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.delegate.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.delegate.submit(callable);
    }
}
