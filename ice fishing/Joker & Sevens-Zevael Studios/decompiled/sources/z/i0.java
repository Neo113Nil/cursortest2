package z;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 implements v1.e0, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f8963a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.e f8964b;

    public i0(d dVar, y0.e eVar) {
        this.f8963a = dVar;
        this.f8964b = eVar;
    }

    @Override // v1.e0
    public final v1.f0 a(x1.o0 o0Var, List list, long j3) {
        return u.l0.m(this, s2.a.j(j3), s2.a.i(j3), s2.a.h(j3), s2.a.g(j3), o0Var.D(this.f8963a.a()), o0Var, list, new v1.j0[list.size()], list.size());
    }

    @Override // z.e0
    public final long b(int i10, int i11, int i12, boolean z10) {
        return !z10 ? s2.b.a(i10, i11, 0, i12) : bc.a0.l(i10, i11, 0, i12);
    }

    @Override // z.e0
    public final int c(v1.j0 j0Var) {
        return j0Var.f7085g;
    }

    @Override // z.e0
    public final void d(int i10, int[] iArr, int[] iArr2, x1.o0 o0Var) {
        this.f8963a.c(o0Var, i10, iArr, o0Var.getLayoutDirection(), iArr2);
    }

    @Override // z.e0
    public final int e(v1.j0 j0Var) {
        return j0Var.f7086h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return pc.j.a(this.f8963a, i0Var.f8963a) && this.f8964b.equals(i0Var.f8964b);
    }

    @Override // z.e0
    public final v1.f0 f(v1.j0[] j0VarArr, x1.o0 o0Var, int[] iArr, int i10, int i11) {
        return o0Var.H(i10, i11, bc.w.f1068g, new h0(j0VarArr, this, i11, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(this.f8964b.f8434a) + (this.f8963a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f8963a + ", verticalAlignment=" + this.f8964b + ')';
    }
}
