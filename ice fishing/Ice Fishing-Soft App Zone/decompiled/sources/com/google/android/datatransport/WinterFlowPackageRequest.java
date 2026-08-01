package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPackageRequest extends WinterFlowOrchestrationCompiler {
    public final /* synthetic */ WinterFlowValidatorParser WinterFlowResponseEngine;
    public int[] WinterFlowRouterRouter;
    public /* synthetic */ Object WinterFlowSyntax;
    public int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowPackageRequest(WinterFlowValidatorParser winterFlowValidatorParser, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowValidatorParser;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowSyntax = obj;
        this.WinterFlowTransactionAgent |= Integer.MIN_VALUE;
        return this.WinterFlowResponseEngine.WinterFlowRouterStructure(null, this);
    }
}
