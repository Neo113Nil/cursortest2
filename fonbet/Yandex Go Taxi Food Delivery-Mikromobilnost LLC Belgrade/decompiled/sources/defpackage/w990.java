package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w990 {
    public final String a;
    public final String b;
    public final String c;

    public w990(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w990)) {
            return false;
        }
        w990 w990Var = (w990) obj;
        return this.a.equals(w990Var.a) && jl40.l(this.b, w990Var.b) && jl40.l(this.c, w990Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("InfoButton(title=", this.a, ", deeplink=", this.b, ", leadImageUrl="), this.c, Extension.C_BRAKE);
    }
}
