package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowFunctionInterface extends WinterFlowDeserializationNetwork {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;
    public final boolean WinterFlowVariableVersionControl;

    public WinterFlowFunctionInterface(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowPipelineMiddleware winterFlowPipelineMiddleware = new WinterFlowPipelineMiddleware();
        winterFlowPipelineMiddleware.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowPipelineMiddleware.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowPipelineMiddleware.WinterFlowRouterAdapter = this.WinterFlowCacheManagerAgent;
        winterFlowPipelineMiddleware.WinterFlowSerializerStructure = this.WinterFlowArrayNetwork;
        winterFlowPipelineMiddleware.WinterFlowMapperProtocol = this.WinterFlowVariableVersionControl;
        return winterFlowPipelineMiddleware;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowPipelineMiddleware winterFlowPipelineMiddleware = (WinterFlowPipelineMiddleware) winterFlowUserManagerController;
        winterFlowPipelineMiddleware.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowPipelineMiddleware.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowPipelineMiddleware.WinterFlowRouterAdapter = this.WinterFlowCacheManagerAgent;
        winterFlowPipelineMiddleware.WinterFlowSerializerStructure = this.WinterFlowArrayNetwork;
        winterFlowPipelineMiddleware.WinterFlowMapperProtocol = this.WinterFlowVariableVersionControl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowFunctionInterface)) {
            return false;
        }
        WinterFlowFunctionInterface winterFlowFunctionInterface = (WinterFlowFunctionInterface) obj;
        return WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowRouterStructure, winterFlowFunctionInterface.WinterFlowRouterStructure) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowHookDataSource, winterFlowFunctionInterface.WinterFlowHookDataSource) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowCacheManagerAgent, winterFlowFunctionInterface.WinterFlowCacheManagerAgent) && WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowArrayNetwork, winterFlowFunctionInterface.WinterFlowArrayNetwork) && this.WinterFlowVariableVersionControl == winterFlowFunctionInterface.WinterFlowVariableVersionControl;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.WinterFlowVariableVersionControl) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31), 31), 31);
    }

    public WinterFlowFunctionInterface(float f, float f2, float f3, float f4) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
        this.WinterFlowArrayNetwork = f4;
        this.WinterFlowVariableVersionControl = true;
    }
}
