package kotlinx.coroutines.channels;

import defpackage.b64;
import defpackage.ci9;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.cxd;
import defpackage.dq0;
import defpackage.dvw;
import defpackage.fcq0;
import defpackage.gvu0;
import defpackage.i18;
import defpackage.iq6;
import defpackage.j18;
import defpackage.jb20;
import defpackage.jl40;
import defpackage.jq6;
import defpackage.k041;
import defpackage.kq6;
import defpackage.l041;
import defpackage.ljo;
import defpackage.mi9;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.ofa0;
import defpackage.oi9;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.pi9;
import defpackage.qv10;
import defpackage.rzo;
import defpackage.s7q0;
import defpackage.scc;
import defpackage.sfi0;
import defpackage.sp5;
import defpackage.sub1;
import defpackage.tls;
import defpackage.w511;
import defpackage.wb4;
import defpackage.xfo;
import defpackage.xyt0;
import defpackage.yhl;
import defpackage.ym11;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public class a implements ci9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater C;
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public static final /* synthetic */ AtomicReferenceFieldUpdater E;
    public static final /* synthetic */ long F;
    public static final /* synthetic */ long G;
    public static final /* synthetic */ long H;
    public static final /* synthetic */ long I;
    public static final /* synthetic */ long J;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final tls b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final iq6 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(a.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater x = AtomicLongFieldUpdater.newUpdater(a.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater y = AtomicLongFieldUpdater.newUpdater(a.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater z = AtomicLongFieldUpdater.newUpdater(a.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "sendSegment$volatile");

    static {
        Unsafe unsafe = wb4.a;
        J = unsafe.objectFieldOffset(a.class.getDeclaredField("sendSegment$volatile"));
        B = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "receiveSegment$volatile");
        I = unsafe.objectFieldOffset(a.class.getDeclaredField("receiveSegment$volatile"));
        C = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "bufferEndSegment$volatile");
        G = unsafe.objectFieldOffset(a.class.getDeclaredField("bufferEndSegment$volatile"));
        D = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_closeCause$volatile");
        F = unsafe.objectFieldOffset(a.class.getDeclaredField("_closeCause$volatile"));
        E = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "closeHandler$volatile");
        H = unsafe.objectFieldOffset(a.class.getDeclaredField("closeHandler$volatile"));
    }

    public a(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
        if (i < 0) {
            w511.f(oyr.j(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        pi9 pi9Var = kq6.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = y.get(this);
        pi9 pi9Var2 = new pi9(0L, null, this, 3);
        this.sendSegment$volatile = pi9Var2;
        this.receiveSegment$volatile = pi9Var2;
        this.bufferEndSegment$volatile = G() ? kq6.a : pi9Var2;
        this.c = tlsVar != null ? new iq6(0, this) : null;
        this._closeCause$volatile = kq6.s;
    }

    public static Object J(a aVar, Continuation continuation) {
        pi9 pi9Var;
        Throwable th;
        pi9 pi9Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        atomicReferenceFieldUpdater.getClass();
        BufferedChannel$bindCancellationFun$2 bufferedChannel$bindCancellationFun$2 = null;
        if (aVar == null) {
            ny61.u();
            return null;
        }
        pi9 pi9Var3 = (pi9) wb4.a.getObjectVolatile(aVar, I);
        while (!aVar.D()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = x;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(aVar);
            long j = kq6.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (pi9Var3.x != j2) {
                pi9 s = aVar.s(j2, pi9Var3);
                if (s == null) {
                    continue;
                } else {
                    pi9Var = s;
                }
            } else {
                pi9Var = pi9Var3;
            }
            a aVar2 = aVar;
            Object R = aVar2.R(pi9Var, i, andIncrement, null);
            jb20 jb20Var = kq6.m;
            if (R == jb20Var) {
                ny61.r("unexpected");
                return null;
            }
            jb20 jb20Var2 = kq6.o;
            if (R == jb20Var2) {
                if (andIncrement < aVar2.x()) {
                    pi9Var.b();
                }
                aVar = aVar2;
                pi9Var3 = pi9Var;
            } else {
                if (R != kq6.n) {
                    pi9Var.b();
                    return R;
                }
                tls tlsVar = aVar2.b;
                j18 V = cma1.V(dvw.b(continuation));
                try {
                    Object R2 = aVar2.R(pi9Var, i, andIncrement, V);
                    if (R2 == jb20Var) {
                        V.c(pi9Var, i);
                    } else {
                        if (R2 == jb20Var2) {
                            if (andIncrement < aVar2.x()) {
                                pi9Var.b();
                            }
                            pi9 pi9Var4 = (pi9) atomicReferenceFieldUpdater.get(aVar2);
                            while (true) {
                                if (aVar2.D()) {
                                    V.resumeWith(new Result.Failure(aVar2.v()));
                                    break;
                                }
                                j18 j18Var = V;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(aVar2);
                                    long j3 = kq6.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (pi9Var4.x != j4) {
                                        try {
                                            pi9 s2 = aVar2.s(j4, pi9Var4);
                                            if (s2 == null) {
                                                V = j18Var;
                                            } else {
                                                pi9Var2 = s2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            V = j18Var;
                                            V.C();
                                            throw th;
                                        }
                                    } else {
                                        pi9Var2 = pi9Var4;
                                    }
                                    a aVar3 = aVar2;
                                    R2 = aVar3.R(pi9Var2, i2, andIncrement2, j18Var);
                                    aVar2 = aVar3;
                                    pi9 pi9Var5 = pi9Var2;
                                    V = j18Var;
                                    if (R2 == kq6.m) {
                                        V.c(pi9Var5, i2);
                                        break;
                                    }
                                    if (R2 == kq6.o) {
                                        if (andIncrement2 < aVar2.x()) {
                                            pi9Var5.b();
                                        }
                                        pi9Var4 = pi9Var5;
                                    } else {
                                        if (R2 == kq6.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pi9Var5.b();
                                        if (tlsVar != null) {
                                            bufferedChannel$bindCancellationFun$2 = new BufferedChannel$bindCancellationFun$2(aVar2);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    V = j18Var;
                                    th = th;
                                    V.C();
                                    throw th;
                                }
                            }
                        } else {
                            pi9Var.b();
                            if (tlsVar != null) {
                                bufferedChannel$bindCancellationFun$2 = new BufferedChannel$bindCancellationFun$2(aVar2);
                            }
                        }
                        V.q(R2, bufferedChannel$bindCancellationFun$2);
                    }
                    Object s3 = V.s();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return s3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable v = aVar.v();
        int i3 = xyt0.a;
        throw v;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object K(a aVar, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        int i;
        if (continuationImpl instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuationImpl;
            int i2 = bufferedChannel$receiveCatching$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i2 - Integer.MIN_VALUE;
                BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
                Object obj = bufferedChannel$receiveCatching$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bufferedChannel$receiveCatching$12.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((oi9) obj).a;
                }
                kotlin.b.b(obj);
                B.getClass();
                if (aVar == null) {
                    ny61.u();
                    return null;
                }
                pi9 pi9Var = (pi9) wb4.a.getObjectVolatile(aVar, I);
                while (!aVar.D()) {
                    long andIncrement = x.getAndIncrement(aVar);
                    long j = kq6.b;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (pi9Var.x != j2) {
                        pi9 s = aVar.s(j2, pi9Var);
                        if (s == null) {
                            continue;
                        } else {
                            pi9Var = s;
                        }
                    }
                    Object R = aVar.R(pi9Var, i3, andIncrement, null);
                    if (R == kq6.m) {
                        ny61.r("unexpected");
                        return null;
                    }
                    if (R != kq6.o) {
                        if (R != kq6.n) {
                            pi9Var.b();
                            ni9 ni9Var = oi9.b;
                            return R;
                        }
                        bufferedChannel$receiveCatching$12.L$0 = null;
                        bufferedChannel$receiveCatching$12.L$1 = null;
                        bufferedChannel$receiveCatching$12.L$2 = null;
                        bufferedChannel$receiveCatching$12.L$3 = null;
                        bufferedChannel$receiveCatching$12.L$4 = null;
                        bufferedChannel$receiveCatching$12.I$0 = 0;
                        bufferedChannel$receiveCatching$12.J$0 = andIncrement;
                        bufferedChannel$receiveCatching$12.J$1 = j2;
                        bufferedChannel$receiveCatching$12.I$1 = i3;
                        bufferedChannel$receiveCatching$12.J$2 = andIncrement;
                        bufferedChannel$receiveCatching$12.I$2 = i3;
                        bufferedChannel$receiveCatching$12.I$3 = 0;
                        bufferedChannel$receiveCatching$12.label = 1;
                        Object L = aVar.L(pi9Var, i3, andIncrement, bufferedChannel$receiveCatching$12);
                        return L == obj2 ? obj2 : L;
                    }
                    if (andIncrement < aVar.x()) {
                        pi9Var.b();
                    }
                }
                ni9 ni9Var2 = oi9.b;
                return new mi9(aVar.u());
            }
        }
        bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(aVar, continuationImpl);
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$122 = bufferedChannel$receiveCatching$1;
        Object obj3 = bufferedChannel$receiveCatching$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bufferedChannel$receiveCatching$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object O(a aVar, Object obj, Continuation continuation) {
        zy11 zy11Var;
        Object s;
        CoroutineSingletons coroutineSingletons;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        atomicReferenceFieldUpdater.getClass();
        pi9 pi9Var = (pi9) wb4.a.getObjectVolatile(aVar, J);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = w;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(aVar);
            long j = andIncrement & 1152921504606846975L;
            boolean C2 = aVar.C(andIncrement, false);
            int i = kq6.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = pi9Var.x;
            zy11Var = zy11.a;
            if (j4 != j3) {
                pi9 t = aVar.t(j3, pi9Var);
                if (t != null) {
                    pi9Var = t;
                } else if (C2) {
                    Object I2 = aVar.I(obj, continuation);
                    if (I2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return I2;
                    }
                }
            }
            int c = c(aVar, pi9Var, i2, obj, j, null, C2);
            if (c == 0) {
                pi9Var.b();
                return zy11Var;
            }
            if (c == 1) {
                break;
            }
            if (c != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = x;
                if (c == 3) {
                    j18 V = cma1.V(dvw.b(continuation));
                    try {
                        int c2 = c(aVar, pi9Var, i2, obj, j, V, false);
                        if (c2 == 0) {
                            pi9Var.b();
                        } else if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 4) {
                                    String str = "unexpected";
                                    if (c2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    pi9Var.b();
                                    pi9 pi9Var2 = (pi9) atomicReferenceFieldUpdater.get(aVar);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(aVar);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean C3 = aVar.C(andIncrement2, false);
                                        int i3 = kq6.b;
                                        String str2 = str;
                                        long j6 = i3;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        if (pi9Var2.x != j7) {
                                            pi9 t2 = aVar.t(j7, pi9Var2);
                                            if (t2 != null) {
                                                pi9Var2 = t2;
                                            } else {
                                                if (C3) {
                                                    break;
                                                }
                                                str = str2;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                            }
                                        }
                                        int c3 = c(aVar, pi9Var2, i4, obj, j5, V, C3);
                                        if (c3 == 0) {
                                            pi9Var2.b();
                                            break;
                                        }
                                        if (c3 == 1) {
                                            break;
                                        }
                                        if (c3 != 2) {
                                            if (c3 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (c3 != 4) {
                                                if (c3 == 5) {
                                                    pi9Var2.b();
                                                }
                                                str = str2;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                            } else if (j5 < atomicLongFieldUpdater3.get(aVar)) {
                                                pi9Var2.b();
                                            }
                                        } else if (C3) {
                                            pi9Var2.n();
                                        } else {
                                            V.c(pi9Var2, i4 + i3);
                                        }
                                    }
                                } else if (j < atomicLongFieldUpdater2.get(aVar)) {
                                    pi9Var.b();
                                }
                                b(aVar, obj, V);
                            } else {
                                V.c(pi9Var, i2 + i);
                            }
                            s = V.s();
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (s != coroutineSingletons) {
                                s = zy11Var;
                            }
                            if (s != coroutineSingletons) {
                                return s;
                            }
                        }
                        V.resumeWith(zy11Var);
                        s = V.s();
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s != coroutineSingletons) {
                        }
                        if (s != coroutineSingletons) {
                            break;
                        }
                    } catch (Throwable th) {
                        V.C();
                        throw th;
                    }
                } else if (c == 4) {
                    if (j < atomicLongFieldUpdater2.get(aVar)) {
                        pi9Var.b();
                    }
                    Object I3 = aVar.I(obj, continuation);
                    if (I3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return I3;
                    }
                } else if (c == 5) {
                    pi9Var.b();
                }
            } else if (C2) {
                pi9Var.n();
                Object I4 = aVar.I(obj, continuation);
                if (I4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return I4;
                }
            }
        }
        return zy11Var;
    }

    public static final void b(a aVar, Object obj, j18 j18Var) {
        tls tlsVar = aVar.b;
        if (tlsVar != null) {
            sub1.a(tlsVar, obj, j18Var.x);
        }
        j18Var.resumeWith(new Result.Failure(aVar.w()));
    }

    public static final int c(a aVar, pi9 pi9Var, int i, Object obj, long j, Object obj2, boolean z2) {
        pi9Var.s(i, obj);
        if (z2) {
            return aVar.S(pi9Var, i, obj, j, obj2, z2);
        }
        Object q = pi9Var.q(i);
        if (q == null) {
            if (aVar.j(j)) {
                if (pi9Var.p(i, null, kq6.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pi9Var.p(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (q instanceof k041) {
            pi9Var.s(i, null);
            if (aVar.P(q, obj)) {
                pi9Var.t(i, kq6.i);
                return 0;
            }
            jb20 jb20Var = kq6.k;
            if (pi9Var.A.getAndSet((i * 2) + 1, jb20Var) == jb20Var) {
                return 5;
            }
            pi9Var.r(i, true);
            return 5;
        }
        return aVar.S(pi9Var, i, obj, j, obj2, z2);
    }

    public static void z(a aVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = z;
        if ((atomicLongFieldUpdater.addAndGet(aVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(aVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A() {
        Object objectVolatile;
        a aVar;
        loop0: while (true) {
            E.getClass();
            Unsafe unsafe = wb4.a;
            long j = H;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            jb20 jb20Var = objectVolatile == null ? kq6.q : kq6.r;
            while (true) {
                Unsafe unsafe2 = wb4.a;
                aVar = this;
                if (unsafe2.compareAndSwapObject(aVar, H, objectVolatile, jb20Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(aVar, j) != objectVolatile) {
                    break;
                } else {
                    this = aVar;
                }
            }
            this = aVar;
        }
        if (objectVolatile == null) {
            return;
        }
        ym11.e(1, objectVolatile);
        ((tls) objectVolatile).invoke(aVar.u());
    }

    public final void B(dq0 dq0Var) {
        Unsafe unsafe;
        while (true) {
            E.getClass();
            Unsafe unsafe2 = wb4.a;
            a aVar = this;
            if (unsafe2.compareAndSwapObject(aVar, H, (Object) null, dq0Var)) {
                return;
            }
            long j = H;
            if (unsafe2.getObjectVolatile(aVar, j) != null) {
                while (true) {
                    Object objectVolatile = wb4.a.getObjectVolatile(aVar, j);
                    jb20 jb20Var = kq6.q;
                    if (objectVolatile != jb20Var) {
                        if (objectVolatile == kq6.r) {
                            ny61.r("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            ny61.r(b64.i("Another handler is already registered: ", objectVolatile));
                            return;
                        }
                    }
                    jb20 jb20Var2 = kq6.r;
                    do {
                        a aVar2 = aVar;
                        unsafe = wb4.a;
                        boolean compareAndSwapObject = unsafe.compareAndSwapObject(aVar2, H, jb20Var, jb20Var2);
                        aVar = aVar2;
                        if (compareAndSwapObject) {
                            dq0Var.invoke(aVar.u());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(aVar, j) == jb20Var);
                }
            } else {
                this = aVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c0, code lost:
    
        r13 = (defpackage.pi9) r13.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(long j, boolean z2) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                n(j & 1152921504606846975L);
                if (!z2 || !y()) {
                }
            } else {
                if (i != 3) {
                    xfo.g(oyr.i(i, "unexpected close status: "));
                    return false;
                }
                pi9 n = n(j & 1152921504606846975L);
                UndeliveredElementException undeliveredElementException = null;
                Object obj = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = n.A;
                    int i2 = kq6.b - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (n.x * kq6.b) + i2;
                        while (true) {
                            Object q = n.q(i2);
                            if (q == kq6.i) {
                                break loop0;
                            }
                            jb20 jb20Var = kq6.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = x;
                            tls tlsVar = this.b;
                            if (q == jb20Var) {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (n.p(i2, q, kq6.l)) {
                                    if (tlsVar != null) {
                                        undeliveredElementException = sub1.b(tlsVar, atomicReferenceArray.get(i2 * 2), undeliveredElementException);
                                    }
                                    n.s(i2, null);
                                    n.n();
                                }
                            } else if (q == kq6.e || q == null) {
                                if (n.p(i2, q, kq6.l)) {
                                    n.n();
                                    break;
                                }
                            } else if (!(q instanceof k041) && !(q instanceof l041)) {
                                jb20 jb20Var2 = kq6.g;
                                if (q == jb20Var2 || q == kq6.f) {
                                    break loop0;
                                }
                                if (q != jb20Var2) {
                                    break;
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                k041 k041Var = q instanceof l041 ? ((l041) q).a : (k041) q;
                                if (n.p(i2, q, kq6.l)) {
                                    if (tlsVar != null) {
                                        undeliveredElementException = sub1.b(tlsVar, atomicReferenceArray.get(i2 * 2), undeliveredElementException);
                                    }
                                    obj = ooc.x(obj, k041Var);
                                    n.s(i2, null);
                                    n.n();
                                }
                            }
                        }
                        i2--;
                    }
                } while (n != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            N((k041) arrayList.get(size), false);
                        }
                    } else {
                        N((k041) obj, false);
                    }
                }
                if (undeliveredElementException != null) {
                    throw undeliveredElementException;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean D() {
        return C(w.get(this), true);
    }

    public final boolean E() {
        return C(w.get(this), false);
    }

    public boolean F() {
        return false;
    }

    public final boolean G() {
        long j = y.get(this);
        return j == 0 || j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r5.k() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r5.i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(long j, pi9 pi9Var) {
        a aVar;
        pi9 pi9Var2;
        pi9 pi9Var3;
        while (pi9Var.x < j && (pi9Var3 = (pi9) pi9Var.d()) != null) {
            pi9Var = pi9Var3;
        }
        while (true) {
            pi9 pi9Var4 = pi9Var;
            while (pi9Var4.g() && (pi9Var2 = (pi9) pi9Var4.d()) != null) {
                pi9Var4 = pi9Var2;
            }
            while (true) {
                C.getClass();
                Unsafe unsafe = wb4.a;
                long j2 = G;
                s7q0 s7q0Var = (s7q0) unsafe.getObjectVolatile(this, j2);
                if (s7q0Var.x >= pi9Var4.x) {
                    return;
                }
                if (!pi9Var4.o()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = wb4.a;
                    aVar = this;
                    if (unsafe2.compareAndSwapObject(aVar, G, s7q0Var, pi9Var4)) {
                        if (s7q0Var.k()) {
                            s7q0Var.i();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(aVar, j2) != s7q0Var) {
                        break;
                    } else {
                        this = aVar;
                    }
                }
                this = aVar;
            }
            pi9Var = pi9Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
    
        r3 = defpackage.sub1.b(r4, r3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(Object obj, Continuation continuation) {
        UndeliveredElementException b;
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        tls tlsVar = this.b;
        if (tlsVar == null || b == null) {
            j18Var.resumeWith(new Result.Failure(w()));
        } else {
            ljo.a(b, w());
            j18Var.resumeWith(new Result.Failure(b));
        }
        Object s = j18Var.s();
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(pi9 pi9Var, int i, long j, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        int i2;
        oi9 oi9Var;
        pi9 pi9Var2;
        if (continuationImpl instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuationImpl;
            int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i3 - Integer.MIN_VALUE;
                Object obj = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
                BufferedChannel$bindCancellationFunResult$1 bufferedChannel$bindCancellationFunResult$1 = null;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = pi9Var;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$1 = 0;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
                    j18 V = cma1.V(dvw.b(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
                    try {
                        sfi0 sfi0Var = new sfi0(V);
                        Object R = R(pi9Var, i, j, sfi0Var);
                        if (R == kq6.m) {
                            sfi0Var.c(pi9Var, i);
                        } else {
                            Object obj2 = kq6.o;
                            tls tlsVar = this.b;
                            if (R == obj2) {
                                if (j < x()) {
                                    pi9Var.b();
                                }
                                pi9 pi9Var3 = (pi9) B.get(this);
                                while (true) {
                                    if (D()) {
                                        ni9 ni9Var = oi9.b;
                                        V.resumeWith(new oi9(new mi9(u())));
                                        break;
                                    }
                                    long andIncrement = x.getAndIncrement(this);
                                    long j2 = kq6.b;
                                    long j3 = andIncrement / j2;
                                    int i4 = (int) (andIncrement % j2);
                                    if (pi9Var3.x != j3) {
                                        pi9 s = s(j3, pi9Var3);
                                        if (s != null) {
                                            pi9Var2 = s;
                                        }
                                    } else {
                                        pi9Var2 = pi9Var3;
                                    }
                                    Object R2 = R(pi9Var2, i4, andIncrement, sfi0Var);
                                    pi9 pi9Var4 = pi9Var2;
                                    if (R2 == kq6.m) {
                                        sfi0Var.c(pi9Var4, i4);
                                        break;
                                    }
                                    if (R2 == kq6.o) {
                                        if (andIncrement < x()) {
                                            pi9Var4.b();
                                        }
                                        pi9Var3 = pi9Var4;
                                    } else {
                                        if (R2 == kq6.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pi9Var4.b();
                                        oi9Var = new oi9(R2);
                                        if (tlsVar != null) {
                                            bufferedChannel$bindCancellationFunResult$1 = new BufferedChannel$bindCancellationFunResult$1(this);
                                        }
                                    }
                                }
                            } else {
                                pi9Var.b();
                                oi9Var = new oi9(R);
                                if (tlsVar != null) {
                                    bufferedChannel$bindCancellationFunResult$1 = new BufferedChannel$bindCancellationFunResult$1(this);
                                }
                            }
                            V.q(oi9Var, bufferedChannel$bindCancellationFunResult$1);
                        }
                        obj = V.s();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        V.C();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((oi9) obj).a;
            }
        }
        bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
        Object obj3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        BufferedChannel$bindCancellationFunResult$1 bufferedChannel$bindCancellationFunResult$12 = null;
        if (i2 != 0) {
        }
        return ((oi9) obj3).a;
    }

    public final void M(fcq0 fcq0Var) {
        pi9 pi9Var;
        a aVar;
        fcq0 fcq0Var2;
        int i;
        B.getClass();
        pi9 pi9Var2 = (pi9) wb4.a.getObjectVolatile(this, I);
        while (!this.D()) {
            long andIncrement = x.getAndIncrement(this);
            long j = kq6.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (pi9Var2.x != j2) {
                pi9 s = this.s(j2, pi9Var2);
                if (s == null) {
                    continue;
                } else {
                    pi9Var = s;
                    fcq0Var2 = fcq0Var;
                    i = i2;
                    aVar = this;
                }
            } else {
                pi9Var = pi9Var2;
                aVar = this;
                fcq0Var2 = fcq0Var;
                i = i2;
            }
            Object R = aVar.R(pi9Var, i, andIncrement, fcq0Var2);
            pi9Var2 = pi9Var;
            if (R == kq6.m) {
                k041 k041Var = fcq0Var2 instanceof k041 ? (k041) fcq0Var2 : null;
                if (k041Var != null) {
                    k041Var.c(pi9Var2, i);
                    return;
                }
                return;
            }
            if (R != kq6.o) {
                if (R == kq6.n) {
                    ny61.r("unexpected");
                    return;
                } else {
                    pi9Var2.b();
                    ((kotlinx.coroutines.selects.b) fcq0Var2).x = R;
                    return;
                }
            }
            if (andIncrement < aVar.x()) {
                pi9Var2.b();
            }
            this = aVar;
            fcq0Var = fcq0Var2;
        }
        ((kotlinx.coroutines.selects.b) fcq0Var).x = kq6.l;
    }

    public final void N(k041 k041Var, boolean z2) {
        if (k041Var instanceof i18) {
            ((Continuation) k041Var).resumeWith(new Result.Failure(z2 ? v() : w()));
            return;
        }
        if (k041Var instanceof sfi0) {
            j18 j18Var = ((sfi0) k041Var).a;
            ni9 ni9Var = oi9.b;
            j18Var.resumeWith(new oi9(new mi9(u())));
            return;
        }
        if (!(k041Var instanceof jq6)) {
            if (k041Var instanceof fcq0) {
                ((kotlinx.coroutines.selects.b) ((fcq0) k041Var)).k(this, kq6.l);
                return;
            } else {
                yhl.d(k041Var, "Unexpected waiter: ");
                return;
            }
        }
        jq6 jq6Var = (jq6) k041Var;
        j18 j18Var2 = jq6Var.b;
        jq6Var.b = null;
        jq6Var.a = kq6.l;
        Throwable u = jq6Var.c.u();
        if (u == null) {
            j18Var2.resumeWith(Boolean.FALSE);
        } else {
            j18Var2.resumeWith(new Result.Failure(u));
        }
    }

    public final boolean P(Object obj, Object obj2) {
        if (obj instanceof fcq0) {
            return ((kotlinx.coroutines.selects.b) ((fcq0) obj)).k(this, obj2);
        }
        boolean z2 = obj instanceof sfi0;
        tls tlsVar = this.b;
        if (z2) {
            return kq6.a(((sfi0) obj).a, new oi9(obj2), tlsVar != null ? new BufferedChannel$bindCancellationFunResult$1(this) : null);
        }
        if (!(obj instanceof jq6)) {
            if (obj instanceof i18) {
                return kq6.a((i18) obj, obj2, tlsVar != null ? new BufferedChannel$bindCancellationFun$2(this) : null);
            }
            ny61.r(b64.i("Unexpected receiver type: ", obj));
            return false;
        }
        jq6 jq6Var = (jq6) obj;
        j18 j18Var = jq6Var.b;
        jq6Var.b = null;
        jq6Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        tls tlsVar2 = jq6Var.c.b;
        return kq6.a(j18Var, bool, tlsVar2 != null ? new sp5(4, tlsVar2, obj2) : null);
    }

    public final boolean Q(Object obj, pi9 pi9Var, int i) {
        TrySelectDetailedResult trySelectDetailedResult;
        boolean z2 = obj instanceof i18;
        zy11 zy11Var = zy11.a;
        if (z2) {
            return kq6.a((i18) obj, zy11Var, null);
        }
        if (!(obj instanceof fcq0)) {
            ny61.r(b64.i("Unexpected waiter: ", obj));
            return false;
        }
        int l = ((kotlinx.coroutines.selects.b) obj).l(this, zy11Var);
        if (l == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.SUCCESSFUL;
        } else if (l == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.REREGISTER;
        } else if (l == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.CANCELLED;
        } else {
            if (l != 3) {
                ny61.r(qv10.g(l, "Unexpected internal result: "));
                return false;
            }
            trySelectDetailedResult = TrySelectDetailedResult.ALREADY_SELECTED;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.REREGISTER) {
            pi9Var.s(i, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.SUCCESSFUL;
    }

    public final Object R(pi9 pi9Var, int i, long j, Object obj) {
        Object q = pi9Var.q(i);
        AtomicReferenceArray atomicReferenceArray = pi9Var.A;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        if (q == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return kq6.n;
                }
                if (pi9Var.p(i, q, obj)) {
                    q();
                    return kq6.m;
                }
            }
        } else if (q == kq6.d && pi9Var.p(i, q, kq6.i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i * 2);
            pi9Var.s(i, null);
            return obj2;
        }
        while (true) {
            Object q2 = pi9Var.q(i);
            if (q2 == null || q2 == kq6.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pi9Var.p(i, q2, kq6.h)) {
                        q();
                        return kq6.o;
                    }
                } else {
                    if (obj == null) {
                        return kq6.n;
                    }
                    if (pi9Var.p(i, q2, obj)) {
                        q();
                        return kq6.m;
                    }
                }
            } else {
                if (q2 != kq6.d) {
                    jb20 jb20Var = kq6.j;
                    if (q2 != jb20Var && q2 != kq6.h) {
                        if (q2 == kq6.l) {
                            q();
                            return kq6.o;
                        }
                        if (q2 != kq6.g && pi9Var.p(i, q2, kq6.f)) {
                            boolean z2 = q2 instanceof l041;
                            if (z2) {
                                q2 = ((l041) q2).a;
                            }
                            if (Q(q2, pi9Var, i)) {
                                pi9Var.t(i, kq6.i);
                                q();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                pi9Var.s(i, null);
                                return obj3;
                            }
                            pi9Var.t(i, jb20Var);
                            pi9Var.n();
                            if (z2) {
                                q();
                            }
                            return kq6.o;
                        }
                    }
                    return kq6.o;
                }
                if (pi9Var.p(i, q2, kq6.i)) {
                    q();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    pi9Var.s(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int S(pi9 pi9Var, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object q = pi9Var.q(i);
            if (q == null) {
                if (!j(j) || z2) {
                    if (z2) {
                        if (pi9Var.p(i, null, kq6.j)) {
                            pi9Var.n();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pi9Var.p(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pi9Var.p(i, null, kq6.d)) {
                    break;
                }
            } else {
                if (q != kq6.e) {
                    jb20 jb20Var = kq6.k;
                    if (q == jb20Var) {
                        pi9Var.s(i, null);
                        return 5;
                    }
                    if (q == kq6.h) {
                        pi9Var.s(i, null);
                        return 5;
                    }
                    if (q == kq6.l) {
                        pi9Var.s(i, null);
                        E();
                        return 4;
                    }
                    pi9Var.s(i, null);
                    if (q instanceof l041) {
                        q = ((l041) q).a;
                    }
                    if (P(q, obj)) {
                        pi9Var.t(i, kq6.i);
                        return 0;
                    }
                    if (pi9Var.A.getAndSet((i * 2) + 1, jb20Var) != jb20Var) {
                        pi9Var.r(i, true);
                    }
                    return 5;
                }
                if (pi9Var.p(i, q, kq6.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void T(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        a aVar = this;
        if (aVar.G()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = y;
            if (atomicLongFieldUpdater.get(aVar) > j) {
                break;
            } else {
                aVar = this;
            }
        }
        int i = kq6.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = z;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(aVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(aVar)) && j2 == atomicLongFieldUpdater.get(aVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(aVar);
                    if (atomicLongFieldUpdater2.compareAndSet(aVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        aVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(aVar);
                    long j5 = atomicLongFieldUpdater2.get(aVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z2 = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(aVar)) {
                        break;
                    }
                    if (z2) {
                        aVar = this;
                    } else {
                        aVar = this;
                        atomicLongFieldUpdater2.compareAndSet(aVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(aVar);
                    if (atomicLongFieldUpdater2.compareAndSet(aVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        aVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.tfi0
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m(cancellationException, true);
    }

    @Override // defpackage.ioq0
    public Object d(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        long j = 1152921504606846975L;
        if (C(atomicLongFieldUpdater.get(this), false) ? false : !j(r1 & 1152921504606846975L)) {
            return oi9.b;
        }
        Object obj2 = kq6.j;
        A.getClass();
        pi9 pi9Var = (pi9) wb4.a.getObjectVolatile(this, J);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean C2 = C(andIncrement, false);
            int i = kq6.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (pi9Var.x != j4) {
                pi9 t = t(j4, pi9Var);
                if (t != null) {
                    pi9Var = t;
                } else {
                    if (C2) {
                        ni9 ni9Var = oi9.b;
                        return new mi9(w());
                    }
                    j = 1152921504606846975L;
                }
            }
            int c = c(this, pi9Var, i2, obj, j2, obj2, C2);
            zy11 zy11Var = zy11.a;
            if (c == 0) {
                pi9Var.b();
                ni9 ni9Var2 = oi9.b;
                return zy11Var;
            }
            if (c == 1) {
                ni9 ni9Var3 = oi9.b;
                return zy11Var;
            }
            if (c == 2) {
                if (C2) {
                    pi9Var.n();
                    ni9 ni9Var4 = oi9.b;
                    return new mi9(w());
                }
                k041 k041Var = obj2 instanceof k041 ? (k041) obj2 : null;
                if (k041Var != null) {
                    k041Var.c(pi9Var, i2 + i);
                }
                pi9Var.n();
                return oi9.b;
            }
            if (c == 3) {
                ny61.r("unexpected");
                return null;
            }
            if (c == 4) {
                if (j2 < x.get(this)) {
                    pi9Var.b();
                }
                ni9 ni9Var5 = oi9.b;
                return new mi9(w());
            }
            if (c == 5) {
                pi9Var.b();
            }
            j = 1152921504606846975L;
        }
    }

    @Override // defpackage.tfi0
    public final Object e(ContinuationImpl continuationImpl) {
        return J(this, continuationImpl);
    }

    @Override // defpackage.tfi0
    public final ofa0 f() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.b;
        ym11.e(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.b;
        ym11.e(3, bufferedChannel$onReceiveCatching$2);
        return new ofa0(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, this.c);
    }

    @Override // defpackage.tfi0
    public final Object g() {
        pi9 pi9Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = x;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = w.get(this);
        if (C(j2, true)) {
            ni9 ni9Var = oi9.b;
            return new mi9(u());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return oi9.b;
        }
        Object obj = kq6.k;
        B.getClass();
        pi9 pi9Var2 = (pi9) wb4.a.getObjectVolatile(this, I);
        while (!this.D()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = kq6.b;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (pi9Var2.x != j4) {
                pi9Var = this.s(j4, pi9Var2);
                if (pi9Var == null) {
                    continue;
                }
            } else {
                pi9Var = pi9Var2;
            }
            a aVar = this;
            Object R = aVar.R(pi9Var, i, andIncrement, obj);
            pi9Var2 = pi9Var;
            if (R == kq6.m) {
                k041 k041Var = obj instanceof k041 ? (k041) obj : null;
                if (k041Var != null) {
                    k041Var.c(pi9Var2, i);
                }
                aVar.T(andIncrement);
                pi9Var2.n();
                return oi9.b;
            }
            if (R != kq6.o) {
                if (R == kq6.n) {
                    ny61.r("unexpected");
                    return null;
                }
                pi9Var2.b();
                ni9 ni9Var2 = oi9.b;
                return R;
            }
            if (andIncrement < aVar.x()) {
                pi9Var2.b();
            }
            this = aVar;
        }
        ni9 ni9Var3 = oi9.b;
        return new mi9(this.u());
    }

    @Override // defpackage.tfi0
    public final Object h(Continuation continuation) {
        return K(this, (ContinuationImpl) continuation);
    }

    @Override // defpackage.tfi0
    public final ofa0 i() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.b;
        ym11.e(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.b;
        ym11.e(3, bufferedChannel$onReceive$2);
        return new ofa0(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, this.c);
    }

    @Override // defpackage.tfi0
    public final jq6 iterator() {
        return new jq6(this);
    }

    public final boolean j(long j) {
        return j < y.get(this) || j < x.get(this) + ((long) this.a);
    }

    public final pi9 k() {
        C.getClass();
        Unsafe unsafe = wb4.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, G);
        A.getClass();
        pi9 pi9Var = (pi9) unsafe.getObjectVolatile(this, J);
        if (pi9Var.x > ((pi9) objectVolatile).x) {
            objectVolatile = pi9Var;
        }
        B.getClass();
        pi9 pi9Var2 = (pi9) unsafe.getObjectVolatile(this, I);
        if (pi9Var2.x > ((pi9) objectVolatile).x) {
            objectVolatile = pi9Var2;
        }
        cxd cxdVar = (cxd) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cxd.a;
            Object e = cxdVar.e();
            if (e == rzo.a) {
                break;
            }
            cxd cxdVar2 = (cxd) e;
            if (cxdVar2 != null) {
                cxdVar = cxdVar2;
            } else if (cxdVar.h()) {
                break;
            }
        }
        return (pi9) cxdVar;
    }

    @Override // defpackage.ioq0
    public final boolean l(Throwable th) {
        return m(th, false);
    }

    public final boolean m(Throwable th, boolean z2) {
        a aVar;
        boolean z3;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        if (z2) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                pi9 pi9Var = kq6.a;
                aVar = this;
                if (atomicLongFieldUpdater.compareAndSet(aVar, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = aVar;
            }
        }
        aVar = this;
        jb20 jb20Var = kq6.s;
        while (true) {
            D.getClass();
            a aVar2 = aVar;
            Unsafe unsafe = wb4.a;
            long j5 = F;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(aVar2, j5, jb20Var, th2);
            aVar = aVar2;
            if (compareAndSwapObject) {
                z3 = true;
                break;
            }
            if (unsafe.getObjectVolatile(aVar, j5) != jb20Var) {
                z3 = false;
                break;
            }
            th = th2;
        }
        if (z2) {
            do {
                j3 = atomicLongFieldUpdater.get(aVar);
            } while (!atomicLongFieldUpdater.compareAndSet(aVar, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(aVar);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(aVar, j, j2));
        }
        aVar.E();
        if (z3) {
            aVar.A();
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (defpackage.pi9) r1.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pi9 n(long j) {
        long j2;
        pi9 k = k();
        if (F()) {
            pi9 pi9Var = k;
            loop0: do {
                int i = kq6.b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (pi9Var.x * kq6.b) + i;
                    if (j2 < x.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object q = pi9Var.q(i);
                        if (q != null && q != kq6.e) {
                            if (q == kq6.d) {
                                break loop0;
                            }
                        } else {
                            if (pi9Var.p(i, q, kq6.l)) {
                                pi9Var.n();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (pi9Var != null);
            j2 = -1;
            if (j2 != -1) {
                p(j2);
            }
        }
        Object obj = null;
        loop3: for (pi9 pi9Var2 = k; pi9Var2 != null; pi9Var2 = (pi9) pi9Var2.f()) {
            for (int i2 = kq6.b - 1; -1 < i2; i2--) {
                if ((pi9Var2.x * kq6.b) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    Object q2 = pi9Var2.q(i2);
                    if (q2 != null && q2 != kq6.e) {
                        if (!(q2 instanceof l041)) {
                            if (!(q2 instanceof k041)) {
                                break;
                            }
                            if (pi9Var2.p(i2, q2, kq6.l)) {
                                obj = ooc.x(obj, q2);
                                pi9Var2.r(i2, true);
                                break;
                            }
                        } else {
                            if (pi9Var2.p(i2, q2, kq6.l)) {
                                obj = ooc.x(obj, ((l041) q2).a);
                                pi9Var2.r(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (pi9Var2.p(i2, q2, kq6.l)) {
                            pi9Var2.n();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                N((k041) obj, true);
                return k;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                N((k041) arrayList.get(size), true);
            }
        }
        return k;
    }

    @Override // defpackage.ioq0
    public Object o(Object obj, Continuation continuation) {
        return O(this, obj, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r9 = defpackage.sub1.b(r0, r9, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(long j) {
        UndeliveredElementException b;
        B.getClass();
        pi9 pi9Var = (pi9) wb4.a.getObjectVolatile(this, I);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = x;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.a + j2, y.get(this))) {
                return;
            }
            a aVar = this;
            if (atomicLongFieldUpdater.compareAndSet(aVar, j2, 1 + j2)) {
                long j3 = kq6.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (pi9Var.x != j4) {
                    pi9 s = aVar.s(j4, pi9Var);
                    if (s != null) {
                        pi9Var = s;
                    }
                }
                pi9 pi9Var2 = pi9Var;
                Object R = aVar.R(pi9Var2, i, j2, null);
                if (R != kq6.o) {
                    pi9Var2.b();
                    tls tlsVar = aVar.b;
                    if (tlsVar != null && b != null) {
                        throw b;
                    }
                } else if (j2 < aVar.x()) {
                    pi9Var2.b();
                }
                this = aVar;
                pi9Var = pi9Var2;
            }
            this = aVar;
        }
    }

    public final void q() {
        a aVar;
        if (G()) {
            return;
        }
        C.getClass();
        pi9 pi9Var = (pi9) wb4.a.getObjectVolatile(this, G);
        loop0: while (true) {
            long andIncrement = y.getAndIncrement(this);
            long j = kq6.b;
            long j2 = andIncrement / j;
            if (this.x() <= andIncrement) {
                if (pi9Var.x < j2 && pi9Var.d() != null) {
                    this.H(j2, pi9Var);
                }
                z(this);
                return;
            }
            aVar = this;
            if (pi9Var.x != j2) {
                pi9 r = aVar.r(j2, pi9Var, andIncrement);
                if (r == null) {
                    continue;
                    this = aVar;
                } else {
                    pi9Var = r;
                }
            }
            int i = (int) (andIncrement % j);
            Object q = pi9Var.q(i);
            boolean z2 = q instanceof k041;
            AtomicLongFieldUpdater atomicLongFieldUpdater = x;
            if (!z2 || andIncrement < atomicLongFieldUpdater.get(aVar) || !pi9Var.p(i, q, kq6.g)) {
                while (true) {
                    Object q2 = pi9Var.q(i);
                    if (!(q2 instanceof k041)) {
                        if (q2 != kq6.j) {
                            if (q2 != null) {
                                if (q2 == kq6.d || q2 == kq6.h || q2 == kq6.i || q2 == kq6.k || q2 == kq6.l) {
                                    break loop0;
                                } else if (q2 != kq6.f) {
                                    ny61.r(b64.i("Unexpected cell state: ", q2));
                                    return;
                                }
                            } else if (pi9Var.p(i, q2, kq6.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(aVar)) {
                        if (pi9Var.p(i, q2, new l041((k041) q2))) {
                            break loop0;
                        }
                    } else if (pi9Var.p(i, q2, kq6.g)) {
                        if (aVar.Q(q2, pi9Var, i)) {
                            pi9Var.t(i, kq6.d);
                            break;
                        } else {
                            pi9Var.t(i, kq6.j);
                            pi9Var.n();
                        }
                    }
                }
                z(aVar);
            } else if (aVar.Q(q, pi9Var, i)) {
                pi9Var.t(i, kq6.d);
                break;
            } else {
                pi9Var.t(i, kq6.j);
                pi9Var.n();
                z(aVar);
            }
            this = aVar;
        }
        z(aVar);
    }

    public final pi9 r(long j, pi9 pi9Var, long j2) {
        Object y2;
        Unsafe unsafe;
        pi9 pi9Var2 = kq6.a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.b;
        loop0: while (true) {
            y2 = rzo.y(pi9Var, j, bufferedChannelKt$createSegmentFunction$1);
            if (!cvw.O(y2)) {
                s7q0 H2 = cvw.H(y2);
                while (true) {
                    C.getClass();
                    Unsafe unsafe2 = wb4.a;
                    long j3 = G;
                    s7q0 s7q0Var = (s7q0) unsafe2.getObjectVolatile(this, j3);
                    if (s7q0Var.x >= H2.x) {
                        break loop0;
                    }
                    if (!H2.o()) {
                        break;
                    }
                    do {
                        unsafe = wb4.a;
                        if (unsafe.compareAndSwapObject(this, G, s7q0Var, H2)) {
                            if (s7q0Var.k()) {
                                s7q0Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == s7q0Var);
                    if (H2.k()) {
                        H2.i();
                    }
                }
            } else {
                break;
            }
        }
        if (cvw.O(y2)) {
            E();
            H(j, pi9Var);
            z(this);
            return null;
        }
        pi9 pi9Var3 = (pi9) cvw.H(y2);
        long j4 = pi9Var3.x;
        if (j4 <= j) {
            return pi9Var3;
        }
        long j5 = j4 * kq6.b;
        if (!y.compareAndSet(this, j2 + 1, j5)) {
            z(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = z;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.k() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.i();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pi9 s(long j, pi9 pi9Var) {
        Object y2;
        pi9 pi9Var2;
        long j2;
        Unsafe unsafe;
        pi9 pi9Var3 = kq6.a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.b;
        loop0: while (true) {
            y2 = rzo.y(pi9Var, j, bufferedChannelKt$createSegmentFunction$1);
            if (!cvw.O(y2)) {
                s7q0 H2 = cvw.H(y2);
                while (true) {
                    B.getClass();
                    Unsafe unsafe2 = wb4.a;
                    long j3 = I;
                    s7q0 s7q0Var = (s7q0) unsafe2.getObjectVolatile(this, j3);
                    if (s7q0Var.x >= H2.x) {
                        break loop0;
                    }
                    if (!H2.o()) {
                        break;
                    }
                    do {
                        unsafe = wb4.a;
                        if (unsafe.compareAndSwapObject(this, I, s7q0Var, H2)) {
                            if (s7q0Var.k()) {
                                s7q0Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == s7q0Var);
                    if (H2.k()) {
                        H2.i();
                    }
                }
            } else {
                break;
            }
        }
        if (cvw.O(y2)) {
            E();
            if (pi9Var.x * kq6.b < x()) {
                pi9Var.b();
                return null;
            }
        } else {
            pi9 pi9Var4 = (pi9) cvw.H(y2);
            long j4 = pi9Var4.x;
            if (!G() && j <= y.get(this) / kq6.b) {
                while (true) {
                    C.getClass();
                    Unsafe unsafe3 = wb4.a;
                    long j5 = G;
                    s7q0 s7q0Var2 = (s7q0) unsafe3.getObjectVolatile(this, j5);
                    if (s7q0Var2.x >= j4 || !pi9Var4.o()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = wb4.a;
                        pi9Var2 = pi9Var4;
                        if (unsafe4.compareAndSwapObject(this, G, s7q0Var2, pi9Var4)) {
                            if (s7q0Var2.k()) {
                                s7q0Var2.i();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j5) != s7q0Var2) {
                                break;
                            }
                            pi9Var4 = pi9Var2;
                        }
                    }
                    pi9Var4 = pi9Var2;
                }
                if (j4 > j) {
                    return pi9Var2;
                }
                long j6 = j4 * kq6.b;
                do {
                    j2 = x.get(this);
                    if (j2 >= j6) {
                        break;
                    }
                } while (!x.compareAndSet(this, j2, j6));
                if (j4 * kq6.b < x()) {
                    pi9Var2.b();
                }
            }
            pi9Var2 = pi9Var4;
            if (j4 > j) {
            }
        }
        return null;
    }

    public final pi9 t(long j, pi9 pi9Var) {
        Object y2;
        long j2;
        long j3;
        Unsafe unsafe;
        pi9 pi9Var2 = kq6.a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.b;
        loop0: while (true) {
            y2 = rzo.y(pi9Var, j, bufferedChannelKt$createSegmentFunction$1);
            if (!cvw.O(y2)) {
                s7q0 H2 = cvw.H(y2);
                while (true) {
                    A.getClass();
                    Unsafe unsafe2 = wb4.a;
                    long j4 = J;
                    s7q0 s7q0Var = (s7q0) unsafe2.getObjectVolatile(this, j4);
                    if (s7q0Var.x >= H2.x) {
                        break loop0;
                    }
                    if (!H2.o()) {
                        break;
                    }
                    do {
                        unsafe = wb4.a;
                        if (unsafe.compareAndSwapObject(this, J, s7q0Var, H2)) {
                            if (s7q0Var.k()) {
                                s7q0Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == s7q0Var);
                    if (H2.k()) {
                        H2.i();
                    }
                }
            } else {
                break;
            }
        }
        boolean O = cvw.O(y2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = x;
        if (O) {
            E();
            if (pi9Var.x * kq6.b < atomicLongFieldUpdater.get(this)) {
                pi9Var.b();
                return null;
            }
        } else {
            pi9 pi9Var3 = (pi9) cvw.H(y2);
            long j5 = pi9Var3.x;
            if (j5 <= j) {
                return pi9Var3;
            }
            long j6 = j5 * kq6.b;
            do {
                j2 = w.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!w.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
            if (j5 * kq6.b < atomicLongFieldUpdater.get(this)) {
                pi9Var3.b();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cb, code lost:
    
        r15 = r8;
        r3 = (defpackage.pi9) r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d3, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (w.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + HexString.CHAR_COMMA);
        sb.append("data=[");
        B.getClass();
        Unsafe unsafe = wb4.a;
        int i3 = 0;
        A.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, J);
        int i4 = 1;
        C.getClass();
        List g = scc.g(unsafe.getObjectVolatile(this, I), objectVolatile, unsafe.getObjectVolatile(this, G));
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            if (((pi9) obj) != kq6.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((pi9) next).x;
            do {
                Object next2 = it.next();
                long j2 = ((pi9) next2).x;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        pi9 pi9Var = (pi9) next;
        long j3 = x.get(this);
        long x2 = x();
        loop2: while (true) {
            int i5 = kq6.b;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (pi9Var.x * kq6.b) + i6;
                if (j4 >= x2 && j4 >= j3) {
                    break loop2;
                }
                Object q = pi9Var.q(i6);
                Object obj2 = pi9Var.A.get(i6 * 2);
                if (q instanceof i18) {
                    str = (x2 > j4 || j4 >= j3) ? (j3 > j4 || j4 >= x2) ? "cont" : "send" : "receive";
                } else if (q instanceof fcq0) {
                    str = (x2 > j4 || j4 >= j3) ? (j3 > j4 || j4 >= x2) ? "select" : "onSend" : "onReceive";
                } else if (q instanceof sfi0) {
                    str = "receiveCatching";
                } else if (q instanceof l041) {
                    str = "EB(" + q + ')';
                } else if (jl40.l(q, kq6.f) || jl40.l(q, kq6.g)) {
                    str = "resuming_sender";
                } else {
                    if (q != null && !q.equals(kq6.e) && !q.equals(kq6.i) && !q.equals(kq6.h) && !q.equals(kq6.k) && !q.equals(kq6.j) && !q.equals(kq6.l)) {
                        str = q.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append(Extension.O_BRAKE + str + HexString.CHAR_COMMA + obj2 + "),");
                } else {
                    sb.append(str + HexString.CHAR_COMMA);
                }
                i6++;
                i4 = i;
            }
            i4 = i;
            i3 = 0;
        }
        if (gvu0.x0(sb) == ',') {
            sb.deleteCharAt(sb.length() - i);
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        D.getClass();
        return (Throwable) wb4.a.getObjectVolatile(this, F);
    }

    public final Throwable v() {
        Throwable u = u();
        return u == null ? new ClosedReceiveChannelException("Channel was closed") : u;
    }

    public final Throwable w() {
        Throwable u = u();
        return u == null ? new ClosedSendChannelException("Channel was closed") : u;
    }

    public final long x() {
        return w.get(this) & 1152921504606846975L;
    }

    public final boolean y() {
        while (true) {
            B.getClass();
            Unsafe unsafe = wb4.a;
            long j = I;
            pi9 pi9Var = (pi9) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = x;
            long j2 = atomicLongFieldUpdater.get(this);
            if (x() <= j2) {
                return false;
            }
            long j3 = kq6.b;
            long j4 = j2 / j3;
            if (pi9Var.x == j4 || (pi9Var = s(j4, pi9Var)) != null) {
                pi9Var.b();
                int i = (int) (j2 % j3);
                while (true) {
                    Object q = pi9Var.q(i);
                    if (q == null || q == kq6.e) {
                        if (pi9Var.p(i, q, kq6.h)) {
                            q();
                            break;
                        }
                    } else {
                        if (q == kq6.d) {
                            return true;
                        }
                        if (q != kq6.j && q != kq6.l && q != kq6.i && q != kq6.h) {
                            if (q == kq6.g) {
                                return true;
                            }
                            if (q != kq6.f && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                x.compareAndSet(this, j2, j2 + 1);
            } else if (((pi9) unsafe.getObjectVolatile(this, j)).x < j4) {
                return false;
            }
        }
    }
}
