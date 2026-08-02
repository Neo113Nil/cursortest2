package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class xt8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ xt8(long j, int i) {
        this((i & 1) != 0 ? -1L : j, -1L, -1L, -1L);
    }

    public static xt8 a(xt8 xt8Var, long j, long j2, long j3, int i) {
        long j4 = xt8Var.a;
        if ((i & 2) != 0) {
            j = xt8Var.b;
        }
        long j5 = j;
        if ((i & 4) != 0) {
            j2 = xt8Var.c;
        }
        long j6 = j2;
        if ((i & 8) != 0) {
            j3 = xt8Var.d;
        }
        xt8Var.getClass();
        return new xt8(j4, j5, j6, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt8)) {
            return false;
        }
        xt8 xt8Var = (xt8) obj;
        return this.a == xt8Var.a && this.b == xt8Var.b && this.c == xt8Var.c && this.d == xt8Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "LoadingTimestamps(startTime=", ", onAuthReceived=");
        w.append(this.b);
        x4e.A(this.c, ", onCareRedirectTime=", ", onWebViewHTMLReceived=", w);
        return oyr.n(this.d, Extension.C_BRAKE, w);
    }

    public xt8() {
        this(0L, 15);
    }

    public xt8(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
