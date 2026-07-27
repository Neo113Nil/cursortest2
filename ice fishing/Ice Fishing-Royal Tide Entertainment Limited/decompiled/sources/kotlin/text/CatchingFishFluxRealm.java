package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishFluxRealm extends AnimatorListenerAdapter implements CatchingFishRetrofitView {
    public final View CatchingFishCoroutine;
    public final /* synthetic */ CatchingFishLiveDataHilt CatchingFishDaggerWebsocket;
    public final ViewGroup CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor = true;
    public final View CatchingFishSnackbar;

    public CatchingFishFluxRealm(CatchingFishLiveDataHilt catchingFishLiveDataHilt, ViewGroup viewGroup, View view, View view2) {
        this.CatchingFishDaggerWebsocket = catchingFishLiveDataHilt;
        this.CatchingFishParcelableFAB = viewGroup;
        this.CatchingFishSnackbar = view;
        this.CatchingFishCoroutine = view2;
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishCoroutine(CatchingFishMockkRedux catchingFishMockkRedux) {
        catchingFishMockkRedux.CatchingFishParcelableFlux(this);
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishParcelableFAB(CatchingFishMockkRedux catchingFishMockkRedux) {
        if (this.CatchingFishReduxKtor) {
            CatchingFishViewModelScope();
        }
    }

    public final void CatchingFishViewModelScope() {
        this.CatchingFishCoroutine.setTag(R.id.save_overlay_view, null);
        this.CatchingFishParcelableFAB.getOverlay().remove(this.CatchingFishSnackbar);
        this.CatchingFishReduxKtor = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CatchingFishViewModelScope();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.CatchingFishParcelableFAB.getOverlay().remove(this.CatchingFishSnackbar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.CatchingFishSnackbar;
        if (view.getParent() == null) {
            this.CatchingFishParcelableFAB.getOverlay().add(view);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishCoroutine();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.CatchingFishCoroutine;
            View view2 = this.CatchingFishSnackbar;
            view.setTag(R.id.save_overlay_view, view2);
            this.CatchingFishParcelableFAB.getOverlay().add(view2);
            this.CatchingFishReduxKtor = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        CatchingFishViewModelScope();
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishReduxKtor() {
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishSnackbar() {
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishDaggerWebsocket(CatchingFishMockkRedux catchingFishMockkRedux) {
    }
}
