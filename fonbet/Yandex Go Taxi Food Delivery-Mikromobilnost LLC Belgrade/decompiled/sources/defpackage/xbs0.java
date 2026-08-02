package defpackage;

/* loaded from: classes4.dex */
public final class xbs0 extends o2 implements y1 {
    public o2 a;

    public xbs0(p0x p0xVar) {
        this.a = p0xVar;
    }

    public static xbs0 m(Object obj) {
        if (obj == null || (obj instanceof xbs0)) {
            return (xbs0) obj;
        }
        if (obj instanceof p0x) {
            return new xbs0((p0x) obj);
        }
        if (obj instanceof w2) {
            xbs0 xbs0Var = new xbs0();
            xbs0Var.a = new oqf(2, 128, 0, (w2) obj, 0);
            return xbs0Var;
        }
        if (!(obj instanceof b3)) {
            ny61.g(qv10.n(obj, "Illegal object in SignerIdentifier: "));
            return null;
        }
        xbs0 xbs0Var2 = new xbs0();
        xbs0Var2.a = (b3) obj;
        return xbs0Var2;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a.toASN1Primitive();
    }
}
