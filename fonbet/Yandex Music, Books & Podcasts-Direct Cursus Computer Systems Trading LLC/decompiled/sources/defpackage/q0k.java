package defpackage;

/* loaded from: classes.dex */
public final class q0k implements o0k {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public q0k(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            qme.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.o0k
    public final float a() {
        return this.d;
    }

    @Override // defpackage.o0k
    public final float b(xof xofVar) {
        return xofVar == xof.a ? this.a : this.c;
    }

    @Override // defpackage.o0k
    public final float c(xof xofVar) {
        return xofVar == xof.a ? this.c : this.a;
    }

    @Override // defpackage.o0k
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0k)) {
            return false;
        }
        q0k q0kVar = (q0k) obj;
        return cma.a(this.a, q0kVar.a) && cma.a(this.b, q0kVar.b) && cma.a(this.c, q0kVar.c) && cma.a(this.d, q0kVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        vz1.z(this.a, ", top=", sb);
        vz1.z(this.b, ", end=", sb);
        vz1.z(this.c, ", bottom=", sb);
        sb.append((Object) cma.b(this.d));
        sb.append(')');
        return sb.toString();
    }
}
