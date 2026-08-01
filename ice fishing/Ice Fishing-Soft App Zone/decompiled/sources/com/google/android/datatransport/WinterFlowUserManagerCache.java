package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerCache {
    public final long WinterFlowRouterStructure;

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowUserManagerCache) {
            return this.WinterFlowRouterStructure == ((WinterFlowUserManagerCache) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        long j = this.WinterFlowRouterStructure;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) WinterFlowRequestScheduler.WinterFlowCacheManagerAgent(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) WinterFlowRequestScheduler.WinterFlowCacheManagerAgent(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
