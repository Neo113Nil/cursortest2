package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uy21 {
    public final n0t0 a;
    public final List b;

    public uy21(n0t0 n0t0Var, List list) {
        this.a = n0t0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy21)) {
            return false;
        }
        uy21 uy21Var = (uy21) obj;
        return jl40.l(this.a, uy21Var.a) && jl40.l(this.b, uy21Var.b);
    }

    public final int hashCode() {
        n0t0 n0t0Var = this.a;
        return this.b.hashCode() + ((n0t0Var == null ? 0 : n0t0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "ValidateAutoTopupV2Entity(snackbar=" + this.a + ", errors=" + this.b + Extension.C_BRAKE;
    }
}
