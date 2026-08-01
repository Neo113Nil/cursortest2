package U7;

import S7.AbstractC0406y;
import S7.C0389g;
import S7.y0;
import X7.t;
import X7.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class b implements y0 {

    /* renamed from: n, reason: collision with root package name */
    public Object f3223n = e.f3251p;

    /* renamed from: u, reason: collision with root package name */
    public C0389g f3224u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f3225v;

    public b(c cVar) {
        this.f3225v = cVar;
    }

    @Override // S7.y0
    public final void a(t tVar, int i) {
        C0389g c0389g = this.f3224u;
        if (c0389g != null) {
            c0389g.a(tVar, i);
        }
    }

    public final Object b(V7.d dVar) {
        k kVar;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f3234z;
        c cVar = this.f3225v;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.t(c.f3229u.get(cVar), true)) {
                this.f3223n = e.f3247l;
                Throwable o6 = cVar.o();
                if (o6 == null) {
                    return Boolean.FALSE;
                }
                int i = u.f3861a;
                throw o6;
            }
            long andIncrement = c.f3230v.getAndIncrement(cVar);
            long j6 = e.f3238b;
            long j9 = andIncrement / j6;
            int i6 = (int) (andIncrement % j6);
            if (kVar2.f3860v != j9) {
                kVar = cVar.n(j9, kVar2);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar2;
            }
            Object B9 = cVar.B(kVar, i6, andIncrement, null);
            D2.b bVar = e.f3248m;
            if (B9 == bVar) {
                throw new IllegalStateException("unreachable");
            }
            D2.b bVar2 = e.f3250o;
            if (B9 != bVar2) {
                if (B9 != e.f3249n) {
                    kVar.a();
                    this.f3223n = B9;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f3225v;
                C0389g k9 = AbstractC0406y.k(A8.b.l(dVar));
                try {
                    this.f3224u = k9;
                    Object B10 = cVar2.B(kVar, i6, andIncrement, this);
                    if (B10 == bVar) {
                        a(kVar, i6);
                    } else {
                        if (B10 == bVar2) {
                            if (andIncrement < cVar2.r()) {
                                kVar.a();
                            }
                            k kVar3 = (k) c.f3234z.get(cVar2);
                            while (true) {
                                if (cVar2.t(c.f3229u.get(cVar2), true)) {
                                    C0389g c0389g = this.f3224u;
                                    kotlin.jvm.internal.h.b(c0389g);
                                    this.f3224u = null;
                                    this.f3223n = e.f3247l;
                                    Throwable o9 = cVar.o();
                                    if (o9 == null) {
                                        c0389g.resumeWith(Boolean.FALSE);
                                    } else {
                                        c0389g.resumeWith(com.bumptech.glide.d.f(o9));
                                    }
                                } else {
                                    long andIncrement2 = c.f3230v.getAndIncrement(cVar2);
                                    long j10 = e.f3238b;
                                    long j11 = andIncrement2 / j10;
                                    int i9 = (int) (andIncrement2 % j10);
                                    if (kVar3.f3860v != j11) {
                                        k n9 = cVar2.n(j11, kVar3);
                                        if (n9 != null) {
                                            kVar3 = n9;
                                        }
                                    }
                                    Object B11 = cVar2.B(kVar3, i9, andIncrement2, this);
                                    if (B11 == e.f3248m) {
                                        a(kVar3, i9);
                                        break;
                                    }
                                    if (B11 == e.f3250o) {
                                        if (andIncrement2 < cVar2.r()) {
                                            kVar3.a();
                                        }
                                    } else {
                                        if (B11 == e.f3249n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar3.a();
                                        this.f3223n = B11;
                                        this.f3224u = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f3223n = B10;
                            this.f3224u = null;
                            bool = Boolean.TRUE;
                        }
                        k9.z(bool, null);
                    }
                    Object q8 = k9.q();
                    A7.a aVar = A7.a.f58n;
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
