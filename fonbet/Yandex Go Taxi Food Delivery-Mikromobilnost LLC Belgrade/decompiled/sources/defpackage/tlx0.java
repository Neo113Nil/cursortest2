package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tlx0 {
    public final String a;
    public final String b;
    public final String c;

    public tlx0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlx0)) {
            return false;
        }
        tlx0 tlx0Var = (tlx0) obj;
        return jl40.l(this.a, tlx0Var.a) && jl40.l(this.b, tlx0Var.b) && jl40.l(this.c, tlx0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("TariffRedirect(tariffClass=", this.a, ", requirementName=", this.b, ", description="), this.c, Extension.C_BRAKE);
    }
}
