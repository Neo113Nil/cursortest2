package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheService implements WinterFlowSingletonProcess {
    public final long WinterFlowArrayNetwork;
    public final long WinterFlowCacheManagerAgent;
    public final WinterFlowObjectNode WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowCacheService(int i, int i2, WinterFlowObjectNode winterFlowObjectNode) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = winterFlowObjectNode;
        this.WinterFlowCacheManagerAgent = i * 1000000;
        this.WinterFlowArrayNetwork = i2 * 1000000;
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonProcess
    public final long WinterFlowArrayNetwork(float f, float f2, float f3) {
        return this.WinterFlowArrayNetwork + this.WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonProcess
    public final float WinterFlowCacheManagerAgent(long j, float f, float f2, float f3) {
        long j2 = j - this.WinterFlowArrayNetwork;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.WinterFlowCacheManagerAgent;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (WinterFlowHookDataSource(j4, f, f2, f3) - WinterFlowHookDataSource(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonProcess
    public final float WinterFlowHookDataSource(long j, float f, float f2, float f3) {
        long j2 = j - this.WinterFlowArrayNetwork;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.WinterFlowCacheManagerAgent;
        if (j2 > j3) {
            j2 = j3;
        }
        float WinterFlowRouterStructure = this.WinterFlowHookDataSource.WinterFlowRouterStructure(this.WinterFlowRouterStructure == 0 ? 1.0f : j2 / j3);
        return (f2 * WinterFlowRouterStructure) + ((1.0f - WinterFlowRouterStructure) * f);
    }
}
