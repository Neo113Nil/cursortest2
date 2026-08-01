package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderSubsystem {
    public static final /* synthetic */ int WinterFlowCacheManagerAgent = 0;
    public static final long WinterFlowHookDataSource = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
    public final long WinterFlowRouterStructure;

    public static String WinterFlowHookDataSource(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public static final boolean WinterFlowRouterStructure(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowServiceProviderSubsystem) {
            return this.WinterFlowRouterStructure == ((WinterFlowServiceProviderSubsystem) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowHookDataSource(this.WinterFlowRouterStructure);
    }
}
