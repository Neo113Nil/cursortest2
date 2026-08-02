package defpackage;

/* loaded from: classes4.dex */
public final class wr1 extends n2 {
    public t2 a;
    public z1 b;

    public static wr1 h(Object obj) {
        if (obj instanceof wr1) {
            return (wr1) obj;
        }
        if (obj != null) {
            h3 r = h3.r(obj);
            wr1 wr1Var = new wr1();
            if (r.size() >= 1 && r.size() <= 2) {
                wr1Var.a = t2.s(r.s(0));
                if (r.size() == 2) {
                    wr1Var.b = r.s(1);
                    return wr1Var;
                }
                wr1Var.b = null;
                return wr1Var;
            }
            ny61.e(r.size(), "Bad sequence size: ");
        }
        return null;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        b2 b2Var = new b2(2);
        b2Var.a(this.a);
        z1 z1Var = this.b;
        if (z1Var != null) {
            b2Var.a(z1Var);
        }
        return new iqf(b2Var);
    }
}
