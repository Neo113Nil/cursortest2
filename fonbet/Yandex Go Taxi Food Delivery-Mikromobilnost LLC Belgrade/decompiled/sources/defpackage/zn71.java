package defpackage;

import android.content.Context;
import yads.f5;
import yads.qp1;

/* loaded from: classes7.dex */
public abstract class zn71 extends fk81 {
    public final wq71 P;
    public final v671 Q;
    public final cr71 R;
    public final ph71 S;
    public mb71 T;
    public mb71 U;
    public gn81 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn71(Context context, fe81 fe81Var, v981 v981Var, wq71 wq71Var, e971 e971Var, v671 v671Var, cr71 cr71Var) {
        super(context, fe81Var, e971Var, v981Var);
        ph71 ph71Var = new ph71(v981Var);
        this.P = wq71Var;
        this.Q = v671Var;
        this.R = cr71Var;
        this.S = ph71Var;
        c(ri71.a.a);
    }

    @Override // defpackage.dj81
    public final void b(dl61 dl61Var) {
        this.P.b(dl61Var);
    }

    @Override // defpackage.dj81
    public final void l() {
        this.P.b(so61.h);
    }

    @Override // defpackage.dj81
    public final void m() {
        gn81 gn81Var = this.V;
        wq71 wq71Var = this.P;
        if (gn81Var != null) {
            wq71Var.a(gn81Var);
        } else {
            wq71Var.b(so61.b);
        }
    }

    public abstract mb71 p(qe71 qe71Var);

    @Override // defpackage.fj81
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void a(d881 d881Var) {
        d881 d881Var2;
        gn81 x371Var;
        synchronized (this) {
            this.b.a(f5.t);
            this.N = d881Var;
        }
        this.R.x = d881Var;
        ph71 ph71Var = this.S;
        Context context = this.a;
        ph71Var.getClass();
        qp1 qp1Var = d881Var.o;
        mb71 p = p(qp1Var != null ? new e291(context, d881Var, qp1Var) : new a441(context, ph71Var.a));
        this.U = this.T;
        this.T = p;
        v671 v671Var = this.Q;
        fe81 fe81Var = this.c;
        switch (v671Var.a) {
            case 0:
                d881Var2 = d881Var;
                Context context2 = v671Var.b;
                v981 v981Var = v671Var.c;
                new ai71();
                x371Var = new x371(context2, d881Var2, fe81Var, v981Var, p, new ju81());
                break;
            case 1:
                d881Var2 = d881Var;
                x371Var = new hj81(v671Var.b, d881Var2, fe81Var, v671Var.c, p);
                break;
            default:
                Context context3 = v671Var.b;
                v981 v981Var2 = v671Var.c;
                new ai71();
                d881Var2 = d881Var;
                x371Var = new xr81(context3, d881Var2, fe81Var, v981Var2, p, new ju81());
                break;
        }
        this.V = x371Var;
        Context a = tb71.a();
        if (a == null) {
            a = this.a;
        }
        p.a(a, d881Var2);
    }
}
