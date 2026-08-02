package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
/* loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior {
    public AccessibilityManager accessibilityManager;
    public ViewPropertyAnimator currentAnimator;
    public int enterAnimDuration;
    public TimeInterpolator enterAnimInterpolator;
    public int exitAnimDuration;
    public TimeInterpolator exitAnimInterpolator;
    public HideViewOnScrollBehavior$$ExternalSyntheticLambda0 touchExplorationListener;
    public final LinkedHashSet onScrollStateChangedListeners = new LinkedHashSet();
    public int height = 0;
    public final boolean disableOnTouchExploration = true;
    public int currentState = 2;
    public int additionalHiddenOffsetY = 0;
    public int savedImportantForAccessibility = 0;
    public int savedVisibility = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.height = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(view.getContext(), R.attr.motionDurationLong2, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(view.getContext(), R.attr.motionDurationMedium4, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || this.touchExplorationListener != null) {
            return false;
        }
        HideViewOnScrollBehavior$$ExternalSyntheticLambda0 hideViewOnScrollBehavior$$ExternalSyntheticLambda0 = new HideViewOnScrollBehavior$$ExternalSyntheticLambda0(this, view, 1);
        this.touchExplorationListener = hideViewOnScrollBehavior$$ExternalSyntheticLambda0;
        accessibilityManager.addTouchExplorationStateChangeListener(hideViewOnScrollBehavior$$ExternalSyntheticLambda0);
        view.addOnAttachStateChangeListener(new StandardMenuPopup.AnonymousClass2(this, 3));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                slideUp(view);
            }
        } else {
            if (this.currentState == 1) {
                return;
            }
            if (this.disableOnTouchExploration && (accessibilityManager = this.accessibilityManager) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            updateCurrentState(view, 1);
            this.currentAnimator = view.animate().translationY(this.height + this.additionalHiddenOffsetY).setInterpolator(this.exitAnimInterpolator).setDuration(this.exitAnimDuration).setListener(new Transition.AnonymousClass2(this, view, false, 3));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void slideUp(View view) {
        if (this.currentState == 2) {
            return;
        }
        updateCurrentState(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.currentAnimator = view.animate().translationY(RecyclerView.DECELERATION_RATE).setInterpolator(this.enterAnimInterpolator).setDuration(this.enterAnimDuration).setListener(new Transition.AnonymousClass2(this, view, false, 3));
    }

    public final void updateCurrentState(View view, int i) {
        this.currentState = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.savedImportantForAccessibility = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.savedVisibility = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.savedImportantForAccessibility);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.savedVisibility);
            }
        }
        Iterator it = this.onScrollStateChangedListeners.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
