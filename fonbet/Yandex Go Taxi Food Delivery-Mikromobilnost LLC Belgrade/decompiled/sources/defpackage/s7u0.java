package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class s7u0 {
    public final r7u0 a;
    public final r7u0 b;
    public final String c;

    public s7u0(r7u0 r7u0Var, r7u0 r7u0Var2, String str) {
        this.a = r7u0Var;
        this.b = r7u0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7u0)) {
            return false;
        }
        s7u0 s7u0Var = (s7u0) obj;
        return jl40.l(this.a, s7u0Var.a) && jl40.l(this.b, s7u0Var.b) && jl40.l(this.c, s7u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StationsUiState(source=");
        sb.append(this.a);
        sb.append(", destination=");
        sb.append(this.b);
        sb.append(", swapIconDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s7u0() {
        this(r0, r0, "");
        p7u0 p7u0Var = p7u0.b;
    }
}
