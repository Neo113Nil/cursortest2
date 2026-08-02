package defpackage;

/* loaded from: classes4.dex */
public final class rbf extends o2 {
    public jc51 a;
    public v3 b;
    public l2 c;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        c2Var.a(this.a.x);
        c2Var.a(this.b);
        l2 l2Var = this.c;
        if (l2Var != null) {
            c2Var.a(l2Var);
        }
        return new jqf(c2Var);
    }
}
