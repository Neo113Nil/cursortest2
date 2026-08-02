package defpackage;

/* loaded from: classes5.dex */
public final class wa4 {
    public final zzs a;
    public final int b;
    public final int c;
    public final int d;

    public wa4(zzs zzsVar, int i, int i2, int i3) {
        this.a = zzsVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa4)) {
            return false;
        }
        wa4 wa4Var = (wa4) obj;
        return jl40.l(this.a, wa4Var.a) && this.b == wa4Var.b && this.c == wa4Var.c && this.d == wa4Var.d && Float.compare(2.0f, 2.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(2.0f) + oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailableZoneCircleData(geoPoint=");
        sb.append(this.a);
        sb.append(", fillColor=");
        sb.append(this.b);
        sb.append(", strokeColor=");
        return ly3.k(this.c, this.d, ", radius=", ", strokeWidth=2.0)", sb);
    }
}
