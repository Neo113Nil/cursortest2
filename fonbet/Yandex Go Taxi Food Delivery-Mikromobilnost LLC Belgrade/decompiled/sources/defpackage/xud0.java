package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class xud0 {
    public static final wud0 Companion = new wud0();
    public final double a;
    public final double b;

    public /* synthetic */ xud0(double d, double d2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, vud0.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xud0)) {
            return false;
        }
        xud0 xud0Var = (xud0) obj;
        return Double.compare(this.a, xud0Var.a) == 0 && Double.compare(this.b, xud0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointResponse(x=");
        sb.append(this.a);
        sb.append(", y=");
        return unr0.q(sb, this.b, ')');
    }
}
