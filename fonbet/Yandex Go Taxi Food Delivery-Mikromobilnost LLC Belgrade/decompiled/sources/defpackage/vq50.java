package defpackage;

@gsq0
/* loaded from: classes8.dex */
public final class vq50 {
    public static final uq50 Companion = new uq50();
    public final double a;
    public final double b;
    public final double c;

    public /* synthetic */ vq50(int i, double d, double d2, double d3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, tq50.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq50)) {
            return false;
        }
        vq50 vq50Var = (vq50) obj;
        return Double.compare(this.a, vq50Var.a) == 0 && Double.compare(this.b, vq50Var.b) == 0 && Double.compare(this.c, vq50Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkCoordinatesModel(latitude=");
        sb.append(this.a);
        sb.append(", longitude=");
        sb.append(this.b);
        sb.append(", accuracy=");
        return unr0.q(sb, this.c, ')');
    }

    public vq50(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }
}
