package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvokerConsumer {
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowInvokerConsumer(float f, float f2) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
    }

    public final long WinterFlowRouterStructure(long j, long j2, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;
        float f3 = this.WinterFlowRouterStructure;
        if (winterFlowCacheManagerConfiguration != winterFlowCacheManagerConfiguration2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.WinterFlowHookDataSource) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowInvokerConsumer)) {
            return false;
        }
        WinterFlowInvokerConsumer winterFlowInvokerConsumer = (WinterFlowInvokerConsumer) obj;
        return Float.compare(this.WinterFlowRouterStructure, winterFlowInvokerConsumer.WinterFlowRouterStructure) == 0 && Float.compare(this.WinterFlowHookDataSource, winterFlowInvokerConsumer.WinterFlowHookDataSource) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource) + (Float.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", verticalBias=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowHookDataSource, ')');
    }
}
