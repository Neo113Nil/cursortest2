package ru.yandex.taxi.coordinator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/coordinator/BottomSheetBottomFloatButtonBehavior;", "Landroid/view/View;", "T", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BottomSheetBottomFloatButtonBehavior<T extends View> extends CoordinatorLayout.a {
    public boolean a = true;

    public BottomSheetBottomFloatButtonBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean b(View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        CoordinatorLayout.a behavior = layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() : null;
        return (behavior instanceof BottomSheetBehavior) || (behavior instanceof AnchorBottomSheetBehavior);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        CoordinatorLayout.a behavior = layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() : null;
        if (!(behavior instanceof BottomSheetBehavior) && !(behavior instanceof AnchorBottomSheetBehavior)) {
            return false;
        }
        u(behavior, view2, view);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        for (View view2 : coordinatorLayout.getDependencies(view)) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            CoordinatorLayout.a behavior = layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() : null;
            if ((behavior instanceof BottomSheetBehavior) || (behavior instanceof AnchorBottomSheetBehavior)) {
                u(behavior, view2, view);
            }
        }
        coordinatorLayout.onLayoutChild(view, i);
        return true;
    }

    public final void u(CoordinatorLayout.a aVar, View view, final View view2) {
        CoordinatorLayout.LayoutParams layoutParams;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = aVar instanceof AnchorBottomSheetBehavior ? (AnchorBottomSheetBehavior) aVar : null;
        boolean z = anchorBottomSheetBehavior == null ? view.getTop() == 0 : !(!anchorBottomSheetBehavior.S || anchorBottomSheetBehavior.z() < 1.0f);
        if (!z && this.a) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            layoutParams = layoutParams2 instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams2 : null;
            TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, (layoutParams != null ? layoutParams.anchorGravity : 8388691) == 8388691 ? -1.0f : 1.0f, 2, 0.0f, 2, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: ru.yandex.taxi.coordinator.BottomSheetBottomFloatButtonBehavior$slideOutAndGone$1$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    view2.setVisibility(8);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            view2.startAnimation(translateAnimation);
            this.a = false;
            return;
        }
        if (!z || this.a) {
            return;
        }
        view2.animate().cancel();
        view2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        layoutParams = layoutParams3 instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams3 : null;
        TranslateAnimation translateAnimation2 = new TranslateAnimation(2, (layoutParams != null ? layoutParams.anchorGravity : 8388691) == 8388691 ? -0.02f : 0.02f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation2.setDuration(500L);
        translateAnimation2.setInterpolator(new OvershootInterpolator());
        view2.startAnimation(translateAnimation2);
        this.a = true;
    }

    public BottomSheetBottomFloatButtonBehavior(Context context, AttributeSet attributeSet) {
    }
}
