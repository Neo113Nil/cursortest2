package y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f8435a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8436b;

    public f(float f10, float f11) {
        this.f8435a = f10;
        this.f8436b = f11;
    }

    public final long a(long j3, long j6, s2.l lVar) {
        float f10 = (((int) (j6 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f11 = (((int) (j6 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        s2.l lVar2 = s2.l.f6396g;
        float f12 = this.f8435a;
        if (lVar != lVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        float f15 = (f13 + this.f8436b) * f11;
        return (Math.round(f15) & 4294967295L) | (Math.round(f14) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f8435a, fVar.f8435a) == 0 && Float.compare(this.f8436b, fVar.f8436b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8436b) + (Float.hashCode(this.f8435a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f8435a);
        sb.append(", verticalBias=");
        return a4.d.k(sb, this.f8436b, ')');
    }
}
