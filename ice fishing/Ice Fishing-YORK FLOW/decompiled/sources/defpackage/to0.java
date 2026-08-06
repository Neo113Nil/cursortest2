package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class to0 extends defpackage.xb1 implements defpackage.ro0 {
    private volatile /* synthetic */ java.lang.Object owner$volatile;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater gUjdnLbkVAaA = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.to0.class, java.lang.Object.class, "owner$volatile");
    public static final /* synthetic */ long T1fB7bDYiVJQ = defpackage.ed.ZpBGe2uQfcn8.objectFieldOffset(defpackage.to0.class.getDeclaredField("owner$volatile"));

    public to0() {
        super(1);
        this.owner$volatile = defpackage.ma0.m6iZQUu7XjoL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r5 = defpackage.to0.gUjdnLbkVAaA;
        r2 = r0.oh71FJcDz6S2;
        r5.set(r2, null);
        r5 = r0.WDYagTQQm9ns;
        r5.frSwwKIlbUhK(r1, r5.QiMR8OkAhezm, new defpackage.cd(0, new defpackage.fNwYGHIYeJcR(18, r2, r0)));
     */
    @Override // defpackage.ro0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object JhCgjQRTAOCT(defpackage.ll llVar) {
        boolean QiMR8OkAhezm = QiMR8OkAhezm();
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        if (!QiMR8OkAhezm) {
            defpackage.dd frSwwKIlbUhK = defpackage.nq1.frSwwKIlbUhK(defpackage.q70.OcTWLQzke1i2(llVar));
            try {
                defpackage.so0 so0Var = new defpackage.so0(this, frSwwKIlbUhK);
                while (true) {
                    int andDecrement = defpackage.xb1.Ns0WNyEWdPsk.getAndDecrement(this);
                    if (andDecrement <= this.WDYagTQQm9ns) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (ZpBGe2uQfcn8(so0Var)) {
                            break;
                        }
                    }
                }
                java.lang.Object w7APNrr0aGRc = frSwwKIlbUhK.w7APNrr0aGRc();
                defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                if (w7APNrr0aGRc != tmVar) {
                    w7APNrr0aGRc = gs1Var;
                }
                if (w7APNrr0aGRc == tmVar) {
                    return w7APNrr0aGRc;
                }
            } catch (java.lang.Throwable th) {
                frSwwKIlbUhK.jjTN4uUnoyEn();
                throw th;
            }
        }
        return gs1Var;
    }

    public final int P05cfTpS5W5L() {
        int i;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = defpackage.xb1.Ns0WNyEWdPsk;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.WDYagTQQm9ns;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    gUjdnLbkVAaA.getClass();
                    defpackage.ed.ZpBGe2uQfcn8.putObjectVolatile(this, T1fB7bDYiVJQ, (java.lang.Object) null);
                    return 0;
                }
            }
        }
    }

    public final boolean QiMR8OkAhezm() {
        int P05cfTpS5W5L = P05cfTpS5W5L();
        if (P05cfTpS5W5L == 0) {
            return true;
        }
        if (P05cfTpS5W5L == 1) {
            return false;
        }
        if (P05cfTpS5W5L == 2) {
            throw new java.lang.IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        defpackage.h7.P05cfTpS5W5L("unexpected");
        return false;
    }

    @Override // defpackage.ro0
    public final void giKS3J6vZuNy(java.lang.Object obj) {
        while (this.oh71FJcDz6S2()) {
            gUjdnLbkVAaA.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = T1fB7bDYiVJQ;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            defpackage.ru ruVar = defpackage.ma0.m6iZQUu7XjoL;
            if (objectVolatile != ruVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new java.lang.IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    defpackage.to0 to0Var = this;
                    if (unsafe2.compareAndSwapObject(to0Var, T1fB7bDYiVJQ, objectVolatile, ruVar)) {
                        to0Var.fWTAfUmVKrZq();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(to0Var, j) != objectVolatile) {
                            this = to0Var;
                            break;
                        }
                        this = to0Var;
                    }
                }
            }
        }
        defpackage.h7.P05cfTpS5W5L("This mutex is not locked");
    }

    public final boolean oh71FJcDz6S2() {
        return java.lang.Math.max(defpackage.xb1.Ns0WNyEWdPsk.get(this), 0) == 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mutex@");
        sb.append(defpackage.nn.IJ0hOnjhPOri(this));
        sb.append("[isLocked=");
        sb.append(oh71FJcDz6S2());
        sb.append(",owner=");
        gUjdnLbkVAaA.getClass();
        sb.append(defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, T1fB7bDYiVJQ));
        sb.append(']');
        return sb.toString();
    }
}
