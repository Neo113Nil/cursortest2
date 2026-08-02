package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w9f {
    public final String a;
    public final int b;
    public final int c;

    public w9f(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9f)) {
            return false;
        }
        w9f w9fVar = (w9f) obj;
        return jl40.l(this.a, w9fVar.a) && this.b == w9fVar.b && this.c == w9fVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "CreditCard(pan=", this.a, ", expiryMonth=", ", expiryYear="));
    }
}
