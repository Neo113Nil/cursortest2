package defpackage;

import android.graphics.Path;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public final class ur90 {
    public char a;
    public float[] b;

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        double d6 = ((d4 * sin) + (d3 * cos)) / d5;
        double d7 = f6;
        double d8 = ((d4 * cos) + ((-f) * sin)) / d7;
        double d9 = f4;
        double a = vfc.a(d9, sin, f3 * cos, d5);
        double d10 = d3;
        double a2 = vfc.a(d9, cos, (-f3) * sin, d7);
        double d11 = d6 - a;
        double d12 = d8 - a2;
        double d13 = (d6 + a) / 2.0d;
        double d14 = (d8 + a2) / 2.0d;
        double d15 = (d12 * d12) + (d11 * d11);
        if (d15 == 0.0d) {
            return;
        }
        double d16 = (1.0d / d15) - 0.25d;
        if (d16 < 0.0d) {
            float sqrt = (float) (Math.sqrt(d15) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * sqrt, sqrt * f6, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d16);
        double d17 = d11 * sqrt2;
        double d18 = sqrt2 * d12;
        if (z == z2) {
            d = d13 - d18;
            d2 = d14 + d17;
        } else {
            d = d13 + d18;
            d2 = d14 - d17;
        }
        double atan2 = Math.atan2(d8 - d2, d6 - d);
        double atan22 = Math.atan2(a2 - d2, a - d) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d19 = d * d5;
        double d20 = d2 * d7;
        double d21 = (d19 * cos) - (d20 * sin);
        double d22 = (d20 * cos) + (d19 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d23 = -d5;
        double d24 = d23 * cos2;
        double d25 = d7 * sin2;
        double d26 = (d24 * sin3) - (d25 * cos3);
        double d27 = d23 * sin2;
        double d28 = d7 * cos2;
        double d29 = (cos3 * d28) + (sin3 * d27);
        double d30 = atan22 / ceil;
        int i = 0;
        while (i < ceil) {
            double d31 = atan2 + d30;
            double sin4 = Math.sin(d31);
            double cos4 = Math.cos(d31);
            int i2 = i;
            double d32 = (((d5 * cos2) * cos4) + d21) - (d25 * sin4);
            double d33 = d21;
            double d34 = (d28 * sin4) + (d5 * sin2 * cos4) + d22;
            double d35 = (d24 * sin4) - (d25 * cos4);
            double d36 = (cos4 * d28) + (sin4 * d27);
            double d37 = d31 - atan2;
            double tan = Math.tan(d37 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d37)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d26 * sqrt3) + d10), (float) ((d29 * sqrt3) + d4), (float) (d32 - (sqrt3 * d35)), (float) (d34 - (sqrt3 * d36)), (float) d32, (float) d34);
            ceil = ceil;
            d30 = d30;
            d27 = d27;
            atan2 = d31;
            d29 = d36;
            d26 = d35;
            d10 = d32;
            i = i2 + 1;
            d4 = d34;
            d21 = d33;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(ur90[] ur90VarArr, Path path) {
        int i;
        int i2;
        float[] fArr;
        int i3;
        char c;
        float f;
        float f2;
        float[] fArr2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        Path path2 = path;
        int i4 = 6;
        float[] fArr3 = new float[6];
        int i5 = 0;
        char c2 = 'm';
        int i6 = 0;
        while (i6 < ur90VarArr.length) {
            ur90 ur90Var = ur90VarArr[i6];
            char c3 = ur90Var.a;
            float[] fArr4 = ur90Var.b;
            float f12 = fArr3[i5];
            float f13 = fArr3[1];
            float f14 = fArr3[2];
            float f15 = fArr3[3];
            float f16 = fArr3[4];
            float f17 = fArr3[5];
            switch (c3) {
                case 'A':
                case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i4;
                    break;
                case 'H':
                case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                case 'h':
                case HProv.PP_INFO /* 118 */:
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case HProv.PP_CACHE_SIZE /* 115 */:
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                default:
                    i = 2;
                    break;
            }
            float f18 = f13;
            float f19 = f16;
            float f20 = f17;
            float f21 = f12;
            int i7 = i5;
            while (i7 < fArr4.length) {
                if (c3 == 'A') {
                    i2 = i7;
                    fArr = fArr4;
                    i3 = i5;
                    float f22 = f18;
                    c = c3;
                    int i8 = i2 + 5;
                    int i9 = i2 + 6;
                    a(path, f21, f22, fArr[i8], fArr[i9], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i3, fArr[i2 + 4] != 0.0f ? 1 : i3);
                    f14 = fArr[i8];
                    f21 = f14;
                    f = fArr[i9];
                    f15 = f;
                } else if (c3 == 'C') {
                    i2 = i7;
                    c = c3;
                    fArr = fArr4;
                    i3 = i5;
                    int i10 = i2 + 2;
                    int i11 = i2 + 3;
                    int i12 = i2 + 4;
                    int i13 = i2 + 5;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i10], fArr[i11], fArr[i12], fArr[i13]);
                    float f23 = fArr[i12];
                    float f24 = fArr[i13];
                    f21 = f23;
                    f14 = fArr[i10];
                    f15 = fArr[i11];
                    f = f24;
                } else if (c3 != 'H') {
                    if (c3 != 'Q') {
                        i3 = i5;
                        if (c3 == 'V') {
                            i2 = i7;
                            c = c3;
                            fArr = fArr4;
                            path2.lineTo(f21, fArr[i2]);
                            f = fArr[i2];
                        } else if (c3 != 'a') {
                            if (c3 == 'c') {
                                i2 = i7;
                                int i14 = i2 + 2;
                                int i15 = i2 + 3;
                                int i16 = i2 + 4;
                                int i17 = i2 + 5;
                                path2.rCubicTo(fArr4[i2], fArr4[i2 + 1], fArr4[i14], fArr4[i15], fArr4[i16], fArr4[i17]);
                                float f25 = fArr4[i14] + f21;
                                float f26 = f18 + fArr4[i15];
                                f21 += fArr4[i16];
                                f18 += fArr4[i17];
                                f14 = f25;
                                f15 = f26;
                            } else if (c3 != 'h') {
                                if (c3 != 'q') {
                                    if (c3 != 'v') {
                                        if (c3 == 'L') {
                                            i2 = i7;
                                            int i18 = i2 + 1;
                                            path2.lineTo(fArr4[i2], fArr4[i18]);
                                            f7 = fArr4[i2];
                                            f = fArr4[i18];
                                        } else if (c3 == 'M') {
                                            i2 = i7;
                                            f7 = fArr4[i2];
                                            f = fArr4[i2 + 1];
                                            if (i2 > 0) {
                                                path2.lineTo(f7, f);
                                            } else {
                                                path2.moveTo(f7, f);
                                                f21 = f7;
                                                f19 = f21;
                                                f20 = f;
                                                c = c3;
                                                fArr = fArr4;
                                            }
                                        } else if (c3 == 'S') {
                                            i2 = i7;
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f21 = (f21 * 2.0f) - f14;
                                                f18 = (f18 * 2.0f) - f15;
                                            }
                                            float f27 = f21;
                                            int i19 = i2 + 1;
                                            int i20 = i2 + 2;
                                            int i21 = i2 + 3;
                                            path2.cubicTo(f27, f18, fArr4[i2], fArr4[i19], fArr4[i20], fArr4[i21]);
                                            f2 = fArr4[i2];
                                            f15 = fArr4[i19];
                                            f21 = fArr4[i20];
                                            f = fArr4[i21];
                                            c = c3;
                                            fArr = fArr4;
                                        } else if (c3 == 'T') {
                                            i2 = i7;
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f21 = (f21 * 2.0f) - f14;
                                                f18 = (f18 * 2.0f) - f15;
                                            }
                                            float f28 = f18;
                                            int i22 = i2 + 1;
                                            path2.quadTo(f21, f28, fArr4[i2], fArr4[i22]);
                                            f15 = f28;
                                            c = c3;
                                            fArr = fArr4;
                                            f14 = f21;
                                            f21 = fArr4[i2];
                                            f = fArr4[i22];
                                        } else if (c3 == 'l') {
                                            i2 = i7;
                                            int i23 = i2 + 1;
                                            path2.rLineTo(fArr4[i2], fArr4[i23]);
                                            f21 += fArr4[i2];
                                            f6 = fArr4[i23];
                                        } else if (c3 == 'm') {
                                            i2 = i7;
                                            float f29 = fArr4[i2];
                                            f21 += f29;
                                            float f30 = fArr4[i2 + 1];
                                            f18 += f30;
                                            if (i2 > 0) {
                                                path2.rLineTo(f29, f30);
                                            } else {
                                                path2.rMoveTo(f29, f30);
                                                fArr = fArr4;
                                                f19 = f21;
                                                f = f18;
                                                f20 = f;
                                                c = c3;
                                            }
                                        } else if (c3 == 's') {
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f8 = f18 - f15;
                                                f9 = f21 - f14;
                                            } else {
                                                f9 = 0.0f;
                                                f8 = 0.0f;
                                            }
                                            int i24 = i7 + 1;
                                            int i25 = i7 + 2;
                                            int i26 = i7 + 3;
                                            i2 = i7;
                                            path2.rCubicTo(f9, f8, fArr4[i7], fArr4[i24], fArr4[i25], fArr4[i26]);
                                            f3 = fArr4[i2] + f21;
                                            f4 = f18 + fArr4[i24];
                                            f21 += fArr4[i25];
                                            f5 = fArr4[i26];
                                        } else if (c3 != 't') {
                                            i2 = i7;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f10 = f21 - f14;
                                                f11 = f18 - f15;
                                            } else {
                                                f11 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i27 = i7 + 1;
                                            path2.rQuadTo(f10, f11, fArr4[i7], fArr4[i27]);
                                            float f31 = f10 + f21;
                                            float f32 = f18 + f11;
                                            f21 += fArr4[i7];
                                            f18 += fArr4[i27];
                                            f15 = f32;
                                            i2 = i7;
                                            f14 = f31;
                                        }
                                        f21 = f7;
                                        c = c3;
                                        fArr = fArr4;
                                    } else {
                                        i2 = i7;
                                        path2.rLineTo(0.0f, fArr4[i2]);
                                        f6 = fArr4[i2];
                                    }
                                    f18 += f6;
                                } else {
                                    i2 = i7;
                                    int i28 = i2 + 1;
                                    int i29 = i2 + 2;
                                    int i30 = i2 + 3;
                                    path2.rQuadTo(fArr4[i2], fArr4[i28], fArr4[i29], fArr4[i30]);
                                    f3 = fArr4[i2] + f21;
                                    f4 = f18 + fArr4[i28];
                                    f21 += fArr4[i29];
                                    f5 = fArr4[i30];
                                }
                                f18 += f5;
                                f14 = f3;
                                f15 = f4;
                            } else {
                                i2 = i7;
                                path2.rLineTo(fArr4[i2], 0.0f);
                                f21 += fArr4[i2];
                            }
                            fArr = fArr4;
                            f = f18;
                            c = c3;
                        } else {
                            i2 = i7;
                            int i31 = i2 + 5;
                            float f33 = fArr4[i31] + f21;
                            int i32 = i2 + 6;
                            float f34 = fArr4[i32] + f18;
                            float f35 = fArr4[i2];
                            float f36 = fArr4[i2 + 1];
                            float f37 = fArr4[i2 + 2];
                            if (fArr4[i2 + 3] != 0.0f) {
                                fArr2 = fArr4;
                                z = 1;
                            } else {
                                fArr2 = fArr4;
                                z = i3;
                            }
                            float f38 = fArr2[i2 + 4];
                            fArr = fArr2;
                            float f39 = f21;
                            boolean z2 = f38 != 0.0f ? 1 : i3;
                            float f40 = f18;
                            c = c3;
                            a(path, f39, f40, f33, f34, f35, f36, f37, z, z2);
                            f21 = f39 + fArr[i31];
                            f = fArr[i32] + f40;
                            f15 = f;
                            f14 = f21;
                        }
                    } else {
                        i2 = i7;
                        c = c3;
                        fArr = fArr4;
                        i3 = i5;
                        int i33 = i2 + 1;
                        int i34 = i2 + 2;
                        int i35 = i2 + 3;
                        path2.quadTo(fArr[i2], fArr[i33], fArr[i34], fArr[i35]);
                        f2 = fArr[i2];
                        f15 = fArr[i33];
                        f21 = fArr[i34];
                        f = fArr[i35];
                    }
                    f14 = f2;
                } else {
                    i2 = i7;
                    fArr = fArr4;
                    i3 = i5;
                    f = f18;
                    c = c3;
                    path2.lineTo(fArr[i2], f);
                    f21 = fArr[i2];
                }
                c2 = c;
                c3 = c2;
                i5 = i3;
                fArr4 = fArr;
                f18 = f;
                i7 = i2 + i;
                path2 = path;
            }
            fArr3[i5] = f21;
            fArr3[1] = f18;
            fArr3[2] = f14;
            fArr3[3] = f15;
            fArr3[4] = f19;
            fArr3[5] = f20;
            c2 = ur90VarArr[i6].a;
            i6++;
            path2 = path;
            i4 = 6;
        }
    }
}
