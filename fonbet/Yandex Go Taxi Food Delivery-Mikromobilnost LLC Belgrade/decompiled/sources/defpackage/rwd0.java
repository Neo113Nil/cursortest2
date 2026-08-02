package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class rwd0 extends o2 {
    public u2 a;
    public a2 b;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }

    public final String toString() {
        return "PolicyQualifierInfo[" + this.a + Extension.FIX_SPACE + this.b + "]";
    }
}
