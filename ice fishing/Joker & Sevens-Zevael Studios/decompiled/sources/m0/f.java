package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements a1 {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.n0 f4577g;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f4579i;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4578h = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final u0.a f4580j = new u0.a(0);

    /* renamed from: k, reason: collision with root package name */
    public s.a0 f4581k = new s.a0();

    /* renamed from: l, reason: collision with root package name */
    public s.a0 f4582l = new s.a0();

    public f(androidx.lifecycle.n0 n0Var) {
        this.f4577g = n0Var;
    }

    public final void c(long j3) {
        int i10;
        yc.g gVar;
        Object s10;
        synchronized (this.f4578h) {
            try {
                s.a0 a0Var = this.f4581k;
                this.f4581k = this.f4582l;
                this.f4582l = a0Var;
                u0.a aVar = this.f4580j;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, ((((i10 >>> 27) & 15) + 1) & 15) << 27));
                int i11 = a0Var.f6220b;
                for (int i12 = 0; i12 < i11; i12++) {
                    d dVar = (d) a0Var.e(i12);
                    oc.c cVar = dVar.f4544a;
                    if (cVar != null && (gVar = dVar.f4545b) != null) {
                        try {
                            s10 = cVar.invoke(Long.valueOf(j3));
                        } catch (Throwable th) {
                            s10 = v6.a.s(th);
                        }
                        gVar.resumeWith(s10);
                    }
                }
                a0Var.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fc.i
    public final fc.i d(fc.i iVar) {
        return v6.a.K(this, iVar);
    }

    @Override // fc.i
    public final fc.i g(fc.h hVar) {
        return v6.a.J(this, hVar);
    }

    @Override // fc.i
    public final Object i(Object obj, oc.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // m0.a1
    public final Object l(oc.c cVar, hc.c cVar2) {
        int i10;
        int i11;
        int i12;
        yc.g gVar = new yc.g(1, bc.a0.w(cVar2));
        gVar.q();
        d dVar = new d();
        dVar.f4544a = cVar;
        dVar.f4545b = gVar;
        pc.q qVar = new pc.q();
        qVar.f5681g = -1;
        synchronized (this.f4578h) {
            Throwable th = this.f4579i;
            if (th != null) {
                gVar.resumeWith(v6.a.s(th));
            } else {
                u0.a aVar = this.f4580j;
                do {
                    i10 = aVar.get();
                    i11 = i10 + 1;
                } while (!aVar.compareAndSet(i10, i11));
                boolean z10 = (134217727 & i11) == 1;
                qVar.f5681g = (i11 >>> 27) & 15;
                this.f4581k.a(dVar);
                gVar.s(new e(dVar, this, qVar));
                if (z10) {
                    try {
                        this.f4577g.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f4578h) {
                            try {
                                if (this.f4579i == null) {
                                    this.f4579i = th2;
                                    s.a0 a0Var = this.f4581k;
                                    Object[] objArr = a0Var.f6219a;
                                    int i13 = a0Var.f6220b;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        yc.g gVar2 = ((d) objArr[i14]).f4545b;
                                        if (gVar2 != null) {
                                            gVar2.resumeWith(v6.a.s(th2));
                                        }
                                    }
                                    this.f4581k.c();
                                    u0.a aVar2 = this.f4580j;
                                    do {
                                        i12 = aVar2.get();
                                    } while (!aVar2.compareAndSet(i12, ((((i12 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return gVar.p();
    }

    @Override // fc.i
    public final fc.g v(fc.h hVar) {
        return v6.a.D(this, hVar);
    }
}
