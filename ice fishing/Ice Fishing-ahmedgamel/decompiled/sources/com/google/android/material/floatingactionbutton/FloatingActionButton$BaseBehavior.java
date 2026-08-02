package com.google.android.material.floatingactionbutton;

import B.b;
import B.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public class FloatingActionButton$BaseBehavior<T> extends b {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // B.b
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final void c(e eVar) {
        if (eVar.f236h == 0) {
            eVar.f236h = 80;
        }
    }

    @Override // B.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39424g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
