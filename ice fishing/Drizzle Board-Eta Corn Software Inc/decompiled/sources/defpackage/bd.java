package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bd extends v50 {
    public static final /* synthetic */ long P7K7Inc8 = b1.qoPGr6Ce.objectFieldOffset(bd.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.v50, defpackage.vn
    public final void OxcuoDLp(Object obj) {
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = P7K7Inc8;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    fn.i7xS8jrb(w30.SgZGMMPL(this.VgvYg0wo), le0.pRiPUEwG(obj));
                    return;
                } else {
                    m1.Ey6iv0m0("Already resumed");
                    return;
                }
            }
            bd bdVar = this;
            if (unsafe.compareAndSwapInt(bdVar, j, 0, 2)) {
                return;
            } else {
                this = bdVar;
            }
        }
    }

    @Override // defpackage.v50, defpackage.vn
    public final void sjUBp5pO(Object obj) {
        OxcuoDLp(obj);
    }
}
