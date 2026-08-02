package defpackage;

/* loaded from: classes.dex */
public final class t5k {
    public final ih0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public t5k(ih0 ih0Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = ih0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final ynn a(ynn ynnVar) {
        return ynnVar.l((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = rds.b;
            if (rds.a(j, j2)) {
                return j2;
            }
        }
        int i = rds.c;
        int i2 = (int) (j >> 32);
        int i3 = this.b;
        return y5g.P(i2 + i3, ((int) (j & 4294967295L)) + i3);
    }

    public final ynn c(ynn ynnVar) {
        float f = -this.f;
        return ynnVar.l((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return yhn.d(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5k)) {
            return false;
        }
        t5k t5kVar = (t5k) obj;
        return this.a.equals(t5kVar.a) && this.b == t5kVar.b && this.c == t5kVar.c && this.d == t5kVar.d && this.e == t5kVar.e && Float.compare(this.f, t5kVar.f) == 0 && Float.compare(this.g, t5kVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + eta.a(f1d.a(this.e, f1d.a(this.d, f1d.a(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return ouj.p(sb, this.g, ')');
    }
}
