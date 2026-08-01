package com.google.android.material.floatingactionbutton;

import B.c;
import B.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends c {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // B.c
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final void g(f fVar) {
        if (fVar.f18h == 0) {
            fVar.f18h = 80;
        }
    }

    @Override // B.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.j);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
