package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModulePipeline extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ long WinterFlowResponseEngine;
    public /* synthetic */ Object WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowModulePipeline(long j, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = j;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowModulePipeline winterFlowModulePipeline = new WinterFlowModulePipeline(this.WinterFlowResponseEngine, winterFlowTransactionManagerLayer);
        winterFlowModulePipeline.WinterFlowSyntax = obj;
        return winterFlowModulePipeline;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowTransactionManagerService winterFlowTransactionManagerService = ((WinterFlowRendererClass) this.WinterFlowSyntax).WinterFlowRouterStructure;
        winterFlowTransactionManagerService.WinterFlowCacheManagerAgent(winterFlowTransactionManagerService.WinterFlowTransactionAgent, this.WinterFlowResponseEngine, 1);
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        WinterFlowModulePipeline winterFlowModulePipeline = (WinterFlowModulePipeline) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRendererClass) obj);
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        winterFlowModulePipeline.WinterFlowServiceUtility(winterFlowAlgorithmSession);
        return winterFlowAlgorithmSession;
    }
}
