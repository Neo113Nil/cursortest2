package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionParser {
    public static final WinterFlowVersionParser WinterFlowVariableVersionControl = new WinterFlowVersionParser(0.0f, 0.0f, 0.0f, 0.0f);
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowVersionParser(float f, float f2, float f3, float f4) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
        this.WinterFlowArrayNetwork = f4;
    }

    public final WinterFlowVersionParser WinterFlowArrayNetwork(float f, float f2) {
        return new WinterFlowVersionParser(this.WinterFlowRouterStructure + f, this.WinterFlowHookDataSource + f2, this.WinterFlowCacheManagerAgent + f, this.WinterFlowArrayNetwork + f2);
    }

    public final WinterFlowVersionParser WinterFlowCacheManagerAgent(WinterFlowVersionParser winterFlowVersionParser) {
        return new WinterFlowVersionParser(Math.max(this.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowRouterStructure), Math.max(this.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowHookDataSource), Math.min(this.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowCacheManagerAgent), Math.min(this.WinterFlowArrayNetwork, winterFlowVersionParser.WinterFlowArrayNetwork));
    }

    public final long WinterFlowHookDataSource() {
        float f = this.WinterFlowCacheManagerAgent - this.WinterFlowRouterStructure;
        float f2 = this.WinterFlowArrayNetwork - this.WinterFlowHookDataSource;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long WinterFlowRouterStructure() {
        float f = this.WinterFlowCacheManagerAgent;
        float f2 = this.WinterFlowRouterStructure;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.WinterFlowArrayNetwork;
        float f5 = this.WinterFlowHookDataSource;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final WinterFlowVersionParser WinterFlowVariableVersionControl(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new WinterFlowVersionParser(Float.intBitsToFloat(i) + this.WinterFlowRouterStructure, Float.intBitsToFloat(i2) + this.WinterFlowHookDataSource, Float.intBitsToFloat(i) + this.WinterFlowCacheManagerAgent, Float.intBitsToFloat(i2) + this.WinterFlowArrayNetwork);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowVersionParser)) {
            return false;
        }
        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
        return Float.compare(this.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowRouterStructure) == 0 && Float.compare(this.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowHookDataSource) == 0 && Float.compare(this.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowCacheManagerAgent) == 0 && Float.compare(this.WinterFlowArrayNetwork, winterFlowVersionParser.WinterFlowArrayNetwork) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowArrayNetwork) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowRouterStructure) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowHookDataSource) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowCacheManagerAgent) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(this.WinterFlowArrayNetwork) + ')';
    }
}
