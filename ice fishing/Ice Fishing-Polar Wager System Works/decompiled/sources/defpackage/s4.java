package defpackage;

/* loaded from: classes.dex */
public final class s4 extends defpackage.p90 implements defpackage.vz {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4(int i, java.lang.Object obj) {
        super(0);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020d  */
    @Override // defpackage.vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu() {
        defpackage.kh khVar;
        android.content.Context context = null;
        boolean z = false;
        switch (this.xiZrDbcSW0) {
            case 0:
                defpackage.li1 li1Var = (defpackage.li1) this.AARZUJiTa;
                java.lang.Object xiZrDbcSW0 = li1Var.IHQe1A4L2xu.xiZrDbcSW0();
                defpackage.st stVar = defpackage.st.AARZUJiTa;
                if (xiZrDbcSW0 == stVar && li1Var.F7NU4MC0GW.getValue() == stVar) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                defpackage.zg zgVar = (defpackage.zg) this.AARZUJiTa;
                boolean IHQe1A4L2xu = defpackage.i70.IHQe1A4L2xu(0L, 0L);
                android.view.View view = zgVar.IHQe1A4L2xu;
                if (!IHQe1A4L2xu) {
                    return new defpackage.wn(0L, defpackage.h1.r1MBDhnF(view.getContext()).kd6TUFXn(defpackage.j70.frpfPPIgqM9O(0L)));
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
                        defpackage.un r1MBDhnF = defpackage.h1.r1MBDhnF(context2);
                        long xiZrDbcSW02 = defpackage.ci0.xiZrDbcSW0(configuration.screenWidthDp, configuration.screenHeightDp);
                        long hkbnNdmy = r1MBDhnF.hkbnNdmy(xiZrDbcSW02);
                        return new defpackage.wn((((int) java.lang.Float.intBitsToFloat((int) (hkbnNdmy >> 32))) << 32) | (((int) java.lang.Float.intBitsToFloat((int) (hkbnNdmy & 4294967295L))) & 4294967295L), xiZrDbcSW02);
                    }
                    defpackage.dp1.IHQe1A4L2xu.getClass();
                    defpackage.ep1 ep1Var = defpackage.cp1.oh6vYeIP;
                    ep1Var.getClass();
                    android.content.ContextWrapper contextWrapper2 = (android.content.ContextWrapper) context;
                    int i = android.os.Build.VERSION.SDK_INT;
                    defpackage.bp1 adDC3e2L = (i >= 34 ? defpackage.sn.xiZrDbcSW0 : i >= 30 ? defpackage.w8.xiZrDbcSW0 : defpackage.ad1.ez2rX8ReCYw).adDC3e2L(contextWrapper2, ep1Var.oh6vYeIP);
                    long height = (adDC3e2L.IHQe1A4L2xu().height() & 4294967295L) | (adDC3e2L.IHQe1A4L2xu().width() << 32);
                    return new defpackage.wn(height, defpackage.h1.r1MBDhnF(context).kd6TUFXn(defpackage.j70.frpfPPIgqM9O(height)));
                }
                if (context != null) {
                }
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj = defpackage.hv.F7NU4MC0GW;
                java.io.File file = (java.io.File) this.AARZUJiTa;
                synchronized (obj) {
                    defpackage.hv.r1MBDhnF.remove(file.getAbsolutePath());
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.gy) this.AARZUJiTa).pm90rNzI5F();
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object systemService = ((android.view.View) ((defpackage.c1NqjJifC7) this.AARZUJiTa).xiZrDbcSW0).getContext().getSystemService("input_method");
                systemService.getClass();
                return (android.view.inputmethod.InputMethodManager) systemService;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.qa0 qa0Var = ((defpackage.ma0) this.AARZUJiTa).wll2JLbTBC2;
                qa0Var.QoRHpC4k.nBH8hAHy = true;
                defpackage.fg0 fg0Var = qa0Var.G3OKOH3wZRC;
                if (fg0Var != null) {
                    fg0Var.PAEGRtP0bX = true;
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.sa0 sa0Var = (defpackage.sa0) this.AARZUJiTa;
                if (!((java.lang.Boolean) sa0Var.AARZUJiTa.getValue()).booleanValue() && (khVar = sa0Var.r1MBDhnF) != null) {
                    khVar.JlrlGoKF();
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.mg0 mg0Var = (defpackage.mg0) ((defpackage.zd0) this.AARZUJiTa).IHQe1A4L2xu.xiZrDbcSW0;
                if (!mg0Var.xiZrDbcSW0) {
                    if (mg0Var.AARZUJiTa) {
                        defpackage.ow0.IHQe1A4L2xu("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    mg0Var.IHQe1A4L2xu();
                    mg0Var.AARZUJiTa = true;
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                return (defpackage.uj) ((defpackage.y) this.AARZUJiTa).EXtogiMhuM;
            case 9:
                return ((defpackage.xo0) this.AARZUJiTa).UVjEelCZ();
            case 10:
                java.io.File file2 = (java.io.File) ((defpackage.w5) this.AARZUJiTa).IHQe1A4L2xu();
                java.lang.String name = file2.getName();
                name.getClass();
                int lastIndexOf = name.lastIndexOf(46, name.length() - 1);
                if (!(lastIndexOf != -1 ? name.substring(lastIndexOf + 1, name.length()) : "").equals("preferences_pb")) {
                    defpackage.db.riuEU0zW4("File extension for file: ", file2, " does not match required extension for Preferences file: preferences_pb");
                    return null;
                }
                java.io.File absoluteFile = file2.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 11:
                defpackage.mz0 mz0Var = (defpackage.mz0) this.AARZUJiTa;
                mz0Var.EXtogiMhuM = null;
                android.os.Trace.beginSection("OnPositionedDispatch");
                try {
                    mz0Var.IHQe1A4L2xu();
                    android.os.Trace.endSection();
                    return defpackage.ok1.IHQe1A4L2xu;
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            case 12:
                defpackage.ab0 IHQe1A4L2xu2 = ((defpackage.fd1) this.AARZUJiTa).IHQe1A4L2xu();
                defpackage.ma0 ma0Var = IHQe1A4L2xu2.adDC3e2L;
                if (IHQe1A4L2xu2.kd6TUFXn != ((defpackage.ul0) ma0Var.cnag84Bm()).adDC3e2L.AARZUJiTa) {
                    defpackage.nl0 nl0Var = IHQe1A4L2xu2.SH1y5HwkJhh;
                    java.lang.Object[] objArr = nl0Var.r1MBDhnF;
                    long[] jArr = nl0Var.IHQe1A4L2xu;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((defpackage.sa0) objArr[(i2 << 3) + i4]).F7NU4MC0GW = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (ma0Var.JlrlGoKF != null) {
                        if (!ma0Var.wll2JLbTBC2.adDC3e2L) {
                            defpackage.ma0.Ye0N2xE9Hc(ma0Var, false, 7);
                        }
                    } else if (!ma0Var.G3OKOH3wZRC()) {
                        defpackage.ma0.wKlPRKlRnfqr(ma0Var, false, 7);
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
            default:
                return new android.view.inputmethod.BaseInputConnection(((defpackage.mf1) this.AARZUJiTa).IHQe1A4L2xu, false);
        }
    }
}
