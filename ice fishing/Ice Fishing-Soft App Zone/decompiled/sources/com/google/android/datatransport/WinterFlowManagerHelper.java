package com.google.android.datatransport;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerHelper extends ViewGroup {
    public final HashMap WinterFlowTransactionManagerStrategy;
    public final HashMap WinterFlowVariableVersionControl;

    public WinterFlowManagerHelper(Context context) {
        super(context);
        setClipChildren(false);
        this.WinterFlowVariableVersionControl = new HashMap();
        this.WinterFlowTransactionManagerStrategy = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<WinterFlowRouterLayer, WinterFlowSchedulerStructure> getHolderToLayoutNode() {
        return this.WinterFlowVariableVersionControl;
    }

    public final HashMap<WinterFlowSchedulerStructure, WinterFlowRouterLayer> getLayoutNodeToHolder() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (WinterFlowRouterLayer winterFlowRouterLayer : this.WinterFlowVariableVersionControl.keySet()) {
            winterFlowRouterLayer.layout(winterFlowRouterLayer.getLeft(), winterFlowRouterLayer.getTop(), winterFlowRouterLayer.getRight(), winterFlowRouterLayer.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            WinterFlowViewUtility.WinterFlowRouterStructure("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            WinterFlowViewUtility.WinterFlowRouterStructure("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (WinterFlowRouterLayer winterFlowRouterLayer : this.WinterFlowVariableVersionControl.keySet()) {
            int i4 = winterFlowRouterLayer.WinterFlowBackendCacheManager;
            if (i4 != Integer.MIN_VALUE && (i3 = winterFlowRouterLayer.WinterFlowEventEmitterController) != Integer.MIN_VALUE) {
                winterFlowRouterLayer.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) this.WinterFlowVariableVersionControl.get(childAt);
            if (childAt.isLayoutRequested() && winterFlowSchedulerStructure != null) {
                WinterFlowSchedulerStructure.WinterFlowConfiguration(winterFlowSchedulerStructure, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
