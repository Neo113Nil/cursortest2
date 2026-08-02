package defpackage;

/* loaded from: classes.dex */
public final class iz2 implements g40 {
    public final float a;
    public final float b;

    public iz2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.g40
    public final long a(long j, long j2, xof xofVar) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        xof xofVar2 = xof.a;
        float f3 = this.a;
        if (xofVar != xofVar2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        float f6 = (f4 + this.b) * f2;
        return (Math.round(f6) & 4294967295L) | (Math.round(f5) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz2)) {
            return false;
        }
        iz2 iz2Var = (iz2) obj;
        return Float.compare(this.a, iz2Var.a) == 0 && Float.compare(this.b, iz2Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return ouj.p(sb, this.b, ')');
    }
}
