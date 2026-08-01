package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudLayer extends WinterFlowOrchestrationCompiler {
    public WinterFlowXMLPlatform WinterFlowResponseEngine;
    public Object WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowServerProtocol;
    public WinterFlowStrategyResolver WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowCloudLayer(WinterFlowStrategyResolver winterFlowStrategyResolver, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowServerProtocol = winterFlowStrategyResolver;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowThreadListener |= Integer.MIN_VALUE;
        return this.WinterFlowServerProtocol.WinterFlowArrayNetwork(null, this);
    }
}
