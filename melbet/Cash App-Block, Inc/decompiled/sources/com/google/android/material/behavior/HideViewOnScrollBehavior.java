package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior {
    public AccessibilityManager accessibilityManager;
    public ViewPropertyAnimator currentAnimator;
    public int enterAnimDuration;
    public TimeInterpolator enterAnimInterpolator;
    public int exitAnimDuration;
    public TimeInterpolator exitAnimInterpolator;
    public HideLeftViewOnScrollDelegate hideOnScrollViewDelegate;
    public HideViewOnScrollBehavior$$ExternalSyntheticLambda0 touchExplorationListener;
    public final LinkedHashSet onScrollStateChangedListeners = new LinkedHashSet();
    public int size = 0;
    public int currentState = 2;
    public int savedImportantForAccessibility = 0;
    public int savedVisibility = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredWidth;
        int i2;
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && this.touchExplorationListener == null) {
            HideViewOnScrollBehavior$$ExternalSyntheticLambda0 hideViewOnScrollBehavior$$ExternalSyntheticLambda0 = new HideViewOnScrollBehavior$$ExternalSyntheticLambda0(this, view, 0);
            this.touchExplorationListener = hideViewOnScrollBehavior$$ExternalSyntheticLambda0;
            accessibilityManager.addTouchExplorationStateChangeListener(hideViewOnScrollBehavior$$ExternalSyntheticLambda0);
            view.addOnAttachStateChangeListener(new StandardMenuPopup.AnonymousClass2(this, 4));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity;
        if (i3 == 80 || i3 == 81) {
            setViewEdgeInternal(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            setViewEdgeInternal((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.hideOnScrollViewDelegate.$r8$classId) {
            case 0:
                measuredWidth = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            case 1:
                measuredWidth = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            default:
                measuredWidth = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.size = measuredWidth + i2;
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(view.getContext(), R.attr.motionDurationLong2, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(view.getContext(), R.attr.motionDurationMedium4, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                slideIn(view);
                return;
            }
            return;
        }
        if (this.currentState == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            updateCurrentState$1(view, 1);
            this.currentAnimator = this.hideOnScrollViewDelegate.getViewTranslationAnimator(view, this.size).setInterpolator(this.exitAnimInterpolator).setDuration(this.exitAnimDuration).setListener(new Transition.AnonymousClass2(this, view, false, 4));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void setViewEdgeInternal(int i) {
        int i2;
        HideLeftViewOnScrollDelegate hideLeftViewOnScrollDelegate = this.hideOnScrollViewDelegate;
        if (hideLeftViewOnScrollDelegate != null) {
            switch (hideLeftViewOnScrollDelegate.$r8$classId) {
                case 0:
                    i2 = 2;
                    break;
                case 1:
                    i2 = 1;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i == 0) {
            this.hideOnScrollViewDelegate = new HideLeftViewOnScrollDelegate(2);
            return;
        }
        if (i == 1) {
            this.hideOnScrollViewDelegate = new HideLeftViewOnScrollDelegate(1);
        } else if (i == 2) {
            this.hideOnScrollViewDelegate = new HideLeftViewOnScrollDelegate(0);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
        }
    }

    public final void slideIn(View view) {
        if (this.currentState == 2) {
            return;
        }
        updateCurrentState$1(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.hideOnScrollViewDelegate.getClass();
        this.currentAnimator = this.hideOnScrollViewDelegate.getViewTranslationAnimator(view, 0).setInterpolator(this.enterAnimInterpolator).setDuration(this.enterAnimDuration).setListener(new Transition.AnonymousClass2(this, view, false, 4));
    }

    public final void updateCurrentState$1(View view, int i) {
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

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
