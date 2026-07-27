package Q7;

import D.y;
import O7.AbstractC0399y;
import O7.C0382g;
import O7.InterfaceC0381f;
import O7.y0;
import T7.t;
import T7.u;
import T7.v;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r7.AbstractC4980k;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public class c implements g {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final int f2747n;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2741u = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2742v = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2743w = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2744x = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2745y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2746z = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2738A = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2739B = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2740C = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");

    public c(int i) {
        this.f2747n = i;
        if (i < 0) {
            throw new IllegalArgumentException(y.i(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f2749a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f2743w.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (v()) {
            kVar2 = e.f2749a;
            kotlin.jvm.internal.h.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f2766s;
    }

    public static boolean A(Object obj) {
        if (!(obj instanceof InterfaceC0381f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0381f interfaceC0381f = (InterfaceC0381f) obj;
        k kVar = e.f2749a;
        v d2 = interfaceC0381f.d(q7.v.f40183a, null);
        if (d2 == null) {
            return false;
        }
        interfaceC0381f.f(d2);
        return true;
    }

    public static final k d(c cVar, long j9, k kVar) {
        Object b9;
        c cVar2;
        cVar.getClass();
        k kVar2 = e.f2749a;
        d dVar = d.f2748v;
        loop0: while (true) {
            b9 = T7.a.b(kVar, j9, dVar);
            if (!T7.a.e(b9)) {
                t c4 = T7.a.c(b9);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2745y;
                    t tVar = (t) atomicReferenceFieldUpdater.get(cVar);
                    if (tVar.f3166v >= c4.f3166v) {
                        break loop0;
                    }
                    if (!c4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, c4)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                            if (c4.e()) {
                                c4.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e6 = T7.a.e(b9);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2742v;
        if (e6) {
            cVar.k();
            if (kVar.f3166v * e.f2750b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) T7.a.c(b9);
            long j10 = kVar3.f3166v;
            if (j10 <= j9) {
                return kVar3;
            }
            long j11 = e.f2750b * j10;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2741u;
                long j12 = atomicLongFieldUpdater2.get(cVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (atomicLongFieldUpdater2.compareAndSet(cVar2, j12, j13 + (((int) (j12 >> 60)) << 60))) {
                    break;
                }
                cVar = cVar2;
            }
            if (j10 * e.f2750b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void f(c cVar, Object obj, C0382g c0382g) {
        cVar.getClass();
        c0382g.resumeWith(com.bumptech.glide.f.e(cVar.q()));
    }

    public static final int g(c cVar, k kVar, int i, Object obj, long j9, Object obj2, boolean z8) {
        cVar.getClass();
        kVar.m(i, obj);
        if (z8) {
            return cVar.C(kVar, i, obj, j9, obj2, z8);
        }
        Object k6 = kVar.k(i);
        if (k6 == null) {
            if (cVar.h(j9)) {
                if (kVar.j(i, null, e.f2752d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (k6 instanceof y0) {
            kVar.m(i, null);
            if (cVar.z(k6, obj)) {
                kVar.n(i, e.i);
                return 0;
            }
            v vVar = e.f2758k;
            if (kVar.f2773y.getAndSet((i * 2) + 1, vVar) == vVar) {
                return 5;
            }
            kVar.l(i, true);
            return 5;
        }
        return cVar.C(kVar, i, obj, j9, obj2, z8);
    }

    public static void s(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2744x;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object B(k kVar, int i, long j9, Object obj) {
        Object k6 = kVar.k(i);
        AtomicReferenceArray atomicReferenceArray = kVar.f2773y;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2741u;
        if (k6 == null) {
            if (j9 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f2761n;
                }
                if (kVar.j(i, k6, obj)) {
                    m();
                    return e.f2760m;
                }
            }
        } else if (k6 == e.f2752d && kVar.j(i, k6, e.i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i * 2);
            kVar.m(i, null);
            return obj2;
        }
        while (true) {
            Object k9 = kVar.k(i);
            if (k9 == null || k9 == e.f2753e) {
                if (j9 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i, k9, e.f2756h)) {
                        m();
                        return e.f2762o;
                    }
                } else {
                    if (obj == null) {
                        return e.f2761n;
                    }
                    if (kVar.j(i, k9, obj)) {
                        m();
                        return e.f2760m;
                    }
                }
            } else if (k9 != e.f2752d) {
                v vVar = e.f2757j;
                if (k9 == vVar) {
                    return e.f2762o;
                }
                if (k9 == e.f2756h) {
                    return e.f2762o;
                }
                if (k9 == e.f2759l) {
                    m();
                    return e.f2762o;
                }
                if (k9 != e.f2755g && kVar.j(i, k9, e.f2754f)) {
                    boolean z8 = k9 instanceof s;
                    if (z8) {
                        k9 = ((s) k9).f2777a;
                    }
                    if (A(k9)) {
                        kVar.n(i, e.i);
                        m();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        kVar.m(i, null);
                        return obj3;
                    }
                    kVar.n(i, vVar);
                    kVar.h();
                    if (z8) {
                        m();
                    }
                    return e.f2762o;
                }
            } else if (kVar.j(i, k9, e.i)) {
                m();
                Object obj4 = atomicReferenceArray.get(i * 2);
                kVar.m(i, null);
                return obj4;
            }
        }
    }

    public final int C(k kVar, int i, Object obj, long j9, Object obj2, boolean z8) {
        while (true) {
            Object k6 = kVar.k(i);
            if (k6 == null) {
                if (!h(j9) || z8) {
                    if (z8) {
                        if (kVar.j(i, null, e.f2757j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i, null, e.f2752d)) {
                    break;
                }
            } else {
                if (k6 != e.f2753e) {
                    v vVar = e.f2758k;
                    if (k6 == vVar) {
                        kVar.m(i, null);
                        return 5;
                    }
                    if (k6 == e.f2756h) {
                        kVar.m(i, null);
                        return 5;
                    }
                    if (k6 == e.f2759l) {
                        kVar.m(i, null);
                        k();
                        return 4;
                    }
                    kVar.m(i, null);
                    if (k6 instanceof s) {
                        k6 = ((s) k6).f2777a;
                    }
                    if (z(k6, obj)) {
                        kVar.n(i, e.i);
                        return 0;
                    }
                    if (kVar.f2773y.getAndSet((i * 2) + 1, vVar) != vVar) {
                        kVar.l(i, true);
                    }
                    return 5;
                }
                if (kVar.j(i, k6, e.f2752d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void D(long j9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.v()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f2743w;
            if (atomicLongFieldUpdater.get(cVar) > j9) {
                break;
            } else {
                cVar = this;
            }
        }
        int i = e.f2751c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2744x;
            if (i4 < i) {
                long j10 = atomicLongFieldUpdater.get(cVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j10 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i4++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(cVar);
                    long j13 = atomicLongFieldUpdater2.get(cVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z8 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (!z8) {
                        atomicLongFieldUpdater2.compareAndSet(this, j13, 4611686018427387904L + j14);
                    }
                    cVar = this;
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // Q7.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c6, code lost:
    
        f(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[RETURN] */
    @Override // Q7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Object obj, InterfaceC5133d interfaceC5133d) {
        Object q6;
        EnumC5179a enumC5179a;
        Object obj2;
        c cVar;
        int i;
        int i4;
        boolean z8;
        k kVar;
        c cVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2745y;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2741u;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar2);
            long j9 = andIncrement & 1152921504606846975L;
            boolean t9 = cVar2.t(andIncrement, false);
            int i9 = e.f2750b;
            long j10 = i9;
            long j11 = j9 / j10;
            int i10 = (int) (j9 % j10);
            long j12 = kVar2.f3166v;
            q7.v vVar = q7.v.f40183a;
            if (j12 != j11) {
                k d2 = d(cVar2, j11, kVar2);
                if (d2 != null) {
                    kVar2 = d2;
                } else if (t9) {
                    Object x3 = x(obj, interfaceC5133d);
                    if (x3 == EnumC5179a.f41704n) {
                        return x3;
                    }
                }
            }
            int g9 = g(cVar2, kVar2, i10, obj, j9, null, t9);
            if (g9 == 0) {
                kVar2.a();
                return vVar;
            }
            if (g9 == 1) {
                break;
            }
            if (g9 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2742v;
                if (g9 == 3) {
                    C0382g k6 = AbstractC0399y.k(w8.a.f(interfaceC5133d));
                    Object obj3 = obj;
                    try {
                        int g10 = g(cVar2, kVar2, i10, obj3, j9, k6, false);
                        try {
                            if (g10 != 0) {
                                if (g10 == 1) {
                                    k6.resumeWith(vVar);
                                } else if (g10 != 2) {
                                    if (g10 != 4) {
                                        String str = "unexpected";
                                        if (g10 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar2);
                                            long j13 = andIncrement2 & 1152921504606846975L;
                                            boolean t10 = cVar2.t(andIncrement2, false);
                                            int i11 = e.f2750b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j14 = i11;
                                            String str2 = str;
                                            long j15 = j13 / j14;
                                            int i12 = (int) (j13 % j14);
                                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                            if (kVar3.f3166v != j15) {
                                                k d3 = d(cVar2, j15, kVar3);
                                                if (d3 != null) {
                                                    z8 = t10;
                                                    kVar = d3;
                                                    i = i11;
                                                    i4 = i12;
                                                } else {
                                                    if (t10) {
                                                        break;
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                }
                                            } else {
                                                i = i11;
                                                i4 = i12;
                                                z8 = t10;
                                                kVar = kVar3;
                                            }
                                            int g11 = g(cVar2, kVar, i4, obj3, j13, k6, z8);
                                            Object obj4 = obj3;
                                            cVar = cVar2;
                                            k kVar4 = kVar;
                                            int i13 = i4;
                                            obj2 = obj4;
                                            if (g11 == 0) {
                                                kVar4.a();
                                                break;
                                            }
                                            if (g11 == 1) {
                                                break;
                                            }
                                            if (g11 != 2) {
                                                if (g11 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (g11 != 4) {
                                                    if (g11 == 5) {
                                                        kVar4.a();
                                                    }
                                                    kVar3 = kVar4;
                                                    cVar2 = cVar;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                    obj3 = obj2;
                                                } else if (j13 < atomicLongFieldUpdater4.get(cVar)) {
                                                    kVar4.a();
                                                }
                                            } else if (z8) {
                                                kVar4.h();
                                            } else {
                                                k6.a(kVar4, i13 + i);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar = cVar2;
                                        if (j9 < atomicLongFieldUpdater2.get(cVar)) {
                                            kVar2.a();
                                        }
                                    }
                                    f(cVar, obj2, k6);
                                } else {
                                    k6.a(kVar2, i10 + i9);
                                }
                                q6 = k6.q();
                                enumC5179a = EnumC5179a.f41704n;
                                if (q6 != enumC5179a) {
                                    q6 = vVar;
                                }
                                if (q6 != enumC5179a) {
                                    return q6;
                                }
                            } else {
                                kVar2.a();
                            }
                            k6.resumeWith(vVar);
                            q6 = k6.q();
                            enumC5179a = EnumC5179a.f41704n;
                            if (q6 != enumC5179a) {
                            }
                            if (q6 != enumC5179a) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            k6.y();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (g9 == 4) {
                    if (j9 < atomicLongFieldUpdater2.get(cVar2)) {
                        kVar2.a();
                    }
                    Object x9 = x(obj, interfaceC5133d);
                    if (x9 == EnumC5179a.f41704n) {
                        return x9;
                    }
                } else if (g9 == 5) {
                    kVar2.a();
                }
            } else if (t9) {
                kVar2.h();
                Object x10 = x(obj, interfaceC5133d);
                if (x10 == EnumC5179a.f41704n) {
                    return x10;
                }
            }
        }
    }

    @Override // Q7.q
    public final Object c(InterfaceC5133d interfaceC5133d) {
        k kVar;
        c cVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2746z;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2741u;
            if (cVar.t(atomicLongFieldUpdater.get(cVar), true)) {
                Throwable p6 = p();
                int i = u.f3167a;
                throw p6;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2742v;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
            long j9 = e.f2750b;
            long j10 = andIncrement / j9;
            int i4 = (int) (andIncrement % j9);
            if (kVar2.f3166v != j10) {
                k n9 = cVar.n(j10, kVar2);
                if (n9 == null) {
                    continue;
                } else {
                    kVar2 = n9;
                }
            }
            Object B8 = cVar.B(kVar2, i4, andIncrement, null);
            v vVar = e.f2760m;
            if (B8 == vVar) {
                throw new IllegalStateException("unexpected");
            }
            v vVar2 = e.f2762o;
            if (B8 != vVar2) {
                if (B8 != e.f2761n) {
                    kVar2.a();
                    return B8;
                }
                C0382g k6 = AbstractC0399y.k(w8.a.f(interfaceC5133d));
                c cVar2 = this;
                try {
                    Object B9 = cVar2.B(kVar2, i4, andIncrement, k6);
                    if (B9 == vVar) {
                        k6.a(kVar2, i4);
                    } else if (B9 == vVar2) {
                        if (andIncrement < cVar2.r()) {
                            kVar2.a();
                        }
                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                        while (true) {
                            if (cVar2.t(atomicLongFieldUpdater.get(cVar2), true)) {
                                k6.resumeWith(com.bumptech.glide.f.e(cVar2.p()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(cVar2);
                            long j11 = e.f2750b;
                            long j12 = andIncrement2 / j11;
                            int i9 = (int) (andIncrement2 % j11);
                            if (kVar3.f3166v != j12) {
                                kVar = cVar2.n(j12, kVar3);
                                if (kVar == null) {
                                }
                            } else {
                                kVar = kVar3;
                            }
                            Object B10 = cVar2.B(kVar, i9, andIncrement2, k6);
                            if (B10 == e.f2760m) {
                                k6.a(kVar, i9);
                                break;
                            }
                            if (B10 == e.f2762o) {
                                if (andIncrement2 < r()) {
                                    kVar.a();
                                }
                                cVar2 = this;
                                kVar3 = kVar;
                            } else {
                                if (B10 == e.f2761n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kVar.a();
                                k6.z(B10, null);
                            }
                        }
                    } else {
                        kVar2.a();
                        k6.z(B9, null);
                    }
                    Object q6 = k6.q();
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    return q6;
                } catch (Throwable th) {
                    k6.y();
                    throw th;
                }
            }
            if (andIncrement < r()) {
                kVar2.a();
            }
            cVar = this;
        }
    }

    @Override // Q7.r
    public Object e(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2741u;
        boolean z8 = false;
        long j9 = 1152921504606846975L;
        boolean z9 = t(atomicLongFieldUpdater.get(this), false) ? false : !h(r1 & 1152921504606846975L);
        i iVar = j.f2771a;
        if (z9) {
            return iVar;
        }
        Object obj2 = e.f2757j;
        k kVar = (k) f2745y.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & j9;
            boolean t9 = t(andIncrement, z8);
            int i = e.f2750b;
            long j11 = i;
            long j12 = j10 / j11;
            int i4 = (int) (j10 % j11);
            if (kVar.f3166v != j12) {
                k d2 = d(this, j12, kVar);
                if (d2 != null) {
                    kVar = d2;
                } else {
                    if (t9) {
                        return new h(q());
                    }
                    z8 = false;
                    j9 = 1152921504606846975L;
                }
            }
            int g9 = g(this, kVar, i4, obj, j10, obj2, t9);
            q7.v vVar = q7.v.f40183a;
            if (g9 == 0) {
                kVar.a();
                return vVar;
            }
            if (g9 == 1) {
                return vVar;
            }
            if (g9 == 2) {
                if (t9) {
                    kVar.h();
                    return new h(q());
                }
                y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                if (y0Var != null) {
                    y0Var.a(kVar, i4 + i);
                }
                kVar.h();
                return iVar;
            }
            if (g9 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (g9 == 4) {
                if (j10 < f2742v.get(this)) {
                    kVar.a();
                }
                return new h(q());
            }
            if (g9 == 5) {
                kVar.a();
            }
            z8 = false;
            j9 = 1152921504606846975L;
        }
    }

    public final boolean h(long j9) {
        return j9 < f2743w.get(this) || j9 < f2742v.get(this) + ((long) this.f2747n);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Throwable th, boolean z8) {
        c cVar;
        v vVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z9;
        long j9;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2741u;
        if (z8) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
                if (((int) (j13 >> 60)) == 0) {
                    k kVar = e.f2749a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j13, (j13 & 1152921504606846975L) + (1 << 60)));
            vVar = e.f2766s;
            while (true) {
                atomicReferenceFieldUpdater = f2739B;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
                    z9 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                    z9 = false;
                    break;
                }
            }
            if (z8) {
                do {
                    j9 = atomicLongFieldUpdater.get(this);
                    int i = (int) (j9 >> 60);
                    if (i == 0) {
                        j10 = j9 & 1152921504606846975L;
                        j11 = 2;
                    } else {
                        if (i != 1) {
                            break;
                        }
                        j10 = j9 & 1152921504606846975L;
                        j11 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j9, (j11 << 60) + j10));
            } else {
                do {
                    j12 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j12, (3 << 60) + (j12 & 1152921504606846975L)));
            }
            k();
            if (z9) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2740C;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    v vVar2 = obj == null ? e.f2764q : e.f2765r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, vVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    kotlin.jvm.internal.u.b(1, obj);
                    ((E7.l) obj).invoke(o());
                    return z9;
                }
            }
            return z9;
        }
        cVar = this;
        vVar = e.f2766s;
        while (true) {
            atomicReferenceFieldUpdater = f2739B;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
            }
        }
        if (z8) {
        }
        k();
        if (z9) {
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (Q7.k) ((T7.d) T7.d.f3135u.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k j(long j9) {
        Object obj;
        long j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f2738A.get(this);
        k kVar = (k) f2745y.get(this);
        if (kVar.f3166v > ((k) obj2).f3166v) {
            obj2 = kVar;
        }
        k kVar2 = (k) f2746z.get(this);
        if (kVar2.f3166v > ((k) obj2).f3166v) {
            obj2 = kVar2;
        }
        T7.d dVar = (T7.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = T7.d.f3134n.get(dVar);
            v vVar = T7.a.f3127b;
            obj = null;
            if (obj3 == vVar) {
                break;
            }
            T7.d dVar2 = (T7.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = T7.d.f3134n;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, vVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        k kVar3 = (k) dVar;
        if (u()) {
            k kVar4 = kVar3;
            loop2: do {
                int i = e.f2750b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j10 = (kVar4.f3166v * e.f2750b) + i;
                    if (j10 < f2742v.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k6 = kVar4.k(i);
                        if (k6 != null && k6 != e.f2753e) {
                            if (k6 == e.f2752d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i, k6, e.f2759l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (kVar4 != null);
            j10 = -1;
            if (j10 != -1) {
                l(j10);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((T7.d) T7.d.f3135u.get(kVar5))) {
            for (int i4 = e.f2750b - 1; -1 < i4; i4--) {
                if ((kVar5.f3166v * e.f2750b) + i4 < j9) {
                    break loop5;
                }
                while (true) {
                    Object k9 = kVar5.k(i4);
                    if (k9 != null && k9 != e.f2753e) {
                        if (!(k9 instanceof s)) {
                            if (!(k9 instanceof y0)) {
                                break;
                            }
                            if (kVar5.j(i4, k9, e.f2759l)) {
                                obj = T7.a.f(obj, k9);
                                kVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i4, k9, e.f2759l)) {
                                obj = T7.a.f(obj, ((s) k9).f2777a);
                                kVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i4, k9, e.f2759l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                y((y0) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                y((y0) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void k() {
        t(f2741u.get(this), false);
    }

    public final void l(long j9) {
        k kVar = (k) f2746z.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2742v;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j9 < Math.max(this.f2747n + j10, f2743w.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = e.f2750b;
                long j12 = j10 / j11;
                int i = (int) (j10 % j11);
                if (kVar.f3166v != j12) {
                    k n9 = n(j12, kVar);
                    if (n9 != null) {
                        kVar = n9;
                    }
                }
                k kVar2 = kVar;
                if (B(kVar2, i, j10, null) != e.f2762o) {
                    kVar2.a();
                } else if (j10 < r()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void m() {
        Object b9;
        if (v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2738A;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f2743w.getAndIncrement(this);
            long j9 = andIncrement / e.f2750b;
            if (r() <= andIncrement) {
                if (kVar.f3166v < j9 && kVar.b() != null) {
                    w(j9, kVar);
                }
                s(this);
                return;
            }
            if (kVar.f3166v != j9) {
                d dVar = d.f2748v;
                while (true) {
                    b9 = T7.a.b(kVar, j9, dVar);
                    if (!T7.a.e(b9)) {
                        t c4 = T7.a.c(b9);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f3166v >= c4.f3166v) {
                                break;
                            }
                            if (!c4.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c4)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (c4.e()) {
                                        c4.d();
                                    }
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (T7.a.e(b9)) {
                    k();
                    w(j9, kVar);
                    s(this);
                } else {
                    k kVar3 = (k) T7.a.c(b9);
                    long j10 = kVar3.f3166v;
                    if (j10 > j9) {
                        long j11 = j10 * e.f2750b;
                        if (f2743w.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f2744x;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            s(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i = (int) (andIncrement % e.f2750b);
            Object k6 = kVar.k(i);
            boolean z8 = k6 instanceof y0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2742v;
            if (!z8 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i, k6, e.f2755g)) {
                while (true) {
                    Object k9 = kVar.k(i);
                    if (!(k9 instanceof y0)) {
                        if (k9 != e.f2757j) {
                            if (k9 != null) {
                                if (k9 == e.f2752d || k9 == e.f2756h || k9 == e.i || k9 == e.f2758k || k9 == e.f2759l) {
                                    break loop0;
                                }
                                if (k9 != e.f2754f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k9).toString());
                                }
                            } else if (kVar.j(i, k9, e.f2753e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i, k9, new s((y0) k9))) {
                            break loop0;
                        }
                    } else if (kVar.j(i, k9, e.f2755g)) {
                        if (A(k9)) {
                            kVar.n(i, e.f2752d);
                            break;
                        } else {
                            kVar.n(i, e.f2757j);
                            kVar.h();
                        }
                    }
                }
            } else if (A(k6)) {
                kVar.n(i, e.f2752d);
                break;
            } else {
                kVar.n(i, e.f2757j);
                kVar.h();
                s(this);
            }
        }
        s(this);
    }

    public final k n(long j9, k kVar) {
        Object b9;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        k kVar2 = e.f2749a;
        d dVar = d.f2748v;
        loop0: while (true) {
            b9 = T7.a.b(kVar, j9, dVar);
            if (!T7.a.e(b9)) {
                t c4 = T7.a.c(b9);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2746z;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f3166v >= c4.f3166v) {
                        break loop0;
                    }
                    if (!c4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c4)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (c4.e()) {
                                c4.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (T7.a.e(b9)) {
            k();
            if (kVar.f3166v * e.f2750b < r()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) T7.a.c(b9);
            boolean v6 = v();
            long j11 = kVar3.f3166v;
            if (!v6 && j9 <= f2743w.get(this) / e.f2750b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2738A;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f3166v >= j11 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (tVar2.e()) {
                        tVar2.d();
                    }
                }
            }
            if (j11 <= j9) {
                return kVar3;
            }
            long j12 = j11 * e.f2750b;
            do {
                atomicLongFieldUpdater = f2742v;
                j10 = atomicLongFieldUpdater.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j12));
            if (j11 * e.f2750b < r()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable o() {
        return (Throwable) f2739B.get(this);
    }

    public final Throwable p() {
        Throwable o9 = o();
        return o9 == null ? new l("Channel was closed") : o9;
    }

    public final Throwable q() {
        Throwable o9 = o();
        return o9 == null ? new m("Channel was closed") : o9;
    }

    public final long r() {
        return f2741u.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (Q7.k) ((T7.d) T7.d.f3135u.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(long j9, boolean z8) {
        int i = (int) (j9 >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2742v;
            if (i == 2) {
                j(1152921504606846975L & j9);
                if (z8) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2746z;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j10 = atomicLongFieldUpdater.get(this);
                        if (r() <= j10) {
                            break;
                        }
                        long j11 = e.f2750b;
                        long j12 = j10 / j11;
                        if (kVar.f3166v != j12 && (kVar = n(j12, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f3166v < j12) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i4 = (int) (j10 % j11);
                            while (true) {
                                Object k6 = kVar.k(i4);
                                if (k6 == null || k6 == e.f2753e) {
                                    if (kVar.j(i4, k6, e.f2756h)) {
                                        m();
                                        break;
                                    }
                                } else {
                                    if (k6 == e.f2752d) {
                                        break;
                                    }
                                    if (k6 != e.f2757j) {
                                        if (k6 != e.f2759l) {
                                            if (k6 != e.i) {
                                                if (k6 != e.f2756h) {
                                                    if (k6 == e.f2755g) {
                                                        break;
                                                    }
                                                    if (k6 != e.f2754f && j10 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f2742v.compareAndSet(this, j10, j10 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(CL.i(i, "unexpected close status: ").toString());
                }
                k j13 = j(1152921504606846975L & j9);
                Object obj = null;
                loop0: do {
                    int i9 = e.f2750b - 1;
                    while (true) {
                        if (-1 >= i9) {
                            break;
                        }
                        long j14 = (j13.f3166v * e.f2750b) + i9;
                        while (true) {
                            Object k9 = j13.k(i9);
                            if (k9 == e.i) {
                                break loop0;
                            }
                            if (k9 == e.f2752d) {
                                if (j14 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (j13.j(i9, k9, e.f2759l)) {
                                    j13.m(i9, null);
                                    j13.h();
                                    break;
                                }
                            } else if (k9 != e.f2753e && k9 != null) {
                                if (!(k9 instanceof y0) && !(k9 instanceof s)) {
                                    v vVar = e.f2755g;
                                    if (k9 == vVar || k9 == e.f2754f) {
                                        break loop0;
                                    }
                                    if (k9 != vVar) {
                                        break;
                                    }
                                } else {
                                    if (j14 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    y0 y0Var = k9 instanceof s ? ((s) k9).f2777a : (y0) k9;
                                    if (j13.j(i9, k9, e.f2759l)) {
                                        obj = T7.a.f(obj, y0Var);
                                        j13.m(i9, null);
                                        j13.h();
                                        break;
                                    }
                                }
                            } else if (j13.j(i9, k9, e.f2759l)) {
                                j13.h();
                                break;
                            }
                        }
                        i9--;
                    }
                } while (j13 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            y((y0) arrayList.get(size), false);
                        }
                    } else {
                        y((y0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        r16 = r7;
        r3 = (Q7.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z8;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f2741u.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f2747n + ',');
        sb.append("data=[");
        int i4 = 0;
        boolean z9 = true;
        List B8 = AbstractC4980k.B(f2746z.get(this), f2745y.get(this), f2738A.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : B8) {
            if (((k) obj2) != e.f2749a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j9 = ((k) next).f3166v;
            do {
                Object next2 = it.next();
                long j10 = ((k) next2).f3166v;
                if (j9 > j10) {
                    next = next2;
                    j9 = j10;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j11 = f2742v.get(this);
        long r9 = r();
        loop2: while (true) {
            int i9 = e.f2750b;
            int i10 = i4;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                long j12 = (kVar.f3166v * e.f2750b) + i10;
                if (j12 >= r9 && j12 >= j11) {
                    break loop2;
                }
                Object k6 = kVar.k(i10);
                boolean z10 = z9;
                Object obj3 = kVar.f2773y.get(i10 * 2);
                if (k6 instanceof InterfaceC0381f) {
                    obj = (j12 >= j11 || j12 < r9) ? (j12 >= r9 || j12 < j11) ? "cont" : "send" : "receive";
                } else if (k6 instanceof s) {
                    obj = "EB(" + k6 + ')';
                } else if (kotlin.jvm.internal.h.a(k6, e.f2754f) ? z10 : kotlin.jvm.internal.h.a(k6, e.f2755g)) {
                    obj = "resuming_sender";
                } else if (k6 == null ? z10 : k6.equals(e.f2753e) ? z10 : kotlin.jvm.internal.h.a(k6, e.i) ? z10 : kotlin.jvm.internal.h.a(k6, e.f2756h) ? z10 : kotlin.jvm.internal.h.a(k6, e.f2758k) ? z10 : kotlin.jvm.internal.h.a(k6, e.f2757j) ? z10 : kotlin.jvm.internal.h.a(k6, e.f2759l)) {
                    i10++;
                    z9 = z10;
                } else {
                    obj = k6.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i10++;
                z9 = z10;
            }
            z9 = z8;
            i4 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(M7.j.O(sb)) == ',') {
            kotlin.jvm.internal.h.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j9 = f2743w.get(this);
        return j9 == 0 || j9 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j9, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f3166v < j9 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2738A;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f3166v >= kVar.f3166v) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final Object x(Object obj, InterfaceC5133d interfaceC5133d) {
        C0382g c0382g = new C0382g(1, w8.a.f(interfaceC5133d));
        c0382g.r();
        c0382g.resumeWith(com.bumptech.glide.f.e(q()));
        Object q6 = c0382g.q();
        return q6 == EnumC5179a.f41704n ? q6 : q7.v.f40183a;
    }

    public final void y(y0 y0Var, boolean z8) {
        if (y0Var instanceof InterfaceC0381f) {
            ((InterfaceC5133d) y0Var).resumeWith(com.bumptech.glide.f.e(z8 ? p() : q()));
            return;
        }
        if (!(y0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + y0Var).toString());
        }
        b bVar = (b) y0Var;
        C0382g c0382g = bVar.f2736u;
        kotlin.jvm.internal.h.b(c0382g);
        bVar.f2736u = null;
        bVar.f2735n = e.f2759l;
        Throwable o9 = bVar.f2737v.o();
        if (o9 == null) {
            c0382g.resumeWith(Boolean.FALSE);
        } else {
            c0382g.resumeWith(com.bumptech.glide.f.e(o9));
        }
    }

    public final boolean z(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC0381f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0381f interfaceC0381f = (InterfaceC0381f) obj;
            k kVar = e.f2749a;
            v d2 = interfaceC0381f.d(obj2, null);
            if (d2 == null) {
                return false;
            }
            interfaceC0381f.f(d2);
            return true;
        }
        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0382g c0382g = bVar.f2736u;
        kotlin.jvm.internal.h.b(c0382g);
        bVar.f2736u = null;
        bVar.f2735n = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f2737v.getClass();
        k kVar2 = e.f2749a;
        v d3 = c0382g.d(bool, null);
        if (d3 == null) {
            return false;
        }
        c0382g.f(d3);
        return true;
    }
}
