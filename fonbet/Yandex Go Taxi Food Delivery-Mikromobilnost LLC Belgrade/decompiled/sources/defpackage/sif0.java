package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sif0 implements hmm {
    public final double a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final double f;
    public final h901 g;
    public final boolean h;

    public sif0(double d, String str, long j, String str2, String str3, double d2, h901 h901Var, boolean z) {
        this.a = d;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = d2;
        this.g = h901Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sif0)) {
            return false;
        }
        sif0 sif0Var = (sif0) obj;
        return Double.compare(this.a, sif0Var.a) == 0 && jl40.l(this.b, sif0Var.b) && this.c == sif0Var.c && jl40.l(this.d, sif0Var.d) && this.e.equals(sif0Var.e) && Double.compare(this.f, sif0Var.f) == 0 && jl40.l(this.g, sif0Var.g) && this.h == sif0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + unr0.a(unr0.b(unr0.b(qv10.c(unr0.b(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressContent(remainingDistanceInMetres=");
        sb.append(this.a);
        sb.append(", remainingDistance=");
        sb.append(this.b);
        x4e.A(this.c, ", remainingTimeInSeconds=", ", remainingTime=", sb);
        g8e.D(sb, this.d, ", arrivalTime=", this.e, ", progress=");
        sb.append(this.f);
        sb.append(", trafficLineContent=");
        sb.append(this.g);
        return xra1.a(sb, ", isTrafficLineUpdated=", this.h, Extension.C_BRAKE);
    }
}
