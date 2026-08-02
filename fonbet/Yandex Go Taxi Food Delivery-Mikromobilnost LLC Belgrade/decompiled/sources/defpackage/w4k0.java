package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class w4k0 {
    public final String a;
    public final int b;

    public w4k0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4k0)) {
            return false;
        }
        w4k0 w4k0Var = (w4k0) obj;
        return jl40.l(this.a, w4k0Var.a) && this.b == w4k0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "StyleTag(tag=", this.a, ", end=", Extension.C_BRAKE);
    }
}
