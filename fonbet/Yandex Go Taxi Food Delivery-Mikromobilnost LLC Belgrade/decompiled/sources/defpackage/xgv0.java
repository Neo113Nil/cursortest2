package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xgv0 implements zgv0 {
    public final String a;
    public final qgv0 b;

    public xgv0(String str, qgv0 qgv0Var) {
        this.a = str;
        this.b = qgv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgv0)) {
            return false;
        }
        xgv0 xgv0Var = (xgv0) obj;
        return this.a.equals(xgv0Var.a) && jl40.l(this.b, xgv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Redesign(title=" + this.a + ", trail=" + this.b + Extension.C_BRAKE;
    }
}
