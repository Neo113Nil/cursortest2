package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qi4 {
    public final long a;
    public final double b;
    public final long c;
    public final f8x d;

    public qi4(long j, double d, long j2, f8x f8xVar) {
        this.a = j;
        this.b = d;
        this.c = j2;
        this.d = f8xVar;
    }

    public final long a(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        e3n e3nVar = new e3n(e3n.l(Math.pow(this.b, i2), this.a));
        e3n e3nVar2 = new e3n(this.c);
        if (e3nVar.compareTo(e3nVar2) > 0) {
            e3nVar = e3nVar2;
        }
        return this.d.c(e3nVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi4)) {
            return false;
        }
        qi4 qi4Var = (qi4) obj;
        return e3n.d(this.a, qi4Var.a) && Double.compare(this.b, qi4Var.b) == 0 && e3n.d(this.c, qi4Var.c) && this.d.equals(qi4Var.d);
    }

    public final int hashCode() {
        o430 o430Var = e3n.b;
        return this.d.hashCode() + qv10.c(unr0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Exponential(base=" + e3n.p(this.a) + ", factor=" + this.b + ", cap=" + e3n.p(this.c) + ", jitter=" + this.d + Extension.C_BRAKE;
    }
}
