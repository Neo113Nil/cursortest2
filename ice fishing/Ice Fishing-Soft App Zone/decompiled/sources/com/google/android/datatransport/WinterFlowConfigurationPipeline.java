package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationPipeline {
    public final float WinterFlowRouterStructure;

    public WinterFlowConfigurationPipeline(float f) {
        this.WinterFlowRouterStructure = f;
    }

    public final int WinterFlowRouterStructure(int i, int i2, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        float f = (i2 - i) / 2.0f;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;
        float f2 = this.WinterFlowRouterStructure;
        if (winterFlowCacheManagerConfiguration != winterFlowCacheManagerConfiguration2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowConfigurationPipeline) && Float.compare(this.WinterFlowRouterStructure, ((WinterFlowConfigurationPipeline) obj).WinterFlowRouterStructure) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(new StringBuilder("Horizontal(bias="), this.WinterFlowRouterStructure, ')');
    }
}
