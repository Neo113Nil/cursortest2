package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class rdc implements ExecutorService, AutoCloseable {
    public static volatile int c;
    public final /* synthetic */ int a;
    public final ThreadPoolExecutor b;

    public /* synthetic */ rdc(ThreadPoolExecutor threadPoolExecutor, int i) {
        this.a = i;
        this.b = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.a) {
            case 0:
                return this.b.awaitTermination(j, timeUnit);
            case 1:
                return this.b.awaitTermination(j, timeUnit);
            default:
                return this.b.awaitTermination(j, timeUnit);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ThreadPoolExecutor threadPoolExecutor;
        boolean isTerminated;
        ThreadPoolExecutor threadPoolExecutor2;
        boolean isTerminated2;
        ThreadPoolExecutor threadPoolExecutor3;
        boolean isTerminated3;
        switch (this.a) {
            case 0:
                if (this != ForkJoinPool.commonPool() && !(isTerminated = (threadPoolExecutor = this.b).isTerminated())) {
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
                        break;
                    }
                }
                break;
            case 1:
                if (this != ForkJoinPool.commonPool() && !(isTerminated2 = (threadPoolExecutor2 = this.b).isTerminated())) {
                    shutdown();
                    boolean z2 = false;
                    while (!isTerminated2) {
                        try {
                            isTerminated2 = threadPoolExecutor2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z2) {
                                shutdownNow();
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
                break;
            default:
                if (this != ForkJoinPool.commonPool() && !(isTerminated3 = (threadPoolExecutor3 = this.b).isTerminated())) {
                    shutdown();
                    boolean z3 = false;
                    while (!isTerminated3) {
                        try {
                            isTerminated3 = threadPoolExecutor3.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused3) {
                            if (!z3) {
                                shutdownNow();
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.execute(runnable);
                break;
            case 1:
                this.b.execute(runnable);
                break;
            default:
                this.b.execute(runnable);
                break;
        }
    }

    public void finalize() {
        switch (this.a) {
            case 0:
                this.b.shutdown();
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        switch (this.a) {
        }
        return this.b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        switch (this.a) {
        }
        return this.b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.a) {
            case 0:
                return this.b.isShutdown();
            case 1:
                return this.b.isShutdown();
            default:
                return this.b.isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.a) {
            case 0:
                return this.b.isTerminated();
            case 1:
                return this.b.isTerminated();
            default:
                return this.b.isTerminated();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.a) {
            case 0:
                this.b.shutdown();
                break;
            case 1:
                this.b.shutdown();
                break;
            default:
                this.b.shutdown();
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.a) {
            case 0:
                return this.b.shutdownNow();
            case 1:
                return this.b.shutdownNow();
            default:
                return this.b.shutdownNow();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        switch (this.a) {
        }
        return this.b.submit(runnable);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        switch (this.a) {
        }
        return this.b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        switch (this.a) {
        }
        return this.b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        switch (this.a) {
        }
        return this.b.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        switch (this.a) {
        }
        return this.b.submit(callable);
    }
}
