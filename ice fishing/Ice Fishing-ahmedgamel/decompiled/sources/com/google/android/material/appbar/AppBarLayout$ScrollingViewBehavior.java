package com.google.android.material.appbar;

import B.b;
import B.e;
import O.X;
import a.AbstractC0422a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import m3.AbstractC4732a;

/* loaded from: classes2.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC4732a {

    /* renamed from: b, reason: collision with root package name */
    public final int f35808b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // B.b
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = ((e) view2.getLayoutParams()).f71a;
        if (bVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) bVar).getClass();
            int i = this.f35808b;
            int h9 = bottom - (i == 0 ? 0 : AbstractC0422a.h((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = X.f2054a;
            view.offsetTopAndBottom(h9);
        }
        return false;
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9) {
        int i10 = view.getLayoutParams().height;
        if (i10 != -1 && i10 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // B.b
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // m3.AbstractC4732a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(i, view);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4632a.f38648u);
        this.f35808b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // B.b
    public final void b(View view) {
    }
}
