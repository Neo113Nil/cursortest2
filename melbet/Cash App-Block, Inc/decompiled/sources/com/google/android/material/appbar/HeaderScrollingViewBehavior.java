package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int overlayTop;
    public final Rect tempRect1;
    public final Rect tempRect2;
    public int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    public final int getOverlapPixelsForOffset(View view) {
        int i;
        if (this.overlayTop == 0) {
            return 0;
        }
        boolean z = view instanceof AppBarLayout;
        float f = RecyclerView.DECELERATION_RATE;
        if (z) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).mBehavior;
            int topBottomOffsetForScrollingSibling = behavior instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) behavior).getTopBottomOffsetForScrollingSibling() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + topBottomOffsetForScrollingSibling > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (topBottomOffsetForScrollingSibling / i) + 1.0f;
            }
        }
        int i2 = this.overlayTop;
        return MathUtils.clamp((int) (f * i2), 0, i2);
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout findFirstDependency = AppBarLayout.ScrollingViewBehavior.findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency == null) {
            coordinatorLayout.onLayoutChild(view, i);
            this.verticalLayoutGap = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int bottom = findFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int bottom2 = ((findFirstDependency.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        Rect rect = this.tempRect1;
        rect.set(paddingLeft, bottom, width, bottom2);
        WindowInsetsCompat windowInsetsCompat = coordinatorLayout.mLastInsets;
        if (windowInsetsCompat != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = windowInsetsCompat.getSystemWindowInsetLeft() + rect.left;
            rect.right -= windowInsetsCompat.getSystemWindowInsetRight();
        }
        int i2 = layoutParams.gravity;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.tempRect2;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
        view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.verticalLayoutGap = rect2.top - findFirstDependency.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout findFirstDependency;
        WindowInsetsCompat windowInsetsCompat;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (findFirstDependency = AppBarLayout.ScrollingViewBehavior.findFirstDependency(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (findFirstDependency.getFitsSystemWindows() && (windowInsetsCompat = coordinatorLayout.mLastInsets) != null) {
            size += windowInsetsCompat.getSystemWindowInsetBottom() + windowInsetsCompat.getSystemWindowInsetTop();
        }
        int totalScrollRange = findFirstDependency.getTotalScrollRange() + size;
        int measuredHeight = findFirstDependency.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(RecyclerView.DECELERATION_RATE);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : PKIFailureInfo.systemUnavail));
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}
