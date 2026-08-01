package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchRuntime extends WinterFlowOrchestrationCompiler {
    public final /* synthetic */ WinterFlowTransactionManagerService WinterFlowResponseEngine;
    public WinterFlowBandwidthInterface WinterFlowRouterRouter;
    public /* synthetic */ Object WinterFlowSyntax;
    public int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowBatchRuntime(WinterFlowTransactionManagerService winterFlowTransactionManagerService, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowResponseEngine = winterFlowTransactionManagerService;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowSyntax = obj;
        this.WinterFlowTransactionAgent |= Integer.MIN_VALUE;
        return this.WinterFlowResponseEngine.WinterFlowRouterStructure(0L, this);
    }
}
