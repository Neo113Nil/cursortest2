package defpackage;

/* loaded from: classes2.dex */
public final class woc0 {
    public final double a;
    public final double b;

    public woc0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woc0)) {
            return false;
        }
        woc0 woc0Var = (woc0) obj;
        return Double.compare(this.a, woc0Var.a) == 0 && Double.compare(this.b, woc0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaquePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return unr0.q(sb, this.b, ')');
    }
}
