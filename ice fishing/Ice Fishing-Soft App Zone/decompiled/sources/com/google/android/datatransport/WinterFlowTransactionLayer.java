package com.google.android.datatransport;

/* loaded from: classes.dex */
public final class WinterFlowTransactionLayer extends WinterFlowOrchestrationCompiler {
    public int WinterFlowResponseEngine;
    public WinterFlowEncryptionEngine WinterFlowRouterRouter;
    public Object WinterFlowServerProtocol;
    public /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ WinterFlowEncryptionEngine WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowTransactionLayer(WinterFlowEncryptionEngine winterFlowEncryptionEngine, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowEncryptionEngine;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowSyntax = obj;
        this.WinterFlowResponseEngine |= Integer.MIN_VALUE;
        return this.WinterFlowTransactionAgent.WinterFlowRouterRouter(null, this);
    }
}
