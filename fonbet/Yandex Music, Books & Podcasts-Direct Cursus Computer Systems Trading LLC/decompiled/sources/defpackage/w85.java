package defpackage;

/* loaded from: classes.dex */
public final class w85 extends w4k {
    public final long e;
    public m85 g;
    public float f = 1.0f;
    public final long h = 9205357640488583168L;

    public w85(long j) {
        this.e = j;
    }

    @Override // defpackage.w4k
    public final void a(float f) {
        this.f = f;
    }

    @Override // defpackage.w4k
    public final void c(m85 m85Var) {
        this.g = m85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w85) {
            return d85.c(this.e, ((w85) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.e);
    }

    @Override // defpackage.w4k
    public final long i() {
        return this.h;
    }

    @Override // defpackage.w4k
    public final void j(jpa jpaVar) {
        jpa.B(jpaVar, this.e, 0L, 0L, this.f, this.g, 0, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) d85.i(this.e)) + ')';
    }
}
