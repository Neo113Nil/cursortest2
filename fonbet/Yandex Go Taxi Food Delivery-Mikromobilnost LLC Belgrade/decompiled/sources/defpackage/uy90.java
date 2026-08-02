package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class uy90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public uy90(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy90)) {
            return false;
        }
        uy90 uy90Var = (uy90) obj;
        return this.a.equals(uy90Var.a) && jl40.l(this.b, uy90Var.b) && jl40.l(this.c, uy90Var.c) && jl40.l(this.d, uy90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("PaymentDomain(host=", this.a, ", merchantDomain=", this.b, ", currency="), this.c, ", requestId=", this.d, Extension.C_BRAKE);
    }
}
