package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class ig3 implements ExecutorService, AutoCloseable {
    public final /* synthetic */ int a;
    public final ExecutorService b;

    public /* synthetic */ ig3(ExecutorService executorService, int i) {
        this.a = i;
        this.b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.awaitTermination(j, timeUnit);
            default:
                return this.b.awaitTermination(j, timeUnit);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        boolean isTerminated2;
        switch (this.a) {
            case 0:
                if (this != ForkJoinPool.commonPool() && !(isTerminated = isTerminated())) {
                    shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = awaitTermination(1L, TimeUnit.DAYS);
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
            default:
                if (this != ForkJoinPool.commonPool() && !(isTerminated2 = isTerminated())) {
                    shutdown();
                    boolean z2 = false;
                    while (!isTerminated2) {
                        try {
                            isTerminated2 = awaitTermination(1L, TimeUnit.DAYS);
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
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ig3) this.b).execute(runnable);
                break;
            default:
                this.b.execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.invokeAll(collection);
            default:
                return this.b.invokeAll(collection);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.invokeAny(collection);
            default:
                return this.b.invokeAny(collection);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.isShutdown();
            default:
                return this.b.isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.isTerminated();
            default:
                return this.b.isTerminated();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.a) {
            case 0:
                ((ig3) this.b).shutdown();
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
                return ((ig3) this.b).b.shutdownNow();
            default:
                return this.b.shutdownNow();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.submit(runnable);
            default:
                return this.b.submit(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.invokeAll(collection, j, timeUnit);
            default:
                return this.b.invokeAll(collection, j, timeUnit);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.invokeAny(collection, j, timeUnit);
            default:
                return this.b.invokeAny(collection, j, timeUnit);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.submit(runnable, obj);
            default:
                return this.b.submit(runnable, obj);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        switch (this.a) {
            case 0:
                return ((ig3) this.b).b.submit(callable);
            default:
                return this.b.submit(callable);
        }
    }
}
