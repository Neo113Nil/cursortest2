package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class soe {
    public final String a;
    public final String b;
    public final String c;

    public soe(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soe)) {
            return false;
        }
        soe soeVar = (soe) obj;
        return jl40.l(this.a, soeVar.a) && this.b.equals(soeVar.b) && this.c.equals(soeVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("CopterPinInfo(iconTag=", this.a, ", text=", this.b, ", hint="), this.c, Extension.C_BRAKE);
    }
}
