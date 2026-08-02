package z1;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d implements ExecutorService {

    /* renamed from: u, reason: collision with root package name */
    public static final long f42227u = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: v, reason: collision with root package name */
    public static volatile int f42228v;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f42229n;

    public d(ThreadPoolExecutor threadPoolExecutor) {
        this.f42229n = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.f42229n.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f42229n.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f42229n.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f42229n.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f42229n.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f42229n.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f42229n.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f42229n.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f42229n.submit(runnable);
    }

    public final String toString() {
        return this.f42229n.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f42229n.invokeAll(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f42229n.invokeAny(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f42229n.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f42229n.submit(callable);
    }
}
