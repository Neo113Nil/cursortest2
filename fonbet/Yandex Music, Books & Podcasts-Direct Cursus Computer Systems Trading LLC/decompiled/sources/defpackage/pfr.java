package defpackage;

/* loaded from: classes4.dex */
public final class pfr implements mnq {
    public final loq a;
    public final qy7 b;
    public final moq c;
    public final knq d;
    public final gsj e = new gsj(8);

    public pfr(loq loqVar, qy7 qy7Var, moq moqVar, jnq jnqVar, tmb tmbVar) {
        this.a = loqVar;
        this.b = qy7Var;
        this.c = moqVar;
        this.d = (knq) btf.b(new cte(29, loqVar, jnqVar, new aqp(6, tmbVar, this, jnqVar))).getValue();
    }

    @Override // defpackage.prf
    public final knq a() {
        return this.d;
    }

    @Override // defpackage.mnq
    public final fnq b() {
        return this.e;
    }
}
