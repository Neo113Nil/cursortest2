package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class dg {
    static {
        new java.lang.ThreadLocal();
    }

    public static int ZpBGe2uQfcn8(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        double pow = d4 > 0.0031308d ? (java.lang.Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double pow2 = d5 > 0.0031308d ? (java.lang.Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow3 = d6 > 0.0031308d ? (java.lang.Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int round = (int) java.lang.Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : java.lang.Math.min(round, 255);
        int round2 = (int) java.lang.Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : java.lang.Math.min(round2, 255);
        int round3 = (int) java.lang.Math.round(pow3 * 255.0d);
        return android.graphics.Color.rgb(min, min2, round3 >= 0 ? java.lang.Math.min(round3, 255) : 0);
    }
}
