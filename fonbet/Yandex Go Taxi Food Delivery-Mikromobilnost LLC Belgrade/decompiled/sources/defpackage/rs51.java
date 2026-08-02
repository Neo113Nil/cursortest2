package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class rs51 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public rs51(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs51)) {
            return false;
        }
        rs51 rs51Var = (rs51) obj;
        return ldc.c(this.a, rs51Var.a) && ldc.c(this.b, rs51Var.b) && ldc.c(this.c, rs51Var.c) && ldc.c(this.d, rs51Var.d);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.d) + qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String i = ldc.i(this.a);
        String i2 = ldc.i(this.b);
        return g8e.r(b64.v("YbNewMainButtonColors(secondaryNormal=", i, ", secondaryPressed=", i2, ", secondaryStaticNormal="), ldc.i(this.c), ", secondaryStaticPressed=", ldc.i(this.d), Extension.C_BRAKE);
    }
}
