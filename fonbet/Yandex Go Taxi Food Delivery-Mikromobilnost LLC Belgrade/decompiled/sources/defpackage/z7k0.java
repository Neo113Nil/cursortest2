package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z7k0 {
    public final String a;
    public final String b;

    public z7k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7k0)) {
            return false;
        }
        z7k0 z7k0Var = (z7k0) obj;
        return jl40.l(this.a, z7k0Var.a) && jl40.l(this.b, z7k0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("RidaTariffUnavailableUiState(title=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
