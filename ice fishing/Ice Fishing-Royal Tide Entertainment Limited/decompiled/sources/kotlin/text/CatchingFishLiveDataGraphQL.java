package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataGraphQL extends AnimatorListenerAdapter {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishServiceCardView CatchingFishSnackbar;

    public /* synthetic */ CatchingFishLiveDataGraphQL(CatchingFishServiceCardView catchingFishServiceCardView, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = catchingFishServiceCardView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case 1:
                this.CatchingFishSnackbar.CatchingFishSnackbar.CatchingFishViewModelFAB(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishSnackbar.CatchingFishSnackbar.CatchingFishViewModelFAB(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
