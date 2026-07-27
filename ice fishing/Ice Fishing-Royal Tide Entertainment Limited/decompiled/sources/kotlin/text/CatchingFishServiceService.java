package kotlin.text;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class CatchingFishServiceService extends CatchingFishGlideFABHilt {
    public final WindowInsetsAnimation CatchingFishDaggerWebsocket;

    public CatchingFishServiceService(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.CatchingFishDaggerWebsocket = windowInsetsAnimation;
    }

    @Override // kotlin.text.CatchingFishGlideFABHilt
    public final float CatchingFishCoroutine() {
        float interpolatedFraction;
        interpolatedFraction = this.CatchingFishDaggerWebsocket.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // kotlin.text.CatchingFishGlideFABHilt
    public final void CatchingFishDaggerWebsocket(float f) {
        this.CatchingFishDaggerWebsocket.setFraction(f);
    }

    @Override // kotlin.text.CatchingFishGlideFABHilt
    public final float CatchingFishParcelableFAB() {
        float alpha;
        alpha = this.CatchingFishDaggerWebsocket.getAlpha();
        return alpha;
    }

    @Override // kotlin.text.CatchingFishGlideFABHilt
    public final int CatchingFishReduxKtor() {
        int typeMask;
        typeMask = this.CatchingFishDaggerWebsocket.getTypeMask();
        return typeMask;
    }

    @Override // kotlin.text.CatchingFishGlideFABHilt
    public final long CatchingFishSnackbar() {
        long durationMillis;
        durationMillis = this.CatchingFishDaggerWebsocket.getDurationMillis();
        return durationMillis;
    }
}
