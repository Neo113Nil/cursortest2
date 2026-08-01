package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowLoaderEngine implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 0;

    public /* synthetic */ WinterFlowLoaderEngine(WinterFlowPipelineWidget winterFlowPipelineWidget, WinterFlowBackendEntity winterFlowBackendEntity, WinterFlowLibraryCache winterFlowLibraryCache, int i) {
        this.WinterFlowUnitTestResponse = winterFlowPipelineWidget;
        this.WinterFlowRouterRouter = winterFlowBackendEntity;
        this.WinterFlowSyntax = winterFlowLibraryCache;
        this.WinterFlowTransactionManagerStrategy = i;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int round;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowSyntax;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        Object obj3 = this.WinterFlowRouterRouter;
        Object obj4 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowBackendEntity winterFlowBackendEntity = (WinterFlowBackendEntity) obj3;
                WinterFlowLibraryCache winterFlowLibraryCache = (WinterFlowLibraryCache) obj2;
                if (obj == ((WinterFlowPipelineWidget) obj4)) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof WinterFlowOrchestrationTool)) {
                    return winterFlowAlgorithmSession;
                }
                int i3 = winterFlowBackendEntity.WinterFlowRouterStructure - i2;
                int WinterFlowArrayNetwork = winterFlowLibraryCache.WinterFlowArrayNetwork(obj);
                winterFlowLibraryCache.WinterFlowUnitTestResponse(Math.min(i3, WinterFlowArrayNetwork >= 0 ? winterFlowLibraryCache.WinterFlowCacheManagerAgent[WinterFlowArrayNetwork] : Integer.MAX_VALUE), obj);
                return winterFlowAlgorithmSession;
            default:
                WinterFlowViewTesting[] winterFlowViewTestingArr = (WinterFlowViewTesting[]) obj4;
                WinterFlowRendererCacheManager winterFlowRendererCacheManager = (WinterFlowRendererCacheManager) obj3;
                int[] iArr = (int[]) obj2;
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
                int length = winterFlowViewTestingArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    WinterFlowViewTesting winterFlowViewTesting = winterFlowViewTestingArr[i4];
                    int i6 = i5 + 1;
                    winterFlowViewTesting.getClass();
                    Object WinterFlowSyntax = winterFlowViewTesting.WinterFlowSyntax();
                    WinterFlowInvokerRepository winterFlowInvokerRepository = WinterFlowSyntax instanceof WinterFlowInvokerRepository ? (WinterFlowInvokerRepository) WinterFlowSyntax : null;
                    WinterFlowInheritanceProxy winterFlowInheritanceProxy = winterFlowInvokerRepository != null ? winterFlowInvokerRepository.WinterFlowCacheManagerAgent : null;
                    if (winterFlowInheritanceProxy != null) {
                        round = winterFlowInheritanceProxy.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowViewTesting.WinterFlowTransactionManagerStrategy, i2, WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl);
                    } else {
                        round = Math.round((1.0f + winterFlowRendererCacheManager.WinterFlowHookDataSource.WinterFlowRouterStructure) * ((i2 - winterFlowViewTesting.WinterFlowTransactionManagerStrategy) / 2.0f));
                    }
                    WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, winterFlowViewTesting, iArr[i5], round);
                    i4++;
                    i5 = i6;
                }
                return winterFlowAlgorithmSession;
        }
    }

    public /* synthetic */ WinterFlowLoaderEngine(WinterFlowViewTesting[] winterFlowViewTestingArr, WinterFlowRendererCacheManager winterFlowRendererCacheManager, int i, int[] iArr) {
        this.WinterFlowUnitTestResponse = winterFlowViewTestingArr;
        this.WinterFlowRouterRouter = winterFlowRendererCacheManager;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowSyntax = iArr;
    }
}
