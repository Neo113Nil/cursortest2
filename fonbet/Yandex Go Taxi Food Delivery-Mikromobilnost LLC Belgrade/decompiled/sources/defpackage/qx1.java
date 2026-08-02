package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qx1 {
    public final xss0 a;
    public final wqs0 b;
    public final kdc c;
    public final boolean d;
    public final boolean e;

    public qx1(xss0 xss0Var, wqs0 wqs0Var, kdc kdcVar, boolean z, boolean z2) {
        this.a = xss0Var;
        this.b = wqs0Var;
        this.c = kdcVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx1)) {
            return false;
        }
        qx1 qx1Var = (qx1) obj;
        return jl40.l(this.a, qx1Var.a) && jl40.l(this.b, qx1Var.b) && jl40.l(this.c, qx1Var.c) && this.d == qx1Var.d && this.e == qx1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(smw0.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(slot=");
        sb.append(this.a);
        sb.append(", properties=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", isEnabled=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
