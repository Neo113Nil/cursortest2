package com.google.android.material.appbar;

import B.c;
import B.f;
import O.K;
import a.AbstractC0078a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u0.AbstractC0358a;
import w0.AbstractC0365a;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0365a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2346b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // B.c
    public final void f(View view) {
    }

    @Override // B.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        c cVar = ((f) view2.getLayoutParams()).f12a;
        if (cVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) cVar).getClass();
            int i = this.f2346b;
            int j = bottom - (i == 0 ? 0 : AbstractC0078a.j((int) (RecyclerView.f2111C0 * i), 0, i));
            WeakHashMap weakHashMap = K.f747a;
            view.offsetTopAndBottom(j);
        }
        return false;
    }

    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        w(coordinatorLayout.j(view));
        return false;
    }

    @Override // B.c
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override // w0.AbstractC0365a
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.f4431B);
        this.f2346b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
