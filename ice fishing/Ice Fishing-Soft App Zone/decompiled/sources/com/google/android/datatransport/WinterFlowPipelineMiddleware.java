package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPipelineMiddleware extends WinterFlowUserManagerController implements WinterFlowNetwork {
    public float WinterFlowBatchUI;
    public boolean WinterFlowMapperProtocol;
    public float WinterFlowRouterAdapter;
    public float WinterFlowSerializerStructure;
    public float WinterFlowVariableBandwidth;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    @Override // com.google.android.datatransport.WinterFlowNetwork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowTransactionPlatform WinterFlowQueueService(WinterFlowRequestUtility winterFlowRequestUtility, WinterFlowRuntimeVersion winterFlowRuntimeVersion, long j) {
        int i;
        int i2;
        int i3;
        int WinterFlowResponseEngine;
        int WinterFlowRouterRouter;
        int WinterFlowSyntax;
        int WinterFlowUnitTestResponse;
        long WinterFlowRouterStructure;
        int i4 = 0;
        if (Float.isNaN(this.WinterFlowRouterAdapter)) {
            i = Integer.MAX_VALUE;
        } else {
            i = winterFlowRequestUtility.WinterFlowUserManagerUserManager(this.WinterFlowRouterAdapter);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.WinterFlowSerializerStructure)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = winterFlowRequestUtility.WinterFlowUserManagerUserManager(this.WinterFlowSerializerStructure);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.WinterFlowVariableBandwidth)) {
            i3 = winterFlowRequestUtility.WinterFlowUserManagerUserManager(this.WinterFlowVariableBandwidth);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.WinterFlowBatchUI)) {
            int WinterFlowUserManagerUserManager = winterFlowRequestUtility.WinterFlowUserManagerUserManager(this.WinterFlowBatchUI);
            if (WinterFlowUserManagerUserManager < 0) {
                WinterFlowUserManagerUserManager = 0;
            }
            if (WinterFlowUserManagerUserManager > i2) {
                WinterFlowUserManagerUserManager = i2;
            }
            if (WinterFlowUserManagerUserManager != Integer.MAX_VALUE) {
                i4 = WinterFlowUserManagerUserManager;
            }
        }
        long WinterFlowRouterStructure2 = WinterFlowServiceOrchestration.WinterFlowRouterStructure(i3, i, i4, i2);
        if (this.WinterFlowMapperProtocol) {
            int WinterFlowResponseEngine2 = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
            int WinterFlowRouterRouter2 = WinterFlowHandlerConsumer.WinterFlowRouterRouter(j);
            int WinterFlowSyntax2 = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
            int WinterFlowUnitTestResponse2 = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
            int WinterFlowResponseEngine3 = WinterFlowHandlerConsumer.WinterFlowResponseEngine(WinterFlowRouterStructure2);
            if (WinterFlowResponseEngine3 < WinterFlowResponseEngine2) {
                WinterFlowResponseEngine3 = WinterFlowResponseEngine2;
            }
            if (WinterFlowResponseEngine3 > WinterFlowRouterRouter2) {
                WinterFlowResponseEngine3 = WinterFlowRouterRouter2;
            }
            int WinterFlowRouterRouter3 = WinterFlowHandlerConsumer.WinterFlowRouterRouter(WinterFlowRouterStructure2);
            if (WinterFlowRouterRouter3 >= WinterFlowResponseEngine2) {
                WinterFlowResponseEngine2 = WinterFlowRouterRouter3;
            }
            if (WinterFlowResponseEngine2 <= WinterFlowRouterRouter2) {
                WinterFlowRouterRouter2 = WinterFlowResponseEngine2;
            }
            int WinterFlowSyntax3 = WinterFlowHandlerConsumer.WinterFlowSyntax(WinterFlowRouterStructure2);
            if (WinterFlowSyntax3 < WinterFlowSyntax2) {
                WinterFlowSyntax3 = WinterFlowSyntax2;
            }
            if (WinterFlowSyntax3 > WinterFlowUnitTestResponse2) {
                WinterFlowSyntax3 = WinterFlowUnitTestResponse2;
            }
            int WinterFlowUnitTestResponse3 = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(WinterFlowRouterStructure2);
            if (WinterFlowUnitTestResponse3 >= WinterFlowSyntax2) {
                WinterFlowSyntax2 = WinterFlowUnitTestResponse3;
            }
            if (WinterFlowSyntax2 <= WinterFlowUnitTestResponse2) {
                WinterFlowUnitTestResponse2 = WinterFlowSyntax2;
            }
            WinterFlowRouterStructure = WinterFlowServiceOrchestration.WinterFlowRouterStructure(WinterFlowResponseEngine3, WinterFlowRouterRouter2, WinterFlowSyntax3, WinterFlowUnitTestResponse2);
        } else {
            if (Float.isNaN(this.WinterFlowVariableBandwidth)) {
                WinterFlowResponseEngine = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
                int WinterFlowRouterRouter4 = WinterFlowHandlerConsumer.WinterFlowRouterRouter(WinterFlowRouterStructure2);
                if (WinterFlowResponseEngine > WinterFlowRouterRouter4) {
                    WinterFlowResponseEngine = WinterFlowRouterRouter4;
                }
            } else {
                WinterFlowResponseEngine = WinterFlowHandlerConsumer.WinterFlowResponseEngine(WinterFlowRouterStructure2);
            }
            if (Float.isNaN(this.WinterFlowRouterAdapter)) {
                WinterFlowRouterRouter = WinterFlowHandlerConsumer.WinterFlowRouterRouter(j);
                int WinterFlowResponseEngine4 = WinterFlowHandlerConsumer.WinterFlowResponseEngine(WinterFlowRouterStructure2);
                if (WinterFlowRouterRouter < WinterFlowResponseEngine4) {
                    WinterFlowRouterRouter = WinterFlowResponseEngine4;
                }
            } else {
                WinterFlowRouterRouter = WinterFlowHandlerConsumer.WinterFlowRouterRouter(WinterFlowRouterStructure2);
            }
            if (Float.isNaN(this.WinterFlowBatchUI)) {
                WinterFlowSyntax = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
                int WinterFlowUnitTestResponse4 = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(WinterFlowRouterStructure2);
                if (WinterFlowSyntax > WinterFlowUnitTestResponse4) {
                    WinterFlowSyntax = WinterFlowUnitTestResponse4;
                }
            } else {
                WinterFlowSyntax = WinterFlowHandlerConsumer.WinterFlowSyntax(WinterFlowRouterStructure2);
            }
            if (Float.isNaN(this.WinterFlowSerializerStructure)) {
                WinterFlowUnitTestResponse = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
                int WinterFlowSyntax4 = WinterFlowHandlerConsumer.WinterFlowSyntax(WinterFlowRouterStructure2);
                if (WinterFlowUnitTestResponse < WinterFlowSyntax4) {
                    WinterFlowUnitTestResponse = WinterFlowSyntax4;
                }
            } else {
                WinterFlowUnitTestResponse = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(WinterFlowRouterStructure2);
            }
            WinterFlowRouterStructure = WinterFlowServiceOrchestration.WinterFlowRouterStructure(WinterFlowResponseEngine, WinterFlowRouterRouter, WinterFlowSyntax, WinterFlowUnitTestResponse);
        }
        WinterFlowViewTesting WinterFlowVariableVersionControl = winterFlowRuntimeVersion.WinterFlowVariableVersionControl(WinterFlowRouterStructure);
        return winterFlowRequestUtility.WinterFlowThreadListener(WinterFlowVariableVersionControl.WinterFlowVariableVersionControl, WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy, WinterFlowFrontendNode.WinterFlowVariableVersionControl, new WinterFlowResponseFrontend(WinterFlowVariableVersionControl, 2));
    }
}
