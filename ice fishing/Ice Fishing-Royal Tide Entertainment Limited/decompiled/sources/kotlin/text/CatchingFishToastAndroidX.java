package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishToastAndroidX extends AnimatorListenerAdapter {
    public final /* synthetic */ View CatchingFishCoroutine;
    public final /* synthetic */ CatchingFishGsonUnitTesting CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishParcelableFAB = 1;
    public final /* synthetic */ ViewPropertyAnimator CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishPayPalCardView CatchingFishSnackbar;

    public CatchingFishToastAndroidX(CatchingFishGsonUnitTesting catchingFishGsonUnitTesting, CatchingFishPayPalCardView catchingFishPayPalCardView, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.CatchingFishDaggerWebsocket = catchingFishGsonUnitTesting;
        this.CatchingFishSnackbar = catchingFishPayPalCardView;
        this.CatchingFishReduxKtor = viewPropertyAnimator;
        this.CatchingFishCoroutine = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case 1:
                this.CatchingFishCoroutine.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishReduxKtor.setListener(null);
                this.CatchingFishCoroutine.setAlpha(1.0f);
                CatchingFishGsonUnitTesting catchingFishGsonUnitTesting = this.CatchingFishDaggerWebsocket;
                CatchingFishPayPalCardView catchingFishPayPalCardView = this.CatchingFishSnackbar;
                catchingFishGsonUnitTesting.CatchingFishCoroutine(catchingFishPayPalCardView);
                catchingFishGsonUnitTesting.CatchingFishRoomDatabase.remove(catchingFishPayPalCardView);
                catchingFishGsonUnitTesting.CatchingFishLayout();
                break;
            default:
                this.CatchingFishReduxKtor.setListener(null);
                CatchingFishGsonUnitTesting catchingFishGsonUnitTesting2 = this.CatchingFishDaggerWebsocket;
                CatchingFishPayPalCardView catchingFishPayPalCardView2 = this.CatchingFishSnackbar;
                catchingFishGsonUnitTesting2.CatchingFishCoroutine(catchingFishPayPalCardView2);
                catchingFishGsonUnitTesting2.CatchingFishAnimationMockk.remove(catchingFishPayPalCardView2);
                catchingFishGsonUnitTesting2.CatchingFishLayout();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.getClass();
                break;
            default:
                this.CatchingFishDaggerWebsocket.getClass();
                break;
        }
    }

    public CatchingFishToastAndroidX(CatchingFishGsonUnitTesting catchingFishGsonUnitTesting, CatchingFishPayPalCardView catchingFishPayPalCardView, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.CatchingFishDaggerWebsocket = catchingFishGsonUnitTesting;
        this.CatchingFishSnackbar = catchingFishPayPalCardView;
        this.CatchingFishCoroutine = view;
        this.CatchingFishReduxKtor = viewPropertyAnimator;
    }
}
