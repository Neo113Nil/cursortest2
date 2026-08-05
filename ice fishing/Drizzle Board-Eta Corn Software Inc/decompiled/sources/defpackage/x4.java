package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class x4 extends sn {
    public final m3 P7K7Inc8;

    public x4(m3 m3Var) {
        this.P7K7Inc8 = m3Var;
    }

    @Override // defpackage.sn
    public final boolean OnDfzHZD() {
        return true;
    }

    @Override // defpackage.sn
    public final void ygLcUYwZ(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        CancellationException DK9slbsy = ow5vqvCr().DK9slbsy();
        m3 m3Var = this.P7K7Inc8;
        if (m3Var.gjV1z5T1()) {
            ad adVar = (ad) m3Var.VgvYg0wo;
            long j = ad.jb9XjC4I;
            loop0: while (true) {
                Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(adVar, j);
                lf lfVar = fn.jb9XjC4I;
                if (fn.qoPGr6Ce(objectVolatile, lfVar)) {
                    do {
                        unsafe = b1.qoPGr6Ce;
                        if (unsafe.compareAndSwapObject(adVar, ad.jb9XjC4I, lfVar, DK9slbsy)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(adVar, j) == lfVar);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = b1.qoPGr6Ce;
                        if (unsafe2.compareAndSwapObject(adVar, ad.jb9XjC4I, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(adVar, j) == objectVolatile);
                }
            }
        }
        m3Var.OxcuoDLp(DK9slbsy);
        if (m3Var.gjV1z5T1()) {
            return;
        }
        m3Var.amk52bBQ();
    }
}
