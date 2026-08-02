package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.dfi;
import defpackage.hrg;
import defpackage.jb;
import defpackage.le;
import defpackage.pxd;
import defpackage.rxd;
import defpackage.szf;
import defpackage.uk6;
import defpackage.wm0;
import defpackage.xk6;
import defpackage.xq0;
import defpackage.yxd;
import defpackage.zxd;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends uk6 {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int EDGE_BOTTOM = 1;
    public static final int EDGE_LEFT = 2;
    public static final int EDGE_RIGHT = 0;
    private static final int ENTER_ANIM_DURATION_ATTR = 2130969919;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = 2130969935;
    private static final int EXIT_ANIM_DURATION_ATTR = 2130969925;
    public static final int STATE_SCROLLED_IN = 2;
    public static final int STATE_SCROLLED_OUT = 1;
    private AccessibilityManager accessibilityManager;
    private int additionalHiddenOffset;
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private boolean disableOnTouchExploration;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private zxd hideOnScrollViewDelegate;

    @NonNull
    private final LinkedHashSet<yxd> onScrollStateChangedListeners;
    private int size;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationListener;
    private boolean viewEdgeOverride;

    public HideViewOnScrollBehavior() {
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.viewEdgeOverride = false;
    }

    private void animateChildTo(@NonNull V v, int i, long j, @NonNull TimeInterpolator timeInterpolator) {
        this.currentAnimator = this.hideOnScrollViewDelegate.c(i, v).setInterpolator(timeInterpolator).setDuration(j).setListener(new le(8, this));
    }

    private void disableIfTouchExplorationEnabled(V v) {
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) v.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || this.touchExplorationListener != null) {
            return;
        }
        pxd pxdVar = new pxd(this, v, 1);
        this.touchExplorationListener = pxdVar;
        accessibilityManager.addTouchExplorationStateChangeListener(pxdVar);
        v.addOnAttachStateChangeListener(new jb(8, this));
    }

    @NonNull
    public static <V extends View> HideViewOnScrollBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof xk6)) {
            xq0.x("The view is not a child of CoordinatorLayout");
            return null;
        }
        uk6 uk6Var = ((xk6) layoutParams).a;
        if (uk6Var instanceof HideViewOnScrollBehavior) {
            return (HideViewOnScrollBehavior) uk6Var;
        }
        xq0.x("The view is not associated with HideViewOnScrollBehavior");
        return null;
    }

    private boolean isGravityBottom(int i) {
        return i == 80 || i == 81;
    }

    private boolean isGravityLeft(int i) {
        return i == 3 || i == 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$disableIfTouchExplorationEnabled$0(View view, boolean z) {
        if (this.disableOnTouchExploration && z && isScrolledOut()) {
            slideIn(view);
        }
    }

    private void setViewEdge(@NonNull V v, int i) {
        if (this.viewEdgeOverride) {
            return;
        }
        int i2 = ((xk6) v.getLayoutParams()).c;
        if (isGravityBottom(i2)) {
            setViewEdgeInternal(1);
        } else {
            setViewEdgeInternal(isGravityLeft(Gravity.getAbsoluteGravity(i2, i)) ? 2 : 0);
        }
    }

    private void setViewEdgeInternal(int i) {
        zxd zxdVar = this.hideOnScrollViewDelegate;
        if (zxdVar == null || zxdVar.b() != i) {
            if (i == 0) {
                this.hideOnScrollViewDelegate = new rxd(2);
                return;
            }
            if (i == 1) {
                this.hideOnScrollViewDelegate = new rxd(0);
            } else if (i == 2) {
                this.hideOnScrollViewDelegate = new rxd(1);
            } else {
                xq0.x(dfi.c(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
        }
    }

    private void updateCurrentState(@NonNull V v, int i) {
        this.currentState = i;
        Iterator<yxd> it = this.onScrollStateChangedListeners.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
    }

    public void addOnScrollStateChangedListener(@NonNull yxd yxdVar) {
        this.onScrollStateChangedListeners.add(yxdVar);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }

    public void disableOnTouchExploration(boolean z) {
        this.disableOnTouchExploration = z;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.disableOnTouchExploration;
    }

    public boolean isScrolledIn() {
        return this.currentState == 2;
    }

    public boolean isScrolledOut() {
        return this.currentState == 1;
    }

    @Override // defpackage.uk6
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        disableIfTouchExplorationEnabled(v);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        setViewEdge(v, i);
        this.size = this.hideOnScrollViewDelegate.a(v, marginLayoutParams);
        this.enterAnimDuration = szf.p0(v.getContext(), ENTER_ANIM_DURATION_ATTR, DEFAULT_ENTER_ANIMATION_DURATION_MS);
        this.exitAnimDuration = szf.p0(v.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v.getContext();
        int i2 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = szf.q0(context, i2, wm0.d);
        this.exitAnimInterpolator = szf.q0(v.getContext(), i2, wm0.c);
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    @Override // defpackage.uk6
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (i2 > 0) {
            slideOut(v);
        } else if (i2 < 0) {
            slideIn(v);
        }
    }

    @Override // defpackage.uk6
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        return i == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull yxd yxdVar) {
        this.onScrollStateChangedListeners.remove(yxdVar);
    }

    public void setAdditionalHiddenOffset(@NonNull V v, int i) {
        this.additionalHiddenOffset = i;
        if (this.currentState == 1) {
            this.hideOnScrollViewDelegate.d(v, this.size, i);
        }
    }

    public void slideIn(@NonNull V v, boolean z) {
        if (isScrolledIn()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 2);
        this.hideOnScrollViewDelegate.getClass();
        if (z) {
            animateChildTo(v, 0, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            this.hideOnScrollViewDelegate.e(0, v);
        }
    }

    public void slideOut(@NonNull V v, boolean z) {
        AccessibilityManager accessibilityManager;
        if (isScrolledOut()) {
            return;
        }
        if (this.disableOnTouchExploration && (accessibilityManager = this.accessibilityManager) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 1);
        int i = this.size + this.additionalHiddenOffset;
        if (z) {
            animateChildTo(v, i, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            this.hideOnScrollViewDelegate.e(i, v);
        }
    }

    public HideViewOnScrollBehavior(int i) {
        this();
        setViewEdge(i);
    }

    public HideViewOnScrollBehavior(@NonNull Context context, AttributeSet attributeSet) {
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.viewEdgeOverride = false;
    }

    public void setViewEdge(int i) {
        this.viewEdgeOverride = true;
        setViewEdgeInternal(i);
    }

    public void slideIn(@NonNull V v) {
        slideIn(v, true);
    }

    public void slideOut(@NonNull V v) {
        slideOut(v, true);
    }
}
