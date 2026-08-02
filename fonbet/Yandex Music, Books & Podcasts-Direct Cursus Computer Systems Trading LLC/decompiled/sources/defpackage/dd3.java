package defpackage;

/* loaded from: classes.dex */
public final class dd3 {
    public final float a;
    public final f3r b;

    public dd3(float f, f3r f3rVar) {
        this.a = f;
        this.b = f3rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd3)) {
            return false;
        }
        dd3 dd3Var = (dd3) obj;
        return cma.a(this.a, dd3Var.a) && this.b.equals(dd3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        vz1.z(this.a, ", brush=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
