package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetProtocol {
    public float WinterFlowRouterStructure = 0.0f;
    public float WinterFlowHookDataSource = 0.0f;
    public float WinterFlowCacheManagerAgent = 0.0f;
    public float WinterFlowArrayNetwork = 0.0f;

    public final void WinterFlowCacheManagerAgent(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.WinterFlowRouterStructure += intBitsToFloat;
        this.WinterFlowHookDataSource += intBitsToFloat2;
        this.WinterFlowCacheManagerAgent += intBitsToFloat;
        this.WinterFlowArrayNetwork += intBitsToFloat2;
    }

    public final boolean WinterFlowHookDataSource() {
        return (this.WinterFlowRouterStructure >= this.WinterFlowCacheManagerAgent) | (this.WinterFlowHookDataSource >= this.WinterFlowArrayNetwork);
    }

    public final void WinterFlowRouterStructure(float f, float f2, float f3, float f4) {
        this.WinterFlowRouterStructure = Math.max(f, this.WinterFlowRouterStructure);
        this.WinterFlowHookDataSource = Math.max(f2, this.WinterFlowHookDataSource);
        this.WinterFlowCacheManagerAgent = Math.min(f3, this.WinterFlowCacheManagerAgent);
        this.WinterFlowArrayNetwork = Math.min(f4, this.WinterFlowArrayNetwork);
    }

    public final String toString() {
        return "MutableRect(" + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowRouterStructure) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowHookDataSource) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowCacheManagerAgent) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowArrayNetwork) + ')';
    }
}
