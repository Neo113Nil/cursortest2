package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventEmitterArray {
    public final boolean WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowEventEmitterArray(int i, int i2, boolean z) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowEventEmitterArray)) {
            return false;
        }
        WinterFlowEventEmitterArray winterFlowEventEmitterArray = (WinterFlowEventEmitterArray) obj;
        return this.WinterFlowRouterStructure == winterFlowEventEmitterArray.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowEventEmitterArray.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowEventEmitterArray.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.WinterFlowCacheManagerAgent) + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowHookDataSource, Integer.hashCode(this.WinterFlowRouterStructure) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.WinterFlowRouterStructure + ", end=" + this.WinterFlowHookDataSource + ", isRtl=" + this.WinterFlowCacheManagerAgent + ')';
    }
}
