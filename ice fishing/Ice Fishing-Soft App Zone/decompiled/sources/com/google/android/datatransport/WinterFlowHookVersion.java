package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHookVersion {
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowHookVersion(float f, float f2) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowHookVersion)) {
            return false;
        }
        WinterFlowHookVersion winterFlowHookVersion = (WinterFlowHookVersion) obj;
        return Float.compare(this.WinterFlowRouterStructure, winterFlowHookVersion.WinterFlowRouterStructure) == 0 && Float.compare(this.WinterFlowHookDataSource, winterFlowHookVersion.WinterFlowHookDataSource) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource) + (Float.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", velocityCoefficient=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowHookDataSource, ')');
    }
}
