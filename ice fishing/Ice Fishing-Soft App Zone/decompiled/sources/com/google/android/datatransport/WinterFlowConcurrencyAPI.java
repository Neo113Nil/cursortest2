package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyAPI extends WinterFlowOrchestrationCompiler {
    public boolean WinterFlowResponseEngine;
    public WinterFlowCachePlatform WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowCachePlatform WinterFlowServerProtocol;
    public WinterFlowVersionNetwork WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowConcurrencyAPI(WinterFlowCachePlatform winterFlowCachePlatform, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowServerProtocol = winterFlowCachePlatform;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowThreadListener |= Integer.MIN_VALUE;
        return this.WinterFlowServerProtocol.WinterFlowRouterStructure(null, this);
    }
}
