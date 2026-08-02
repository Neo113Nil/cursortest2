package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class sat implements lb6, yr2 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final yic d;
    public final yic e;
    public final yic f;

    public sat(ds2 ds2Var, dvp dvpVar) {
        this.a = dvpVar.e;
        this.c = dvpVar.a;
        yic a = dvpVar.b.a();
        this.d = a;
        yic a2 = dvpVar.c.a();
        this.e = a2;
        yic a3 = dvpVar.d.a();
        this.f = a3;
        ds2Var.e(a);
        ds2Var.e(a2);
        ds2Var.e(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // defpackage.yr2
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((yr2) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(yr2 yr2Var) {
        this.b.add(yr2Var);
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
    }
}
