package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class CatchingFishFluxAsyncTask extends AnimatorListenerAdapter {
    public final /* synthetic */ View CatchingFishCoroutine;
    public final /* synthetic */ ViewPropertyAnimator CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishPayPalCardView CatchingFishParcelableFAB;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ int CatchingFishSnackbar;
    public final /* synthetic */ CatchingFishGsonUnitTesting CatchingFishWorkManager;

    public CatchingFishFluxAsyncTask(CatchingFishGsonUnitTesting catchingFishGsonUnitTesting, CatchingFishPayPalCardView catchingFishPayPalCardView, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.CatchingFishWorkManager = catchingFishGsonUnitTesting;
        this.CatchingFishParcelableFAB = catchingFishPayPalCardView;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = view;
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishDaggerWebsocket = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.CatchingFishSnackbar;
        View view = this.CatchingFishCoroutine;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.CatchingFishReduxKtor != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.CatchingFishDaggerWebsocket.setListener(null);
        CatchingFishGsonUnitTesting catchingFishGsonUnitTesting = this.CatchingFishWorkManager;
        CatchingFishPayPalCardView catchingFishPayPalCardView = this.CatchingFishParcelableFAB;
        catchingFishGsonUnitTesting.CatchingFishCoroutine(catchingFishPayPalCardView);
        catchingFishGsonUnitTesting.CatchingFishStateLiveData.remove(catchingFishPayPalCardView);
        catchingFishGsonUnitTesting.CatchingFishLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.CatchingFishWorkManager.getClass();
    }
}
