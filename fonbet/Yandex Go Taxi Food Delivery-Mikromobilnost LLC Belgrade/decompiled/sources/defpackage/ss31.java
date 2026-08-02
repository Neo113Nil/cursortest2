package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class ss31 extends CoordinatorLayout.a {
    public ts31 a;
    public int b = 0;

    public ss31() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        w(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new ts31(view);
        }
        ts31 ts31Var = this.a;
        View view2 = ts31Var.a;
        ts31Var.b = view2.getTop();
        ts31Var.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int u() {
        ts31 ts31Var = this.a;
        if (ts31Var != null) {
            return ts31Var.d;
        }
        return 0;
    }

    public int v() {
        return u();
    }

    public void w(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.onLayoutChild(view, i);
    }

    public ss31(int i) {
    }
}
