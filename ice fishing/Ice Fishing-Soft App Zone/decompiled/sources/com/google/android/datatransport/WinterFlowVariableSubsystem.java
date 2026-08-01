package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableSubsystem extends WinterFlowConfigurationResponse {
    public float WinterFlowRouterStructure;

    public WinterFlowVariableSubsystem(float f) {
        this.WinterFlowRouterStructure = f;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final void WinterFlowArrayNetwork() {
        this.WinterFlowRouterStructure = 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final WinterFlowConfigurationResponse WinterFlowCacheManagerAgent() {
        return new WinterFlowVariableSubsystem(0.0f);
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final int WinterFlowHookDataSource() {
        return 1;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final float WinterFlowRouterStructure(int i) {
        if (i == 0) {
            return this.WinterFlowRouterStructure;
        }
        return 0.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationResponse
    public final void WinterFlowVariableVersionControl(float f, int i) {
        if (i == 0) {
            this.WinterFlowRouterStructure = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WinterFlowVariableSubsystem) && ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure == this.WinterFlowRouterStructure;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.WinterFlowRouterStructure;
    }
}
