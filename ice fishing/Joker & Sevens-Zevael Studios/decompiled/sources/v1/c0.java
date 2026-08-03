package v1;

import x1.f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 implements p {

    /* renamed from: g, reason: collision with root package name */
    public final x1.p0 f7072g;

    public c0(x1.p0 p0Var) {
        this.f7072g = p0Var;
    }

    @Override // v1.p
    public final e1.c C(p pVar, boolean z10) {
        return this.f7072g.f8141u.C(pVar, z10);
    }

    @Override // v1.p
    public final long E() {
        x1.p0 p0Var = this.f7072g;
        return (p0Var.f7085g << 32) | (p0Var.f7086h & 4294967295L);
    }

    public final long a() {
        x1.p0 p0Var = this.f7072g;
        x1.p0 h10 = p0.h(p0Var);
        return e1.b.f(c(h10.f8144x, 0L), p0Var.f8141u.K0(h10.f8141u, 0L));
    }

    @Override // v1.p
    public final long b(long j3) {
        return this.f7072g.f8141u.b(e1.b.g(0L, a()));
    }

    public final long c(p pVar, long j3) {
        boolean z10 = pVar instanceof c0;
        x1.p0 p0Var = this.f7072g;
        if (!z10) {
            x1.p0 h10 = p0.h(p0Var);
            f1 f1Var = h10.f8141u;
            long c3 = c(h10.f8144x, j3);
            long j6 = h10.f8142v;
            long f10 = e1.b.f(c3, (4294967295L & Float.floatToRawIntBits((int) (j6 & 4294967295L))) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32));
            if (!f1Var.B0().f8456t) {
                u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            f1Var.M0();
            f1 f1Var2 = f1Var.f8035w;
            if (f1Var2 != null) {
                f1Var = f1Var2;
            }
            return e1.b.g(f10, f1Var.K0(pVar, 0L));
        }
        x1.p0 p0Var2 = ((c0) pVar).f7072g;
        f1 f1Var3 = p0Var2.f8141u;
        f1Var3.M0();
        x1.p0 z02 = p0Var.f8141u.x0(f1Var3).z0();
        if (z02 != null) {
            long b2 = s2.i.b(s2.i.c(p0Var2.t0(z02, false), x4.f.T(j3)), p0Var.t0(z02, false));
            return (Float.floatToRawIntBits((int) (b2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L);
        }
        x1.p0 h11 = p0.h(p0Var2);
        long c7 = s2.i.c(s2.i.c(p0Var2.t0(h11, false), h11.f8142v), x4.f.T(j3));
        x1.p0 h12 = p0.h(p0Var);
        long b10 = s2.i.b(c7, s2.i.c(p0Var.t0(h12, false), h12.f8142v));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b10 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b10 & 4294967295L)) & 4294967295L;
        f1 f1Var4 = h12.f8141u.f8035w;
        pc.j.b(f1Var4);
        f1 f1Var5 = h11.f8141u.f8035w;
        pc.j.b(f1Var5);
        return f1Var4.K0(f1Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // v1.p
    public final long f(long j3) {
        return this.f7072g.f8141u.f(e1.b.g(j3, a()));
    }

    @Override // v1.p
    public final long h(p pVar, long j3) {
        return c(pVar, j3);
    }

    @Override // v1.p
    public final p i() {
        x1.p0 z02;
        if (!z()) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f1 f1Var = this.f7072g.f8141u.f8033u.I.f7989d.f8035w;
        if (f1Var == null || (z02 = f1Var.z0()) == null) {
            return null;
        }
        return z02.f8144x;
    }

    @Override // v1.p
    public final boolean z() {
        return this.f7072g.f8141u.B0().f8456t;
    }
}
