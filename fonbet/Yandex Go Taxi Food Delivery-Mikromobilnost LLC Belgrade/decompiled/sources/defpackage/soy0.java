package defpackage;

/* loaded from: classes.dex */
public final class soy0 {
    public static final soy0 c = new soy0(1.0f, 0.0f);
    public final float a;
    public final float b;

    public soy0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soy0)) {
            return false;
        }
        soy0 soy0Var = (soy0) obj;
        return this.a == soy0Var.a && this.b == soy0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return n.n(sb, this.b, ')');
    }

    public soy0() {
        this(1.0f, 0.0f);
    }
}
