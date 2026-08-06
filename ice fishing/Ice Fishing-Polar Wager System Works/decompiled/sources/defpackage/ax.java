package defpackage;

/* loaded from: classes.dex */
public final class ax implements defpackage.iw {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ ax(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a6  */
    @Override // defpackage.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EXtogiMhuM(java.lang.Object obj, defpackage.ej ejVar) {
        defpackage.zw zwVar;
        java.lang.Object obj2;
        int i;
        defpackage.dx dxVar;
        java.lang.Object obj3;
        int i2;
        int i3 = this.adDC3e2L;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        java.lang.Object obj4 = this.AARZUJiTa;
        defpackage.ej ejVar2 = null;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj5 = this.xiZrDbcSW0;
        switch (i3) {
            case 0:
                if (ejVar instanceof defpackage.zw) {
                    zwVar = (defpackage.zw) ejVar;
                    int i4 = zwVar.SH1y5HwkJhh;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        zwVar.SH1y5HwkJhh = i4 - Integer.MIN_VALUE;
                        obj2 = zwVar.riuEU0zW4;
                        i = zwVar.SH1y5HwkJhh;
                        if (i != 0) {
                            defpackage.f70.nBH8hAHy(obj2);
                            zwVar.EXtogiMhuM = this;
                            zwVar.JlrlGoKF = obj;
                            zwVar.SH1y5HwkJhh = 1;
                            obj2 = ((defpackage.ll) obj5).adDC3e2L(obj, zwVar);
                            if (obj2 == vjVar) {
                                return vjVar;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                this = zwVar.EXtogiMhuM;
                                defpackage.f70.nBH8hAHy(obj2);
                                r5 = true;
                                if (r5) {
                                    return ok1Var;
                                }
                                throw new defpackage.IHQe1A4L2xu(this);
                            }
                            obj = zwVar.JlrlGoKF;
                            this = zwVar.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj2);
                        }
                        if (((java.lang.Boolean) obj2).booleanValue()) {
                            defpackage.iw iwVar = (defpackage.iw) this.AARZUJiTa;
                            zwVar.EXtogiMhuM = this;
                            zwVar.JlrlGoKF = null;
                            zwVar.SH1y5HwkJhh = 2;
                            if (iwVar.EXtogiMhuM(obj, zwVar) == vjVar) {
                                return vjVar;
                            }
                            r5 = true;
                        }
                        if (r5) {
                        }
                    }
                }
                zwVar = new defpackage.zw(this, ejVar);
                obj2 = zwVar.riuEU0zW4;
                i = zwVar.SH1y5HwkJhh;
                if (i != 0) {
                }
                if (((java.lang.Boolean) obj2).booleanValue()) {
                }
                if (r5) {
                }
            case 1:
                if (ejVar instanceof defpackage.dx) {
                    dxVar = (defpackage.dx) ejVar;
                    int i5 = dxVar.SH1y5HwkJhh;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        dxVar.SH1y5HwkJhh = i5 - Integer.MIN_VALUE;
                        obj3 = dxVar.riuEU0zW4;
                        i2 = dxVar.SH1y5HwkJhh;
                        if (i2 != 0) {
                            defpackage.f70.nBH8hAHy(obj3);
                            dxVar.EXtogiMhuM = this;
                            dxVar.JlrlGoKF = obj;
                            dxVar.SH1y5HwkJhh = 1;
                            obj3 = ((defpackage.k00) obj5).adDC3e2L(obj, dxVar);
                            if (obj3 == vjVar) {
                                return vjVar;
                            }
                        } else {
                            if (i2 != 1) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = dxVar.JlrlGoKF;
                            this = dxVar.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj3);
                        }
                        if (((java.lang.Boolean) obj3).booleanValue()) {
                            return ok1Var;
                        }
                        ((defpackage.rz0) this.AARZUJiTa).adDC3e2L = obj;
                        throw new defpackage.IHQe1A4L2xu(this);
                    }
                }
                dxVar = new defpackage.dx(this, ejVar);
                obj3 = dxVar.riuEU0zW4;
                i2 = dxVar.SH1y5HwkJhh;
                if (i2 != 0) {
                }
                if (((java.lang.Boolean) obj3).booleanValue()) {
                }
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.l70 l70Var = (defpackage.l70) obj;
                defpackage.f3 f3Var = (defpackage.f3) obj5;
                if (!(l70Var instanceof defpackage.rx0)) {
                    defpackage.uj ujVar = (defpackage.uj) obj4;
                    defpackage.kc kcVar = f3Var.abhbClRa;
                    float f = 0.0f;
                    if (kcVar == null) {
                        boolean z = f3Var.fnWB2E7cs;
                        defpackage.nn nnVar = f3Var.PAEGRtP0bX;
                        kcVar = new defpackage.kc();
                        kcVar.IHQe1A4L2xu = z;
                        kcVar.oh6vYeIP = nnVar;
                        kcVar.r1MBDhnF = defpackage.w70.IHQe1A4L2xu(0.0f);
                        kcVar.F7NU4MC0GW = new java.util.ArrayList();
                        defpackage.fm.D2vUnMij(f3Var);
                        f3Var.abhbClRa = kcVar;
                    }
                    java.util.ArrayList arrayList = (java.util.ArrayList) kcVar.F7NU4MC0GW;
                    if (l70Var instanceof defpackage.l40) {
                        arrayList.add(l70Var);
                    } else if (l70Var instanceof defpackage.m40) {
                        arrayList.remove(((defpackage.m40) l70Var).IHQe1A4L2xu);
                    } else if (l70Var instanceof defpackage.tx) {
                        arrayList.add(l70Var);
                    } else if (l70Var instanceof defpackage.ux) {
                        arrayList.remove(((defpackage.ux) l70Var).IHQe1A4L2xu);
                    } else if (l70Var instanceof defpackage.qr) {
                        arrayList.add(l70Var);
                    } else if (l70Var instanceof defpackage.rr) {
                        arrayList.remove(((defpackage.rr) l70Var).IHQe1A4L2xu);
                    } else if (l70Var instanceof defpackage.pr) {
                        arrayList.remove(((defpackage.pr) l70Var).IHQe1A4L2xu);
                    }
                    defpackage.l70 l70Var2 = (defpackage.l70) defpackage.td.FyULxpbU8bu(arrayList);
                    if (!defpackage.x70.QoRHpC4k((defpackage.l70) kcVar.adDC3e2L, l70Var2)) {
                        if (l70Var2 != null) {
                            ((defpackage.nn) kcVar.oh6vYeIP).IHQe1A4L2xu();
                            boolean z2 = l70Var2 instanceof defpackage.l40;
                            if (z2) {
                                f = 0.08f;
                            } else if (l70Var2 instanceof defpackage.tx) {
                                f = 0.1f;
                            } else if (l70Var2 instanceof defpackage.qr) {
                                f = 0.16f;
                            }
                            defpackage.lj1 lj1Var = defpackage.j21.IHQe1A4L2xu;
                            if (!z2) {
                                if (l70Var2 instanceof defpackage.tx) {
                                    lj1Var = new defpackage.lj1(45, 0, defpackage.es.oh6vYeIP);
                                } else if (l70Var2 instanceof defpackage.qr) {
                                    lj1Var = new defpackage.lj1(45, 0, defpackage.es.oh6vYeIP);
                                }
                            }
                            defpackage.fm.SiPhmbmu(ujVar, null, new defpackage.wn0(kcVar, f, lj1Var, (defpackage.ej) null), 3);
                        } else {
                            defpackage.l70 l70Var3 = (defpackage.l70) kcVar.adDC3e2L;
                            defpackage.lj1 lj1Var2 = defpackage.j21.IHQe1A4L2xu;
                            if (!(l70Var3 instanceof defpackage.l40) && !(l70Var3 instanceof defpackage.tx) && (l70Var3 instanceof defpackage.qr)) {
                                lj1Var2 = new defpackage.lj1(150, 0, defpackage.es.oh6vYeIP);
                            }
                            defpackage.fm.SiPhmbmu(ujVar, null, new defpackage.t01(kcVar, lj1Var2, ejVar2, 7), 3);
                        }
                        kcVar.adDC3e2L = l70Var2;
                    }
                } else if (f3Var.C0U8sNJm) {
                    f3Var.UVjEelCZ((defpackage.rx0) l70Var);
                } else {
                    f3Var.UsuH8pd5P.IHQe1A4L2xu(l70Var);
                }
                return ok1Var;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return IHQe1A4L2xu(((java.lang.Number) obj).intValue(), ejVar);
            default:
                defpackage.l70 l70Var4 = (defpackage.l70) obj;
                defpackage.pz0 pz0Var = (defpackage.pz0) obj5;
                if (l70Var4 instanceof defpackage.px0) {
                    pz0Var.adDC3e2L++;
                } else if (l70Var4 instanceof defpackage.qx0) {
                    pz0Var.adDC3e2L--;
                } else if (l70Var4 instanceof defpackage.ox0) {
                    pz0Var.adDC3e2L--;
                }
                r5 = pz0Var.adDC3e2L > 0;
                defpackage.xg1 xg1Var = (defpackage.xg1) obj4;
                if (xg1Var.V7bD7b8KA != r5) {
                    xg1Var.V7bD7b8KA = r5;
                    defpackage.a70.EgCjBq0SZwJ(xg1Var);
                }
                return ok1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object IHQe1A4L2xu(int i, defpackage.ej ejVar) {
        defpackage.ac1 ac1Var;
        int i2;
        if (ejVar instanceof defpackage.ac1) {
            ac1Var = (defpackage.ac1) ejVar;
            int i3 = ac1Var.SH1y5HwkJhh;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ac1Var.SH1y5HwkJhh = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = ac1Var.EXtogiMhuM;
                i2 = ac1Var.SH1y5HwkJhh;
                defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                if (i2 == 0) {
                    if (i2 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                if (i > 0) {
                    defpackage.nz0 nz0Var = (defpackage.nz0) this.xiZrDbcSW0;
                    if (!nz0Var.adDC3e2L) {
                        nz0Var.adDC3e2L = true;
                        defpackage.iw iwVar = (defpackage.iw) this.AARZUJiTa;
                        ac1Var.SH1y5HwkJhh = 1;
                        java.lang.Object EXtogiMhuM = iwVar.EXtogiMhuM(defpackage.o91.adDC3e2L, ac1Var);
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        if (EXtogiMhuM == vjVar) {
                            return vjVar;
                        }
                    }
                }
                return ok1Var;
            }
        }
        ac1Var = new defpackage.ac1(this, ejVar);
        java.lang.Object obj2 = ac1Var.EXtogiMhuM;
        i2 = ac1Var.SH1y5HwkJhh;
        defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
        if (i2 == 0) {
        }
    }
}
