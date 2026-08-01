package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeploymentFrontend extends WinterFlowOrchestrationCompiler {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public String WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public WinterFlowObjectSession WinterFlowSyntax;
    public final /* synthetic */ WinterFlowHookPlatform WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowDeploymentFrontend(WinterFlowHookPlatform winterFlowHookPlatform, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowTransactionAgent = winterFlowHookPlatform;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowResponseEngine = obj;
        this.WinterFlowServerProtocol |= Integer.MIN_VALUE;
        return this.WinterFlowTransactionAgent.WinterFlowRouterStructure(null, null, this);
    }
}
