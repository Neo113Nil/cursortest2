package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w2 extends defpackage.lc0 implements defpackage.n10 {
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(int i, java.lang.Object obj) {
        super(0);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    @Override // defpackage.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object ZpBGe2uQfcn8() {
        defpackage.lj ljVar;
        defpackage.rc0 parentLayoutCoordinates;
        int i = this.oh71FJcDz6S2;
        android.content.Context context = null;
        boolean z = false;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                defpackage.ok0.BHfvd2J71qpO(((defpackage.y2) obj).QiMR8OkAhezm, null);
                return gs1Var;
            case 1:
                return gs1Var;
            case 2:
                defpackage.jp1 jp1Var = (defpackage.jp1) obj;
                java.lang.Object oh71FJcDz6S2 = jp1Var.ZpBGe2uQfcn8.oh71FJcDz6S2();
                defpackage.fv fvVar = defpackage.fv.QiMR8OkAhezm;
                if (oh71FJcDz6S2 == fvVar && jp1Var.JhCgjQRTAOCT.getValue() == fvVar) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                boolean ZpBGe2uQfcn8 = defpackage.u90.ZpBGe2uQfcn8(0L, 0L);
                android.view.View view = ((defpackage.aj) obj).ZpBGe2uQfcn8;
                if (!ZpBGe2uQfcn8) {
                    return new defpackage.np(0L, defpackage.i61.giKS3J6vZuNy(view.getContext()).oCu53ZX2v4Ju(defpackage.w60.EPEWHACkMcF1(0L)));
                }
                android.content.Context context2 = view.getContext();
                android.content.Context context3 = context2;
                while (context3 instanceof android.content.ContextWrapper) {
                    if ((context3 instanceof android.app.Activity) || (context3 instanceof android.inputmethodservice.InputMethodService) || (context3 instanceof android.app.Application)) {
                        context = context3;
                    } else {
                        android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context3;
                        if (contextWrapper.getBaseContext() != null) {
                            context3 = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        android.content.res.Configuration configuration = context2.getResources().getConfiguration();
                        defpackage.lp giKS3J6vZuNy = defpackage.i61.giKS3J6vZuNy(context2);
                        long fWTAfUmVKrZq = defpackage.la0.fWTAfUmVKrZq(configuration.screenWidthDp, configuration.screenHeightDp);
                        long fhbmYuu9J3cT = giKS3J6vZuNy.fhbmYuu9J3cT(fWTAfUmVKrZq);
                        return new defpackage.np((((int) java.lang.Float.intBitsToFloat((int) (fhbmYuu9J3cT >> 32))) << 32) | (((int) java.lang.Float.intBitsToFloat((int) (fhbmYuu9J3cT & 4294967295L))) & 4294967295L), fWTAfUmVKrZq);
                    }
                    defpackage.yw1.ZpBGe2uQfcn8.getClass();
                    defpackage.zw1 zw1Var = defpackage.xw1.giKS3J6vZuNy;
                    zw1Var.getClass();
                    android.content.ContextWrapper contextWrapper2 = (android.content.ContextWrapper) context;
                    int i2 = android.os.Build.VERSION.SDK_INT;
                    defpackage.ww1 giKS3J6vZuNy2 = (i2 >= 34 ? defpackage.jp.oh71FJcDz6S2 : i2 >= 30 ? defpackage.za.oh71FJcDz6S2 : defpackage.pa1.BHfvd2J71qpO).giKS3J6vZuNy(contextWrapper2, zw1Var.giKS3J6vZuNy);
                    long height = (giKS3J6vZuNy2.ZpBGe2uQfcn8().height() & 4294967295L) | (giKS3J6vZuNy2.ZpBGe2uQfcn8().width() << 32);
                    return new defpackage.np(height, defpackage.i61.giKS3J6vZuNy(context).oCu53ZX2v4Ju(defpackage.w60.EPEWHACkMcF1(height)));
                }
                if (context != null) {
                }
                break;
            case 4:
                ((defpackage.nz) obj).I9id0xDxCgYV();
                return gs1Var;
            case 5:
                java.lang.Object systemService = ((android.view.View) ((defpackage.a7) obj).giKS3J6vZuNy).getContext().getSystemService("input_method");
                systemService.getClass();
                return (android.view.inputmethod.InputMethodManager) systemService;
            case 6:
                defpackage.nd0 nd0Var = ((defpackage.jd0) obj).BXaznwstz2U0;
                nd0Var.XntWc4eZSQ8j.UmgHb6n58gfG = true;
                defpackage.qj0 qj0Var = nd0Var.WmetiUbpKU9I;
                if (qj0Var != null) {
                    qj0Var.IJ0hOnjhPOri = true;
                }
                return gs1Var;
            case 7:
                defpackage.pd0 pd0Var = (defpackage.pd0) obj;
                if (!((java.lang.Boolean) pd0Var.QiMR8OkAhezm.getValue()).booleanValue() && (ljVar = pd0Var.fWTAfUmVKrZq) != null) {
                    ljVar.fNwYGHIYeJcR();
                }
                return gs1Var;
            case 8:
                defpackage.yj0 yj0Var = (defpackage.yj0) ((defpackage.bh0) obj).ZpBGe2uQfcn8.oh71FJcDz6S2;
                if (!yj0Var.oh71FJcDz6S2) {
                    if (yj0Var.QiMR8OkAhezm) {
                        defpackage.h11.ZpBGe2uQfcn8("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    yj0Var.ZpBGe2uQfcn8();
                    yj0Var.QiMR8OkAhezm = true;
                }
                return gs1Var;
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                return (defpackage.sm) ((defpackage.s81) obj).P05cfTpS5W5L;
            case defpackage.n70.giKS3J6vZuNy /* 10 */:
                return ((defpackage.hr0) obj).YZh1E3mnTFwf();
            case 11:
                defpackage.a11 a11Var = (defpackage.a11) obj;
                parentLayoutCoordinates = a11Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != 0 && parentLayoutCoordinates.blKFvluuDQOf()) {
                    context = parentLayoutCoordinates;
                }
                if (context != null && a11Var.m2getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.n70.fWTAfUmVKrZq /* 12 */:
                defpackage.u31 u31Var = (defpackage.u31) obj;
                u31Var.P05cfTpS5W5L = null;
                android.os.Trace.beginSection("OnPositionedDispatch");
                try {
                    u31Var.ZpBGe2uQfcn8();
                    return gs1Var;
                } finally {
                    android.os.Trace.endSection();
                }
            case 13:
                defpackage.xd0 ZpBGe2uQfcn82 = ((defpackage.qh1) obj).ZpBGe2uQfcn8();
                defpackage.jd0 jd0Var = ZpBGe2uQfcn82.WDYagTQQm9ns;
                if (ZpBGe2uQfcn82.s0TASMVLSWD5 != ((defpackage.ho0) ((defpackage.qn0) jd0Var.T1fB7bDYiVJQ()).oh71FJcDz6S2).QiMR8OkAhezm) {
                    defpackage.yn0 yn0Var = ZpBGe2uQfcn82.GE9mJIPrb8gP;
                    java.lang.Object[] objArr = yn0Var.fWTAfUmVKrZq;
                    long[] jArr = yn0Var.ZpBGe2uQfcn8;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((defpackage.pd0) objArr[(i3 << 3) + i5]).JhCgjQRTAOCT = true;
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    if (jd0Var.fNwYGHIYeJcR != null) {
                        if (!jd0Var.BXaznwstz2U0.WDYagTQQm9ns) {
                            defpackage.jd0.CZa7MwI9IzLd(jd0Var, false, 7);
                        }
                    } else if (!jd0Var.WmetiUbpKU9I()) {
                        defpackage.jd0.z16KqenTjq8o(jd0Var, false, 7);
                    }
                }
                return gs1Var;
            case 14:
                return new android.view.inputmethod.BaseInputConnection(((defpackage.um1) obj).ZpBGe2uQfcn8, false);
            default:
                ((defpackage.dt1) obj).P05cfTpS5W5L.setValue(gs1Var);
                return gs1Var;
        }
    }
}
