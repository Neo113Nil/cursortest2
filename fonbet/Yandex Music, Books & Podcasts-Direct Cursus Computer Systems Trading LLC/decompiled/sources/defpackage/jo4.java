package defpackage;

/* loaded from: classes5.dex */
public final class jo4 extends mc4 {
    public final mc4 a;
    public final ho4 b;

    public jo4(mc4 mc4Var, ho4 ho4Var) {
        this.a = mc4Var;
        o2g.O(ho4Var, "interceptor");
        this.b = ho4Var;
    }

    @Override // defpackage.mc4
    public final String e() {
        return this.a.e();
    }

    @Override // defpackage.mc4
    public final vn4 g(k3i k3iVar, ks3 ks3Var) {
        return this.b.a(k3iVar, ks3Var, this.a);
    }
}
