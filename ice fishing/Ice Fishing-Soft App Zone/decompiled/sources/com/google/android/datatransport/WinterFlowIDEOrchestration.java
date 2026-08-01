package com.google.android.datatransport;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEOrchestration {
    public final WinterFlowViewRenderer WinterFlowHookDataSource;
    public final WinterFlowStackProvider WinterFlowRouterStructure;

    /* JADX WARN: Multi-variable type inference failed */
    public WinterFlowIDEOrchestration(WinterFlowStackProvider winterFlowStackProvider, WinterFlowViewRenderer winterFlowViewRenderer) {
        this.WinterFlowRouterStructure = winterFlowStackProvider;
        this.WinterFlowHookDataSource = winterFlowViewRenderer;
        if ((winterFlowStackProvider == null ? winterFlowViewRenderer : winterFlowStackProvider) != null) {
            return;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void WinterFlowHookDataSource(WinterFlowSchedulerSession winterFlowSchedulerSession) {
        boolean isTerminated;
        if (this.WinterFlowRouterStructure != null) {
            ((WinterFlowVariableProcess) winterFlowSchedulerSession.WinterFlowHookDataSource).WinterFlowVariableVersionControl();
            return;
        }
        if (this.WinterFlowHookDataSource == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Unreachable");
            return;
        }
        WinterFlowQueueComponent winterFlowQueueComponent = (WinterFlowQueueComponent) winterFlowSchedulerSession.WinterFlowRouterStructure;
        ArrayList arrayList = winterFlowQueueComponent.WinterFlowRouterStructure;
        CopyOnWriteArrayList copyOnWriteArrayList = winterFlowQueueComponent.WinterFlowCacheManagerAgent;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((WinterFlowSyntaxStructure) obj).WinterFlowVariableVersionControl();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    public final void WinterFlowRouterStructure(WinterFlowSchedulerSession winterFlowSchedulerSession) {
        WinterFlowStackProvider winterFlowStackProvider = this.WinterFlowRouterStructure;
        if (winterFlowStackProvider != null) {
            WinterFlowStackProvider.WinterFlowArrayNetwork(winterFlowStackProvider, (WinterFlowVariableProcess) winterFlowSchedulerSession.WinterFlowHookDataSource);
            return;
        }
        WinterFlowViewRenderer winterFlowViewRenderer = this.WinterFlowHookDataSource;
        if (winterFlowViewRenderer == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Unreachable");
            return;
        }
        WinterFlowQueueComponent winterFlowQueueComponent = (WinterFlowQueueComponent) winterFlowSchedulerSession.WinterFlowRouterStructure;
        winterFlowQueueComponent.getClass();
        WinterFlowSyntaxStructure winterFlowSyntaxStructure = new WinterFlowSyntaxStructure(winterFlowQueueComponent, new WinterFlowDatabaseVersion(winterFlowQueueComponent, null));
        winterFlowQueueComponent.WinterFlowRouterStructure.add(winterFlowSyntaxStructure);
        WinterFlowStackProvider.WinterFlowArrayNetwork(winterFlowViewRenderer.WinterFlowRouterStructure().WinterFlowCacheManagerAgent, winterFlowSyntaxStructure);
    }
}
