package defpackage;

/* loaded from: classes.dex */
public final class mb0 extends defpackage.lj0 implements defpackage.da0 {
    public static final defpackage.kb0 V7bD7b8KA = new defpackage.kb0();
    public defpackage.lc0 EgCjBq0SZwJ;
    public defpackage.f9 fnWB2E7cs;
    public defpackage.ks0 kNAkVymC;

    public final boolean H6IrRhrpWoH(int i) {
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
            int ordinal = defpackage.w70.D2vUnMij(this).nBH8hAHy.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            defpackage.db.F7NU4MC0GW();
            return false;
        }
        if (i != 4) {
            defpackage.db.AARZUJiTa("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = defpackage.w70.D2vUnMij(this).nBH8hAHy.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        defpackage.db.F7NU4MC0GW();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.kNAkVymC == defpackage.ks0.adDC3e2L) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.kNAkVymC == defpackage.ks0.xiZrDbcSW0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean UVjEelCZ(defpackage.ib0 ib0Var, int i) {
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    defpackage.db.AARZUJiTa("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return !H6IrRhrpWoH(i) ? ib0Var.IHQe1A4L2xu <= 0 : ib0Var.oh6vYeIP >= this.EgCjBq0SZwJ.IHQe1A4L2xu.AARZUJiTa().SyNS6RMn - 1;
        }
    }

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(j);
        return ki0Var.EoOhNTTfIN7K(xiZrDbcSW0.adDC3e2L, xiZrDbcSW0.xiZrDbcSW0, defpackage.ot.adDC3e2L, new defpackage.v6(xiZrDbcSW0, 2));
    }
}
