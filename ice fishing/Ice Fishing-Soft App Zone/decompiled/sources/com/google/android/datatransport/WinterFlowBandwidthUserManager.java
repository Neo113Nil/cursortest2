package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBandwidthUserManager extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowInvokerOrchestration WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowProxyLayer WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowBandwidthUserManager(WinterFlowProxyLayer winterFlowProxyLayer, WinterFlowInvokerOrchestration winterFlowInvokerOrchestration, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowProxyLayer;
        this.WinterFlowRouterRouter = winterFlowInvokerOrchestration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r9.WinterFlowRouterStructure.WinterFlowRouterStructure != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r1.WinterFlowRouterStructure.WinterFlowRouterStructure != null) goto L26;
     */
    @Override // com.google.android.datatransport.WinterFlowObjectSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowProxyLayer winterFlowProxyLayer = this.WinterFlowUnitTestResponse;
        WinterFlowTransactionRequest winterFlowTransactionRequest = WinterFlowTransactionRequest.WinterFlowUnitTestResponse;
        WinterFlowTransactionRequest winterFlowTransactionRequest2 = WinterFlowTransactionRequest.WinterFlowTransactionManagerStrategy;
        WinterFlowTransactionRequest winterFlowTransactionRequest3 = WinterFlowTransactionRequest.WinterFlowVariableVersionControl;
        float f = 1.0f;
        WinterFlowInvokerOrchestration winterFlowInvokerOrchestration = this.WinterFlowRouterRouter;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowArrayMiddleware winterFlowArrayMiddleware = (WinterFlowArrayMiddleware) obj;
                if (winterFlowArrayMiddleware.WinterFlowHookDataSource(winterFlowTransactionRequest3, winterFlowTransactionRequest2)) {
                    WinterFlowWorkerDeserialization winterFlowWorkerDeserialization = winterFlowProxyLayer.WinterFlowRouterStructure.WinterFlowRouterStructure;
                    return winterFlowWorkerDeserialization != null ? winterFlowWorkerDeserialization.WinterFlowRouterStructure : WinterFlowMapperView.WinterFlowHookDataSource;
                }
                if (!winterFlowArrayMiddleware.WinterFlowHookDataSource(winterFlowTransactionRequest2, winterFlowTransactionRequest)) {
                    return WinterFlowMapperView.WinterFlowHookDataSource;
                }
                WinterFlowWorkerDeserialization winterFlowWorkerDeserialization2 = winterFlowInvokerOrchestration.WinterFlowRouterStructure.WinterFlowRouterStructure;
                return winterFlowWorkerDeserialization2 != null ? winterFlowWorkerDeserialization2.WinterFlowRouterStructure : WinterFlowMapperView.WinterFlowHookDataSource;
            case 1:
                int ordinal = ((WinterFlowTransactionRequest) obj).ordinal();
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                            return null;
                        }
                        break;
                    }
                    return Float.valueOf(f);
                }
            case 2:
                WinterFlowArrayMiddleware winterFlowArrayMiddleware2 = (WinterFlowArrayMiddleware) obj;
                if (winterFlowArrayMiddleware2.WinterFlowHookDataSource(winterFlowTransactionRequest3, winterFlowTransactionRequest2)) {
                    return WinterFlowMapperView.WinterFlowHookDataSource;
                }
                if (!winterFlowArrayMiddleware2.WinterFlowHookDataSource(winterFlowTransactionRequest2, winterFlowTransactionRequest)) {
                    return WinterFlowMapperView.WinterFlowHookDataSource;
                }
                WinterFlowRefactoringRequest winterFlowRefactoringRequest = winterFlowInvokerOrchestration.WinterFlowRouterStructure;
                return WinterFlowMapperView.WinterFlowHookDataSource;
            default:
                int ordinal2 = ((WinterFlowTransactionRequest) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return null;
                    }
                    WinterFlowRefactoringRequest winterFlowRefactoringRequest2 = winterFlowInvokerOrchestration.WinterFlowRouterStructure;
                }
                return Float.valueOf(1.0f);
        }
    }
}
