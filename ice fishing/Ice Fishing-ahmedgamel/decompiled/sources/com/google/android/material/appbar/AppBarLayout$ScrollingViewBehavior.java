package com.google.android.material.appbar;

import B.b;
import B.e;
import O.X;
import S0.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m3.AbstractC4742a;
import o3.AbstractC4803a;

/* loaded from: classes2.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC4803a {

    /* renamed from: b, reason: collision with root package name */
    public final int f36577b;

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
        b bVar = ((e) view2.getLayoutParams()).f229a;
        if (bVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) bVar).getClass();
            int i = this.f36577b;
            int d9 = bottom - (i == 0 ? 0 : f.d((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = X.f2142a;
            view.offsetTopAndBottom(d9);
        }
        return false;
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i6) {
        int i9 = view.getLayoutParams().height;
        if (i9 != -1 && i9 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // B.b
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // o3.AbstractC4803a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(i, view);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39437u);
        this.f36577b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // B.b
    public final void b(View view) {
    }
}
