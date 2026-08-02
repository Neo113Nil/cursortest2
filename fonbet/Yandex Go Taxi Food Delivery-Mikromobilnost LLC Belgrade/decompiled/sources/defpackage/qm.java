package defpackage;

/* loaded from: classes4.dex */
public final class qm extends o2 {
    public l2 a;
    public l2 b;
    public l2 c;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        l2 l2Var = this.a;
        if (l2Var != null) {
            c2Var.a(l2Var);
        }
        l2 l2Var2 = this.b;
        if (l2Var2 != null) {
            c2Var.a(new oqf(false, 0, l2Var2, 0));
        }
        l2 l2Var3 = this.c;
        if (l2Var3 != null) {
            c2Var.a(new oqf(false, 1, l2Var3, 0));
        }
        return new jqf(c2Var);
    }
}
