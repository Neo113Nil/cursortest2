package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class zi3 implements lc4 {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(zi3.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(zi3.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(zi3.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(zi3.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(zi3.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(zi3.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(zi3.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(zi3.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(zi3.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public zi3(int i2) {
        this.a = i2;
        if (i2 < 0) {
            xq0.o(dfi.c(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        hd4 hd4Var = bj3.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        hd4 hd4Var2 = new hd4(0L, null, this, 3);
        this.sendSegment$volatile = hd4Var2;
        this.receiveSegment$volatile = hd4Var2;
        if (D()) {
            hd4Var2 = bj3.a;
            hd4Var2.getClass();
        }
        this.bufferEndSegment$volatile = hd4Var2;
        this._closeCause$volatile = bj3.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object G(zi3 zi3Var, cg6 cg6Var) {
        xi3 xi3Var;
        int i2;
        hd4 hd4Var;
        if (cg6Var instanceof xi3) {
            xi3Var = (xi3) cg6Var;
            int i3 = xi3Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xi3Var.l = i3 - Integer.MIN_VALUE;
                xi3 xi3Var2 = xi3Var;
                Object obj = xi3Var2.j;
                nm6 nm6Var = nm6.a;
                i2 = xi3Var2.l;
                if (i2 == 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return ((gd4) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                hd4 hd4Var2 = (hd4) g.get(zi3Var);
                while (!zi3Var.A()) {
                    long andIncrement = c.getAndIncrement(zi3Var);
                    long j2 = bj3.b;
                    long j3 = andIncrement / j2;
                    int i4 = (int) (andIncrement % j2);
                    if (hd4Var2.c != j3) {
                        hd4 s = zi3Var.s(j3, hd4Var2);
                        if (s == null) {
                            continue;
                        } else {
                            hd4Var = s;
                        }
                    } else {
                        hd4Var = hd4Var2;
                    }
                    zi3 zi3Var2 = zi3Var;
                    Object L = zi3Var2.L(hd4Var, i4, andIncrement, null);
                    if (L == bj3.m) {
                        xq0.q("unexpected");
                        return null;
                    }
                    if (L != bj3.o) {
                        if (L != bj3.n) {
                            hd4Var.a();
                            return L;
                        }
                        xi3Var2.l = 1;
                        Object H = zi3Var2.H(hd4Var, i4, andIncrement, xi3Var2);
                        return H == nm6Var ? nm6Var : H;
                    }
                    if (andIncrement < zi3Var2.w()) {
                        hd4Var.a();
                    }
                    zi3Var = zi3Var2;
                    hd4Var2 = hd4Var;
                }
                return new ed4(zi3Var.t());
            }
        }
        xi3Var = new xi3(zi3Var, cg6Var);
        xi3 xi3Var22 = xi3Var;
        Object obj2 = xi3Var22.j;
        nm6 nm6Var2 = nm6.a;
        i2 = xi3Var22.l;
        if (i2 == 0) {
        }
    }

    public static final hd4 a(zi3 zi3Var, long j2, hd4 hd4Var) {
        Object a;
        zi3 zi3Var2;
        hd4 hd4Var2 = bj3.a;
        aj3 aj3Var = aj3.a;
        loop0: while (true) {
            a = d46.a(hd4Var, j2, aj3Var);
            if (!lsq.A(a)) {
                yap x = lsq.x(a);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    yap yapVar = (yap) atomicReferenceFieldUpdater.get(zi3Var);
                    if (yapVar.c >= x.c) {
                        break loop0;
                    }
                    if (!x.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(zi3Var, yapVar, x)) {
                        if (atomicReferenceFieldUpdater.get(zi3Var) != yapVar) {
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
        boolean A = lsq.A(a);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (A) {
            zi3Var.B();
            if (hd4Var.c * bj3.b < atomicLongFieldUpdater.get(zi3Var)) {
                hd4Var.a();
                return null;
            }
        } else {
            hd4 hd4Var3 = (hd4) lsq.x(a);
            long j3 = hd4Var3.c;
            if (j3 <= j2) {
                return hd4Var3;
            }
            long j4 = bj3.b * j3;
            while (true) {
                long j5 = b.get(zi3Var);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    zi3Var2 = zi3Var;
                    break;
                }
                zi3Var2 = zi3Var;
                if (b.compareAndSet(zi3Var2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                zi3Var = zi3Var2;
            }
            if (j3 * bj3.b < atomicLongFieldUpdater.get(zi3Var2)) {
                hd4Var3.a();
            }
        }
        return null;
    }

    public static final void b(zi3 zi3Var, Object obj, zt3 zt3Var) {
        Throwable v = zi3Var.v();
        if (ve7.b()) {
            v = dar.a(v, zt3Var);
        }
        r7o r7oVar = z7o.b;
        zt3Var.resumeWith(new t7o(v));
    }

    public static final void d(zi3 zi3Var, acp acpVar) {
        hd4 hd4Var;
        zi3 zi3Var2;
        acp acpVar2;
        int i2;
        zi3Var.getClass();
        hd4 hd4Var2 = (hd4) g.get(zi3Var);
        while (!zi3Var.A()) {
            long andIncrement = c.getAndIncrement(zi3Var);
            long j2 = bj3.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (hd4Var2.c != j3) {
                hd4 s = zi3Var.s(j3, hd4Var2);
                if (s == null) {
                    continue;
                } else {
                    hd4Var = s;
                    acpVar2 = acpVar;
                    i2 = i3;
                    zi3Var2 = zi3Var;
                }
            } else {
                hd4Var = hd4Var2;
                zi3Var2 = zi3Var;
                acpVar2 = acpVar;
                i2 = i3;
            }
            Object L = zi3Var2.L(hd4Var, i2, andIncrement, acpVar2);
            hd4Var2 = hd4Var;
            if (L == bj3.m) {
                acp acpVar3 = acpVar2 instanceof hku ? acpVar2 : null;
                if (acpVar3 != null) {
                    acpVar3.a(hd4Var2, i2);
                    return;
                }
                return;
            }
            if (L != bj3.o) {
                if (L == bj3.n) {
                    xq0.q("unexpected");
                    return;
                } else {
                    hd4Var2.a();
                    acpVar2.e = L;
                    return;
                }
            }
            if (andIncrement < zi3Var2.w()) {
                hd4Var2.a();
            }
            zi3Var = zi3Var2;
            acpVar = acpVar2;
        }
        acpVar.e = bj3.l;
    }

    public static final int h(zi3 zi3Var, hd4 hd4Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        hd4Var.n(i2, obj);
        if (z) {
            return zi3Var.M(hd4Var, i2, obj, j2, obj2, z);
        }
        Object l = hd4Var.l(i2);
        if (l == null) {
            if (zi3Var.j(j2)) {
                if (hd4Var.k(i2, null, bj3.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (hd4Var.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof hku) {
            hd4Var.n(i2, null);
            if (zi3Var.J(l, obj)) {
                hd4Var.o(i2, bj3.i);
                return 0;
            }
            js3 js3Var = bj3.k;
            if (hd4Var.f.getAndSet((i2 * 2) + 1, js3Var) == js3Var) {
                return 5;
            }
            hd4Var.m(i2, true);
            return 5;
        }
        return zi3Var.M(hd4Var, i2, obj, j2, obj2, z);
    }

    public static void x(zi3 zi3Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(zi3Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(zi3Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        return z(b.get(this), true);
    }

    public final boolean B() {
        return z(b.get(this), false);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        long j2 = d.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(long j2, hd4 hd4Var) {
        hd4 hd4Var2;
        hd4 hd4Var3;
        while (hd4Var.c < j2 && (hd4Var3 = (hd4) hd4Var.c()) != null) {
            hd4Var = hd4Var3;
        }
        while (true) {
            if (!hd4Var.d() || (hd4Var2 = (hd4) hd4Var.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    yap yapVar = (yap) atomicReferenceFieldUpdater.get(this);
                    if (yapVar.c >= hd4Var.c) {
                        return;
                    }
                    if (!hd4Var.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, yapVar, hd4Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != yapVar) {
                            if (hd4Var.f()) {
                                hd4Var.e();
                            }
                        }
                    }
                    if (yapVar.f()) {
                        yapVar.e();
                        return;
                    }
                    return;
                }
            }
            hd4Var = hd4Var2;
        }
    }

    public final Object F(Object obj, Continuation continuation) {
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        Throwable v = v();
        r7o r7oVar = z7o.b;
        if (ve7.b()) {
            v = dar.a(v, zt3Var);
        }
        zt3Var.resumeWith(new t7o(v));
        Object q = zt3Var.q();
        return q == nm6.a ? q : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(hd4 hd4Var, int i2, long j2, cg6 cg6Var) {
        yi3 yi3Var;
        int i3;
        gd4 gd4Var;
        hd4 hd4Var2;
        if (cg6Var instanceof yi3) {
            yi3Var = (yi3) cg6Var;
            int i4 = yi3Var.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                yi3Var.l = i4 - Integer.MIN_VALUE;
                Object obj = yi3Var.j;
                nm6 nm6Var = nm6.a;
                i3 = yi3Var.l;
                if (i3 != 0) {
                    qgg.h0(obj);
                    yi3Var.l = 1;
                    zt3 J = i4w.J(qxe.b(yi3Var));
                    try {
                        pln plnVar = new pln(J);
                        zi3 zi3Var = this;
                        Object L = zi3Var.L(hd4Var, i2, j2, plnVar);
                        if (L == bj3.m) {
                            plnVar.a(hd4Var, i2);
                        } else {
                            if (L == bj3.o) {
                                if (j2 < w()) {
                                    hd4Var.a();
                                }
                                hd4 hd4Var3 = (hd4) g.get(this);
                                while (true) {
                                    if (A()) {
                                        r7o r7oVar = z7o.b;
                                        J.resumeWith(new gd4(new ed4(t())));
                                        break;
                                    }
                                    long andIncrement = c.getAndIncrement(this);
                                    long j3 = bj3.b;
                                    long j4 = andIncrement / j3;
                                    int i5 = (int) (andIncrement % j3);
                                    if (hd4Var3.c != j4) {
                                        hd4 s = s(j4, hd4Var3);
                                        if (s != null) {
                                            hd4Var2 = s;
                                        }
                                    } else {
                                        hd4Var2 = hd4Var3;
                                    }
                                    Object L2 = zi3Var.L(hd4Var2, i5, andIncrement, plnVar);
                                    hd4 hd4Var4 = hd4Var2;
                                    if (L2 == bj3.m) {
                                        plnVar.a(hd4Var4, i5);
                                        break;
                                    }
                                    if (L2 == bj3.o) {
                                        if (andIncrement < w()) {
                                            hd4Var4.a();
                                        }
                                        zi3Var = this;
                                        hd4Var3 = hd4Var4;
                                    } else {
                                        if (L2 == bj3.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hd4Var4.a();
                                        gd4Var = new gd4(L2);
                                    }
                                }
                            } else {
                                hd4Var.a();
                                gd4Var = new gd4(L);
                            }
                            J.j(gd4Var, null);
                        }
                        obj = J.q();
                        nm6 nm6Var2 = nm6.a;
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } catch (Throwable th) {
                        J.C();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((gd4) obj).a;
            }
        }
        yi3Var = new yi3(this, cg6Var);
        Object obj2 = yi3Var.j;
        nm6 nm6Var3 = nm6.a;
        i3 = yi3Var.l;
        if (i3 != 0) {
        }
        return ((gd4) obj2).a;
    }

    public final void I(hku hkuVar, boolean z) {
        if (hkuVar instanceof yt3) {
            Continuation continuation = (Continuation) hkuVar;
            r7o r7oVar = z7o.b;
            continuation.resumeWith(new t7o(z ? u() : v()));
            return;
        }
        if (hkuVar instanceof pln) {
            zt3 zt3Var = ((pln) hkuVar).a;
            r7o r7oVar2 = z7o.b;
            zt3Var.resumeWith(new gd4(new ed4(t())));
            return;
        }
        if (!(hkuVar instanceof si3)) {
            if (hkuVar instanceof acp) {
                ((acp) hkuVar).j(this, bj3.l);
                return;
            } else {
                b6e.l(hkuVar, "Unexpected waiter: ");
                return;
            }
        }
        si3 si3Var = (si3) hkuVar;
        zt3 zt3Var2 = si3Var.b;
        zt3Var2.getClass();
        si3Var.b = null;
        si3Var.a = bj3.l;
        Throwable t = si3Var.c.t();
        if (t == null) {
            r7o r7oVar3 = z7o.b;
            zt3Var2.resumeWith(Boolean.FALSE);
        } else {
            if (ve7.b()) {
                t = dar.a(t, zt3Var2);
            }
            r7o r7oVar4 = z7o.b;
            zt3Var2.resumeWith(new t7o(t));
        }
    }

    public final boolean J(Object obj, Object obj2) {
        if (obj instanceof acp) {
            return ((acp) obj).j(this, obj2);
        }
        if (obj instanceof pln) {
            return bj3.a(((pln) obj).a, new gd4(obj2), null);
        }
        if (!(obj instanceof si3)) {
            if (obj instanceof yt3) {
                return bj3.a((yt3) obj, obj2, null);
            }
            b6e.l(obj, "Unexpected receiver type: ");
            return false;
        }
        si3 si3Var = (si3) obj;
        zt3 zt3Var = si3Var.b;
        zt3Var.getClass();
        si3Var.b = null;
        si3Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        si3Var.c.getClass();
        return bj3.a(zt3Var, bool, null);
    }

    public final boolean K(Object obj, hd4 hd4Var, int i2) {
        dbt dbtVar;
        if (obj instanceof yt3) {
            return bj3.a((yt3) obj, Unit.a, null);
        }
        if (!(obj instanceof acp)) {
            b6e.l(obj, "Unexpected waiter: ");
            return false;
        }
        int k = ((acp) obj).k(this, Unit.a);
        if (k == 0) {
            dbtVar = dbt.a;
        } else if (k == 1) {
            dbtVar = dbt.b;
        } else if (k == 2) {
            dbtVar = dbt.c;
        } else {
            if (k != 3) {
                xq0.k(k, "Unexpected internal result: ");
                return false;
            }
            dbtVar = dbt.d;
        }
        if (dbtVar == dbt.b) {
            hd4Var.n(i2, null);
        }
        return dbtVar == dbt.a;
    }

    public final Object L(hd4 hd4Var, int i2, long j2, Object obj) {
        Object l = hd4Var.l(i2);
        AtomicReferenceArray atomicReferenceArray = hd4Var.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (l == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return bj3.n;
                }
                if (hd4Var.k(i2, l, obj)) {
                    r();
                    return bj3.m;
                }
            }
        } else if (l == bj3.d && hd4Var.k(i2, l, bj3.i)) {
            r();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            hd4Var.n(i2, null);
            return obj2;
        }
        while (true) {
            Object l2 = hd4Var.l(i2);
            if (l2 == null || l2 == bj3.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (hd4Var.k(i2, l2, bj3.h)) {
                        r();
                        return bj3.o;
                    }
                } else {
                    if (obj == null) {
                        return bj3.n;
                    }
                    if (hd4Var.k(i2, l2, obj)) {
                        r();
                        return bj3.m;
                    }
                }
            } else if (l2 != bj3.d) {
                js3 js3Var = bj3.j;
                if (l2 == js3Var) {
                    return bj3.o;
                }
                if (l2 == bj3.h) {
                    return bj3.o;
                }
                if (l2 == bj3.l) {
                    r();
                    return bj3.o;
                }
                if (l2 != bj3.g && hd4Var.k(i2, l2, bj3.f)) {
                    boolean z = l2 instanceof iku;
                    if (z) {
                        l2 = ((iku) l2).a;
                    }
                    if (K(l2, hd4Var, i2)) {
                        hd4Var.o(i2, bj3.i);
                        r();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        hd4Var.n(i2, null);
                        return obj3;
                    }
                    hd4Var.o(i2, js3Var);
                    hd4Var.i();
                    if (z) {
                        r();
                    }
                    return bj3.o;
                }
            } else if (hd4Var.k(i2, l2, bj3.i)) {
                r();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                hd4Var.n(i2, null);
                return obj4;
            }
        }
    }

    public final int M(hd4 hd4Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object l = hd4Var.l(i2);
            if (l == null) {
                if (!j(j2) || z) {
                    if (z) {
                        if (hd4Var.k(i2, null, bj3.j)) {
                            hd4Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (hd4Var.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (hd4Var.k(i2, null, bj3.d)) {
                    break;
                }
            } else {
                if (l != bj3.e) {
                    js3 js3Var = bj3.k;
                    if (l == js3Var) {
                        hd4Var.n(i2, null);
                        return 5;
                    }
                    if (l == bj3.h) {
                        hd4Var.n(i2, null);
                        return 5;
                    }
                    if (l == bj3.l) {
                        hd4Var.n(i2, null);
                        B();
                        return 4;
                    }
                    hd4Var.n(i2, null);
                    if (l instanceof iku) {
                        l = ((iku) l).a;
                    }
                    if (J(l, obj)) {
                        hd4Var.o(i2, bj3.i);
                        return 0;
                    }
                    if (hd4Var.f.getAndSet((i2 * 2) + 1, js3Var) != js3Var) {
                        hd4Var.m(i2, true);
                    }
                    return 5;
                }
                if (hd4Var.k(i2, l, bj3.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void N(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        zi3 zi3Var = this;
        if (zi3Var.D()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(zi3Var) > j2) {
                break;
            } else {
                zi3Var = this;
            }
        }
        int i2 = bj3.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(zi3Var);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(zi3Var)) && j3 == atomicLongFieldUpdater.get(zi3Var)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(zi3Var);
                    if (atomicLongFieldUpdater2.compareAndSet(zi3Var, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        zi3Var = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(zi3Var);
                    long j6 = atomicLongFieldUpdater2.get(zi3Var);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(zi3Var)) {
                        break;
                    }
                    if (z) {
                        zi3Var = this;
                    } else {
                        zi3Var = this;
                        atomicLongFieldUpdater2.compareAndSet(zi3Var, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(zi3Var);
                    if (atomicLongFieldUpdater2.compareAndSet(zi3Var, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        zi3Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.fgp
    public Object c(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = z(atomicLongFieldUpdater.get(this), false) ? false : !j(r1 & 1152921504606846975L);
        fd4 fd4Var = gd4.b;
        if (z2) {
            return fd4Var;
        }
        Object obj2 = bj3.j;
        hd4 hd4Var = (hd4) f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean z3 = z(andIncrement, z);
            int i2 = bj3.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (hd4Var.c != j5) {
                hd4 a = a(this, j5, hd4Var);
                if (a != null) {
                    hd4Var = a;
                } else {
                    if (z3) {
                        return new ed4(v());
                    }
                    z = false;
                    j2 = 1152921504606846975L;
                }
            }
            int h2 = h(this, hd4Var, i3, obj, j3, obj2, z3);
            if (h2 == 0) {
                hd4Var.a();
                return Unit.a;
            }
            if (h2 == 1) {
                return Unit.a;
            }
            if (h2 == 2) {
                if (z3) {
                    hd4Var.i();
                    return new ed4(v());
                }
                hku hkuVar = obj2 instanceof hku ? (hku) obj2 : null;
                if (hkuVar != null) {
                    hkuVar.a(hd4Var, i3 + i2);
                }
                hd4Var.i();
                return fd4Var;
            }
            if (h2 == 3) {
                xq0.q("unexpected");
                return null;
            }
            if (h2 == 4) {
                if (j3 < c.get(this)) {
                    hd4Var.a();
                }
                return new ed4(v());
            }
            if (h2 == 5) {
                hd4Var.a();
            }
            z = false;
            j2 = 1152921504606846975L;
        }
    }

    @Override // defpackage.qln
    public final Object e(aur aurVar) {
        return G(this, aurVar);
    }

    @Override // defpackage.qln
    public final x3n f() {
        ti3 ti3Var = ti3.a;
        wct.o(3, ti3Var);
        ui3 ui3Var = ui3.a;
        wct.o(3, ui3Var);
        return new x3n(this, ti3Var, ui3Var, (Object) null);
    }

    @Override // defpackage.qln
    public final void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        o(cancellationException, true);
    }

    @Override // defpackage.qln
    public final x3n i() {
        vi3 vi3Var = vi3.a;
        wct.o(3, vi3Var);
        wi3 wi3Var = wi3.a;
        wct.o(3, wi3Var);
        return new x3n(this, vi3Var, wi3Var, (Object) null);
    }

    @Override // defpackage.qln
    public final si3 iterator() {
        return new si3(this);
    }

    public final boolean j(long j2) {
        return j2 < d.get(this) || j2 < c.get(this) + ((long) this.a);
    }

    @Override // defpackage.qln
    public final Object k() {
        hd4 hd4Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = b.get(this);
        if (z(j3, true)) {
            return new ed4(t());
        }
        long j4 = j3 & 1152921504606846975L;
        fd4 fd4Var = gd4.b;
        if (j2 >= j4) {
            return fd4Var;
        }
        Object obj = bj3.k;
        hd4 hd4Var2 = (hd4) g.get(this);
        while (!A()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = bj3.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (hd4Var2.c != j6) {
                hd4 s = s(j6, hd4Var2);
                if (s == null) {
                    continue;
                } else {
                    hd4Var = s;
                }
            } else {
                hd4Var = hd4Var2;
            }
            Object L = L(hd4Var, i2, andIncrement, obj);
            hd4 hd4Var3 = hd4Var;
            if (L == bj3.m) {
                hku hkuVar = obj instanceof hku ? (hku) obj : null;
                if (hkuVar != null) {
                    hkuVar.a(hd4Var3, i2);
                }
                N(andIncrement);
                hd4Var3.i();
                return fd4Var;
            }
            if (L != bj3.o) {
                if (L != bj3.n) {
                    hd4Var3.a();
                    return L;
                }
                xq0.q("unexpected");
                return null;
            }
            if (andIncrement < w()) {
                hd4Var3.a();
            }
            hd4Var2 = hd4Var3;
        }
        return new ed4(t());
    }

    @Override // defpackage.qln
    public final Object l(Continuation continuation) {
        hd4 hd4Var;
        Throwable th;
        hd4 hd4Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        hd4 hd4Var3 = (hd4) atomicReferenceFieldUpdater.get(this);
        while (!A()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = bj3.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (hd4Var3.c != j3) {
                hd4 s = s(j3, hd4Var3);
                if (s == null) {
                    continue;
                } else {
                    hd4Var = s;
                }
            } else {
                hd4Var = hd4Var3;
            }
            Object L = L(hd4Var, i2, andIncrement, null);
            js3 js3Var = bj3.m;
            if (L == js3Var) {
                xq0.q("unexpected");
                return null;
            }
            js3 js3Var2 = bj3.o;
            if (L == js3Var2) {
                if (andIncrement < w()) {
                    hd4Var.a();
                }
                hd4Var3 = hd4Var;
            } else {
                if (L != bj3.n) {
                    hd4Var.a();
                    return L;
                }
                zt3 J = i4w.J(qxe.b(continuation));
                zi3 zi3Var = this;
                try {
                    Object L2 = zi3Var.L(hd4Var, i2, andIncrement, J);
                    if (L2 == js3Var) {
                        J.a(hd4Var, i2);
                    } else {
                        if (L2 == js3Var2) {
                            if (andIncrement < w()) {
                                hd4Var.a();
                            }
                            hd4 hd4Var4 = (hd4) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (A()) {
                                    r7o r7oVar = z7o.b;
                                    J.resumeWith(new t7o(u()));
                                    break;
                                }
                                zt3 zt3Var = J;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j4 = bj3.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (hd4Var4.c != j5) {
                                        try {
                                            hd4 s2 = s(j5, hd4Var4);
                                            if (s2 == null) {
                                                J = zt3Var;
                                            } else {
                                                hd4Var2 = s2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            J = zt3Var;
                                            J.C();
                                            throw th;
                                        }
                                    } else {
                                        hd4Var2 = hd4Var4;
                                    }
                                    L2 = zi3Var.L(hd4Var2, i3, andIncrement2, zt3Var);
                                    hd4 hd4Var5 = hd4Var2;
                                    J = zt3Var;
                                    if (L2 == bj3.m) {
                                        J.a(hd4Var5, i3);
                                        break;
                                    }
                                    if (L2 == bj3.o) {
                                        if (andIncrement2 < w()) {
                                            hd4Var5.a();
                                        }
                                        zi3Var = this;
                                        hd4Var4 = hd4Var5;
                                    } else {
                                        if (L2 == bj3.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hd4Var5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    J = zt3Var;
                                    th = th;
                                    J.C();
                                    throw th;
                                }
                            }
                        } else {
                            hd4Var.a();
                        }
                        J.j(L2, null);
                    }
                    Object q = J.q();
                    nm6 nm6Var = nm6.a;
                    return q;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        throw dar.b(u());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x018f, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c0, code lost:
    
        b(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173 A[RETURN] */
    @Override // defpackage.fgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(Object obj, Continuation continuation) {
        int h2;
        Object q;
        nm6 nm6Var;
        Object obj2;
        zi3 zi3Var;
        hd4 hd4Var;
        int i2;
        int i3;
        boolean z;
        zi3 zi3Var2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        hd4 hd4Var2 = (hd4) atomicReferenceFieldUpdater.get(zi3Var2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(zi3Var2);
            long j2 = andIncrement & 1152921504606846975L;
            boolean z2 = zi3Var2.z(andIncrement, false);
            int i4 = bj3.b;
            long j3 = i4;
            long j4 = j2 / j3;
            int i5 = (int) (j2 % j3);
            if (hd4Var2.c != j4) {
                hd4 a = a(zi3Var2, j4, hd4Var2);
                if (a != null) {
                    hd4Var2 = a;
                } else if (z2) {
                    Object F = F(obj, continuation);
                    if (F == nm6.a) {
                        return F;
                    }
                }
            }
            int h3 = h(zi3Var2, hd4Var2, i5, obj, j2, null, z2);
            if (h3 == 0) {
                hd4Var2.a();
                break;
            }
            if (h3 == 1) {
                break;
            }
            if (h3 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
                if (h3 == 3) {
                    zt3 J = i4w.J(qxe.b(continuation));
                    Object obj3 = obj;
                    try {
                        h2 = h(zi3Var2, hd4Var2, i5, obj3, j2, J, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (h2 == 0) {
                            hd4Var2.a();
                            r7o r7oVar = z7o.b;
                        } else if (h2 != 1) {
                            if (h2 != 2) {
                                if (h2 != 4) {
                                    String str = "unexpected";
                                    if (h2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    hd4Var2.a();
                                    hd4 hd4Var3 = (hd4) atomicReferenceFieldUpdater.get(zi3Var2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(zi3Var2);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean z3 = zi3Var2.z(andIncrement2, false);
                                        int i6 = bj3.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j6 = i6;
                                        String str2 = str;
                                        long j7 = j5 / j6;
                                        int i7 = (int) (j5 % j6);
                                        if (hd4Var3.c != j7) {
                                            hd4 a2 = a(zi3Var2, j7, hd4Var3);
                                            if (a2 != null) {
                                                i2 = i6;
                                                i3 = i7;
                                                z = z3;
                                                hd4Var = a2;
                                            } else {
                                                if (z3) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                            }
                                        } else {
                                            hd4Var = hd4Var3;
                                            i2 = i6;
                                            i3 = i7;
                                            z = z3;
                                        }
                                        int h4 = h(zi3Var2, hd4Var, i3, obj3, j5, J, z);
                                        Object obj4 = obj3;
                                        zi3Var = zi3Var2;
                                        hd4 hd4Var4 = hd4Var;
                                        int i8 = i3;
                                        obj2 = obj4;
                                        if (h4 == 0) {
                                            hd4Var4.a();
                                            r7o r7oVar2 = z7o.b;
                                            break;
                                        }
                                        if (h4 == 1) {
                                            r7o r7oVar3 = z7o.b;
                                            break;
                                        }
                                        if (h4 != 2) {
                                            if (h4 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (h4 != 4) {
                                                if (h4 == 5) {
                                                    hd4Var4.a();
                                                }
                                                hd4Var3 = hd4Var4;
                                                zi3Var2 = zi3Var;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                                obj3 = obj2;
                                            } else if (j5 < atomicLongFieldUpdater2.get(zi3Var)) {
                                                hd4Var4.a();
                                            }
                                        } else if (z) {
                                            hd4Var4.i();
                                        } else {
                                            J.a(hd4Var4, i8 + i2);
                                        }
                                    }
                                } else {
                                    obj2 = obj3;
                                    zi3Var = zi3Var2;
                                    if (j2 < atomicLongFieldUpdater2.get(zi3Var)) {
                                        hd4Var2.a();
                                    }
                                }
                                b(zi3Var, obj2, J);
                            } else {
                                J.a(hd4Var2, i5 + i4);
                            }
                            q = J.q();
                            nm6Var = nm6.a;
                            if (q != nm6Var) {
                                q = Unit.a;
                            }
                            if (q == nm6Var) {
                                return q;
                            }
                        } else {
                            r7o r7oVar4 = z7o.b;
                        }
                        J.resumeWith(Unit.a);
                        q = J.q();
                        nm6Var = nm6.a;
                        if (q != nm6Var) {
                        }
                        if (q == nm6Var) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        J.C();
                        throw th;
                    }
                } else if (h3 == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(zi3Var2)) {
                        hd4Var2.a();
                    }
                    Object F2 = F(obj, continuation);
                    if (F2 == nm6.a) {
                        return F2;
                    }
                } else if (h3 == 5) {
                    hd4Var2.a();
                }
            } else if (z2) {
                hd4Var2.i();
                Object F3 = F(obj, continuation);
                if (F3 == nm6.a) {
                    return F3;
                }
            }
        }
    }

    public final boolean n(Throwable th) {
        return o(th, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Throwable th, boolean z) {
        zi3 zi3Var;
        js3 js3Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (z) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) == 0) {
                    hd4 hd4Var = bj3.a;
                    zi3Var = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(zi3Var, j6, (j6 & 1152921504606846975L) + (1 << 60)));
            js3Var = bj3.s;
            while (true) {
                atomicReferenceFieldUpdater = i;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, js3Var, th)) {
                    z2 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != js3Var) {
                    z2 = false;
                    break;
                }
            }
            if (z) {
                do {
                    j2 = atomicLongFieldUpdater.get(this);
                    int i2 = (int) (j2 >> 60);
                    if (i2 == 0) {
                        j3 = j2 & 1152921504606846975L;
                        j4 = 2;
                    } else {
                        if (i2 != 1) {
                            break;
                        }
                        j3 = j2 & 1152921504606846975L;
                        j4 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(zi3Var, j2, (j4 << 60) + j3));
            } else {
                do {
                    j5 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(zi3Var, j5, (3 << 60) + (j5 & 1152921504606846975L)));
            }
            B();
            if (z2) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    js3 js3Var2 = obj == null ? bj3.q : bj3.r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, js3Var2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    wct.o(1, obj);
                    ((Function1) obj).invoke(t());
                    return z2;
                }
            }
            return z2;
        }
        zi3Var = this;
        js3Var = bj3.s;
        while (true) {
            atomicReferenceFieldUpdater = i;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, js3Var, th)) {
            }
        }
        if (z) {
        }
        B();
        if (z2) {
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (defpackage.hd4) ((defpackage.e46) defpackage.e46.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hd4 p(long j2) {
        Object obj;
        long j3;
        Object obj2 = h.get(this);
        hd4 hd4Var = (hd4) f.get(this);
        if (hd4Var.c > ((hd4) obj2).c) {
            obj2 = hd4Var;
        }
        hd4 hd4Var2 = (hd4) g.get(this);
        if (hd4Var2.c > ((hd4) obj2).c) {
            obj2 = hd4Var2;
        }
        e46 e46Var = (e46) obj2;
        loop0: while (true) {
            e46Var.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e46.a;
            Object obj3 = atomicReferenceFieldUpdater.get(e46Var);
            obj = null;
            js3 js3Var = d46.a;
            if (obj3 == js3Var) {
                break;
            }
            e46 e46Var2 = (e46) obj3;
            if (e46Var2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(e46Var, null, js3Var)) {
                    if (atomicReferenceFieldUpdater.get(e46Var) != null) {
                        break;
                    }
                }
                break loop0;
            }
            e46Var = e46Var2;
        }
        hd4 hd4Var3 = (hd4) e46Var;
        if (C()) {
            hd4 hd4Var4 = hd4Var3;
            loop2: do {
                int i2 = bj3.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (hd4Var4.c * bj3.b) + i2;
                    if (j3 < c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object l = hd4Var4.l(i2);
                        if (l != null && l != bj3.e) {
                            if (l == bj3.d) {
                                break loop2;
                            }
                        } else {
                            if (hd4Var4.k(i2, l, bj3.l)) {
                                hd4Var4.i();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (hd4Var4 != null);
            j3 = -1;
            if (j3 != -1) {
                q(j3);
            }
        }
        loop5: for (hd4 hd4Var5 = hd4Var3; hd4Var5 != null; hd4Var5 = (hd4) ((e46) e46.b.get(hd4Var5))) {
            for (int i3 = bj3.b - 1; -1 < i3; i3--) {
                if ((hd4Var5.c * bj3.b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object l2 = hd4Var5.l(i3);
                    if (l2 != null && l2 != bj3.e) {
                        if (!(l2 instanceof iku)) {
                            if (!(l2 instanceof hku)) {
                                break;
                            }
                            if (hd4Var5.k(i3, l2, bj3.l)) {
                                obj = ksw.I(obj, l2);
                                hd4Var5.m(i3, true);
                                break;
                            }
                        } else {
                            if (hd4Var5.k(i3, l2, bj3.l)) {
                                obj = ksw.I(obj, ((iku) l2).a);
                                hd4Var5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (hd4Var5.k(i3, l2, bj3.l)) {
                            hd4Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                I((hku) obj, true);
                return hd4Var3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                I((hku) arrayList.get(size), true);
            }
        }
        return hd4Var3;
    }

    public final void q(long j2) {
        hd4 hd4Var = (hd4) g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.a + j3, d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = bj3.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (hd4Var.c != j5) {
                    hd4 s = s(j5, hd4Var);
                    if (s != null) {
                        hd4Var = s;
                    }
                }
                hd4 hd4Var2 = hd4Var;
                if (L(hd4Var2, i2, j3, null) != bj3.o) {
                    hd4Var2.a();
                } else if (j3 < w()) {
                    hd4Var2.a();
                }
                hd4Var = hd4Var2;
            }
        }
    }

    public final void r() {
        Object a;
        if (D()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        hd4 hd4Var = (hd4) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / bj3.b;
            if (w() <= andIncrement) {
                if (hd4Var.c < j2 && hd4Var.c() != null) {
                    E(j2, hd4Var);
                }
                x(this);
                return;
            }
            if (hd4Var.c != j2) {
                aj3 aj3Var = aj3.a;
                while (true) {
                    a = d46.a(hd4Var, j2, aj3Var);
                    if (!lsq.A(a)) {
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
                    } else {
                        break;
                    }
                }
                hd4 hd4Var2 = null;
                if (lsq.A(a)) {
                    B();
                    E(j2, hd4Var);
                    x(this);
                } else {
                    hd4 hd4Var3 = (hd4) lsq.x(a);
                    long j3 = hd4Var3.c;
                    if (j3 > j2) {
                        long j4 = j3 * bj3.b;
                        if (d.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            x(this);
                        }
                    } else {
                        hd4Var2 = hd4Var3;
                    }
                }
                if (hd4Var2 == null) {
                    continue;
                } else {
                    hd4Var = hd4Var2;
                }
            }
            int i2 = (int) (andIncrement % bj3.b);
            Object l = hd4Var.l(i2);
            boolean z = l instanceof hku;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !hd4Var.k(i2, l, bj3.g)) {
                while (true) {
                    Object l2 = hd4Var.l(i2);
                    if (!(l2 instanceof hku)) {
                        if (l2 != bj3.j) {
                            if (l2 != null) {
                                if (l2 == bj3.d || l2 == bj3.h || l2 == bj3.i || l2 == bj3.k || l2 == bj3.l) {
                                    break loop0;
                                } else if (l2 != bj3.f) {
                                    b6e.l(l2, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (hd4Var.k(i2, l2, bj3.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (hd4Var.k(i2, l2, new iku((hku) l2))) {
                            break loop0;
                        }
                    } else if (hd4Var.k(i2, l2, bj3.g)) {
                        if (K(l2, hd4Var, i2)) {
                            hd4Var.o(i2, bj3.d);
                            break;
                        } else {
                            hd4Var.o(i2, bj3.j);
                            hd4Var.i();
                        }
                    }
                }
            } else if (K(l, hd4Var, i2)) {
                hd4Var.o(i2, bj3.d);
                break;
            } else {
                hd4Var.o(i2, bj3.j);
                hd4Var.i();
                x(this);
            }
        }
        x(this);
    }

    public final hd4 s(long j2, hd4 hd4Var) {
        Object a;
        long j3;
        hd4 hd4Var2 = bj3.a;
        aj3 aj3Var = aj3.a;
        loop0: while (true) {
            a = d46.a(hd4Var, j2, aj3Var);
            if (!lsq.A(a)) {
                yap x = lsq.x(a);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
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
        if (lsq.A(a)) {
            B();
            if (hd4Var.c * bj3.b < w()) {
                hd4Var.a();
                return null;
            }
        } else {
            hd4 hd4Var3 = (hd4) lsq.x(a);
            long j4 = hd4Var3.c;
            if (!D() && j2 <= d.get(this) / bj3.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    yap yapVar2 = (yap) atomicReferenceFieldUpdater2.get(this);
                    if (yapVar2.c >= j4 || !hd4Var3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, yapVar2, hd4Var3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != yapVar2) {
                            if (hd4Var3.f()) {
                                hd4Var3.e();
                            }
                        }
                    }
                    if (yapVar2.f()) {
                        yapVar2.e();
                    }
                }
            }
            if (j4 <= j2) {
                return hd4Var3;
            }
            long j5 = j4 * bj3.b;
            do {
                j3 = c.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!c.compareAndSet(this, j3, j5));
            if (j4 * bj3.b < w()) {
                hd4Var3.a();
            }
        }
        return null;
    }

    public final Throwable t() {
        return (Throwable) i.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b9, code lost:
    
        r16 = r7;
        r3 = (defpackage.hd4) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (b.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z2 = true;
        List h2 = u75.h(g.get(this), f.get(this), h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : h2) {
            if (((hd4) obj) != bj3.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            wvs.n();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((hd4) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((hd4) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        hd4 hd4Var = (hd4) next;
        long j4 = c.get(this);
        long w = w();
        loop2: while (true) {
            int i4 = bj3.b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (hd4Var.c * bj3.b) + i5;
                if (j5 >= w && j5 >= j4) {
                    break loop2;
                }
                Object l = hd4Var.l(i5);
                boolean z3 = z2;
                Object obj2 = hd4Var.f.get(i5 * 2);
                if (l instanceof yt3) {
                    str = (j5 >= j4 || j5 < w) ? (j5 >= w || j5 < j4) ? "cont" : "send" : "receive";
                } else if (l instanceof acp) {
                    str = (j5 >= j4 || j5 < w) ? (j5 >= w || j5 < j4) ? "select" : "onSend" : "onReceive";
                } else if (l instanceof pln) {
                    str = "receiveCatching";
                } else if (l instanceof iku) {
                    str = "EB(" + l + ')';
                } else if (Intrinsics.d(l, bj3.f) || Intrinsics.d(l, bj3.g)) {
                    str = "resuming_sender";
                } else {
                    if (l != null && !l.equals(bj3.e) && !l.equals(bj3.i) && !l.equals(bj3.h) && !l.equals(bj3.k) && !l.equals(bj3.j) && !l.equals(bj3.l)) {
                        str = l.toString();
                    }
                    i5++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i5++;
                z2 = z3;
            }
            z2 = z;
            i3 = 0;
        }
        if (mlr.I(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable t = t();
        return t == null ? new iq4("Channel was closed") : t;
    }

    public final Throwable v() {
        Throwable t = t();
        return t == null ? new jq4("Channel was closed") : t;
    }

    public final long w() {
        return b.get(this) & 1152921504606846975L;
    }

    public final void y(Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            js3 js3Var = bj3.q;
            if (obj != js3Var) {
                if (obj == bj3.r) {
                    xq0.q("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    b6e.l(obj, "Another handler is already registered: ");
                    return;
                }
            }
            js3 js3Var2 = bj3.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, js3Var, js3Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != js3Var) {
                    break;
                }
            }
            function1.invoke(t());
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (defpackage.hd4) ((defpackage.e46) defpackage.e46.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            if (i2 == 2) {
                p(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                        hd4 hd4Var = (hd4) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (w() <= j3) {
                            break;
                        }
                        long j4 = bj3.b;
                        long j5 = j3 / j4;
                        if (hd4Var.c != j5 && (hd4Var = s(j5, hd4Var)) == null) {
                            if (((hd4) atomicReferenceFieldUpdater.get(this)).c < j5) {
                                break;
                            }
                        } else {
                            hd4Var.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object l = hd4Var.l(i3);
                                if (l == null || l == bj3.e) {
                                    if (hd4Var.k(i3, l, bj3.h)) {
                                        r();
                                        break;
                                    }
                                } else {
                                    if (l == bj3.d) {
                                        break;
                                    }
                                    if (l != bj3.j) {
                                        if (l != bj3.l) {
                                            if (l != bj3.i) {
                                                if (l != bj3.h) {
                                                    if (l == bj3.g) {
                                                        break;
                                                    }
                                                    if (l != bj3.f && j3 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            c.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    wb8.h(k5r.i(i2, "unexpected close status: "));
                    return false;
                }
                hd4 p = p(1152921504606846975L & j2);
                Object obj = null;
                loop0: do {
                    int i4 = bj3.b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (p.c * bj3.b) + i4;
                        while (true) {
                            Object l2 = p.l(i4);
                            if (l2 == bj3.i) {
                                break loop0;
                            }
                            if (l2 == bj3.d) {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (p.k(i4, l2, bj3.l)) {
                                    p.n(i4, null);
                                    p.i();
                                    break;
                                }
                            } else if (l2 != bj3.e && l2 != null) {
                                if (!(l2 instanceof hku) && !(l2 instanceof iku)) {
                                    js3 js3Var = bj3.g;
                                    if (l2 == js3Var || l2 == bj3.f) {
                                        break loop0;
                                    }
                                    if (l2 != js3Var) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    hku hkuVar = l2 instanceof iku ? ((iku) l2).a : (hku) l2;
                                    if (p.k(i4, l2, bj3.l)) {
                                        obj = ksw.I(obj, hkuVar);
                                        p.n(i4, null);
                                        p.i();
                                        break;
                                    }
                                }
                            } else if (p.k(i4, l2, bj3.l)) {
                                p.i();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (p != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            I((hku) arrayList.get(size), false);
                        }
                    } else {
                        I((hku) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
