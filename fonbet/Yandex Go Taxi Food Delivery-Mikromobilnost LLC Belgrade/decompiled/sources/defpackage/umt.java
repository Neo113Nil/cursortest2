package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class umt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public umt(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof umt)) {
            return false;
        }
        umt umtVar = (umt) obj;
        return this.a.equals(umtVar.a) && jl40.l(this.b, umtVar.b) && jl40.l(this.c, umtVar.c) && jl40.l(this.d, umtVar.d) && jl40.l(this.e, umtVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("GoButtonInfo(title=", this.a, ", subtitle=", this.b, ", carNumber=");
        g8e.D(v, this.c, ", iconUrl=", this.d, ", price=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
