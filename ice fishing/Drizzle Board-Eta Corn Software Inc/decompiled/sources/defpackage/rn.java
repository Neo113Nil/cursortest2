package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class rn extends vn {
    public final boolean wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(vn vnVar) {
        super(true);
        boolean z = true;
        eIA6dogk(vnVar);
        Unsafe unsafe = b1.qoPGr6Ce;
        long j = vn.NCTxEWno;
        y4 y4Var = (y4) unsafe.getObjectVolatile(this, j);
        z4 z4Var = y4Var instanceof z4 ? (z4) y4Var : null;
        if (z4Var != null) {
            vn ow5vqvCr = z4Var.ow5vqvCr();
            while (!ow5vqvCr.U0LaHZX7()) {
                y4 y4Var2 = (y4) b1.qoPGr6Ce.getObjectVolatile(ow5vqvCr, j);
                z4 z4Var2 = y4Var2 instanceof z4 ? (z4) y4Var2 : null;
                if (z4Var2 != null) {
                    ow5vqvCr = z4Var2.ow5vqvCr();
                }
            }
            this.wxUZMvaN = z;
        }
        z = false;
        this.wxUZMvaN = z;
    }

    @Override // defpackage.vn
    public final boolean U0LaHZX7() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.vn
    public final boolean i7xS8jrb() {
        return true;
    }
}
