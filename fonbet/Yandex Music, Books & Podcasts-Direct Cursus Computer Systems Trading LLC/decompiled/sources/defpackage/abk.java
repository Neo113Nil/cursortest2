package defpackage;

/* loaded from: classes.dex */
public final class abk extends ebk {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public abk(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abk)) {
            return false;
        }
        abk abkVar = (abk) obj;
        return Float.compare(this.c, abkVar.c) == 0 && Float.compare(this.d, abkVar.d) == 0 && Float.compare(this.e, abkVar.e) == 0 && Float.compare(this.f, abkVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + eta.a(eta.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return ouj.p(sb, this.f, ')');
    }
}
