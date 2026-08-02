package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rj4 {
    public final String a;
    public final String b;
    public final String c;

    public rj4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj4)) {
            return false;
        }
        rj4 rj4Var = (rj4) obj;
        return jl40.l(this.a, rj4Var.a) && jl40.l(this.b, rj4Var.b) && jl40.l(this.c, rj4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("Badge(text=", this.a, ", textColor=", this.b, ", backgroundColor="), this.c, Extension.C_BRAKE);
    }

    public rj4() {
        this("", null, null);
    }
}
