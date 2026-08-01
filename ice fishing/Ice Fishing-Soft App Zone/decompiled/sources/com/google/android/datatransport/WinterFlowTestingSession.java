package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingSession extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ boolean WinterFlowResponseEngine;
    public final /* synthetic */ long WinterFlowServerProtocol;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowRouterLayer WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowTestingSession(boolean z, WinterFlowRouterLayer winterFlowRouterLayer, long j, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = z;
        this.WinterFlowTransactionAgent = winterFlowRouterLayer;
        this.WinterFlowServerProtocol = j;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        return new WinterFlowTestingSession(this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            WinterFlowDebugEvent winterFlowDebugEvent = this.WinterFlowTransactionAgent.WinterFlowVariableVersionControl;
            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            if (this.WinterFlowResponseEngine) {
                this.WinterFlowSyntax = 2;
                Object WinterFlowRouterStructure = winterFlowDebugEvent.WinterFlowRouterStructure(this.WinterFlowServerProtocol, 0L, this);
                if (WinterFlowRouterStructure != winterFlowListenerJava) {
                    obj = WinterFlowRouterStructure;
                    long j = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
                }
            } else {
                this.WinterFlowSyntax = 1;
                Object WinterFlowRouterStructure2 = winterFlowDebugEvent.WinterFlowRouterStructure(0L, this.WinterFlowServerProtocol, this);
                if (WinterFlowRouterStructure2 != winterFlowListenerJava) {
                    obj = WinterFlowRouterStructure2;
                    long j2 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
                }
            }
            return winterFlowListenerJava;
        }
        if (i == 1) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            long j22 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
        } else {
            if (i != 2) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            long j3 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowTestingSession) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
