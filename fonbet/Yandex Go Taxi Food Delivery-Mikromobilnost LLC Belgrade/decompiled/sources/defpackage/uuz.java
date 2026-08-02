package defpackage;

/* loaded from: classes11.dex */
public final class uuz {
    public final double a;
    public final double b;

    public uuz(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuz)) {
            return false;
        }
        uuz uuzVar = (uuz) obj;
        return Double.compare(this.a, uuzVar.a) == 0 && Double.compare(this.b, uuzVar.b) == 0;
    }

    public final int hashCode() {
        return Integer.hashCode(15) + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "LowLightDetectorConfig(darkOnThresholdMs=", ", darkOffThresholdMs="), this.b, ", windowSize=15)");
    }
}
