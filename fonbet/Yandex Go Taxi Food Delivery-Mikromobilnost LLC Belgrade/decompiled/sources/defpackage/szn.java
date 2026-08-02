package defpackage;

/* loaded from: classes4.dex */
public class szn extends o2 {
    public u2 a;
    public xr1 b;
    public w2 c;

    public szn(u2 u2Var, xr1 xr1Var, w2 w2Var) {
        this.a = u2Var;
        this.b = xr1Var;
        this.c = w2Var;
    }

    public xr1 m() {
        return this.b;
    }

    public u2 n() {
        return this.a;
    }

    public w2 o() {
        return this.c;
    }

    @Override // defpackage.a2
    public b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        c2Var.a(this.a);
        c2Var.a(this.b);
        w2 w2Var = this.c;
        if (w2Var != null) {
            c2Var.a(new ud4(false, 0, w2Var));
        }
        return new nd4(c2Var);
    }
}
