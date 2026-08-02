package defpackage;

/* loaded from: classes.dex */
public final class vak extends ebk {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public vak(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vak)) {
            return false;
        }
        vak vakVar = (vak) obj;
        return Float.compare(this.c, vakVar.c) == 0 && Float.compare(this.d, vakVar.d) == 0 && Float.compare(this.e, vakVar.e) == 0 && Float.compare(this.f, vakVar.f) == 0 && Float.compare(this.g, vakVar.g) == 0 && Float.compare(this.h, vakVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + eta.a(eta.a(eta.a(eta.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return ouj.p(sb, this.h, ')');
    }
}
