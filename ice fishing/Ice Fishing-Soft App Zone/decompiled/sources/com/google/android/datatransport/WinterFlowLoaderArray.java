package com.google.android.datatransport;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderArray extends WinterFlowQuerySyntax {
    public final /* synthetic */ WinterFlowSingletonScheduler WinterFlowServiceUtility;

    public WinterFlowLoaderArray(WinterFlowSingletonScheduler winterFlowSingletonScheduler) {
        this.WinterFlowServiceUtility = winterFlowSingletonScheduler;
    }

    @Override // com.google.android.datatransport.WinterFlowQuerySyntax
    public final void WinterFlowBackendCacheManager(WinterFlowStackProvider winterFlowStackProvider) {
        WinterFlowSingletonScheduler winterFlowSingletonScheduler = this.WinterFlowServiceUtility;
        winterFlowSingletonScheduler.WinterFlowCacheManagerAgent = winterFlowStackProvider;
        WinterFlowStackProvider winterFlowStackProvider2 = winterFlowSingletonScheduler.WinterFlowCacheManagerAgent;
        WinterFlowIDEEngine winterFlowIDEEngine = winterFlowSingletonScheduler.WinterFlowRouterStructure;
        winterFlowSingletonScheduler.WinterFlowHookDataSource = new WinterFlowObjectPackage(winterFlowStackProvider2, winterFlowIDEEngine.WinterFlowUnitTestResponse, winterFlowIDEEngine.WinterFlowSyntax, Build.VERSION.SDK_INT >= 34 ? WinterFlowPipelineMechanism.WinterFlowRouterStructure() : WinterFlowCacheRuntime.WinterFlowBackendCacheManager());
        WinterFlowIDEEngine winterFlowIDEEngine2 = winterFlowSingletonScheduler.WinterFlowRouterStructure;
        ArrayList arrayList = new ArrayList();
        winterFlowIDEEngine2.WinterFlowRouterStructure.writeLock().lock();
        try {
            winterFlowIDEEngine2.WinterFlowCacheManagerAgent = 1;
            arrayList.addAll(winterFlowIDEEngine2.WinterFlowHookDataSource);
            winterFlowIDEEngine2.WinterFlowHookDataSource.clear();
            winterFlowIDEEngine2.WinterFlowRouterStructure.writeLock().unlock();
            winterFlowIDEEngine2.WinterFlowArrayNetwork.post(new WinterFlowSessionThreadPool(arrayList, winterFlowIDEEngine2.WinterFlowCacheManagerAgent, (Throwable) null));
        } catch (Throwable th) {
            winterFlowIDEEngine2.WinterFlowRouterStructure.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowQuerySyntax
    public final void WinterFlowResolverController(Throwable th) {
        this.WinterFlowServiceUtility.WinterFlowRouterStructure.WinterFlowArrayNetwork(th);
    }
}
