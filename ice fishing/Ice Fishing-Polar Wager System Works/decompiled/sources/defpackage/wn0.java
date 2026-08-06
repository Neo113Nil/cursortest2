package defpackage;

/* loaded from: classes.dex */
public final class wn0 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ java.lang.Object DFo87pBq1E5;
    public /* synthetic */ java.lang.Object JlrlGoKF;
    public int SH1y5HwkJhh;
    public float ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn0(float f, defpackage.s61 s61Var, defpackage.nm0 nm0Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.ez2rX8ReCYw = f;
        this.JlrlGoKF = s61Var;
        this.DFo87pBq1E5 = nm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bd, code lost:
    
        if (r12.EgCjBq0SZwJ(r0, r12.oh6vYeIP.getValue(), r12) == r4) goto L50;
     */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        java.lang.Object IHQe1A4L2xu;
        final float DFo87pBq1E5;
        defpackage.uj ujVar;
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.DFo87pBq1E5;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                defpackage.s61 s61Var = (defpackage.s61) this.JlrlGoKF;
                float f = this.ez2rX8ReCYw;
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    if (f > 0.0f) {
                        this.SH1y5HwkJhh = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                } else if (i2 != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                if (f == 0.0f) {
                    defpackage.nm0 nm0Var = (defpackage.nm0) obj2;
                    this.SH1y5HwkJhh = 2;
                    defpackage.li1 li1Var = s61Var.adDC3e2L;
                    if (li1Var == null || ((defpackage.x70.QoRHpC4k(s61Var.r1MBDhnF.getValue(), nm0Var) && defpackage.x70.QoRHpC4k(s61Var.oh6vYeIP.getValue(), nm0Var)) || (IHQe1A4L2xu = defpackage.hm0.IHQe1A4L2xu(s61Var.ez2rX8ReCYw, new defpackage.m61(s61Var, nm0Var, li1Var, (defpackage.ej) null), this)) != vjVar)) {
                        IHQe1A4L2xu = ok1Var;
                    }
                    if (IHQe1A4L2xu != vjVar) {
                    }
                    break;
                }
                break;
            case 1:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    this.SH1y5HwkJhh = 1;
                    if (defpackage.w3.r1MBDhnF((defpackage.w3) ((defpackage.kc) this.JlrlGoKF).r1MBDhnF, new java.lang.Float(this.ez2rX8ReCYw), (defpackage.c5) obj2, null, this, 12) == vjVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            default:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.uj ujVar2 = (defpackage.uj) this.JlrlGoKF;
                    DFo87pBq1E5 = defpackage.l80.DFo87pBq1E5(ujVar2.AARZUJiTa());
                    ujVar = ujVar2;
                } else if (i4 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    DFo87pBq1E5 = this.ez2rX8ReCYw;
                    ujVar = (defpackage.uj) this.JlrlGoKF;
                    defpackage.f70.nBH8hAHy(obj);
                }
                while (defpackage.h1.v5iciZok(ujVar)) {
                    final defpackage.li1 li1Var2 = (defpackage.li1) obj2;
                    defpackage.g00 g00Var = new defpackage.g00() { // from class: ki1
                        @Override // defpackage.g00
                        public final java.lang.Object AARZUJiTa(java.lang.Object obj3) {
                            long longValue = ((java.lang.Long) obj3).longValue();
                            defpackage.li1 li1Var3 = defpackage.li1.this;
                            boolean AARZUJiTa = li1Var3.AARZUJiTa();
                            defpackage.ot0 ot0Var = li1Var3.AARZUJiTa;
                            if (!AARZUJiTa) {
                                if (ot0Var.AARZUJiTa() == Long.MIN_VALUE) {
                                    ot0Var.EXtogiMhuM(longValue);
                                    ((defpackage.qt0) li1Var3.IHQe1A4L2xu.IHQe1A4L2xu).setValue(java.lang.Boolean.TRUE);
                                }
                                long AARZUJiTa2 = longValue - ot0Var.AARZUJiTa();
                                float f2 = DFo87pBq1E5;
                                if (f2 != 0.0f) {
                                    AARZUJiTa2 = defpackage.ci0.WLpAkxCo(AARZUJiTa2 / f2);
                                }
                                li1Var3.SyNS6RMn(AARZUJiTa2);
                                li1Var3.EXtogiMhuM(AARZUJiTa2, f2 == 0.0f);
                            }
                            return defpackage.ok1.IHQe1A4L2xu;
                        }
                    };
                    this.JlrlGoKF = ujVar;
                    this.ez2rX8ReCYw = DFo87pBq1E5;
                    this.SH1y5HwkJhh = 1;
                    defpackage.lj ljVar = this.xiZrDbcSW0;
                    ljVar.getClass();
                    if (defpackage.x80.NHJTzaLwkd(ljVar).IHQe1A4L2xu(g00Var, this) == vjVar) {
                        break;
                    }
                }
                break;
        }
        return vjVar;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.uj ujVar = (defpackage.uj) obj;
        defpackage.ej ejVar = (defpackage.ej) obj2;
        switch (i) {
        }
        return ((defpackage.wn0) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.lang.Object obj2 = this.DFo87pBq1E5;
        switch (i) {
            case 0:
                return new defpackage.wn0(this.ez2rX8ReCYw, (defpackage.s61) this.JlrlGoKF, (defpackage.nm0) obj2, ejVar);
            case 1:
                return new defpackage.wn0((defpackage.kc) this.JlrlGoKF, this.ez2rX8ReCYw, (defpackage.c5) obj2, ejVar);
            default:
                defpackage.wn0 wn0Var = new defpackage.wn0((defpackage.li1) obj2, ejVar);
                wn0Var.JlrlGoKF = obj;
                return wn0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn0(defpackage.kc kcVar, float f, defpackage.c5 c5Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.JlrlGoKF = kcVar;
        this.ez2rX8ReCYw = f;
        this.DFo87pBq1E5 = c5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn0(defpackage.li1 li1Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.DFo87pBq1E5 = li1Var;
    }
}
