package androidx.versionedparcelable;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelServiceProviderS51kvYcCBzYLaR0XMv20139527259171 implements ScheduledExecutorService, AutoCloseable {
    public final ScheduledExecutorService LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final ExecutorService RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public BlueKernelServiceProviderS51kvYcCBzYLaR0XMv20139527259171(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = executorService;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.awaitTermination(j, timeUnit);
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
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new CrimsonRouteFunctionAbstractionXxYOgKXKVrqHeahGjp52101194527983(new YellowLoopDelegateParserK751Df1xsD7MHFuw6I67834980414403(this, runnable, j, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new CrimsonRouteFunctionAbstractionXxYOgKXKVrqHeahGjp52101194527983(new UltraBufferClassTemplatingId0sPBhSh2ycz7CLkl91481714711167(this, runnable, j, j2, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new CrimsonRouteFunctionAbstractionXxYOgKXKVrqHeahGjp52101194527983(new UltraBufferClassTemplatingId0sPBhSh2ycz7CLkl91481714711167(this, runnable, j, j2, timeUnit, 1));
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
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new CrimsonRouteFunctionAbstractionXxYOgKXKVrqHeahGjp52101194527983(new YellowLoopDelegateParserK751Df1xsD7MHFuw6I67834980414403(this, callable, j, timeUnit, 1));
    }
}
