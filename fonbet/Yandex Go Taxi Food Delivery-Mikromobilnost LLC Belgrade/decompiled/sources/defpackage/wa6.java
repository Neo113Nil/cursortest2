package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wa6 {
    public final long a;
    public final double b;

    public wa6(long j, double d) {
        this.a = j;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa6)) {
            return false;
        }
        wa6 wa6Var = (wa6) obj;
        return ldc.c(this.a, wa6Var.a) && Double.compare(this.b, wa6Var.b) == 0;
    }

    public final int hashCode() {
        int i = ldc.n;
        return Double.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderState(color=" + ldc.i(this.a) + ", width=" + this.b + Extension.C_BRAKE;
    }
}
