package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class z2 implements j4 {
    public static final /* synthetic */ AtomicLongFieldUpdater MdtA4re8 = AtomicLongFieldUpdater.newUpdater(z2.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ long OnDfzHZD;
    public static final /* synthetic */ AtomicLongFieldUpdater P7K7Inc8;
    public static final /* synthetic */ long Qr9iLBAD;
    public static final /* synthetic */ AtomicLongFieldUpdater VgvYg0wo;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b2ZJblxo;
    public static final /* synthetic */ long eVhOlqcC;
    public static final /* synthetic */ long jb9XjC4I;
    public static final /* synthetic */ long k3x7lurq;
    public static final /* synthetic */ long lDXGDhIF;
    public static final /* synthetic */ long ow5vqvCr;
    public static final /* synthetic */ long sjUBp5pO;
    public static final /* synthetic */ AtomicLongFieldUpdater wxUZMvaN;
    public static final /* synthetic */ long ygLcUYwZ;
    public final int NCTxEWno;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        sjUBp5pO = unsafe.objectFieldOffset(z2.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        wxUZMvaN = AtomicLongFieldUpdater.newUpdater(z2.class, "receivers$volatile");
        ygLcUYwZ = unsafe.objectFieldOffset(z2.class.getDeclaredField("receivers$volatile"));
        VgvYg0wo = AtomicLongFieldUpdater.newUpdater(z2.class, "bufferEnd$volatile");
        jb9XjC4I = unsafe.objectFieldOffset(z2.class.getDeclaredField("bufferEnd$volatile"));
        P7K7Inc8 = AtomicLongFieldUpdater.newUpdater(z2.class, "completedExpandBuffersAndPauseFlag$volatile");
        ow5vqvCr = unsafe.objectFieldOffset(z2.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        lDXGDhIF = unsafe.objectFieldOffset(z2.class.getDeclaredField("sendSegment$volatile"));
        b2ZJblxo = AtomicReferenceFieldUpdater.newUpdater(z2.class, Object.class, "receiveSegment$volatile");
        OnDfzHZD = unsafe.objectFieldOffset(z2.class.getDeclaredField("receiveSegment$volatile"));
        eVhOlqcC = unsafe.objectFieldOffset(z2.class.getDeclaredField("bufferEndSegment$volatile"));
        Qr9iLBAD = unsafe.objectFieldOffset(z2.class.getDeclaredField("_closeCause$volatile"));
        k3x7lurq = unsafe.objectFieldOffset(z2.class.getDeclaredField("closeHandler$volatile"));
    }

    public z2(int i) {
        this.NCTxEWno = i;
        if (i < 0) {
            m1.Qr9iLBAD("Invalid channel capacity: ", i, ", should be >=0");
            throw null;
        }
        v4 v4Var = b3.qoPGr6Ce;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = k3x7lurq();
        v4 v4Var2 = new v4(0L, null, this, 3);
        this.sendSegment$volatile = v4Var2;
        this.receiveSegment$volatile = v4Var2;
        if (FySoLYna()) {
            v4Var2 = b3.qoPGr6Ce;
            v4Var2.getClass();
        }
        this.bufferEndSegment$volatile = v4Var2;
        this._closeCause$volatile = b3.KlHjfFWx;
    }

    public static boolean euDDoUNr(Object obj) {
        if (!(obj instanceof k3)) {
            m1.P7K7Inc8(obj, "Unexpected waiter: ");
            return false;
        }
        k3 k3Var = (k3) obj;
        v4 v4Var = b3.qoPGr6Ce;
        lf k3x7lurq2 = k3Var.k3x7lurq(xe0.qoPGr6Ce, null);
        if (k3x7lurq2 == null) {
            return false;
        }
        k3Var.ygLcUYwZ(k3x7lurq2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object lwWCatUu(z2 z2Var, h9 h9Var) {
        x2 x2Var;
        int i;
        v4 v4Var;
        if (h9Var instanceof x2) {
            x2Var = (x2) h9Var;
            int i2 = x2Var.b2ZJblxo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x2Var.b2ZJblxo = i2 - Integer.MIN_VALUE;
                x2 x2Var2 = x2Var;
                Object obj = x2Var2.VgvYg0wo;
                i = x2Var2.b2ZJblxo;
                if (i == 0) {
                    if (i == 1) {
                        fn.SgZGMMPL(obj);
                        return ((u4) obj).qoPGr6Ce;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                v4 v4Var2 = (v4) b1.qoPGr6Ce.getObjectVolatile(z2Var, OnDfzHZD);
                while (!z2Var.Ey6iv0m0()) {
                    long andIncrement = wxUZMvaN.getAndIncrement(z2Var);
                    long j = b3.NCTxEWno;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (v4Var2.wxUZMvaN != j2) {
                        v4 jb9XjC4I2 = z2Var.jb9XjC4I(j2, v4Var2);
                        if (jb9XjC4I2 == null) {
                            continue;
                        } else {
                            v4Var = jb9XjC4I2;
                        }
                    } else {
                        v4Var = v4Var2;
                    }
                    z2 z2Var2 = z2Var;
                    Object SgZGMMPL = z2Var2.SgZGMMPL(v4Var, i3, andIncrement, null);
                    if (SgZGMMPL == b3.OnDfzHZD) {
                        m1.Ey6iv0m0("unexpected");
                        return null;
                    }
                    if (SgZGMMPL != b3.lDXGDhIF) {
                        if (SgZGMMPL != b3.ygLcUYwZ) {
                            v4Var.qoPGr6Ce();
                            return SgZGMMPL;
                        }
                        x2Var2.b2ZJblxo = 1;
                        Object U0LaHZX7 = z2Var2.U0LaHZX7(v4Var, i3, andIncrement, x2Var2);
                        u9 u9Var = u9.NCTxEWno;
                        return U0LaHZX7 == u9Var ? u9Var : U0LaHZX7;
                    }
                    if (andIncrement < z2Var2.sjUBp5pO()) {
                        v4Var.qoPGr6Ce();
                    }
                    z2Var = z2Var2;
                    v4Var2 = v4Var;
                }
                return new s4(z2Var.OnDfzHZD());
            }
        }
        x2Var = new x2(z2Var, h9Var);
        x2 x2Var22 = x2Var;
        Object obj2 = x2Var22.VgvYg0wo;
        i = x2Var22.b2ZJblxo;
        if (i == 0) {
        }
    }

    public final void DK9slbsy(Object obj, m3 m3Var) {
        m3Var.P7K7Inc8(new k30(lDXGDhIF()));
    }

    public final boolean Ey6iv0m0() {
        return KlHjfFWx(b1.qoPGr6Ce.getLongVolatile(this, sjUBp5pO), true);
    }

    public final boolean FySoLYna() {
        long k3x7lurq2 = k3x7lurq();
        return k3x7lurq2 == 0 || k3x7lurq2 == Long.MAX_VALUE;
    }

    public final void I5GHvsYW() {
        KlHjfFWx(b1.qoPGr6Ce.getLongVolatile(this, sjUBp5pO), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a0, code lost:
    
        r12 = (defpackage.v4) ((defpackage.r7) defpackage.b1.qoPGr6Ce.getObjectVolatile(r12, defpackage.r7.NCTxEWno));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KlHjfFWx(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                VgvYg0wo(j & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = b1.qoPGr6Ce;
                        long j2 = OnDfzHZD;
                        v4 v4Var = (v4) unsafe.getObjectVolatile(this, j2);
                        long ygLcUYwZ2 = ygLcUYwZ();
                        if (sjUBp5pO() <= ygLcUYwZ2) {
                            break;
                        }
                        long j3 = b3.NCTxEWno;
                        long j4 = ygLcUYwZ2 / j3;
                        if (v4Var.wxUZMvaN != j4 && (v4Var = jb9XjC4I(j4, v4Var)) == null) {
                            if (((v4) unsafe.getObjectVolatile(this, j2)).wxUZMvaN < j4) {
                                break;
                            }
                        } else {
                            v4Var.qoPGr6Ce();
                            int i2 = (int) (ygLcUYwZ2 % j3);
                            while (true) {
                                Object k3x7lurq2 = v4Var.k3x7lurq(i2);
                                if (k3x7lurq2 == null || k3x7lurq2 == b3.VgvYg0wo) {
                                    if (v4Var.eVhOlqcC(k3x7lurq2, i2, b3.Qr9iLBAD)) {
                                        Qr9iLBAD();
                                        break;
                                    }
                                } else {
                                    if (k3x7lurq2 == b3.wxUZMvaN) {
                                        break;
                                    }
                                    if (k3x7lurq2 != b3.eVhOlqcC) {
                                        if (k3x7lurq2 != b3.ow5vqvCr) {
                                            if (k3x7lurq2 != b3.jb9XjC4I) {
                                                if (k3x7lurq2 != b3.Qr9iLBAD) {
                                                    if (k3x7lurq2 == b3.b2ZJblxo) {
                                                        break;
                                                    }
                                                    if (k3x7lurq2 != b3.P7K7Inc8 && ygLcUYwZ2 == ygLcUYwZ()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            b1.qoPGr6Ce.compareAndSwapLong(this, ygLcUYwZ, ygLcUYwZ2, ygLcUYwZ2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(q70.VgvYg0wo("unexpected close status: ", i).toString());
                }
                v4 VgvYg0wo2 = VgvYg0wo(j & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i3 = b3.NCTxEWno - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (VgvYg0wo2.wxUZMvaN * b3.NCTxEWno) + i3;
                        while (true) {
                            Object k3x7lurq3 = VgvYg0wo2.k3x7lurq(i3);
                            if (k3x7lurq3 == b3.jb9XjC4I) {
                                break loop0;
                            }
                            if (k3x7lurq3 == b3.wxUZMvaN) {
                                if (j5 < ygLcUYwZ()) {
                                    break loop0;
                                }
                                if (VgvYg0wo2.eVhOlqcC(k3x7lurq3, i3, b3.ow5vqvCr)) {
                                    VgvYg0wo2.OnDfzHZD(i3, null);
                                    VgvYg0wo2.Qr9iLBAD();
                                    break;
                                }
                            } else if (k3x7lurq3 != b3.VgvYg0wo && k3x7lurq3 != null) {
                                if (!(k3x7lurq3 instanceof qh0) && !(k3x7lurq3 instanceof rh0)) {
                                    lf lfVar = b3.b2ZJblxo;
                                    if (k3x7lurq3 == lfVar || k3x7lurq3 == b3.P7K7Inc8) {
                                        break loop0;
                                    }
                                    if (k3x7lurq3 != lfVar) {
                                        break;
                                    }
                                } else {
                                    if (j5 < ygLcUYwZ()) {
                                        break loop0;
                                    }
                                    qh0 qh0Var = k3x7lurq3 instanceof rh0 ? ((rh0) k3x7lurq3).qoPGr6Ce : (qh0) k3x7lurq3;
                                    if (VgvYg0wo2.eVhOlqcC(k3x7lurq3, i3, b3.ow5vqvCr)) {
                                        obj = fn.DK9slbsy(obj, qh0Var);
                                        VgvYg0wo2.OnDfzHZD(i3, null);
                                        VgvYg0wo2.Qr9iLBAD();
                                        break;
                                    }
                                }
                            } else if (VgvYg0wo2.eVhOlqcC(k3x7lurq3, i3, b3.ow5vqvCr)) {
                                VgvYg0wo2.Qr9iLBAD();
                                break;
                            }
                        }
                        i3--;
                    }
                } while (VgvYg0wo2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            i7xS8jrb((qh0) arrayList.get(size), false);
                        }
                    } else {
                        i7xS8jrb((qh0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean MdtA4re8(long j) {
        return j < k3x7lurq() || j < ygLcUYwZ() + ((long) this.NCTxEWno);
    }

    public final boolean Mq3SeTnW(Object obj, Object obj2) {
        if (obj instanceof h10) {
            m3 m3Var = ((h10) obj).NCTxEWno;
            u4 u4Var = new u4(obj2);
            v4 v4Var = b3.qoPGr6Ce;
            lf k3x7lurq2 = m3Var.k3x7lurq(u4Var, null);
            if (k3x7lurq2 == null) {
                return false;
            }
            m3Var.ygLcUYwZ(k3x7lurq2);
            return true;
        }
        if (!(obj instanceof w2)) {
            if (!(obj instanceof k3)) {
                m1.P7K7Inc8(obj, "Unexpected receiver type: ");
                return false;
            }
            k3 k3Var = (k3) obj;
            v4 v4Var2 = b3.qoPGr6Ce;
            lf k3x7lurq3 = k3Var.k3x7lurq(obj2, null);
            if (k3x7lurq3 == null) {
                return false;
            }
            k3Var.ygLcUYwZ(k3x7lurq3);
            return true;
        }
        w2 w2Var = (w2) obj;
        m3 m3Var2 = w2Var.MdtA4re8;
        m3Var2.getClass();
        w2Var.MdtA4re8 = null;
        w2Var.NCTxEWno = obj2;
        Boolean bool = Boolean.TRUE;
        v4 v4Var3 = b3.qoPGr6Ce;
        lf k3x7lurq4 = m3Var2.k3x7lurq(bool, null);
        if (k3x7lurq4 == null) {
            return false;
        }
        m3Var2.ygLcUYwZ(k3x7lurq4);
        return true;
    }

    @Override // defpackage.j4
    public final Object NCTxEWno() {
        v4 v4Var;
        Unsafe unsafe = b1.qoPGr6Ce;
        long longVolatile = unsafe.getLongVolatile(this, ygLcUYwZ);
        long longVolatile2 = unsafe.getLongVolatile(this, sjUBp5pO);
        if (KlHjfFWx(longVolatile2, true)) {
            return new s4(OnDfzHZD());
        }
        long j = longVolatile2 & 1152921504606846975L;
        t4 t4Var = u4.NCTxEWno;
        if (longVolatile >= j) {
            return t4Var;
        }
        Object obj = b3.k3x7lurq;
        v4 v4Var2 = (v4) unsafe.getObjectVolatile(this, OnDfzHZD);
        while (!this.Ey6iv0m0()) {
            long andIncrement = wxUZMvaN.getAndIncrement(this);
            long j2 = b3.NCTxEWno;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (v4Var2.wxUZMvaN != j3) {
                v4 jb9XjC4I2 = this.jb9XjC4I(j3, v4Var2);
                if (jb9XjC4I2 == null) {
                    continue;
                } else {
                    v4Var = jb9XjC4I2;
                }
            } else {
                v4Var = v4Var2;
            }
            z2 z2Var = this;
            Object SgZGMMPL = z2Var.SgZGMMPL(v4Var, i, andIncrement, obj);
            v4Var2 = v4Var;
            if (SgZGMMPL == b3.OnDfzHZD) {
                qh0 qh0Var = obj instanceof qh0 ? (qh0) obj : null;
                if (qh0Var != null) {
                    qh0Var.qoPGr6Ce(v4Var2, i);
                }
                z2Var.pRiPUEwG(andIncrement);
                v4Var2.Qr9iLBAD();
                return t4Var;
            }
            if (SgZGMMPL != b3.lDXGDhIF) {
                if (SgZGMMPL != b3.ygLcUYwZ) {
                    v4Var2.qoPGr6Ce();
                    return SgZGMMPL;
                }
                m1.Ey6iv0m0("unexpected");
                return null;
            }
            if (andIncrement < z2Var.sjUBp5pO()) {
                v4Var2.qoPGr6Ce();
            }
            this = z2Var;
        }
        return new s4(this.OnDfzHZD());
    }

    public final Throwable OnDfzHZD() {
        return (Throwable) b1.qoPGr6Ce.getObjectVolatile(this, Qr9iLBAD);
    }

    public final void OxcuoDLp(long j) {
        if ((P7K7Inc8.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((b1.qoPGr6Ce.getLongVolatile(this, ow5vqvCr) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void P7K7Inc8(long j) {
        v4 v4Var = (v4) b1.qoPGr6Ce.getObjectVolatile(this, OnDfzHZD);
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j2 = ygLcUYwZ;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.NCTxEWno + longVolatile, this.k3x7lurq())) {
                return;
            }
            z2 z2Var = this;
            if (unsafe.compareAndSwapLong(z2Var, j2, longVolatile, 1 + longVolatile)) {
                long j3 = b3.NCTxEWno;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (v4Var.wxUZMvaN != j4) {
                    v4 jb9XjC4I2 = z2Var.jb9XjC4I(j4, v4Var);
                    if (jb9XjC4I2 != null) {
                        v4Var = jb9XjC4I2;
                    }
                }
                v4 v4Var2 = v4Var;
                if (z2Var.SgZGMMPL(v4Var2, i, longVolatile, null) != b3.lDXGDhIF) {
                    v4Var2.qoPGr6Ce();
                } else if (longVolatile < z2Var.sjUBp5pO()) {
                    v4Var2.qoPGr6Ce();
                }
                this = z2Var;
                v4Var = v4Var2;
            }
            this = z2Var;
        }
    }

    public final void Qr9iLBAD() {
        Object Ey6iv0m0;
        Unsafe unsafe;
        if (FySoLYna()) {
            return;
        }
        Unsafe unsafe2 = b1.qoPGr6Ce;
        long j = eVhOlqcC;
        v4 v4Var = (v4) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = VgvYg0wo.getAndIncrement(this);
            long j2 = andIncrement / b3.NCTxEWno;
            if (sjUBp5pO() <= andIncrement) {
                if (v4Var.wxUZMvaN < j2 && v4Var.NCTxEWno() != null) {
                    gjV1z5T1(j2, v4Var);
                }
                OxcuoDLp(1L);
                return;
            }
            if (v4Var.wxUZMvaN != j2) {
                a3 a3Var = a3.jb9XjC4I;
                while (true) {
                    Ey6iv0m0 = w30.Ey6iv0m0(v4Var, j2, a3Var);
                    if (!n50.VgvYg0wo(Ey6iv0m0)) {
                        b60 MdtA4re82 = n50.MdtA4re8(Ey6iv0m0);
                        while (true) {
                            b60 b60Var = (b60) b1.qoPGr6Ce.getObjectVolatile(this, j);
                            if (b60Var.wxUZMvaN >= MdtA4re82.wxUZMvaN) {
                                break;
                            }
                            if (!MdtA4re82.jb9XjC4I()) {
                                break;
                            }
                            do {
                                unsafe = b1.qoPGr6Ce;
                                if (unsafe.compareAndSwapObject(this, eVhOlqcC, b60Var, MdtA4re82)) {
                                    if (b60Var.VgvYg0wo()) {
                                        b60Var.wxUZMvaN();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == b60Var);
                            if (MdtA4re82.VgvYg0wo()) {
                                MdtA4re82.wxUZMvaN();
                            }
                        }
                    } else {
                        break;
                    }
                }
                v4 v4Var2 = null;
                if (n50.VgvYg0wo(Ey6iv0m0)) {
                    I5GHvsYW();
                    gjV1z5T1(j2, v4Var);
                    OxcuoDLp(1L);
                } else {
                    v4 v4Var3 = (v4) n50.MdtA4re8(Ey6iv0m0);
                    long j3 = v4Var3.wxUZMvaN;
                    if (j3 > j2) {
                        long j4 = b3.NCTxEWno * j3;
                        if (b1.qoPGr6Ce.compareAndSwapLong(this, jb9XjC4I, 1 + andIncrement, j4)) {
                            OxcuoDLp(j4 - andIncrement);
                        } else {
                            OxcuoDLp(1L);
                        }
                    } else {
                        v4Var2 = v4Var3;
                    }
                }
                if (v4Var2 == null) {
                    continue;
                } else {
                    v4Var = v4Var2;
                }
            }
            int i = (int) (andIncrement % b3.NCTxEWno);
            Object k3x7lurq2 = v4Var.k3x7lurq(i);
            boolean z = k3x7lurq2 instanceof qh0;
            long j5 = ygLcUYwZ;
            if (!z || andIncrement < b1.qoPGr6Ce.getLongVolatile(this, j5) || !v4Var.eVhOlqcC(k3x7lurq2, i, b3.b2ZJblxo)) {
                while (true) {
                    Object k3x7lurq3 = v4Var.k3x7lurq(i);
                    if (!(k3x7lurq3 instanceof qh0)) {
                        if (k3x7lurq3 != b3.eVhOlqcC) {
                            if (k3x7lurq3 != null) {
                                if (k3x7lurq3 == b3.wxUZMvaN || k3x7lurq3 == b3.Qr9iLBAD || k3x7lurq3 == b3.jb9XjC4I || k3x7lurq3 == b3.k3x7lurq || k3x7lurq3 == b3.ow5vqvCr) {
                                    break loop0;
                                } else if (k3x7lurq3 != b3.P7K7Inc8) {
                                    m1.P7K7Inc8(k3x7lurq3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (v4Var.eVhOlqcC(k3x7lurq3, i, b3.VgvYg0wo)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < b1.qoPGr6Ce.getLongVolatile(this, j5)) {
                        if (v4Var.eVhOlqcC(k3x7lurq3, i, new rh0((qh0) k3x7lurq3))) {
                            break loop0;
                        }
                    } else if (v4Var.eVhOlqcC(k3x7lurq3, i, b3.b2ZJblxo)) {
                        if (euDDoUNr(k3x7lurq3)) {
                            v4Var.ygLcUYwZ(i, b3.wxUZMvaN);
                            break;
                        } else {
                            v4Var.ygLcUYwZ(i, b3.eVhOlqcC);
                            v4Var.Qr9iLBAD();
                        }
                    }
                }
            } else if (euDDoUNr(k3x7lurq2)) {
                v4Var.ygLcUYwZ(i, b3.wxUZMvaN);
                break;
            } else {
                v4Var.ygLcUYwZ(i, b3.eVhOlqcC);
                v4Var.Qr9iLBAD();
                OxcuoDLp(1L);
            }
        }
        OxcuoDLp(1L);
    }

    public boolean RXQxj5Oe() {
        return false;
    }

    public final Object SgZGMMPL(v4 v4Var, int i, long j, Object obj) {
        Object k3x7lurq2 = v4Var.k3x7lurq(i);
        AtomicReferenceArray atomicReferenceArray = v4Var.Qr9iLBAD;
        long j2 = sjUBp5pO;
        if (k3x7lurq2 == null) {
            if (j >= (b1.qoPGr6Ce.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return b3.ygLcUYwZ;
                }
                if (v4Var.eVhOlqcC(k3x7lurq2, i, obj)) {
                    Qr9iLBAD();
                    return b3.OnDfzHZD;
                }
            }
        } else if (k3x7lurq2 == b3.wxUZMvaN && v4Var.eVhOlqcC(k3x7lurq2, i, b3.jb9XjC4I)) {
            Qr9iLBAD();
            Object obj2 = atomicReferenceArray.get(i * 2);
            v4Var.OnDfzHZD(i, null);
            return obj2;
        }
        while (true) {
            Object k3x7lurq3 = v4Var.k3x7lurq(i);
            if (k3x7lurq3 == null || k3x7lurq3 == b3.VgvYg0wo) {
                if (j < (b1.qoPGr6Ce.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (v4Var.eVhOlqcC(k3x7lurq3, i, b3.Qr9iLBAD)) {
                        Qr9iLBAD();
                        return b3.lDXGDhIF;
                    }
                } else {
                    if (obj == null) {
                        return b3.ygLcUYwZ;
                    }
                    if (v4Var.eVhOlqcC(k3x7lurq3, i, obj)) {
                        Qr9iLBAD();
                        return b3.OnDfzHZD;
                    }
                }
            } else if (k3x7lurq3 != b3.wxUZMvaN) {
                lf lfVar = b3.eVhOlqcC;
                if (k3x7lurq3 == lfVar) {
                    return b3.lDXGDhIF;
                }
                if (k3x7lurq3 == b3.Qr9iLBAD) {
                    return b3.lDXGDhIF;
                }
                if (k3x7lurq3 == b3.ow5vqvCr) {
                    Qr9iLBAD();
                    return b3.lDXGDhIF;
                }
                if (k3x7lurq3 != b3.b2ZJblxo && v4Var.eVhOlqcC(k3x7lurq3, i, b3.P7K7Inc8)) {
                    boolean z = k3x7lurq3 instanceof rh0;
                    if (z) {
                        k3x7lurq3 = ((rh0) k3x7lurq3).qoPGr6Ce;
                    }
                    if (euDDoUNr(k3x7lurq3)) {
                        v4Var.ygLcUYwZ(i, b3.jb9XjC4I);
                        Qr9iLBAD();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        v4Var.OnDfzHZD(i, null);
                        return obj3;
                    }
                    v4Var.ygLcUYwZ(i, lfVar);
                    v4Var.Qr9iLBAD();
                    if (z) {
                        Qr9iLBAD();
                    }
                    return b3.lDXGDhIF;
                }
            } else if (v4Var.eVhOlqcC(k3x7lurq3, i, b3.jb9XjC4I)) {
                Qr9iLBAD();
                Object obj4 = atomicReferenceArray.get(i * 2);
                v4Var.OnDfzHZD(i, null);
                return obj4;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U0LaHZX7(v4 v4Var, int i, long j, h9 h9Var) {
        y2 y2Var;
        int i2;
        u4 u4Var;
        v4 v4Var2;
        if (h9Var instanceof y2) {
            y2Var = (y2) h9Var;
            int i3 = y2Var.b2ZJblxo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y2Var.b2ZJblxo = i3 - Integer.MIN_VALUE;
                Object obj = y2Var.VgvYg0wo;
                i2 = y2Var.b2ZJblxo;
                if (i2 != 0) {
                    fn.SgZGMMPL(obj);
                    y2Var.b2ZJblxo = 1;
                    m3 amk52bBQ = le0.amk52bBQ(w30.SgZGMMPL(y2Var));
                    try {
                        h10 h10Var = new h10(amk52bBQ);
                        Object SgZGMMPL = SgZGMMPL(v4Var, i, j, h10Var);
                        if (SgZGMMPL == b3.OnDfzHZD) {
                            h10Var.qoPGr6Ce(v4Var, i);
                        } else {
                            if (SgZGMMPL == b3.lDXGDhIF) {
                                if (j < sjUBp5pO()) {
                                    v4Var.qoPGr6Ce();
                                }
                                v4 v4Var3 = (v4) b1.qoPGr6Ce.getObjectVolatile(this, OnDfzHZD);
                                while (true) {
                                    if (Ey6iv0m0()) {
                                        amk52bBQ.P7K7Inc8(new u4(new s4(OnDfzHZD())));
                                        break;
                                    }
                                    long andIncrement = wxUZMvaN.getAndIncrement(this);
                                    long j2 = b3.NCTxEWno;
                                    long j3 = andIncrement / j2;
                                    int i4 = (int) (andIncrement % j2);
                                    if (v4Var3.wxUZMvaN != j3) {
                                        v4 jb9XjC4I2 = jb9XjC4I(j3, v4Var3);
                                        if (jb9XjC4I2 != null) {
                                            v4Var2 = jb9XjC4I2;
                                        }
                                    } else {
                                        v4Var2 = v4Var3;
                                    }
                                    Object SgZGMMPL2 = SgZGMMPL(v4Var2, i4, andIncrement, h10Var);
                                    v4 v4Var4 = v4Var2;
                                    if (SgZGMMPL2 == b3.OnDfzHZD) {
                                        h10Var.qoPGr6Ce(v4Var4, i4);
                                        break;
                                    }
                                    if (SgZGMMPL2 == b3.lDXGDhIF) {
                                        if (andIncrement < sjUBp5pO()) {
                                            v4Var4.qoPGr6Ce();
                                        }
                                        v4Var3 = v4Var4;
                                    } else {
                                        if (SgZGMMPL2 == b3.ygLcUYwZ) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        v4Var4.qoPGr6Ce();
                                        u4Var = new u4(SgZGMMPL2);
                                    }
                                }
                            } else {
                                v4Var.qoPGr6Ce();
                                u4Var = new u4(SgZGMMPL);
                            }
                            amk52bBQ.jb9XjC4I(u4Var, null);
                        }
                        obj = amk52bBQ.Ey6iv0m0();
                        u9 u9Var = u9.NCTxEWno;
                        if (obj == u9Var) {
                            return u9Var;
                        }
                    } catch (Throwable th) {
                        amk52bBQ.DK9slbsy();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                return ((u4) obj).qoPGr6Ce;
            }
        }
        y2Var = new y2(this, h9Var);
        Object obj2 = y2Var.VgvYg0wo;
        i2 = y2Var.b2ZJblxo;
        if (i2 != 0) {
        }
        return ((u4) obj2).qoPGr6Ce;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r0 = (defpackage.v4) ((defpackage.r7) defpackage.b1.qoPGr6Ce.getObjectVolatile(r0, defpackage.r7.NCTxEWno));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v4 VgvYg0wo(long j) {
        r7 r7Var;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = b1.qoPGr6Ce;
        Object objectVolatile = unsafe2.getObjectVolatile(this, eVhOlqcC);
        v4 v4Var = (v4) unsafe2.getObjectVolatile(this, lDXGDhIF);
        if (v4Var.wxUZMvaN > ((v4) objectVolatile).wxUZMvaN) {
            objectVolatile = v4Var;
        }
        v4 v4Var2 = (v4) unsafe2.getObjectVolatile(this, OnDfzHZD);
        if (v4Var2.wxUZMvaN > ((v4) objectVolatile).wxUZMvaN) {
            objectVolatile = v4Var2;
        }
        r7 r7Var2 = (r7) objectVolatile;
        loop0: while (true) {
            r7Var = r7Var2;
            while (true) {
                int i = r7.MdtA4re8;
                r7Var.getClass();
                Object objectVolatile2 = b1.qoPGr6Ce.getObjectVolatile(r7Var, r7.qoPGr6Ce);
                lf lfVar = w30.MdtA4re8;
                if (objectVolatile2 == lfVar) {
                    break loop0;
                }
                r7Var2 = (r7) objectVolatile2;
                if (r7Var2 == null) {
                    do {
                        unsafe = b1.qoPGr6Ce;
                        j3 = r7.qoPGr6Ce;
                        if (unsafe.compareAndSwapObject(r7Var, j3, (Object) null, lfVar)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(r7Var, j3) == null);
                }
            }
        }
        v4 v4Var3 = (v4) r7Var;
        if (RXQxj5Oe()) {
            v4 v4Var4 = v4Var3;
            loop3: do {
                int i2 = b3.NCTxEWno - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j2 = (v4Var4.wxUZMvaN * b3.NCTxEWno) + i2;
                    if (j2 < ygLcUYwZ()) {
                        break loop3;
                    }
                    while (true) {
                        Object k3x7lurq2 = v4Var4.k3x7lurq(i2);
                        if (k3x7lurq2 != null && k3x7lurq2 != b3.VgvYg0wo) {
                            if (k3x7lurq2 == b3.wxUZMvaN) {
                                break loop3;
                            }
                        } else {
                            if (v4Var4.eVhOlqcC(k3x7lurq2, i2, b3.ow5vqvCr)) {
                                v4Var4.Qr9iLBAD();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (v4Var4 != null);
            j2 = -1;
            if (j2 != -1) {
                P7K7Inc8(j2);
            }
        }
        Object obj = null;
        loop6: for (v4 v4Var5 = v4Var3; v4Var5 != null; v4Var5 = (v4) ((r7) b1.qoPGr6Ce.getObjectVolatile(v4Var5, r7.NCTxEWno))) {
            for (int i3 = b3.NCTxEWno - 1; -1 < i3; i3--) {
                if ((v4Var5.wxUZMvaN * b3.NCTxEWno) + i3 < j) {
                    break loop6;
                }
                while (true) {
                    Object k3x7lurq3 = v4Var5.k3x7lurq(i3);
                    if (k3x7lurq3 != null && k3x7lurq3 != b3.VgvYg0wo) {
                        if (!(k3x7lurq3 instanceof rh0)) {
                            if (!(k3x7lurq3 instanceof qh0)) {
                                break;
                            }
                            if (v4Var5.eVhOlqcC(k3x7lurq3, i3, b3.ow5vqvCr)) {
                                obj = fn.DK9slbsy(obj, k3x7lurq3);
                                v4Var5.ow5vqvCr(i3, true);
                                break;
                            }
                        } else {
                            if (v4Var5.eVhOlqcC(k3x7lurq3, i3, b3.ow5vqvCr)) {
                                obj = fn.DK9slbsy(obj, ((rh0) k3x7lurq3).qoPGr6Ce);
                                v4Var5.ow5vqvCr(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (v4Var5.eVhOlqcC(k3x7lurq3, i3, b3.ow5vqvCr)) {
                            v4Var5.Qr9iLBAD();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                i7xS8jrb((qh0) obj, true);
                return v4Var3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                i7xS8jrb((qh0) arrayList.get(size), true);
            }
        }
        return v4Var3;
    }

    public final Object WYNAV5pd(g9 g9Var, Object obj) {
        m3 m3Var = new m3(1, w30.SgZGMMPL(g9Var));
        m3Var.I5GHvsYW();
        m3Var.P7K7Inc8(new k30(lDXGDhIF()));
        Object Ey6iv0m0 = m3Var.Ey6iv0m0();
        return Ey6iv0m0 == u9.NCTxEWno ? Ey6iv0m0 : xe0.qoPGr6Ce;
    }

    @Override // defpackage.j4
    public final void b2ZJblxo(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        wxUZMvaN(cancellationException, true);
    }

    public final int eIA6dogk(v4 v4Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object k3x7lurq2 = v4Var.k3x7lurq(i);
            if (k3x7lurq2 == null) {
                if (!MdtA4re8(j) || z) {
                    if (z) {
                        if (v4Var.eVhOlqcC(null, i, b3.eVhOlqcC)) {
                            v4Var.Qr9iLBAD();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (v4Var.eVhOlqcC(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (v4Var.eVhOlqcC(null, i, b3.wxUZMvaN)) {
                    break;
                }
            } else {
                if (k3x7lurq2 != b3.VgvYg0wo) {
                    lf lfVar = b3.k3x7lurq;
                    if (k3x7lurq2 == lfVar) {
                        v4Var.OnDfzHZD(i, null);
                        return 5;
                    }
                    if (k3x7lurq2 == b3.Qr9iLBAD) {
                        v4Var.OnDfzHZD(i, null);
                        return 5;
                    }
                    if (k3x7lurq2 == b3.ow5vqvCr) {
                        v4Var.OnDfzHZD(i, null);
                        I5GHvsYW();
                        return 4;
                    }
                    v4Var.OnDfzHZD(i, null);
                    if (k3x7lurq2 instanceof rh0) {
                        k3x7lurq2 = ((rh0) k3x7lurq2).qoPGr6Ce;
                    }
                    if (Mq3SeTnW(k3x7lurq2, obj)) {
                        v4Var.ygLcUYwZ(i, b3.jb9XjC4I);
                        return 0;
                    }
                    if (v4Var.Qr9iLBAD.getAndSet((i * 2) + 1, lfVar) != lfVar) {
                        v4Var.ow5vqvCr(i, true);
                    }
                    return 5;
                }
                if (v4Var.eVhOlqcC(k3x7lurq2, i, b3.wxUZMvaN)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final v4 eVhOlqcC(long j, v4 v4Var) {
        Object Ey6iv0m0;
        v4 v4Var2;
        long j2;
        Unsafe unsafe;
        z2 z2Var = this;
        v4 v4Var3 = b3.qoPGr6Ce;
        a3 a3Var = a3.jb9XjC4I;
        loop0: while (true) {
            Ey6iv0m0 = w30.Ey6iv0m0(v4Var, j, a3Var);
            if (!n50.VgvYg0wo(Ey6iv0m0)) {
                b60 MdtA4re82 = n50.MdtA4re8(Ey6iv0m0);
                while (true) {
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    long j3 = lDXGDhIF;
                    b60 b60Var = (b60) unsafe2.getObjectVolatile(z2Var, j3);
                    if (b60Var.wxUZMvaN >= MdtA4re82.wxUZMvaN) {
                        break loop0;
                    }
                    if (!MdtA4re82.jb9XjC4I()) {
                        break;
                    }
                    do {
                        unsafe = b1.qoPGr6Ce;
                        if (unsafe.compareAndSwapObject(z2Var, lDXGDhIF, b60Var, MdtA4re82)) {
                            if (b60Var.VgvYg0wo()) {
                                b60Var.wxUZMvaN();
                            }
                        }
                    } while (unsafe.getObjectVolatile(z2Var, j3) == b60Var);
                    if (MdtA4re82.VgvYg0wo()) {
                        MdtA4re82.wxUZMvaN();
                    }
                }
            } else {
                break;
            }
        }
        v4 v4Var4 = null;
        if (n50.VgvYg0wo(Ey6iv0m0)) {
            z2Var.I5GHvsYW();
            if (v4Var.wxUZMvaN * b3.NCTxEWno >= z2Var.ygLcUYwZ()) {
                return null;
            }
            v4Var.qoPGr6Ce();
            return null;
        }
        v4 v4Var5 = (v4) n50.MdtA4re8(Ey6iv0m0);
        long j4 = v4Var5.wxUZMvaN;
        if (j4 <= j) {
            return v4Var5;
        }
        long j5 = j4 * b3.NCTxEWno;
        while (true) {
            Unsafe unsafe3 = b1.qoPGr6Ce;
            long j6 = sjUBp5pO;
            long longVolatile = unsafe3.getLongVolatile(z2Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                v4Var2 = v4Var4;
                j2 = j4;
                break;
            }
            v4Var2 = v4Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(z2Var, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            z2Var = this;
            v4Var4 = v4Var2;
            j4 = j2;
        }
        if (j2 * b3.NCTxEWno >= ygLcUYwZ()) {
            return v4Var2;
        }
        v4Var5.qoPGr6Ce();
        return v4Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5.VgvYg0wo() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5.wxUZMvaN();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gjV1z5T1(long j, v4 v4Var) {
        z2 z2Var;
        v4 v4Var2;
        v4 v4Var3;
        while (v4Var.wxUZMvaN < j && (v4Var3 = (v4) v4Var.NCTxEWno()) != null) {
            v4Var = v4Var3;
        }
        while (true) {
            v4 v4Var4 = v4Var;
            while (v4Var4.MdtA4re8() && (v4Var2 = (v4) v4Var4.NCTxEWno()) != null) {
                v4Var4 = v4Var2;
            }
            while (true) {
                Unsafe unsafe = b1.qoPGr6Ce;
                long j2 = eVhOlqcC;
                b60 b60Var = (b60) unsafe.getObjectVolatile(this, j2);
                if (b60Var.wxUZMvaN >= v4Var4.wxUZMvaN) {
                    return;
                }
                if (!v4Var4.jb9XjC4I()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    z2Var = this;
                    if (unsafe2.compareAndSwapObject(z2Var, eVhOlqcC, b60Var, v4Var4)) {
                        if (b60Var.VgvYg0wo()) {
                            b60Var.wxUZMvaN();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(z2Var, j2) != b60Var) {
                        break;
                    } else {
                        this = z2Var;
                    }
                }
                this = z2Var;
            }
            v4Var = v4Var4;
        }
    }

    public final void i7xS8jrb(qh0 qh0Var, boolean z) {
        Throwable lDXGDhIF2;
        if (qh0Var instanceof k3) {
            g9 g9Var = (g9) qh0Var;
            if (z) {
                lDXGDhIF2 = OnDfzHZD();
                if (lDXGDhIF2 == null) {
                    lDXGDhIF2 = new u5("Channel was closed");
                }
            } else {
                lDXGDhIF2 = lDXGDhIF();
            }
            g9Var.P7K7Inc8(new k30(lDXGDhIF2));
            return;
        }
        if (qh0Var instanceof h10) {
            ((h10) qh0Var).NCTxEWno.P7K7Inc8(new u4(new s4(OnDfzHZD())));
            return;
        }
        if (!(qh0Var instanceof w2)) {
            m1.P7K7Inc8(qh0Var, "Unexpected waiter: ");
            return;
        }
        w2 w2Var = (w2) qh0Var;
        m3 m3Var = w2Var.MdtA4re8;
        m3Var.getClass();
        w2Var.MdtA4re8 = null;
        w2Var.NCTxEWno = b3.ow5vqvCr;
        Throwable OnDfzHZD2 = w2Var.wxUZMvaN.OnDfzHZD();
        if (OnDfzHZD2 == null) {
            m3Var.P7K7Inc8(Boolean.FALSE);
        } else {
            m3Var.P7K7Inc8(new k30(OnDfzHZD2));
        }
    }

    @Override // defpackage.j4
    public final w2 iterator() {
        return new w2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r8.VgvYg0wo() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        r8.wxUZMvaN();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v4 jb9XjC4I(long j, v4 v4Var) {
        Object Ey6iv0m0;
        v4 v4Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        v4 v4Var3 = b3.qoPGr6Ce;
        a3 a3Var = a3.jb9XjC4I;
        loop0: while (true) {
            Ey6iv0m0 = w30.Ey6iv0m0(v4Var, j, a3Var);
            if (!n50.VgvYg0wo(Ey6iv0m0)) {
                b60 MdtA4re82 = n50.MdtA4re8(Ey6iv0m0);
                while (true) {
                    Unsafe unsafe3 = b1.qoPGr6Ce;
                    long j3 = OnDfzHZD;
                    b60 b60Var = (b60) unsafe3.getObjectVolatile(this, j3);
                    if (b60Var.wxUZMvaN >= MdtA4re82.wxUZMvaN) {
                        break loop0;
                    }
                    if (!MdtA4re82.jb9XjC4I()) {
                        break;
                    }
                    do {
                        unsafe2 = b1.qoPGr6Ce;
                        if (unsafe2.compareAndSwapObject(this, OnDfzHZD, b60Var, MdtA4re82)) {
                            if (b60Var.VgvYg0wo()) {
                                b60Var.wxUZMvaN();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == b60Var);
                    if (MdtA4re82.VgvYg0wo()) {
                        MdtA4re82.wxUZMvaN();
                    }
                }
            } else {
                break;
            }
        }
        if (n50.VgvYg0wo(Ey6iv0m0)) {
            I5GHvsYW();
            if (v4Var.wxUZMvaN * b3.NCTxEWno < sjUBp5pO()) {
                v4Var.qoPGr6Ce();
                return null;
            }
        } else {
            v4 v4Var4 = (v4) n50.MdtA4re8(Ey6iv0m0);
            long j4 = v4Var4.wxUZMvaN;
            if (!FySoLYna() && j <= k3x7lurq() / b3.NCTxEWno) {
                while (true) {
                    Unsafe unsafe4 = b1.qoPGr6Ce;
                    long j5 = eVhOlqcC;
                    b60 b60Var2 = (b60) unsafe4.getObjectVolatile(this, j5);
                    if (b60Var2.wxUZMvaN >= j4 || !v4Var4.jb9XjC4I()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe5 = b1.qoPGr6Ce;
                        v4Var2 = v4Var4;
                        if (unsafe5.compareAndSwapObject(this, eVhOlqcC, b60Var2, v4Var4)) {
                            if (b60Var2.VgvYg0wo()) {
                                b60Var2.wxUZMvaN();
                            }
                        } else {
                            if (unsafe5.getObjectVolatile(this, j5) != b60Var2) {
                                break;
                            }
                            v4Var4 = v4Var2;
                        }
                    }
                    v4Var4 = v4Var2;
                }
            }
            v4Var2 = v4Var4;
            if (j4 <= j) {
                return v4Var2;
            }
            long j6 = j4 * b3.NCTxEWno;
            do {
                unsafe = b1.qoPGr6Ce;
                j2 = ygLcUYwZ;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * b3.NCTxEWno < sjUBp5pO()) {
                v4Var2.qoPGr6Ce();
            }
        }
        return null;
    }

    public final long k3x7lurq() {
        return b1.qoPGr6Ce.getLongVolatile(this, jb9XjC4I);
    }

    public final Throwable lDXGDhIF() {
        Throwable OnDfzHZD2 = OnDfzHZD();
        return OnDfzHZD2 == null ? new v5("Channel was closed") : OnDfzHZD2;
    }

    @Override // defpackage.j4
    public final Object ow5vqvCr(k6 k6Var) {
        return lwWCatUu(this, k6Var);
    }

    public final void pRiPUEwG(long j) {
        z2 z2Var = this;
        if (z2Var.FySoLYna()) {
            return;
        }
        while (z2Var.k3x7lurq() <= j) {
            z2Var = this;
        }
        int i = b3.MdtA4re8;
        int i2 = 0;
        while (true) {
            long j2 = ow5vqvCr;
            if (i2 < i) {
                long k3x7lurq2 = z2Var.k3x7lurq();
                if (k3x7lurq2 == (b1.qoPGr6Ce.getLongVolatile(z2Var, j2) & 4611686018427387903L) && k3x7lurq2 == z2Var.k3x7lurq()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = b1.qoPGr6Ce;
                    long longVolatile = unsafe.getLongVolatile(z2Var, j2);
                    if (unsafe.compareAndSwapLong(z2Var, ow5vqvCr, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        z2Var = this;
                    }
                }
                while (true) {
                    long k3x7lurq3 = z2Var.k3x7lurq();
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    long longVolatile2 = unsafe2.getLongVolatile(z2Var, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (k3x7lurq3 == j3 && k3x7lurq3 == z2Var.k3x7lurq()) {
                        break;
                    }
                    if (z) {
                        z2Var = this;
                    } else {
                        z2Var = this;
                        unsafe2.compareAndSwapLong(z2Var, ow5vqvCr, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = b1.qoPGr6Ce;
                    long longVolatile3 = unsafe3.getLongVolatile(z2Var, j2);
                    if (unsafe3.compareAndSwapLong(z2Var, ow5vqvCr, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        z2Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[RETURN] */
    @Override // defpackage.i60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object qoPGr6Ce(g9 g9Var, Object obj) {
        Object obj2;
        Object obj3;
        Object Ey6iv0m0;
        Object obj4;
        String str;
        int i;
        z2 z2Var = this;
        Unsafe unsafe = b1.qoPGr6Ce;
        long j = lDXGDhIF;
        v4 v4Var = (v4) unsafe.getObjectVolatile(z2Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = MdtA4re8;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(z2Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean KlHjfFWx = z2Var.KlHjfFWx(andIncrement, false);
            int i2 = b3.NCTxEWno;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = v4Var.wxUZMvaN;
            Object obj5 = u9.NCTxEWno;
            obj2 = xe0.qoPGr6Ce;
            if (j5 != j4) {
                v4 eVhOlqcC2 = z2Var.eVhOlqcC(j4, v4Var);
                if (eVhOlqcC2 != null) {
                    v4Var = eVhOlqcC2;
                } else if (KlHjfFWx) {
                    Object WYNAV5pd = WYNAV5pd(g9Var, obj);
                    if (WYNAV5pd == obj5) {
                        return WYNAV5pd;
                    }
                }
            }
            int ytu5o6f4 = z2Var.ytu5o6f4(v4Var, i3, obj, j2, null, KlHjfFWx);
            if (ytu5o6f4 == 0) {
                v4Var.qoPGr6Ce();
                return obj2;
            }
            if (ytu5o6f4 == 1) {
                break;
            }
            if (ytu5o6f4 != 2) {
                if (ytu5o6f4 == 3) {
                    m3 amk52bBQ = le0.amk52bBQ(w30.SgZGMMPL(g9Var));
                    try {
                        int ytu5o6f42 = ytu5o6f4(v4Var, i3, obj, j2, amk52bBQ, false);
                        if (ytu5o6f42 != 0) {
                            if (ytu5o6f42 == 1) {
                                obj3 = obj5;
                                amk52bBQ.P7K7Inc8(obj2);
                            } else if (ytu5o6f42 != 2) {
                                if (ytu5o6f42 != 4) {
                                    String str2 = "unexpected";
                                    if (ytu5o6f42 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    v4Var.qoPGr6Ce();
                                    v4 v4Var2 = (v4) b1.qoPGr6Ce.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean KlHjfFWx2 = KlHjfFWx(andIncrement2, false);
                                        int i4 = b3.NCTxEWno;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j7 = i4;
                                        obj3 = obj5;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        if (v4Var2.wxUZMvaN != j8) {
                                            v4 eVhOlqcC3 = eVhOlqcC(j8, v4Var2);
                                            if (eVhOlqcC3 != null) {
                                                str = str2;
                                                i = i5;
                                                v4Var2 = eVhOlqcC3;
                                            } else {
                                                if (KlHjfFWx2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            }
                                        } else {
                                            str = str2;
                                            i = i5;
                                        }
                                        int ytu5o6f43 = ytu5o6f4(v4Var2, i, obj, j6, amk52bBQ, KlHjfFWx2);
                                        if (ytu5o6f43 == 0) {
                                            v4Var2.qoPGr6Ce();
                                            break;
                                        }
                                        if (ytu5o6f43 == 1) {
                                            break;
                                        }
                                        if (ytu5o6f43 != 2) {
                                            if (ytu5o6f43 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (ytu5o6f43 != 4) {
                                                if (ytu5o6f43 == 5) {
                                                    v4Var2.qoPGr6Ce();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            } else if (j6 < ygLcUYwZ()) {
                                                v4Var2.qoPGr6Ce();
                                            }
                                        } else if (KlHjfFWx2) {
                                            v4Var2.Qr9iLBAD();
                                        } else {
                                            amk52bBQ.qoPGr6Ce(v4Var2, i + i4);
                                        }
                                    }
                                } else {
                                    obj3 = obj5;
                                    if (j2 < ygLcUYwZ()) {
                                        v4Var.qoPGr6Ce();
                                    }
                                }
                                DK9slbsy(obj, amk52bBQ);
                            } else {
                                obj3 = obj5;
                                amk52bBQ.qoPGr6Ce(v4Var, i3 + i2);
                            }
                            Ey6iv0m0 = amk52bBQ.Ey6iv0m0();
                            obj4 = obj3;
                            if (Ey6iv0m0 != obj4) {
                                Ey6iv0m0 = obj2;
                            }
                            if (Ey6iv0m0 != obj4) {
                                return Ey6iv0m0;
                            }
                        } else {
                            obj3 = obj5;
                            v4Var.qoPGr6Ce();
                        }
                        amk52bBQ.P7K7Inc8(obj2);
                        Ey6iv0m0 = amk52bBQ.Ey6iv0m0();
                        obj4 = obj3;
                        if (Ey6iv0m0 != obj4) {
                        }
                        if (Ey6iv0m0 != obj4) {
                            break;
                        }
                    } catch (Throwable th) {
                        amk52bBQ.DK9slbsy();
                        throw th;
                    }
                } else if (ytu5o6f4 != 4) {
                    if (ytu5o6f4 == 5) {
                        v4Var.qoPGr6Ce();
                    }
                    z2Var = this;
                } else {
                    if (j2 < ygLcUYwZ()) {
                        v4Var.qoPGr6Ce();
                    }
                    Object WYNAV5pd2 = WYNAV5pd(g9Var, obj);
                    if (WYNAV5pd2 == obj5) {
                        return WYNAV5pd2;
                    }
                }
            } else if (KlHjfFWx) {
                v4Var.Qr9iLBAD();
                Object WYNAV5pd3 = WYNAV5pd(g9Var, obj);
                if (WYNAV5pd3 == obj5) {
                    return WYNAV5pd3;
                }
            }
        }
        return obj2;
    }

    public final long sjUBp5pO() {
        return b1.qoPGr6Ce.getLongVolatile(this, sjUBp5pO) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0194, code lost:
    
        r3 = (defpackage.v4) r3.NCTxEWno();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019b, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = b1.qoPGr6Ce;
        int longVolatile = (int) (unsafe.getLongVolatile(this, sjUBp5pO) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.NCTxEWno + ',');
        sb.append("data=[");
        int i = 0;
        List N8VPGzVC = y5.N8VPGzVC(unsafe.getObjectVolatile(this, OnDfzHZD), unsafe.getObjectVolatile(this, lDXGDhIF), unsafe.getObjectVolatile(this, eVhOlqcC));
        ArrayList arrayList = new ArrayList();
        for (Object obj : N8VPGzVC) {
            if (((v4) obj) != b3.qoPGr6Ce) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((v4) next).wxUZMvaN;
            do {
                Object next2 = it.next();
                long j2 = ((v4) next2).wxUZMvaN;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        v4 v4Var = (v4) next;
        long ygLcUYwZ2 = ygLcUYwZ();
        long sjUBp5pO2 = sjUBp5pO();
        loop2: while (true) {
            int i2 = b3.NCTxEWno;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                long j3 = (v4Var.wxUZMvaN * b3.NCTxEWno) + i3;
                if (j3 >= sjUBp5pO2 && j3 >= ygLcUYwZ2) {
                    break loop2;
                }
                Object k3x7lurq2 = v4Var.k3x7lurq(i3);
                Object obj2 = v4Var.Qr9iLBAD.get(i3 * 2);
                if (k3x7lurq2 instanceof k3) {
                    str = (j3 >= ygLcUYwZ2 || j3 < sjUBp5pO2) ? (j3 >= sjUBp5pO2 || j3 < ygLcUYwZ2) ? "cont" : "send" : "receive";
                } else if (k3x7lurq2 instanceof h10) {
                    str = "receiveCatching";
                } else if (k3x7lurq2 instanceof rh0) {
                    str = "EB(" + k3x7lurq2 + ')';
                } else if (fn.qoPGr6Ce(k3x7lurq2, b3.P7K7Inc8) || fn.qoPGr6Ce(k3x7lurq2, b3.b2ZJblxo)) {
                    str = "resuming_sender";
                } else {
                    if (k3x7lurq2 != null && !k3x7lurq2.equals(b3.VgvYg0wo) && !k3x7lurq2.equals(b3.jb9XjC4I) && !k3x7lurq2.equals(b3.Qr9iLBAD) && !k3x7lurq2.equals(b3.k3x7lurq) && !k3x7lurq2.equals(b3.eVhOlqcC) && !k3x7lurq2.equals(b3.ow5vqvCr)) {
                        str = k3x7lurq2.toString();
                    }
                    i3++;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i3++;
            }
            i = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wxUZMvaN(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        z2 z2Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = b1.qoPGr6Ce;
                long j4 = sjUBp5pO;
                long longVolatile3 = unsafe4.getLongVolatile(z2Var, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                v4 v4Var = b3.qoPGr6Ce;
                if (unsafe4.compareAndSwapLong(z2Var, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                z2Var = this;
            }
        }
        lf lfVar = b3.KlHjfFWx;
        while (true) {
            Unsafe unsafe5 = b1.qoPGr6Ce;
            long j5 = Qr9iLBAD;
            if (unsafe5.compareAndSwapObject(this, j5, lfVar, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != lfVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = b1.qoPGr6Ce;
                j3 = sjUBp5pO;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = b1.qoPGr6Ce;
                j = sjUBp5pO;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        I5GHvsYW();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = b1.qoPGr6Ce;
                long j6 = k3x7lurq;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                lf lfVar2 = objectVolatile == null ? b3.OxcuoDLp : b3.amk52bBQ;
                do {
                    unsafe2 = b1.qoPGr6Ce;
                    if (unsafe2.compareAndSwapObject(this, k3x7lurq, objectVolatile, lfVar2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                le0.VgvYg0wo(1, objectVolatile);
                ((zk) objectVolatile).ow5vqvCr(OnDfzHZD());
                return z2;
            }
        }
        return z2;
    }

    public final long ygLcUYwZ() {
        return b1.qoPGr6Ce.getLongVolatile(this, ygLcUYwZ);
    }

    public final int ytu5o6f4(v4 v4Var, int i, Object obj, long j, Object obj2, boolean z) {
        v4Var.OnDfzHZD(i, obj);
        if (z) {
            return eIA6dogk(v4Var, i, obj, j, obj2, z);
        }
        Object k3x7lurq2 = v4Var.k3x7lurq(i);
        if (k3x7lurq2 == null) {
            if (MdtA4re8(j)) {
                if (v4Var.eVhOlqcC(null, i, b3.wxUZMvaN)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (v4Var.eVhOlqcC(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (k3x7lurq2 instanceof qh0) {
            v4Var.OnDfzHZD(i, null);
            if (Mq3SeTnW(k3x7lurq2, obj)) {
                v4Var.ygLcUYwZ(i, b3.jb9XjC4I);
                return 0;
            }
            lf lfVar = b3.k3x7lurq;
            if (v4Var.Qr9iLBAD.getAndSet((i * 2) + 1, lfVar) == lfVar) {
                return 5;
            }
            v4Var.ow5vqvCr(i, true);
            return 5;
        }
        return eIA6dogk(v4Var, i, obj, j, obj2, z);
    }
}
