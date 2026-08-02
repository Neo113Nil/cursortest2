package defpackage;

/* loaded from: classes4.dex */
public final class asu implements zru {
    public final csu a;
    public final lpu b;
    public final rmb c;
    public final xdr d;
    public final dkn e;

    public asu(csu csuVar, lpu lpuVar, rmb rmbVar) {
        this.a = csuVar;
        this.b = lpuVar;
        this.c = rmbVar;
        this.d = csuVar.m;
        this.e = csuVar.o;
    }

    @Override // defpackage.zru
    public final void a(co5 co5Var) {
        this.a.a(new r3s(26, this), co5Var);
    }

    @Override // defpackage.zru
    public final dkn b() {
        return this.e;
    }

    @Override // defpackage.zru
    public final xdr getState() {
        return this.d;
    }
}
