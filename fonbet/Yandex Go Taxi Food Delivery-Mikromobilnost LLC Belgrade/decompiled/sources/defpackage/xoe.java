package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xoe {
    public final String a;
    public final String b;
    public final String c;

    public xoe(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoe)) {
            return false;
        }
        xoe xoeVar = (xoe) obj;
        return jl40.l(this.a, xoeVar.a) && this.b.equals(xoeVar.b) && jl40.l(this.c, xoeVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("CopyButtonStateModel(title=", this.a, ", subtitle=", this.b, ", trailText="), this.c, Extension.C_BRAKE);
    }
}
