package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 implements h1.d {

    /* renamed from: g, reason: collision with root package name */
    public final h1.b f8081g = new h1.b();

    /* renamed from: h, reason: collision with root package name */
    public n f8082h;

    @Override // h1.d
    public final a5.c A() {
        return this.f8081g.f2596h;
    }

    @Override // s2.c
    public final float B(long j3) {
        return this.f8081g.B(j3);
    }

    @Override // s2.c
    public final int D(float f10) {
        return this.f8081g.D(f10);
    }

    @Override // h1.d
    public final void G(long j3, long j6, long j10, float f10, int i10) {
        this.f8081g.G(j3, j6, j10, f10, i10);
    }

    @Override // h1.d
    public final long J() {
        return this.f8081g.J();
    }

    @Override // s2.c
    public final long L(long j3) {
        return this.f8081g.L(j3);
    }

    @Override // s2.c
    public final float N(long j3) {
        return this.f8081g.N(j3);
    }

    @Override // s2.c
    public final long U(float f10) {
        return this.f8081g.U(f10);
    }

    @Override // h1.d
    public final void Y(f1.i iVar, f1.d0 d0Var, float f10, h1.c cVar, int i10) {
        this.f8081g.Y(iVar, d0Var, f10, cVar, i10);
    }

    @Override // h1.d
    public final void Z(long j3, long j6, long j10, h1.c cVar, int i10) {
        this.f8081g.Z(j3, j6, j10, cVar, i10);
    }

    public final void a() {
        h1.b bVar = this.f8081g;
        f1.o t3 = bVar.f2596h.t();
        l lVar = this.f8082h;
        if (lVar == null) {
            throw a4.d.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        y0.m mVar = (y0.m) lVar;
        y0.m mVar2 = mVar.f8443g.f8448l;
        if (mVar2 != null && (mVar2.f8446j & 4) != 0) {
            while (mVar2 != null) {
                int i10 = mVar2.f8445i;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    mVar2 = mVar2.f8448l;
                }
            }
        }
        mVar2 = null;
        if (mVar2 == null) {
            f1 t10 = f.t(lVar, 4);
            if (t10.B0() == mVar.f8443g) {
                t10 = t10.f8034v;
                pc.j.b(t10);
            }
            t10.Q0(t3, (i1.b) bVar.f2596h.f261g);
            return;
        }
        o0.e eVar = null;
        while (mVar2 != null) {
            if (mVar2 instanceof n) {
                n nVar = (n) mVar2;
                i1.b bVar2 = (i1.b) bVar.f2596h.f261g;
                f1 t11 = f.t(nVar, 4);
                long F = i7.b.F(t11.f7087i);
                g0 g0Var = t11.f8033u;
                g0Var.getClass();
                ((y1.r) j0.a(g0Var)).getSharedDrawScope().b(t3, F, t11, nVar, bVar2);
            } else if ((mVar2.f8445i & 4) != 0 && (mVar2 instanceof m)) {
                int i11 = 0;
                for (y0.m mVar3 = ((m) mVar2).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                    if ((mVar3.f8445i & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            mVar2 = mVar3;
                        } else {
                            if (eVar == null) {
                                eVar = new o0.e(new y0.m[16]);
                            }
                            if (mVar2 != null) {
                                eVar.b(mVar2);
                                mVar2 = null;
                            }
                            eVar.b(mVar3);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            mVar2 = f.f(eVar);
        }
    }

    public final void b(f1.o oVar, long j3, f1 f1Var, n nVar, i1.b bVar) {
        n nVar2 = this.f8082h;
        this.f8082h = nVar;
        s2.l lVar = f1Var.f8033u.C;
        h1.b bVar2 = this.f8081g;
        a5.c cVar = bVar2.f2596h;
        h1.a aVar = ((h1.b) cVar.f263i).f2595g;
        s2.c cVar2 = aVar.f2591a;
        s2.l lVar2 = aVar.f2592b;
        f1.o t3 = cVar.t();
        a5.c cVar3 = bVar2.f2596h;
        long x10 = cVar3.x();
        i1.b bVar3 = (i1.b) cVar3.f261g;
        cVar3.N(f1Var);
        cVar3.P(lVar);
        cVar3.M(oVar);
        cVar3.Q(j3);
        cVar3.f261g = bVar;
        oVar.k();
        try {
            nVar.b(this);
            oVar.g();
            cVar3.N(cVar2);
            cVar3.P(lVar2);
            cVar3.M(t3);
            cVar3.Q(x10);
            cVar3.f261g = bVar3;
            this.f8082h = nVar2;
        } catch (Throwable th) {
            oVar.g();
            cVar3.N(cVar2);
            cVar3.P(lVar2);
            cVar3.M(t3);
            cVar3.Q(x10);
            cVar3.f261g = bVar3;
            throw th;
        }
    }

    @Override // s2.c
    public final float c() {
        return this.f8081g.c();
    }

    @Override // h1.d
    public final long d() {
        return this.f8081g.d();
    }

    @Override // s2.c
    public final float d0(float f10) {
        return f10 / this.f8081g.c();
    }

    public final void e(f1.i iVar, long j3, h1.c cVar) {
        h1.b bVar = this.f8081g;
        bVar.f2595g.f2593c.j(iVar, h1.b.a(bVar, j3, cVar, 3));
    }

    @Override // h1.d
    public final s2.l getLayoutDirection() {
        return this.f8081g.f2595g.f2592b;
    }

    @Override // s2.c
    public final float m() {
        return this.f8081g.m();
    }

    @Override // h1.d
    public final void u(f1.g gVar, long j3, long j6, long j10, float f10, f1.l lVar, int i10) {
        this.f8081g.u(gVar, j3, j6, j10, f10, lVar, i10);
    }

    @Override // s2.c
    public final long v(float f10) {
        return this.f8081g.v(f10);
    }

    @Override // s2.c
    public final float x(float f10) {
        return this.f8081g.c() * f10;
    }
}
