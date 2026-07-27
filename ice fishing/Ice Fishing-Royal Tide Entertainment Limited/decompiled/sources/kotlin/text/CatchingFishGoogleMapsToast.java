package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishGoogleMapsToast extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewPropertyAnimator CatchingFishCoroutine;
    public final /* synthetic */ CatchingFishGsonUnitTesting CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ View CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishMVPGradle CatchingFishSnackbar;

    public /* synthetic */ CatchingFishGoogleMapsToast(CatchingFishGsonUnitTesting catchingFishGsonUnitTesting, CatchingFishMVPGradle catchingFishMVPGradle, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishDaggerWebsocket = catchingFishGsonUnitTesting;
        this.CatchingFishSnackbar = catchingFishMVPGradle;
        this.CatchingFishCoroutine = viewPropertyAnimator;
        this.CatchingFishReduxKtor = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishCoroutine.setListener(null);
                View view = this.CatchingFishReduxKtor;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                CatchingFishMVPGradle catchingFishMVPGradle = this.CatchingFishSnackbar;
                CatchingFishPayPalCardView catchingFishPayPalCardView = catchingFishMVPGradle.CatchingFishParcelableFAB;
                CatchingFishGsonUnitTesting catchingFishGsonUnitTesting = this.CatchingFishDaggerWebsocket;
                catchingFishGsonUnitTesting.CatchingFishCoroutine(catchingFishPayPalCardView);
                catchingFishGsonUnitTesting.CatchingFishNavigation.remove(catchingFishMVPGradle.CatchingFishParcelableFAB);
                catchingFishGsonUnitTesting.CatchingFishLayout();
                break;
            default:
                this.CatchingFishCoroutine.setListener(null);
                View view2 = this.CatchingFishReduxKtor;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                CatchingFishMVPGradle catchingFishMVPGradle2 = this.CatchingFishSnackbar;
                CatchingFishPayPalCardView catchingFishPayPalCardView2 = catchingFishMVPGradle2.CatchingFishSnackbar;
                CatchingFishGsonUnitTesting catchingFishGsonUnitTesting2 = this.CatchingFishDaggerWebsocket;
                catchingFishGsonUnitTesting2.CatchingFishCoroutine(catchingFishPayPalCardView2);
                catchingFishGsonUnitTesting2.CatchingFishNavigation.remove(catchingFishMVPGradle2.CatchingFishSnackbar);
                catchingFishGsonUnitTesting2.CatchingFishLayout();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishPayPalCardView catchingFishPayPalCardView = this.CatchingFishSnackbar.CatchingFishParcelableFAB;
                this.CatchingFishDaggerWebsocket.getClass();
                break;
            default:
                CatchingFishPayPalCardView catchingFishPayPalCardView2 = this.CatchingFishSnackbar.CatchingFishSnackbar;
                this.CatchingFishDaggerWebsocket.getClass();
                break;
        }
    }
}
