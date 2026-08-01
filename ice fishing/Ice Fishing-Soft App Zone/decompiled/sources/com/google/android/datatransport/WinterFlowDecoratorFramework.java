package com.google.android.datatransport;

/* loaded from: classes.dex */
public final class WinterFlowDecoratorFramework extends WinterFlowOrchestrationCompiler {
    public final /* synthetic */ WinterFlowExceptionIDE WinterFlowResponseEngine;
    public /* synthetic */ Object WinterFlowRouterRouter;
    public WinterFlowCacheInterface WinterFlowServerProtocol;
    public int WinterFlowSyntax;
    public Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowDecoratorFramework(WinterFlowExceptionIDE winterFlowExceptionIDE, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowExceptionIDE;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowSyntax |= Integer.MIN_VALUE;
        return this.WinterFlowResponseEngine.WinterFlowRouterStructure(null, this);
    }
}
