package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class va31 {
    public final String a;
    public final int b;

    public va31(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va31)) {
            return false;
        }
        va31 va31Var = (va31) obj;
        return jl40.l(this.a, va31Var.a) && this.b == va31Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "VerticalBar(color=", this.a, ", width=", Extension.C_BRAKE);
    }
}
