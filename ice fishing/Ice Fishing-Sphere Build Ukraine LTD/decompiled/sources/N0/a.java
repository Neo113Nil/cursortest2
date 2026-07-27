package N0;

import L0.AbstractC0064w;
import L0.C0048f;
import L0.m0;
import Q0.v;
import Q0.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a implements m0 {

    /* renamed from: e, reason: collision with root package name */
    public Object f704e = d.f734p;

    /* renamed from: f, reason: collision with root package name */
    public C0048f f705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f706g;

    public a(b bVar) {
        this.f706g = bVar;
    }

    @Override // L0.m0
    public final void a(v vVar, int i2) {
        C0048f c0048f = this.f705f;
        if (c0048f != null) {
            c0048f.a(vVar, i2);
        }
    }

    public final Object b(O0.f fVar) {
        C0048f c0048f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f712l;
        b bVar = this.f706g;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f707g.get(bVar), true)) {
                this.f704e = d.f730l;
                Throwable k2 = bVar.k();
                if (k2 == null) {
                    return Boolean.FALSE;
                }
                int i2 = w.f915a;
                throw k2;
            }
            long andIncrement = b.f708h.getAndIncrement(bVar);
            long j2 = d.f720b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar.f914g != j3) {
                j j4 = bVar.j(j3, jVar);
                if (j4 == null) {
                    continue;
                } else {
                    jVar = j4;
                }
            }
            Object A2 = bVar.A(jVar, i3, andIncrement, null);
            A.j jVar2 = d.f731m;
            if (A2 == jVar2) {
                throw new IllegalStateException("unreachable");
            }
            A.j jVar3 = d.f733o;
            if (A2 == jVar3) {
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
            } else {
                if (A2 != d.f732n) {
                    jVar.a();
                    this.f704e = A2;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f706g;
                C0048f c2 = AbstractC0064w.c(o.g.r(fVar));
                try {
                    this.f705f = c2;
                    c0048f = c2;
                    try {
                        Object A3 = bVar2.A(jVar, i3, andIncrement, this);
                        if (A3 == jVar2) {
                            a(jVar, i3);
                        } else {
                            Q0.q qVar = null;
                            v0.i iVar = c0048f.f657i;
                            D0.l lVar = bVar2.f717f;
                            if (A3 == jVar3) {
                                if (andIncrement < bVar2.p()) {
                                    jVar.a();
                                }
                                j jVar4 = (j) b.f712l.get(bVar2);
                                while (true) {
                                    if (bVar2.r(b.f707g.get(bVar2), true)) {
                                        C0048f c0048f2 = this.f705f;
                                        E0.i.b(c0048f2);
                                        this.f705f = null;
                                        this.f704e = d.f730l;
                                        Throwable k3 = bVar.k();
                                        if (k3 == null) {
                                            c0048f2.c(Boolean.FALSE);
                                        } else {
                                            c0048f2.c(o.g.f(k3));
                                        }
                                    } else {
                                        long andIncrement2 = b.f708h.getAndIncrement(bVar2);
                                        long j5 = d.f720b;
                                        long j6 = andIncrement2 / j5;
                                        int i4 = (int) (andIncrement2 % j5);
                                        if (jVar4.f914g != j6) {
                                            j j7 = bVar2.j(j6, jVar4);
                                            if (j7 != null) {
                                                jVar4 = j7;
                                            }
                                        }
                                        D0.l lVar2 = lVar;
                                        Object A4 = bVar2.A(jVar4, i4, andIncrement2, this);
                                        if (A4 == d.f731m) {
                                            a(jVar4, i4);
                                            break;
                                        }
                                        if (A4 == d.f733o) {
                                            if (andIncrement2 < bVar2.p()) {
                                                jVar4.a();
                                            }
                                            lVar = lVar2;
                                        } else {
                                            if (A4 == d.f732n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar4.a();
                                            this.f704e = A4;
                                            this.f705f = null;
                                            bool = Boolean.TRUE;
                                            if (lVar2 != null) {
                                                qVar = new Q0.q(lVar2, A4, iVar);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f704e = A3;
                                this.f705f = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    qVar = new Q0.q(lVar, A3, iVar);
                                }
                            }
                            c0048f.e(bool, qVar);
                        }
                        return c0048f.u();
                    } catch (Throwable th) {
                        th = th;
                        c0048f.B();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0048f = c2;
                }
            }
        }
    }
}
