package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceNode {
    public long WinterFlowHookDataSource;
    public WinterFlowBackendBatch WinterFlowRouterStructure;

    public WinterFlowDataSourceNode(long j, WinterFlowBackendBatch winterFlowBackendBatch) {
        this.WinterFlowRouterStructure = winterFlowBackendBatch;
        this.WinterFlowHookDataSource = j;
    }

    public final float WinterFlowHookDataSource(long j) {
        return Float.intBitsToFloat((int) (this.WinterFlowRouterStructure == WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy ? j >> 32 : j & 4294967295L));
    }

    public final long WinterFlowRouterStructure(long j, float f, boolean z) {
        long WinterFlowVariableVersionControl;
        long j2 = this.WinterFlowHookDataSource;
        if (z) {
            WinterFlowVariableVersionControl = WinterFlowHandlerResolver.WinterFlowVariableVersionControl(j2, j);
            this.WinterFlowHookDataSource = WinterFlowVariableVersionControl;
        } else {
            WinterFlowVariableVersionControl = WinterFlowHandlerResolver.WinterFlowVariableVersionControl(j2, j);
        }
        if ((this.WinterFlowRouterStructure == null ? WinterFlowHandlerResolver.WinterFlowCacheManagerAgent(WinterFlowVariableVersionControl) : Math.abs(WinterFlowHookDataSource(WinterFlowVariableVersionControl))) < f) {
            return 9205357640488583168L;
        }
        WinterFlowBackendBatch winterFlowBackendBatch = this.WinterFlowRouterStructure;
        long j3 = this.WinterFlowHookDataSource;
        if (winterFlowBackendBatch == null) {
            float WinterFlowCacheManagerAgent = WinterFlowHandlerResolver.WinterFlowCacheManagerAgent(j3);
            return WinterFlowHandlerResolver.WinterFlowArrayNetwork(this.WinterFlowHookDataSource, WinterFlowHandlerResolver.WinterFlowTransactionManagerStrategy((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / WinterFlowCacheManagerAgent) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / WinterFlowCacheManagerAgent) & 4294967295L), f));
        }
        float WinterFlowHookDataSource = WinterFlowHookDataSource(j3) - (Math.signum(WinterFlowHookDataSource(this.WinterFlowHookDataSource)) * f);
        long j4 = this.WinterFlowHookDataSource;
        WinterFlowBackendBatch winterFlowBackendBatch2 = this.WinterFlowRouterStructure;
        WinterFlowBackendBatch winterFlowBackendBatch3 = WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy;
        float intBitsToFloat = Float.intBitsToFloat((int) (winterFlowBackendBatch2 == winterFlowBackendBatch3 ? j4 & 4294967295L : j4 >> 32));
        if (this.WinterFlowRouterStructure == winterFlowBackendBatch3) {
            return (Float.floatToRawIntBits(WinterFlowHookDataSource) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public WinterFlowDataSourceNode(WinterFlowBackendBatch winterFlowBackendBatch) {
        this(0L, winterFlowBackendBatch);
    }
}
