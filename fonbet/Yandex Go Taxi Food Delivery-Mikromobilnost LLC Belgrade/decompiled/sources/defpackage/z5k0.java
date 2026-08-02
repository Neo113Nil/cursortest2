package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class z5k0 implements d6k0 {
    public final String a;
    public final w5k0 b;
    public final boolean c;

    public z5k0(String str, w5k0 w5k0Var, boolean z) {
        this.a = str;
        this.b = w5k0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5k0)) {
            return false;
        }
        z5k0 z5k0Var = (z5k0) obj;
        return jl40.l(this.a, z5k0Var.a) && jl40.l(this.b, z5k0Var.b) && this.c == z5k0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w5k0 w5k0Var = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (w5k0Var == null ? 0 : w5k0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(title=");
        sb.append(this.a);
        sb.append(", gradient=");
        sb.append(this.b);
        sb.append(", withLogo=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
