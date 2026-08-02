package U7;

import E2.C0316m;
import S7.AbstractC0410y;
import S7.C0393g;
import S7.y0;
import X7.t;
import X7.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class b implements y0 {

    /* renamed from: n, reason: collision with root package name */
    public Object f3346n = e.f3374p;

    /* renamed from: u, reason: collision with root package name */
    public C0393g f3347u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f3348v;

    public b(c cVar) {
        this.f3348v = cVar;
    }

    @Override // S7.y0
    public final void a(t tVar, int i) {
        C0393g c0393g = this.f3347u;
        if (c0393g != null) {
            c0393g.a(tVar, i);
        }
    }

    public final Object b(V7.d dVar) {
        k kVar;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f3357z;
        c cVar = this.f3348v;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.t(c.f3352u.get(cVar), true)) {
                this.f3346n = e.f3370l;
                Throwable o4 = cVar.o();
                if (o4 == null) {
                    return Boolean.FALSE;
                }
                int i = u.f3816a;
                throw o4;
            }
            long andIncrement = c.f3353v.getAndIncrement(cVar);
            long j6 = e.f3361b;
            long j9 = andIncrement / j6;
            int i4 = (int) (andIncrement % j6);
            if (kVar2.f3815v != j9) {
                kVar = cVar.n(j9, kVar2);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar2;
            }
            Object B3 = cVar.B(kVar, i4, andIncrement, null);
            C0316m c0316m = e.f3371m;
            if (B3 == c0316m) {
                throw new IllegalStateException("unreachable");
            }
            C0316m c0316m2 = e.f3373o;
            if (B3 != c0316m2) {
                if (B3 != e.f3372n) {
                    kVar.a();
                    this.f3346n = B3;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f3348v;
                C0393g k9 = AbstractC0410y.k(A8.b.n(dVar));
                try {
                    this.f3347u = k9;
                    Object B9 = cVar2.B(kVar, i4, andIncrement, this);
                    if (B9 == c0316m) {
                        a(kVar, i4);
                    } else {
                        if (B9 == c0316m2) {
                            if (andIncrement < cVar2.r()) {
                                kVar.a();
                            }
                            k kVar3 = (k) c.f3357z.get(cVar2);
                            while (true) {
                                if (cVar2.t(c.f3352u.get(cVar2), true)) {
                                    C0393g c0393g = this.f3347u;
                                    kotlin.jvm.internal.h.b(c0393g);
                                    this.f3347u = null;
                                    this.f3346n = e.f3370l;
                                    Throwable o6 = cVar.o();
                                    if (o6 == null) {
                                        c0393g.resumeWith(Boolean.FALSE);
                                    } else {
                                        c0393g.resumeWith(Q3.b.b(o6));
                                    }
                                } else {
                                    long andIncrement2 = c.f3353v.getAndIncrement(cVar2);
                                    long j10 = e.f3361b;
                                    long j11 = andIncrement2 / j10;
                                    int i6 = (int) (andIncrement2 % j10);
                                    if (kVar3.f3815v != j11) {
                                        k n9 = cVar2.n(j11, kVar3);
                                        if (n9 != null) {
                                            kVar3 = n9;
                                        }
                                    }
                                    Object B10 = cVar2.B(kVar3, i6, andIncrement2, this);
                                    if (B10 == e.f3371m) {
                                        a(kVar3, i6);
                                        break;
                                    }
                                    if (B10 == e.f3373o) {
                                        if (andIncrement2 < cVar2.r()) {
                                            kVar3.a();
                                        }
                                    } else {
                                        if (B10 == e.f3372n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar3.a();
                                        this.f3346n = B10;
                                        this.f3347u = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f3346n = B9;
                            this.f3347u = null;
                            bool = Boolean.TRUE;
                        }
                        k9.z(bool, null);
                    }
                    Object q8 = k9.q();
                    A7.a aVar = A7.a.f215n;
                    return q8;
                } catch (Throwable th) {
                    k9.y();
                    throw th;
                }
            }
            if (andIncrement < cVar.r()) {
                kVar.a();
            }
            kVar2 = kVar;
        }
    }
}
