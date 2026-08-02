package defpackage;

/* loaded from: classes3.dex */
public final class m2k {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final int g;
    public final float h;
    public final float i;

    public m2k(float f, float f2, float f3, float f4, long j, long j2, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = i;
        float f5 = f * 2;
        this.h = f5;
        this.i = f4 + f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2k)) {
            return false;
        }
        m2k m2kVar = (m2k) obj;
        return Float.compare(this.a, m2kVar.a) == 0 && Float.compare(this.b, m2kVar.b) == 0 && Float.compare(this.c, m2kVar.c) == 0 && Float.compare(this.d, m2kVar.d) == 0 && d85.c(this.e, m2kVar.e) && d85.c(this.f, m2kVar.f) && this.g == m2kVar.g;
    }

    public final int hashCode() {
        int a = eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
        int i = d85.o;
        met metVar = net.b;
        return Integer.hashCode(this.g) + tlm.c(this.f, tlm.c(this.e, a, 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.e);
        String i2 = d85.i(this.f);
        StringBuilder sb = new StringBuilder("PagerIndicatorStyle(defaultIndicatorRadius=");
        sb.append(this.a);
        sb.append(", preEllipsizedIndicatorRadius=");
        sb.append(this.b);
        sb.append(", ellipsizedIndicatorRadius=");
        sb.append(this.c);
        sb.append(", indicatorsSpacing=");
        sb.append(this.d);
        sb.append(", defaultColor=");
        su4.v(sb, i, ", selectedColor=", i2, ", maxVisibleIndicatorsCount=");
        return f1d.i(sb, this.g, ")");
    }
}
