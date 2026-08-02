package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tx8 {
    public final List a;

    public tx8(List list) {
        this.a = list;
    }

    public final void a(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        gc8 gc8Var2;
        xzb xzbVar2;
        View view2;
        dp8 dp8Var2;
        if (b(dp8Var)) {
            for (ux8 ux8Var : this.a) {
                if (ux8Var.c(dp8Var)) {
                    synchronized (d51.l) {
                    }
                    if (qht.a.a()) {
                        ux8Var.b(gc8Var, xzbVar, view, dp8Var);
                    } else {
                        dq7 dq7Var = ca8.a;
                        gc8Var2 = gc8Var;
                        xzbVar2 = xzbVar;
                        view2 = view;
                        dp8Var2 = dp8Var;
                        x97.D(j5h.a, new sx8(null, ux8Var, gc8Var2, xzbVar2, view2, dp8Var2, 0));
                        gc8Var = gc8Var2;
                        xzbVar = xzbVar2;
                        view = view2;
                        dp8Var = dp8Var2;
                    }
                }
                gc8Var2 = gc8Var;
                xzbVar2 = xzbVar;
                view2 = view;
                dp8Var2 = dp8Var;
                gc8Var = gc8Var2;
                xzbVar = xzbVar2;
                view = view2;
                dp8Var = dp8Var2;
            }
        }
    }

    public final boolean b(dp8 dp8Var) {
        List n = dp8Var.n();
        return (n == null || n.isEmpty() || this.a.isEmpty()) ? false : true;
    }

    public final void c(dp8 dp8Var) {
        if (b(dp8Var)) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ux8) it.next()).c(dp8Var);
            }
        }
    }

    public final void d(dp8 dp8Var, xzb xzbVar, hf9 hf9Var) {
        if (b(dp8Var)) {
            for (ux8 ux8Var : this.a) {
                if (ux8Var.c(dp8Var)) {
                    ux8Var.f(dp8Var, xzbVar, hf9Var);
                }
            }
        }
    }

    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        gc8 gc8Var2;
        xzb xzbVar2;
        View view2;
        dp8 dp8Var2;
        if (b(dp8Var)) {
            for (ux8 ux8Var : this.a) {
                if (ux8Var.c(dp8Var)) {
                    synchronized (d51.l) {
                    }
                    if (qht.a.a()) {
                        ux8Var.e(gc8Var, xzbVar, view, dp8Var);
                    } else {
                        dq7 dq7Var = ca8.a;
                        gc8Var2 = gc8Var;
                        xzbVar2 = xzbVar;
                        view2 = view;
                        dp8Var2 = dp8Var;
                        x97.D(j5h.a, new sx8(null, ux8Var, gc8Var2, xzbVar2, view2, dp8Var2, 1));
                        gc8Var = gc8Var2;
                        xzbVar = xzbVar2;
                        view = view2;
                        dp8Var = dp8Var2;
                    }
                }
                gc8Var2 = gc8Var;
                xzbVar2 = xzbVar;
                view2 = view;
                dp8Var2 = dp8Var;
                gc8Var = gc8Var2;
                xzbVar = xzbVar2;
                view = view2;
                dp8Var = dp8Var2;
            }
        }
    }
}
