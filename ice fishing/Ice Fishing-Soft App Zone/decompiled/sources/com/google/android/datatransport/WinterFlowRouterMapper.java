package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterMapper extends WinterFlowUserManagerController implements WinterFlowNetwork {
    public float WinterFlowBatchUI;
    public WinterFlowObjectService WinterFlowVariableBandwidth;

    @Override // com.google.android.datatransport.WinterFlowNetwork
    public final WinterFlowTransactionPlatform WinterFlowQueueService(WinterFlowRequestUtility winterFlowRequestUtility, WinterFlowRuntimeVersion winterFlowRuntimeVersion, long j) {
        int WinterFlowResponseEngine;
        int WinterFlowRouterRouter;
        int i;
        int i2;
        if (!WinterFlowHandlerConsumer.WinterFlowArrayNetwork(j) || this.WinterFlowVariableBandwidth == WinterFlowObjectService.WinterFlowVariableVersionControl) {
            WinterFlowResponseEngine = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
            WinterFlowRouterRouter = WinterFlowHandlerConsumer.WinterFlowRouterRouter(j);
        } else {
            int round = Math.round(WinterFlowHandlerConsumer.WinterFlowRouterRouter(j) * this.WinterFlowBatchUI);
            int WinterFlowResponseEngine2 = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
            WinterFlowResponseEngine = WinterFlowHandlerConsumer.WinterFlowRouterRouter(j);
            if (round < WinterFlowResponseEngine2) {
                round = WinterFlowResponseEngine2;
            }
            if (round <= WinterFlowResponseEngine) {
                WinterFlowResponseEngine = round;
            }
            WinterFlowRouterRouter = WinterFlowResponseEngine;
        }
        if (!WinterFlowHandlerConsumer.WinterFlowCacheManagerAgent(j) || this.WinterFlowVariableBandwidth == WinterFlowObjectService.WinterFlowTransactionManagerStrategy) {
            int WinterFlowSyntax = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
            int WinterFlowUnitTestResponse = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
            i = WinterFlowSyntax;
            i2 = WinterFlowUnitTestResponse;
        } else {
            int round2 = Math.round(WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j) * this.WinterFlowBatchUI);
            int WinterFlowSyntax2 = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
            i = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
            if (round2 < WinterFlowSyntax2) {
                round2 = WinterFlowSyntax2;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        WinterFlowViewTesting WinterFlowVariableVersionControl = winterFlowRuntimeVersion.WinterFlowVariableVersionControl(WinterFlowServiceOrchestration.WinterFlowRouterStructure(WinterFlowResponseEngine, WinterFlowRouterRouter, i, i2));
        return winterFlowRequestUtility.WinterFlowThreadListener(WinterFlowVariableVersionControl.WinterFlowVariableVersionControl, WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy, WinterFlowFrontendNode.WinterFlowVariableVersionControl, new WinterFlowResponseFrontend(WinterFlowVariableVersionControl, 0));
    }
}
