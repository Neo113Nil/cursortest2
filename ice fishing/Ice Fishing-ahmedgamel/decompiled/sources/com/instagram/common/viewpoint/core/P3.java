package com.instagram.common.viewpoint.core;

import android.graphics.Color;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class P3 {
    public static byte[] A00;
    public static String[] A01 = {"OxqqmxACKcMb9rgd4flgeoqO4FLkDXK8", "hO921EE08Z5YovLaOXzv", "4KPhJxryuqZouci8ltOnoaa6GepMOFR6", "Qaf3Cf9SMgDDqCFg3avrhgzCiMtnLJnE", "vZFktEahG3bWOXRkYAMaCi8nGdaO1v3Q", "tZHqmUfqpLYo8cwpqndw", "zlaA7TXYCJ", "adeIrckSIlUrZ7yW4ZooAIUWBthMSkAF"};
    public static final ThreadLocal<double[]> A02;

    public static String A07(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{26, 23, 11, 19, 26, 91, 22, 14, 8, 15, 91, 25, 30, 91, 25, 30, 15, 12, 30, 30, 21, 91, 75, 91, 26, 21, 31, 91, 73, 78, 78, 85, 59, 56, 58, 50, 62, 43, 54, 44, 55, 61, 121, 58, 56, 55, 121, 55, 54, 45, 121, 59, 60, 121, 45, 43, 56, 55, 42, 53, 44, 58, 60, 55, 45, 99, 121, 122, c.f17105c, 37, 36, 8, 41, 42, 112, 61, 37, 35, 36, 112, 56, 49, 38, 53, 112, 49, 112, 60, 53, 62, 55, 36, 56, 112, c.f17105c, 54, 112, 99, 126};
    }

    static {
        A08();
        A02 = new ThreadLocal<>();
    }

    public static double A00(int i) {
        double[] A0B = A0B();
        A0A(i, A0B);
        return A0B[1] / 100.0d;
    }

    public static double A01(int i, int i4) {
        if (Color.alpha(i4) == 255) {
            if (Color.alpha(i) < 255) {
                i = A04(i, i4);
            }
            double luminance2 = A00(i) + 0.05d;
            double luminance1 = A00(i4) + 0.05d;
            return Math.max(luminance2, luminance1) / Math.min(luminance2, luminance1);
        }
        throw new IllegalArgumentException(A07(32, 36, 97) + Integer.toHexString(i4));
    }

    public static int A02(int i, int i4) {
        if (i4 < 0 || i4 > 255) {
            throw new IllegalArgumentException(A07(0, 32, 67));
        }
        String[] strArr = A01;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[0] = "DAqAm14HDJv7tSHiVIRuluRO44d0lStM";
        return (16777215 & i) | (i4 << 24);
    }

    public static int A03(int i, int i4) {
        return 255 - (((255 - i4) * (255 - i)) / p.f9259b);
    }

    public static int A04(int i, int i4) {
        int alpha = Color.alpha(i4);
        int alpha2 = Color.alpha(i);
        int g9 = A03(alpha2, alpha);
        int fgAlpha = Color.red(i);
        int bgAlpha = Color.red(i4);
        int r9 = A06(fgAlpha, alpha2, bgAlpha, alpha, g9);
        int fgAlpha2 = Color.green(i);
        int bgAlpha2 = Color.green(i4);
        int a9 = A06(fgAlpha2, alpha2, bgAlpha2, alpha, g9);
        int fgAlpha3 = Color.blue(i);
        int bgAlpha3 = Color.blue(i4);
        return Color.argb(g9, r9, a9, A06(fgAlpha3, alpha2, bgAlpha3, alpha, g9));
    }

    public static int A05(int i, int i4, float f2) {
        float f9 = 1.0f - f2;
        float inverseRatio = Color.alpha(i4);
        float g9 = (Color.alpha(i) * f9) + (inverseRatio * f2);
        float inverseRatio2 = Color.red(i4);
        float r9 = (Color.red(i) * f9) + (inverseRatio2 * f2);
        float a9 = Color.green(i);
        float inverseRatio3 = Color.green(i4);
        float a10 = (a9 * f9) + (inverseRatio3 * f2);
        float inverseRatio4 = Color.blue(i4);
        float b9 = (Color.blue(i) * f9) + (inverseRatio4 * f2);
        return Color.argb((int) g9, (int) r9, (int) a10, (int) b9);
    }

    public static int A06(int i, int i4, int i6, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (((i * p.f9259b) * i4) + ((i6 * i9) * (255 - i4))) / (i10 * p.f9259b);
    }

    public static void A09(int i, int i4, int i6, double[] dArr) {
        double sb;
        double sr;
        double sb2;
        if (dArr.length == 3) {
            double sb3 = i / 255.0d;
            if (sb3 < 0.04045d) {
                sb = sb3 / 12.92d;
            } else {
                sb = Math.pow((sb3 + 0.055d) / 1.055d, 2.4d);
            }
            double sr2 = i4 / 255.0d;
            if (sr2 < 0.04045d) {
                sr = sr2 / 12.92d;
            } else {
                double sr3 = sr2 + 0.055d;
                if (A01[2].charAt(0) != 'Y') {
                    String[] strArr = A01;
                    strArr[3] = "aAOO9yx7jRsDtZ33Oh1YUTlwgCOJU7qQ";
                    strArr[4] = "tiIjGPCneBcQleUKUeg5FNX5aBHKyIuK";
                    sr = Math.pow(sr3 / 1.055d, 2.4d);
                }
                throw new RuntimeException();
            }
            double sb4 = i6 / 255.0d;
            if (sb4 >= 0.04045d) {
                String[] strArr2 = A01;
                if (strArr2[5].length() == strArr2[1].length()) {
                    String[] strArr3 = A01;
                    strArr3[5] = "axgx58ekBr3JsKBSYEIr";
                    strArr3[1] = "AyWuGeE7FNinezs3svxh";
                    double sg = 0.055d + sb4;
                    sb2 = Math.pow(sg / 1.055d, 2.4d);
                }
                throw new RuntimeException();
            }
            sb2 = sb4 / 12.92d;
            double sg2 = 0.4124d * sb;
            dArr[0] = (sg2 + (0.3576d * sr) + (0.1805d * sb2)) * 100.0d;
            double sg3 = 0.2126d * sb;
            dArr[1] = (sg3 + (0.7152d * sr) + (0.0722d * sb2)) * 100.0d;
            double sg4 = 0.0193d * sb;
            dArr[2] = (sg4 + (0.1192d * sr) + (0.9505d * sb2)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(A07(68, 31, 104));
    }

    public static void A0A(int i, double[] dArr) {
        A09(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static double[] A0B() {
        double[] dArr = A02.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A02.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
