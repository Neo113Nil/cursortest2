package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xq4 {
    public final String a;
    public final int b;
    public final sq4 c;
    public final vq4 d;
    public final wq4 e;

    public xq4(String str, int i, sq4 sq4Var, vq4 vq4Var, wq4 wq4Var) {
        this.a = str;
        this.b = i;
        this.c = sq4Var;
        this.d = vq4Var;
        this.e = wq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq4)) {
            return false;
        }
        xq4 xq4Var = (xq4) obj;
        return jl40.l(this.a, xq4Var.a) && this.b == xq4Var.b && jl40.l(this.c, xq4Var.c) && this.d.equals(xq4Var.d) && this.e.equals(xq4Var.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        sq4 sq4Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((b + (sq4Var == null ? 0 : sq4Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "Banner(id=", this.a, ", durationSeconds=", ", action=");
        u.append(this.c);
        u.append(", layout=");
        u.append(this.d);
        u.append(", showPolicy=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
