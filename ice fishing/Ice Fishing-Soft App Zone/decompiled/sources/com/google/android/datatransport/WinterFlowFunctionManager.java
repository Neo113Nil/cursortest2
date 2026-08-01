package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionManager implements WinterFlowThreadSystem {
    public final /* synthetic */ int WinterFlowCacheManagerAgent;
    public final /* synthetic */ WinterFlowBandwidthCache WinterFlowHookDataSource;
    public final /* synthetic */ WinterFlowNodeSingleton WinterFlowRouterStructure;

    public WinterFlowFunctionManager(WinterFlowNodeSingleton winterFlowNodeSingleton, WinterFlowBandwidthCache winterFlowBandwidthCache, int i) {
        this.WinterFlowRouterStructure = winterFlowNodeSingleton;
        this.WinterFlowHookDataSource = winterFlowBandwidthCache;
        this.WinterFlowCacheManagerAgent = i;
    }

    @Override // com.google.android.datatransport.WinterFlowThreadSystem
    public final boolean WinterFlowRouterStructure() {
        return this.WinterFlowRouterStructure.WinterFlowValidatorNetwork((WinterFlowTransactionManagerUtility) this.WinterFlowHookDataSource.WinterFlowVariableVersionControl, this.WinterFlowCacheManagerAgent);
    }
}
