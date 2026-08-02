package defpackage;

/* loaded from: classes4.dex */
public final class ran extends o2 {
    public w2 a;
    public r0x b;

    public static ran m(a2 a2Var) {
        if (a2Var instanceof ran) {
            return (ran) a2Var;
        }
        if (a2Var != null) {
            i3 z = i3.z(a2Var);
            ran ranVar = new ran();
            if (z.size() >= 1 && z.size() <= 2) {
                ranVar.a = w2.x(z.A(0));
                if (z.size() > 1) {
                    ranVar.b = r0x.m(z.A(1));
                }
                return ranVar;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        r0x r0xVar = this.b;
        if (r0xVar != null) {
            c2Var.a(r0xVar);
        }
        return new jqf(c2Var);
    }
}
