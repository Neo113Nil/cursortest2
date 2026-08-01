package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewConfiguration extends WinterFlowOrchestrationCompiler {
    public int WinterFlowResponseEngine;
    public /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowEncryptionEngine WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowViewConfiguration(WinterFlowEncryptionEngine winterFlowEncryptionEngine, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = winterFlowEncryptionEngine;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowResponseEngine |= Integer.MIN_VALUE;
        return this.WinterFlowSyntax.WinterFlowRouterRouter(null, this);
    }
}
