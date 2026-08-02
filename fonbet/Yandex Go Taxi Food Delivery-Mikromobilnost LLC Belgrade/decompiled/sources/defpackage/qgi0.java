package defpackage;

/* loaded from: classes4.dex */
public final class qgi0 extends o2 {
    public w2 a;
    public g2 b;
    public hr80 c;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        c2Var.a(this.a);
        g2 g2Var = this.b;
        if (g2Var != null) {
            c2Var.a(g2Var);
        }
        hr80 hr80Var = this.c;
        if (hr80Var != null) {
            c2Var.a(hr80Var);
        }
        return new jqf(c2Var);
    }
}
