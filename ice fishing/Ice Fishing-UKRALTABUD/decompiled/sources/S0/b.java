package S0;

import D.C0013n;
import D.M;
import D.N;
import D0.l;
import K0.m0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b extends E0.j implements l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f983g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f984h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(1);
        this.f983g = i2;
        this.f984h = obj;
        this.f985i = obj2;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        Object gVar;
        M0.j jVar;
        t0.g gVar2;
        t0.g gVar3;
        switch (this.f983g) {
            case 0:
                ((c) this.f985i).getClass();
                ((d) this.f984h).e(null);
                return t0.g.f2989a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f988g;
                ((c) this.f985i).getClass();
                d dVar = (d) this.f984h;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return t0.g.f2989a;
            default:
                Throwable th = (Throwable) obj;
                ((M) this.f984h).i(th);
                C0013n c0013n = (C0013n) this.f985i;
                ((M0.b) c0013n.f244c).f(th, false);
                do {
                    M0.b bVar = (M0.b) c0013n.f244c;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = M0.b.f700i;
                    long j2 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = M0.b.f699h;
                    long j3 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.r(j3, true)) {
                        gVar = new M0.g(bVar.k());
                    } else {
                        long j4 = j3 & 1152921504606846975L;
                        Object obj2 = M0.i.f733a;
                        if (j2 < j4) {
                            Object obj3 = M0.d.f721k;
                            M0.j jVar2 = (M0.j) M0.b.f704m.get(bVar);
                            for (boolean z2 = true; !bVar.r(atomicLongFieldUpdater2.get(bVar), z2); z2 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                long j5 = M0.d.f712b;
                                Object obj4 = obj2;
                                long j6 = andIncrement / j5;
                                int i2 = (int) (andIncrement % j5);
                                if (jVar2.f905h != j6) {
                                    M0.j j7 = bVar.j(j6, jVar2);
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
                                if (A2 == M0.d.f723m) {
                                    m0 m0Var = obj3 instanceof m0 ? (m0) obj3 : null;
                                    if (m0Var != null) {
                                        m0Var.a(jVar, i2);
                                    }
                                    bVar.C(andIncrement);
                                    jVar.h();
                                    obj2 = obj4;
                                } else if (A2 == M0.d.f725o) {
                                    if (andIncrement < bVar.p()) {
                                        jVar.a();
                                    }
                                    jVar2 = jVar;
                                    obj2 = obj4;
                                } else {
                                    if (A2 == M0.d.f724n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar.a();
                                    obj2 = A2;
                                }
                            }
                            gVar = new M0.g(bVar.k());
                        }
                        gVar = obj2;
                    }
                    gVar2 = null;
                    if (gVar instanceof M0.h) {
                        gVar = null;
                    }
                    gVar3 = t0.g.f2989a;
                    if (gVar != null) {
                        N.f110g.f(gVar, th);
                        gVar2 = gVar3;
                    }
                } while (gVar2 != null);
                return gVar3;
        }
    }
}
