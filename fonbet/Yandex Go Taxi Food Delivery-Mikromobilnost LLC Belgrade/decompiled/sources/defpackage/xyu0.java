package defpackage;

/* loaded from: classes4.dex */
public final class xyu0 extends o2 {
    public byte[] a;

    public static xyu0 m(b3 b3Var) {
        if (b3Var == null) {
            return null;
        }
        byte[] bArr = w2.x(b3Var).a;
        xyu0 xyu0Var = new xyu0();
        xyu0Var.a = rza1.b(bArr);
        return xyu0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return new dqf(rza1.b(this.a));
    }
}
