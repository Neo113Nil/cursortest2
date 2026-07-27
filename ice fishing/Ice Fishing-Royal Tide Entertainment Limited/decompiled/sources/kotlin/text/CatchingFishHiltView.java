package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltView extends CatchingFishEspressoHilt {
    public static final float[] CatchingFishDaggerWebsocket;
    public static final float[] CatchingFishReduxKtor;
    public static final float[] CatchingFishViewModelScope;
    public static final float[] CatchingFishWorkManager;

    static {
        float[] CatchingFishEspressoMockk = CatchingFishLayoutRoomFAB.CatchingFishEspressoMockk(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, CatchingFishLayoutRoomFAB.CatchingFishRoomDatabase(CatchingFishOkHttpViewPager.CatchingFishCoroutine.CatchingFishSnackbar, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        CatchingFishReduxKtor = CatchingFishEspressoMockk;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        CatchingFishDaggerWebsocket = fArr;
        CatchingFishWorkManager = CatchingFishLayoutRoomFAB.CatchingFishFragmentFactory(CatchingFishEspressoMockk);
        CatchingFishViewModelScope = CatchingFishLayoutRoomFAB.CatchingFishFragmentFactory(fArr);
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final float CatchingFishDaggerWebsocket(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = CatchingFishViewModelScope;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = CatchingFishWorkManager;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final float CatchingFishParcelableFAB(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final long CatchingFishReduxKtor(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = CatchingFishViewModelScope;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f6 * f6 * f6;
        float f9 = f7 * f7 * f7;
        float[] fArr2 = CatchingFishWorkManager;
        float f10 = (fArr2[6] * f9) + (fArr2[3] * f8) + (fArr2[0] * f5 * f5 * f5);
        return (Float.floatToRawIntBits((fArr2[7] * f9) + (fArr2[4] * f8) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final float CatchingFishSnackbar(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final long CatchingFishWorkManager(float f, float f2, float f3, float f4, CatchingFishEspressoHilt catchingFishEspressoHilt) {
        float[] fArr = CatchingFishReduxKtor;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float CatchingFishCoroutineFlow = CatchingFishToastHiltBundle.CatchingFishCoroutineFlow(f5);
        float CatchingFishCoroutineFlow2 = CatchingFishToastHiltBundle.CatchingFishCoroutineFlow(f6);
        float CatchingFishCoroutineFlow3 = CatchingFishToastHiltBundle.CatchingFishCoroutineFlow(f7);
        float[] fArr2 = CatchingFishDaggerWebsocket;
        return CatchingFishFirebaseDagger.CatchingFishParcelableFAB((fArr2[6] * CatchingFishCoroutineFlow3) + (fArr2[3] * CatchingFishCoroutineFlow2) + (fArr2[0] * CatchingFishCoroutineFlow), (fArr2[7] * CatchingFishCoroutineFlow3) + (fArr2[4] * CatchingFishCoroutineFlow2) + (fArr2[1] * CatchingFishCoroutineFlow), (fArr2[8] * CatchingFishCoroutineFlow3) + (fArr2[5] * CatchingFishCoroutineFlow2) + (fArr2[2] * CatchingFishCoroutineFlow), f4, catchingFishEspressoHilt);
    }
}
