package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class y0f0 implements a1f0 {
    public final wp2 a;
    public final Float b;

    public y0f0(wp2 wp2Var, Float f) {
        this.a = wp2Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0f0)) {
            return false;
        }
        y0f0 y0f0Var = (y0f0) obj;
        return jl40.l(this.a, y0f0Var.a) && jl40.l(this.b, y0f0Var.b);
    }

    public final int hashCode() {
        wp2 wp2Var = this.a;
        int hashCode = (wp2Var == null ? 0 : wp2Var.hashCode()) * 31;
        Float f = this.b;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "EmptyLoadingUiState(contentColor=" + this.a + ", contentColorAlpha=" + this.b + Extension.C_BRAKE;
    }
}
