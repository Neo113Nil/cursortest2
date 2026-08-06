package C1;

import A1.AbstractC0022x;
import A1.C0005f;
import A1.n0;
import F1.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f147a = e.f177p;

    /* renamed from: b, reason: collision with root package name */
    public C0005f f148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f149c;

    public b(c cVar) {
        this.f149c = cVar;
    }

    @Override // A1.n0
    public final void a(F1.u uVar, int i2) {
        C0005f c0005f = this.f148b;
        if (c0005f != null) {
            c0005f.a(uVar, i2);
        }
    }

    public final Object b(D1.f fVar) {
        C0005f c0005f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f155h;
        c cVar = this.f149c;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.r(c.f150c.get(cVar), true)) {
                this.f147a = e.f173l;
                Throwable m2 = cVar.m();
                if (m2 == null) {
                    return Boolean.FALSE;
                }
                int i2 = v.f632a;
                throw m2;
            }
            long andIncrement = c.f151d.getAndIncrement(cVar);
            long j2 = e.f163b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (kVar.f631c != j3) {
                k l2 = cVar.l(j3, kVar);
                if (l2 == null) {
                    continue;
                } else {
                    kVar = l2;
                }
            }
            Object A2 = cVar.A(kVar, i3, andIncrement, null);
            C.j jVar = e.f174m;
            if (A2 == jVar) {
                throw new IllegalStateException("unreachable");
            }
            C.j jVar2 = e.f176o;
            if (A2 == jVar2) {
                if (andIncrement < cVar.p()) {
                    kVar.a();
                }
            } else {
                if (A2 != e.f175n) {
                    kVar.a();
                    this.f147a = A2;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f149c;
                C0005f c2 = AbstractC0022x.c(R1.d.t(fVar));
                try {
                    this.f148b = c2;
                    c0005f = c2;
                    try {
                        Object A3 = cVar2.A(kVar, i3, andIncrement, this);
                        if (A3 == jVar) {
                            a(kVar, i3);
                        } else {
                            F1.p pVar = null;
                            l1.i iVar = c0005f.f48e;
                            t1.l lVar = cVar2.f160b;
                            if (A3 == jVar2) {
                                if (andIncrement < cVar2.p()) {
                                    kVar.a();
                                }
                                k kVar2 = (k) c.f155h.get(cVar2);
                                while (true) {
                                    if (cVar2.r(c.f150c.get(cVar2), true)) {
                                        C0005f c0005f2 = this.f148b;
                                        kotlin.jvm.internal.i.b(c0005f2);
                                        this.f148b = null;
                                        this.f147a = e.f173l;
                                        Throwable m3 = cVar.m();
                                        if (m3 == null) {
                                            c0005f2.i(Boolean.FALSE);
                                        } else {
                                            c0005f2.i(R1.l.h(m3));
                                        }
                                    } else {
                                        long andIncrement2 = c.f151d.getAndIncrement(cVar2);
                                        long j4 = e.f163b;
                                        long j5 = andIncrement2 / j4;
                                        int i4 = (int) (andIncrement2 % j4);
                                        if (kVar2.f631c != j5) {
                                            k l3 = cVar2.l(j5, kVar2);
                                            if (l3 != null) {
                                                kVar2 = l3;
                                            }
                                        }
                                        t1.l lVar2 = lVar;
                                        Object A4 = cVar2.A(kVar2, i4, andIncrement2, this);
                                        if (A4 == e.f174m) {
                                            a(kVar2, i4);
                                            break;
                                        }
                                        if (A4 == e.f176o) {
                                            if (andIncrement2 < cVar2.p()) {
                                                kVar2.a();
                                            }
                                            lVar = lVar2;
                                        } else {
                                            if (A4 == e.f175n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            kVar2.a();
                                            this.f147a = A4;
                                            this.f148b = null;
                                            bool = Boolean.TRUE;
                                            if (lVar2 != null) {
                                                pVar = new F1.p(lVar2, A4, iVar);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kVar.a();
                                this.f147a = A3;
                                this.f148b = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    pVar = new F1.p(lVar, A3, iVar);
                                }
                            }
                            c0005f.e(bool, pVar);
                        }
                        return c0005f.t();
                    } catch (Throwable th) {
                        th = th;
                        c0005f.A();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0005f = c2;
                }
            }
        }
    }
}
