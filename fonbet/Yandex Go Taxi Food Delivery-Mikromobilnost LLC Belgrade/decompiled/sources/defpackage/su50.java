package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class su50 {
    public static final ru50 Companion = new ru50();
    public final double a;
    public final double b;

    public /* synthetic */ su50(double d, double d2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, qu50.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su50)) {
            return false;
        }
        su50 su50Var = (su50) obj;
        return Double.compare(this.a, su50Var.a) == 0 && Double.compare(this.b, su50Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkGradientPointModel(x=");
        sb.append(this.a);
        sb.append(", y=");
        return unr0.q(sb, this.b, ')');
    }
}
