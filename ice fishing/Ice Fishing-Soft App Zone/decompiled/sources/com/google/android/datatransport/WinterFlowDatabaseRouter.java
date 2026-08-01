package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowDatabaseRouter extends WinterFlowDeserializationNetwork {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowDatabaseRouter(float f, float f2, float f3, float f4) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
        this.WinterFlowArrayNetwork = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            WinterFlowThreadQueue.WinterFlowRouterStructure("Padding must be non-negative");
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowCacheVersion winterFlowCacheVersion = new WinterFlowCacheVersion();
        winterFlowCacheVersion.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowCacheVersion.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowCacheVersion.WinterFlowRouterAdapter = this.WinterFlowCacheManagerAgent;
        winterFlowCacheVersion.WinterFlowSerializerStructure = this.WinterFlowArrayNetwork;
        winterFlowCacheVersion.WinterFlowMapperProtocol = true;
        return winterFlowCacheVersion;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowCacheVersion winterFlowCacheVersion = (WinterFlowCacheVersion) winterFlowUserManagerController;
        winterFlowCacheVersion.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowCacheVersion.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowCacheVersion.WinterFlowRouterAdapter = this.WinterFlowCacheManagerAgent;
        winterFlowCacheVersion.WinterFlowSerializerStructure = this.WinterFlowArrayNetwork;
        winterFlowCacheVersion.WinterFlowMapperProtocol = true;
    }

    public final boolean equals(Object obj) {
        WinterFlowDatabaseRouter winterFlowDatabaseRouter = obj instanceof WinterFlowDatabaseRouter ? (WinterFlowDatabaseRouter) obj : null;
        return winterFlowDatabaseRouter != null && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowRouterStructure, winterFlowDatabaseRouter.WinterFlowRouterStructure) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowHookDataSource, winterFlowDatabaseRouter.WinterFlowHookDataSource) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowCacheManagerAgent, winterFlowDatabaseRouter.WinterFlowCacheManagerAgent) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowArrayNetwork, winterFlowDatabaseRouter.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31), 31), 31);
    }
}
