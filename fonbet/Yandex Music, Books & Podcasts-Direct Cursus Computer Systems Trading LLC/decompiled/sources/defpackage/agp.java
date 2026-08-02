package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes5.dex */
public class agp {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(agp.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(agp.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(agp.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(agp.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(agp.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final tik b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public agp(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            xq0.o(k5r.i(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            xq0.o(k5r.i(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        dgp dgpVar = new dgp(0L, null, 2);
        this.head$volatile = dgpVar;
        this.tail$volatile = dgpVar;
        this._availablePermits$volatile = i - i2;
        this.b = new tik(15, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r4.j(kotlin.Unit.a, r3.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return Unit.a;
        }
        zt3 J = i4w.J(qxe.b(cg6Var));
        try {
            if (!d(J)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        if (d(J)) {
                            break;
                        }
                    }
                }
            }
            Object q = J.q();
            nm6 nm6Var = nm6.a;
            if (q != nm6Var) {
                q = Unit.a;
            }
            return q == nm6Var ? q : Unit.a;
        } catch (Throwable th) {
            J.C();
            throw th;
        }
    }

    public final boolean d(hku hkuVar) {
        Object a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        dgp dgpVar = (dgp) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        yfp yfpVar = yfp.a;
        long j = andIncrement / cgp.f;
        loop0: while (true) {
            a = d46.a(dgpVar, j, yfpVar);
            if (!lsq.A(a)) {
                yap x = lsq.x(a);
                while (true) {
                    yap yapVar = (yap) atomicReferenceFieldUpdater.get(this);
                    if (yapVar.c >= x.c) {
                        break loop0;
                    }
                    if (!x.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, yapVar, x)) {
                        if (atomicReferenceFieldUpdater.get(this) != yapVar) {
                            if (x.f()) {
                                x.e();
                            }
                        }
                    }
                    if (yapVar.f()) {
                        yapVar.e();
                    }
                }
            } else {
                break;
            }
        }
        dgp dgpVar2 = (dgp) lsq.x(a);
        AtomicReferenceArray atomicReferenceArray = dgpVar2.e;
        int i = (int) (andIncrement % cgp.f);
        while (!atomicReferenceArray.compareAndSet(i, null, hkuVar)) {
            if (atomicReferenceArray.get(i) != null) {
                js3 js3Var = cgp.b;
                js3 js3Var2 = cgp.c;
                while (!atomicReferenceArray.compareAndSet(i, js3Var, js3Var2)) {
                    if (atomicReferenceArray.get(i) != js3Var) {
                        return false;
                    }
                }
                ((yt3) hkuVar).j(Unit.a, this.b);
                return true;
            }
        }
        hkuVar.a(dgpVar2, i);
        return true;
    }

    public final void e() {
        int i;
        Object a;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                xq0.k(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            dgp dgpVar = (dgp) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / cgp.f;
            zfp zfpVar = zfp.a;
            while (true) {
                a = d46.a(dgpVar, j, zfpVar);
                if (lsq.A(a)) {
                    break;
                }
                yap x = lsq.x(a);
                while (true) {
                    yap yapVar = (yap) atomicReferenceFieldUpdater.get(this);
                    if (yapVar.c >= x.c) {
                        break;
                    }
                    if (!x.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, yapVar, x)) {
                        if (atomicReferenceFieldUpdater.get(this) != yapVar) {
                            if (x.f()) {
                                x.e();
                            }
                        }
                    }
                    if (yapVar.f()) {
                        yapVar.e();
                    }
                }
            }
            dgp dgpVar2 = (dgp) lsq.x(a);
            AtomicReferenceArray atomicReferenceArray = dgpVar2.e;
            dgpVar2.a();
            z = false;
            if (dgpVar2.c <= j) {
                int i3 = (int) (andIncrement2 % cgp.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, cgp.b);
                if (andSet == null) {
                    int i4 = cgp.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == cgp.c) {
                            z = true;
                            break;
                        }
                    }
                    js3 js3Var = cgp.b;
                    js3 js3Var2 = cgp.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, js3Var, js3Var2)) {
                            if (atomicReferenceArray.get(i3) != js3Var) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != cgp.e) {
                    if (andSet instanceof yt3) {
                        yt3 yt3Var = (yt3) andSet;
                        js3 d2 = yt3Var.d(Unit.a, this.b);
                        if (d2 != null) {
                            yt3Var.r(d2);
                            z = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof acp)) {
                            b6e.l(andSet, "unexpected: ");
                            return;
                        }
                        z = ((acp) andSet).j(this, Unit.a);
                    }
                }
            }
        } while (!z);
    }
}
