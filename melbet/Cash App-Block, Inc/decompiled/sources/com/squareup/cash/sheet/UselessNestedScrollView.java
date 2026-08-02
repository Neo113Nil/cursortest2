package com.squareup.cash.sheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes7.dex */
public final class UselessNestedScrollView extends NestedScrollView {
    public final ViewGroup child;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UselessNestedScrollView(Context context, ViewGroup viewGroup) {
        super(context);
        context.getClass();
        this.child = viewGroup;
        addView(viewGroup);
        setLayoutParams(viewGroup.getLayoutParams());
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup viewGroup = this.child;
        viewGroup.measure(i, i2);
        setMeasuredDimension(viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        view.getClass();
        ViewParent parent = getParent();
        parent.getClass();
        return ((NestedScrollingParent2) parent).onNestedPreFling(view, f, f2);
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        view.getClass();
        iArr.getClass();
        ViewParent parent = getParent();
        parent.getClass();
        ((NestedScrollingParent2) parent).onNestedPreScroll(view, i, i2, iArr, i3);
    }
}
