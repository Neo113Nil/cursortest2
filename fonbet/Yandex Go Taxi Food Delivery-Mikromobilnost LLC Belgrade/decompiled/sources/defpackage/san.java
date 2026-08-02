package defpackage;

/* loaded from: classes4.dex */
public final class san extends o2 {
    public static final xr1 w = new xr1(a150.a);
    public xr1 a;
    public byte[] b;
    public r0x c;

    public static san m(a2 a2Var) {
        if (a2Var instanceof san) {
            return (san) a2Var;
        }
        if (a2Var != null) {
            i3 z = i3.z(a2Var);
            san sanVar = new san();
            if (z.size() <= 3) {
                int i = 0;
                if (z.A(0) instanceof w2) {
                    sanVar.a = w;
                } else {
                    sanVar.a = xr1.m(z.A(0).toASN1Primitive());
                    i = 1;
                }
                int i2 = i + 1;
                sanVar.b = w2.x(z.A(i).toASN1Primitive()).a;
                if (z.size() > i2) {
                    sanVar.c = r0x.m(z.A(i2));
                }
                return sanVar;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        xr1 xr1Var = this.a;
        if (!xr1Var.equals(w)) {
            c2Var.a(xr1Var);
        }
        c2Var.a(new dqf(this.b));
        r0x r0xVar = this.c;
        if (r0xVar != null) {
            c2Var.a(r0xVar);
        }
        return new jqf(c2Var);
    }
}
