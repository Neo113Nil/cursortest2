package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowThreadPoolInterface extends WinterFlowDeserializationNetwork {
    public final WinterFlowBackendBatch WinterFlowCacheManagerAgent;
    public final WinterFlowRequestController WinterFlowHookDataSource;
    public final WinterFlowCloudPackage WinterFlowRouterStructure;

    public WinterFlowThreadPoolInterface(WinterFlowCloudPackage winterFlowCloudPackage, WinterFlowRequestController winterFlowRequestController, WinterFlowBackendBatch winterFlowBackendBatch) {
        this.WinterFlowRouterStructure = winterFlowCloudPackage;
        this.WinterFlowHookDataSource = winterFlowRequestController;
        this.WinterFlowCacheManagerAgent = winterFlowBackendBatch;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowNodeSingleton winterFlowNodeSingleton = new WinterFlowNodeSingleton();
        winterFlowNodeSingleton.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowNodeSingleton.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowNodeSingleton.WinterFlowRouterAdapter = this.WinterFlowCacheManagerAgent;
        return winterFlowNodeSingleton;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowNodeSingleton winterFlowNodeSingleton = (WinterFlowNodeSingleton) winterFlowUserManagerController;
        winterFlowNodeSingleton.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowNodeSingleton.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowNodeSingleton.WinterFlowRouterAdapter = this.WinterFlowCacheManagerAgent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowThreadPoolInterface)) {
            return false;
        }
        WinterFlowThreadPoolInterface winterFlowThreadPoolInterface = (WinterFlowThreadPoolInterface) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowThreadPoolInterface.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowThreadPoolInterface.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent == winterFlowThreadPoolInterface.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        return this.WinterFlowCacheManagerAgent.hashCode() + WinterFlowSingletonMapper.WinterFlowRouterStructure((this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31)) * 31, 31, false);
    }
}
