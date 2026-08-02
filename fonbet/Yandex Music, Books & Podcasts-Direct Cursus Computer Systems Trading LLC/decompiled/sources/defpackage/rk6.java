package defpackage;

/* loaded from: classes3.dex */
public final class rk6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public rk6(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk6)) {
            return false;
        }
        rk6 rk6Var = (rk6) obj;
        return this.a == rk6Var.a && this.b == rk6Var.b && this.c == rk6Var.c && this.d == rk6Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("CoordinateMatrixThresholds(xPositive=", this.a, this.b, ", xNegative=", ", yPositive=");
        l.append(this.c);
        l.append(", yNegative=");
        l.append(this.d);
        l.append(")");
        return l.toString();
    }
}
