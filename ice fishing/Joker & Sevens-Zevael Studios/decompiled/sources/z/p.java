package z;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p implements v1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0.f f9001a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9002b;

    public p(y0.f fVar, boolean z10) {
        this.f9001a = fVar;
        this.f9002b = z10;
    }

    @Override // v1.e0
    public final v1.f0 a(x1.o0 o0Var, List list, long j3) {
        int j6;
        int i10;
        v1.j0 e10;
        boolean isEmpty = list.isEmpty();
        bc.w wVar = bc.w.f1068g;
        if (isEmpty) {
            return o0Var.H(s2.a.j(j3), s2.a.i(j3), wVar, k.f8969i);
        }
        long a6 = this.f9002b ? j3 : s2.a.a(j3, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            v1.d0 d0Var = (v1.d0) list.get(0);
            Object g8 = d0Var.g();
            j jVar = g8 instanceof j ? (j) g8 : null;
            if (jVar != null ? jVar.f8966v : false) {
                j6 = s2.a.j(j3);
                i10 = s2.a.i(j3);
                int j10 = s2.a.j(j3);
                int i11 = s2.a.i(j3);
                if (!((i11 >= 0) & (j10 >= 0))) {
                    s2.h.a("width and height must be >= 0");
                }
                e10 = d0Var.e(s2.b.g(j10, j10, i11, i11));
            } else {
                e10 = d0Var.e(a6);
                j6 = Math.max(s2.a.j(j3), e10.f7085g);
                i10 = Math.max(s2.a.i(j3), e10.f7086h);
            }
            int i12 = i10;
            int i13 = j6;
            return o0Var.H(i13, i12, wVar, new n(e10, d0Var, o0Var, i13, i12, this));
        }
        v1.j0[] j0VarArr = new v1.j0[list.size()];
        pc.q qVar = new pc.q();
        qVar.f5681g = s2.a.j(j3);
        pc.q qVar2 = new pc.q();
        qVar2.f5681g = s2.a.i(j3);
        int size = list.size();
        boolean z10 = false;
        for (int i14 = 0; i14 < size; i14++) {
            v1.d0 d0Var2 = (v1.d0) list.get(i14);
            Object g10 = d0Var2.g();
            j jVar2 = g10 instanceof j ? (j) g10 : null;
            if (jVar2 != null ? jVar2.f8966v : false) {
                z10 = true;
            } else {
                v1.j0 e11 = d0Var2.e(a6);
                j0VarArr[i14] = e11;
                qVar.f5681g = Math.max(qVar.f5681g, e11.f7085g);
                qVar2.f5681g = Math.max(qVar2.f5681g, e11.f7086h);
            }
        }
        if (z10) {
            int i15 = qVar.f5681g;
            int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
            int i17 = qVar2.f5681g;
            long a8 = s2.b.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
            int size2 = list.size();
            for (int i18 = 0; i18 < size2; i18++) {
                v1.d0 d0Var3 = (v1.d0) list.get(i18);
                Object g11 = d0Var3.g();
                j jVar3 = g11 instanceof j ? (j) g11 : null;
                if (jVar3 != null ? jVar3.f8966v : false) {
                    j0VarArr[i18] = d0Var3.e(a8);
                }
            }
        }
        return o0Var.H(qVar.f5681g, qVar2.f5681g, wVar, new o(j0VarArr, list, o0Var, qVar, qVar2, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f9001a.equals(pVar.f9001a) && this.f9002b == pVar.f9002b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9002b) + (this.f9001a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f9001a + ", propagateMinConstraints=" + this.f9002b + ')';
    }
}
