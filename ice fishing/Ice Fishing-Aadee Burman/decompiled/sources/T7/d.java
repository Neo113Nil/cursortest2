package T7;

import I7.l;
import S0.n;
import S7.AbstractC0406y;
import S7.B;
import S7.C0395m;
import S7.C0398p;
import S7.V;
import S7.y0;
import U7.h;
import U7.j;
import U7.k;
import com.google.android.gms.internal.ads.LD;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.i;
import u7.v;

/* loaded from: classes2.dex */
public final class d extends i implements l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3095n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3096u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3097v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Object obj2) {
        super(1);
        this.f3095n = i;
        this.f3096u = obj;
        this.f3097v = obj2;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        Object hVar;
        v vVar;
        v vVar2;
        switch (this.f3095n) {
            case 0:
                ((e) this.f3096u).f3098v.removeCallbacks((LD) this.f3097v);
                return v.f41350a;
            case 1:
                Throwable th = (Throwable) obj;
                ((J0.l) this.f3096u).invoke(th);
                n nVar = (n) this.f3097v;
                ((U7.c) nVar.f2804w).i(th, false);
                do {
                    U7.c cVar = (U7.c) nVar.f2804w;
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = U7.c.f3230v;
                    long j6 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = U7.c.f3229u;
                    long j9 = atomicLongFieldUpdater2.get(cVar);
                    boolean z3 = true;
                    if (cVar.t(j9, true)) {
                        hVar = new h(cVar.o());
                    } else {
                        long j10 = j9 & 1152921504606846975L;
                        U7.i iVar = j.f3259a;
                        if (j6 >= j10) {
                            hVar = iVar;
                        } else {
                            Object obj2 = U7.e.f3246k;
                            k kVar = (k) U7.c.f3234z.get(cVar);
                            while (true) {
                                if (cVar.t(atomicLongFieldUpdater2.get(cVar), z3)) {
                                    hVar = new h(cVar.o());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j11 = U7.e.f3238b;
                                    U7.i iVar2 = iVar;
                                    long j12 = andIncrement / j11;
                                    int i = (int) (andIncrement % j11);
                                    if (kVar.f3860v != j12) {
                                        k n9 = cVar.n(j12, kVar);
                                        if (n9 == null) {
                                            continue;
                                            iVar = iVar2;
                                            z3 = true;
                                        } else {
                                            kVar = n9;
                                        }
                                    }
                                    Object B9 = cVar.B(kVar, i, andIncrement, obj2);
                                    if (B9 == U7.e.f3248m) {
                                        y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                                        if (y0Var != null) {
                                            y0Var.a(kVar, i);
                                        }
                                        cVar.D(andIncrement);
                                        kVar.h();
                                        hVar = iVar2;
                                    } else if (B9 == U7.e.f3250o) {
                                        if (andIncrement < cVar.r()) {
                                            kVar.a();
                                        }
                                        iVar = iVar2;
                                        z3 = true;
                                    } else {
                                        if (B9 == U7.e.f3249n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar.a();
                                        hVar = B9;
                                    }
                                }
                            }
                        }
                    }
                    vVar = null;
                    if (hVar instanceof U7.i) {
                        hVar = null;
                    }
                    vVar2 = v.f41350a;
                    if (hVar != null) {
                        X.l lVar = (X.l) hVar;
                        if (lVar instanceof X.k) {
                            X.k kVar2 = (X.k) lVar;
                            Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                            C0395m c0395m = kVar2.f3512b;
                            c0395m.getClass();
                            c0395m.J(new C0398p(cancellationException, false));
                        }
                        vVar = vVar2;
                    }
                } while (vVar != null);
                return vVar2;
            default:
                Throwable th2 = (Throwable) obj;
                t.h hVar2 = (t.h) this.f3096u;
                if (th2 == null) {
                    Object C8 = ((B) this.f3097v).C();
                    if (C8 instanceof V) {
                        throw new IllegalStateException("This job has not completed yet");
                    }
                    if (C8 instanceof C0398p) {
                        throw ((C0398p) C8).f2983a;
                    }
                    hVar2.a(AbstractC0406y.w(C8));
                } else if (th2 instanceof CancellationException) {
                    hVar2.f40526d = true;
                    t.k kVar3 = hVar2.f40524b;
                    if (kVar3 != null && kVar3.f40529u.cancel(true)) {
                        hVar2.f40523a = null;
                        hVar2.f40524b = null;
                        hVar2.f40525c = null;
                    }
                } else {
                    hVar2.b(th2);
                }
                return v.f41350a;
        }
    }
}
