package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ul4 {
    public final String a;
    public final String b;
    public final String c;

    public ul4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul4)) {
            return false;
        }
        ul4 ul4Var = (ul4) obj;
        return jl40.l(this.a, ul4Var.a) && jl40.l(this.b, ul4Var.b) && jl40.l(this.c, ul4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("BadgeModel(text=", this.a, ", textColor=", this.b, ", backgroundColor="), this.c, Extension.C_BRAKE);
    }
}
