package defpackage;

/* loaded from: classes.dex */
public final class qp extends defpackage.ce1 implements defpackage.g00 {
    public final /* synthetic */ int JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.sp ez2rX8ReCYw;
    public defpackage.yo riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(defpackage.sp spVar, int i, defpackage.ej ejVar) {
        super(1, ejVar);
        this.ez2rX8ReCYw = spVar;
        this.JlrlGoKF = i;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        return new defpackage.qp(this.ez2rX8ReCYw, this.JlrlGoKF, (defpackage.ej) obj).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r0.IHQe1A4L2xu(r11, r4) == r8) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0015, B:19:0x0025, B:20:0x0094, B:22:0x009a, B:25:0x002a, B:26:0x005b, B:33:0x0074, B:35:0x007c, B:37:0x0080, B:41:0x0086, B:48:0x0044), top: B:2:0x000d }] */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        java.lang.Object value;
        java.lang.Object value2;
        defpackage.yo yoVar;
        java.lang.Object value3;
        java.lang.String adDC3e2L;
        defpackage.hc1 hc1Var;
        java.lang.Object value4;
        int i = this.SH1y5HwkJhh;
        boolean z = true;
        defpackage.sp spVar = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        try {
            if (i == 0) {
                defpackage.f70.nBH8hAHy(obj);
                defpackage.hc1 hc1Var2 = spVar.r1MBDhnF;
                do {
                    value2 = hc1Var2.getValue();
                } while (!hc1Var2.riuEU0zW4(value2, defpackage.pp.IHQe1A4L2xu((defpackage.pp) value2, true, 255)));
                defpackage.vc vcVar = spVar.oh6vYeIP;
                int i2 = this.JlrlGoKF;
                this.SH1y5HwkJhh = 1;
                defpackage.l10 l10Var = vcVar.IHQe1A4L2xu;
                l10Var.getClass();
                obj = l10Var.riuEU0zW4(new defpackage.adDC3e2L(i2, (defpackage.ej) null, l10Var), this);
                if (obj == vjVar) {
                    return vjVar;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                        hc1Var = spVar.r1MBDhnF;
                        do {
                            value4 = hc1Var.getValue();
                        } while (!hc1Var.riuEU0zW4(value4, defpackage.pp.IHQe1A4L2xu((defpackage.pp) value4, false, 255)));
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                    yoVar = this.riuEU0zW4;
                    defpackage.f70.nBH8hAHy(obj);
                    adDC3e2L = defpackage.sp.adDC3e2L(spVar, yoVar);
                    if (adDC3e2L != null) {
                        defpackage.x9 x9Var = spVar.adDC3e2L;
                        defpackage.cp cpVar = new defpackage.cp(adDC3e2L);
                        this.riuEU0zW4 = null;
                        this.SH1y5HwkJhh = 3;
                    }
                    hc1Var = spVar.r1MBDhnF;
                    do {
                        value4 = hc1Var.getValue();
                    } while (!hc1Var.riuEU0zW4(value4, defpackage.pp.IHQe1A4L2xu((defpackage.pp) value4, false, 255)));
                    return defpackage.ok1.IHQe1A4L2xu;
                }
                defpackage.f70.nBH8hAHy(obj);
            }
            yoVar = (defpackage.yo) obj;
            if (yoVar == null) {
                defpackage.hc1 hc1Var3 = spVar.r1MBDhnF;
                do {
                    value3 = hc1Var3.getValue();
                } while (!hc1Var3.riuEU0zW4(value3, defpackage.pp.IHQe1A4L2xu((defpackage.pp) value3, false, 255)));
                return defpackage.ok1.IHQe1A4L2xu;
            }
            defpackage.x9 x9Var2 = spVar.adDC3e2L;
            if (!(yoVar instanceof defpackage.wo) && !(yoVar instanceof defpackage.uo) && !(yoVar instanceof defpackage.xo)) {
                z = false;
            }
            defpackage.bp bpVar = new defpackage.bp(z);
            this.riuEU0zW4 = yoVar;
            this.SH1y5HwkJhh = 2;
            if (x9Var2.IHQe1A4L2xu(this, bpVar) == vjVar) {
                return vjVar;
            }
            adDC3e2L = defpackage.sp.adDC3e2L(spVar, yoVar);
            if (adDC3e2L != null) {
            }
            hc1Var = spVar.r1MBDhnF;
            do {
                value4 = hc1Var.getValue();
            } while (!hc1Var.riuEU0zW4(value4, defpackage.pp.IHQe1A4L2xu((defpackage.pp) value4, false, 255)));
            return defpackage.ok1.IHQe1A4L2xu;
        } catch (java.lang.Throwable th) {
            defpackage.hc1 hc1Var4 = spVar.r1MBDhnF;
            do {
                value = hc1Var4.getValue();
            } while (!hc1Var4.riuEU0zW4(value, defpackage.pp.IHQe1A4L2xu((defpackage.pp) value, false, 255)));
            throw th;
        }
    }
}
