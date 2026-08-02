package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yyz0 {
    public final long a;
    public final long b;
    public final long c;

    public yyz0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyz0)) {
            return false;
        }
        yyz0 yyz0Var = (yyz0) obj;
        return wu60.c(this.a, yyz0Var.a) && ldc.c(this.b, yyz0Var.b) && this.c == yyz0Var.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = ldc.n;
        return Long.hashCode(this.c) + qv10.c(hashCode, 31, this.b);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, b64.v("TouchEffect(center=", wu60.h(this.a), ", color=", ldc.i(this.b), ", startTime="));
    }
}
