package kotlin.text;

import android.graphics.RectF;

/* loaded from: classes.dex */
public final class CatchingFishMockkAndroidX extends CatchingFishSpannableAdMob {
    public final CatchingFishMoshiRealm CatchingFishParcelableFAB;

    public CatchingFishMockkAndroidX(CatchingFishMoshiRealm catchingFishMoshiRealm) {
        this.CatchingFishParcelableFAB = catchingFishMoshiRealm;
    }

    @Override // kotlin.text.CatchingFishSpannableAdMob
    public final CatchingFishFluxExoPlayer CatchingFishParcelableFAB() {
        CatchingFishMoshiRealm catchingFishMoshiRealm = this.CatchingFishParcelableFAB;
        if (catchingFishMoshiRealm.CatchingFishSnackbar == null) {
            catchingFishMoshiRealm.CatchingFishSnackbar = new RectF();
        }
        RectF rectF = catchingFishMoshiRealm.CatchingFishSnackbar;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(rectF);
        catchingFishMoshiRealm.CatchingFishParcelableFAB.computeBounds(rectF, true);
        return new CatchingFishFluxExoPlayer(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
