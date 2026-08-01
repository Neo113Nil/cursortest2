package com.google.android.material.transformation;

import B.b;
import O.X;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends b {
    public ExpandableBehavior() {
    }

    @Override // B.b
    public abstract void b(View view);

    @Override // B.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = X.f2054a;
        if (!view.isLaidOut()) {
            ArrayList j6 = coordinatorLayout.j(view);
            int size = j6.size();
            for (int i6 = 0; i6 < size; i6++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
