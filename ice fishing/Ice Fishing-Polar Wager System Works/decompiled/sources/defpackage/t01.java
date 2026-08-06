package defpackage;

/* loaded from: classes.dex */
public final class t01 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ java.lang.Object JlrlGoKF;
    public int SH1y5HwkJhh;
    public java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t01(java.lang.Object obj, java.lang.Object obj2, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = obj;
        this.JlrlGoKF = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01fd, code lost:
    
        if (r15 != r5) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0208, code lost:
    
        if (r14.adDC3e2L(r15, r14) == r5) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0208 -> B:112:0x020c). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.adDC3e2L addc3e2l;
        int i = this.riuEU0zW4;
        int i2 = 3;
        int i3 = 2;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        java.lang.Object obj2 = this.JlrlGoKF;
        defpackage.ej ejVar = null;
        switch (i) {
            case 0:
                int i4 = this.SH1y5HwkJhh;
                if (i4 != 0) {
                    if (i4 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.u01 u01Var = (defpackage.u01) this.ez2rX8ReCYw;
                defpackage.c1NqjJifC7 c1nqjjifc7 = u01Var.SH1y5HwkJhh;
                defpackage.a aVar = new defpackage.a(u01Var, (defpackage.g00) obj2, ejVar, i3);
                this.SH1y5HwkJhh = 1;
                return c1nqjjifc7.SH1y5HwkJhh(this, aVar) == vjVar ? vjVar : ok1Var;
            case 1:
                int i5 = this.SH1y5HwkJhh;
                if (i5 != 0) {
                    if (i5 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.uj ujVar = (defpackage.uj) this.ez2rX8ReCYw;
                defpackage.f3 f3Var = (defpackage.f3) obj2;
                defpackage.m91 m91Var = f3Var.EgCjBq0SZwJ.IHQe1A4L2xu;
                defpackage.ax axVar = new defpackage.ax(i3, f3Var, ujVar);
                this.SH1y5HwkJhh = 1;
                m91Var.getClass();
                defpackage.m91.ez2rX8ReCYw(m91Var, axVar, this);
                return vjVar;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                int i6 = this.SH1y5HwkJhh;
                if (i6 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    if (((defpackage.uj) this.ez2rX8ReCYw).AARZUJiTa().cnag84Bm(defpackage.xh1.xiZrDbcSW0) != null) {
                        this.SH1y5HwkJhh = 1;
                        java.lang.Object AARZUJiTa = ((defpackage.g00) obj2).AARZUJiTa(this);
                        return AARZUJiTa == vjVar ? vjVar : AARZUJiTa;
                    }
                    defpackage.db.AARZUJiTa("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i6 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return obj;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                int i7 = this.SH1y5HwkJhh;
                if (i7 != 0) {
                    if (i7 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.hr hrVar = (defpackage.hr) this.ez2rX8ReCYw;
                float f = hrVar.oh6vYeIP ? -1.0f : 1.0f;
                defpackage.i61 i61Var = ((defpackage.a61) obj2).WLpAkxCo;
                long j = hrVar.IHQe1A4L2xu;
                long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)) * f) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
                this.SH1y5HwkJhh = 1;
                return i61Var.oh6vYeIP(floatToRawIntBits, false, this) == vjVar ? vjVar : ok1Var;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                int i8 = this.SH1y5HwkJhh;
                if (i8 != 0) {
                    if (i8 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.pl IHQe1A4L2xu = ((defpackage.zp0) this.ez2rX8ReCYw).IHQe1A4L2xu.IHQe1A4L2xu();
                defpackage.M9IxZHm3 m9IxZHm3 = new defpackage.M9IxZHm3(9, (defpackage.z81) obj2);
                this.SH1y5HwkJhh = 1;
                return IHQe1A4L2xu.IHQe1A4L2xu(m9IxZHm3, this) == vjVar ? vjVar : ok1Var;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.y yVar = (defpackage.y) obj2;
                int i9 = this.SH1y5HwkJhh;
                if (i9 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    if (((java.util.concurrent.atomic.AtomicInteger) ((defpackage.c1NqjJifC7) yVar.EXtogiMhuM).xiZrDbcSW0).get() <= 0) {
                        defpackage.db.AARZUJiTa("Check failed.");
                    }
                    defpackage.x80.G3OKOH3wZRC(((defpackage.uj) yVar.adDC3e2L).AARZUJiTa());
                    addc3e2l = (defpackage.adDC3e2L) yVar.xiZrDbcSW0;
                    defpackage.x9 x9Var = (defpackage.x9) yVar.AARZUJiTa;
                    this.ez2rX8ReCYw = addc3e2l;
                    this.SH1y5HwkJhh = 1;
                    x9Var.getClass();
                    obj = defpackage.x9.frpfPPIgqM9O(x9Var, this);
                } else if (i9 == 1) {
                    addc3e2l = (defpackage.adDC3e2L) this.ez2rX8ReCYw;
                    defpackage.f70.nBH8hAHy(obj);
                    this.ez2rX8ReCYw = null;
                    this.SH1y5HwkJhh = 2;
                    break;
                } else if (i9 == 2) {
                    defpackage.f70.nBH8hAHy(obj);
                    if (((java.util.concurrent.atomic.AtomicInteger) ((defpackage.c1NqjJifC7) yVar.EXtogiMhuM).xiZrDbcSW0).decrementAndGet() == 0) {
                        return ok1Var;
                    }
                    defpackage.x80.G3OKOH3wZRC(((defpackage.uj) yVar.adDC3e2L).AARZUJiTa());
                    addc3e2l = (defpackage.adDC3e2L) yVar.xiZrDbcSW0;
                    defpackage.x9 x9Var2 = (defpackage.x9) yVar.AARZUJiTa;
                    this.ez2rX8ReCYw = addc3e2l;
                    this.SH1y5HwkJhh = 1;
                    x9Var2.getClass();
                    obj = defpackage.x9.frpfPPIgqM9O(x9Var2, this);
                    break;
                } else {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                int i10 = this.SH1y5HwkJhh;
                if (i10 != 0) {
                    if (i10 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                    throw new defpackage.cf();
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.ax axVar2 = new defpackage.ax(i2, new defpackage.nz0(), (defpackage.iw) this.ez2rX8ReCYw);
                this.SH1y5HwkJhh = 1;
                ((defpackage.jd1) obj2).IHQe1A4L2xu(axVar2, this);
                return vjVar;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                int i11 = this.SH1y5HwkJhh;
                if (i11 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    this.SH1y5HwkJhh = 1;
                    return defpackage.w3.r1MBDhnF((defpackage.w3) ((defpackage.kc) this.ez2rX8ReCYw).r1MBDhnF, new java.lang.Float(0.0f), (defpackage.c5) obj2, null, this, 12) == vjVar ? vjVar : ok1Var;
                }
                if (i11 == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                    return ok1Var;
                }
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                int i12 = this.SH1y5HwkJhh;
                if (i12 != 0) {
                    if (i12 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.gx IHQe1A4L2xu2 = ((defpackage.oa) this.ez2rX8ReCYw).IHQe1A4L2xu();
                defpackage.M9IxZHm3 m9IxZHm32 = new defpackage.M9IxZHm3(10, (defpackage.wh1) obj2);
                this.SH1y5HwkJhh = 1;
                return IHQe1A4L2xu2.IHQe1A4L2xu(m9IxZHm32, this) == vjVar ? vjVar : ok1Var;
            case 9:
                int i13 = this.SH1y5HwkJhh;
                if (i13 != 0) {
                    if (i13 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.wh1 wh1Var = (defpackage.wh1) this.ez2rX8ReCYw;
                defpackage.c1NqjJifC7 c1nqjjifc72 = wh1Var.riuEU0zW4;
                defpackage.a aVar2 = new defpackage.a(wh1Var, (defpackage.g00) obj2, ejVar, i2);
                this.SH1y5HwkJhh = 1;
                return c1nqjjifc72.SH1y5HwkJhh(this, aVar2) == vjVar ? vjVar : ok1Var;
            case 10:
                defpackage.vz vzVar = (defpackage.vz) obj2;
                int i14 = this.SH1y5HwkJhh;
                try {
                    if (i14 == 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        defpackage.kj1 kj1Var = (defpackage.kj1) this.ez2rX8ReCYw;
                        this.SH1y5HwkJhh = 1;
                        obj = defpackage.kj1.oh6vYeIP(kj1Var, this);
                        if (obj == vjVar) {
                            return vjVar;
                        }
                    } else {
                        if (i14 != 1) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    vzVar.IHQe1A4L2xu();
                    return ok1Var;
                } catch (java.lang.Throwable th) {
                    vzVar.IHQe1A4L2xu();
                    throw th;
                }
            case 11:
                int i15 = this.SH1y5HwkJhh;
                if (i15 != 0) {
                    if (i15 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.hw hwVar = (defpackage.hw) this.ez2rX8ReCYw;
                defpackage.hk1 hk1Var = new defpackage.hk1((defpackage.k00) obj2);
                this.SH1y5HwkJhh = 1;
                return hwVar.IHQe1A4L2xu(hk1Var, this) == vjVar ? vjVar : ok1Var;
            case 12:
                int i16 = this.SH1y5HwkJhh;
                if (i16 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    java.lang.Object obj3 = this.ez2rX8ReCYw;
                    this.SH1y5HwkJhh = 1;
                    return ((defpackage.iw) obj2).EXtogiMhuM(obj3, this) == vjVar ? vjVar : ok1Var;
                }
                if (i16 == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                    return ok1Var;
                }
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                int i17 = this.SH1y5HwkJhh;
                if (i17 != 0) {
                    if (i17 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.gx IHQe1A4L2xu3 = ((defpackage.oa) this.ez2rX8ReCYw).IHQe1A4L2xu();
                defpackage.M9IxZHm3 m9IxZHm33 = new defpackage.M9IxZHm3(11, (defpackage.fm1) obj2);
                this.SH1y5HwkJhh = 1;
                return IHQe1A4L2xu3.IHQe1A4L2xu(m9IxZHm33, this) == vjVar ? vjVar : ok1Var;
            default:
                defpackage.gz0 gz0Var = (defpackage.gz0) this.ez2rX8ReCYw;
                android.view.View view = (android.view.View) obj2;
                int i18 = this.SH1y5HwkJhh;
                try {
                    if (i18 == 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        this.SH1y5HwkJhh = 1;
                        java.lang.Object fnWB2E7cs = defpackage.gq1.fnWB2E7cs(gz0Var.kNAkVymC, new defpackage.ll(i3, ejVar, i2), this);
                        if (fnWB2E7cs != vjVar) {
                            fnWB2E7cs = ok1Var;
                        }
                        if (fnWB2E7cs == vjVar) {
                            return vjVar;
                        }
                    } else {
                        if (i18 != 1) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    if (defpackage.np1.IHQe1A4L2xu(view) != gz0Var) {
                        return ok1Var;
                    }
                    view.setTag(com.combinations.spin.balbi.R.id.androidx_compose_ui_view_composition_context, null);
                    return ok1Var;
                } finally {
                }
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case 1:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.iw) obj)).SyNS6RMn(ok1Var);
                return defpackage.vj.adDC3e2L;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case 9:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case 10:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case 11:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case 12:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, obj)).SyNS6RMn(ok1Var);
            case 13:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.t01) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.lang.Object obj2 = this.JlrlGoKF;
        switch (i) {
            case 0:
                return new defpackage.t01((defpackage.u01) this.ez2rX8ReCYw, (defpackage.g00) obj2, ejVar, 0);
            case 1:
                defpackage.t01 t01Var = new defpackage.t01((defpackage.f3) obj2, ejVar, 1);
                t01Var.ez2rX8ReCYw = obj;
                return t01Var;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.t01 t01Var2 = new defpackage.t01((defpackage.g00) obj2, ejVar, 2);
                t01Var2.ez2rX8ReCYw = obj;
                return t01Var2;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.t01((defpackage.hr) this.ez2rX8ReCYw, (defpackage.a61) obj2, ejVar, 3);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.t01((defpackage.zp0) this.ez2rX8ReCYw, (defpackage.z81) obj2, ejVar, 4);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.t01((defpackage.y) obj2, ejVar, 5);
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.t01 t01Var3 = new defpackage.t01((defpackage.jd1) obj2, ejVar, 6);
                t01Var3.ez2rX8ReCYw = obj;
                return t01Var3;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.t01((defpackage.kc) this.ez2rX8ReCYw, (defpackage.c5) obj2, ejVar, 7);
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.t01((defpackage.oa) this.ez2rX8ReCYw, (defpackage.wh1) obj2, ejVar, 8);
            case 9:
                return new defpackage.t01((defpackage.wh1) this.ez2rX8ReCYw, (defpackage.g00) obj2, ejVar, 9);
            case 10:
                return new defpackage.t01((defpackage.kj1) this.ez2rX8ReCYw, (defpackage.vz) obj2, ejVar, 10);
            case 11:
                return new defpackage.t01((defpackage.hw) this.ez2rX8ReCYw, (defpackage.k00) obj2, ejVar, 11);
            case 12:
                defpackage.t01 t01Var4 = new defpackage.t01((defpackage.iw) obj2, ejVar, 12);
                t01Var4.ez2rX8ReCYw = obj;
                return t01Var4;
            case 13:
                return new defpackage.t01((defpackage.oa) this.ez2rX8ReCYw, (defpackage.fm1) obj2, ejVar, 13);
            default:
                return new defpackage.t01((defpackage.gz0) this.ez2rX8ReCYw, (android.view.View) obj2, ejVar, 14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t01(java.lang.Object obj, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.JlrlGoKF = obj;
    }
}
