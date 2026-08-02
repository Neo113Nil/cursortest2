package defpackage;

/* loaded from: classes.dex */
public final class jkv {
    public final float a;
    public final float b;

    public jkv(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkv)) {
            return false;
        }
        jkv jkvVar = (jkv) obj;
        return Float.compare(this.a, jkvVar.a) == 0 && Float.compare(this.b, jkvVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return ouj.p(sb, this.b, ')');
    }
}
