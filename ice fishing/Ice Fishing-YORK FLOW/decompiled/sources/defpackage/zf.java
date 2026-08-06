package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class zf {
    public static float JhCgjQRTAOCT(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float WDYagTQQm9ns(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final android.graphics.ColorSpace ZpBGe2uQfcn8(defpackage.xf xfVar) {
        android.graphics.ColorSpace colorSpace;
        android.graphics.ColorSpace.Named named;
        android.graphics.ColorSpace.Named named2;
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.WDYagTQQm9ns)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.WmetiUbpKU9I)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACES);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.s0TASMVLSWD5)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACESCG);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.T1fB7bDYiVJQ)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ADOBE_RGB);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.GE9mJIPrb8gP)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.e6mdH7fiFuta)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT709);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.ZVVdXbWmyCSK)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_LAB);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.BHfvd2J71qpO)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_XYZ);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.Ns0WNyEWdPsk)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.fNwYGHIYeJcR)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.QiMR8OkAhezm)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.EXTENDED_SRGB);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.P05cfTpS5W5L)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.oh71FJcDz6S2)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_SRGB);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.h3m55N1URyyK)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.NTSC_1953);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.XntWc4eZSQ8j)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.gUjdnLbkVAaA)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SMPTE_C);
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.maCixPsq4ml2)) {
                named2 = android.graphics.ColorSpace.Named.BT2020_HLG;
                colorSpace = android.graphics.ColorSpace.get(named2);
            } else if (defpackage.ma0.QiMR8OkAhezm(xfVar, defpackage.ag.IJ0hOnjhPOri)) {
                named = android.graphics.ColorSpace.Named.BT2020_PQ;
                colorSpace = android.graphics.ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(xfVar instanceof defpackage.u51)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        java.lang.String str = xfVar.ZpBGe2uQfcn8;
        defpackage.u51 u51Var = (defpackage.u51) xfVar;
        float[] ZpBGe2uQfcn8 = u51Var.JhCgjQRTAOCT.ZpBGe2uQfcn8();
        defpackage.yo1 yo1Var = u51Var.QiMR8OkAhezm;
        android.graphics.ColorSpace.Rgb.TransferParameters transferParameters = yo1Var != null ? new android.graphics.ColorSpace.Rgb.TransferParameters(yo1Var.giKS3J6vZuNy, yo1Var.fWTAfUmVKrZq, yo1Var.JhCgjQRTAOCT, yo1Var.WDYagTQQm9ns, yo1Var.oh71FJcDz6S2, yo1Var.QiMR8OkAhezm, yo1Var.ZpBGe2uQfcn8) : null;
        float[] fArr = u51Var.e6mdH7fiFuta;
        final int i = 0;
        if (transferParameters != null) {
            android.graphics.ColorSpace.Rgb rgb = new android.graphics.ColorSpace.Rgb(str, u51Var.P05cfTpS5W5L, ZpBGe2uQfcn8, transferParameters);
            return (java.lang.Float.isNaN(fArr[0]) || java.util.Arrays.equals(rgb.getTransform(), fArr)) ? rgb : new android.graphics.ColorSpace.Rgb(str, fArr, transferParameters);
        }
        float[] fArr2 = u51Var.P05cfTpS5W5L;
        final defpackage.t51 t51Var = u51Var.fNwYGHIYeJcR;
        java.util.function.DoubleUnaryOperator doubleUnaryOperator = new java.util.function.DoubleUnaryOperator() { // from class: yf
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i2 = i;
                defpackage.y10 y10Var = t51Var;
                switch (i2) {
                }
                return ((java.lang.Number) y10Var.P05cfTpS5W5L(java.lang.Double.valueOf(d))).doubleValue();
            }
        };
        final defpackage.t51 t51Var2 = u51Var.T1fB7bDYiVJQ;
        final int i2 = 1;
        return new android.graphics.ColorSpace.Rgb(str, fArr2, ZpBGe2uQfcn8, doubleUnaryOperator, new java.util.function.DoubleUnaryOperator() { // from class: yf
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i22 = i2;
                defpackage.y10 y10Var = t51Var2;
                switch (i22) {
                }
                return ((java.lang.Number) y10Var.P05cfTpS5W5L(java.lang.Double.valueOf(d))).doubleValue();
            }
        }, u51Var.WDYagTQQm9ns, u51Var.oh71FJcDz6S2);
    }

    public static float fWTAfUmVKrZq(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static android.view.autofill.AutofillId giKS3J6vZuNy(android.view.View view) {
        return view.getAutofillId();
    }

    public static float oh71FJcDz6S2(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
