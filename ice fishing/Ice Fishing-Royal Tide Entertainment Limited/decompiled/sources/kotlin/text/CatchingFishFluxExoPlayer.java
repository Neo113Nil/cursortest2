package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxExoPlayer {
    public static final CatchingFishFluxExoPlayer CatchingFishDaggerWebsocket = new CatchingFishFluxExoPlayer(0.0f, 0.0f, 0.0f, 0.0f);
    public final float CatchingFishCoroutine;
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishSnackbar;

    public CatchingFishFluxExoPlayer(float f, float f2, float f3, float f4) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = f2;
        this.CatchingFishCoroutine = f3;
        this.CatchingFishReduxKtor = f4;
    }

    public final long CatchingFishParcelableFAB() {
        float f = this.CatchingFishCoroutine;
        float f2 = this.CatchingFishParcelableFAB;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.CatchingFishReduxKtor;
        float f5 = this.CatchingFishSnackbar;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final CatchingFishFluxExoPlayer CatchingFishSnackbar(float f, float f2) {
        return new CatchingFishFluxExoPlayer(this.CatchingFishParcelableFAB + f, this.CatchingFishSnackbar + f2, this.CatchingFishCoroutine + f, this.CatchingFishReduxKtor + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFluxExoPlayer)) {
            return false;
        }
        CatchingFishFluxExoPlayer catchingFishFluxExoPlayer = (CatchingFishFluxExoPlayer) obj;
        return Float.compare(this.CatchingFishParcelableFAB, catchingFishFluxExoPlayer.CatchingFishParcelableFAB) == 0 && Float.compare(this.CatchingFishSnackbar, catchingFishFluxExoPlayer.CatchingFishSnackbar) == 0 && Float.compare(this.CatchingFishCoroutine, catchingFishFluxExoPlayer.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishFluxExoPlayer.CatchingFishReduxKtor) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishReduxKtor) + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishCoroutine, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishSnackbar, Float.hashCode(this.CatchingFishParcelableFAB) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishParcelableFAB) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishSnackbar) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishCoroutine) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishReduxKtor) + ')';
    }
}
