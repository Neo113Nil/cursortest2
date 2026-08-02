package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x0f0 implements a1f0 {
    public final CharSequence a;
    public final wp2 b;
    public final boolean c;
    public final adu d;
    public final String e;

    public x0f0(CharSequence charSequence, wp2 wp2Var, boolean z, adu aduVar, String str) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = z;
        this.d = aduVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0f0)) {
            return false;
        }
        x0f0 x0f0Var = (x0f0) obj;
        return jl40.l(this.a, x0f0Var.a) && jl40.l(this.b, x0f0Var.b) && this.c == x0f0Var.c && jl40.l(this.d, x0f0Var.d) && jl40.l(this.e, x0f0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(n.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        adu aduVar = this.d;
        return this.e.hashCode() + ((e + (aduVar == null ? 0 : aduVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultUiState(text=");
        sb.append((Object) this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", isShimmering=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
