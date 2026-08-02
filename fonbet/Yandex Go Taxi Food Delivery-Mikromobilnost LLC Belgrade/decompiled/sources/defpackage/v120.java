package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v120 {
    public final String a;
    public final String b;
    public final String c;

    public v120(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v120)) {
            return false;
        }
        v120 v120Var = (v120) obj;
        return jl40.l(this.a, v120Var.a) && jl40.l(this.b, v120Var.b) && jl40.l(this.c, v120Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("MessengerHeader(title=", this.a, ", subtitle=", this.b, ", chatIconTag="), this.c, Extension.C_BRAKE);
    }
}
