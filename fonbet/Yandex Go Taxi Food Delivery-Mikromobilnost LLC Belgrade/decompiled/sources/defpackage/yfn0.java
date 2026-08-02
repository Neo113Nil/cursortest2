package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yfn0 {
    public final r7p0 a;
    public final long b;
    public final int c;
    public final double d;
    public final ysn0 e;
    public final String f;

    public yfn0(r7p0 r7p0Var, long j, int i, double d, ysn0 ysn0Var, String str) {
        this.a = r7p0Var;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = ysn0Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfn0)) {
            return false;
        }
        yfn0 yfn0Var = (yfn0) obj;
        return jl40.l(this.a, yfn0Var.a) && this.b == yfn0Var.b && this.c == yfn0Var.c && Double.compare(this.d, yfn0Var.d) == 0 && jl40.l(this.e, yfn0Var.e) && jl40.l(this.f, yfn0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.a(oyr.b(this.c, qv10.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersDetailedOrderHeader(vehicleNumber=");
        sb.append(this.a);
        sb.append(", remainingTime=");
        sb.append(this.b);
        n.A(sb, ", chargeLevel=", this.c, ", remainingDistance=");
        sb.append(this.d);
        sb.append(", insurance=");
        sb.append(this.e);
        return unr0.r(sb, ", imageTag=", this.f, Extension.C_BRAKE);
    }
}
