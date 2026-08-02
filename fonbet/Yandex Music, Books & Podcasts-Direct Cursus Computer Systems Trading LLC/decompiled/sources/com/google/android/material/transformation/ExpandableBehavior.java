package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.btb;
import defpackage.dtb;
import defpackage.e0;
import defpackage.uk6;
import defpackage.xk6;
import defpackage.xq0;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends uk6 {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState = 0;

    public ExpandableBehavior() {
    }

    private boolean didStateChange(boolean z) {
        int i = this.currentState;
        return z ? i == 0 || i == 2 : i == 1;
    }

    public static <T extends ExpandableBehavior> T from(@NonNull View view, @NonNull Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof xk6)) {
            xq0.x("The view is not a child of CoordinatorLayout");
            return null;
        }
        uk6 uk6Var = ((xk6) layoutParams).a;
        if (uk6Var instanceof ExpandableBehavior) {
            return cls.cast(uk6Var);
        }
        xq0.x("The view is not associated with ExpandableBehavior");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtb findExpandableWidget(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List u = coordinatorLayout.u(view);
        int size = u.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) u.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (dtb) view2;
            }
        }
        return null;
    }

    @Override // defpackage.uk6
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uk6
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (dtb) view2;
        if (!didStateChange(((FloatingActionButton) obj).o.b)) {
            return false;
        }
        boolean z = ((FloatingActionButton) obj).o.b;
        this.currentState = z ? 1 : 2;
        return onExpandedStateChange((View) obj, view, z, true);
    }

    public abstract boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2);

    @Override // defpackage.uk6
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        dtb findExpandableWidget;
        if (view.isLaidOut() || (findExpandableWidget = findExpandableWidget(coordinatorLayout, view)) == null) {
            return false;
        }
        e0 e0Var = ((FloatingActionButton) findExpandableWidget).o;
        if (!didStateChange(e0Var.b)) {
            return false;
        }
        int i2 = e0Var.b ? 1 : 2;
        this.currentState = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new btb(this, view, i2, findExpandableWidget));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
