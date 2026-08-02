package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class uq51 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public uq51(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq51)) {
            return false;
        }
        uq51 uq51Var = (uq51) obj;
        return ldc.c(this.a, uq51Var.a) && ldc.c(this.b, uq51Var.b) && ldc.c(this.c, uq51Var.c) && ldc.c(this.d, uq51Var.d);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.d) + qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String i = ldc.i(this.a);
        String i2 = ldc.i(this.b);
        return g8e.r(b64.v("YbCardsColors(frozenBg=", i, ", plusBg=", i2, ", proBg="), ldc.i(this.c), ", proStroke=", ldc.i(this.d), Extension.C_BRAKE);
    }
}
