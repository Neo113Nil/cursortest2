package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class yf extends o2 {
    public static final u2 c;
    public u2 a;
    public fxs b;

    static {
        new u2("1.3.6.1.5.5.7.48.2");
        c = new u2("1.3.6.1.5.5.7.48.1");
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }

    public final String toString() {
        return oyr.t(new StringBuilder("AccessDescription: Oid("), this.a.a, Extension.C_BRAKE);
    }
}
