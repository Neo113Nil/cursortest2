package kotlin.text;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class CatchingFishGlideFABHilt {
    public final Interpolator CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final long CatchingFishReduxKtor;
    public float CatchingFishSnackbar;

    public CatchingFishGlideFABHilt(int i, Interpolator interpolator, long j) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishCoroutine = interpolator;
        this.CatchingFishReduxKtor = j;
    }

    public float CatchingFishCoroutine() {
        Interpolator interpolator = this.CatchingFishCoroutine;
        return interpolator != null ? interpolator.getInterpolation(this.CatchingFishSnackbar) : this.CatchingFishSnackbar;
    }

    public void CatchingFishDaggerWebsocket(float f) {
        this.CatchingFishSnackbar = f;
    }

    public float CatchingFishParcelableFAB() {
        return 1.0f;
    }

    public int CatchingFishReduxKtor() {
        return this.CatchingFishParcelableFAB;
    }

    public long CatchingFishSnackbar() {
        return this.CatchingFishReduxKtor;
    }
}
