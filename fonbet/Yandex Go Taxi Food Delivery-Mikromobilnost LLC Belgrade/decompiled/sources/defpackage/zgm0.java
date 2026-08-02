package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zgm0 {
    public final String a;
    public final String b;
    public final String c;

    public zgm0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgm0)) {
            return false;
        }
        zgm0 zgm0Var = (zgm0) obj;
        return jl40.l(this.a, zgm0Var.a) && jl40.l(this.b, zgm0Var.b) && jl40.l(this.c, zgm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("SbpHomeStaticContent(title=", this.a, ", searchHint=", this.b, ", notFoundMessage="), this.c, Extension.C_BRAKE);
    }
}
