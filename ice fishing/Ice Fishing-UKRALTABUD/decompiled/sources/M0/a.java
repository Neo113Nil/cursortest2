package M0;

import K0.AbstractC0046w;
import K0.C0030f;
import K0.m0;
import P0.v;
import P0.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a implements m0 {

    /* renamed from: f, reason: collision with root package name */
    public Object f696f = d.f726p;

    /* renamed from: g, reason: collision with root package name */
    public C0030f f697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f698h;

    public a(b bVar) {
        this.f698h = bVar;
    }

    @Override // K0.m0
    public final void a(v vVar, int i2) {
        C0030f c0030f = this.f697g;
        if (c0030f != null) {
            c0030f.a(vVar, i2);
        }
    }

    public final Object b(N0.f fVar) {
        C0030f c0030f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f704m;
        b bVar = this.f698h;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f699h.get(bVar), true)) {
                this.f696f = d.f722l;
                Throwable k2 = bVar.k();
                if (k2 == null) {
                    return Boolean.FALSE;
                }
                int i2 = w.f906a;
                throw k2;
            }
            long andIncrement = b.f700i.getAndIncrement(bVar);
            long j2 = d.f712b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar.f905h != j3) {
                j j4 = bVar.j(j3, jVar);
                if (j4 == null) {
                    continue;
                } else {
                    jVar = j4;
                }
            }
            Object A2 = bVar.A(jVar, i3, andIncrement, null);
            A.j jVar2 = d.f723m;
            if (A2 == jVar2) {
                throw new IllegalStateException("unreachable");
            }
            A.j jVar3 = d.f725o;
            if (A2 == jVar3) {
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
            } else {
                if (A2 != d.f724n) {
                    jVar.a();
                    this.f696f = A2;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f698h;
                C0030f c2 = AbstractC0046w.c(o.g.u(fVar));
                try {
                    this.f697g = c2;
                    c0030f = c2;
                    try {
                        Object A3 = bVar2.A(jVar, i3, andIncrement, this);
                        if (A3 == jVar2) {
                            a(jVar, i3);
                        } else {
                            P0.q qVar = null;
                            v0.i iVar = c0030f.f509j;
                            D0.l lVar = bVar2.f709g;
                            if (A3 == jVar3) {
                                if (andIncrement < bVar2.p()) {
                                    jVar.a();
                                }
                                j jVar4 = (j) b.f704m.get(bVar2);
                                while (true) {
                                    if (bVar2.r(b.f699h.get(bVar2), true)) {
                                        C0030f c0030f2 = this.f697g;
                                        E0.i.b(c0030f2);
                                        this.f697g = null;
                                        this.f696f = d.f722l;
                                        Throwable k3 = bVar.k();
                                        if (k3 == null) {
                                            c0030f2.c(Boolean.FALSE);
                                        } else {
                                            c0030f2.c(o.g.f(k3));
                                        }
                                    } else {
                                        long andIncrement2 = b.f700i.getAndIncrement(bVar2);
                                        long j5 = d.f712b;
                                        long j6 = andIncrement2 / j5;
                                        int i4 = (int) (andIncrement2 % j5);
                                        if (jVar4.f905h != j6) {
                                            j j7 = bVar2.j(j6, jVar4);
                                            if (j7 != null) {
                                                jVar4 = j7;
                                            }
                                        }
                                        D0.l lVar2 = lVar;
                                        Object A4 = bVar2.A(jVar4, i4, andIncrement2, this);
                                        if (A4 == d.f723m) {
                                            a(jVar4, i4);
                                            break;
                                        }
                                        if (A4 == d.f725o) {
                                            if (andIncrement2 < bVar2.p()) {
                                                jVar4.a();
                                            }
                                            lVar = lVar2;
                                        } else {
                                            if (A4 == d.f724n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar4.a();
                                            this.f696f = A4;
                                            this.f697g = null;
                                            bool = Boolean.TRUE;
                                            if (lVar2 != null) {
                                                qVar = new P0.q(lVar2, A4, iVar);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f696f = A3;
                                this.f697g = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    qVar = new P0.q(lVar, A3, iVar);
                                }
                            }
                            c0030f.e(bool, qVar);
                        }
                        return c0030f.u();
                    } catch (Throwable th) {
                        th = th;
                        c0030f.B();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0030f = c2;
                }
            }
        }
    }
}
