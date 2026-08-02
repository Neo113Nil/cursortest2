package defpackage;

/* loaded from: classes.dex */
public final class nak extends ebk {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public nak(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof nak)) {
            return false;
        }
        nak nakVar = (nak) obj;
        return Float.compare(this.c, nakVar.c) == 0 && Float.compare(this.d, nakVar.d) == 0 && Float.compare(this.e, nakVar.e) == 0 && Float.compare(this.f, nakVar.f) == 0 && Float.compare(this.g, nakVar.g) == 0 && Float.compare(this.h, nakVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + eta.a(eta.a(eta.a(eta.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return ouj.p(sb, this.h, ')');
    }
}
