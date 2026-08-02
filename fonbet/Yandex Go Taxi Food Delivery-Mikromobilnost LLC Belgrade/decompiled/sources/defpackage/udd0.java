package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class udd0 {
    public final String a;
    public final String b;
    public final lad0 c;
    public final String d;
    public final boolean e;
    public final n2d0 f;
    public final m5d0 g;

    public udd0(String str, String str2, lad0 lad0Var, String str3, boolean z, n2d0 n2d0Var, m5d0 m5d0Var) {
        this.a = str;
        this.b = str2;
        this.c = lad0Var;
        this.d = str3;
        this.e = z;
        this.f = n2d0Var;
        this.g = m5d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udd0)) {
            return false;
        }
        udd0 udd0Var = (udd0) obj;
        return jl40.l(this.a, udd0Var.a) && jl40.l(this.b, udd0Var.b) && this.c.equals(udd0Var.c) && jl40.l(this.d, udd0Var.d) && this.e == udd0Var.e && this.f.equals(udd0Var.f) && this.g.equals(udd0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PlusPayOfferParams(productTarget=", this.a, ", sessionId=", this.b, ", analyticsParams=");
        v.append(this.c);
        v.append(", serviceChannel=");
        v.append(this.d);
        v.append(", offlineModeEnabled=");
        v.append(this.e);
        v.append(", filters=");
        v.append(this.f);
        v.append(", loadedFilters=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
