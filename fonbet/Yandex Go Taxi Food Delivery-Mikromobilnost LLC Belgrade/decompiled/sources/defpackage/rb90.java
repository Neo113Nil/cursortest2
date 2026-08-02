package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rb90 {
    public final qb90 a;
    public final String b;

    public rb90(qb90 qb90Var, String str) {
        this.a = qb90Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb90)) {
            return false;
        }
        rb90 rb90Var = (rb90) obj;
        return jl40.l(this.a, rb90Var.a) && this.b.equals(rb90Var.b);
    }

    public final int hashCode() {
        qb90 qb90Var = this.a;
        return this.b.hashCode() + ((qb90Var == null ? 0 : qb90Var.hashCode()) * 31);
    }

    public final String toString() {
        return "PanoramaButtonUiState(iconState=" + this.a + ", contentDescription=" + this.b + Extension.C_BRAKE;
    }
}
