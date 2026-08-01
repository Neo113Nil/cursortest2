package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerStack extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowConcurrencyThread WinterFlowResponseEngine;
    public final /* synthetic */ float WinterFlowServerProtocol;
    public int WinterFlowSyntax;
    public final /* synthetic */ float WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowCompilerStack(WinterFlowConcurrencyThread winterFlowConcurrencyThread, float f, float f2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowConcurrencyThread;
        this.WinterFlowTransactionAgent = f;
        this.WinterFlowServerProtocol = f2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        return new WinterFlowCompilerStack(this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            this.WinterFlowSyntax = 1;
            Object WinterFlowRouterStructure = WinterFlowProcessorEntity.WinterFlowRouterStructure(this.WinterFlowResponseEngine.WinterFlowCacheTool, (Float.floatToRawIntBits(this.WinterFlowTransactionAgent) << 32) | (Float.floatToRawIntBits(this.WinterFlowServerProtocol) & 4294967295L), this);
            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            if (WinterFlowRouterStructure == winterFlowListenerJava) {
                return winterFlowListenerJava;
            }
        } else {
            if (i != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowCompilerStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
