package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorBatch {
    public final long WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowValidatorBatch(float f, float f2, long j) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowValidatorBatch)) {
            return false;
        }
        WinterFlowValidatorBatch winterFlowValidatorBatch = (WinterFlowValidatorBatch) obj;
        return Float.compare(this.WinterFlowRouterStructure, winterFlowValidatorBatch.WinterFlowRouterStructure) == 0 && Float.compare(this.WinterFlowHookDataSource, winterFlowValidatorBatch.WinterFlowHookDataSource) == 0 && this.WinterFlowCacheManagerAgent == winterFlowValidatorBatch.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowCacheManagerAgent) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.WinterFlowRouterStructure + ", distance=" + this.WinterFlowHookDataSource + ", duration=" + this.WinterFlowCacheManagerAgent + ')';
    }
}
