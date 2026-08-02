package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sl {
    public final String a;
    public final String b;
    public final String c;
    public final rbv d;
    public final String e;
    public final String f;
    public final String g;

    public sl(String str, String str2, String str3, rbv rbvVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rbvVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl)) {
            return false;
        }
        sl slVar = (sl) obj;
        return jl40.l(this.a, slVar.a) && jl40.l(this.b, slVar.b) && jl40.l(this.c, slVar.c) && jl40.l(this.d, slVar.d) && jl40.l(this.e, slVar.e) && jl40.l(this.f, slVar.f) && jl40.l(this.g, slVar.g);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        rbv rbvVar = this.d;
        int hashCode2 = (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AccountPaymentMethodEntity(agreementId=", this.a, ", title=", this.b, ", description=");
        v.append(this.c);
        v.append(", logo=");
        v.append(this.d);
        v.append(", action=");
        g8e.D(v, this.e, ", onSelectedAction=", this.f, ", onM2mSelectedAction=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
