package defpackage;

/* loaded from: classes.dex */
public abstract class p5 {
    public static boolean AARZUJiTa(java.io.File file, java.io.File file2) {
        try {
            java.nio.file.Files.move(file.toPath(), file2.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static float F7NU4MC0GW(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static final android.graphics.ColorSpace IHQe1A4L2xu(defpackage.ie ieVar) {
        android.graphics.ColorSpace colorSpace;
        android.graphics.ColorSpace.Named named;
        android.graphics.ColorSpace.Named named2;
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.adDC3e2L)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.G3OKOH3wZRC)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACES);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.kd6TUFXn)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACESCG);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.cnag84Bm)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ADOBE_RGB);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.SH1y5HwkJhh)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.riuEU0zW4)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT709);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.fnWB2E7cs)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_LAB);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.EgCjBq0SZwJ)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_XYZ);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.ez2rX8ReCYw)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.JlrlGoKF)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.AARZUJiTa)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.EXTENDED_SRGB);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.EXtogiMhuM)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.xiZrDbcSW0)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_SRGB);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.DFo87pBq1E5)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.NTSC_1953);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.QoRHpC4k)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.SyNS6RMn)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SMPTE_C);
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.V7bD7b8KA)) {
                named2 = android.graphics.ColorSpace.Named.BT2020_HLG;
                colorSpace = android.graphics.ColorSpace.get(named2);
            } else if (defpackage.x70.QoRHpC4k(ieVar, defpackage.le.PAEGRtP0bX)) {
                named = android.graphics.ColorSpace.Named.BT2020_PQ;
                colorSpace = android.graphics.ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(ieVar instanceof defpackage.d21)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        java.lang.String str = ieVar.IHQe1A4L2xu;
        defpackage.d21 d21Var = (defpackage.d21) ieVar;
        float[] IHQe1A4L2xu = d21Var.F7NU4MC0GW.IHQe1A4L2xu();
        defpackage.bi1 bi1Var = d21Var.AARZUJiTa;
        android.graphics.ColorSpace.Rgb.TransferParameters transferParameters = bi1Var != null ? new android.graphics.ColorSpace.Rgb.TransferParameters(bi1Var.oh6vYeIP, bi1Var.r1MBDhnF, bi1Var.F7NU4MC0GW, bi1Var.adDC3e2L, bi1Var.xiZrDbcSW0, bi1Var.AARZUJiTa, bi1Var.IHQe1A4L2xu) : null;
        float[] fArr = d21Var.riuEU0zW4;
        final int i = 0;
        if (transferParameters != null) {
            android.graphics.ColorSpace.Rgb rgb = new android.graphics.ColorSpace.Rgb(str, d21Var.EXtogiMhuM, IHQe1A4L2xu, transferParameters);
            return (java.lang.Float.isNaN(fArr[0]) || java.util.Arrays.equals(rgb.getTransform(), fArr)) ? rgb : new android.graphics.ColorSpace.Rgb(str, fArr, transferParameters);
        }
        float[] fArr2 = d21Var.EXtogiMhuM;
        final defpackage.c21 c21Var = d21Var.JlrlGoKF;
        java.util.function.DoubleUnaryOperator doubleUnaryOperator = new java.util.function.DoubleUnaryOperator() { // from class: je
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i2 = i;
                defpackage.g00 g00Var = c21Var;
                switch (i2) {
                }
                return ((java.lang.Number) g00Var.AARZUJiTa(java.lang.Double.valueOf(d))).doubleValue();
            }
        };
        final defpackage.c21 c21Var2 = d21Var.cnag84Bm;
        final int i2 = 1;
        return new android.graphics.ColorSpace.Rgb(str, fArr2, IHQe1A4L2xu, doubleUnaryOperator, new java.util.function.DoubleUnaryOperator() { // from class: je
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i22 = i2;
                defpackage.g00 g00Var = c21Var2;
                switch (i22) {
                }
                return ((java.lang.Number) g00Var.AARZUJiTa(java.lang.Double.valueOf(d))).doubleValue();
            }
        }, d21Var.adDC3e2L, d21Var.xiZrDbcSW0);
    }

    public static float adDC3e2L(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static android.view.autofill.AutofillId oh6vYeIP(android.view.View view) {
        return view.getAutofillId();
    }

    public static float r1MBDhnF(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float xiZrDbcSW0(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
