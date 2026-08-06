package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ie0 extends defpackage.ul0 implements defpackage.ad0 {
    public static final defpackage.ge0 maCixPsq4ml2 = new defpackage.ge0();
    public defpackage.gf0 BHfvd2J71qpO;
    public defpackage.gb ZVVdXbWmyCSK;
    public defpackage.fv0 w7APNrr0aGRc;

    @Override // defpackage.ad0
    public final defpackage.wk0 WDYagTQQm9ns(defpackage.xk0 xk0Var, defpackage.qk0 qk0Var, long j) {
        defpackage.ry0 WDYagTQQm9ns = qk0Var.WDYagTQQm9ns(j);
        return xk0Var.hwoZxnIesQBZ(WDYagTQQm9ns.WDYagTQQm9ns, WDYagTQQm9ns.oh71FJcDz6S2, defpackage.bv.WDYagTQQm9ns, new defpackage.a8(WDYagTQQm9ns, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.w7APNrr0aGRc == defpackage.fv0.WDYagTQQm9ns) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.w7APNrr0aGRc == defpackage.fv0.oh71FJcDz6S2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean YZh1E3mnTFwf(defpackage.ee0 ee0Var, int i) {
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    defpackage.h7.P05cfTpS5W5L("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return !xbkEJUK1coRZ(i) ? ee0Var.ZpBGe2uQfcn8 <= 0 : ee0Var.giKS3J6vZuNy >= this.BHfvd2J71qpO.ZpBGe2uQfcn8.QiMR8OkAhezm().gUjdnLbkVAaA - 1;
        }
    }

    public final boolean xbkEJUK1coRZ(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = defpackage.la0.UmgHb6n58gfG(this).UmgHb6n58gfG.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            defpackage.h7.T1fB7bDYiVJQ();
            return false;
        }
        if (i != 4) {
            defpackage.h7.P05cfTpS5W5L("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = defpackage.la0.UmgHb6n58gfG(this).UmgHb6n58gfG.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        defpackage.h7.T1fB7bDYiVJQ();
        return false;
    }
}
