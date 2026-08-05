package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class gq {
    public static final /* synthetic */ long MdtA4re8;
    public static final /* synthetic */ long NCTxEWno;
    public static final /* synthetic */ long wxUZMvaN;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        NCTxEWno = unsafe.objectFieldOffset(gq.class.getDeclaredField("_next$volatile"));
        MdtA4re8 = unsafe.objectFieldOffset(gq.class.getDeclaredField("_prev$volatile"));
        wxUZMvaN = unsafe.objectFieldOffset(gq.class.getDeclaredField("_removedRef$volatile"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gq P7K7Inc8() {
        gq gqVar;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = b1.qoPGr6Ce;
            long j = MdtA4re8;
            gq gqVar2 = (gq) unsafe2.getObjectVolatile(this, j);
            gq gqVar3 = null;
            gq gqVar4 = gqVar2;
            while (gqVar4 != null) {
                Unsafe unsafe3 = b1.qoPGr6Ce;
                long j2 = NCTxEWno;
                Object objectVolatile = unsafe3.getObjectVolatile(gqVar4, j2);
                if (objectVolatile != this) {
                    gq gqVar5 = gqVar2;
                    gqVar = this;
                    if (gqVar.k3x7lurq()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof s20)) {
                        objectVolatile.getClass();
                        gqVar3 = gqVar4;
                        gqVar4 = (gq) objectVolatile;
                    } else if (gqVar3 != null) {
                        gq gqVar6 = ((s20) objectVolatile).qoPGr6Ce;
                        do {
                            gq gqVar7 = gqVar4;
                            unsafe = b1.qoPGr6Ce;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(gqVar3, NCTxEWno, gqVar7, gqVar6);
                            gqVar4 = gqVar7;
                            if (compareAndSwapObject) {
                                this = gqVar;
                                gqVar4 = gqVar3;
                                gqVar2 = gqVar5;
                                gqVar3 = null;
                            }
                        } while (unsafe.getObjectVolatile(gqVar3, j2) == gqVar4);
                    } else {
                        if (gqVar4 == null) {
                            m1.qoPGr6Ce();
                            return null;
                        }
                        gqVar4 = (gq) unsafe3.getObjectVolatile(gqVar4, j);
                    }
                    this = gqVar;
                    gqVar2 = gqVar5;
                } else {
                    if (gqVar2 == gqVar4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = b1.qoPGr6Ce;
                        gq gqVar8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(gqVar8, MdtA4re8, gqVar2, gqVar4);
                        gq gqVar9 = gqVar2;
                        gqVar = gqVar8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(gqVar, j) != gqVar9) {
                            break;
                        }
                        this = gqVar;
                        gqVar2 = gqVar9;
                    }
                }
                this = gqVar;
            }
            m1.qoPGr6Ce();
            return null;
        }
    }

    public final Object Qr9iLBAD() {
        return b1.qoPGr6Ce.getObjectVolatile(this, NCTxEWno);
    }

    public final boolean VgvYg0wo(gq gqVar, int i) {
        gq gqVar2;
        gq gqVar3;
        while (true) {
            gq eVhOlqcC = this.eVhOlqcC();
            if (eVhOlqcC instanceof np) {
                return (((np) eVhOlqcC).VgvYg0wo & i) == 0 && eVhOlqcC.VgvYg0wo(gqVar, i);
            }
            Unsafe unsafe = b1.qoPGr6Ce;
            unsafe.putObjectVolatile(gqVar, MdtA4re8, eVhOlqcC);
            long j = NCTxEWno;
            unsafe.putObjectVolatile(gqVar, j, this);
            while (true) {
                Unsafe unsafe2 = b1.qoPGr6Ce;
                gqVar2 = this;
                gqVar3 = gqVar;
                if (unsafe2.compareAndSwapObject(eVhOlqcC, NCTxEWno, gqVar2, gqVar3)) {
                    gqVar3.b2ZJblxo(gqVar2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(eVhOlqcC, j) != gqVar2) {
                    break;
                }
                this = gqVar2;
                gqVar = gqVar3;
            }
            this = gqVar2;
            gqVar = gqVar3;
        }
    }

    public final void b2ZJblxo(gq gqVar) {
        gq gqVar2;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = MdtA4re8;
            gq gqVar3 = (gq) unsafe.getObjectVolatile(gqVar, j);
            if (this.Qr9iLBAD() != gqVar) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = b1.qoPGr6Ce;
                gqVar2 = this;
                gq gqVar4 = gqVar;
                if (unsafe2.compareAndSwapObject(gqVar4, MdtA4re8, gqVar3, gqVar2)) {
                    if (gqVar2.k3x7lurq()) {
                        gqVar4.P7K7Inc8();
                        return;
                    }
                    return;
                } else {
                    gqVar = gqVar4;
                    if (unsafe2.getObjectVolatile(gqVar4, j) != gqVar3) {
                        break;
                    } else {
                        this = gqVar2;
                    }
                }
            }
            this = gqVar2;
        }
    }

    public final gq eVhOlqcC() {
        gq P7K7Inc8 = P7K7Inc8();
        if (P7K7Inc8 != null) {
            return P7K7Inc8;
        }
        Unsafe unsafe = b1.qoPGr6Ce;
        long j = MdtA4re8;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            gq gqVar = (gq) objectVolatile;
            if (!gqVar.k3x7lurq()) {
                return gqVar;
            }
            objectVolatile = b1.qoPGr6Ce.getObjectVolatile(gqVar, j);
        }
    }

    public final gq jb9XjC4I() {
        Object Qr9iLBAD = Qr9iLBAD();
        s20 s20Var = Qr9iLBAD instanceof s20 ? (s20) Qr9iLBAD : null;
        if (s20Var != null) {
            return s20Var.qoPGr6Ce;
        }
        Qr9iLBAD.getClass();
        return (gq) Qr9iLBAD;
    }

    public boolean k3x7lurq() {
        return Qr9iLBAD() instanceof s20;
    }

    public String toString() {
        return new fq(this, ra.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + ra.I5GHvsYW(this);
    }
}
