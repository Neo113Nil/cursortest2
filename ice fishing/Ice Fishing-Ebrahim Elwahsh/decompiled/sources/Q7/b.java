package Q7;

import O7.AbstractC0399y;
import O7.C0382g;
import O7.y0;
import T7.t;
import T7.u;
import T7.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class b implements y0 {

    /* renamed from: n, reason: collision with root package name */
    public Object f2735n = e.f2763p;

    /* renamed from: u, reason: collision with root package name */
    public C0382g f2736u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f2737v;

    public b(c cVar) {
        this.f2737v = cVar;
    }

    @Override // O7.y0
    public final void a(t tVar, int i) {
        C0382g c0382g = this.f2736u;
        if (c0382g != null) {
            c0382g.a(tVar, i);
        }
    }

    public final Object b(R7.d dVar) {
        k kVar;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f2746z;
        c cVar = this.f2737v;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.t(c.f2741u.get(cVar), true)) {
                this.f2735n = e.f2759l;
                Throwable o9 = cVar.o();
                if (o9 == null) {
                    return Boolean.FALSE;
                }
                int i = u.f3167a;
                throw o9;
            }
            long andIncrement = c.f2742v.getAndIncrement(cVar);
            long j9 = e.f2750b;
            long j10 = andIncrement / j9;
            int i4 = (int) (andIncrement % j9);
            if (kVar2.f3166v != j10) {
                kVar = cVar.n(j10, kVar2);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar2;
            }
            Object B8 = cVar.B(kVar, i4, andIncrement, null);
            v vVar = e.f2760m;
            if (B8 == vVar) {
                throw new IllegalStateException("unreachable");
            }
            v vVar2 = e.f2762o;
            if (B8 != vVar2) {
                if (B8 != e.f2761n) {
                    kVar.a();
                    this.f2735n = B8;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f2737v;
                C0382g k6 = AbstractC0399y.k(w8.a.f(dVar));
                try {
                    this.f2736u = k6;
                    Object B9 = cVar2.B(kVar, i4, andIncrement, this);
                    if (B9 == vVar) {
                        a(kVar, i4);
                    } else {
                        if (B9 == vVar2) {
                            if (andIncrement < cVar2.r()) {
                                kVar.a();
                            }
                            k kVar3 = (k) c.f2746z.get(cVar2);
                            while (true) {
                                if (cVar2.t(c.f2741u.get(cVar2), true)) {
                                    C0382g c0382g = this.f2736u;
                                    kotlin.jvm.internal.h.b(c0382g);
                                    this.f2736u = null;
                                    this.f2735n = e.f2759l;
                                    Throwable o10 = cVar.o();
                                    if (o10 == null) {
                                        c0382g.resumeWith(Boolean.FALSE);
                                    } else {
                                        c0382g.resumeWith(com.bumptech.glide.f.e(o10));
                                    }
                                } else {
                                    long andIncrement2 = c.f2742v.getAndIncrement(cVar2);
                                    long j11 = e.f2750b;
                                    long j12 = andIncrement2 / j11;
                                    int i9 = (int) (andIncrement2 % j11);
                                    if (kVar3.f3166v != j12) {
                                        k n9 = cVar2.n(j12, kVar3);
                                        if (n9 != null) {
                                            kVar3 = n9;
                                        }
                                    }
                                    Object B10 = cVar2.B(kVar3, i9, andIncrement2, this);
                                    if (B10 == e.f2760m) {
                                        a(kVar3, i9);
                                        break;
                                    }
                                    if (B10 == e.f2762o) {
                                        if (andIncrement2 < cVar2.r()) {
                                            kVar3.a();
                                        }
                                    } else {
                                        if (B10 == e.f2761n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar3.a();
                                        this.f2735n = B10;
                                        this.f2736u = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f2735n = B9;
                            this.f2736u = null;
                            bool = Boolean.TRUE;
                        }
                        k6.z(bool, null);
                    }
                    Object q6 = k6.q();
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    return q6;
                } catch (Throwable th) {
                    k6.y();
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
