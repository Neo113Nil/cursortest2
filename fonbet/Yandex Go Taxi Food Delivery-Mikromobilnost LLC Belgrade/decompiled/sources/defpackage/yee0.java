package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yee0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public yee0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yee0)) {
            return false;
        }
        yee0 yee0Var = (yee0) obj;
        return jl40.l(this.a, yee0Var.a) && jl40.l(this.b, yee0Var.b) && jl40.l(this.c, yee0Var.c) && jl40.l(this.d, yee0Var.d) && jl40.l(this.e, yee0Var.e) && jl40.l(this.f, yee0Var.f) && jl40.l(this.g, yee0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PhoneSelectionScreenConfig(title=", this.a, ", description=", this.b, ", selfContactTitle=");
        g8e.D(v, this.c, ", blankContactTitle=", this.d, ", blankContactSubtitle=");
        g8e.D(v, this.e, ", readContactsPermissionRequest=", this.f, ", buttonTitle=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
