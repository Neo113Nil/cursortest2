package defpackage;

/* loaded from: classes.dex */
public final class ccs {
    public static final ccs c = new ccs(1.0f, 0.0f);
    public final float a;
    public final float b;

    public ccs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccs)) {
            return false;
        }
        ccs ccsVar = (ccs) obj;
        return this.a == ccsVar.a && this.b == ccsVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return ouj.p(sb, this.b, ')');
    }
}
