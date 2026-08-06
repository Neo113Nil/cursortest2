package I1;

import A1.n0;
import C1.k;
import C1.p;
import F.C0038n;
import F.L;
import h1.C0239i;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t1.l;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(1);
        this.f724e = i2;
        this.f725f = obj;
        this.f726g = obj2;
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        Object hVar;
        k kVar;
        C0239i c0239i;
        C0239i c0239i2;
        switch (this.f724e) {
            case 0:
                ((c) this.f726g).getClass();
                ((d) this.f725f).e(null);
                return C0239i.f3393a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f729g;
                ((c) this.f726g).getClass();
                d dVar = (d) this.f725f;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return C0239i.f3393a;
            default:
                Throwable th = (Throwable) obj;
                ((p) this.f725f).invoke(th);
                C0038n c0038n = (C0038n) this.f726g;
                ((C1.c) c0038n.f534c).f(th, false);
                do {
                    C1.c cVar = (C1.c) c0038n.f534c;
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = C1.c.f151d;
                    long j2 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = C1.c.f150c;
                    long j3 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.r(j3, true)) {
                        hVar = new C1.h(cVar.m());
                    } else {
                        long j4 = j3 & 1152921504606846975L;
                        Object obj2 = C1.j.f185a;
                        if (j2 < j4) {
                            Object obj3 = C1.e.f172k;
                            k kVar2 = (k) C1.c.f155h.get(cVar);
                            for (boolean z2 = true; !cVar.r(atomicLongFieldUpdater2.get(cVar), z2); z2 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                long j5 = C1.e.f163b;
                                Object obj4 = obj2;
                                long j6 = andIncrement / j5;
                                int i2 = (int) (andIncrement % j5);
                                if (kVar2.f631c != j6) {
                                    k l2 = cVar.l(j6, kVar2);
                                    if (l2 == null) {
                                        continue;
                                        obj2 = obj4;
                                    } else {
                                        kVar = l2;
                                    }
                                } else {
                                    kVar = kVar2;
                                }
                                Object A2 = cVar.A(kVar, i2, andIncrement, obj3);
                                if (A2 == C1.e.f174m) {
                                    n0 n0Var = obj3 instanceof n0 ? (n0) obj3 : null;
                                    if (n0Var != null) {
                                        n0Var.a(kVar, i2);
                                    }
                                    cVar.C(andIncrement);
                                    kVar.h();
                                    obj2 = obj4;
                                } else if (A2 == C1.e.f176o) {
                                    if (andIncrement < cVar.p()) {
                                        kVar.a();
                                    }
                                    kVar2 = kVar;
                                    obj2 = obj4;
                                } else {
                                    if (A2 == C1.e.f175n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    kVar.a();
                                    obj2 = A2;
                                }
                            }
                            hVar = new C1.h(cVar.m());
                        }
                        hVar = obj2;
                    }
                    c0239i = null;
                    if (hVar instanceof C1.i) {
                        hVar = null;
                    }
                    c0239i2 = C0239i.f3393a;
                    if (hVar != null) {
                        L.f397e.invoke(hVar, th);
                        c0239i = c0239i2;
                    }
                } while (c0239i != null);
                return c0239i2;
        }
    }
}
