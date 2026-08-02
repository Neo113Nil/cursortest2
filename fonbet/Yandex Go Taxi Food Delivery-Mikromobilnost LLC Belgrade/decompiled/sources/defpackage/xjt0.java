package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xjt0 {
    public final n1a0 a;
    public final i1a0 b;

    public xjt0(n1a0 n1a0Var, i1a0 i1a0Var) {
        this.a = n1a0Var;
        this.b = i1a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjt0)) {
            return false;
        }
        xjt0 xjt0Var = (xjt0) obj;
        return this.a.equals(xjt0Var.a) && this.b.equals(xjt0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SourceTargetPaymentInfo(source=" + this.a + ", target=" + this.b + Extension.C_BRAKE;
    }
}
