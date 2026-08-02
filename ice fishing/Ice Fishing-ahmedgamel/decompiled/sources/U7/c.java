package U7;

import D.x;
import E2.C0316m;
import S7.AbstractC0410y;
import S7.C0393g;
import S7.InterfaceC0392f;
import S7.y0;
import X7.t;
import X7.u;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.v;
import v7.AbstractC5120k;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public class c implements g {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final int f3358n;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3352u = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3353v = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3354w = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3355x = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3356y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3357z = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3349A = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3350B = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3351C = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");

    public c(int i) {
        this.f3358n = i;
        if (i < 0) {
            throw new IllegalArgumentException(x.j(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f3360a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f3354w.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (v()) {
            kVar2 = e.f3360a;
            kotlin.jvm.internal.h.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f3377s;
    }

    public static boolean A(Object obj) {
        if (!(obj instanceof InterfaceC0392f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0392f interfaceC0392f = (InterfaceC0392f) obj;
        k kVar = e.f3360a;
        C0316m c9 = interfaceC0392f.c(v.f41073a, null);
        if (c9 == null) {
            return false;
        }
        interfaceC0392f.f(c9);
        return true;
    }

    public static final k c(c cVar, long j6, k kVar) {
        Object b9;
        c cVar2;
        cVar.getClass();
        k kVar2 = e.f3360a;
        d dVar = d.f3359v;
        loop0: while (true) {
            b9 = X7.a.b(kVar, j6, dVar);
            if (!X7.a.e(b9)) {
                t c9 = X7.a.c(b9);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3356y;
                    t tVar = (t) atomicReferenceFieldUpdater.get(cVar);
                    if (tVar.f3815v >= c9.f3815v) {
                        break loop0;
                    }
                    if (!c9.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, c9)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                            if (c9.e()) {
                                c9.d();
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
        boolean e9 = X7.a.e(b9);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3353v;
        if (e9) {
            cVar.k();
            if (kVar.f3815v * e.f3361b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) X7.a.c(b9);
            long j9 = kVar3.f3815v;
            if (j9 <= j6) {
                return kVar3;
            }
            long j10 = e.f3361b * j9;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3352u;
                long j11 = atomicLongFieldUpdater2.get(cVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (atomicLongFieldUpdater2.compareAndSet(cVar2, j11, j12 + (((int) (j11 >> 60)) << 60))) {
                    break;
                }
                cVar = cVar2;
            }
            if (j9 * e.f3361b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void f(c cVar, Object obj, C0393g c0393g) {
        cVar.getClass();
        c0393g.resumeWith(Q3.b.b(cVar.q()));
    }

    public static final int g(c cVar, k kVar, int i, Object obj, long j6, Object obj2, boolean z6) {
        cVar.getClass();
        kVar.m(i, obj);
        if (z6) {
            return cVar.C(kVar, i, obj, j6, obj2, z6);
        }
        Object k9 = kVar.k(i);
        if (k9 == null) {
            if (cVar.h(j6)) {
                if (kVar.j(i, null, e.f3363d)) {
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
        } else if (k9 instanceof y0) {
            kVar.m(i, null);
            if (cVar.z(k9, obj)) {
                kVar.n(i, e.i);
                return 0;
            }
            C0316m c0316m = e.f3369k;
            if (kVar.f3384y.getAndSet((i * 2) + 1, c0316m) == c0316m) {
                return 5;
            }
            kVar.l(i, true);
            return 5;
        }
        return cVar.C(kVar, i, obj, j6, obj2, z6);
    }

    public static void s(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3355x;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object B(k kVar, int i, long j6, Object obj) {
        Object k9 = kVar.k(i);
        AtomicReferenceArray atomicReferenceArray = kVar.f3384y;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3352u;
        if (k9 == null) {
            if (j6 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f3372n;
                }
                if (kVar.j(i, k9, obj)) {
                    m();
                    return e.f3371m;
                }
            }
        } else if (k9 == e.f3363d && kVar.j(i, k9, e.i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i * 2);
            kVar.m(i, null);
            return obj2;
        }
        while (true) {
            Object k10 = kVar.k(i);
            if (k10 == null || k10 == e.f3364e) {
                if (j6 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i, k10, e.f3367h)) {
                        m();
                        return e.f3373o;
                    }
                } else {
                    if (obj == null) {
                        return e.f3372n;
                    }
                    if (kVar.j(i, k10, obj)) {
                        m();
                        return e.f3371m;
                    }
                }
            } else if (k10 != e.f3363d) {
                C0316m c0316m = e.f3368j;
                if (k10 == c0316m) {
                    return e.f3373o;
                }
                if (k10 == e.f3367h) {
                    return e.f3373o;
                }
                if (k10 == e.f3370l) {
                    m();
                    return e.f3373o;
                }
                if (k10 != e.f3366g && kVar.j(i, k10, e.f3365f)) {
                    boolean z6 = k10 instanceof s;
                    if (z6) {
                        k10 = ((s) k10).f3388a;
                    }
                    if (A(k10)) {
                        kVar.n(i, e.i);
                        m();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        kVar.m(i, null);
                        return obj3;
                    }
                    kVar.n(i, c0316m);
                    kVar.h();
                    if (z6) {
                        m();
                    }
                    return e.f3373o;
                }
            } else if (kVar.j(i, k10, e.i)) {
                m();
                Object obj4 = atomicReferenceArray.get(i * 2);
                kVar.m(i, null);
                return obj4;
            }
        }
    }

    public final int C(k kVar, int i, Object obj, long j6, Object obj2, boolean z6) {
        while (true) {
            Object k9 = kVar.k(i);
            if (k9 == null) {
                if (!h(j6) || z6) {
                    if (z6) {
                        if (kVar.j(i, null, e.f3368j)) {
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
                } else if (kVar.j(i, null, e.f3363d)) {
                    break;
                }
            } else {
                if (k9 != e.f3364e) {
                    C0316m c0316m = e.f3369k;
                    if (k9 == c0316m) {
                        kVar.m(i, null);
                        return 5;
                    }
                    if (k9 == e.f3367h) {
                        kVar.m(i, null);
                        return 5;
                    }
                    if (k9 == e.f3370l) {
                        kVar.m(i, null);
                        k();
                        return 4;
                    }
                    kVar.m(i, null);
                    if (k9 instanceof s) {
                        k9 = ((s) k9).f3388a;
                    }
                    if (z(k9, obj)) {
                        kVar.n(i, e.i);
                        return 0;
                    }
                    if (kVar.f3384y.getAndSet((i * 2) + 1, c0316m) != c0316m) {
                        kVar.l(i, true);
                    }
                    return 5;
                }
                if (kVar.j(i, k9, e.f3363d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void D(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.v()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f3354w;
            if (atomicLongFieldUpdater.get(cVar) > j6) {
                break;
            } else {
                cVar = this;
            }
        }
        int i = e.f3362c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3355x;
            if (i4 < i) {
                long j9 = atomicLongFieldUpdater.get(cVar);
                if (j9 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j9 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i4++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(cVar);
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z6 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (!z6) {
                        atomicLongFieldUpdater2.compareAndSet(this, j12, 4611686018427387904L + j13);
                    }
                    cVar = this;
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // U7.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    @Override // U7.q
    public final Object b(InterfaceC5240d interfaceC5240d) {
        k kVar;
        c cVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3357z;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3352u;
            if (cVar.t(atomicLongFieldUpdater.get(cVar), true)) {
                Throwable p9 = p();
                int i = u.f3816a;
                throw p9;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3353v;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
            long j6 = e.f3361b;
            long j9 = andIncrement / j6;
            int i4 = (int) (andIncrement % j6);
            if (kVar2.f3815v != j9) {
                k n9 = cVar.n(j9, kVar2);
                if (n9 == null) {
                    continue;
                } else {
                    kVar2 = n9;
                }
            }
            Object B3 = cVar.B(kVar2, i4, andIncrement, null);
            C0316m c0316m = e.f3371m;
            if (B3 == c0316m) {
                throw new IllegalStateException("unexpected");
            }
            C0316m c0316m2 = e.f3373o;
            if (B3 != c0316m2) {
                if (B3 != e.f3372n) {
                    kVar2.a();
                    return B3;
                }
                C0393g k9 = AbstractC0410y.k(A8.b.n(interfaceC5240d));
                c cVar2 = this;
                try {
                    Object B9 = cVar2.B(kVar2, i4, andIncrement, k9);
                    if (B9 == c0316m) {
                        k9.a(kVar2, i4);
                    } else if (B9 == c0316m2) {
                        if (andIncrement < cVar2.r()) {
                            kVar2.a();
                        }
                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                        while (true) {
                            if (cVar2.t(atomicLongFieldUpdater.get(cVar2), true)) {
                                k9.resumeWith(Q3.b.b(cVar2.p()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(cVar2);
                            long j10 = e.f3361b;
                            long j11 = andIncrement2 / j10;
                            int i6 = (int) (andIncrement2 % j10);
                            if (kVar3.f3815v != j11) {
                                kVar = cVar2.n(j11, kVar3);
                                if (kVar == null) {
                                }
                            } else {
                                kVar = kVar3;
                            }
                            Object B10 = cVar2.B(kVar, i6, andIncrement2, k9);
                            if (B10 == e.f3371m) {
                                k9.a(kVar, i6);
                                break;
                            }
                            if (B10 == e.f3373o) {
                                if (andIncrement2 < r()) {
                                    kVar.a();
                                }
                                cVar2 = this;
                                kVar3 = kVar;
                            } else {
                                if (B10 == e.f3372n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kVar.a();
                                k9.z(B10, null);
                            }
                        }
                    } else {
                        kVar2.a();
                        k9.z(B9, null);
                    }
                    Object q8 = k9.q();
                    A7.a aVar = A7.a.f215n;
                    return q8;
                } catch (Throwable th) {
                    k9.y();
                    throw th;
                }
            }
            if (andIncrement < r()) {
                kVar2.a();
            }
            cVar = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c6, code lost:
    
        f(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[RETURN] */
    @Override // U7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Object obj, InterfaceC5240d interfaceC5240d) {
        Object q8;
        A7.a aVar;
        Object obj2;
        c cVar;
        int i;
        int i4;
        boolean z6;
        k kVar;
        c cVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3356y;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3352u;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar2);
            long j6 = andIncrement & 1152921504606846975L;
            boolean t6 = cVar2.t(andIncrement, false);
            int i6 = e.f3361b;
            long j9 = i6;
            long j10 = j6 / j9;
            int i9 = (int) (j6 % j9);
            long j11 = kVar2.f3815v;
            v vVar = v.f41073a;
            if (j11 != j10) {
                k c9 = c(cVar2, j10, kVar2);
                if (c9 != null) {
                    kVar2 = c9;
                } else if (t6) {
                    Object x9 = x(obj, interfaceC5240d);
                    if (x9 == A7.a.f215n) {
                        return x9;
                    }
                }
            }
            int g9 = g(cVar2, kVar2, i9, obj, j6, null, t6);
            if (g9 == 0) {
                kVar2.a();
                return vVar;
            }
            if (g9 == 1) {
                break;
            }
            if (g9 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3353v;
                if (g9 == 3) {
                    C0393g k9 = AbstractC0410y.k(A8.b.n(interfaceC5240d));
                    Object obj3 = obj;
                    try {
                        int g10 = g(cVar2, kVar2, i9, obj3, j6, k9, false);
                        try {
                            if (g10 != 0) {
                                if (g10 == 1) {
                                    k9.resumeWith(vVar);
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
                                            long j12 = andIncrement2 & 1152921504606846975L;
                                            boolean t9 = cVar2.t(andIncrement2, false);
                                            int i10 = e.f3361b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j13 = i10;
                                            String str2 = str;
                                            long j14 = j12 / j13;
                                            int i11 = (int) (j12 % j13);
                                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                            if (kVar3.f3815v != j14) {
                                                k c10 = c(cVar2, j14, kVar3);
                                                if (c10 != null) {
                                                    z6 = t9;
                                                    kVar = c10;
                                                    i = i10;
                                                    i4 = i11;
                                                } else {
                                                    if (t9) {
                                                        break;
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                }
                                            } else {
                                                i = i10;
                                                i4 = i11;
                                                z6 = t9;
                                                kVar = kVar3;
                                            }
                                            int g11 = g(cVar2, kVar, i4, obj3, j12, k9, z6);
                                            Object obj4 = obj3;
                                            cVar = cVar2;
                                            k kVar4 = kVar;
                                            int i12 = i4;
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
                                                } else if (j12 < atomicLongFieldUpdater4.get(cVar)) {
                                                    kVar4.a();
                                                }
                                            } else if (z6) {
                                                kVar4.h();
                                            } else {
                                                k9.a(kVar4, i12 + i);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar = cVar2;
                                        if (j6 < atomicLongFieldUpdater2.get(cVar)) {
                                            kVar2.a();
                                        }
                                    }
                                    f(cVar, obj2, k9);
                                } else {
                                    k9.a(kVar2, i9 + i6);
                                }
                                q8 = k9.q();
                                aVar = A7.a.f215n;
                                if (q8 != aVar) {
                                    q8 = vVar;
                                }
                                if (q8 != aVar) {
                                    return q8;
                                }
                            } else {
                                kVar2.a();
                            }
                            k9.resumeWith(vVar);
                            q8 = k9.q();
                            aVar = A7.a.f215n;
                            if (q8 != aVar) {
                            }
                            if (q8 != aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            k9.y();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (g9 == 4) {
                    if (j6 < atomicLongFieldUpdater2.get(cVar2)) {
                        kVar2.a();
                    }
                    Object x10 = x(obj, interfaceC5240d);
                    if (x10 == A7.a.f215n) {
                        return x10;
                    }
                } else if (g9 == 5) {
                    kVar2.a();
                }
            } else if (t6) {
                kVar2.h();
                Object x11 = x(obj, interfaceC5240d);
                if (x11 == A7.a.f215n) {
                    return x11;
                }
            }
        }
    }

    @Override // U7.r
    public Object e(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3352u;
        boolean z6 = false;
        long j6 = 1152921504606846975L;
        boolean z9 = t(atomicLongFieldUpdater.get(this), false) ? false : !h(r1 & 1152921504606846975L);
        i iVar = j.f3382a;
        if (z9) {
            return iVar;
        }
        x2.e eVar = e.f3368j;
        k kVar = (k) f3356y.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = andIncrement & j6;
            boolean t6 = t(andIncrement, z6);
            int i = e.f3361b;
            long j10 = i;
            long j11 = j9 / j10;
            int i4 = (int) (j9 % j10);
            if (kVar.f3815v != j11) {
                k c9 = c(this, j11, kVar);
                if (c9 != null) {
                    kVar = c9;
                } else {
                    if (t6) {
                        return new h(q());
                    }
                    z6 = false;
                    j6 = 1152921504606846975L;
                }
            }
            int g9 = g(this, kVar, i4, obj, j9, eVar, t6);
            v vVar = v.f41073a;
            if (g9 == 0) {
                kVar.a();
                return vVar;
            }
            if (g9 == 1) {
                return vVar;
            }
            if (g9 == 2) {
                if (t6) {
                    kVar.h();
                    return new h(q());
                }
                y0 y0Var = eVar instanceof y0 ? (y0) eVar : null;
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
                if (j9 < f3353v.get(this)) {
                    kVar.a();
                }
                return new h(q());
            }
            if (g9 == 5) {
                kVar.a();
            }
            z6 = false;
            j6 = 1152921504606846975L;
        }
    }

    public final boolean h(long j6) {
        return j6 < f3354w.get(this) || j6 < f3353v.get(this) + ((long) this.f3358n);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Throwable th, boolean z6) {
        c cVar;
        C0316m c0316m;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z9;
        long j6;
        long j9;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3352u;
        if (z6) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
                if (((int) (j12 >> 60)) == 0) {
                    k kVar = e.f3360a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j12, (j12 & 1152921504606846975L) + (1 << 60)));
            c0316m = e.f3377s;
            while (true) {
                atomicReferenceFieldUpdater = f3350B;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, c0316m, th)) {
                    z9 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != c0316m) {
                    z9 = false;
                    break;
                }
            }
            if (z6) {
                do {
                    j6 = atomicLongFieldUpdater.get(this);
                    int i = (int) (j6 >> 60);
                    if (i == 0) {
                        j9 = j6 & 1152921504606846975L;
                        j10 = 2;
                    } else {
                        if (i != 1) {
                            break;
                        }
                        j9 = j6 & 1152921504606846975L;
                        j10 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j6, (j10 << 60) + j9));
            } else {
                do {
                    j11 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j11, (3 << 60) + (j11 & 1152921504606846975L)));
            }
            k();
            if (z9) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3351C;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    C0316m c0316m2 = obj == null ? e.f3375q : e.f3376r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0316m2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    kotlin.jvm.internal.u.b(1, obj);
                    ((I7.l) obj).invoke(o());
                    return z9;
                }
            }
            return z9;
        }
        cVar = this;
        c0316m = e.f3377s;
        while (true) {
            atomicReferenceFieldUpdater = f3350B;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c0316m, th)) {
            }
        }
        if (z6) {
        }
        k();
        if (z9) {
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (U7.k) ((X7.d) X7.d.f3784u.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k j(long j6) {
        Object obj;
        long j9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f3349A.get(this);
        k kVar = (k) f3356y.get(this);
        if (kVar.f3815v > ((k) obj2).f3815v) {
            obj2 = kVar;
        }
        k kVar2 = (k) f3357z.get(this);
        if (kVar2.f3815v > ((k) obj2).f3815v) {
            obj2 = kVar2;
        }
        X7.d dVar = (X7.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = X7.d.f3783n.get(dVar);
            C0316m c0316m = X7.a.f3776b;
            obj = null;
            if (obj3 == c0316m) {
                break;
            }
            X7.d dVar2 = (X7.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = X7.d.f3783n;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, c0316m)) {
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
                int i = e.f3361b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j9 = (kVar4.f3815v * e.f3361b) + i;
                    if (j9 < f3353v.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k9 = kVar4.k(i);
                        if (k9 != null && k9 != e.f3364e) {
                            if (k9 == e.f3363d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i, k9, e.f3370l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (kVar4 != null);
            j9 = -1;
            if (j9 != -1) {
                l(j9);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((X7.d) X7.d.f3784u.get(kVar5))) {
            for (int i4 = e.f3361b - 1; -1 < i4; i4--) {
                if ((kVar5.f3815v * e.f3361b) + i4 < j6) {
                    break loop5;
                }
                while (true) {
                    Object k10 = kVar5.k(i4);
                    if (k10 != null && k10 != e.f3364e) {
                        if (!(k10 instanceof s)) {
                            if (!(k10 instanceof y0)) {
                                break;
                            }
                            if (kVar5.j(i4, k10, e.f3370l)) {
                                obj = X7.a.f(obj, k10);
                                kVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i4, k10, e.f3370l)) {
                                obj = X7.a.f(obj, ((s) k10).f3388a);
                                kVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i4, k10, e.f3370l)) {
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
        t(f3352u.get(this), false);
    }

    public final void l(long j6) {
        k kVar = (k) f3357z.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3353v;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j6 < Math.max(this.f3358n + j9, f3354w.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, 1 + j9)) {
                long j10 = e.f3361b;
                long j11 = j9 / j10;
                int i = (int) (j9 % j10);
                if (kVar.f3815v != j11) {
                    k n9 = n(j11, kVar);
                    if (n9 != null) {
                        kVar = n9;
                    }
                }
                k kVar2 = kVar;
                if (B(kVar2, i, j9, null) != e.f3373o) {
                    kVar2.a();
                } else if (j9 < r()) {
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
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3349A;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f3354w.getAndIncrement(this);
            long j6 = andIncrement / e.f3361b;
            if (r() <= andIncrement) {
                if (kVar.f3815v < j6 && kVar.b() != null) {
                    w(j6, kVar);
                }
                s(this);
                return;
            }
            if (kVar.f3815v != j6) {
                d dVar = d.f3359v;
                while (true) {
                    b9 = X7.a.b(kVar, j6, dVar);
                    if (!X7.a.e(b9)) {
                        t c9 = X7.a.c(b9);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f3815v >= c9.f3815v) {
                                break;
                            }
                            if (!c9.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c9)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (c9.e()) {
                                        c9.d();
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
                if (X7.a.e(b9)) {
                    k();
                    w(j6, kVar);
                    s(this);
                } else {
                    k kVar3 = (k) X7.a.c(b9);
                    long j9 = kVar3.f3815v;
                    if (j9 > j6) {
                        long j10 = j9 * e.f3361b;
                        if (f3354w.compareAndSet(this, 1 + andIncrement, j10)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f3355x;
                            if ((atomicLongFieldUpdater.addAndGet(this, j10 - andIncrement) & 4611686018427387904L) != 0) {
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
            int i = (int) (andIncrement % e.f3361b);
            Object k9 = kVar.k(i);
            boolean z6 = k9 instanceof y0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3353v;
            if (!z6 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i, k9, e.f3366g)) {
                while (true) {
                    Object k10 = kVar.k(i);
                    if (!(k10 instanceof y0)) {
                        if (k10 != e.f3368j) {
                            if (k10 != null) {
                                if (k10 == e.f3363d || k10 == e.f3367h || k10 == e.i || k10 == e.f3369k || k10 == e.f3370l) {
                                    break loop0;
                                }
                                if (k10 != e.f3365f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k10).toString());
                                }
                            } else if (kVar.j(i, k10, e.f3364e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i, k10, new s((y0) k10))) {
                            break loop0;
                        }
                    } else if (kVar.j(i, k10, e.f3366g)) {
                        if (A(k10)) {
                            kVar.n(i, e.f3363d);
                            break;
                        } else {
                            kVar.n(i, e.f3368j);
                            kVar.h();
                        }
                    }
                }
            } else if (A(k9)) {
                kVar.n(i, e.f3363d);
                break;
            } else {
                kVar.n(i, e.f3368j);
                kVar.h();
                s(this);
            }
        }
        s(this);
    }

    public final k n(long j6, k kVar) {
        Object b9;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        k kVar2 = e.f3360a;
        d dVar = d.f3359v;
        loop0: while (true) {
            b9 = X7.a.b(kVar, j6, dVar);
            if (!X7.a.e(b9)) {
                t c9 = X7.a.c(b9);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3357z;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f3815v >= c9.f3815v) {
                        break loop0;
                    }
                    if (!c9.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c9)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (c9.e()) {
                                c9.d();
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
        if (X7.a.e(b9)) {
            k();
            if (kVar.f3815v * e.f3361b < r()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) X7.a.c(b9);
            boolean v9 = v();
            long j10 = kVar3.f3815v;
            if (!v9 && j6 <= f3354w.get(this) / e.f3361b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3349A;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f3815v >= j10 || !kVar3.i()) {
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
            if (j10 <= j6) {
                return kVar3;
            }
            long j11 = j10 * e.f3361b;
            do {
                atomicLongFieldUpdater = f3353v;
                j9 = atomicLongFieldUpdater.get(this);
                if (j9 >= j11) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j9, j11));
            if (j10 * e.f3361b < r()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable o() {
        return (Throwable) f3350B.get(this);
    }

    public final Throwable p() {
        Throwable o4 = o();
        return o4 == null ? new l("Channel was closed") : o4;
    }

    public final Throwable q() {
        Throwable o4 = o();
        return o4 == null ? new m("Channel was closed") : o4;
    }

    public final long r() {
        return f3352u.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (U7.k) ((X7.d) X7.d.f3784u.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(long j6, boolean z6) {
        int i = (int) (j6 >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3353v;
            if (i == 2) {
                j(1152921504606846975L & j6);
                if (z6) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3357z;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j9 = atomicLongFieldUpdater.get(this);
                        if (r() <= j9) {
                            break;
                        }
                        long j10 = e.f3361b;
                        long j11 = j9 / j10;
                        if (kVar.f3815v != j11 && (kVar = n(j11, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f3815v < j11) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i4 = (int) (j9 % j10);
                            while (true) {
                                Object k9 = kVar.k(i4);
                                if (k9 == null || k9 == e.f3364e) {
                                    if (kVar.j(i4, k9, e.f3367h)) {
                                        m();
                                        break;
                                    }
                                } else {
                                    if (k9 == e.f3363d) {
                                        break;
                                    }
                                    if (k9 != e.f3368j) {
                                        if (k9 != e.f3370l) {
                                            if (k9 != e.i) {
                                                if (k9 != e.f3367h) {
                                                    if (k9 == e.f3366g) {
                                                        break;
                                                    }
                                                    if (k9 != e.f3365f && j9 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f3353v.compareAndSet(this, j9, j9 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(Wv.f(i, "unexpected close status: ").toString());
                }
                k j12 = j(1152921504606846975L & j6);
                Object obj = null;
                loop0: do {
                    int i6 = e.f3361b - 1;
                    while (true) {
                        if (-1 >= i6) {
                            break;
                        }
                        long j13 = (j12.f3815v * e.f3361b) + i6;
                        while (true) {
                            Object k10 = j12.k(i6);
                            if (k10 == e.i) {
                                break loop0;
                            }
                            if (k10 == e.f3363d) {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (j12.j(i6, k10, e.f3370l)) {
                                    j12.m(i6, null);
                                    j12.h();
                                    break;
                                }
                            } else if (k10 != e.f3364e && k10 != null) {
                                if (!(k10 instanceof y0) && !(k10 instanceof s)) {
                                    C0316m c0316m = e.f3366g;
                                    if (k10 == c0316m || k10 == e.f3365f) {
                                        break loop0;
                                    }
                                    if (k10 != c0316m) {
                                        break;
                                    }
                                } else {
                                    if (j13 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    y0 y0Var = k10 instanceof s ? ((s) k10).f3388a : (y0) k10;
                                    if (j12.j(i6, k10, e.f3370l)) {
                                        obj = X7.a.f(obj, y0Var);
                                        j12.m(i6, null);
                                        j12.h();
                                        break;
                                    }
                                }
                            } else if (j12.j(i6, k10, e.f3370l)) {
                                j12.h();
                                break;
                            }
                        }
                        i6--;
                    }
                } while (j12 != null);
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
        r3 = (U7.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z6;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f3352u.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f3358n + ',');
        sb.append("data=[");
        int i4 = 0;
        boolean z9 = true;
        List t6 = AbstractC5120k.t(f3357z.get(this), f3356y.get(this), f3349A.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : t6) {
            if (((k) obj2) != e.f3360a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j6 = ((k) next).f3815v;
            do {
                Object next2 = it.next();
                long j9 = ((k) next2).f3815v;
                if (j6 > j9) {
                    next = next2;
                    j6 = j9;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j10 = f3353v.get(this);
        long r9 = r();
        loop2: while (true) {
            int i6 = e.f3361b;
            int i9 = i4;
            while (true) {
                if (i9 >= i6) {
                    break;
                }
                long j11 = (kVar.f3815v * e.f3361b) + i9;
                if (j11 >= r9 && j11 >= j10) {
                    break loop2;
                }
                Object k9 = kVar.k(i9);
                boolean z10 = z9;
                Object obj3 = kVar.f3384y.get(i9 * 2);
                if (k9 instanceof InterfaceC0392f) {
                    obj = (j11 >= j10 || j11 < r9) ? (j11 >= r9 || j11 < j10) ? "cont" : "send" : "receive";
                } else if (k9 instanceof s) {
                    obj = "EB(" + k9 + ')';
                } else if (kotlin.jvm.internal.h.a(k9, e.f3365f) ? z10 : kotlin.jvm.internal.h.a(k9, e.f3366g)) {
                    obj = "resuming_sender";
                } else if (k9 == null ? z10 : k9.equals(e.f3364e) ? z10 : kotlin.jvm.internal.h.a(k9, e.i) ? z10 : kotlin.jvm.internal.h.a(k9, e.f3367h) ? z10 : kotlin.jvm.internal.h.a(k9, e.f3369k) ? z10 : kotlin.jvm.internal.h.a(k9, e.f3368j) ? z10 : kotlin.jvm.internal.h.a(k9, e.f3370l)) {
                    i9++;
                    z9 = z10;
                } else {
                    obj = k9.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i9++;
                z9 = z10;
            }
            z9 = z6;
            i4 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(Q7.j.n0(sb)) == ',') {
            kotlin.jvm.internal.h.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j6 = f3354w.get(this);
        return j6 == 0 || j6 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j6, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f3815v < j6 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3349A;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f3815v >= kVar.f3815v) {
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

    public final Object x(Object obj, InterfaceC5240d interfaceC5240d) {
        C0393g c0393g = new C0393g(1, A8.b.n(interfaceC5240d));
        c0393g.r();
        c0393g.resumeWith(Q3.b.b(q()));
        Object q8 = c0393g.q();
        return q8 == A7.a.f215n ? q8 : v.f41073a;
    }

    public final void y(y0 y0Var, boolean z6) {
        if (y0Var instanceof InterfaceC0392f) {
            ((InterfaceC5240d) y0Var).resumeWith(Q3.b.b(z6 ? p() : q()));
            return;
        }
        if (!(y0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + y0Var).toString());
        }
        b bVar = (b) y0Var;
        C0393g c0393g = bVar.f3347u;
        kotlin.jvm.internal.h.b(c0393g);
        bVar.f3347u = null;
        bVar.f3346n = e.f3370l;
        Throwable o4 = bVar.f3348v.o();
        if (o4 == null) {
            c0393g.resumeWith(Boolean.FALSE);
        } else {
            c0393g.resumeWith(Q3.b.b(o4));
        }
    }

    public final boolean z(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC0392f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0392f interfaceC0392f = (InterfaceC0392f) obj;
            k kVar = e.f3360a;
            C0316m c9 = interfaceC0392f.c(obj2, null);
            if (c9 == null) {
                return false;
            }
            interfaceC0392f.f(c9);
            return true;
        }
        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0393g c0393g = bVar.f3347u;
        kotlin.jvm.internal.h.b(c0393g);
        bVar.f3347u = null;
        bVar.f3346n = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f3348v.getClass();
        k kVar2 = e.f3360a;
        C0316m c10 = c0393g.c(bool, null);
        if (c10 == null) {
            return false;
        }
        c0393g.f(c10);
        return true;
    }
}
