package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.Transition;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;

/* loaded from: classes3.dex */
public final class rbb0 extends xmh {
    public final /* synthetic */ PfmFragment a;
    public final /* synthetic */ ldb0 b;

    public rbb0(PfmFragment pfmFragment, ldb0 ldb0Var) {
        this.a = pfmFragment;
        this.b = ldb0Var;
    }

    @Override // defpackage.xmh, androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        onTransitionEnd(transition);
    }

    @Override // defpackage.xmh, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ldb0 ldb0Var;
        PfmFragment pfmFragment = this.a;
        if (pfmFragment.getIsFragmentViewDestroyed() || (ldb0Var = this.b) == null) {
            return;
        }
        if (ldb0Var.e.b) {
            PfmFragment.access$getBinding(pfmFragment).f.setVisibility(4);
            PfmFragment.access$getBinding(pfmFragment).h.setVisibility(8);
        }
        FrameLayout frameLayout = PfmFragment.access$getBinding(pfmFragment).d;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = -2;
        frameLayout.setLayoutParams(layoutParams);
        PfmFragment.access$getBinding(pfmFragment).l.setVisibility(ldb0Var.a != null ? 0 : 8);
    }
}
