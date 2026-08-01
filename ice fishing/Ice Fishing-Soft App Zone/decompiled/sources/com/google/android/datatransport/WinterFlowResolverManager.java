package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverManager extends WinterFlowOrchestrationInvoker {
    public int WinterFlowCacheManagerAgent;

    public WinterFlowResolverManager(int i, long j) {
        super(j);
        this.WinterFlowCacheManagerAgent = i;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationInvoker
    public final WinterFlowOrchestrationInvoker WinterFlowHookDataSource(long j) {
        return new WinterFlowResolverManager(this.WinterFlowCacheManagerAgent, j);
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationInvoker
    public final void WinterFlowRouterStructure(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        winterFlowOrchestrationInvoker.getClass();
        this.WinterFlowCacheManagerAgent = ((WinterFlowResolverManager) winterFlowOrchestrationInvoker).WinterFlowCacheManagerAgent;
    }
}
