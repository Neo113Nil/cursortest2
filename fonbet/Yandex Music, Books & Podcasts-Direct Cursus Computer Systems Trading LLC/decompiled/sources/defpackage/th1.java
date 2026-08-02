package defpackage;

/* loaded from: classes3.dex */
public final class th1 implements xpq {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final uvf d;
    public final qrf e;

    public th1(u51 u51Var, uh1 uh1Var, hj1 hj1Var, jnq jnqVar, tmb tmbVar) {
        u51Var.getClass();
        uh1Var.getClass();
        hj1Var.getClass();
        jnqVar.getClass();
        tmbVar.getClass();
        this.a = btf.b(new mh1(hj1Var, 0));
        this.b = btf.b(new pa1(6));
        this.c = btf.b(new rh1(this, hj1Var, u51Var, tmbVar, uh1Var, 0));
        uvf uvfVar = new uvf(new sh1(0, this, jnqVar, tmbVar));
        uvfVar.e(qne.u(new qne(14), jnqVar, tmbVar));
        uvfVar.d();
        this.d = uvfVar;
        qrf qrfVar = new qrf(new g3(8, this, hj1Var, jnqVar));
        pvf pvfVar = qrfVar.a;
        pvfVar.getClass();
        pvf pvfVar2 = uvfVar.b;
        pvfVar2.getClass();
        pvfVar.a.putAll(pvfVar2.a);
        this.e = qrfVar;
    }

    @Override // defpackage.nnq
    public final prf a(String str) {
        str.getClass();
        return this.e.a(str);
    }

    @Override // defpackage.gnq
    public final fnq b(String str) {
        return this.d.b(str);
    }

    public final sj1 c() {
        return (sj1) this.c.getValue();
    }
}
