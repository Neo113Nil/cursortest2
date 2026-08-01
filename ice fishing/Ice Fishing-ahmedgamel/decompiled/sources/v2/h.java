package v2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f41413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41414b;

    /* renamed from: c, reason: collision with root package name */
    public final double f41415c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41416d;

    public h(int i, int i6, double d2, boolean z3) {
        this.f41413a = i;
        this.f41414b = i6;
        this.f41415c = d2;
        this.f41416d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f41413a == hVar.f41413a && this.f41414b == hVar.f41414b && Double.doubleToLongBits(this.f41415c) == Double.doubleToLongBits(hVar.f41415c) && this.f41416d == hVar.f41416d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d2 = this.f41415c;
        return ((((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32))) ^ ((((this.f41413a ^ 1000003) * 1000003) ^ this.f41414b) * 1000003)) * 1000003) ^ (true != this.f41416d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f41413a;
        int length = String.valueOf(i).length();
        int i6 = this.f41414b;
        int length2 = String.valueOf(i6).length();
        double d2 = this.f41415c;
        int length3 = String.valueOf(d2).length();
        boolean z3 = this.f41416d;
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
