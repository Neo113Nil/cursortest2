package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStrategyNetwork extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowCloudFramework WinterFlowResponseEngine;
    public final /* synthetic */ boolean WinterFlowServerProtocol;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowThreadListener;
    public final /* synthetic */ boolean WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowStrategyNetwork(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowObjectSession winterFlowObjectSession, WinterFlowCloudFramework winterFlowCloudFramework, boolean z, boolean z2) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowCloudFramework;
        this.WinterFlowTransactionAgent = z;
        this.WinterFlowServerProtocol = z2;
        this.WinterFlowThreadListener = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        return new WinterFlowStrategyNetwork(winterFlowTransactionManagerLayer, this.WinterFlowThreadListener, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        if (i != 0) {
            if (i == 1) {
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                return obj;
            }
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowThreadListener;
        WinterFlowCloudFramework winterFlowCloudFramework = this.WinterFlowResponseEngine;
        boolean z = this.WinterFlowServerProtocol;
        boolean z2 = this.WinterFlowTransactionAgent;
        WinterFlowTransactionRouter winterFlowTransactionRouter = new WinterFlowTransactionRouter(null, winterFlowObjectSession, winterFlowCloudFramework, z, z2);
        this.WinterFlowSyntax = 1;
        Object WinterFlowResponseEngine = winterFlowCloudFramework.WinterFlowResponseEngine(z2, winterFlowTransactionRouter, this);
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        return WinterFlowResponseEngine == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowResponseEngine;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowStrategyNetwork) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
