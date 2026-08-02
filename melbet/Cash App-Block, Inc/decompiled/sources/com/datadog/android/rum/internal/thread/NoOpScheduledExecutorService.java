package com.datadog.android.rum.internal.thread;

import com.datadog.android.core.internal.NoOpInternalSdkCore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class NoOpScheduledExecutorService implements ScheduledExecutorService, AutoCloseable {
    public final /* synthetic */ int $r8$classId;

    private final void execute$com$datadog$android$core$internal$NoOpInternalSdkCore$NoOpScheduledExecutorService(Runnable runnable) {
    }

    private final void execute$com$datadog$android$rum$internal$thread$NoOpScheduledExecutorService(Runnable runnable) {
    }

    private final void shutdown$com$datadog$android$core$internal$NoOpInternalSdkCore$NoOpScheduledExecutorService() {
    }

    private final void shutdown$com$datadog$android$rum$internal$thread$NoOpScheduledExecutorService() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.$r8$classId) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:169)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:68)
    	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:32)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:92)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
     */
    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        /*
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            java.util.concurrent.ForkJoinPool.commonPool()
            return
        L9:
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r1 != r0) goto L10
            return
        L10:
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.thread.NoOpScheduledExecutorService.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new ArrayList();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        switch (this.$r8$classId) {
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.$r8$classId) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.$r8$classId) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new NoOpInternalSdkCore.NoOpScheduledFuture();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new NoOpInternalSdkCore.NoOpScheduledFuture();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new NoOpInternalSdkCore.NoOpScheduledFuture();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        int i = this.$r8$classId;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new ArrayList();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        switch (this.$r8$classId) {
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        switch (this.$r8$classId) {
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        switch (this.$r8$classId) {
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        switch (this.$r8$classId) {
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new ArrayList();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new NoOpInternalSdkCore.NoOpScheduledFuture();
        }
    }
}
