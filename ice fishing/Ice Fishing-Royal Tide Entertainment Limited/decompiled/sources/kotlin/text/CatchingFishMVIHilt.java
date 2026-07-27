package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishMVIHilt implements Animation.AnimationListener {
    public final /* synthetic */ View CatchingFishCoroutine;
    public final /* synthetic */ CatchingFishMVPDatabinding CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishOkHttpPayPal CatchingFishReduxKtor;
    public final /* synthetic */ ViewGroup CatchingFishSnackbar;

    public CatchingFishMVIHilt(CatchingFishMVPDatabinding catchingFishMVPDatabinding, ViewGroup viewGroup, View view, CatchingFishOkHttpPayPal catchingFishOkHttpPayPal) {
        this.CatchingFishParcelableFAB = catchingFishMVPDatabinding;
        this.CatchingFishSnackbar = viewGroup;
        this.CatchingFishCoroutine = view;
        this.CatchingFishReduxKtor = catchingFishOkHttpPayPal;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.CatchingFishSnackbar.post(new CatchingFishGsonRealm(5, this));
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            Objects.toString(this.CatchingFishParcelableFAB);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            Objects.toString(this.CatchingFishParcelableFAB);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
