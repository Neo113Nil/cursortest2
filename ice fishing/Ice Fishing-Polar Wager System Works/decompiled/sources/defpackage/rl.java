package defpackage;

/* loaded from: classes.dex */
public final class rl extends defpackage.ce1 implements defpackage.g00 {
    public int SH1y5HwkJhh;
    public final /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl(java.lang.Object obj, defpackage.ej ejVar, int i) {
        super(1, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = obj;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.ez2rX8ReCYw;
        defpackage.ej ejVar = (defpackage.ej) obj;
        switch (i) {
            case 0:
                return new defpackage.rl((defpackage.yl) obj2, ejVar, 0).SyNS6RMn(ok1Var);
            case 1:
                return new defpackage.rl((defpackage.l10) obj2, ejVar, 1).SyNS6RMn(ok1Var);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.rl((defpackage.s30) obj2, ejVar, 2).SyNS6RMn(ok1Var);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.rl((defpackage.wi0) obj2, ejVar, 3).SyNS6RMn(ok1Var);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.rl((defpackage.z81) obj2, ejVar, 4).SyNS6RMn(ok1Var);
            default:
                return new defpackage.rl((defpackage.fm1) obj2, ejVar, 5).SyNS6RMn(ok1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x019d, code lost:
    
        if (r4.IHQe1A4L2xu(r20, r6) == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0257, code lost:
    
        if (r2 == r5) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r4.IHQe1A4L2xu(r20, r6) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        if (r2.IHQe1A4L2xu(r20, r4) == r5) goto L61;
     */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        java.lang.Object QPwENk36pDC;
        java.lang.Object value;
        boolean z;
        java.lang.String str;
        java.util.List list;
        int i;
        int i2;
        int i3;
        int i4;
        java.lang.Object value2;
        java.lang.Object value3;
        java.lang.Object value4;
        java.lang.Object value5;
        java.lang.Object value6;
        java.lang.Object value7;
        java.lang.Object value8;
        java.lang.Object value9;
        java.lang.Object value10;
        java.lang.Object value11;
        java.lang.Object value12;
        int i5 = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        java.lang.Object obj2 = this.ez2rX8ReCYw;
        int i6 = 2;
        int i7 = 1;
        defpackage.ej ejVar = null;
        switch (i5) {
            case 0:
                int i8 = this.SH1y5HwkJhh;
                if (i8 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    this.SH1y5HwkJhh = 1;
                    java.lang.Object AARZUJiTa = ((defpackage.yl) obj2).AARZUJiTa(this);
                    return AARZUJiTa == vjVar ? vjVar : AARZUJiTa;
                }
                if (i8 == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                    return obj;
                }
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                defpackage.l10 l10Var = (defpackage.l10) obj2;
                defpackage.a10 a10Var = l10Var.oh6vYeIP;
                int i9 = this.SH1y5HwkJhh;
                if (i9 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    this.SH1y5HwkJhh = 1;
                    QPwENk36pDC = defpackage.s21.QPwENk36pDC(this, new defpackage.JX5fKip1C6(13), a10Var.IHQe1A4L2xu, true, false);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            defpackage.f70.nBH8hAHy(obj);
                            return ok1Var;
                        }
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                    QPwENk36pDC = obj;
                }
                if (QPwENk36pDC != null) {
                    return ok1Var;
                }
                l10Var.r1MBDhnF.getClass();
                com.corsair.ledger.data.local.entity.PlayerEntity riuEU0zW4 = defpackage.a70.riuEU0zW4(java.lang.System.currentTimeMillis());
                this.SH1y5HwkJhh = 2;
                if (a10Var.IHQe1A4L2xu(riuEU0zW4, this) != vjVar) {
                    return ok1Var;
                }
                return vjVar;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.s30 s30Var = (defpackage.s30) obj2;
                int i10 = this.SH1y5HwkJhh;
                if (i10 != 0) {
                    if (i10 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.hc1 hc1Var = s30Var.r1MBDhnF;
                do {
                    value = hc1Var.getValue();
                    defpackage.r30 r30Var = (defpackage.r30) value;
                    z = r30Var.IHQe1A4L2xu;
                    str = r30Var.oh6vYeIP;
                    list = r30Var.r1MBDhnF;
                    i = r30Var.F7NU4MC0GW;
                    i2 = r30Var.adDC3e2L;
                    i3 = r30Var.xiZrDbcSW0;
                    i4 = r30Var.AARZUJiTa;
                    list.getClass();
                } while (!hc1Var.riuEU0zW4(value, new defpackage.r30(z, str, list, i, i2, i3, i4, true)));
                defpackage.vc vcVar = s30Var.oh6vYeIP;
                this.SH1y5HwkJhh = 1;
                defpackage.l10 l10Var2 = vcVar.IHQe1A4L2xu;
                l10Var2.getClass();
                java.lang.Object riuEU0zW42 = l10Var2.riuEU0zW4(new defpackage.ll(i6, ejVar, i7), this);
                if (riuEU0zW42 != vjVar) {
                    riuEU0zW42 = ok1Var;
                }
                if (riuEU0zW42 != vjVar) {
                    riuEU0zW42 = ok1Var;
                }
                return riuEU0zW42 == vjVar ? vjVar : ok1Var;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.wi0 wi0Var = (defpackage.wi0) obj2;
                int i11 = this.SH1y5HwkJhh;
                try {
                    if (i11 == 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        defpackage.hc1 hc1Var2 = wi0Var.r1MBDhnF;
                        do {
                            value3 = hc1Var2.getValue();
                        } while (!hc1Var2.riuEU0zW4(value3, defpackage.vi0.IHQe1A4L2xu((defpackage.vi0) value3, false, false, true, 3)));
                        defpackage.oa oaVar = wi0Var.oh6vYeIP;
                        this.SH1y5HwkJhh = 1;
                        if (oaVar.oh6vYeIP(this) == vjVar) {
                            return vjVar;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.f70.nBH8hAHy(obj);
                            defpackage.hc1 hc1Var3 = wi0Var.r1MBDhnF;
                            do {
                                value5 = hc1Var3.getValue();
                            } while (!hc1Var3.riuEU0zW4(value5, defpackage.vi0.IHQe1A4L2xu((defpackage.vi0) value5, false, false, false, 3)));
                            return ok1Var;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    defpackage.hc1 hc1Var4 = wi0Var.r1MBDhnF;
                    do {
                        value4 = hc1Var4.getValue();
                    } while (!hc1Var4.riuEU0zW4(value4, defpackage.vi0.IHQe1A4L2xu((defpackage.vi0) value4, false, false, false, 5)));
                    defpackage.x9 x9Var = wi0Var.adDC3e2L;
                    defpackage.li0 li0Var = new defpackage.li0("map");
                    this.SH1y5HwkJhh = 2;
                    break;
                } catch (java.lang.Throwable th) {
                    defpackage.hc1 hc1Var5 = wi0Var.r1MBDhnF;
                    do {
                        value2 = hc1Var5.getValue();
                    } while (!hc1Var5.riuEU0zW4(value2, defpackage.vi0.IHQe1A4L2xu((defpackage.vi0) value2, false, false, false, 3)));
                    throw th;
                }
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.z81 z81Var = (defpackage.z81) obj2;
                int i12 = this.SH1y5HwkJhh;
                try {
                    if (i12 == 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        defpackage.hc1 hc1Var6 = z81Var.F7NU4MC0GW;
                        do {
                            value7 = hc1Var6.getValue();
                        } while (!hc1Var6.riuEU0zW4(value7, defpackage.w81.IHQe1A4L2xu((defpackage.w81) value7, false, false, null, false, true, 15)));
                        defpackage.oa oaVar2 = z81Var.r1MBDhnF;
                        this.SH1y5HwkJhh = 1;
                        if (oaVar2.oh6vYeIP(this) == vjVar) {
                            return vjVar;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.f70.nBH8hAHy(obj);
                            defpackage.hc1 hc1Var7 = z81Var.F7NU4MC0GW;
                            do {
                                value9 = hc1Var7.getValue();
                            } while (!hc1Var7.riuEU0zW4(value9, defpackage.w81.IHQe1A4L2xu((defpackage.w81) value9, false, false, null, false, false, 15)));
                            return ok1Var;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    defpackage.hc1 hc1Var8 = z81Var.F7NU4MC0GW;
                    do {
                        value8 = hc1Var8.getValue();
                    } while (!hc1Var8.riuEU0zW4(value8, defpackage.w81.IHQe1A4L2xu((defpackage.w81) value8, false, false, null, false, false, 23)));
                    defpackage.x9 x9Var2 = z81Var.xiZrDbcSW0;
                    defpackage.f81 f81Var = new defpackage.f81();
                    this.SH1y5HwkJhh = 2;
                    break;
                } catch (java.lang.Throwable th2) {
                    defpackage.hc1 hc1Var9 = z81Var.F7NU4MC0GW;
                    do {
                        value6 = hc1Var9.getValue();
                    } while (!hc1Var9.riuEU0zW4(value6, defpackage.w81.IHQe1A4L2xu((defpackage.w81) value6, false, false, null, false, false, 15)));
                    throw th2;
                }
            default:
                defpackage.fm1 fm1Var = (defpackage.fm1) obj2;
                int i13 = this.SH1y5HwkJhh;
                try {
                    if (i13 == 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        defpackage.hc1 hc1Var10 = fm1Var.r1MBDhnF;
                        do {
                            value11 = hc1Var10.getValue();
                        } while (!hc1Var10.riuEU0zW4(value11, defpackage.em1.IHQe1A4L2xu((defpackage.em1) value11, true)));
                        defpackage.vc vcVar2 = fm1Var.oh6vYeIP;
                        this.SH1y5HwkJhh = 1;
                        defpackage.l10 l10Var3 = vcVar2.IHQe1A4L2xu;
                        l10Var3.getClass();
                        java.lang.Object riuEU0zW43 = l10Var3.riuEU0zW4(new defpackage.ll(i6, ejVar, i6), this);
                        if (riuEU0zW43 != vjVar) {
                            riuEU0zW43 = ok1Var;
                        }
                        if (riuEU0zW43 != vjVar) {
                            riuEU0zW43 = ok1Var;
                        }
                        if (riuEU0zW43 == vjVar) {
                            return vjVar;
                        }
                    } else {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.f70.nBH8hAHy(obj);
                            defpackage.hc1 hc1Var11 = fm1Var.r1MBDhnF;
                            do {
                                value12 = hc1Var11.getValue();
                            } while (!hc1Var11.riuEU0zW4(value12, defpackage.em1.IHQe1A4L2xu((defpackage.em1) value12, false)));
                            return ok1Var;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    defpackage.x9 x9Var3 = fm1Var.adDC3e2L;
                    defpackage.am1 am1Var = defpackage.am1.IHQe1A4L2xu;
                    this.SH1y5HwkJhh = 2;
                    break;
                } catch (java.lang.Throwable th3) {
                    defpackage.hc1 hc1Var12 = fm1Var.r1MBDhnF;
                    do {
                        value10 = hc1Var12.getValue();
                    } while (!hc1Var12.riuEU0zW4(value10, defpackage.em1.IHQe1A4L2xu((defpackage.em1) value10, false)));
                    throw th3;
                }
        }
    }
}
