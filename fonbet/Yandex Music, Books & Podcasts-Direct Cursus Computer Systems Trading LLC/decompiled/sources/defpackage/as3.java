package defpackage;

/* loaded from: classes4.dex */
public final class as3 {
    public final long a;
    public final int b;
    public final float c;
    public final float d;

    public as3(float f, float f2, int i, long j) {
        this.a = j;
        this.b = i;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as3)) {
            return false;
        }
        as3 as3Var = (as3) obj;
        return kes.a(this.a, as3Var.a) && this.b == as3Var.b && Float.compare(this.c, as3Var.c) == 0 && Float.compare(this.d, as3Var.d) == 0;
    }

    public final int hashCode() {
        les[] lesVarArr = kes.b;
        return Float.hashCode(this.d) + eta.a(f1d.a(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder l = f1d.l(this.b, "CalculationResult(fontSize=", kes.d(this.a), ", maxLines=", ", lineHeightFactor=");
        l.append(this.c);
        l.append(", letterSpacingFactor=");
        l.append(this.d);
        l.append(")");
        return l.toString();
    }
}
