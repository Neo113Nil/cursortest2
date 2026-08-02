package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u3t0 implements y3t0 {
    public final String a;
    public final String b;

    public u3t0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3t0)) {
            return false;
        }
        u3t0 u3t0Var = (u3t0) obj;
        return jl40.l(this.a, u3t0Var.a) && this.b.equals(u3t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("IntermediatePoint(index=", this.a, ", contentDescription=", this.b, Extension.C_BRAKE);
    }
}
