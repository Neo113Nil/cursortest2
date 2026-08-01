package G;

import android.graphics.Path;
import android.util.Log;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.anythink.core.common.d.j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public char f1010a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1011b;

    public i(char c9, float[] fArr) {
        this.f1010a = c9;
        this.f1011b = fArr;
    }

    public static void a(Path path, float f3, float f9, float f10, float f11, float f12, float f13, float f14, boolean z3, boolean z6) {
        double d2;
        double d9;
        double radians = Math.toRadians(f14);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d10 = f3;
        double d11 = f9;
        double d12 = f12;
        double d13 = ((d11 * sin) + (d10 * cos)) / d12;
        double d14 = f13;
        double d15 = ((d11 * cos) + ((-f3) * sin)) / d14;
        double d16 = f11;
        double d17 = ((d16 * sin) + (f10 * cos)) / d12;
        double d18 = ((d16 * cos) + ((-f10) * sin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f3, f9, f10, f11, f12 * sqrt, sqrt * f13, f14, z3, z6);
            return;
        }
        double sqrt2 = Math.sqrt(d24);
        double d25 = sqrt2 * d19;
        double d26 = sqrt2 * d20;
        if (z3 == z6) {
            d2 = d21 - d26;
            d9 = d22 + d25;
        } else {
            d2 = d21 + d26;
            d9 = d22 - d25;
        }
        double atan2 = Math.atan2(d15 - d9, d13 - d2);
        double atan22 = Math.atan2(d18 - d9, d17 - d2) - atan2;
        if (z6 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d27 = d2 * d12;
        double d28 = d9 * d14;
        double d29 = (d27 * cos) - (d28 * sin);
        double d30 = (d28 * cos) + (d27 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d31 = -d12;
        double d32 = d31 * cos2;
        double d33 = d14 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        double d36 = d14 * cos2;
        double d37 = atan22 / ceil;
        double d38 = (cos3 * d36) + (sin3 * d35);
        double d39 = d10;
        double d40 = d11;
        int i = 0;
        double d41 = atan2;
        while (i < ceil) {
            double d42 = d41 + d37;
            double sin4 = Math.sin(d42);
            double cos4 = Math.cos(d42);
            int i6 = ceil;
            double d43 = (((d12 * cos2) * cos4) + d29) - (d33 * sin4);
            double d44 = (d36 * sin4) + (d12 * sin2 * cos4) + d30;
            double d45 = (d32 * sin4) - (d33 * cos4);
            double d46 = (cos4 * d36) + (sin4 * d35);
            double d47 = d42 - d41;
            double tan = Math.tan(d47 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * sqrt3) + d39), (float) ((d38 * sqrt3) + d40), (float) (d43 - (sqrt3 * d45)), (float) (d44 - (sqrt3 * d46)), (float) d43, (float) d44);
            i++;
            d40 = d44;
            cos2 = cos2;
            d35 = d35;
            d41 = d42;
            d38 = d46;
            d39 = d43;
            ceil = i6;
            d34 = d45;
            d37 = d37;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(i[] iVarArr, Path path) {
        int i;
        int i6;
        i iVar;
        int i9;
        char c9;
        float f3;
        float f9;
        float f10;
        float f11;
        i iVar2;
        boolean z3;
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
        char c10 = 'm';
        int i10 = 0;
        char c11 = 'm';
        int i11 = 0;
        while (i11 < length) {
            i iVar3 = iVarArr[i11];
            char c12 = iVar3.f1010a;
            float f20 = fArr[i10];
            float f21 = fArr[1];
            float f22 = fArr[2];
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c12) {
                case j.v.f12576G /* 65 */:
                case 'a':
                    i = 7;
                    break;
                case j.v.f12582d /* 67 */:
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case j.v.f12574E /* 81 */:
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
                float[] fArr2 = iVar3.f1011b;
                if (i12 < fArr2.length) {
                    int i13 = i10;
                    if (c12 == 'A') {
                        i6 = i12;
                        iVar = iVar3;
                        float f30 = f29;
                        float f31 = f26;
                        i9 = i11;
                        c9 = c12;
                        int i14 = i6 + 5;
                        int i15 = i6 + 6;
                        a(path, f30, f31, fArr2[i14], fArr2[i15], fArr2[i6], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f ? 1 : i13, fArr2[i6 + 4] != 0.0f ? 1 : i13);
                        f22 = fArr2[i14];
                        f3 = fArr2[i15];
                        f23 = f3;
                        f9 = f22;
                    } else if (c12 == 'C') {
                        i6 = i12;
                        i9 = i11;
                        iVar = iVar3;
                        c9 = c12;
                        int i16 = i6 + 2;
                        int i17 = i6 + 3;
                        int i18 = i6 + 4;
                        int i19 = i6 + 5;
                        path2.cubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                        float f32 = fArr2[i18];
                        float f33 = fArr2[i19];
                        f22 = fArr2[i16];
                        f23 = fArr2[i17];
                        f3 = f33;
                        f9 = f32;
                    } else if (c12 != 'H') {
                        if (c12 == 'Q') {
                            i6 = i12;
                            i9 = i11;
                            iVar = iVar3;
                            c9 = c12;
                            int i20 = i6 + 1;
                            int i21 = i6 + 2;
                            int i22 = i6 + 3;
                            path2.quadTo(fArr2[i6], fArr2[i20], fArr2[i21], fArr2[i22]);
                            f10 = fArr2[i6];
                            float f34 = fArr2[i20];
                            f11 = fArr2[i21];
                            f23 = f34;
                            f3 = fArr2[i22];
                        } else if (c12 == 'V') {
                            i6 = i12;
                            i9 = i11;
                            iVar = iVar3;
                            f9 = f29;
                            c9 = c12;
                            path2.lineTo(f9, fArr2[i6]);
                            f3 = fArr2[i6];
                        } else if (c12 != 'a') {
                            if (c12 == 'c') {
                                i6 = i12;
                                int i23 = i6 + 2;
                                int i24 = i6 + 3;
                                int i25 = i6 + 4;
                                int i26 = i6 + 5;
                                path2.rCubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                float f35 = fArr2[i23] + f29;
                                float f36 = f26 + fArr2[i24];
                                f29 += fArr2[i25];
                                f26 += fArr2[i26];
                                f22 = f35;
                                f23 = f36;
                            } else if (c12 != 'h') {
                                if (c12 != 'q') {
                                    if (c12 != 'v') {
                                        if (c12 == 'L') {
                                            i6 = i12;
                                            int i27 = i6 + 1;
                                            path2.lineTo(fArr2[i6], fArr2[i27]);
                                            f9 = fArr2[i6];
                                            f3 = fArr2[i27];
                                        } else if (c12 == 'M') {
                                            i6 = i12;
                                            f9 = fArr2[i6];
                                            f3 = fArr2[i6 + 1];
                                            if (i6 > 0) {
                                                path2.lineTo(f9, f3);
                                            } else {
                                                path2.moveTo(f9, f3);
                                                f27 = f9;
                                                f28 = f3;
                                            }
                                        } else if (c12 == 'S') {
                                            i6 = i12;
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                f29 = (f29 * 2.0f) - f22;
                                                f26 = (f26 * 2.0f) - f23;
                                            }
                                            float f37 = f29;
                                            float f38 = f26;
                                            int i28 = i6 + 1;
                                            int i29 = i6 + 2;
                                            int i30 = i6 + 3;
                                            path2.cubicTo(f37, f38, fArr2[i6], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            f10 = fArr2[i6];
                                            float f39 = fArr2[i28];
                                            f11 = fArr2[i29];
                                            f23 = f39;
                                            f3 = fArr2[i30];
                                            i9 = i11;
                                            iVar = iVar3;
                                            c9 = c12;
                                        } else if (c12 == 'T') {
                                            i6 = i12;
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f29 = (f29 * 2.0f) - f22;
                                                f26 = (f26 * 2.0f) - f23;
                                            }
                                            float f40 = f26;
                                            float f41 = fArr2[i6];
                                            int i31 = i6 + 1;
                                            path2.quadTo(f29, f40, f41, fArr2[i31]);
                                            f23 = f40;
                                            f9 = fArr2[i6];
                                            f3 = fArr2[i31];
                                            i9 = i11;
                                            iVar = iVar3;
                                            f22 = f29;
                                            c9 = c12;
                                        } else if (c12 == 'l') {
                                            i6 = i12;
                                            int i32 = i6 + 1;
                                            path2.rLineTo(fArr2[i6], fArr2[i32]);
                                            f29 += fArr2[i6];
                                            f15 = fArr2[i32];
                                        } else if (c12 == c10) {
                                            i6 = i12;
                                            float f42 = fArr2[i6];
                                            f29 += f42;
                                            float f43 = fArr2[i6 + 1];
                                            f26 += f43;
                                            if (i6 > 0) {
                                                path2.rLineTo(f42, f43);
                                            } else {
                                                path2.rMoveTo(f42, f43);
                                                iVar = iVar3;
                                                f9 = f29;
                                                f27 = f9;
                                                f3 = f26;
                                                f28 = f3;
                                                i9 = i11;
                                                c9 = c12;
                                            }
                                        } else if (c12 == 's') {
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                f16 = f26 - f23;
                                                f17 = f29 - f22;
                                            } else {
                                                f17 = 0.0f;
                                                f16 = 0.0f;
                                            }
                                            int i33 = i12 + 1;
                                            int i34 = i12 + 2;
                                            int i35 = i12 + 3;
                                            i6 = i12;
                                            path2.rCubicTo(f17, f16, fArr2[i12], fArr2[i33], fArr2[i34], fArr2[i35]);
                                            f12 = fArr2[i6] + f29;
                                            f13 = f26 + fArr2[i33];
                                            f29 += fArr2[i34];
                                            f14 = fArr2[i35];
                                        } else if (c12 != 't') {
                                            i6 = i12;
                                        } else {
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
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
                                            i6 = i12;
                                            iVar = iVar3;
                                            f9 = f46;
                                            f22 = f44;
                                            f3 = f26;
                                            i9 = i11;
                                            c9 = c12;
                                        }
                                        i9 = i11;
                                        iVar = iVar3;
                                        c9 = c12;
                                    } else {
                                        i6 = i12;
                                        path2.rLineTo(0.0f, fArr2[i6]);
                                        f15 = fArr2[i6];
                                    }
                                    f26 += f15;
                                } else {
                                    i6 = i12;
                                    int i37 = i6 + 1;
                                    int i38 = i6 + 2;
                                    int i39 = i6 + 3;
                                    path2.rQuadTo(fArr2[i6], fArr2[i37], fArr2[i38], fArr2[i39]);
                                    f12 = fArr2[i6] + f29;
                                    f13 = f26 + fArr2[i37];
                                    f29 += fArr2[i38];
                                    f14 = fArr2[i39];
                                }
                                f26 += f14;
                                f22 = f12;
                                f23 = f13;
                            } else {
                                i6 = i12;
                                path2.rLineTo(fArr2[i6], 0.0f);
                                f29 += fArr2[i6];
                            }
                            iVar = iVar3;
                            f9 = f29;
                            f3 = f26;
                            i9 = i11;
                            c9 = c12;
                        } else {
                            i6 = i12;
                            int i40 = i6 + 5;
                            float f47 = fArr2[i40] + f29;
                            int i41 = i6 + 6;
                            float f48 = fArr2[i41] + f26;
                            float f49 = fArr2[i6];
                            float f50 = fArr2[i6 + 1];
                            float f51 = fArr2[i6 + 2];
                            if (fArr2[i6 + 3] != 0.0f) {
                                iVar2 = iVar3;
                                z3 = 1;
                            } else {
                                iVar2 = iVar3;
                                z3 = i13;
                            }
                            iVar = iVar2;
                            float f52 = f29;
                            c9 = c12;
                            float f53 = f26;
                            i9 = i11;
                            a(path, f52, f53, f47, f48, f49, f50, f51, z3, fArr2[i6 + 4] != 0.0f ? 1 : i13);
                            f9 = f52 + fArr2[i40];
                            f3 = f53 + fArr2[i41];
                            f22 = f9;
                            f23 = f3;
                        }
                        f22 = f10;
                        f9 = f11;
                    } else {
                        i6 = i12;
                        iVar = iVar3;
                        c9 = c12;
                        f3 = f26;
                        i9 = i11;
                        path2.lineTo(fArr2[i6], f3);
                        f9 = fArr2[i6];
                    }
                    c12 = c9;
                    iVar3 = iVar;
                    i11 = i9;
                    i10 = i13;
                    c10 = 'm';
                    f29 = f9;
                    f26 = f3;
                    c11 = c12;
                    i12 = i6 + i;
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
            c11 = iVar3.f1010a;
            i11++;
            path2 = path;
            i10 = i42;
            c10 = 'm';
        }
    }

    public i(i iVar) {
        this.f1010a = iVar.f1010a;
        float[] fArr = iVar.f1011b;
        this.f1011b = S0.f.e(fArr, fArr.length);
    }
}
