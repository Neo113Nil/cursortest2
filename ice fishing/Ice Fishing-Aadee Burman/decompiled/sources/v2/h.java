package v2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f41410a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41411b;

    /* renamed from: c, reason: collision with root package name */
    public final double f41412c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41413d;

    public h(int i, int i6, double d2, boolean z3) {
        this.f41410a = i;
        this.f41411b = i6;
        this.f41412c = d2;
        this.f41413d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f41410a == hVar.f41410a && this.f41411b == hVar.f41411b && Double.doubleToLongBits(this.f41412c) == Double.doubleToLongBits(hVar.f41412c) && this.f41413d == hVar.f41413d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d2 = this.f41412c;
        return ((((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32))) ^ ((((this.f41410a ^ 1000003) * 1000003) ^ this.f41411b) * 1000003)) * 1000003) ^ (true != this.f41413d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f41410a;
        int length = String.valueOf(i).length();
        int i6 = this.f41411b;
        int length2 = String.valueOf(i6).length();
        double d2 = this.f41412c;
        int length3 = String.valueOf(d2).length();
        boolean z3 = this.f41413d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z3).length() + 1);
        u1.h.h(sb, "PingStrategy{maxAttempts=", i, ", initialBackoffMs=", i6);
        sb.append(", backoffMultiplier=");
        sb.append(d2);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
