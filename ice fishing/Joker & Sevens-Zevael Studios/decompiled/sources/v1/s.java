package v1;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s implements t0, g0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f7121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f7122h;

    public s(a0 a0Var) {
        this.f7122h = a0Var;
        this.f7121g = a0Var.f7059n;
    }

    @Override // s2.c
    public final float B(long j3) {
        return this.f7121g.B(j3);
    }

    @Override // s2.c
    public final int D(float f10) {
        return this.f7121g.D(f10);
    }

    @Override // v1.g0
    public final f0 H(int i10, int i11, Map map, oc.c cVar) {
        return this.f7121g.R(i10, i11, map, null, cVar);
    }

    @Override // s2.c
    public final long L(long j3) {
        return this.f7121g.L(j3);
    }

    @Override // s2.c
    public final float N(long j3) {
        return this.f7121g.N(j3);
    }

    @Override // v1.t0
    public final List O(Object obj, oc.e eVar) {
        a0 a0Var = this.f7122h;
        x1.g0 g0Var = a0Var.f7052g;
        x1.g0 g0Var2 = (x1.g0) a0Var.f7058m.g(obj);
        if (g0Var2 != null && ((o0.b) g0Var.n()).f5128g.i(g0Var2) < a0Var.f7055j) {
            return g0Var2.J.f8103p.T();
        }
        s.g0 g0Var3 = a0Var.f7061p;
        o0.e eVar2 = a0Var.f7064s;
        if (eVar2.f5136i < a0Var.f7056k) {
            u1.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i10 = eVar2.f5136i;
        int i11 = a0Var.f7056k;
        if (i10 == i11) {
            eVar2.b(obj);
        } else {
            Object[] objArr = eVar2.f5134g;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
        }
        a0Var.f7056k++;
        if (g0Var3.b(obj)) {
            x1.g0 g0Var4 = (x1.g0) g0Var3.g(obj);
            t tVar = g0Var4 != null ? (t) a0Var.f7057l.g(g0Var4) : null;
            if (tVar != null && tVar.f7131d) {
                a0Var.h(g0Var4, obj, eVar);
            }
        } else {
            a0Var.f7063r.m(obj, a0Var.f(obj, eVar));
            if (g0Var.J.f8091d == x1.c0.f7982i) {
                g0Var.Q(true);
            } else {
                x1.g0.R(g0Var, true, 6);
            }
        }
        x1.g0 g0Var5 = (x1.g0) g0Var3.g(obj);
        if (g0Var5 == null) {
            return bc.v.f1067g;
        }
        List T = g0Var5.J.f8103p.T();
        o0.b bVar = (o0.b) T;
        int i12 = bVar.f5128g.f5136i;
        for (int i13 = 0; i13 < i12; i13++) {
            ((x1.x0) bVar.get(i13)).f8201l.f8089b = true;
        }
        return T;
    }

    @Override // v1.g0
    public final f0 R(int i10, int i11, Map map, oc.c cVar, oc.c cVar2) {
        return this.f7121g.R(i10, i11, map, cVar, cVar2);
    }

    @Override // s2.c
    public final long U(float f10) {
        return this.f7121g.U(f10);
    }

    @Override // s2.c
    public final float c() {
        return this.f7121g.f7145h;
    }

    @Override // s2.c
    public final float d0(float f10) {
        return f10 / this.f7121g.c();
    }

    @Override // v1.g0
    public final s2.l getLayoutDirection() {
        return this.f7121g.f7144g;
    }

    @Override // s2.c
    public final float m() {
        return this.f7121g.f7146i;
    }

    @Override // v1.g0
    public final boolean t() {
        return this.f7121g.t();
    }

    @Override // s2.c
    public final long v(float f10) {
        return this.f7121g.v(f10);
    }

    @Override // s2.c
    public final float x(float f10) {
        return this.f7121g.c() * f10;
    }
}
