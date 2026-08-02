package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tsj0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tsj0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsj0)) {
            return false;
        }
        tsj0 tsj0Var = (tsj0) obj;
        return this.a.equals(tsj0Var.a) && this.b.equals(tsj0Var.b) && this.c.equals(tsj0Var.c) && jl40.l(this.d, tsj0Var.d) && jl40.l(this.e, tsj0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("ResolvedModalDescription(title=", this.a, ", subtitle=", this.b, ", buttonText=");
        g8e.D(v, this.c, ", imageTag=", this.d, ", paymentType=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
