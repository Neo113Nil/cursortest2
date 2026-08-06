package defpackage;

/* loaded from: classes.dex */
public abstract class qs {
    public static final defpackage.lj1 IHQe1A4L2xu;
    public static final defpackage.lj1 oh6vYeIP;
    public static final defpackage.lj1 r1MBDhnF;

    static {
        defpackage.mk mkVar = new defpackage.mk(0.4f, 0.0f, 0.6f, 1.0f);
        IHQe1A4L2xu = new defpackage.lj1(120, 0, defpackage.es.IHQe1A4L2xu);
        oh6vYeIP = new defpackage.lj1(150, 0, mkVar);
        r1MBDhnF = new defpackage.lj1(120, 0, mkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if ((r10 instanceof defpackage.tx) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if ((r9 instanceof defpackage.tx) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object IHQe1A4L2xu(defpackage.w3 w3Var, float f, defpackage.l70 l70Var, defpackage.l70 l70Var2, defpackage.ce1 ce1Var) {
        defpackage.lj1 lj1Var;
        defpackage.lj1 lj1Var2 = null;
        if (l70Var2 != null) {
            boolean z = l70Var2 instanceof defpackage.px0;
            lj1Var = IHQe1A4L2xu;
            if (!z) {
                if (!(l70Var2 instanceof defpackage.qr)) {
                    if (!(l70Var2 instanceof defpackage.l40)) {
                    }
                }
            }
            lj1Var2 = lj1Var;
        } else if (l70Var != null) {
            boolean z2 = l70Var instanceof defpackage.px0;
            lj1Var = oh6vYeIP;
            if (!z2 && !(l70Var instanceof defpackage.qr)) {
                if (l70Var instanceof defpackage.l40) {
                    lj1Var2 = r1MBDhnF;
                }
            }
            lj1Var2 = lj1Var;
        }
        defpackage.lj1 lj1Var3 = lj1Var2;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (lj1Var3 != null) {
            java.lang.Object r1MBDhnF2 = defpackage.w3.r1MBDhnF(w3Var, new defpackage.uq(f), lj1Var3, null, ce1Var, 12);
            if (r1MBDhnF2 == vjVar) {
                return r1MBDhnF2;
            }
        } else {
            java.lang.Object adDC3e2L = w3Var.adDC3e2L(new defpackage.uq(f), ce1Var);
            if (adDC3e2L == vjVar) {
                return adDC3e2L;
            }
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
