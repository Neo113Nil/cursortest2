package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rff0 implements sff0 {
    public final String a;
    public final String b;
    public final String c;

    public rff0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rff0)) {
            return false;
        }
        rff0 rff0Var = (rff0) obj;
        return jl40.l(this.a, rff0Var.a) && jl40.l(this.b, rff0Var.b) && this.c.equals(rff0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("RatingWithNavigation(value=", this.a, ", ratingInfoUrl=", this.b, ", ratingInfoText="), this.c, Extension.C_BRAKE);
    }
}
