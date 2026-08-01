package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationPlatform {
    public final long WinterFlowRouterStructure;
    public static final WinterFlowInheritanceValidator[] WinterFlowHookDataSource = {new WinterFlowInheritanceValidator(0), new WinterFlowInheritanceValidator(4294967296L), new WinterFlowInheritanceValidator(8589934592L)};
    public static final long WinterFlowCacheManagerAgent = WinterFlowDecoratorUI.WinterFlowMapperProtocol(0, Float.NaN);

    public static String WinterFlowArrayNetwork(long j) {
        long WinterFlowHookDataSource2 = WinterFlowHookDataSource(j);
        if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource2, 0L)) {
            return "Unspecified";
        }
        if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource2, 4294967296L)) {
            return WinterFlowCacheManagerAgent(j) + ".sp";
        }
        if (!WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource2, 8589934592L)) {
            return "Invalid";
        }
        return WinterFlowCacheManagerAgent(j) + ".em";
    }

    public static final float WinterFlowCacheManagerAgent(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long WinterFlowHookDataSource(long j) {
        return WinterFlowHookDataSource[(int) ((j & 1095216660480L) >>> 32)].WinterFlowRouterStructure;
    }

    public static final boolean WinterFlowRouterStructure(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowOrchestrationPlatform) {
            return this.WinterFlowRouterStructure == ((WinterFlowOrchestrationPlatform) obj).WinterFlowRouterStructure;
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
