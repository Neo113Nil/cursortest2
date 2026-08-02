package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class r8s0 {
    public final String a;
    public final int b;
    public final int c;

    public r8s0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8s0)) {
            return false;
        }
        r8s0 r8s0Var = (r8s0) obj;
        return jl40.l(this.a, r8s0Var.a) && this.b == r8s0Var.b && this.c == r8s0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "ShowPolicyDTO(id=", this.a, ", showCount=", ", maxShowCount="));
    }
}
