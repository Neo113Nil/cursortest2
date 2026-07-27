package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAdMobKtor {
    public float CatchingFishParcelableFAB = 0.0f;
    public float CatchingFishSnackbar = 0.0f;
    public float CatchingFishCoroutine = 0.0f;
    public float CatchingFishReduxKtor = 0.0f;

    public final void CatchingFishParcelableFAB(float f, float f2, float f3, float f4) {
        this.CatchingFishParcelableFAB = Math.max(f, this.CatchingFishParcelableFAB);
        this.CatchingFishSnackbar = Math.max(f2, this.CatchingFishSnackbar);
        this.CatchingFishCoroutine = Math.min(f3, this.CatchingFishCoroutine);
        this.CatchingFishReduxKtor = Math.min(f4, this.CatchingFishReduxKtor);
    }

    public final boolean CatchingFishSnackbar() {
        return (this.CatchingFishParcelableFAB >= this.CatchingFishCoroutine) | (this.CatchingFishSnackbar >= this.CatchingFishReduxKtor);
    }

    public final String toString() {
        return "MutableRect(" + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishParcelableFAB) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishSnackbar) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishCoroutine) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishReduxKtor) + ')';
    }
}
