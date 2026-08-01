package com.google.android.material.transformation;

import B.c;
import O.K;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends c {
    public ExpandableBehavior() {
    }

    @Override // B.c
    public abstract void f(View view);

    @Override // B.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = K.f747a;
        if (!view.isLaidOut()) {
            ArrayList j = coordinatorLayout.j(view);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
