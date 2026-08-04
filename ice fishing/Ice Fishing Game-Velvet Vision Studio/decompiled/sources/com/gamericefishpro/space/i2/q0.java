package com.gamericefishpro.space.i2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends ViewGroup {
    public final HashMap d;
    public final HashMap e;

    public q0(Context context) {
        super(context);
        setClipChildren(false);
        this.d = new HashMap();
        this.e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<com.gamericefishpro.space.f3.j, com.gamericefishpro.space.h2.f0> getHolderToLayoutNode() {
        return this.d;
    }

    public final HashMap<com.gamericefishpro.space.h2.f0, com.gamericefishpro.space.f3.j> getLayoutNodeToHolder() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (com.gamericefishpro.space.f3.j jVar : this.d.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            com.gamericefishpro.space.e2.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            com.gamericefishpro.space.e2.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (com.gamericefishpro.space.f3.j jVar : this.d.keySet()) {
            int i4 = jVar.O;
            if (i4 != Integer.MIN_VALUE && (i3 = jVar.P) != Integer.MIN_VALUE) {
                jVar.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) this.d.get(childAt);
            if (childAt.isLayoutRequested() && f0Var != null) {
                com.gamericefishpro.space.h2.f0.V(f0Var, false, 7);
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
