package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDecoratorScript extends WinterFlowConfigurationResponse {
    public float WinterFlowCacheManagerAgent;
    public float WinterFlowHookDataSource;
    public float WinterFlowRouterStructure;

    public WinterFlowDecoratorScript(float f, float f2, float f3) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final void WinterFlowArrayNetwork() {
        this.WinterFlowRouterStructure = 0.0f;
        this.WinterFlowHookDataSource = 0.0f;
        this.WinterFlowCacheManagerAgent = 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final WinterFlowConfigurationResponse WinterFlowCacheManagerAgent() {
        return new WinterFlowDecoratorScript(0.0f, 0.0f, 0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final int WinterFlowHookDataSource() {
        return 3;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final float WinterFlowRouterStructure(int i) {
        if (i == 0) {
            return this.WinterFlowRouterStructure;
        }
        if (i == 1) {
            return this.WinterFlowHookDataSource;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final void WinterFlowVariableVersionControl(float f, int i) {
        if (i == 0) {
            this.WinterFlowRouterStructure = f;
        } else if (i == 1) {
            this.WinterFlowHookDataSource = f;
        } else {
            if (i != 2) {
                return;
            }
            this.WinterFlowCacheManagerAgent = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowDecoratorScript)) {
            return false;
        }
        WinterFlowDecoratorScript winterFlowDecoratorScript = (WinterFlowDecoratorScript) obj;
        return winterFlowDecoratorScript.WinterFlowRouterStructure == this.WinterFlowRouterStructure && winterFlowDecoratorScript.WinterFlowHookDataSource == this.WinterFlowHookDataSource && winterFlowDecoratorScript.WinterFlowCacheManagerAgent == this.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowCacheManagerAgent) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.WinterFlowRouterStructure + ", v2 = " + this.WinterFlowHookDataSource + ", v3 = " + this.WinterFlowCacheManagerAgent;
    }
}
