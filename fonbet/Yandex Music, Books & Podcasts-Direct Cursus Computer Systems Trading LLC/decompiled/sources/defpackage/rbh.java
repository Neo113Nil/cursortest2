package defpackage;

/* loaded from: classes3.dex */
public final class rbh extends zdg {
    public final int b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;

    public rbh(int i, float f, boolean z, boolean z2, float f2) {
        super(1);
        this.b = i;
        this.c = f;
        this.d = z;
        this.e = z2;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbh)) {
            return false;
        }
        rbh rbhVar = (rbh) obj;
        return this.b == rbhVar.b && Float.compare(this.c, rbhVar.c) == 0 && this.d == rbhVar.d && this.e == rbhVar.e && Float.compare(this.f, rbhVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + k5r.e(k5r.e(eta.a(Integer.hashCode(this.b) * 31, this.c, 31), 31, this.d), 31, this.e);
    }

    @Override // defpackage.zdg
    public final String toString() {
        StringBuilder sb = new StringBuilder("Particles(color=");
        sb.append(this.b);
        sb.append(", density=");
        sb.append(this.c);
        sb.append(", isAnimated=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        sb.append(this.e);
        sb.append(", particleSize=");
        return ouj.p(sb, this.f, ')');
    }
}
