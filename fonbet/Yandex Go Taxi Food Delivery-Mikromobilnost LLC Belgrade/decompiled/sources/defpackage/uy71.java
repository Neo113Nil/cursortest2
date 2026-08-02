package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class uy71 {
    public final String a;
    public final String b;
    public final Object c;
    public final fj71 d;
    public final boolean e;
    public final boolean f;

    public uy71(String str, String str2, Object obj, fj71 fj71Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = fj71Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy71)) {
            return false;
        }
        uy71 uy71Var = (uy71) obj;
        return this.a.equals(uy71Var.a) && this.b.equals(uy71Var.b) && jl40.l(this.c, uy71Var.c) && jl40.l(this.d, uy71Var.d) && this.e == uy71Var.e && this.f == uy71Var.f;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        fj71 fj71Var = this.d;
        return Boolean.hashCode(this.f) + unr0.e((hashCode + (fj71Var != null ? fj71Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("Asset(name=", this.a, ", type=", this.b, ", value=");
        v.append(this.c);
        v.append(", link=");
        v.append(this.d);
        v.append(", isClickable=");
        return smw0.k(", isRequired=", Extension.C_BRAKE, v, this.e, this.f);
    }
}
