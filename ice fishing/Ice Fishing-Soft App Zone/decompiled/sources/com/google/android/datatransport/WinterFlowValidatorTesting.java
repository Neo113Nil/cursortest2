package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorTesting {
    public final long WinterFlowRouterStructure;

    public static String WinterFlowArrayNetwork(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, (int) (j & 4294967295L), ')');
    }

    public static final long WinterFlowCacheManagerAgent(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long WinterFlowHookDataSource(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final boolean WinterFlowRouterStructure(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowValidatorTesting) {
            return this.WinterFlowRouterStructure == ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
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
