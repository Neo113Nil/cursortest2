package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xf extends n2 {
    public static final t2 c = new t2("1.3.6.1.5.5.7.48.2");
    public t2 a;
    public exs b;

    static {
        new t2("1.3.6.1.5.5.7.48.1");
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        b2 b2Var = new b2(2);
        b2Var.a(this.a);
        b2Var.a(this.b);
        return new iqf(b2Var);
    }

    public final String toString() {
        return oyr.t(new StringBuilder("AccessDescription: Oid("), this.a.a, Extension.C_BRAKE);
    }
}
