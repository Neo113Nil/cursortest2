package G;

import a.AbstractC0415a;
import android.graphics.Path;
import android.util.Log;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.anythink.core.common.d.j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public char f1156a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1157b;

    public i(char c4, float[] fArr) {
        this.f1156a = c4;
        this.f1157b = fArr;
    }

    public static void a(Path path, float f6, float f9, float f10, float f11, float f12, float f13, float f14, boolean z8, boolean z9) {
        double d2;
        double d3;
        double radians = Math.toRadians(f14);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d9 = f6;
        double d10 = f9;
        double d11 = f12;
        double d12 = ((d10 * sin) + (d9 * cos)) / d11;
        double d13 = f13;
        double d14 = ((d10 * cos) + ((-f6) * sin)) / d13;
        double d15 = f11;
        double d16 = ((d15 * sin) + (f10 * cos)) / d11;
        double d17 = ((d15 * cos) + ((-f10) * sin)) / d13;
        double d18 = d12 - d16;
        double d19 = d14 - d17;
        double d20 = (d12 + d16) / 2.0d;
        double d21 = (d14 + d17) / 2.0d;
        double d22 = (d19 * d19) + (d18 * d18);
        if (d22 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d23 = (1.0d / d22) - 0.25d;
        if (d23 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d22);
            float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
            a(path, f6, f9, f10, f11, f12 * sqrt, sqrt * f13, f14, z8, z9);
            return;
        }
        double sqrt2 = Math.sqrt(d23);
        double d24 = sqrt2 * d18;
        double d25 = sqrt2 * d19;
        if (z8 == z9) {
            d2 = d20 - d25;
            d3 = d21 + d24;
        } else {
            d2 = d20 + d25;
            d3 = d21 - d24;
        }
        double atan2 = Math.atan2(d14 - d3, d12 - d2);
        double atan22 = Math.atan2(d17 - d3, d16 - d2) - atan2;
        if (z9 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d26 = d2 * d11;
        double d27 = d3 * d13;
        double d28 = (d26 * cos) - (d27 * sin);
        double d29 = (d27 * cos) + (d26 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = -d11;
        double d31 = d30 * cos2;
        double d32 = d13 * sin2;
        double d33 = (d31 * sin3) - (d32 * cos3);
        double d34 = d30 * sin2;
        double d35 = d13 * cos2;
        double d36 = atan22 / ceil;
        double d37 = (cos3 * d35) + (sin3 * d34);
        double d38 = d9;
        double d39 = d10;
        int i = 0;
        double d40 = atan2;
        while (i < ceil) {
            double d41 = d40 + d36;
            double sin4 = Math.sin(d41);
            double cos4 = Math.cos(d41);
            int i4 = ceil;
            double d42 = (((d11 * cos2) * cos4) + d28) - (d32 * sin4);
            double d43 = (d35 * sin4) + (d11 * sin2 * cos4) + d29;
            double d44 = (d31 * sin4) - (d32 * cos4);
            double d45 = (cos4 * d35) + (sin4 * d34);
            double d46 = d41 - d40;
            double tan = Math.tan(d46 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d33 * sqrt3) + d38), (float) ((d37 * sqrt3) + d39), (float) (d42 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d42, (float) d43);
            i++;
            d39 = d43;
            cos2 = cos2;
            d34 = d34;
            d40 = d41;
            d37 = d45;
            d38 = d42;
            ceil = i4;
            d33 = d44;
            d36 = d36;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(i[] iVarArr, Path path) {
        int i;
        int i4;
        i iVar;
        int i9;
        char c4;
        float f6;
        float f9;
        float f10;
        float f11;
        i iVar2;
        boolean z8;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = iVarArr.length;
        char c9 = 'm';
        int i10 = 0;
        char c10 = 'm';
        int i11 = 0;
        while (i11 < length) {
            i iVar3 = iVarArr[i11];
            char c11 = iVar3.f1156a;
            float f20 = fArr[i10];
            float f21 = fArr[1];
            float f22 = fArr[2];
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c11) {
                case j.v.f12733G /* 65 */:
                case 'a':
                    i = 7;
                    break;
                case j.v.f12739d /* 67 */:
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case j.v.f12731E /* 81 */:
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                case 'z':
                    path2.close();
                    path2.moveTo(f24, f25);
                    f20 = f24;
                    f22 = f20;
                    f21 = f25;
                    f23 = f21;
                default:
                    i = 2;
                    break;
            }
            float f26 = f21;
            float f27 = f24;
            float f28 = f25;
            float f29 = f20;
            int i12 = i10;
            while (true) {
                float[] fArr2 = iVar3.f1157b;
                if (i12 < fArr2.length) {
                    int i13 = i10;
                    if (c11 == 'A') {
                        i4 = i12;
                        iVar = iVar3;
                        float f30 = f29;
                        float f31 = f26;
                        i9 = i11;
                        c4 = c11;
                        int i14 = i4 + 5;
                        int i15 = i4 + 6;
                        a(path, f30, f31, fArr2[i14], fArr2[i15], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f ? 1 : i13, fArr2[i4 + 4] != 0.0f ? 1 : i13);
                        f22 = fArr2[i14];
                        f6 = fArr2[i15];
                        f23 = f6;
                        f9 = f22;
                    } else if (c11 == 'C') {
                        i4 = i12;
                        i9 = i11;
                        iVar = iVar3;
                        c4 = c11;
                        int i16 = i4 + 2;
                        int i17 = i4 + 3;
                        int i18 = i4 + 4;
                        int i19 = i4 + 5;
                        path2.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                        float f32 = fArr2[i18];
                        float f33 = fArr2[i19];
                        f22 = fArr2[i16];
                        f23 = fArr2[i17];
                        f6 = f33;
                        f9 = f32;
                    } else if (c11 != 'H') {
                        if (c11 == 'Q') {
                            i4 = i12;
                            i9 = i11;
                            iVar = iVar3;
                            c4 = c11;
                            int i20 = i4 + 1;
                            int i21 = i4 + 2;
                            int i22 = i4 + 3;
                            path2.quadTo(fArr2[i4], fArr2[i20], fArr2[i21], fArr2[i22]);
                            f10 = fArr2[i4];
                            float f34 = fArr2[i20];
                            f11 = fArr2[i21];
                            f23 = f34;
                            f6 = fArr2[i22];
                        } else if (c11 == 'V') {
                            i4 = i12;
                            i9 = i11;
                            iVar = iVar3;
                            f9 = f29;
                            c4 = c11;
                            path2.lineTo(f9, fArr2[i4]);
                            f6 = fArr2[i4];
                        } else if (c11 != 'a') {
                            if (c11 == 'c') {
                                i4 = i12;
                                int i23 = i4 + 2;
                                int i24 = i4 + 3;
                                int i25 = i4 + 4;
                                int i26 = i4 + 5;
                                path2.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                float f35 = fArr2[i23] + f29;
                                float f36 = f26 + fArr2[i24];
                                f29 += fArr2[i25];
                                f26 += fArr2[i26];
                                f22 = f35;
                                f23 = f36;
                            } else if (c11 != 'h') {
                                if (c11 != 'q') {
                                    if (c11 != 'v') {
                                        if (c11 == 'L') {
                                            i4 = i12;
                                            int i27 = i4 + 1;
                                            path2.lineTo(fArr2[i4], fArr2[i27]);
                                            f9 = fArr2[i4];
                                            f6 = fArr2[i27];
                                        } else if (c11 == 'M') {
                                            i4 = i12;
                                            f9 = fArr2[i4];
                                            f6 = fArr2[i4 + 1];
                                            if (i4 > 0) {
                                                path2.lineTo(f9, f6);
                                            } else {
                                                path2.moveTo(f9, f6);
                                                f27 = f9;
                                                f28 = f6;
                                            }
                                        } else if (c11 == 'S') {
                                            i4 = i12;
                                            if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                f29 = (f29 * 2.0f) - f22;
                                                f26 = (f26 * 2.0f) - f23;
                                            }
                                            float f37 = f29;
                                            float f38 = f26;
                                            int i28 = i4 + 1;
                                            int i29 = i4 + 2;
                                            int i30 = i4 + 3;
                                            path2.cubicTo(f37, f38, fArr2[i4], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            f10 = fArr2[i4];
                                            float f39 = fArr2[i28];
                                            f11 = fArr2[i29];
                                            f23 = f39;
                                            f6 = fArr2[i30];
                                            i9 = i11;
                                            iVar = iVar3;
                                            c4 = c11;
                                        } else if (c11 == 'T') {
                                            i4 = i12;
                                            if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                f29 = (f29 * 2.0f) - f22;
                                                f26 = (f26 * 2.0f) - f23;
                                            }
                                            float f40 = f26;
                                            float f41 = fArr2[i4];
                                            int i31 = i4 + 1;
                                            path2.quadTo(f29, f40, f41, fArr2[i31]);
                                            f23 = f40;
                                            f9 = fArr2[i4];
                                            f6 = fArr2[i31];
                                            i9 = i11;
                                            iVar = iVar3;
                                            f22 = f29;
                                            c4 = c11;
                                        } else if (c11 == 'l') {
                                            i4 = i12;
                                            int i32 = i4 + 1;
                                            path2.rLineTo(fArr2[i4], fArr2[i32]);
                                            f29 += fArr2[i4];
                                            f15 = fArr2[i32];
                                        } else if (c11 == c9) {
                                            i4 = i12;
                                            float f42 = fArr2[i4];
                                            f29 += f42;
                                            float f43 = fArr2[i4 + 1];
                                            f26 += f43;
                                            if (i4 > 0) {
                                                path2.rLineTo(f42, f43);
                                            } else {
                                                path2.rMoveTo(f42, f43);
                                                iVar = iVar3;
                                                f9 = f29;
                                                f27 = f9;
                                                f6 = f26;
                                                f28 = f6;
                                                i9 = i11;
                                                c4 = c11;
                                            }
                                        } else if (c11 == 's') {
                                            if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                f16 = f26 - f23;
                                                f17 = f29 - f22;
                                            } else {
                                                f17 = 0.0f;
                                                f16 = 0.0f;
                                            }
                                            int i33 = i12 + 1;
                                            int i34 = i12 + 2;
                                            int i35 = i12 + 3;
                                            i4 = i12;
                                            path2.rCubicTo(f17, f16, fArr2[i12], fArr2[i33], fArr2[i34], fArr2[i35]);
                                            f12 = fArr2[i4] + f29;
                                            f13 = f26 + fArr2[i33];
                                            f29 += fArr2[i34];
                                            f14 = fArr2[i35];
                                        } else if (c11 != 't') {
                                            i4 = i12;
                                        } else {
                                            if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                f18 = f29 - f22;
                                                f19 = f26 - f23;
                                            } else {
                                                f19 = 0.0f;
                                                f18 = 0.0f;
                                            }
                                            int i36 = i12 + 1;
                                            path2.rQuadTo(f18, f19, fArr2[i12], fArr2[i36]);
                                            float f44 = f18 + f29;
                                            float f45 = f26 + f19;
                                            float f46 = f29 + fArr2[i12];
                                            f26 += fArr2[i36];
                                            f23 = f45;
                                            i4 = i12;
                                            iVar = iVar3;
                                            f9 = f46;
                                            f22 = f44;
                                            f6 = f26;
                                            i9 = i11;
                                            c4 = c11;
                                        }
                                        i9 = i11;
                                        iVar = iVar3;
                                        c4 = c11;
                                    } else {
                                        i4 = i12;
                                        path2.rLineTo(0.0f, fArr2[i4]);
                                        f15 = fArr2[i4];
                                    }
                                    f26 += f15;
                                } else {
                                    i4 = i12;
                                    int i37 = i4 + 1;
                                    int i38 = i4 + 2;
                                    int i39 = i4 + 3;
                                    path2.rQuadTo(fArr2[i4], fArr2[i37], fArr2[i38], fArr2[i39]);
                                    f12 = fArr2[i4] + f29;
                                    f13 = f26 + fArr2[i37];
                                    f29 += fArr2[i38];
                                    f14 = fArr2[i39];
                                }
                                f26 += f14;
                                f22 = f12;
                                f23 = f13;
                            } else {
                                i4 = i12;
                                path2.rLineTo(fArr2[i4], 0.0f);
                                f29 += fArr2[i4];
                            }
                            iVar = iVar3;
                            f9 = f29;
                            f6 = f26;
                            i9 = i11;
                            c4 = c11;
                        } else {
                            i4 = i12;
                            int i40 = i4 + 5;
                            float f47 = fArr2[i40] + f29;
                            int i41 = i4 + 6;
                            float f48 = fArr2[i41] + f26;
                            float f49 = fArr2[i4];
                            float f50 = fArr2[i4 + 1];
                            float f51 = fArr2[i4 + 2];
                            if (fArr2[i4 + 3] != 0.0f) {
                                iVar2 = iVar3;
                                z8 = 1;
                            } else {
                                iVar2 = iVar3;
                                z8 = i13;
                            }
                            iVar = iVar2;
                            float f52 = f29;
                            c4 = c11;
                            float f53 = f26;
                            i9 = i11;
                            a(path, f52, f53, f47, f48, f49, f50, f51, z8, fArr2[i4 + 4] != 0.0f ? 1 : i13);
                            f9 = f52 + fArr2[i40];
                            f6 = f53 + fArr2[i41];
                            f22 = f9;
                            f23 = f6;
                        }
                        f22 = f10;
                        f9 = f11;
                    } else {
                        i4 = i12;
                        iVar = iVar3;
                        c4 = c11;
                        f6 = f26;
                        i9 = i11;
                        path2.lineTo(fArr2[i4], f6);
                        f9 = fArr2[i4];
                    }
                    c11 = c4;
                    iVar3 = iVar;
                    i11 = i9;
                    i10 = i13;
                    c9 = 'm';
                    f29 = f9;
                    f26 = f6;
                    c10 = c11;
                    i12 = i4 + i;
                    path2 = path;
                }
            }
            int i42 = i10;
            fArr[i42] = f29;
            fArr[1] = f26;
            fArr[2] = f22;
            fArr[3] = f23;
            fArr[4] = f27;
            fArr[5] = f28;
            c10 = iVar3.f1156a;
            i11++;
            path2 = path;
            i10 = i42;
            c9 = 'm';
        }
    }

    public i(i iVar) {
        this.f1156a = iVar.f1156a;
        float[] fArr = iVar.f1157b;
        this.f1157b = AbstractC0415a.j(fArr, fArr.length);
    }
}
