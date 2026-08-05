package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class e60 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater P7K7Inc8;
    public static final /* synthetic */ long Qr9iLBAD;
    public static final /* synthetic */ AtomicLongFieldUpdater VgvYg0wo;
    public static final /* synthetic */ long b2ZJblxo;
    public static final /* synthetic */ long jb9XjC4I;
    public static final /* synthetic */ AtomicLongFieldUpdater wxUZMvaN;
    public final l3 MdtA4re8;
    public final int NCTxEWno;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        Qr9iLBAD = unsafe.objectFieldOffset(e60.class.getDeclaredField("head$volatile"));
        wxUZMvaN = AtomicLongFieldUpdater.newUpdater(e60.class, "deqIdx$volatile");
        jb9XjC4I = unsafe.objectFieldOffset(e60.class.getDeclaredField("tail$volatile"));
        VgvYg0wo = AtomicLongFieldUpdater.newUpdater(e60.class, "enqIdx$volatile");
        P7K7Inc8 = AtomicIntegerFieldUpdater.newUpdater(e60.class, "_availablePermits$volatile");
        b2ZJblxo = unsafe.objectFieldOffset(e60.class.getDeclaredField("_availablePermits$volatile"));
    }

    public e60(int i) {
        this.NCTxEWno = i;
        if (i <= 0) {
            m1.NCTxEWno(q70.VgvYg0wo("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            m1.NCTxEWno(q70.VgvYg0wo("The number of acquired permits should be in 0..", i));
            throw null;
        }
        h60 h60Var = new h60(0L, null, 2);
        this.head$volatile = h60Var;
        this.tail$volatile = h60Var;
        this._availablePermits$volatile = i;
        this.MdtA4re8 = new l3(2, this);
    }

    public final void NCTxEWno() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object Ey6iv0m0;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = P7K7Inc8.getAndIncrement(this);
            int i2 = this.NCTxEWno;
            if (andIncrement >= i2) {
                do {
                    unsafe = b1.qoPGr6Ce;
                    j = b2ZJblxo;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.NCTxEWno;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = b1.qoPGr6Ce;
            long j2 = Qr9iLBAD;
            h60 h60Var = (h60) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = wxUZMvaN.getAndIncrement(this);
            long j3 = andIncrement2 / g60.P7K7Inc8;
            d60 d60Var = d60.jb9XjC4I;
            while (true) {
                Ey6iv0m0 = w30.Ey6iv0m0(h60Var, j3, d60Var);
                if (n50.VgvYg0wo(Ey6iv0m0)) {
                    break;
                }
                b60 MdtA4re8 = n50.MdtA4re8(Ey6iv0m0);
                while (true) {
                    b60 b60Var = (b60) b1.qoPGr6Ce.getObjectVolatile(this, j2);
                    if (b60Var.wxUZMvaN >= MdtA4re8.wxUZMvaN) {
                        break;
                    }
                    if (!MdtA4re8.jb9XjC4I()) {
                        break;
                    }
                    do {
                        unsafe2 = b1.qoPGr6Ce;
                        if (unsafe2.compareAndSwapObject(this, Qr9iLBAD, b60Var, MdtA4re8)) {
                            if (b60Var.VgvYg0wo()) {
                                b60Var.wxUZMvaN();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == b60Var);
                    if (MdtA4re8.VgvYg0wo()) {
                        MdtA4re8.wxUZMvaN();
                    }
                }
            }
            h60 h60Var2 = (h60) n50.MdtA4re8(Ey6iv0m0);
            AtomicReferenceArray atomicReferenceArray = h60Var2.b2ZJblxo;
            h60Var2.qoPGr6Ce();
            z = false;
            if (h60Var2.wxUZMvaN <= j3) {
                int i3 = (int) (andIncrement2 % g60.P7K7Inc8);
                Object andSet = atomicReferenceArray.getAndSet(i3, g60.NCTxEWno);
                if (andSet == null) {
                    int i4 = g60.qoPGr6Ce;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == g60.MdtA4re8) {
                            z = true;
                            break;
                        }
                    }
                    lf lfVar = g60.NCTxEWno;
                    lf lfVar2 = g60.wxUZMvaN;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, lfVar, lfVar2)) {
                            if (atomicReferenceArray.get(i3) != lfVar) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != g60.VgvYg0wo) {
                    if (!(andSet instanceof k3)) {
                        m1.P7K7Inc8(andSet, "unexpected: ");
                        return;
                    }
                    k3 k3Var = (k3) andSet;
                    lf k3x7lurq = k3Var.k3x7lurq(xe0.qoPGr6Ce, this.MdtA4re8);
                    if (k3x7lurq != null) {
                        k3Var.ygLcUYwZ(k3x7lurq);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }

    public final boolean qoPGr6Ce(qh0 qh0Var) {
        Object Ey6iv0m0;
        Unsafe unsafe;
        e60 e60Var = this;
        Unsafe unsafe2 = b1.qoPGr6Ce;
        long j = jb9XjC4I;
        h60 h60Var = (h60) unsafe2.getObjectVolatile(e60Var, j);
        long andIncrement = VgvYg0wo.getAndIncrement(e60Var);
        c60 c60Var = c60.jb9XjC4I;
        long j2 = andIncrement / g60.P7K7Inc8;
        loop0: while (true) {
            Ey6iv0m0 = w30.Ey6iv0m0(h60Var, j2, c60Var);
            if (n50.VgvYg0wo(Ey6iv0m0)) {
                break;
            }
            b60 MdtA4re8 = n50.MdtA4re8(Ey6iv0m0);
            while (true) {
                b60 b60Var = (b60) b1.qoPGr6Ce.getObjectVolatile(e60Var, j);
                if (b60Var.wxUZMvaN >= MdtA4re8.wxUZMvaN) {
                    e60Var = this;
                    break loop0;
                }
                if (!MdtA4re8.jb9XjC4I()) {
                    break;
                }
                do {
                    unsafe = b1.qoPGr6Ce;
                    e60Var = this;
                    if (unsafe.compareAndSwapObject(e60Var, jb9XjC4I, b60Var, MdtA4re8)) {
                        if (b60Var.VgvYg0wo()) {
                            b60Var.wxUZMvaN();
                        }
                    }
                } while (unsafe.getObjectVolatile(e60Var, j) == b60Var);
                if (MdtA4re8.VgvYg0wo()) {
                    MdtA4re8.wxUZMvaN();
                }
            }
            e60Var = this;
        }
        h60 h60Var2 = (h60) n50.MdtA4re8(Ey6iv0m0);
        AtomicReferenceArray atomicReferenceArray = h60Var2.b2ZJblxo;
        int i = (int) (andIncrement % g60.P7K7Inc8);
        while (!atomicReferenceArray.compareAndSet(i, null, qh0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                lf lfVar = g60.NCTxEWno;
                lf lfVar2 = g60.MdtA4re8;
                while (!atomicReferenceArray.compareAndSet(i, lfVar, lfVar2)) {
                    if (atomicReferenceArray.get(i) != lfVar) {
                        return false;
                    }
                }
                ((k3) qh0Var).jb9XjC4I(xe0.qoPGr6Ce, e60Var.MdtA4re8);
                return true;
            }
        }
        qh0Var.qoPGr6Ce(h60Var2, i);
        return true;
    }
}
