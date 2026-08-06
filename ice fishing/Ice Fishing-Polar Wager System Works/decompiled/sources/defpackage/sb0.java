package defpackage;

/* loaded from: classes.dex */
public final class sb0 {
    public final defpackage.r31 IHQe1A4L2xu;
    public final defpackage.wb0 oh6vYeIP;
    public final defpackage.nl0 r1MBDhnF;

    public sb0(defpackage.r31 r31Var, defpackage.wb0 wb0Var) {
        this.IHQe1A4L2xu = r31Var;
        this.oh6vYeIP = wb0Var;
        long[] jArr = defpackage.z41.IHQe1A4L2xu;
        this.r1MBDhnF = new defpackage.nl0();
    }

    public final defpackage.k00 IHQe1A4L2xu(int i, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.nl0 nl0Var = this.r1MBDhnF;
        defpackage.rb0 rb0Var = (defpackage.rb0) nl0Var.AARZUJiTa(obj);
        int i2 = 7;
        if (rb0Var != null && rb0Var.r1MBDhnF == i && defpackage.x70.QoRHpC4k(rb0Var.oh6vYeIP, obj2)) {
            defpackage.sf sfVar = rb0Var.F7NU4MC0GW;
            if (sfVar != null) {
                return sfVar;
            }
            defpackage.sf sfVar2 = new defpackage.sf(818252804, new defpackage.oKqPTyA2(i2, rb0Var.adDC3e2L, rb0Var), true);
            rb0Var.F7NU4MC0GW = sfVar2;
            return sfVar2;
        }
        defpackage.rb0 rb0Var2 = new defpackage.rb0(this, i, obj, obj2);
        nl0Var.DFo87pBq1E5(obj, rb0Var2);
        defpackage.sf sfVar3 = rb0Var2.F7NU4MC0GW;
        if (sfVar3 != null) {
            return sfVar3;
        }
        defpackage.sf sfVar4 = new defpackage.sf(818252804, new defpackage.oKqPTyA2(i2, this, rb0Var2), true);
        rb0Var2.F7NU4MC0GW = sfVar4;
        return sfVar4;
    }

    public final java.lang.Object oh6vYeIP(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        defpackage.rb0 rb0Var = (defpackage.rb0) this.r1MBDhnF.AARZUJiTa(obj);
        if (rb0Var != null) {
            return rb0Var.oh6vYeIP;
        }
        defpackage.oc0 oc0Var = (defpackage.oc0) this.oh6vYeIP.IHQe1A4L2xu();
        int r1MBDhnF = oc0Var.F7NU4MC0GW.r1MBDhnF(obj);
        if (r1MBDhnF != -1) {
            return oc0Var.oh6vYeIP(r1MBDhnF);
        }
        return null;
    }
}
