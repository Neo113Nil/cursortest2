package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sex0 implements tex0 {
    public final int a;
    public final wp2 b;
    public final Float c;

    public sex0(int i, wp2 wp2Var, Float f) {
        this.a = i;
        this.b = wp2Var;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sex0)) {
            return false;
        }
        sex0 sex0Var = (sex0) obj;
        return this.a == sex0Var.a && jl40.l(this.b, sex0Var.b) && jl40.l(this.c, sex0Var.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        wp2 wp2Var = this.b;
        int hashCode2 = (hashCode + (wp2Var == null ? 0 : wp2Var.hashCode())) * 31;
        Float f = this.c;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "EmptyLoadingUiState(bottomPadding=" + this.a + ", contentColor=" + this.b + ", contentColorAlpha=" + this.c + Extension.C_BRAKE;
    }
}
