package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class t7k0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public t7k0(boolean z, String str, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7k0)) {
            return false;
        }
        t7k0 t7k0Var = (t7k0) obj;
        return jl40.l(this.a, t7k0Var.a) && this.b == t7k0Var.b && this.c == t7k0Var.c && this.d == t7k0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", isDecreaseEnabled=", Extension.C_BRAKE, oo31.l("PriceSelectorUiState(price=", this.a, ", isLoading=", ", isIncreaseEnabled=", this.b), this.c, this.d);
    }
}
