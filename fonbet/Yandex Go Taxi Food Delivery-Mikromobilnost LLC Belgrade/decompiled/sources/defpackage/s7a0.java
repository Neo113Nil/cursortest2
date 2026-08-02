package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class s7a0 {
    public final String a;
    public final String b;

    public s7a0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7a0)) {
            return false;
        }
        s7a0 s7a0Var = (s7a0) obj;
        return this.a.equals(s7a0Var.a) && this.b.equals(s7a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PaymentMethodState(id=", this.a, ", iconBase64=", this.b, Extension.C_BRAKE);
    }
}
