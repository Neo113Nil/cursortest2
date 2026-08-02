package defpackage;

/* loaded from: classes.dex */
public final class rfc extends pa90 {
    public wec A;
    public final long y;
    public float z = 1.0f;
    public final long B = 9205357640488583168L;

    public rfc(long j) {
        this.y = j;
    }

    @Override // defpackage.pa90
    public final boolean a(float f) {
        this.z = f;
        return true;
    }

    @Override // defpackage.pa90
    public final boolean c(wec wecVar) {
        this.A = wecVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rfc) {
            return ldc.c(this.y, ((rfc) obj).y);
        }
        return false;
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.y);
    }

    @Override // defpackage.pa90
    public final long i() {
        return this.B;
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        qam.t0(qamVar, this.y, 0L, 0L, this.z, this.A, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) ldc.i(this.y)) + ')';
    }
}
