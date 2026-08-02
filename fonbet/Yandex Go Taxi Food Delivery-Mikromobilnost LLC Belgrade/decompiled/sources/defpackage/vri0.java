package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vri0 {
    public final boolean a;
    public final int b;
    public final long c;
    public final long d;

    public vri0(int i, long j, long j2, boolean z) {
        this.a = z;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean a() {
        return this.a;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vri0)) {
            return false;
        }
        vri0 vri0Var = (vri0) obj;
        return this.a == vri0Var.a && this.b == vri0Var.b && this.c == vri0Var.c && this.d == vri0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qv10.c(oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder p = xvz.p("RegsConnectionRetryExperimentData(enabled=", this.b, ", maxRetries=", ", initialDelayMs=", this.a);
        p.append(this.c);
        return g8e.l(this.d, ", maxDelayMs=", Extension.C_BRAKE, p);
    }
}
