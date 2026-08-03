package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends y0.m implements x1.v, x1.k {
    public boolean A;
    public boolean C;

    /* renamed from: u, reason: collision with root package name */
    public e0 f7807u;

    /* renamed from: v, reason: collision with root package name */
    public final z0 f7808v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7809w;

    /* renamed from: y, reason: collision with root package name */
    public v1.p f7811y;

    /* renamed from: z, reason: collision with root package name */
    public e1.c f7812z;

    /* renamed from: x, reason: collision with root package name */
    public final b0.j f7810x = new b0.j(1);
    public long B = 0;

    public i(e0 e0Var, z0 z0Var, boolean z10) {
        this.f7807u = e0Var;
        this.f7808v = z0Var;
        this.f7809w = z10;
    }

    public static final float r0(i iVar, d dVar) {
        e1.c cVar;
        int compare;
        if (s2.k.a(iVar.B, 0L)) {
            return 0.0f;
        }
        o0.e eVar = iVar.f7810x.f839a;
        int i10 = eVar.f5136i;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = eVar.f5134g;
            cVar = null;
            while (true) {
                e1.c cVar2 = (e1.c) ((h) objArr[i11]).f7796a.invoke();
                if (cVar2 != null) {
                    long b2 = cVar2.b();
                    long F = i7.b.F(iVar.B);
                    int ordinal = iVar.f7807u.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(e1.e.b(b2), e1.e.b(F));
                    } else {
                        if (ordinal != 1) {
                            throw new ac.d();
                        }
                        compare = Float.compare(e1.e.d(b2), e1.e.d(F));
                    }
                    if (compare <= 0) {
                        cVar = cVar2;
                    } else if (cVar == null) {
                        cVar = cVar2;
                    }
                }
                i11--;
                if (i11 < 0) {
                    break;
                }
            }
        } else {
            cVar = null;
        }
        if (cVar == null) {
            e1.c s02 = iVar.A ? iVar.s0() : null;
            if (s02 == null) {
                return 0.0f;
            }
            cVar = s02;
        }
        long F2 = i7.b.F(iVar.B);
        int ordinal2 = iVar.f7807u.ordinal();
        if (ordinal2 == 0) {
            float f10 = cVar.f1932b;
            return dVar.a(f10, cVar.f1934d - f10, e1.e.b(F2));
        }
        if (ordinal2 != 1) {
            throw new ac.d();
        }
        float f11 = cVar.f1931a;
        return dVar.a(f11, cVar.f1933c - f11, e1.e.d(F2));
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // x1.v
    public final void s(long j3) {
        int f10;
        e1.c s02;
        long j6 = this.B;
        this.B = j3;
        int ordinal = this.f7807u.ordinal();
        if (ordinal == 0) {
            f10 = pc.j.f((int) (j3 & 4294967295L), (int) (4294967295L & j6));
        } else {
            if (ordinal != 1) {
                throw new ac.d();
            }
            f10 = pc.j.f((int) (j3 >> 32), (int) (j6 >> 32));
        }
        if (f10 < 0 && (s02 = s0()) != null) {
            e1.c cVar = this.f7812z;
            if (cVar == null) {
                cVar = s02;
            }
            if (!this.C && !this.A && t0(cVar, j6) && !t0(s02, j3)) {
                this.A = true;
                u0();
            }
            this.f7812z = s02;
        }
    }

    public final e1.c s0() {
        if (this.f8456t) {
            x1.f1 u10 = x1.f.u(this);
            v1.p pVar = this.f7811y;
            if (pVar != null) {
                if (!pVar.z()) {
                    pVar = null;
                }
                if (pVar != null) {
                    return u10.C(pVar, false);
                }
            }
        }
        return null;
    }

    public final boolean t0(e1.c cVar, long j3) {
        long v02 = v0(cVar, j3);
        return Math.abs(e1.b.d(v02)) <= 0.5f && Math.abs(e1.b.e(v02)) <= 0.5f;
    }

    public final void u0() {
        d dVar = (d) x1.f.i(this, g.f7788a);
        if (this.C) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        yc.a0.q(f0(), null, new bd.o(this, new n1(dVar.b()), dVar, null, 5), 1);
    }

    public final long v0(e1.c cVar, long j3) {
        long F = i7.b.F(j3);
        int ordinal = this.f7807u.ordinal();
        if (ordinal == 0) {
            d dVar = (d) x1.f.i(this, g.f7788a);
            float f10 = cVar.f1932b;
            return v6.a.h(0.0f, dVar.a(f10, cVar.f1934d - f10, e1.e.b(F)));
        }
        if (ordinal != 1) {
            throw new ac.d();
        }
        d dVar2 = (d) x1.f.i(this, g.f7788a);
        float f11 = cVar.f1931a;
        return v6.a.h(dVar2.a(f11, cVar.f1933c - f11, e1.e.d(F)), 0.0f);
    }
}
