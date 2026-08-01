package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventEmitterValidator extends WinterFlowOrchestrationInvoker {
    public long WinterFlowCacheManagerAgent;

    public WinterFlowEventEmitterValidator(long j, long j2) {
        super(j);
        this.WinterFlowCacheManagerAgent = j2;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationInvoker
    public final WinterFlowOrchestrationInvoker WinterFlowHookDataSource(long j) {
        return new WinterFlowEventEmitterValidator(j, this.WinterFlowCacheManagerAgent);
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationInvoker
    public final void WinterFlowRouterStructure(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        winterFlowOrchestrationInvoker.getClass();
        this.WinterFlowCacheManagerAgent = ((WinterFlowEventEmitterValidator) winterFlowOrchestrationInvoker).WinterFlowCacheManagerAgent;
    }
}
