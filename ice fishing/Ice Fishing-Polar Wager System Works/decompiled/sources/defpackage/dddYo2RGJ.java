package defpackage;

/* loaded from: classes.dex */
public final class dddYo2RGJ extends defpackage.ce1 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object JlrlGoKF;
    public int SH1y5HwkJhh;
    public java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dddYo2RGJ(java.lang.Object obj, java.lang.Object obj2, defpackage.ej ejVar, int i) {
        super(1, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = obj;
        this.JlrlGoKF = obj2;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.JlrlGoKF;
        defpackage.ej ejVar = (defpackage.ej) obj;
        switch (i) {
            case 0:
                return new defpackage.dddYo2RGJ((defpackage.b) this.ez2rX8ReCYw, (defpackage.xfLc8P5OcmgB) obj2, ejVar, 0).SyNS6RMn(ok1Var);
            case 1:
                return new defpackage.dddYo2RGJ((defpackage.b) this.ez2rX8ReCYw, (defpackage.o01) obj2, ejVar, 1).SyNS6RMn(ok1Var);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.dddYo2RGJ((defpackage.bm) obj2, ejVar).SyNS6RMn(ok1Var);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.dddYo2RGJ((defpackage.q21) this.ez2rX8ReCYw, (defpackage.g00) obj2, ejVar, 3).SyNS6RMn(ok1Var);
            default:
                return new defpackage.dddYo2RGJ((defpackage.wh1) this.ez2rX8ReCYw, (defpackage.rh1) obj2, ejVar, 4).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        java.lang.Throwable th;
        defpackage.dc1 dc1Var;
        int i = this.riuEU0zW4;
        int i2 = 2;
        java.lang.Object obj2 = this.JlrlGoKF;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        int i3 = 1;
        defpackage.ej ejVar = null;
        switch (i) {
            case 0:
                int i4 = this.SH1y5HwkJhh;
                if (i4 != 0) {
                    if (i4 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return obj;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.vc vcVar = ((defpackage.b) this.ez2rX8ReCYw).oh6vYeIP;
                java.lang.String str = ((defpackage.qwkVicYTIcrn) ((defpackage.xfLc8P5OcmgB) obj2)).IHQe1A4L2xu;
                this.SH1y5HwkJhh = 1;
                defpackage.l10 l10Var = vcVar.IHQe1A4L2xu;
                l10Var.getClass();
                java.lang.Object riuEU0zW4 = l10Var.riuEU0zW4(new defpackage.e10(str, l10Var, ejVar, 0), this);
                return riuEU0zW4 == vjVar ? vjVar : riuEU0zW4;
            case 1:
                int i5 = this.SH1y5HwkJhh;
                if (i5 != 0) {
                    if (i5 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return obj;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.vc vcVar2 = ((defpackage.b) this.ez2rX8ReCYw).r1MBDhnF;
                this.SH1y5HwkJhh = 1;
                defpackage.l10 l10Var2 = vcVar2.IHQe1A4L2xu;
                l10Var2.getClass();
                java.lang.Object riuEU0zW42 = l10Var2.riuEU0zW4(new defpackage.io((defpackage.o01) obj2, l10Var2, ejVar, i3), this);
                return riuEU0zW42 == vjVar ? vjVar : riuEU0zW42;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bm bmVar = (defpackage.bm) obj2;
                int i6 = this.SH1y5HwkJhh;
                try {
                } catch (java.lang.Throwable th2) {
                    defpackage.x91 EXtogiMhuM = bmVar.EXtogiMhuM();
                    this.ez2rX8ReCYw = th2;
                    this.SH1y5HwkJhh = 2;
                    java.lang.Integer IHQe1A4L2xu = EXtogiMhuM.IHQe1A4L2xu();
                    if (IHQe1A4L2xu == vjVar) {
                        return vjVar;
                    }
                    obj = IHQe1A4L2xu;
                    th = th2;
                }
                if (i6 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    this.SH1y5HwkJhh = 1;
                    obj = defpackage.bm.AARZUJiTa(bmVar, true, this);
                    if (obj == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (java.lang.Throwable) this.ez2rX8ReCYw;
                        defpackage.f70.nBH8hAHy(obj);
                        dc1Var = new defpackage.uy0(th, ((java.lang.Number) obj).intValue());
                        return new defpackage.et0(dc1Var, java.lang.Boolean.TRUE);
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                dc1Var = (defpackage.dc1) obj;
                return new defpackage.et0(dc1Var, java.lang.Boolean.TRUE);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.q21 q21Var = (defpackage.q21) this.ez2rX8ReCYw;
                int i7 = this.SH1y5HwkJhh;
                try {
                    if (i7 == 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        q21Var.IHQe1A4L2xu();
                        q21Var.IHQe1A4L2xu();
                        defpackage.mz QQUzIjv3iOC5 = q21Var.xiZrDbcSW0().QQUzIjv3iOC5();
                        if (!QQUzIjv3iOC5.SyNS6RMn()) {
                            defpackage.ExFEDwBK exFEDwBK = new defpackage.ExFEDwBK(q21Var.adDC3e2L(), ejVar, 5);
                            java.lang.Thread.interrupted();
                            defpackage.fm.Uv8CGu3G(defpackage.lt.adDC3e2L, new defpackage.rk(exFEDwBK, ejVar, i2));
                        }
                        if (QQUzIjv3iOC5.adDC3e2L.isWriteAheadLoggingEnabled()) {
                            QQUzIjv3iOC5.F7NU4MC0GW();
                        } else {
                            QQUzIjv3iOC5.oh6vYeIP();
                        }
                        this.SH1y5HwkJhh = 1;
                        obj = ((defpackage.g00) obj2).AARZUJiTa(this);
                        if (obj == vjVar) {
                            return vjVar;
                        }
                    } else {
                        if (i7 != 1) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    q21Var.xiZrDbcSW0().QQUzIjv3iOC5().riuEU0zW4();
                    return obj;
                } finally {
                    q21Var.xiZrDbcSW0().QQUzIjv3iOC5().AARZUJiTa();
                    if (!q21Var.SH1y5HwkJhh()) {
                        defpackage.k80 adDC3e2L = q21Var.adDC3e2L();
                        adDC3e2L.oh6vYeIP.adDC3e2L(adDC3e2L.adDC3e2L, adDC3e2L.xiZrDbcSW0);
                    }
                }
            default:
                int i8 = this.SH1y5HwkJhh;
                if (i8 != 0) {
                    if (i8 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return obj;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.vc vcVar3 = ((defpackage.wh1) this.ez2rX8ReCYw).r1MBDhnF;
                com.corsair.ledger.domain.model.Rarity rarity = ((defpackage.qh1) ((defpackage.rh1) obj2)).IHQe1A4L2xu;
                this.SH1y5HwkJhh = 1;
                defpackage.l10 l10Var3 = vcVar3.IHQe1A4L2xu;
                l10Var3.getClass();
                java.lang.Object riuEU0zW43 = l10Var3.riuEU0zW4(new defpackage.io(rarity, l10Var3, ejVar, i2), this);
                return riuEU0zW43 == vjVar ? vjVar : riuEU0zW43;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dddYo2RGJ(defpackage.bm bmVar, defpackage.ej ejVar) {
        super(1, ejVar);
        this.riuEU0zW4 = 2;
        this.JlrlGoKF = bmVar;
    }
}
