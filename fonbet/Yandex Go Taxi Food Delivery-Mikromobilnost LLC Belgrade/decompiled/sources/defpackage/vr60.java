package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vr60 {
    public final CharSequence a;
    public final kdc b;
    public final String c;
    public final String d;
    public final km9 e;
    public final String f;
    public final String g;
    public final String h;

    public vr60(CharSequence charSequence, kdc kdcVar, String str, String str2, km9 km9Var, String str3, String str4, String str5) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = str;
        this.d = str2;
        this.e = km9Var;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr60)) {
            return false;
        }
        vr60 vr60Var = (vr60) obj;
        return jl40.l(this.a, vr60Var.a) && jl40.l(this.b, vr60Var.b) && jl40.l(this.c, vr60Var.c) && jl40.l(this.d, vr60Var.d) && jl40.l(this.e, vr60Var.e) && jl40.l(this.f, vr60Var.f) && jl40.l(this.g, vr60Var.g) && jl40.l(this.h, vr60Var.h);
    }

    public final int hashCode() {
        int d = smw0.d(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return this.h.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferAttention(title=");
        sb.append((Object) this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        g8e.D(sb, this.c, ", leadIconTag=", this.d, ", action=");
        sb.append(this.e);
        sb.append(", promoImageUrl=");
        sb.append(this.f);
        sb.append(", trailIconTag=");
        return g8e.r(sb, this.g, ", promoOfferId=", this.h, Extension.C_BRAKE);
    }
}
