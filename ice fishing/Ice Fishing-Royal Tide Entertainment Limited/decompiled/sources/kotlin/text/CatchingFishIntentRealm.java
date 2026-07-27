package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishIntentRealm extends AnimatorListenerAdapter implements CatchingFishRetrofitView {
    public final View CatchingFishParcelableFAB;
    public boolean CatchingFishSnackbar = false;

    public CatchingFishIntentRealm(View view) {
        this.CatchingFishParcelableFAB = view;
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishReduxKtor() {
        this.CatchingFishParcelableFAB.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishSnackbar() {
        View view = this.CatchingFishParcelableFAB;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? CatchingFishMockkFragment.CatchingFishParcelableFAB.CatchingFishDaggerHiltFAB(view) : 0.0f));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        CatchingFishMockkFragment.CatchingFishParcelableFAB.CatchingFishHandler(this.CatchingFishParcelableFAB, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.CatchingFishParcelableFAB;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.CatchingFishSnackbar = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.CatchingFishSnackbar;
        View view = this.CatchingFishParcelableFAB;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        CatchingFishGlideMockkToast catchingFishGlideMockkToast = CatchingFishMockkFragment.CatchingFishParcelableFAB;
        catchingFishGlideMockkToast.CatchingFishHandler(view, 1.0f);
        catchingFishGlideMockkToast.getClass();
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishCoroutine(CatchingFishMockkRedux catchingFishMockkRedux) {
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishDaggerWebsocket(CatchingFishMockkRedux catchingFishMockkRedux) {
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishParcelableFAB(CatchingFishMockkRedux catchingFishMockkRedux) {
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishWorkManager(CatchingFishMockkRedux catchingFishMockkRedux) {
    }
}
