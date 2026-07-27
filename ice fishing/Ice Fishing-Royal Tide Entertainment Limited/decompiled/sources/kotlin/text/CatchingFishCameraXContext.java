package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishCameraXContext {
    public CatchingFishFluxFirebase CatchingFishParcelableFAB;
    public float CatchingFishSnackbar = 1.0f;
    public CatchingFishGradleMVPKtor CatchingFishCoroutine = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;

    public abstract long CatchingFishCoroutine();

    public abstract void CatchingFishParcelableFAB(float f);

    public abstract void CatchingFishReduxKtor(CatchingFishDaggerHiltJUnit catchingFishDaggerHiltJUnit);

    public final void CatchingFishSnackbar(CatchingFishDaggerHiltJUnit catchingFishDaggerHiltJUnit, long j, float f) {
        CatchingFishEspressoMoshi catchingFishEspressoMoshi = catchingFishDaggerHiltJUnit.CatchingFishReduxKtor;
        if (this.CatchingFishSnackbar != f) {
            CatchingFishParcelableFAB(f);
            this.CatchingFishSnackbar = f;
        }
        CatchingFishGradleMVPKtor layoutDirection = catchingFishDaggerHiltJUnit.getLayoutDirection();
        if (this.CatchingFishCoroutine != layoutDirection) {
            this.CatchingFishCoroutine = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (catchingFishEspressoMoshi.CatchingFishNavigation() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (catchingFishEspressoMoshi.CatchingFishNavigation() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((CatchingFishServiceHilt) catchingFishEspressoMoshi.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    CatchingFishReduxKtor(catchingFishDaggerHiltJUnit);
                }
            } finally {
                ((CatchingFishServiceHilt) catchingFishEspressoMoshi.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }
}
