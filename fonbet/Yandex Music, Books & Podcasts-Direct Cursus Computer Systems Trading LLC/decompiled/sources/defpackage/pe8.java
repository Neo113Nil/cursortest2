package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class pe8 {
    public final qg8 a;
    public final yb8 b;
    public final ce8 c;
    public final boolean d;
    public final boolean e;
    public final oe8 f = oe8.a;

    public pe8(qg8 qg8Var, yb8 yb8Var, ce8 ce8Var, boolean z, boolean z2) {
        this.a = qg8Var;
        this.b = yb8Var;
        this.c = ce8Var;
        this.d = z;
        this.e = z2;
    }

    public final void a(e23 e23Var, View view, List list) {
        Object obj;
        List list2;
        xzb xzbVar = e23Var.b;
        gc8 gc8Var = e23Var.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            bd8 bd8Var = (bd8) obj;
            if (((Boolean) bd8Var.b.a(xzbVar)).booleanValue() && (list2 = bd8Var.e) != null && !list2.isEmpty()) {
                break;
            }
        }
        bd8 bd8Var2 = (bd8) obj;
        if (bd8Var2 == null) {
            this.a.d(e23Var, view, list, "click");
            return;
        }
        List list3 = bd8Var2.e;
        if (list3 == null) {
            return;
        }
        view.getContext();
        j6e j6eVar = new j6e(view);
        j6eVar.b = new vx6((Object) this, (Object) e23Var, (Object) list3, false, 7);
        gc8Var.y();
        gc8Var.R(new y9w(20));
        this.b.b(gc8Var, xzbVar, view, bd8Var2);
        this.c.b(bd8Var2, xzbVar);
        new ol(27, j6eVar).onClick(view);
    }
}
