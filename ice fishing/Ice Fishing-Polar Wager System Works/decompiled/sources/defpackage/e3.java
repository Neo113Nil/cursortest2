package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ e3(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02a7  */
    @Override // defpackage.vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu() {
        java.lang.Object p11Var;
        int i;
        android.content.Context context;
        java.lang.Object defaultVibrator;
        int i2;
        boolean z = true;
        switch (this.adDC3e2L) {
            case 0:
                defpackage.fm.D2vUnMij((defpackage.f3) this.xiZrDbcSW0);
                return defpackage.ok1.IHQe1A4L2xu;
            case 1:
                return ((defpackage.F7NU4MC0GW) this.xiZrDbcSW0).r1MBDhnF(":memory:");
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.a10((com.corsair.ledger.data.local.CorsairDatabase_Impl) this.xiZrDbcSW0);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.rz rzVar = (defpackage.rz) this.xiZrDbcSW0;
                android.content.Context context2 = rzVar.adDC3e2L;
                java.lang.String str = rzVar.xiZrDbcSW0;
                defpackage.c1NqjJifC7 c1nqjjifc7 = new defpackage.c1NqjJifC7(13, false);
                c1nqjjifc7.xiZrDbcSW0 = null;
                defpackage.qz qzVar = new defpackage.qz(context2, str, c1nqjjifc7, rzVar.AARZUJiTa);
                qzVar.setWriteAheadLoggingEnabled(rzVar.riuEU0zW4);
                return qzVar;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.b10 b10Var = (defpackage.b10) this.xiZrDbcSW0;
                try {
                    i = android.os.Build.VERSION.SDK_INT;
                    context = b10Var.IHQe1A4L2xu;
                } catch (java.lang.Throwable th) {
                    p11Var = new defpackage.p11(th);
                }
                if (i < 31) {
                    java.lang.Object systemService = context.getSystemService("vibrator");
                    if (systemService instanceof android.os.Vibrator) {
                        p11Var = (android.os.Vibrator) systemService;
                        return (android.os.Vibrator) (p11Var instanceof defpackage.p11 ? null : p11Var);
                    }
                    p11Var = null;
                    return (android.os.Vibrator) (p11Var instanceof defpackage.p11 ? null : p11Var);
                }
                android.os.VibratorManager EXtogiMhuM = defpackage.e1.EXtogiMhuM(context.getSystemService(defpackage.e1.EgCjBq0SZwJ()));
                if (EXtogiMhuM != null) {
                    defaultVibrator = EXtogiMhuM.getDefaultVibrator();
                    p11Var = defaultVibrator;
                    return (android.os.Vibrator) (p11Var instanceof defpackage.p11 ? null : p11Var);
                }
                p11Var = null;
                return (android.os.Vibrator) (p11Var instanceof defpackage.p11 ? null : p11Var);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                com.corsair.ledger.data.local.CorsairDatabase_Impl corsairDatabase_Impl = ((defpackage.k80) this.xiZrDbcSW0).IHQe1A4L2xu;
                return java.lang.Boolean.valueOf(!corsairDatabase_Impl.riuEU0zW4() || corsairDatabase_Impl.ez2rX8ReCYw());
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Integer.valueOf(((defpackage.yc0) this.xiZrDbcSW0).AARZUJiTa().SyNS6RMn);
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                return (defpackage.ck0) defpackage.dc.IHQe1A4L2xu(((defpackage.sb) this.xiZrDbcSW0).EXtogiMhuM());
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.pm0 pm0Var = ((defpackage.nm0) this.xiZrDbcSW0).JlrlGoKF;
                if (!pm0Var.riuEU0zW4) {
                    defpackage.db.AARZUJiTa("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (pm0Var.SH1y5HwkJhh.EXtogiMhuM == defpackage.nd0.adDC3e2L) {
                    defpackage.db.AARZUJiTa("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                defpackage.nm0 nm0Var = pm0Var.IHQe1A4L2xu;
                defpackage.zm1 zm1Var = (defpackage.zm1) pm0Var.DFo87pBq1E5.getValue();
                defpackage.fk QQUzIjv3iOC5 = defpackage.x80.QQUzIjv3iOC5(nm0Var);
                zm1Var.getClass();
                QQUzIjv3iOC5.getClass();
                defpackage.y yVar = new defpackage.y(nm0Var.AARZUJiTa(), zm1Var, QQUzIjv3iOC5);
                defpackage.xc IHQe1A4L2xu = defpackage.sz0.IHQe1A4L2xu(defpackage.om0.class);
                java.lang.String oh6vYeIP = IHQe1A4L2xu.oh6vYeIP();
                if (oh6vYeIP != null) {
                    return ((defpackage.om0) yVar.DFo87pBq1E5(IHQe1A4L2xu, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(oh6vYeIP))).oh6vYeIP;
                }
                defpackage.db.fnWB2E7cs("Local and anonymous classes can not be ViewModels");
                return null;
            case 9:
                return new defpackage.en0((java.lang.String) this.xiZrDbcSW0);
            case 10:
                return new defpackage.rq0((defpackage.tq0) this.xiZrDbcSW0);
            case 11:
                defpackage.zt0 zt0Var = (defpackage.zt0) this.xiZrDbcSW0;
                return zt0Var.adDC3e2L.r1MBDhnF(zt0Var.xiZrDbcSW0);
            case 12:
                float floatValue = ((java.lang.Number) ((defpackage.vz) this.xiZrDbcSW0).IHQe1A4L2xu()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                return java.lang.Float.valueOf(floatValue);
            case 13:
                defpackage.q31 q31Var = (defpackage.q31) this.xiZrDbcSW0;
                defpackage.l41 l41Var = q31Var.adDC3e2L;
                java.lang.Object obj = q31Var.EXtogiMhuM;
                if (obj != null) {
                    return l41Var.ez2rX8ReCYw(q31Var, obj);
                }
                defpackage.db.fnWB2E7cs("Value should be initialized");
                return null;
            case 14:
                defpackage.F7NU4MC0GW f7nu4mc0gw = ((defpackage.x31) this.xiZrDbcSW0).AARZUJiTa;
                if (f7nu4mc0gw == null) {
                    return null;
                }
                android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                f7nu4mc0gw.abhbClRa(SyNS6RMn);
                if (SyNS6RMn.isEmpty()) {
                    return null;
                }
                return SyNS6RMn;
            case 15:
                return defpackage.w70.C0U8sNJm((defpackage.cn1) this.xiZrDbcSW0);
            case 16:
                defpackage.i41 i41Var = (defpackage.i41) this.xiZrDbcSW0;
                i41Var.EXtogiMhuM().IHQe1A4L2xu(new defpackage.jz0(0, i41Var));
                return defpackage.ok1.IHQe1A4L2xu;
            case 17:
                defpackage.p51 p51Var = (defpackage.p51) this.xiZrDbcSW0;
                defpackage.f2 f2Var = (defpackage.f2) defpackage.mj1.abhbClRa(p51Var, defpackage.rs0.IHQe1A4L2xu);
                p51Var.v5iciZok = f2Var;
                p51Var.D2vUnMij = f2Var != null ? new defpackage.e2(f2Var.IHQe1A4L2xu, f2Var.oh6vYeIP, f2Var.r1MBDhnF, f2Var.F7NU4MC0GW) : null;
                return defpackage.ok1.IHQe1A4L2xu;
            case 18:
                defpackage.s61 s61Var = (defpackage.s61) this.xiZrDbcSW0;
                defpackage.li1 li1Var = s61Var.adDC3e2L;
                s61Var.xiZrDbcSW0 = li1Var != null ? ((java.lang.Number) li1Var.JlrlGoKF.getValue()).longValue() : 0L;
                return defpackage.ok1.IHQe1A4L2xu;
            case 19:
                return this.xiZrDbcSW0;
            case 20:
                defpackage.b91 b91Var = (defpackage.b91) this.xiZrDbcSW0;
                defpackage.qt0 qt0Var = b91Var.AARZUJiTa;
                if (((defpackage.z91) qt0Var.getValue()).IHQe1A4L2xu == 9205357640488583168L || defpackage.z91.r1MBDhnF(((defpackage.z91) qt0Var.getValue()).IHQe1A4L2xu)) {
                    return null;
                }
                return b91Var.adDC3e2L.hkbnNdmy(((defpackage.z91) qt0Var.getValue()).IHQe1A4L2xu);
            case 21:
                defpackage.ib1 ib1Var = (defpackage.ib1) this.xiZrDbcSW0;
                while (true) {
                    synchronized (ib1Var.AARZUJiTa) {
                        try {
                            if (!ib1Var.r1MBDhnF) {
                                ib1Var.r1MBDhnF = z;
                                try {
                                    defpackage.xl0 xl0Var = ib1Var.xiZrDbcSW0;
                                    java.lang.Object[] objArr = xl0Var.adDC3e2L;
                                    int i3 = xl0Var.AARZUJiTa;
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        defpackage.hb1 hb1Var = (defpackage.hb1) objArr[i4];
                                        defpackage.ol0 ol0Var = hb1Var.AARZUJiTa;
                                        defpackage.g00 g00Var = hb1Var.IHQe1A4L2xu;
                                        java.lang.Object[] objArr2 = ol0Var.oh6vYeIP;
                                        long[] jArr = ol0Var.IHQe1A4L2xu;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j = jArr[i5];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8;
                                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                    int i8 = 0;
                                                    while (i8 < i7) {
                                                        if ((j & 255) < 128) {
                                                            i2 = i6;
                                                            g00Var.AARZUJiTa(objArr2[(i5 << 3) + i8]);
                                                        } else {
                                                            i2 = i6;
                                                        }
                                                        j >>= i2;
                                                        i8++;
                                                        i6 = i2;
                                                    }
                                                    if (i7 != i6) {
                                                    }
                                                }
                                                if (i5 != length) {
                                                    i5++;
                                                }
                                            }
                                        }
                                        ol0Var.oh6vYeIP();
                                    }
                                    ib1Var.r1MBDhnF = false;
                                } catch (java.lang.Throwable th2) {
                                    ib1Var.r1MBDhnF = false;
                                    throw th2;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!ib1Var.IHQe1A4L2xu()) {
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                    z = true;
                }
            case 22:
                defpackage.cg1 cg1Var = (defpackage.cg1) this.xiZrDbcSW0;
                cg1Var.nBH8hAHy = null;
                defpackage.x80.C0U8sNJm(cg1Var);
                defpackage.a70.EgCjBq0SZwJ(cg1Var);
                defpackage.fm.D2vUnMij(cg1Var);
                return java.lang.Boolean.TRUE;
            default:
                ((defpackage.eh1) this.xiZrDbcSW0).TFRaUu83X3E.AARZUJiTa(java.lang.Boolean.valueOf(!r0.hkbnNdmy));
                return defpackage.ok1.IHQe1A4L2xu;
        }
    }
}
