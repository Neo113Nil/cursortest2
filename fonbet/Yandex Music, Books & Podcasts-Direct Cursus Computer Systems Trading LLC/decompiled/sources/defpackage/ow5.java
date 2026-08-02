package defpackage;

/* loaded from: classes3.dex */
public final class ow5 implements nw5 {
    public final f41 a;
    public final f41 b;
    public final boolean c;
    public final fkn d;

    public ow5(s26 s26Var, wy5 wy5Var, uu5 uu5Var, f41 f41Var, f41 f41Var2, boolean z) {
        wy5Var.getClass();
        this.a = f41Var;
        this.b = f41Var2;
        this.c = z;
        this.d = new fkn(ydr.a(pcg.P(wy5Var, uu5Var, s26Var.a, s26Var.b)));
    }

    @Override // defpackage.nw5
    public final void a() {
        this.a.invoke();
    }

    @Override // defpackage.nw5
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.nw5
    public final void c() {
        this.b.invoke();
    }

    @Override // defpackage.nw5
    public final vdr getState() {
        return this.d;
    }
}
