package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class k7 implements defpackage.vz {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ k7(defpackage.t10 t10Var, defpackage.pb pbVar, defpackage.ea1 ea1Var, defpackage.jk0 jk0Var) {
        this.adDC3e2L = 3;
        this.xiZrDbcSW0 = t10Var;
        this.AARZUJiTa = pbVar;
        this.EXtogiMhuM = ea1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0166, code lost:
    
        if (r4 == null) goto L54;
     */
    @Override // defpackage.vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu() {
        int i;
        defpackage.kz0 kz0Var;
        int i2;
        int i3;
        java.lang.Object wmVar;
        int i4 = this.adDC3e2L;
        int i5 = 1;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj = this.EXtogiMhuM;
        java.lang.Object obj2 = this.AARZUJiTa;
        java.lang.Object obj3 = this.xiZrDbcSW0;
        switch (i4) {
            case 0:
                ((defpackage.l7) obj3).IHQe1A4L2xu();
                defpackage.y6 y6Var = (defpackage.y6) ((defpackage.m7) obj2).r1MBDhnF;
                int i6 = ((defpackage.pz0) obj).adDC3e2L;
                do {
                    i = y6Var.get();
                } while (!y6Var.compareAndSet(i, ((i >>> 27) & 15) == i6 ? i - 1 : i));
                return ok1Var;
            case 1:
                defpackage.i9 i9Var = (defpackage.i9) obj3;
                defpackage.kz0 UVjEelCZ = defpackage.i9.UVjEelCZ(i9Var, (defpackage.ip0) obj2, (defpackage.o0) obj);
                if (UVjEelCZ == null) {
                    return null;
                }
                defpackage.yi yiVar = i9Var.EgCjBq0SZwJ;
                if (defpackage.i70.IHQe1A4L2xu(yiVar.NHJTzaLwkd, 0L)) {
                    defpackage.a60.r1MBDhnF("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return UVjEelCZ.adDC3e2L(yiVar.WnQbjbWuMR(UVjEelCZ, yiVar.NHJTzaLwkd, 0L) ^ (-9223372034707292160L));
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yi yiVar2 = (defpackage.yi) obj3;
                defpackage.el1 el1Var = (defpackage.el1) obj2;
                defpackage.l9 l9Var = (defpackage.l9) obj;
                defpackage.f9 f9Var = yiVar2.PAEGRtP0bX;
                while (true) {
                    defpackage.xl0 xl0Var = f9Var.IHQe1A4L2xu;
                    int i7 = xl0Var.AARZUJiTa;
                    if (i7 != 0) {
                        if (i7 == 0) {
                            throw new java.util.NoSuchElementException("MutableVector is empty.");
                        }
                        defpackage.kz0 kz0Var2 = (defpackage.kz0) ((defpackage.ui) xl0Var.adDC3e2L[i7 - 1]).IHQe1A4L2xu.IHQe1A4L2xu();
                        if (kz0Var2 == null ? true : defpackage.yi.H6IrRhrpWoH(yiVar2, kz0Var2, 0L, 0L, 3)) {
                            ((defpackage.ui) f9Var.IHQe1A4L2xu.ez2rX8ReCYw(r8.AARZUJiTa - 1)).oh6vYeIP.SH1y5HwkJhh(ok1Var);
                        }
                    }
                }
                if (yiVar2.abhbClRa && (kz0Var = (defpackage.kz0) yiVar2.V7bD7b8KA.IHQe1A4L2xu()) != null && defpackage.yi.H6IrRhrpWoH(yiVar2, kz0Var, 0L, 0L, 3)) {
                    yiVar2.abhbClRa = false;
                }
                el1Var.adDC3e2L = defpackage.yi.UVjEelCZ(yiVar2, l9Var, 0L);
                return ok1Var;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.t10 t10Var = (defpackage.t10) obj3;
                defpackage.pb pbVar = (defpackage.pb) obj2;
                defpackage.ea1 ea1Var = (defpackage.ea1) obj;
                defpackage.ch chVar = t10Var.hyxIchWRW;
                defpackage.pb pbVar2 = chVar.oh6vYeIP;
                try {
                    chVar.oh6vYeIP = pbVar;
                    defpackage.ea1 ea1Var2 = t10Var.SiPhmbmu;
                    int[] iArr = t10Var.cnag84Bm;
                    defpackage.xk0 xk0Var = t10Var.V7bD7b8KA;
                    t10Var.cnag84Bm = null;
                    t10Var.V7bD7b8KA = null;
                    try {
                        t10Var.SiPhmbmu = ea1Var;
                        boolean z = chVar.adDC3e2L;
                        try {
                            chVar.adDC3e2L = false;
                            throw null;
                        } catch (java.lang.Throwable th) {
                            chVar.adDC3e2L = z;
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        t10Var.SiPhmbmu = ea1Var2;
                        t10Var.cnag84Bm = iArr;
                        t10Var.V7bD7b8KA = xk0Var;
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    chVar.oh6vYeIP = pbVar2;
                    throw th3;
                }
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yc0 yc0Var = (defpackage.yc0) obj2;
                defpackage.hb0 hb0Var = (defpackage.hb0) obj;
                defpackage.mc0 mc0Var = (defpackage.mc0) ((defpackage.yn) obj3).getValue();
                defpackage.d70 d70Var = (defpackage.d70) ((defpackage.yb0) yc0Var.adDC3e2L.adDC3e2L).getValue();
                defpackage.p2 p2Var = new defpackage.p2();
                defpackage.p2 p2Var2 = mc0Var.IHQe1A4L2xu;
                int i8 = d70Var.adDC3e2L;
                if (i8 < 0) {
                    defpackage.a60.r1MBDhnF("negative nearestRange.first");
                }
                int min = java.lang.Math.min(d70Var.xiZrDbcSW0, p2Var2.IHQe1A4L2xu - 1);
                if (min < i8) {
                    defpackage.fl0 fl0Var = defpackage.up0.IHQe1A4L2xu;
                    fl0Var.getClass();
                    p2Var.oh6vYeIP = fl0Var;
                    p2Var.r1MBDhnF = new java.lang.Object[0];
                    p2Var.IHQe1A4L2xu = 0;
                } else {
                    int i9 = (min - i8) + 1;
                    p2Var.r1MBDhnF = new java.lang.Object[i9];
                    p2Var.IHQe1A4L2xu = i8;
                    defpackage.fl0 fl0Var2 = new defpackage.fl0(i9);
                    defpackage.xl0 xl0Var2 = (defpackage.xl0) p2Var2.oh6vYeIP;
                    if (i8 < 0 || i8 >= p2Var2.IHQe1A4L2xu) {
                        java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i8, "Index ", ", size ");
                        JlrlGoKF.append(p2Var2.IHQe1A4L2xu);
                        defpackage.a60.F7NU4MC0GW(JlrlGoKF.toString());
                    }
                    if (min < 0 || min >= p2Var2.IHQe1A4L2xu) {
                        java.lang.StringBuilder JlrlGoKF2 = defpackage.fx0.JlrlGoKF(min, "Index ", ", size ");
                        JlrlGoKF2.append(p2Var2.IHQe1A4L2xu);
                        defpackage.a60.F7NU4MC0GW(JlrlGoKF2.toString());
                    }
                    if (min < i8) {
                        defpackage.a60.IHQe1A4L2xu("toIndex (" + min + ") should be not smaller than fromIndex (" + i8 + ')');
                    }
                    int adDC3e2L = defpackage.s70.adDC3e2L(i8, xl0Var2);
                    int i10 = ((defpackage.r70) xl0Var2.adDC3e2L[adDC3e2L]).IHQe1A4L2xu;
                    while (i10 <= min) {
                        defpackage.r70 r70Var = (defpackage.r70) xl0Var2.adDC3e2L[adDC3e2L];
                        defpackage.g00 g00Var = (defpackage.g00) r70Var.r1MBDhnF.oh6vYeIP;
                        int i11 = r70Var.IHQe1A4L2xu;
                        int max = java.lang.Math.max(i8, i11);
                        int min2 = java.lang.Math.min(min, (r70Var.oh6vYeIP + i11) - i5);
                        if (max <= min2) {
                            while (true) {
                                if (g00Var != null) {
                                    i3 = i5;
                                    wmVar = g00Var.AARZUJiTa(java.lang.Integer.valueOf(max - i11));
                                    break;
                                } else {
                                    i3 = i5;
                                }
                                wmVar = new defpackage.wm(max);
                                fl0Var2.AARZUJiTa(max, wmVar);
                                i2 = min;
                                ((java.lang.Object[]) p2Var.r1MBDhnF)[max - p2Var.IHQe1A4L2xu] = wmVar;
                                if (max != min2) {
                                    max++;
                                    min = i2;
                                    i5 = i3;
                                }
                            }
                        } else {
                            i2 = min;
                            i3 = i5;
                        }
                        i10 += r70Var.oh6vYeIP;
                        adDC3e2L++;
                        min = i2;
                        i5 = i3;
                    }
                    p2Var.oh6vYeIP = fl0Var2;
                }
                return new defpackage.oc0(yc0Var, mc0Var, hb0Var, p2Var);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.o10 o10Var = (defpackage.o10) obj3;
                defpackage.ia1 ia1Var = (defpackage.ia1) obj2;
                defpackage.hs0 hs0Var = (defpackage.hs0) obj;
                if (o10Var != null) {
                    ia1Var.IHQe1A4L2xu(ia1Var.r1MBDhnF(o10Var) - ia1Var.fnWB2E7cs);
                }
                java.util.List DFo87pBq1E5 = defpackage.w70.DFo87pBq1E5(ia1Var, null, ia1Var.fnWB2E7cs, null);
                defpackage.tg tgVar = (defpackage.tg) defpackage.td.FyULxpbU8bu(DFo87pBq1E5);
                java.lang.Integer num = tgVar != null ? tgVar.oh6vYeIP : null;
                java.util.List xiZrDbcSW0 = hs0Var.xiZrDbcSW0(num);
                if (num != null && !xiZrDbcSW0.isEmpty()) {
                    xiZrDbcSW0 = defpackage.td.flIYPhR0(defpackage.fm.p4kuH6PDtgom(new defpackage.tg(((defpackage.tg) defpackage.td.JcqDrWrgMf(xiZrDbcSW0)).IHQe1A4L2xu, null, num)), defpackage.td.mL9sMlGfef(xiZrDbcSW0));
                }
                return new defpackage.rg(defpackage.td.flIYPhR0(DFo87pBq1E5, xiZrDbcSW0), hs0Var.AARZUJiTa());
            default:
                defpackage.b10 b10Var = (defpackage.b10) obj3;
                defpackage.g00 g00Var2 = (defpackage.g00) obj2;
                defpackage.jg1 jg1Var = (defpackage.jg1) obj;
                if (b10Var != null) {
                    b10Var.IHQe1A4L2xu(44, 40, 12L);
                }
                g00Var2.AARZUJiTa(new defpackage.n81(jg1Var));
                return ok1Var;
        }
    }

    public /* synthetic */ k7(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
        this.EXtogiMhuM = obj3;
    }
}
