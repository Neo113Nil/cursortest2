package T7;

import I7.l;
import J0.k;
import S0.n;
import S7.AbstractC0410y;
import S7.B;
import S7.C0399m;
import S7.C0402p;
import S7.V;
import S7.y0;
import U7.h;
import U7.j;
import com.google.android.gms.internal.ads.LD;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.i;
import u7.v;

/* loaded from: classes2.dex */
public final class d extends i implements l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3212n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3213u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3214v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Object obj2) {
        super(1);
        this.f3212n = i;
        this.f3213u = obj;
        this.f3214v = obj2;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        Object hVar;
        v vVar;
        v vVar2;
        switch (this.f3212n) {
            case 0:
                ((e) this.f3213u).f3215v.removeCallbacks((LD) this.f3214v);
                return v.f41073a;
            case 1:
                Throwable th = (Throwable) obj;
                ((k) this.f3213u).invoke(th);
                n nVar = (n) this.f3214v;
                ((U7.c) nVar.f2933w).i(th, false);
                do {
                    U7.c cVar = (U7.c) nVar.f2933w;
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = U7.c.f3353v;
                    long j6 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = U7.c.f3352u;
                    long j9 = atomicLongFieldUpdater2.get(cVar);
                    boolean z6 = true;
                    if (cVar.t(j9, true)) {
                        hVar = new h(cVar.o());
                    } else {
                        long j10 = j9 & 1152921504606846975L;
                        U7.i iVar = j.f3382a;
                        if (j6 >= j10) {
                            hVar = iVar;
                        } else {
                            Object obj2 = U7.e.f3369k;
                            U7.k kVar = (U7.k) U7.c.f3357z.get(cVar);
                            while (true) {
                                if (cVar.t(atomicLongFieldUpdater2.get(cVar), z6)) {
                                    hVar = new h(cVar.o());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j11 = U7.e.f3361b;
                                    U7.i iVar2 = iVar;
                                    long j12 = andIncrement / j11;
                                    int i = (int) (andIncrement % j11);
                                    if (kVar.f3815v != j12) {
                                        U7.k n9 = cVar.n(j12, kVar);
                                        if (n9 == null) {
                                            continue;
                                            iVar = iVar2;
                                            z6 = true;
                                        } else {
                                            kVar = n9;
                                        }
                                    }
                                    Object B3 = cVar.B(kVar, i, andIncrement, obj2);
                                    if (B3 == U7.e.f3371m) {
                                        y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                                        if (y0Var != null) {
                                            y0Var.a(kVar, i);
                                        }
                                        cVar.D(andIncrement);
                                        kVar.h();
                                        hVar = iVar2;
                                    } else if (B3 == U7.e.f3373o) {
                                        if (andIncrement < cVar.r()) {
                                            kVar.a();
                                        }
                                        iVar = iVar2;
                                        z6 = true;
                                    } else {
                                        if (B3 == U7.e.f3372n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar.a();
                                        hVar = B3;
                                    }
                                }
                            }
                        }
                    }
                    vVar = null;
                    if (hVar instanceof U7.i) {
                        hVar = null;
                    }
                    vVar2 = v.f41073a;
                    if (hVar != null) {
                        X.l lVar = (X.l) hVar;
                        if (lVar instanceof X.k) {
                            X.k kVar2 = (X.k) lVar;
                            Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                            C0399m c0399m = kVar2.f3674b;
                            c0399m.getClass();
                            c0399m.J(new C0402p(cancellationException, false));
                        }
                        vVar = vVar2;
                    }
                } while (vVar != null);
                return vVar2;
            default:
                Throwable th2 = (Throwable) obj;
                t.h hVar2 = (t.h) this.f3213u;
                if (th2 == null) {
                    Object C8 = ((B) this.f3214v).C();
                    if (C8 instanceof V) {
                        throw new IllegalStateException("This job has not completed yet");
                    }
                    if (C8 instanceof C0402p) {
                        throw ((C0402p) C8).f3066a;
                    }
                    hVar2.a(AbstractC0410y.w(C8));
                } else if (th2 instanceof CancellationException) {
                    hVar2.f40582d = true;
                    t.k kVar3 = hVar2.f40580b;
                    if (kVar3 != null && kVar3.f40585u.cancel(true)) {
                        hVar2.f40579a = null;
                        hVar2.f40580b = null;
                        hVar2.f40581c = null;
                    }
                } else {
                    hVar2.b(th2);
                }
                return v.f41073a;
        }
    }
}
