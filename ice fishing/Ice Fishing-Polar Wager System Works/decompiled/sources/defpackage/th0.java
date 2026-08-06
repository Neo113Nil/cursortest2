package defpackage;

/* loaded from: classes.dex */
public final class th0 extends defpackage.ce1 implements defpackage.g00 {
    public int DFo87pBq1E5;
    public int JlrlGoKF;
    public defpackage.wh0 SH1y5HwkJhh;
    public final /* synthetic */ defpackage.wh0 SyNS6RMn;
    public int ez2rX8ReCYw;
    public defpackage.wh0 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th0(defpackage.wh0 wh0Var, defpackage.ej ejVar) {
        super(1, ejVar);
        this.SyNS6RMn = wh0Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        return new defpackage.th0(this.SyNS6RMn, (defpackage.ej) obj).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        r11 = r13;
        r13 = r0;
        r12 = r11;
     */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.wh0 wh0Var;
        java.lang.Object value;
        java.lang.Object riuEU0zW4;
        defpackage.wh0 wh0Var2;
        int i;
        int i2;
        java.lang.Throwable th;
        defpackage.wh0 wh0Var3;
        java.lang.Object value2;
        defpackage.hc1 hc1Var;
        java.lang.Object value3;
        int i3 = this.DFo87pBq1E5;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = this.JlrlGoKF;
                int i5 = this.ez2rX8ReCYw;
                defpackage.wh0 wh0Var4 = this.SH1y5HwkJhh;
                defpackage.wh0 wh0Var5 = this.riuEU0zW4;
                try {
                    defpackage.f70.nBH8hAHy(obj);
                    riuEU0zW4 = obj;
                    wh0Var = wh0Var5;
                    wh0Var2 = wh0Var4;
                    i2 = i5;
                    i = i4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    wh0Var3 = wh0Var5;
                }
            } else {
                if (i3 != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wh0Var3 = this.riuEU0zW4;
                try {
                    defpackage.f70.nBH8hAHy(obj);
                    wh0Var = wh0Var3;
                    hc1Var = wh0Var.F7NU4MC0GW;
                    do {
                        value3 = hc1Var.getValue();
                    } while (!hc1Var.riuEU0zW4(value3, defpackage.rh0.IHQe1A4L2xu((defpackage.rh0) value3, false)));
                    return defpackage.ok1.IHQe1A4L2xu;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }
            defpackage.hc1 hc1Var2 = wh0Var3.F7NU4MC0GW;
            do {
                value2 = hc1Var2.getValue();
            } while (!hc1Var2.riuEU0zW4(value2, defpackage.rh0.IHQe1A4L2xu((defpackage.rh0) value2, false)));
            throw th;
        }
        defpackage.f70.nBH8hAHy(obj);
        wh0Var = this.SyNS6RMn;
        defpackage.hc1 hc1Var3 = wh0Var.F7NU4MC0GW;
        do {
            value = hc1Var3.getValue();
        } while (!hc1Var3.riuEU0zW4(value, defpackage.rh0.IHQe1A4L2xu((defpackage.rh0) value, true)));
        defpackage.oa oaVar = wh0Var.r1MBDhnF;
        this.riuEU0zW4 = wh0Var;
        this.SH1y5HwkJhh = wh0Var;
        this.ez2rX8ReCYw = 0;
        this.JlrlGoKF = 0;
        this.DFo87pBq1E5 = 1;
        defpackage.l10 l10Var = oaVar.IHQe1A4L2xu;
        oaVar.oh6vYeIP.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l10Var.getClass();
        riuEU0zW4 = l10Var.riuEU0zW4(new defpackage.d10(currentTimeMillis, l10Var, null, 2), this);
        if (riuEU0zW4 == vjVar) {
            return vjVar;
        }
        wh0Var2 = wh0Var;
        i = 0;
        i2 = 0;
        java.lang.String str = ((defpackage.uLnPvzwk) riuEU0zW4).oh6vYeIP;
        if (str != null) {
            defpackage.x9 x9Var = wh0Var2.xiZrDbcSW0;
            defpackage.ug0 ug0Var = new defpackage.ug0(str);
            this.riuEU0zW4 = wh0Var;
            this.SH1y5HwkJhh = null;
            this.ez2rX8ReCYw = i2;
            this.JlrlGoKF = i;
            this.DFo87pBq1E5 = 2;
            if (x9Var.IHQe1A4L2xu(this, ug0Var) != vjVar) {
                wh0Var3 = wh0Var;
                wh0Var = wh0Var3;
            }
            return vjVar;
        }
        hc1Var = wh0Var.F7NU4MC0GW;
        do {
            value3 = hc1Var.getValue();
        } while (!hc1Var.riuEU0zW4(value3, defpackage.rh0.IHQe1A4L2xu((defpackage.rh0) value3, false)));
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
