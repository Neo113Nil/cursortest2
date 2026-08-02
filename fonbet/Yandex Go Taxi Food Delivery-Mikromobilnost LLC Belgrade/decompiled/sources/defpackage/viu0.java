package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class viu0 implements lhu0 {
    public final CharSequence a;
    public final boolean b;
    public final ihu0 c;
    public final p5l0 d;

    public viu0(String str, boolean z, ihu0 ihu0Var, p5l0 p5l0Var) {
        this.a = str;
        this.b = z;
        this.c = ihu0Var;
        this.d = p5l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viu0)) {
            return false;
        }
        viu0 viu0Var = (viu0) obj;
        return jl40.l(this.a, viu0Var.a) && this.b == viu0Var.b && this.c.equals(viu0Var.c) && jl40.l(this.d, viu0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31;
        p5l0 p5l0Var = this.d;
        return hashCode + (p5l0Var == null ? 0 : p5l0Var.hashCode());
    }

    public final String toString() {
        return "StopsToggleItemUiState(title=" + ((Object) this.a) + ", expanded=" + this.b + ", action=" + this.c + ", routeLine=" + this.d + Extension.C_BRAKE;
    }
}
