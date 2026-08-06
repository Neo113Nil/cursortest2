package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lz0 {
    public final defpackage.oi0 JhCgjQRTAOCT;
    public final defpackage.jm ZpBGe2uQfcn8;
    public final defpackage.ma1 fWTAfUmVKrZq;
    public final android.content.Context giKS3J6vZuNy;
    public android.view.textclassifier.TextClassifier oh71FJcDz6S2;
    public final defpackage.to0 WDYagTQQm9ns = new defpackage.to0();
    public final defpackage.pw0 QiMR8OkAhezm = defpackage.w60.hH0RRJrNssvh(null);
    public final java.lang.Object P05cfTpS5W5L = new java.lang.Object();

    public lz0(defpackage.jm jmVar, android.content.Context context, defpackage.ma1 ma1Var, defpackage.oi0 oi0Var) {
        this.ZpBGe2uQfcn8 = jmVar;
        this.giKS3J6vZuNy = context;
        this.fWTAfUmVKrZq = ma1Var;
        this.JhCgjQRTAOCT = oi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object ZpBGe2uQfcn8(defpackage.lz0 lz0Var, java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassifier textClassifier, defpackage.ll llVar) {
        defpackage.iz0 iz0Var;
        int i;
        long j2;
        java.lang.CharSequence charSequence2;
        android.view.textclassifier.TextClassifier textClassifier2;
        defpackage.to0 to0Var;
        java.lang.Object obj;
        defpackage.xj1 xj1Var;
        defpackage.tm tmVar;
        boolean z;
        java.lang.Object obj2;
        android.view.textclassifier.TextClassification.Request.Builder defaultLocales;
        android.view.textclassifier.TextClassification.Request build;
        android.view.textclassifier.TextClassification classifyText;
        long j3;
        java.lang.CharSequence charSequence3;
        defpackage.to0 to0Var2 = lz0Var.WDYagTQQm9ns;
        defpackage.pw0 pw0Var = lz0Var.QiMR8OkAhezm;
        try {
            if (llVar instanceof defpackage.iz0) {
                iz0Var = (defpackage.iz0) llVar;
                int i2 = iz0Var.gUjdnLbkVAaA;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iz0Var.gUjdnLbkVAaA = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj3 = iz0Var.fNwYGHIYeJcR;
                    i = iz0Var.gUjdnLbkVAaA;
                    defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                    defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
                    if (i != 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj3);
                        iz0Var.P05cfTpS5W5L = charSequence;
                        iz0Var.e6mdH7fiFuta = textClassifier;
                        iz0Var.GE9mJIPrb8gP = to0Var2;
                        j2 = j;
                        iz0Var.Ns0WNyEWdPsk = j2;
                        iz0Var.gUjdnLbkVAaA = 1;
                        if (to0Var2.JhCgjQRTAOCT(iz0Var) == tmVar2) {
                            return tmVar2;
                        }
                        charSequence2 = charSequence;
                        textClassifier2 = textClassifier;
                        to0Var = to0Var2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j3 = iz0Var.Ns0WNyEWdPsk;
                            to0Var2 = iz0Var.GE9mJIPrb8gP;
                            classifyText = defpackage.jd.GE9mJIPrb8gP(iz0Var.e6mdH7fiFuta);
                            charSequence3 = iz0Var.P05cfTpS5W5L;
                            defpackage.b80.KrtOTfE6jiS2(obj3);
                            try {
                                pw0Var.setValue(new defpackage.xj1(charSequence3, j3, classifyText));
                                return gs1Var;
                            } finally {
                                to0Var2.giKS3J6vZuNy(null);
                            }
                        }
                        j2 = iz0Var.Ns0WNyEWdPsk;
                        to0Var = iz0Var.GE9mJIPrb8gP;
                        textClassifier2 = defpackage.jd.fNwYGHIYeJcR(iz0Var.e6mdH7fiFuta);
                        charSequence2 = iz0Var.P05cfTpS5W5L;
                        defpackage.b80.KrtOTfE6jiS2(obj3);
                    }
                    xj1Var = (defpackage.xj1) pw0Var.getValue();
                    if (xj1Var == null) {
                        try {
                            defpackage.ng1 ng1Var = defpackage.mz0.ZpBGe2uQfcn8;
                            tmVar = tmVar2;
                            if (defpackage.in1.giKS3J6vZuNy(j2, xj1Var.giKS3J6vZuNy)) {
                                if (defpackage.ma0.QiMR8OkAhezm(charSequence2, xj1Var.ZpBGe2uQfcn8)) {
                                    z = true;
                                    if (!z) {
                                        return gs1Var;
                                    }
                                    obj2 = null;
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            obj = null;
                            to0Var2.giKS3J6vZuNy(obj);
                            throw th;
                        }
                    } else {
                        tmVar = tmVar2;
                        obj2 = null;
                    }
                    to0Var2.giKS3J6vZuNy(obj2);
                    defpackage.NkfcFfdaVTox.T1fB7bDYiVJQ();
                    defaultLocales = defpackage.NkfcFfdaVTox.QiMR8OkAhezm(charSequence2, defpackage.in1.oh71FJcDz6S2(j2), defpackage.in1.WDYagTQQm9ns(j2)).setDefaultLocales(lz0Var.giKS3J6vZuNy());
                    build = defaultLocales.build();
                    classifyText = textClassifier2.classifyText(build);
                    iz0Var.P05cfTpS5W5L = charSequence2;
                    iz0Var.e6mdH7fiFuta = classifyText;
                    iz0Var.GE9mJIPrb8gP = to0Var2;
                    iz0Var.Ns0WNyEWdPsk = j2;
                    iz0Var.gUjdnLbkVAaA = 2;
                    if (to0Var2.JhCgjQRTAOCT(iz0Var) != tmVar) {
                        return tmVar;
                    }
                    j3 = j2;
                    charSequence3 = charSequence2;
                    pw0Var.setValue(new defpackage.xj1(charSequence3, j3, classifyText));
                    return gs1Var;
                }
            }
            xj1Var = (defpackage.xj1) pw0Var.getValue();
            if (xj1Var == null) {
            }
            to0Var2.giKS3J6vZuNy(obj2);
            defpackage.NkfcFfdaVTox.T1fB7bDYiVJQ();
            defaultLocales = defpackage.NkfcFfdaVTox.QiMR8OkAhezm(charSequence2, defpackage.in1.oh71FJcDz6S2(j2), defpackage.in1.WDYagTQQm9ns(j2)).setDefaultLocales(lz0Var.giKS3J6vZuNy());
            build = defaultLocales.build();
            classifyText = textClassifier2.classifyText(build);
            iz0Var.P05cfTpS5W5L = charSequence2;
            iz0Var.e6mdH7fiFuta = classifyText;
            iz0Var.GE9mJIPrb8gP = to0Var2;
            iz0Var.Ns0WNyEWdPsk = j2;
            iz0Var.gUjdnLbkVAaA = 2;
            if (to0Var2.JhCgjQRTAOCT(iz0Var) != tmVar) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            obj = null;
        }
        iz0Var = new defpackage.iz0(lz0Var, llVar);
        java.lang.Object obj32 = iz0Var.fNwYGHIYeJcR;
        i = iz0Var.gUjdnLbkVAaA;
        defpackage.gs1 gs1Var2 = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.tm tmVar22 = defpackage.tm.WDYagTQQm9ns;
        if (i != 0) {
        }
    }

    public final android.os.LocaleList giKS3J6vZuNy() {
        defpackage.oi0 oi0Var = this.JhCgjQRTAOCT;
        if (oi0Var == null) {
            return new android.os.LocaleList(((defpackage.ni0) defpackage.yy0.ZpBGe2uQfcn8.QiMR8OkAhezm().WDYagTQQm9ns.get(0)).ZpBGe2uQfcn8);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(oi0Var, 10));
        java.util.Iterator it = oi0Var.WDYagTQQm9ns.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.ni0) it.next()).ZpBGe2uQfcn8);
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
    }
}
