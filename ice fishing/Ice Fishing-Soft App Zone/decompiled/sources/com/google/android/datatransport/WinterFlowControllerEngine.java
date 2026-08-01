package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerEngine extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ long WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowWidgetArray WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowControllerEngine(WinterFlowWidgetArray winterFlowWidgetArray, long j, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowWidgetArray;
        this.WinterFlowRouterRouter = j;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowProviderView winterFlowProviderView;
        int i = this.WinterFlowTransactionManagerStrategy;
        long j = this.WinterFlowRouterRouter;
        WinterFlowWidgetArray winterFlowWidgetArray = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowArrayMiddleware winterFlowArrayMiddleware = (WinterFlowArrayMiddleware) obj;
                if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowArrayMiddleware.WinterFlowRouterStructure(), winterFlowWidgetArray.WinterFlowRouterAdapter.WinterFlowRouterStructure())) {
                    WinterFlowBatchCacheManager winterFlowBatchCacheManager = (WinterFlowBatchCacheManager) winterFlowWidgetArray.WinterFlowRouterAdapter.WinterFlowArrayNetwork.WinterFlowUnitTestResponse(winterFlowArrayMiddleware.WinterFlowRouterStructure());
                    j = winterFlowBatchCacheManager != null ? ((WinterFlowJavaEntity) winterFlowBatchCacheManager.getValue()).WinterFlowRouterStructure : 0L;
                } else if (!WinterFlowJavaEntity.WinterFlowRouterStructure(winterFlowWidgetArray.WinterFlowSerializerStructure, -9223372034707292160L)) {
                    j = winterFlowWidgetArray.WinterFlowSerializerStructure;
                }
                WinterFlowBatchCacheManager winterFlowBatchCacheManager2 = (WinterFlowBatchCacheManager) winterFlowWidgetArray.WinterFlowRouterAdapter.WinterFlowArrayNetwork.WinterFlowUnitTestResponse(winterFlowArrayMiddleware.WinterFlowCacheManagerAgent());
                r1 = winterFlowBatchCacheManager2 != null ? ((WinterFlowJavaEntity) winterFlowBatchCacheManager2.getValue()).WinterFlowRouterStructure : 0L;
                WinterFlowQuerySystem winterFlowQuerySystem = (WinterFlowQuerySystem) winterFlowWidgetArray.WinterFlowBatchUI.getValue();
                return (winterFlowQuerySystem == null || (winterFlowProviderView = (WinterFlowProviderView) winterFlowQuerySystem.WinterFlowRouterStructure.WinterFlowVariableVersionControl(new WinterFlowJavaEntity(j), new WinterFlowJavaEntity(r1))) == null) ? WinterFlowUnitTestLibrary.WinterFlowQueueService(5, null) : winterFlowProviderView;
            default:
                if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, winterFlowWidgetArray.WinterFlowRouterAdapter.WinterFlowRouterStructure())) {
                    r1 = WinterFlowJavaEntity.WinterFlowRouterStructure(winterFlowWidgetArray.WinterFlowSerializerStructure, -9223372034707292160L) ? j : winterFlowWidgetArray.WinterFlowSerializerStructure;
                } else {
                    WinterFlowBatchCacheManager winterFlowBatchCacheManager3 = (WinterFlowBatchCacheManager) winterFlowWidgetArray.WinterFlowRouterAdapter.WinterFlowArrayNetwork.WinterFlowUnitTestResponse(obj);
                    if (winterFlowBatchCacheManager3 != null) {
                        r1 = ((WinterFlowJavaEntity) winterFlowBatchCacheManager3.getValue()).WinterFlowRouterStructure;
                    }
                }
                return new WinterFlowJavaEntity(r1);
        }
    }
}
