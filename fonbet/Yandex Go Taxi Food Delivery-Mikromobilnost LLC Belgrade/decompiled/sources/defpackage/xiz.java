package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xiz {
    public final int a;
    public final String b;
    public final String c;

    public xiz(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiz)) {
            return false;
        }
        xiz xizVar = (xiz) obj;
        return this.a == xizVar.a && jl40.l(this.b, xizVar.b) && jl40.l(this.c, xizVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(unr0.v(this.a, "Status(displayTimeSeconds=", ", dynamicSummary=", this.b, ", dynamicDescription="), this.c, Extension.C_BRAKE);
    }
}
