package f1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f2219a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static Method f2220b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f2221c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2222d;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f10, float f11, float f12, float f13, g1.c cVar) {
        int i10;
        int i11;
        int i12;
        float b2;
        float a6;
        int i13;
        int i14;
        int i15;
        int i16;
        float b10;
        float a8;
        int i17;
        int i18;
        int i19;
        if (cVar.c()) {
            float f14 = f13 < 0.0f ? 0.0f : f13;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i20 = ((int) ((f14 * 255.0f) + 0.5f)) << 24;
            float f15 = f10 < 0.0f ? 0.0f : f10;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i21 = i20 | (((int) ((f15 * 255.0f) + 0.5f)) << 16);
            float f16 = f11 < 0.0f ? 0.0f : f11;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i22 = i21 | (((int) ((f16 * 255.0f) + 0.5f)) << 8);
            long j3 = (i22 | ((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i23 = q.f2284i;
            return j3;
        }
        long j6 = cVar.f2427b;
        int i24 = g1.b.f2425e;
        if (((int) (j6 >> 32)) != 3) {
            x.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = cVar.f2428c;
        if (i25 == -1) {
            x.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b11 = cVar.b(0);
        float a10 = cVar.a(0);
        if (f10 >= b11) {
            b11 = f10;
        }
        if (b11 <= a10) {
            a10 = b11;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a10);
        int i26 = floatToRawIntBits >>> 31;
        int i27 = (floatToRawIntBits >>> 23) & 255;
        int i28 = floatToRawIntBits & 8388607;
        if (i27 == 255) {
            i11 = i28 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i27 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else if (i10 > 0) {
                int i29 = i28 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i12 = (((i10 << 10) | i29) + 1) | (i26 << 15);
                    short s10 = (short) i12;
                    b2 = cVar.b(1);
                    a6 = cVar.a(1);
                    if (f11 >= b2) {
                        b2 = f11;
                    }
                    if (b2 <= a6) {
                        a6 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a6);
                    int i30 = floatToRawIntBits2 >>> 31;
                    i13 = (floatToRawIntBits2 >>> 23) & 255;
                    int i31 = floatToRawIntBits2 & 8388607;
                    if (i13 != 255) {
                        i15 = i31 != 0 ? 512 : 0;
                        i14 = 31;
                    } else {
                        i14 = i13 - 112;
                        if (i14 >= 31) {
                            i15 = 0;
                            i14 = 49;
                        } else if (i14 > 0) {
                            int i32 = i31 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i16 = (((i14 << 10) | i32) + 1) | (i30 << 15);
                                short s11 = (short) i16;
                                b10 = cVar.b(2);
                                a8 = cVar.a(2);
                                if (f12 >= b10) {
                                    b10 = f12;
                                }
                                if (b10 <= a8) {
                                    a8 = b10;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a8);
                                int i33 = floatToRawIntBits3 >>> 31;
                                i17 = (floatToRawIntBits3 >>> 23) & 255;
                                int i34 = 8388607 & floatToRawIntBits3;
                                if (i17 == 255) {
                                    i18 = i34 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i35 = i17 - 112;
                                    if (i35 >= 31) {
                                        i18 = 0;
                                        r7 = 49;
                                    } else if (i35 > 0) {
                                        int i36 = i34 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i19 = (((i35 << 10) | i36) + 1) | (i33 << 15);
                                            long j10 = (i25 & 63) | ((s10 & 65535) << 48) | ((s11 & 65535) << 32) | ((65535 & ((short) i19)) << 16) | ((((int) ((((f13 >= 0.0f ? f13 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i37 = q.f2284i;
                                            return j10;
                                        }
                                        i18 = i36;
                                        r7 = i35;
                                    } else if (i35 >= -10) {
                                        int i38 = (i34 | 8388608) >> (1 - i35);
                                        if ((i38 & 4096) != 0) {
                                            i38 += 8192;
                                        }
                                        i18 = i38 >> 13;
                                    } else {
                                        i18 = 0;
                                    }
                                }
                                i19 = i18 | (i33 << 15) | (r7 << 10);
                                if (f13 >= 0.0f) {
                                }
                                long j102 = (i25 & 63) | ((s10 & 65535) << 48) | ((s11 & 65535) << 32) | ((65535 & ((short) i19)) << 16) | ((((int) ((((f13 >= 0.0f ? f13 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i372 = q.f2284i;
                                return j102;
                            }
                            i15 = i32;
                        } else if (i14 >= -10) {
                            int i39 = (i31 | 8388608) >> (1 - i14);
                            if ((i39 & 4096) != 0) {
                                i39 += 8192;
                            }
                            i15 = i39 >> 13;
                            i14 = 0;
                        } else {
                            i15 = 0;
                            i14 = 0;
                        }
                    }
                    i16 = i15 | (i30 << 15) | (i14 << 10);
                    short s112 = (short) i16;
                    b10 = cVar.b(2);
                    a8 = cVar.a(2);
                    if (f12 >= b10) {
                    }
                    if (b10 <= a8) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a8);
                    int i332 = floatToRawIntBits32 >>> 31;
                    i17 = (floatToRawIntBits32 >>> 23) & 255;
                    int i342 = 8388607 & floatToRawIntBits32;
                    if (i17 == 255) {
                    }
                    i19 = i18 | (i332 << 15) | (r7 << 10);
                    if (f13 >= 0.0f) {
                    }
                    long j1022 = (i25 & 63) | ((s10 & 65535) << 48) | ((s112 & 65535) << 32) | ((65535 & ((short) i19)) << 16) | ((((int) ((((f13 >= 0.0f ? f13 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i3722 = q.f2284i;
                    return j1022;
                }
                i11 = i29;
            } else if (i10 >= -10) {
                int i40 = (i28 | 8388608) >> (1 - i10);
                if ((i40 & 4096) != 0) {
                    i40 += 8192;
                }
                i11 = i40 >> 13;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
        }
        i12 = i11 | (i26 << 15) | (i10 << 10);
        short s102 = (short) i12;
        b2 = cVar.b(1);
        a6 = cVar.a(1);
        if (f11 >= b2) {
        }
        if (b2 <= a6) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a6);
        int i302 = floatToRawIntBits22 >>> 31;
        i13 = (floatToRawIntBits22 >>> 23) & 255;
        int i312 = floatToRawIntBits22 & 8388607;
        if (i13 != 255) {
        }
        i16 = i15 | (i302 << 15) | (i14 << 10);
        short s1122 = (short) i16;
        b10 = cVar.b(2);
        a8 = cVar.a(2);
        if (f12 >= b10) {
        }
        if (b10 <= a8) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a8);
        int i3322 = floatToRawIntBits322 >>> 31;
        i17 = (floatToRawIntBits322 >>> 23) & 255;
        int i3422 = 8388607 & floatToRawIntBits322;
        if (i17 == 255) {
        }
        i19 = i18 | (i3322 << 15) | (r7 << 10);
        if (f13 >= 0.0f) {
        }
        long j10222 = (i25 & 63) | ((s102 & 65535) << 48) | ((s1122 & 65535) << 32) | ((65535 & ((short) i19)) << 16) | ((((int) ((((f13 >= 0.0f ? f13 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i37222 = q.f2284i;
        return j10222;
    }

    public static final long b(int i10) {
        long j3 = i10 << 32;
        int i11 = q.f2284i;
        return j3;
    }

    public static final long c(long j3) {
        long j6 = j3 << 32;
        int i10 = q.f2284i;
        return j6;
    }

    public static long d(int i10, int i11, int i12) {
        return b(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
    
        if (r1 != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g e(int i10, int i11, int i12) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        ColorSpace rgb2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        g1.q qVar = g1.d.f2433e;
        t(i12);
        int i13 = Build.VERSION.SDK_INT;
        Bitmap.Config t3 = t(i12);
        if (pc.j.a(qVar, qVar)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (pc.j.a(qVar, g1.d.f2445q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (pc.j.a(qVar, g1.d.f2446r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (pc.j.a(qVar, g1.d.f2443o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (pc.j.a(qVar, g1.d.f2438j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (pc.j.a(qVar, g1.d.f2437i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (pc.j.a(qVar, g1.d.f2448t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (pc.j.a(qVar, g1.d.f2447s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (pc.j.a(qVar, g1.d.f2439k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (pc.j.a(qVar, g1.d.f2440l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (pc.j.a(qVar, g1.d.f2435g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (pc.j.a(qVar, g1.d.f2436h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (pc.j.a(qVar, g1.d.f2434f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (pc.j.a(qVar, g1.d.f2441m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (pc.j.a(qVar, g1.d.f2444p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (pc.j.a(qVar, g1.d.f2442n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (i13 >= 34) {
                if (pc.j.a(qVar, g1.d.f2450v)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    rgb2 = ColorSpace.get(named2);
                } else if (pc.j.a(qVar, g1.d.f2451w)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    rgb2 = ColorSpace.get(named);
                } else {
                    rgb2 = null;
                }
            }
            if (qVar != null) {
                String str = qVar.f2426a;
                float[] a6 = qVar.f2481d.a();
                g1.r rVar = qVar.f2484g;
                ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f2496b, rVar.f2497c, rVar.f2498d, rVar.f2499e, rVar.f2500f, rVar.f2501g, rVar.f2495a) : null;
                if (transferParameters != null) {
                    rgb2 = new ColorSpace.Rgb(str, qVar.f2485h, a6, transferParameters);
                    rgb = rgb2;
                    return new g(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, t3, true, rgb));
                }
                float[] fArr = qVar.f2485h;
                final g1.p pVar = qVar.f2489l;
                final int i14 = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: f1.r
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d10) {
                        switch (i14) {
                        }
                        return ((Number) pVar.invoke(Double.valueOf(d10))).doubleValue();
                    }
                };
                final g1.p pVar2 = qVar.f2492o;
                final int i15 = 1;
                rgb = new ColorSpace.Rgb(str, fArr, a6, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: f1.r
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d10) {
                        switch (i15) {
                        }
                        return ((Number) pVar2.invoke(Double.valueOf(d10))).doubleValue();
                    }
                }, qVar.f2482e, qVar.f2483f);
                return new g(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, t3, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        rgb = colorSpace;
        return new g(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, t3, true, rgb));
    }

    public static final l6.l f() {
        return new l6.l(new Paint(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long h(long j3, long j6) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long a6 = q.a(j3, q.f(j6));
        float d10 = q.d(j6);
        float d11 = q.d(a6);
        float f10 = 1.0f - d11;
        float f11 = (d10 * f10) + d11;
        float h10 = f11 == 0.0f ? 0.0f : (((q.h(j6) * d10) * f10) + (q.h(a6) * d11)) / f11;
        float g8 = f11 == 0.0f ? 0.0f : (((q.g(j6) * d10) * f10) + (q.g(a6) * d11)) / f11;
        float e10 = f11 == 0.0f ? 0.0f : (((q.e(j6) * d10) * f10) + (q.e(a6) * d11)) / f11;
        if (q.f(j6).c()) {
            return (((int) ((e10 * 255.0f) + 0.5f)) | (((((int) ((f11 * 255.0f) + 0.5f)) << 24) | (((int) ((h10 * 255.0f) + 0.5f)) << 16)) | (((int) ((g8 * 255.0f) + 0.5f)) << 8))) << 32;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(h10);
        int i19 = floatToRawIntBits >>> 31;
        int i20 = (floatToRawIntBits >>> 23) & 255;
        int i21 = floatToRawIntBits & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i11 = i21 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i20 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else if (i10 > 0) {
                int i24 = i21 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i12 = (((i10 << 10) | i24) + 1) | (i19 << 15);
                    short s10 = (short) i12;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(g8);
                    int i25 = floatToRawIntBits2 >>> 31;
                    i13 = (floatToRawIntBits2 >>> 23) & 255;
                    int i26 = floatToRawIntBits2 & 8388607;
                    if (i13 != 255) {
                        i15 = i26 != 0 ? 512 : 0;
                        i14 = 31;
                    } else {
                        i14 = i13 - 112;
                        if (i14 >= 31) {
                            i14 = 49;
                            i15 = 0;
                        } else if (i14 > 0) {
                            int i27 = i26 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i16 = (((i14 << 10) | i27) + 1) | (i25 << 15);
                                short s11 = (short) i16;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(e10);
                                int i28 = floatToRawIntBits3 >>> 31;
                                i17 = (floatToRawIntBits3 >>> 23) & 255;
                                int i29 = 8388607 & floatToRawIntBits3;
                                if (i17 == 255) {
                                    i22 = 31;
                                    i23 = i29 == 0 ? 0 : 512;
                                } else {
                                    int i30 = i17 - 112;
                                    if (i30 < 31) {
                                        if (i30 > 0) {
                                            i23 = i29 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i18 = (((i30 << 10) | i23) + 1) | (i28 << 15);
                                                return ((((short) i18) & 65535) << 16) | ((s10 & 65535) << 48) | ((s11 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f2428c & 63);
                                            }
                                            i22 = i30;
                                        } else if (i30 >= -10) {
                                            int i31 = (i29 | 8388608) >> (1 - i30);
                                            if ((i31 & 4096) != 0) {
                                                i31 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i31 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                }
                                i18 = (i28 << 15) | (i22 << 10) | i23;
                                return ((((short) i18) & 65535) << 16) | ((s10 & 65535) << 48) | ((s11 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f2428c & 63);
                            }
                            i15 = i27;
                        } else if (i14 >= -10) {
                            int i32 = (i26 | 8388608) >> (1 - i14);
                            if ((i32 & 4096) != 0) {
                                i32 += 8192;
                            }
                            i15 = i32 >> 13;
                            i14 = 0;
                        } else {
                            i15 = 0;
                            i14 = 0;
                        }
                    }
                    i16 = i15 | (i25 << 15) | (i14 << 10);
                    short s112 = (short) i16;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(e10);
                    int i282 = floatToRawIntBits32 >>> 31;
                    i17 = (floatToRawIntBits32 >>> 23) & 255;
                    int i292 = 8388607 & floatToRawIntBits32;
                    if (i17 == 255) {
                    }
                    i18 = (i282 << 15) | (i22 << 10) | i23;
                    return ((((short) i18) & 65535) << 16) | ((s10 & 65535) << 48) | ((s112 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f2428c & 63);
                }
                i11 = i24;
            } else if (i10 >= -10) {
                int i33 = (i21 | 8388608) >> (1 - i10);
                if ((i33 & 4096) != 0) {
                    i33 += 8192;
                }
                i11 = i33 >> 13;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
        }
        i12 = i11 | (i19 << 15) | (i10 << 10);
        short s102 = (short) i12;
        int floatToRawIntBits22 = Float.floatToRawIntBits(g8);
        int i252 = floatToRawIntBits22 >>> 31;
        i13 = (floatToRawIntBits22 >>> 23) & 255;
        int i262 = floatToRawIntBits22 & 8388607;
        if (i13 != 255) {
        }
        i16 = i15 | (i252 << 15) | (i14 << 10);
        short s1122 = (short) i16;
        int floatToRawIntBits322 = Float.floatToRawIntBits(e10);
        int i2822 = floatToRawIntBits322 >>> 31;
        i17 = (floatToRawIntBits322 >>> 23) & 255;
        int i2922 = 8388607 & floatToRawIntBits322;
        if (i17 == 255) {
        }
        i18 = (i2822 << 15) | (i22 << 10) | i23;
        return ((((short) i18) & 65535) << 16) | ((s102 & 65535) << 48) | ((s1122 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f2428c & 63);
    }

    public static float[] i() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static void j(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f2222d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f2220b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f2221c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f2220b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f2221c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f2220b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f2221c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f2222d = true;
        }
        if (z10) {
            try {
                Method method4 = f2220b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f2221c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean k(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final float l(long j3) {
        g1.c f10 = q.f(j3);
        if (!g1.b.a(f10.f2427b, g1.b.f2421a)) {
            x.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) g1.b.b(f10.f2427b)));
        }
        g1.m mVar = ((g1.q) f10).f2493p;
        double c3 = mVar.c(q.h(j3));
        float c7 = (float) ((mVar.c(q.e(j3)) * 0.0722d) + (mVar.c(q.g(j3)) * 0.7152d) + (c3 * 0.2126d));
        if (c7 < 0.0f) {
            c7 = 0.0f;
        }
        if (c7 > 1.0f) {
            return 1.0f;
        }
        return c7;
    }

    public static final long m(float[] fArr, long j3) {
        if (fArr.length < 16) {
            return j3;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f19 = 1 / (((f15 * intBitsToFloat2) + (f12 * intBitsToFloat)) + f18);
        if ((Float.floatToRawIntBits(f19) & Integer.MAX_VALUE) >= 2139095040) {
            f19 = 0.0f;
        }
        float f20 = ((f14 * intBitsToFloat2) + (f11 * intBitsToFloat) + f17) * f19;
        return (Float.floatToRawIntBits((((f13 * intBitsToFloat2) + (f10 * intBitsToFloat)) + f16) * f19) << 32) | (Float.floatToRawIntBits(f20) & 4294967295L);
    }

    public static final void n(float[] fArr, e1.a aVar) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float f19 = aVar.f1925a;
        float f20 = aVar.f1926b;
        float f21 = aVar.f1927c;
        float f22 = aVar.f1928d;
        float f23 = f12 * f19;
        float f24 = f15 * f20;
        float f25 = 1.0f / ((f23 + f24) + f18);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f10 * f19;
        float f27 = f13 * f20;
        float f28 = (f26 + f27 + f16) * f25;
        float f29 = f19 * f11;
        float f30 = f20 * f14;
        float f31 = (f29 + f30 + f17) * f25;
        float f32 = f15 * f22;
        float f33 = 1.0f / ((f23 + f32) + f18);
        if ((Float.floatToRawIntBits(f33) & Integer.MAX_VALUE) >= 2139095040) {
            f33 = 0.0f;
        }
        float f34 = f13 * f22;
        float f35 = (f26 + f34 + f16) * f33;
        float f36 = f14 * f22;
        float f37 = (f29 + f36 + f17) * f33;
        float f38 = f12 * f21;
        float f39 = 1.0f / ((f24 + f38) + f18);
        if ((Float.floatToRawIntBits(f39) & Integer.MAX_VALUE) >= 2139095040) {
            f39 = 0.0f;
        }
        float f40 = f10 * f21;
        float f41 = (f40 + f27 + f16) * f39;
        float f42 = f21 * f11;
        float f43 = (f30 + f42 + f17) * f39;
        float f44 = 1.0f / ((f38 + f32) + f18);
        float f45 = (Float.floatToRawIntBits(f44) & Integer.MAX_VALUE) < 2139095040 ? f44 : 0.0f;
        float f46 = (f40 + f34 + f16) * f45;
        float f47 = (f42 + f36 + f17) * f45;
        aVar.f1925a = Math.min(f28, Math.min(f35, Math.min(f41, f46)));
        aVar.f1926b = Math.min(f31, Math.min(f37, Math.min(f43, f47)));
        aVar.f1927c = Math.max(f28, Math.max(f35, Math.max(f41, f46)));
        aVar.f1928d = Math.max(f31, Math.max(f37, Math.max(f43, f47)));
    }

    public static final void o(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void p(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final BlendMode q(int i10) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i10 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i10 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i10 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i10 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i10 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i10 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i10 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i10 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i10 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i10 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i10 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i10 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i10 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i10 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i10 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i10 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i10 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i10 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i10 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i10 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i10 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i10 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i10 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i10 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i10 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i10 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i10 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i10 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i10 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect r(s2.j jVar) {
        return new Rect(jVar.f6391a, jVar.f6392b, jVar.f6393c, jVar.f6394d);
    }

    public static final int s(long j3) {
        float[] fArr = g1.d.f2429a;
        return (int) (q.a(j3, g1.d.f2433e) >>> 32);
    }

    public static final Bitmap.Config t(int i10) {
        return i10 == 0 ? Bitmap.Config.ARGB_8888 : i10 == 1 ? Bitmap.Config.ALPHA_8 : i10 == 2 ? Bitmap.Config.RGB_565 : i10 == 3 ? Bitmap.Config.RGBA_F16 : i10 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final e1.c u(Rect rect) {
        return new e1.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final PorterDuff.Mode v(int i10) {
        return i10 == 0 ? PorterDuff.Mode.CLEAR : i10 == 1 ? PorterDuff.Mode.SRC : i10 == 2 ? PorterDuff.Mode.DST : i10 == 3 ? PorterDuff.Mode.SRC_OVER : i10 == 4 ? PorterDuff.Mode.DST_OVER : i10 == 5 ? PorterDuff.Mode.SRC_IN : i10 == 6 ? PorterDuff.Mode.DST_IN : i10 == 7 ? PorterDuff.Mode.SRC_OUT : i10 == 8 ? PorterDuff.Mode.DST_OUT : i10 == 9 ? PorterDuff.Mode.SRC_ATOP : i10 == 10 ? PorterDuff.Mode.DST_ATOP : i10 == 11 ? PorterDuff.Mode.XOR : i10 == 12 ? PorterDuff.Mode.ADD : i10 == 14 ? PorterDuff.Mode.SCREEN : i10 == 15 ? PorterDuff.Mode.OVERLAY : i10 == 16 ? PorterDuff.Mode.DARKEN : i10 == 17 ? PorterDuff.Mode.LIGHTEN : i10 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String w(int i10) {
        return i10 == 0 ? "Clear" : i10 == 1 ? "Src" : i10 == 2 ? "Dst" : i10 == 3 ? "SrcOver" : i10 == 4 ? "DstOver" : i10 == 5 ? "SrcIn" : i10 == 6 ? "DstIn" : i10 == 7 ? "SrcOut" : i10 == 8 ? "DstOut" : i10 == 9 ? "SrcAtop" : i10 == 10 ? "DstAtop" : i10 == 11 ? "Xor" : i10 == 12 ? "Plus" : i10 == 13 ? "Modulate" : i10 == 14 ? "Screen" : i10 == 15 ? "Overlay" : i10 == 16 ? "Darken" : i10 == 17 ? "Lighten" : i10 == 18 ? "ColorDodge" : i10 == 19 ? "ColorBurn" : i10 == 20 ? "HardLight" : i10 == 21 ? "Softlight" : i10 == 22 ? "Difference" : i10 == 23 ? "Exclusion" : i10 == 24 ? "Multiply" : i10 == 25 ? "Hue" : i10 == 26 ? "Saturation" : i10 == 27 ? "Color" : i10 == 28 ? "Luminosity" : "Unknown";
    }

    public static void x(float[] fArr, float f10, float f11) {
        if (fArr.length < 16) {
            return;
        }
        float f12 = (fArr[8] * 0.0f) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f13 = (fArr[9] * 0.0f) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f14 = (fArr[10] * 0.0f) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f15 = (fArr[11] * 0.0f) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public static final int y(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public abstract void g(float f10, long j3, l6.l lVar);
}
