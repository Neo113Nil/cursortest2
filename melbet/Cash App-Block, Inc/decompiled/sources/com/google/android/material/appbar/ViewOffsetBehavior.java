package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public class ViewOffsetBehavior extends CoordinatorLayout.Behavior {
    public int tempTopBottomOffset = 0;
    public ViewOffsetHelper viewOffsetHelper;

    public ViewOffsetBehavior() {
    }

    public final int getTopAndBottomOffset() {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.offsetTop;
        }
        return 0;
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.onLayoutChild(view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        layoutChild(coordinatorLayout, view, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new ViewOffsetHelper(view);
        }
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        View view2 = viewOffsetHelper.view;
        viewOffsetHelper.layoutTop = view2.getTop();
        viewOffsetHelper.layoutLeft = view2.getLeft();
        this.viewOffsetHelper.applyOffsets();
        int i2 = this.tempTopBottomOffset;
        if (i2 == 0) {
            return true;
        }
        this.viewOffsetHelper.setTopAndBottomOffset(i2);
        this.tempTopBottomOffset = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
    }
}
