package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class uri0 {
    public static final tri0 Companion = new tri0();
    public final int a;
    public final long b;
    public final long c;

    public /* synthetic */ uri0(int i, int i2, long j, long j2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, sri0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uri0)) {
            return false;
        }
        uri0 uri0Var = (uri0) obj;
        return this.a == uri0Var.a && this.b == uri0Var.b && this.c == uri0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegsConnectionRetryConfig(maxRetries=");
        sb.append(this.a);
        sb.append(", initialDelayMs=");
        sb.append(this.b);
        return g8e.l(this.c, ", maxDelayMs=", Extension.C_BRAKE, sb);
    }

    public uri0(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }
}
