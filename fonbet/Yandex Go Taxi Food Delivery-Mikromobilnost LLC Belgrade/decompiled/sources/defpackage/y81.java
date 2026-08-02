package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class y81 {
    public final ix0 a;
    public final oq0 b;
    public final n81 c;
    public final v81 d;
    public final String e;
    public final boolean f;

    public y81(ix0 ix0Var, oq0 oq0Var, n81 n81Var, v81 v81Var, String str, boolean z) {
        this.a = ix0Var;
        this.b = oq0Var;
        this.c = n81Var;
        this.d = v81Var;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y81)) {
            return false;
        }
        y81 y81Var = (y81) obj;
        return jl40.l(this.a, y81Var.a) && jl40.l(this.b, y81Var.b) && jl40.l(this.c, y81Var.c) && jl40.l(this.d, y81Var.d) && jl40.l(this.e, y81Var.e) && this.f == y81Var.f;
    }

    public final int hashCode() {
        ix0 ix0Var = this.a;
        int hashCode = (ix0Var == null ? 0 : ix0Var.a.hashCode()) * 31;
        oq0 oq0Var = this.b;
        int hashCode2 = (hashCode + (oq0Var == null ? 0 : oq0Var.hashCode())) * 31;
        n81 n81Var = this.c;
        int hashCode3 = (hashCode2 + (n81Var == null ? 0 : n81Var.hashCode())) * 31;
        v81 v81Var = this.d;
        return Boolean.hashCode(this.f) + unr0.b((hashCode3 + (v81Var != null ? v81Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressUiState(leadUiState=");
        sb.append(this.a);
        sb.append(", bodyUiState=");
        sb.append(this.b);
        sb.append(", trailUiState=");
        sb.append(this.c);
        sb.append(", addressUiAction=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        return nnm.i(this.e, ", isVisible=", Extension.C_BRAKE, sb, this.f);
    }
}
