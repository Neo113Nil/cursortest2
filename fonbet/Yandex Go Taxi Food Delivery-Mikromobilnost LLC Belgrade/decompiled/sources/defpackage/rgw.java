package defpackage;

/* loaded from: classes14.dex */
public final class rgw extends tgw implements pgw {
    public final double a;
    public final double b;

    public rgw(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // defpackage.pgw
    public final double a() {
        return this.a;
    }

    @Override // defpackage.pgw
    public final double b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgw)) {
            return false;
        }
        rgw rgwVar = (rgw) obj;
        return Double.compare(this.a, rgwVar.a) == 0 && Double.compare(this.b, rgwVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
