package kotlin.text;

import android.animation.ValueAnimator;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishJUnitHilt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int CatchingFishParcelableFAB = 1;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishJUnitHilt(CatchingFishJUnitBundle catchingFishJUnitBundle) {
        this.CatchingFishSnackbar = catchingFishJUnitBundle;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishJUnitBundle catchingFishJUnitBundle = (CatchingFishJUnitBundle) this.CatchingFishSnackbar;
                catchingFishJUnitBundle.getClass();
                catchingFishJUnitBundle.CatchingFishReduxKtor.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((CatchingFishGraphQLFragment) ((CatchingFishEspressoPayPal) this.CatchingFishSnackbar).CatchingFishDaggerWebsocket).CatchingFishGsonAppCompat.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ CatchingFishJUnitHilt(CatchingFishEspressoPayPal catchingFishEspressoPayPal, View view) {
        this.CatchingFishSnackbar = catchingFishEspressoPayPal;
    }
}
