package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class xn61 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public xn61(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn61)) {
            return false;
        }
        xn61 xn61Var = (xn61) obj;
        return jl40.l(this.a, xn61Var.a) && jl40.l(this.b, xn61Var.b) && jl40.l(this.c, xn61Var.c) && jl40.l(this.d, xn61Var.d) && jl40.l(this.e, xn61Var.e);
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
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CoreCreative(creativeId=", this.a, ", campaignId=", this.b, ", placeId=");
        g8e.D(v, this.c, ", offerId=", this.d, ", performanceOpeningUrl=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
