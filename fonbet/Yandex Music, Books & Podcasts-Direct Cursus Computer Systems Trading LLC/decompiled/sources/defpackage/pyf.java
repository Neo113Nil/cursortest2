package defpackage;

/* loaded from: classes.dex */
public final class pyf {
    public final nyf a;
    public final u98 b;
    public final an5 c;

    public pyf(nyf nyfVar, u98 u98Var, r2f r2fVar) {
        lyf lyfVar = lyf.a;
        nyfVar.getClass();
        u98Var.getClass();
        this.a = nyfVar;
        this.b = u98Var;
        an5 an5Var = new an5(1, this, r2fVar);
        this.c = an5Var;
        if (nyfVar.b() != lyf.a) {
            nyfVar.a(an5Var);
        } else {
            r2fVar.g(null);
            a();
        }
    }

    public final void a() {
        this.a.d(this.c);
        u98 u98Var = this.b;
        u98Var.b = true;
        u98Var.a();
    }
}
