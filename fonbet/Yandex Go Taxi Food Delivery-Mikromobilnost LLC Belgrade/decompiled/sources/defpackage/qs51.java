package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qs51 {
    public final long a;
    public final long b;
    public final long c;

    public qs51(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs51)) {
            return false;
        }
        qs51 qs51Var = (qs51) obj;
        return ldc.c(this.a, qs51Var.a) && ldc.c(this.b, qs51Var.b) && ldc.c(this.c, qs51Var.c);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String i = ldc.i(this.a);
        String i2 = ldc.i(this.b);
        return oyr.t(b64.v("YbNewMainBackgroundColors(primary=", i, ", primaryStatic=", i2, ", secondaryStatic="), ldc.i(this.c), Extension.C_BRAKE);
    }
}
