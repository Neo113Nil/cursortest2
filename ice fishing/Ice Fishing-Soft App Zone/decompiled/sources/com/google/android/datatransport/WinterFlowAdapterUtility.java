package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterUtility {
    public final boolean WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowAdapterUtility(long j, long j2, boolean z) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
        this.WinterFlowCacheManagerAgent = z;
    }

    public final WinterFlowAdapterUtility WinterFlowRouterStructure(WinterFlowAdapterUtility winterFlowAdapterUtility) {
        return new WinterFlowAdapterUtility(WinterFlowHandlerResolver.WinterFlowVariableVersionControl(this.WinterFlowRouterStructure, winterFlowAdapterUtility.WinterFlowRouterStructure), Math.max(this.WinterFlowHookDataSource, winterFlowAdapterUtility.WinterFlowHookDataSource), this.WinterFlowCacheManagerAgent || winterFlowAdapterUtility.WinterFlowCacheManagerAgent);
    }
}
