package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class r1a0 {
    public final String a;
    public final String b;

    public r1a0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1a0)) {
            return false;
        }
        r1a0 r1a0Var = (r1a0) obj;
        return jl40.l(this.a, r1a0Var.a) && jl40.l(this.b, r1a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PaymentInfoContext(tripId=", this.a, ", propertyName=", this.b, Extension.C_BRAKE);
    }
}
