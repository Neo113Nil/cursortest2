package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q33 extends w4k {
    public final yg0 e;
    public final long f;
    public int g;
    public final long h;
    public float i;
    public m85 j;

    public q33(yg0 yg0Var, long j) {
        int i;
        int i2;
        this.e = yg0Var;
        this.f = j;
        this.g = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > yg0Var.a.getWidth() || i2 > yg0Var.a.getHeight()) {
            xq0.x("Failed requirement.");
            throw null;
        }
        this.h = j;
        this.i = 1.0f;
    }

    @Override // defpackage.w4k
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.w4k
    public final void c(m85 m85Var) {
        this.j = m85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q33)) {
            return false;
        }
        q33 q33Var = (q33) obj;
        return Intrinsics.d(this.e, q33Var.e) && wpe.b(0L, 0L) && hqe.a(this.f, q33Var.f) && this.g == q33Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + tlm.c(this.f, tlm.c(0L, this.e.hashCode() * 31, 31), 31);
    }

    @Override // defpackage.w4k
    public final long i() {
        return nt0.Q(this.h);
    }

    @Override // defpackage.w4k
    public final void j(jpa jpaVar) {
        jpa.j0(jpaVar, this.e, 0L, this.f, 0L, (Math.round(Float.intBitsToFloat((int) (jpaVar.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L))) & 4294967295L), this.i, this.j, this.g, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e);
        sb.append(", srcOffset=");
        sb.append((Object) wpe.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) hqe.b(this.f));
        sb.append(", filterQuality=");
        int i = this.g;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public q33(yg0 yg0Var) {
        this(yg0Var, (yg0Var.a.getHeight() & 4294967295L) | (yg0Var.a.getWidth() << 32));
    }
}
