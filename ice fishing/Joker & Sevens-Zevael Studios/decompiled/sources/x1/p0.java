package x1;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class p0 extends o0 implements v1.d0 {

    /* renamed from: u, reason: collision with root package name */
    public final f1 f8141u;

    /* renamed from: w, reason: collision with root package name */
    public LinkedHashMap f8143w;

    /* renamed from: y, reason: collision with root package name */
    public v1.f0 f8145y;

    /* renamed from: z, reason: collision with root package name */
    public final s.z f8146z;

    /* renamed from: v, reason: collision with root package name */
    public long f8142v = 0;

    /* renamed from: x, reason: collision with root package name */
    public final v1.c0 f8144x = new v1.c0(this);

    public p0(f1 f1Var) {
        this.f8141u = f1Var;
        s.z zVar = s.k0.f6300a;
        this.f8146z = new s.z();
    }

    public static final void q0(p0 p0Var, v1.f0 f0Var) {
        LinkedHashMap linkedHashMap;
        if (f0Var != null) {
            p0Var.Q((f0Var.c() & 4294967295L) | (f0Var.e() << 32));
        } else {
            p0Var.Q(0L);
        }
        if (!pc.j.a(p0Var.f8145y, f0Var) && f0Var != null && ((((linkedHashMap = p0Var.f8143w) != null && !linkedHashMap.isEmpty()) || !f0Var.a().isEmpty()) && !pc.j.a(f0Var.a(), p0Var.f8143w))) {
            t0 t0Var = p0Var.f8141u.f8033u.J.f8104q;
            pc.j.b(t0Var);
            t0Var.f8177w.f();
            LinkedHashMap linkedHashMap2 = p0Var.f8143w;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                p0Var.f8143w = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(f0Var.a());
        }
        p0Var.f8145y = f0Var;
    }

    @Override // v1.j0
    public final void P(long j3, float f10, oc.c cVar) {
        s0(j3);
        if (this.f8125p) {
            return;
        }
        r0();
    }

    @Override // s2.c
    public final float c() {
        return this.f8141u.c();
    }

    @Override // x1.o0
    public final o0 f0() {
        f1 f1Var = this.f8141u.f8034v;
        if (f1Var != null) {
            return f1Var.z0();
        }
        return null;
    }

    @Override // v1.j0, v1.d0
    public final Object g() {
        return this.f8141u.g();
    }

    @Override // x1.o0
    public final v1.p g0() {
        return this.f8144x;
    }

    @Override // v1.g0
    public final s2.l getLayoutDirection() {
        return this.f8141u.f8033u.C;
    }

    @Override // x1.o0
    public final boolean h0() {
        return this.f8145y != null;
    }

    @Override // x1.o0
    public final g0 i0() {
        return this.f8141u.f8033u;
    }

    @Override // x1.o0
    public final v1.f0 j0() {
        v1.f0 f0Var = this.f8145y;
        if (f0Var != null) {
            return f0Var;
        }
        throw a4.d.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // x1.o0
    public final o0 k0() {
        f1 f1Var = this.f8141u.f8035w;
        if (f1Var != null) {
            return f1Var.z0();
        }
        return null;
    }

    @Override // x1.o0
    public final long l0() {
        return this.f8142v;
    }

    @Override // s2.c
    public final float m() {
        return this.f8141u.m();
    }

    @Override // x1.o0
    public final void p0() {
        P(this.f8142v, 0.0f, null);
    }

    public void r0() {
        j0().b();
    }

    public final void s0(long j3) {
        if (!s2.i.a(this.f8142v, j3)) {
            this.f8142v = j3;
            f1 f1Var = this.f8141u;
            t0 t0Var = f1Var.f8033u.J.f8104q;
            if (t0Var != null) {
                t0Var.X();
            }
            o0.n0(f1Var);
        }
        if (this.f8126q) {
            return;
        }
        a0(j0());
    }

    @Override // x1.o0, v1.g0
    public final boolean t() {
        return true;
    }

    public final long t0(p0 p0Var, boolean z10) {
        long j3 = 0;
        p0 p0Var2 = this;
        while (!p0Var2.equals(p0Var)) {
            if (!p0Var2.f8124o || !z10) {
                j3 = s2.i.c(j3, p0Var2.f8142v);
            }
            f1 f1Var = p0Var2.f8141u.f8035w;
            pc.j.b(f1Var);
            p0Var2 = f1Var.z0();
            pc.j.b(p0Var2);
        }
        return j3;
    }
}
