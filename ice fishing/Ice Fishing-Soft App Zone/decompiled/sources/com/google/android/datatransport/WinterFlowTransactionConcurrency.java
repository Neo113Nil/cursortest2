package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionConcurrency extends WinterFlowOrchestrationCompiler {
    public WinterFlowStrategyBatch WinterFlowResponseEngine;
    public WinterFlowCacheManagerNode WinterFlowRouterRouter;
    public /* synthetic */ Object WinterFlowServerProtocol;
    public int WinterFlowServiceUtility;
    public WinterFlowCacheInterface WinterFlowSyntax;
    public final /* synthetic */ WinterFlowCacheManagerNode WinterFlowThreadListener;
    public WinterFlowConsumerBandwidth WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowTransactionConcurrency(WinterFlowCacheManagerNode winterFlowCacheManagerNode, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowThreadListener = winterFlowCacheManagerNode;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowServerProtocol = obj;
        this.WinterFlowServiceUtility |= Integer.MIN_VALUE;
        WinterFlowCacheManagerNode.WinterFlowTransactionAgent(this.WinterFlowThreadListener, null, this);
        return WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }
}
