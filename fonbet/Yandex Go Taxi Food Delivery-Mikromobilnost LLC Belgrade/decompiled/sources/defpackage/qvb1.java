package defpackage;

import android.content.Context;

/* loaded from: classes11.dex */
public final class qvb1 implements jvb1 {
    public final j3y a;
    public final j3y b;
    public final lvb1 c;

    public qvb1(Context context, lvb1 lvb1Var) {
        this.c = lvb1Var;
        d87 d87Var = d87.e;
        z811.b(context);
        j211 c = z811.a().c(d87Var);
        if (d87.d.contains(new pzn("json"))) {
            this.a = new j3y(new j0b1(c, 10));
        }
        this.b = new j3y(new j0b1(c, 11));
    }

    @Override // defpackage.jvb1
    public final void a(o3 o3Var) {
        lvb1 lvb1Var = this.c;
        if (lvb1Var.a() != 0) {
            z211 z211Var = (z211) this.b.get();
            int a = lvb1Var.a();
            z211Var.b(o3Var.b != 0 ? jeo.f(o3Var.L(a)) : jeo.g(o3Var.L(a)));
        } else {
            j3y j3yVar = this.a;
            if (j3yVar != null) {
                z211 z211Var2 = (z211) j3yVar.get();
                int a2 = lvb1Var.a();
                z211Var2.b(o3Var.b != 0 ? jeo.f(o3Var.L(a2)) : jeo.g(o3Var.L(a2)));
            }
        }
    }
}
