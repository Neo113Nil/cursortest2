package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class y5k0 implements d6k0 {
    public final c6k0 a;
    public final b6k0 b;
    public final w5k0 c;
    public final boolean d;

    public y5k0(c6k0 c6k0Var, b6k0 b6k0Var, w5k0 w5k0Var, boolean z) {
        this.a = c6k0Var;
        this.b = b6k0Var;
        this.c = w5k0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5k0)) {
            return false;
        }
        y5k0 y5k0Var = (y5k0) obj;
        return jl40.l(this.a, y5k0Var.a) && jl40.l(this.b, y5k0Var.b) && jl40.l(this.c, y5k0Var.c) && this.d == y5k0Var.d;
    }

    public final int hashCode() {
        c6k0 c6k0Var = this.a;
        int hashCode = (c6k0Var == null ? 0 : c6k0Var.hashCode()) * 31;
        b6k0 b6k0Var = this.b;
        int hashCode2 = (hashCode + (b6k0Var == null ? 0 : b6k0Var.hashCode())) * 31;
        w5k0 w5k0Var = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (w5k0Var != null ? w5k0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Loaded(title=" + this.a + ", subtitleState=" + this.b + ", gradient=" + this.c + ", withLogo=" + this.d + Extension.C_BRAKE;
    }
}
