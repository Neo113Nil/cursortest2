package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public final /* synthetic */ class HideViewOnScrollBehavior$$ExternalSyntheticLambda0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoordinatorLayout.Behavior f$0;
    public final /* synthetic */ View f$1;

    public /* synthetic */ HideViewOnScrollBehavior$$ExternalSyntheticLambda0(CoordinatorLayout.Behavior behavior, View view, int i) {
        this.$r8$classId = i;
        this.f$0 = behavior;
        this.f$1 = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.$r8$classId;
        View view = this.f$1;
        CoordinatorLayout.Behavior behavior = this.f$0;
        switch (i) {
            case 0:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) behavior;
                if (z && hideViewOnScrollBehavior.currentState == 1) {
                    hideViewOnScrollBehavior.slideIn(view);
                    break;
                }
                break;
            default:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) behavior;
                if (z && hideBottomViewOnScrollBehavior.currentState == 1) {
                    hideBottomViewOnScrollBehavior.slideUp(view);
                    break;
                }
                break;
        }
    }
}
