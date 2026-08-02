package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class w381 {
    public final v981 a;
    public final fe81 b;
    public final e971 c;
    public final ike d;
    public final Context e;
    public final cr71 f;
    public final rx71 g;

    public w381(Context context, ike ikeVar, fe81 fe81Var, e971 e971Var, v981 v981Var) {
        Context applicationContext = context.getApplicationContext();
        nr41 nr41Var = new nr41(14, new tk81(context, ikeVar, fe81Var, e971Var, v981Var));
        cr71 cr71Var = new cr71(fe81Var, v981Var, nr41Var);
        rx71 rx71Var = new rx71(context, v981Var, e971Var, nr41Var, ikeVar);
        this.a = v981Var;
        this.b = fe81Var;
        this.c = e971Var;
        this.d = ikeVar;
        this.e = applicationContext;
        this.f = cr71Var;
        this.g = rx71Var;
    }

    public final void a() {
        rx71 rx71Var = this.g;
        ei71 ei71Var = rx71Var.b;
        tk81 tk81Var = ei71Var.c;
        hp61 hp61Var = tk81Var.b;
        synchronized (hp61Var.d) {
            hp61Var.b.a();
        }
        hp61 hp61Var2 = tk81Var.c;
        synchronized (hp61Var2.d) {
            hp61Var2.b.a();
        }
        ei71Var.a.getClass();
        ei71Var.b.getClass();
        rx71Var.c.mo24a();
        bvf0.j(rx71Var.a, null);
    }
}
