package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yl21 {
    public final String a;
    public final String b;
    public final String c;

    public yl21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl21)) {
            return false;
        }
        yl21 yl21Var = (yl21) obj;
        return jl40.l(this.a, yl21Var.a) && jl40.l(this.b, yl21Var.b) && jl40.l(this.c, yl21Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("ContactName(userId=", this.a, ", displayName=", this.b, ", nickname="), this.c, Extension.C_BRAKE);
    }
}
