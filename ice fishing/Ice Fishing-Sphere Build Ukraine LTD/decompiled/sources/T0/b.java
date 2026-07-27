package T0;

import D.C0013n;
import D.M;
import D.N;
import D0.l;
import L0.m0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t0.C0252g;

/* loaded from: classes.dex */
public final class b extends E0.j implements l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(1);
        this.f991f = i2;
        this.f992g = obj;
        this.f993h = obj2;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        Object gVar;
        N0.j jVar;
        C0252g c0252g;
        C0252g c0252g2;
        switch (this.f991f) {
            case 0:
                ((c) this.f993h).getClass();
                ((d) this.f992g).e(null);
                return C0252g.f2994a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f996g;
                ((c) this.f993h).getClass();
                d dVar = (d) this.f992g;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return C0252g.f2994a;
            default:
                Throwable th = (Throwable) obj;
                ((M) this.f992g).i(th);
                C0013n c0013n = (C0013n) this.f993h;
                ((N0.b) c0013n.f245c).f(th, false);
                do {
                    N0.b bVar = (N0.b) c0013n.f245c;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = N0.b.f708h;
                    long j2 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = N0.b.f707g;
                    long j3 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.r(j3, true)) {
                        gVar = new N0.g(bVar.k());
                    } else {
                        long j4 = j3 & 1152921504606846975L;
                        Object obj2 = N0.i.f741a;
                        if (j2 < j4) {
                            Object obj3 = N0.d.f729k;
                            N0.j jVar2 = (N0.j) N0.b.f712l.get(bVar);
                            for (boolean z2 = true; !bVar.r(atomicLongFieldUpdater2.get(bVar), z2); z2 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                long j5 = N0.d.f720b;
                                Object obj4 = obj2;
                                long j6 = andIncrement / j5;
                                int i2 = (int) (andIncrement % j5);
                                if (jVar2.f914g != j6) {
                                    N0.j j7 = bVar.j(j6, jVar2);
                                    if (j7 == null) {
                                        continue;
                                        obj2 = obj4;
                                    } else {
                                        jVar = j7;
                                    }
                                } else {
                                    jVar = jVar2;
                                }
                                Object A2 = bVar.A(jVar, i2, andIncrement, obj3);
                                if (A2 == N0.d.f731m) {
                                    m0 m0Var = obj3 instanceof m0 ? (m0) obj3 : null;
                                    if (m0Var != null) {
                                        m0Var.a(jVar, i2);
                                    }
                                    bVar.C(andIncrement);
                                    jVar.h();
                                    obj2 = obj4;
                                } else if (A2 == N0.d.f733o) {
                                    if (andIncrement < bVar.p()) {
                                        jVar.a();
                                    }
                                    jVar2 = jVar;
                                    obj2 = obj4;
                                } else {
                                    if (A2 == N0.d.f732n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar.a();
                                    obj2 = A2;
                                }
                            }
                            gVar = new N0.g(bVar.k());
                        }
                        gVar = obj2;
                    }
                    c0252g = null;
                    if (gVar instanceof N0.h) {
                        gVar = null;
                    }
                    c0252g2 = C0252g.f2994a;
                    if (gVar != null) {
                        N.f110f.f(gVar, th);
                        c0252g = c0252g2;
                    }
                } while (c0252g != null);
                return c0252g2;
        }
    }
}
