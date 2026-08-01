package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStrategyBatch extends WinterFlowTestingAgent {
    public WinterFlowEventCloud WinterFlowHookDataSource;
    public long WinterFlowRouterStructure;

    @Override // com.google.android.datatransport.WinterFlowTestingAgent
    public final WinterFlowTransactionManagerLayer[] WinterFlowHookDataSource(WinterFlowWorkerSession winterFlowWorkerSession) {
        long j = this.WinterFlowRouterStructure;
        this.WinterFlowRouterStructure = -1L;
        this.WinterFlowHookDataSource = null;
        return ((WinterFlowCacheManagerNode) winterFlowWorkerSession).WinterFlowSerializerStructure(j);
    }

    @Override // com.google.android.datatransport.WinterFlowTestingAgent
    public final boolean WinterFlowRouterStructure(WinterFlowWorkerSession winterFlowWorkerSession) {
        WinterFlowCacheManagerNode winterFlowCacheManagerNode = (WinterFlowCacheManagerNode) winterFlowWorkerSession;
        if (this.WinterFlowRouterStructure >= 0) {
            return false;
        }
        long j = winterFlowCacheManagerNode.WinterFlowThreadListener;
        if (j < winterFlowCacheManagerNode.WinterFlowServiceUtility) {
            winterFlowCacheManagerNode.WinterFlowServiceUtility = j;
        }
        this.WinterFlowRouterStructure = j;
        return true;
    }
}
