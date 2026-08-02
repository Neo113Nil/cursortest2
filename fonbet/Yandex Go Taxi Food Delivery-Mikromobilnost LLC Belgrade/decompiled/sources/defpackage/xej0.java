package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class xej0 {
    public final String a;
    public final String b;
    public final String c;

    public xej0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xej0)) {
            return false;
        }
        xej0 xej0Var = (xej0) obj;
        return jl40.l(this.a, xej0Var.a) && jl40.l(this.b, xej0Var.b) && jl40.l(this.c, xej0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("RequirementCommunicationFallback(title=", this.a, ", subTitle=", this.b, ", buttonText="), this.c, Extension.C_BRAKE);
    }
}
