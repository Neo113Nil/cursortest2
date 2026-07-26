package android.content.Context;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentResolverPulsePixel6161 implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService FrostHunterCameraXPixelTurboCosmos9814;
    public final ScheduledExecutorService FrostHunterFlowMaxDragonHero5809;

    public FrostHunterContentResolverPulsePixel6161(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = executorService;
        this.FrostHunterFlowMaxDragonHero5809 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.FrostHunterCameraXPixelTurboCosmos9814.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new FrostHunterValueAnimatorCosmosSparkPixel9160(new FrostHunterLaunchAuroraNebula2731(this, runnable, j, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new FrostHunterValueAnimatorCosmosSparkPixel9160(new FrostHunterStateOmegaNova9774(this, runnable, j, j2, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new FrostHunterValueAnimatorCosmosSparkPixel9160(new FrostHunterStateOmegaNova9774(this, runnable, j, j2, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new FrostHunterValueAnimatorCosmosSparkPixel9160(new FrostHunterLaunchAuroraNebula2731(this, callable, j, timeUnit, 1));
    }
}
