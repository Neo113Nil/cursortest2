package x2;

import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f41867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41868b;

    /* renamed from: c, reason: collision with root package name */
    public final double f41869c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41870d;

    public h(int i, int i4, double d9, boolean z6) {
        this.f41867a = i;
        this.f41868b = i4;
        this.f41869c = d9;
        this.f41870d = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f41867a == hVar.f41867a && this.f41868b == hVar.f41868b && Double.doubleToLongBits(this.f41869c) == Double.doubleToLongBits(hVar.f41869c) && this.f41870d == hVar.f41870d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d9 = this.f41869c;
        return ((((int) (Double.doubleToLongBits(d9) ^ (Double.doubleToLongBits(d9) >>> 32))) ^ ((((this.f41867a ^ 1000003) * 1000003) ^ this.f41868b) * 1000003)) * 1000003) ^ (true != this.f41870d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f41867a;
        int length = String.valueOf(i).length();
        int i4 = this.f41868b;
        int length2 = String.valueOf(i4).length();
        double d9 = this.f41869c;
        int length3 = String.valueOf(d9).length();
        boolean z6 = this.f41870d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z6).length() + 1);
        AbstractC5128c.g(sb, "PingStrategy{maxAttempts=", i, ", initialBackoffMs=", i4);
        sb.append(", backoffMultiplier=");
        sb.append(d9);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z6);
        sb.append("}");
        return sb.toString();
    }
}
