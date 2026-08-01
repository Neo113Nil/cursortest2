package com.google.android.datatransport;

/* loaded from: classes.dex */
public final class WinterFlowQueryAdapter extends WinterFlowOrchestrationCompiler {
    public final /* synthetic */ WinterFlowResolverSyntax WinterFlowResponseEngine;
    public /* synthetic */ Object WinterFlowRouterRouter;
    public int WinterFlowSyntax;
    public WinterFlowEncryptionEngine WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowQueryAdapter(WinterFlowResolverSyntax winterFlowResolverSyntax, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowResolverSyntax;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowSyntax |= Integer.MIN_VALUE;
        return this.WinterFlowResponseEngine.WinterFlowRouterStructure(null, this);
    }
}
