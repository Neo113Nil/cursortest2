package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishToastPicasso extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean CatchingFishCoroutine;
    public final /* synthetic */ CatchingFishOkHttpPayPal CatchingFishDaggerWebsocket;
    public final /* synthetic */ ViewGroup CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishMVPDatabinding CatchingFishReduxKtor;
    public final /* synthetic */ View CatchingFishSnackbar;

    public CatchingFishToastPicasso(ViewGroup viewGroup, View view, boolean z, CatchingFishMVPDatabinding catchingFishMVPDatabinding, CatchingFishOkHttpPayPal catchingFishOkHttpPayPal) {
        this.CatchingFishParcelableFAB = viewGroup;
        this.CatchingFishSnackbar = view;
        this.CatchingFishCoroutine = z;
        this.CatchingFishReduxKtor = catchingFishMVPDatabinding;
        this.CatchingFishDaggerWebsocket = catchingFishOkHttpPayPal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.CatchingFishParcelableFAB;
        View view = this.CatchingFishSnackbar;
        viewGroup.endViewTransition(view);
        boolean z = this.CatchingFishCoroutine;
        CatchingFishMVPDatabinding catchingFishMVPDatabinding = this.CatchingFishReduxKtor;
        if (z) {
            CatchingFishMVPLiveData.CatchingFishParcelableFAB(view, catchingFishMVPDatabinding.CatchingFishParcelableFAB);
        }
        this.CatchingFishDaggerWebsocket.CatchingFishCoroutine();
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            Objects.toString(catchingFishMVPDatabinding);
        }
    }
}
