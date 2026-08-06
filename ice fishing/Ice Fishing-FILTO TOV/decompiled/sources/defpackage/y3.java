package defpackage;

import android.graphics.ColorSpace;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class y3 {
    public static boolean AvO7iQsrTN(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static float EljAMC1QTz(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final ColorSpace GWasM1elztuh(gc gcVar) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (o30.rQPn8YBR(gcVar, jc.OOA6hdeuvCS)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (o30.rQPn8YBR(gcVar, jc.YmKjaVtbfp5Z)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (o30.rQPn8YBR(gcVar, jc.Mjvvu5DE)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (o30.rQPn8YBR(gcVar, jc.iwATDS1i01k)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (o30.rQPn8YBR(gcVar, jc.JFJ3QoxA)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (o30.rQPn8YBR(gcVar, jc.mOu10nynGul)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (o30.rQPn8YBR(gcVar, jc.jivtDDk9H)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (o30.rQPn8YBR(gcVar, jc.mE4lRynR)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (o30.rQPn8YBR(gcVar, jc.rQPn8YBR)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (o30.rQPn8YBR(gcVar, jc.E7jCp8Ls)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (o30.rQPn8YBR(gcVar, jc.AvO7iQsrTN)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (o30.rQPn8YBR(gcVar, jc.encWxUiV2)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (o30.rQPn8YBR(gcVar, jc.EljAMC1QTz)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (o30.rQPn8YBR(gcVar, jc.XnEVoBF0td1l)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (o30.rQPn8YBR(gcVar, jc.WIEu4Ya2g8)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (o30.rQPn8YBR(gcVar, jc.uFEq9NpZ)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (o30.rQPn8YBR(gcVar, jc.cilMamHF)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (o30.rQPn8YBR(gcVar, jc.lv06NcmrQ)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(gcVar instanceof gv0)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = gcVar.GWasM1elztuh;
        gv0 gv0Var = (gv0) gcVar;
        float[] GWasM1elztuh = gv0Var.xqGvceK5x.GWasM1elztuh();
        fa1 fa1Var = gv0Var.AvO7iQsrTN;
        ColorSpace.Rgb.TransferParameters transferParameters = fa1Var != null ? new ColorSpace.Rgb.TransferParameters(fa1Var.Yi7zF1RB1, fa1Var.X1lG3V04pd, fa1Var.xqGvceK5x, fa1Var.OOA6hdeuvCS, fa1Var.EljAMC1QTz, fa1Var.AvO7iQsrTN, fa1Var.GWasM1elztuh) : null;
        float[] fArr = gv0Var.mOu10nynGul;
        final int i = 0;
        if (transferParameters != null) {
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, gv0Var.encWxUiV2, GWasM1elztuh, transferParameters);
            return (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) ? rgb : new ColorSpace.Rgb(str, fArr, transferParameters);
        }
        float[] fArr2 = gv0Var.encWxUiV2;
        final fv0 fv0Var = gv0Var.E7jCp8Ls;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: hc
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i2 = i;
                hv hvVar = fv0Var;
                switch (i2) {
                }
                return ((Number) hvVar.mOu10nynGul(Double.valueOf(d))).doubleValue();
            }
        };
        final fv0 fv0Var2 = gv0Var.iwATDS1i01k;
        final int i2 = 1;
        return new ColorSpace.Rgb(str, fArr2, GWasM1elztuh, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: hc
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i22 = i2;
                hv hvVar = fv0Var2;
                switch (i22) {
                }
                return ((Number) hvVar.mOu10nynGul(Double.valueOf(d))).doubleValue();
            }
        }, gv0Var.OOA6hdeuvCS, gv0Var.EljAMC1QTz);
    }

    public static float OOA6hdeuvCS(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float X1lG3V04pd(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static AutofillId Yi7zF1RB1(View view) {
        return view.getAutofillId();
    }

    public static float xqGvceK5x(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }
}
