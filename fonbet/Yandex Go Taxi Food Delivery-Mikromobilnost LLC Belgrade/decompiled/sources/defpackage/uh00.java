package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uh00 {
    public static final uh00 e = new uh00(0.01d, 0.3d, 500, 200);
    public final double a;
    public final double b;
    public final long c;
    public final long d;

    public uh00(double d, double d2, long j, long j2) {
        this.a = d;
        this.b = d2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh00)) {
            return false;
        }
        uh00 uh00Var = (uh00) obj;
        return Double.compare(this.a, uh00Var.a) == 0 && Double.compare(this.b, uh00Var.b) == 0 && this.c == uh00Var.c && this.d == uh00Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qv10.c(unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "MapExplorationConfig(exitAnchorThreshold=", ", enterAnchorThreshold=");
        u.append(this.b);
        x4e.A(this.c, ", longPressTimeoutMs=", ", fadeDurationMs=", u);
        return oyr.n(this.d, Extension.C_BRAKE, u);
    }
}
