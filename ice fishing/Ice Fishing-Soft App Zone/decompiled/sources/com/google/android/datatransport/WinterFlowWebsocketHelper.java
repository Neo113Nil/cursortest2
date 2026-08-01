package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWebsocketHelper extends WinterFlowConfigurationResponse {
    public float WinterFlowArrayNetwork;
    public float WinterFlowCacheManagerAgent;
    public float WinterFlowHookDataSource;
    public float WinterFlowRouterStructure;

    public WinterFlowWebsocketHelper(float f, float f2, float f3, float f4) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
        this.WinterFlowArrayNetwork = f4;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final void WinterFlowArrayNetwork() {
        this.WinterFlowRouterStructure = 0.0f;
        this.WinterFlowHookDataSource = 0.0f;
        this.WinterFlowCacheManagerAgent = 0.0f;
        this.WinterFlowArrayNetwork = 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final WinterFlowConfigurationResponse WinterFlowCacheManagerAgent() {
        return new WinterFlowWebsocketHelper(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final int WinterFlowHookDataSource() {
        return 4;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final float WinterFlowRouterStructure(int i) {
        if (i == 0) {
            return this.WinterFlowRouterStructure;
        }
        if (i == 1) {
            return this.WinterFlowHookDataSource;
        }
        if (i == 2) {
            return this.WinterFlowCacheManagerAgent;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.WinterFlowArrayNetwork;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final void WinterFlowVariableVersionControl(float f, int i) {
        if (i == 0) {
            this.WinterFlowRouterStructure = f;
            return;
        }
        if (i == 1) {
            this.WinterFlowHookDataSource = f;
        } else if (i == 2) {
            this.WinterFlowCacheManagerAgent = f;
        } else {
            if (i != 3) {
                return;
            }
            this.WinterFlowArrayNetwork = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowWebsocketHelper)) {
            return false;
        }
        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
        return winterFlowWebsocketHelper.WinterFlowRouterStructure == this.WinterFlowRouterStructure && winterFlowWebsocketHelper.WinterFlowHookDataSource == this.WinterFlowHookDataSource && winterFlowWebsocketHelper.WinterFlowCacheManagerAgent == this.WinterFlowCacheManagerAgent && winterFlowWebsocketHelper.WinterFlowArrayNetwork == this.WinterFlowArrayNetwork;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowArrayNetwork) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.WinterFlowRouterStructure + ", v2 = " + this.WinterFlowHookDataSource + ", v3 = " + this.WinterFlowCacheManagerAgent + ", v4 = " + this.WinterFlowArrayNetwork;
    }
}
