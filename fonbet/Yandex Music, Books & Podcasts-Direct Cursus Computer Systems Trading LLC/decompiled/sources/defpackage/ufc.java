package defpackage;

/* loaded from: classes.dex */
public final class ufc implements opv {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ufc(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.opv
    public final int a(jx7 jx7Var) {
        return jx7Var.L(this.b);
    }

    @Override // defpackage.opv
    public final int b(jx7 jx7Var, xof xofVar) {
        return jx7Var.L(this.c);
    }

    @Override // defpackage.opv
    public final int c(jx7 jx7Var) {
        return jx7Var.L(this.d);
    }

    @Override // defpackage.opv
    public final int d(jx7 jx7Var, xof xofVar) {
        return jx7Var.L(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufc)) {
            return false;
        }
        ufc ufcVar = (ufc) obj;
        return cma.a(this.a, ufcVar.a) && cma.a(this.b, ufcVar.b) && cma.a(this.c, ufcVar.c) && cma.a(this.d, ufcVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        vz1.z(this.a, ", top=", sb);
        vz1.z(this.b, ", right=", sb);
        vz1.z(this.c, ", bottom=", sb);
        sb.append((Object) cma.b(this.d));
        sb.append(')');
        return sb.toString();
    }
}
