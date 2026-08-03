package z;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r implements v1.e0, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f9026a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.d f9027b;

    public r(g gVar, y0.d dVar) {
        this.f9026a = gVar;
        this.f9027b = dVar;
    }

    @Override // v1.e0
    public final v1.f0 a(x1.o0 o0Var, List list, long j3) {
        return u.l0.m(this, s2.a.i(j3), s2.a.j(j3), s2.a.g(j3), s2.a.h(j3), o0Var.D(this.f9026a.a()), o0Var, list, new v1.j0[list.size()], list.size());
    }

    @Override // z.e0
    public final long b(int i10, int i11, int i12, boolean z10) {
        return !z10 ? s2.b.a(0, i12, i10, i11) : bc.a0.k(0, i12, i10, i11);
    }

    @Override // z.e0
    public final int c(v1.j0 j0Var) {
        return j0Var.f7086h;
    }

    @Override // z.e0
    public final void d(int i10, int[] iArr, int[] iArr2, x1.o0 o0Var) {
        this.f9026a.b(o0Var, i10, iArr, iArr2);
    }

    @Override // z.e0
    public final int e(v1.j0 j0Var) {
        return j0Var.f7085g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return pc.j.a(this.f9026a, rVar.f9026a) && this.f9027b.equals(rVar.f9027b);
    }

    @Override // z.e0
    public final v1.f0 f(v1.j0[] j0VarArr, x1.o0 o0Var, int[] iArr, int i10, int i11) {
        return o0Var.H(i11, i10, bc.w.f1068g, new d1.u(j0VarArr, this, i11, o0Var, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(this.f9027b.f8433a) + (this.f9026a.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f9026a + ", horizontalAlignment=" + this.f9027b + ')';
    }
}
