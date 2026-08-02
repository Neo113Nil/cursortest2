package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class qg8 {
    public final eg8 a;
    public final yb8 b;
    public final ce8 c;

    public qg8(eg8 eg8Var, yb8 yb8Var, ce8 ce8Var) {
        this.a = eg8Var;
        this.b = yb8Var;
        this.c = ce8Var;
    }

    public static void c(qg8 qg8Var, gc8 gc8Var, xzb xzbVar, List list, String str) {
        qg8Var.getClass();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qg8Var.a(gc8Var, xzbVar, (bd8) it.next(), str, gc8Var.getActionHandler());
            }
        }
    }

    public final boolean a(gc8 gc8Var, xzb xzbVar, bd8 bd8Var, String str, eg8 eg8Var) {
        if (((Boolean) bd8Var.b.a(xzbVar)).booleanValue()) {
            return b(gc8Var, xzbVar, bd8Var, str, eg8Var);
        }
        return false;
    }

    public final boolean b(gc8 gc8Var, xzb xzbVar, bd8 bd8Var, String str, eg8 eg8Var) {
        eg8 eg8Var2 = this.a;
        eg8Var2.getClass();
        return (eg8Var != null && (eg8Var.e(bd8Var.j, bd8Var.h, bd8Var.f, gc8Var, xzbVar, str) || eg8Var.a(bd8Var, gc8Var, xzbVar))) || eg8Var2.e(bd8Var.j, bd8Var.h, bd8Var.f, gc8Var, xzbVar, str) || eg8Var2.a(bd8Var, gc8Var, xzbVar);
    }

    public final void d(e23 e23Var, View view, List list, String str) {
        e23Var.a.v(new vh0(list, this, e23Var, view, str));
    }
}
