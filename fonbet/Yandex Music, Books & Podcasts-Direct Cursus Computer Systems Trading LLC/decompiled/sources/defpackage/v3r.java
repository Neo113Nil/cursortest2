package defpackage;

/* loaded from: classes6.dex */
public final class v3r {
    public final float a;
    public final float b;
    public final float c;

    public v3r(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3r)) {
            return false;
        }
        v3r v3rVar = (v3r) obj;
        return cma.a(this.a, v3rVar.a) && cma.a(this.b, v3rVar.b) && cma.a(this.c, v3rVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + eta.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Spacers(verticalArrangement=");
        vz1.z(this.a, ", horizontalArrangement=", sb);
        vz1.z(this.b, ", labelSpace=", sb);
        sb.append((Object) cma.b(this.c));
        sb.append(')');
        return sb.toString();
    }
}
