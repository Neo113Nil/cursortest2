package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerPayPal extends AnimatorListenerAdapter {
    public final /* synthetic */ Object CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB = 1;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public CatchingFishExoPlayerPayPal(View view, CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit) {
        this.CatchingFishSnackbar = catchingFishGoogleMapsJUnit;
        this.CatchingFishCoroutine = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishCameraXRetrofit) this.CatchingFishSnackbar).remove(animator);
                ((CatchingFishMockkRedux) this.CatchingFishCoroutine).CatchingFishRoomDatabase.remove(animator);
                break;
            default:
                CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit = (CatchingFishGoogleMapsJUnit) this.CatchingFishSnackbar;
                catchingFishGoogleMapsJUnit.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(1.0f);
                CatchingFishAdMobCameraXFAB.CatchingFishWorkManager((View) this.CatchingFishCoroutine, catchingFishGoogleMapsJUnit);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishMockkRedux) this.CatchingFishCoroutine).CatchingFishRoomDatabase.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public CatchingFishExoPlayerPayPal(CatchingFishMockkRedux catchingFishMockkRedux, CatchingFishCameraXRetrofit catchingFishCameraXRetrofit) {
        this.CatchingFishCoroutine = catchingFishMockkRedux;
        this.CatchingFishSnackbar = catchingFishCameraXRetrofit;
    }
}
