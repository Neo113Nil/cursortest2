package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingSyntax extends WinterFlowConfigurationResponse {
    public float WinterFlowHookDataSource;
    public float WinterFlowRouterStructure;

    public WinterFlowTestingSyntax(float f, float f2) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final void WinterFlowArrayNetwork() {
        this.WinterFlowRouterStructure = 0.0f;
        this.WinterFlowHookDataSource = 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final WinterFlowConfigurationResponse WinterFlowCacheManagerAgent() {
        return new WinterFlowTestingSyntax(0.0f, 0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final int WinterFlowHookDataSource() {
        return 2;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final float WinterFlowRouterStructure(int i) {
        if (i == 0) {
            return this.WinterFlowRouterStructure;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final void WinterFlowVariableVersionControl(float f, int i) {
        if (i == 0) {
            this.WinterFlowRouterStructure = f;
        } else {
            if (i != 1) {
                return;
            }
            this.WinterFlowHookDataSource = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowTestingSyntax)) {
            return false;
        }
        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
        return winterFlowTestingSyntax.WinterFlowRouterStructure == this.WinterFlowRouterStructure && winterFlowTestingSyntax.WinterFlowHookDataSource == this.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource) + (Float.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.WinterFlowRouterStructure + ", v2 = " + this.WinterFlowHookDataSource;
    }
}
