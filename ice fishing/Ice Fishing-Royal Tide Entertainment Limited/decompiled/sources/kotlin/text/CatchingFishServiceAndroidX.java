package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishServiceAndroidX implements CatchingFishManifestGlide {
    public CatchingFishViewPagerJUnit CatchingFishCoroutine;
    public final CatchingFishAndroidXGson CatchingFishReduxKtor;
    public boolean CatchingFishParcelableFAB = false;
    public boolean CatchingFishSnackbar = false;

    public CatchingFishServiceAndroidX(CatchingFishAndroidXGson catchingFishAndroidXGson) {
        this.CatchingFishReduxKtor = catchingFishAndroidXGson;
    }

    @Override // kotlin.text.CatchingFishManifestGlide
    public final CatchingFishManifestGlide CatchingFishParcelableFAB(String str) {
        if (this.CatchingFishParcelableFAB) {
            throw new CatchingFishStripeAPIWidget("Cannot encode a second value in the ValueEncoderContext");
        }
        this.CatchingFishParcelableFAB = true;
        this.CatchingFishReduxKtor.CatchingFishSnackbar(this.CatchingFishCoroutine, str, this.CatchingFishSnackbar);
        return this;
    }

    @Override // kotlin.text.CatchingFishManifestGlide
    public final CatchingFishManifestGlide CatchingFishSnackbar(boolean z) {
        if (this.CatchingFishParcelableFAB) {
            throw new CatchingFishStripeAPIWidget("Cannot encode a second value in the ValueEncoderContext");
        }
        this.CatchingFishParcelableFAB = true;
        this.CatchingFishReduxKtor.CatchingFishParcelableFAB(this.CatchingFishCoroutine, z ? 1 : 0, this.CatchingFishSnackbar);
        return this;
    }
}
