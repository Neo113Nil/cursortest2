package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i6 implements yg {
    public final /* synthetic */ int MdtA4re8;
    public final /* synthetic */ z2 NCTxEWno;

    public i6(z2 z2Var, int i) {
        this.NCTxEWno = z2Var;
        this.MdtA4re8 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        if (r7.NCTxEWno.qoPGr6Ce(r0, r9) == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.yg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        h6 h6Var;
        int i;
        Object obj2;
        ad adVar;
        Object obj3;
        if (g9Var instanceof h6) {
            h6Var = (h6) g9Var;
            int i2 = h6Var.b2ZJblxo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6Var.b2ZJblxo = i2 - Integer.MIN_VALUE;
                Object obj4 = h6Var.VgvYg0wo;
                i = h6Var.b2ZJblxo;
                obj2 = u9.NCTxEWno;
                Object obj5 = xe0.qoPGr6Ce;
                if (i != 0) {
                    fn.SgZGMMPL(obj4);
                    tm tmVar = new tm(this.MdtA4re8, obj);
                    h6Var.b2ZJblxo = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            fn.SgZGMMPL(obj4);
                            return obj5;
                        }
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj4);
                }
                h6Var.b2ZJblxo = 2;
                l9 l9Var = h6Var.MdtA4re8;
                l9Var.getClass();
                le0.lDXGDhIF(l9Var);
                g9 SgZGMMPL = w30.SgZGMMPL(h6Var);
                adVar = SgZGMMPL instanceof ad ? (ad) SgZGMMPL : null;
                if (adVar != null) {
                    obj3 = obj5;
                } else {
                    n9 n9Var = adVar.VgvYg0wo;
                    if (n9Var.gjV1z5T1(l9Var)) {
                        adVar.b2ZJblxo = obj5;
                        adVar.wxUZMvaN = 1;
                        n9Var.FySoLYna(l9Var, adVar);
                    } else {
                        l9 eVhOlqcC = l9Var.eVhOlqcC(new dj0(dj0.MdtA4re8));
                        adVar.b2ZJblxo = obj5;
                        adVar.wxUZMvaN = 1;
                        n9Var.FySoLYna(eVhOlqcC, adVar);
                    }
                    obj3 = obj2;
                }
                if (obj3 != obj2) {
                    obj3 = obj5;
                }
                return obj3 != obj2 ? obj2 : obj5;
            }
        }
        h6Var = new h6(this, g9Var);
        Object obj42 = h6Var.VgvYg0wo;
        i = h6Var.b2ZJblxo;
        obj2 = u9.NCTxEWno;
        Object obj52 = xe0.qoPGr6Ce;
        if (i != 0) {
        }
        h6Var.b2ZJblxo = 2;
        l9 l9Var2 = h6Var.MdtA4re8;
        l9Var2.getClass();
        le0.lDXGDhIF(l9Var2);
        g9 SgZGMMPL2 = w30.SgZGMMPL(h6Var);
        if (SgZGMMPL2 instanceof ad) {
        }
        if (adVar != null) {
        }
        if (obj3 != obj2) {
        }
        if (obj3 != obj2) {
        }
    }
}
