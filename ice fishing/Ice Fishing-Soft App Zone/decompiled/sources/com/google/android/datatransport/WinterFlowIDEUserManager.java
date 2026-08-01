package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEUserManager implements WinterFlowNodeProtocol {
    public final /* synthetic */ WinterFlowBandwidthCache WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowPipelineBackend WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowBackendService WinterFlowUnitTestResponse;
    public final /* synthetic */ WinterFlowEventEmitterFramework WinterFlowVariableVersionControl;

    public WinterFlowIDEUserManager(WinterFlowEventEmitterFramework winterFlowEventEmitterFramework, WinterFlowPipelineBackend winterFlowPipelineBackend, WinterFlowBackendService winterFlowBackendService, WinterFlowBandwidthCache winterFlowBandwidthCache) {
        this.WinterFlowVariableVersionControl = winterFlowEventEmitterFramework;
        this.WinterFlowTransactionManagerStrategy = winterFlowPipelineBackend;
        this.WinterFlowUnitTestResponse = winterFlowBackendService;
        this.WinterFlowRouterRouter = winterFlowBandwidthCache;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        boolean z;
        WinterFlowAPIVersion winterFlowAPIVersion = null;
        switch (WinterFlowObjectUnitTest.WinterFlowRouterStructure[winterFlowMicroserviceProcess.ordinal()]) {
            case 1:
                WinterFlowCacheRuntime.WinterFlowStrategyTool(this.WinterFlowVariableVersionControl, null, new WinterFlowMiddlewareVariable(this.WinterFlowRouterRouter, this.WinterFlowUnitTestResponse, winterFlowDecoratorVersion, this, null, 7), 1);
                return;
            case 2:
                WinterFlowPipelineBackend winterFlowPipelineBackend = this.WinterFlowTransactionManagerStrategy;
                if (winterFlowPipelineBackend != null) {
                    WinterFlowViewSystem winterFlowViewSystem = (WinterFlowViewSystem) winterFlowPipelineBackend.WinterFlowUnitTestResponse;
                    synchronized (winterFlowViewSystem.WinterFlowHookDataSource) {
                        try {
                            synchronized (winterFlowViewSystem.WinterFlowHookDataSource) {
                                z = winterFlowViewSystem.WinterFlowRouterStructure;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) winterFlowViewSystem.WinterFlowCacheManagerAgent;
                                winterFlowViewSystem.WinterFlowCacheManagerAgent = (ArrayList) winterFlowViewSystem.WinterFlowArrayNetwork;
                                winterFlowViewSystem.WinterFlowArrayNetwork = arrayList;
                                winterFlowViewSystem.WinterFlowRouterStructure = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((WinterFlowTransactionManagerLayer) arrayList.get(i)).WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                WinterFlowBackendService winterFlowBackendService = this.WinterFlowUnitTestResponse;
                synchronized (winterFlowBackendService.WinterFlowCacheManagerAgent) {
                    if (winterFlowBackendService.WinterFlowBatchUI) {
                        winterFlowBackendService.WinterFlowBatchUI = false;
                        winterFlowAPIVersion = winterFlowBackendService.WinterFlowConsumerUserManager();
                    }
                }
                if (winterFlowAPIVersion != null) {
                    ((WinterFlowEventCloud) winterFlowAPIVersion).WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                    return;
                }
                return;
            case 3:
                WinterFlowBackendService winterFlowBackendService2 = this.WinterFlowUnitTestResponse;
                synchronized (winterFlowBackendService2.WinterFlowCacheManagerAgent) {
                    winterFlowBackendService2.WinterFlowBatchUI = true;
                }
                return;
            case 4:
                this.WinterFlowUnitTestResponse.WinterFlowResolverController();
                return;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return;
        }
    }
}
