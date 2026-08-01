package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableProtocol extends WinterFlowOrchestrationCompiler {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public WinterFlowExceptionListener WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public WinterFlowNodeInheritance WinterFlowSyntax;
    public final /* synthetic */ WinterFlowNetworkSession WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowVariableProtocol(WinterFlowNetworkSession winterFlowNetworkSession, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowTransactionAgent = winterFlowNetworkSession;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowResponseEngine = obj;
        this.WinterFlowServerProtocol |= Integer.MIN_VALUE;
        return this.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(null, null, this);
    }
}
