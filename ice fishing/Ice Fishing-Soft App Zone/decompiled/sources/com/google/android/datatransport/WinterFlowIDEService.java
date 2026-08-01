package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEService {
    public static final WinterFlowIDEService WinterFlowTransactionAgent;
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final float WinterFlowResponseEngine;
    public final float WinterFlowRouterRouter;
    public final float WinterFlowRouterStructure;
    public final float WinterFlowSyntax;
    public final float WinterFlowTransactionManagerStrategy;
    public final float[] WinterFlowUnitTestResponse;
    public final float WinterFlowVariableVersionControl;

    static {
        float[] fArr = WinterFlowCacheRuntime.WinterFlowVariableVersionControl;
        float pow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = WinterFlowCacheRuntime.WinterFlowCacheManagerAgent;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float exp = (1.0f - (((float) Math.exp(((-pow) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float f9 = 1.0f / ((5.0f * pow) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(pow * 5.0d))) + (f10 * pow);
        float pow2 = ((float) (Math.pow(0.5689655172413793d, 3.0d) * 100.0d)) / fArr[1];
        double d2 = pow2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow3 = 0.725f / ((float) Math.pow(d2, 0.20000000298023224d));
        float[] fArr6 = {(float) Math.pow(((r7[0] * cbrt) * f6) / 100.0f, 0.41999998688697815d), (float) Math.pow(((r7[1] * cbrt) * f7) / 100.0f, 0.41999998688697815d), (float) Math.pow(((r7[2] * cbrt) * f8) / 100.0f, 0.41999998688697815d)};
        float f12 = fArr6[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr6[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr6[2];
        float[] fArr7 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        WinterFlowTransactionAgent = new WinterFlowIDEService(pow2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow3, pow3, pow3, 0.69000006f, 1.0f, new float[]{(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public WinterFlowIDEService(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
        this.WinterFlowCacheManagerAgent = f3;
        this.WinterFlowArrayNetwork = f4;
        this.WinterFlowVariableVersionControl = f5;
        this.WinterFlowTransactionManagerStrategy = f6;
        this.WinterFlowUnitTestResponse = fArr;
        this.WinterFlowRouterRouter = f7;
        this.WinterFlowSyntax = f8;
        this.WinterFlowResponseEngine = f9;
    }
}
