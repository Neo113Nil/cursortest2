package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceXML extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowWorkerProcess WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowDataSourceXML(WinterFlowWorkerProcess winterFlowWorkerProcess, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowWorkerProcess;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowTransactionRequest winterFlowTransactionRequest = WinterFlowTransactionRequest.WinterFlowUnitTestResponse;
        WinterFlowTransactionRequest winterFlowTransactionRequest2 = WinterFlowTransactionRequest.WinterFlowTransactionManagerStrategy;
        WinterFlowTransactionRequest winterFlowTransactionRequest3 = WinterFlowTransactionRequest.WinterFlowVariableVersionControl;
        WinterFlowWorkerProcess winterFlowWorkerProcess = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowArrayMiddleware winterFlowArrayMiddleware = (WinterFlowArrayMiddleware) obj;
                boolean WinterFlowHookDataSource = winterFlowArrayMiddleware.WinterFlowHookDataSource(winterFlowTransactionRequest3, winterFlowTransactionRequest2);
                WinterFlowSerializerProcess winterFlowSerializerProcess = null;
                if (!WinterFlowHookDataSource) {
                    if (winterFlowArrayMiddleware.WinterFlowHookDataSource(winterFlowTransactionRequest2, winterFlowTransactionRequest)) {
                        WinterFlowRefactoringRequest winterFlowRefactoringRequest = winterFlowWorkerProcess.WinterFlowBatchUI.WinterFlowRouterStructure;
                    } else {
                        winterFlowSerializerProcess = WinterFlowMapperView.WinterFlowArrayNetwork;
                    }
                }
                return winterFlowSerializerProcess == null ? WinterFlowMapperView.WinterFlowArrayNetwork : winterFlowSerializerProcess;
            default:
                WinterFlowArrayMiddleware winterFlowArrayMiddleware2 = (WinterFlowArrayMiddleware) obj;
                if (winterFlowArrayMiddleware2.WinterFlowHookDataSource(winterFlowTransactionRequest3, winterFlowTransactionRequest2)) {
                    return WinterFlowMapperView.WinterFlowCacheManagerAgent;
                }
                if (!winterFlowArrayMiddleware2.WinterFlowHookDataSource(winterFlowTransactionRequest2, winterFlowTransactionRequest)) {
                    return WinterFlowMapperView.WinterFlowCacheManagerAgent;
                }
                WinterFlowRefactoringRequest winterFlowRefactoringRequest2 = winterFlowWorkerProcess.WinterFlowBatchUI.WinterFlowRouterStructure;
                return WinterFlowMapperView.WinterFlowCacheManagerAgent;
        }
    }
}
