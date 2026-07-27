package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class CatchingFishMVPLifecycle extends AnimatorListenerAdapter implements CatchingFishRetrofitView {
    public final ViewGroup CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public final View CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;
    public boolean CatchingFishWorkManager = false;
    public final boolean CatchingFishReduxKtor = true;

    public CatchingFishMVPLifecycle(View view, int i) {
        this.CatchingFishParcelableFAB = view;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = (ViewGroup) view.getParent();
        CatchingFishViewModelScope(true);
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishCoroutine(CatchingFishMockkRedux catchingFishMockkRedux) {
        catchingFishMockkRedux.CatchingFishParcelableFlux(this);
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishReduxKtor() {
        CatchingFishViewModelScope(true);
        if (this.CatchingFishWorkManager) {
            return;
        }
        CatchingFishMockkFragment.CatchingFishSnackbar(this.CatchingFishParcelableFAB, 0);
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishSnackbar() {
        CatchingFishViewModelScope(false);
        if (this.CatchingFishWorkManager) {
            return;
        }
        CatchingFishMockkFragment.CatchingFishSnackbar(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar);
    }

    public final void CatchingFishViewModelScope(boolean z) {
        ViewGroup viewGroup;
        if (!this.CatchingFishReduxKtor || this.CatchingFishDaggerWebsocket == z || (viewGroup = this.CatchingFishCoroutine) == null) {
            return;
        }
        this.CatchingFishDaggerWebsocket = z;
        CatchingFishKtorViewModel.CatchingFishPayPal(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.CatchingFishWorkManager = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.CatchingFishWorkManager) {
            CatchingFishMockkFragment.CatchingFishSnackbar(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar);
            ViewGroup viewGroup = this.CatchingFishCoroutine;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        CatchingFishViewModelScope(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            CatchingFishMockkFragment.CatchingFishSnackbar(this.CatchingFishParcelableFAB, 0);
            ViewGroup viewGroup = this.CatchingFishCoroutine;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.CatchingFishWorkManager) {
            CatchingFishMockkFragment.CatchingFishSnackbar(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar);
            ViewGroup viewGroup = this.CatchingFishCoroutine;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        CatchingFishViewModelScope(false);
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishDaggerWebsocket(CatchingFishMockkRedux catchingFishMockkRedux) {
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishParcelableFAB(CatchingFishMockkRedux catchingFishMockkRedux) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
