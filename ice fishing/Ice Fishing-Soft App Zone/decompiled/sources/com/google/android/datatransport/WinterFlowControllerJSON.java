package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerJSON {
    public double WinterFlowHookDataSource;
    public float WinterFlowRouterStructure;

    public final long WinterFlowRouterStructure(float f, float f2, long j) {
        float f3 = f - this.WinterFlowRouterStructure;
        double d = j / 1000.0d;
        double d2 = this.WinterFlowHookDataSource;
        double d3 = f3;
        double d4 = (d2 * d3) + f2;
        double d5 = (-d2) * d;
        double d6 = (d * d4) + d3;
        double exp = Math.exp(d5) * d6;
        double exp2 = (Math.exp(d5) * d4) + (Math.exp(d5) * d6 * (-this.WinterFlowHookDataSource));
        return (Float.floatToRawIntBits((float) exp2) & 4294967295L) | (Float.floatToRawIntBits((float) (exp + this.WinterFlowRouterStructure)) << 32);
    }
}
