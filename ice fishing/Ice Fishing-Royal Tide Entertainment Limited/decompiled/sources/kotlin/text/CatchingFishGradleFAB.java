package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGradleFAB {
    public static final CatchingFishGradleFAB CatchingFishCloudMessaging;
    public final float CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final float CatchingFishFragmentHandler;
    public final float CatchingFishLayout;
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishSnackbar;
    public final float CatchingFishViewModelFAB;
    public final float[] CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    static {
        float[] fArr = CatchingFishRobolectricHilt.CatchingFishViewModelScope;
        float CatchingFishMVVMAppCompat = (float) ((CatchingFishRobolectricHilt.CatchingFishMVVMAppCompat() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = CatchingFishRobolectricHilt.CatchingFishDaggerWebsocket;
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
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-CatchingFishMVVMAppCompat) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float f10 = 1.0f / ((5.0f * CatchingFishMVVMAppCompat) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(CatchingFishMVVMAppCompat * 5.0d))) + (f11 * CatchingFishMVVMAppCompat);
        float CatchingFishMVVMAppCompat2 = CatchingFishRobolectricHilt.CatchingFishMVVMAppCompat() / fArr[1];
        double d2 = CatchingFishMVVMAppCompat2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f13 = fArr6[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr6[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr6[2];
        float[] fArr7 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        CatchingFishCloudMessaging = new CatchingFishGradleFAB(CatchingFishMVVMAppCompat2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f9, 1.0f, new float[]{(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public CatchingFishGradleFAB(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.CatchingFishWorkManager = f;
        this.CatchingFishParcelableFAB = f2;
        this.CatchingFishSnackbar = f3;
        this.CatchingFishCoroutine = f4;
        this.CatchingFishReduxKtor = f5;
        this.CatchingFishDaggerWebsocket = f6;
        this.CatchingFishViewModelScope = fArr;
        this.CatchingFishViewModelFAB = f7;
        this.CatchingFishLayout = f8;
        this.CatchingFishFragmentHandler = f9;
    }
}
