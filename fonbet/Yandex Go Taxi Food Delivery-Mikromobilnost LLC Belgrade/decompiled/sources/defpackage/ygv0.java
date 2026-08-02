package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ygv0 implements zgv0 {
    public final String a;
    public final String b;
    public final int c;
    public final qgv0 d;
    public final String e;

    public ygv0(String str, String str2, int i, qgv0 qgv0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = qgv0Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygv0)) {
            return false;
        }
        ygv0 ygv0Var = (ygv0) obj;
        return jl40.l(this.a, ygv0Var.a) && jl40.l(this.b, ygv0Var.b) && this.c == ygv0Var.c && jl40.l(this.d, ygv0Var.d) && jl40.l(this.e, ygv0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Vertical(title=", this.a, ", iconUrl=", this.b, ", fallbackIcon=");
        v.append(this.c);
        v.append(", trail=");
        v.append(this.d);
        v.append(", contentDescription=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
