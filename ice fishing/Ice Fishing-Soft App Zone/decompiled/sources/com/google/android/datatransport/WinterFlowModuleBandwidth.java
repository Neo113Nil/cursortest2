package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleBandwidth {
    public final long WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowModuleBandwidth(long j) {
        this.WinterFlowRouterStructure = j;
    }

    public static String WinterFlowArrayNetwork(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(Float.intBitsToFloat((int) (j >> 32))) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final boolean WinterFlowCacheManagerAgent(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static final float WinterFlowHookDataSource(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final boolean WinterFlowRouterStructure(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowModuleBandwidth) {
            return this.WinterFlowRouterStructure == ((WinterFlowModuleBandwidth) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowArrayNetwork(this.WinterFlowRouterStructure);
    }
}
