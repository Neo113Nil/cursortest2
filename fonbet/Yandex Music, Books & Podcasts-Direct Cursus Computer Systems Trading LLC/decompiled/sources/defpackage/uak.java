package defpackage;

/* loaded from: classes.dex */
public final class uak extends ebk {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public uak(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uak)) {
            return false;
        }
        uak uakVar = (uak) obj;
        return Float.compare(this.c, uakVar.c) == 0 && Float.compare(this.d, uakVar.d) == 0 && Float.compare(this.e, uakVar.e) == 0 && this.f == uakVar.f && this.g == uakVar.g && Float.compare(this.h, uakVar.h) == 0 && Float.compare(this.i, uakVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + eta.a(k5r.e(k5r.e(eta.a(eta.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), 31, this.f), 31, this.g), this.h, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return ouj.p(sb, this.i, ')');
    }
}
