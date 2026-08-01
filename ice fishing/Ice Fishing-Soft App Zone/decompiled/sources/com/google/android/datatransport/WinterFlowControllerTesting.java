package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerTesting extends WinterFlowOrchestrationCompiler {
    public Object WinterFlowResponseEngine;
    public WinterFlowCachePlatform WinterFlowRouterRouter;
    public /* synthetic */ Object WinterFlowServerProtocol;
    public int WinterFlowServiceUtility;
    public Object WinterFlowSyntax;
    public final /* synthetic */ WinterFlowCachePlatform WinterFlowThreadListener;
    public WinterFlowNodeView WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowControllerTesting(WinterFlowCachePlatform winterFlowCachePlatform, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowThreadListener = winterFlowCachePlatform;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowServerProtocol = obj;
        this.WinterFlowServiceUtility |= Integer.MIN_VALUE;
        return this.WinterFlowThreadListener.WinterFlowHookDataSource(null, this);
    }
}
