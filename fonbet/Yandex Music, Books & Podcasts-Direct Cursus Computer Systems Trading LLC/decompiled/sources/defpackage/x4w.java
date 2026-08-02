package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x4w {
    public final ueo a;
    public final m3u b = new m3u(4);

    public x4w(ueo ueoVar) {
        this.a = ueoVar;
    }

    public final void a(xjo xjoVar, xy0 xy0Var) {
        uy0 uy0Var = (uy0) xy0Var.keySet();
        xy0 xy0Var2 = uy0Var.a;
        if (xy0Var2.isEmpty()) {
            return;
        }
        int i = 0;
        if (xy0Var.c > 999) {
            bzf.L(xy0Var, new w4w(this, xjoVar, i));
            return;
        }
        StringBuilder k = dfi.k("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        swf.x(xy0Var2.c, k);
        k.append(")");
        cko D0 = xjoVar.D0(k.toString());
        Iterator it = uy0Var.iterator();
        int i2 = 1;
        while (true) {
            ty0 ty0Var = (ty0) it;
            if (!ty0Var.hasNext()) {
                try {
                    break;
                } finally {
                    D0.close();
                }
            } else {
                D0.E(i2, (String) ty0Var.next());
                i2++;
            }
        }
        int u = s7g.u(D0, "work_spec_id");
        if (u == -1) {
            return;
        }
        while (D0.q()) {
            List list = (List) xy0Var.get(D0.x0(u));
            if (list != null) {
                byte[] blob = D0.getBlob(0);
                q97 q97Var = q97.b;
                list.add(cxb.Q(blob));
            }
        }
    }

    public final void b(xjo xjoVar, xy0 xy0Var) {
        uy0 uy0Var = (uy0) xy0Var.keySet();
        xy0 xy0Var2 = uy0Var.a;
        if (xy0Var2.isEmpty()) {
            return;
        }
        if (xy0Var.c > 999) {
            bzf.L(xy0Var, new w4w(this, xjoVar, 1));
            return;
        }
        StringBuilder k = dfi.k("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        swf.x(xy0Var2.c, k);
        k.append(")");
        cko D0 = xjoVar.D0(k.toString());
        Iterator it = uy0Var.iterator();
        int i = 1;
        while (true) {
            ty0 ty0Var = (ty0) it;
            if (!ty0Var.hasNext()) {
                try {
                    break;
                } finally {
                    D0.close();
                }
            } else {
                D0.E(i, (String) ty0Var.next());
                i++;
            }
        }
        int u = s7g.u(D0, "work_spec_id");
        if (u == -1) {
            return;
        }
        while (D0.q()) {
            List list = (List) xy0Var.get(D0.x0(u));
            if (list != null) {
                list.add(D0.x0(0));
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        up6.F(this.a, false, true, new v4w(str, 6));
    }

    public final c4w d(String str) {
        str.getClass();
        return (c4w) up6.F(this.a, true, false, new srp(str, 29));
    }

    public final t4w e(String str) {
        str.getClass();
        return (t4w) up6.F(this.a, true, false, new srp(str, 28));
    }

    public final List f(String str) {
        str.getClass();
        return (List) up6.F(this.a, true, false, new v4w(str, 7));
    }

    public final void g(long j, String str) {
        str.getClass();
        ((Number) up6.F(this.a, false, true, new l1m(str, 5, j))).intValue();
    }

    public final void h(int i, String str) {
        str.getClass();
        up6.F(this.a, false, true, new x20(str, i, 8));
    }

    public final void i(long j, String str) {
        str.getClass();
        up6.F(this.a, false, true, new l1m(str, 6, j));
    }

    public final void j(c4w c4wVar, String str) {
        str.getClass();
        ((Number) up6.F(this.a, false, true, new itv(9, c4wVar, str))).intValue();
    }

    public final void k(int i, String str) {
        str.getClass();
        up6.F(this.a, false, true, new x20(i, str, 9));
    }
}
