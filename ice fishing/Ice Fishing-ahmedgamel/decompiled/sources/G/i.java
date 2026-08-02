package G;

import N3.C;
import android.graphics.Path;
import android.util.Log;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.anythink.core.common.d.j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public char f1036a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1037b;

    public i(char c9, float[] fArr) {
        this.f1036a = c9;
        this.f1037b = fArr;
    }

    public static void a(Path path, float f2, float f9, float f10, float f11, float f12, float f13, float f14, boolean z6, boolean z9) {
        double d9;
        double d10;
        double radians = Math.toRadians(f14);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = f2;
        double d12 = f9;
        double d13 = f12;
        double d14 = ((d12 * sin) + (d11 * cos)) / d13;
        double d15 = f13;
        double d16 = ((d12 * cos) + ((-f2) * sin)) / d15;
        double d17 = f11;
        double d18 = ((d17 * sin) + (f10 * cos)) / d13;
        double d19 = ((d17 * cos) + ((-f10) * sin)) / d15;
        double d20 = d14 - d18;
        double d21 = d16 - d19;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d16 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f2, f9, f10, f11, f12 * sqrt, sqrt * f13, f14, z6, z9);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = sqrt2 * d20;
        double d27 = sqrt2 * d21;
        if (z6 == z9) {
            d9 = d22 - d27;
            d10 = d23 + d26;
        } else {
            d9 = d22 + d27;
            d10 = d23 - d26;
        }
        double atan2 = Math.atan2(d16 - d10, d14 - d9);
        double atan22 = Math.atan2(d19 - d10, d18 - d9) - atan2;
        if (z9 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d28 = d9 * d13;
        double d29 = d10 * d15;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d32 = -d13;
        double d33 = d32 * cos2;
        double d34 = d15 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        double d37 = d15 * cos2;
        double d38 = atan22 / ceil;
        double d39 = (cos3 * d37) + (sin3 * d36);
        double d40 = d11;
        double d41 = d12;
        int i = 0;
        double d42 = atan2;
        while (i < ceil) {
            double d43 = d42 + d38;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            int i4 = ceil;
            double d44 = (((d13 * cos2) * cos4) + d30) - (d34 * sin4);
            double d45 = (d37 * sin4) + (d13 * sin2 * cos4) + d31;
            double d46 = (d33 * sin4) - (d34 * cos4);
            double d47 = (cos4 * d37) + (sin4 * d36);
            double d48 = d43 - d42;
            double tan = Math.tan(d48 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d40), (float) ((d39 * sqrt3) + d41), (float) (d44 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d44, (float) d45);
            i++;
            d41 = d45;
            cos2 = cos2;
            d36 = d36;
            d42 = d43;
            d39 = d47;
            d40 = d44;
            ceil = i4;
            d35 = d46;
            d38 = d38;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(i[] iVarArr, Path path) {
        int i;
        int i4;
        i iVar;
        int i6;
        char c9;
        float f2;
        float f9;
        float f10;
        float f11;
        i iVar2;
        boolean z6;
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
        int i9 = 0;
        char c11 = 'm';
        int i10 = 0;
        while (i10 < length) {
            i iVar3 = iVarArr[i10];
            char c12 = iVar3.f1036a;
            float f20 = fArr[i9];
            float f21 = fArr[1];
            float f22 = fArr[2];
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c12) {
                case j.v.f13362G /* 65 */:
                case 'a':
                    i = 7;
                    break;
                case j.v.f13368d /* 67 */:
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case j.v.f13360E /* 81 */:
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
            int i11 = i9;
            while (true) {
                float[] fArr2 = iVar3.f1037b;
                if (i11 < fArr2.length) {
                    int i12 = i9;
                    if (c12 == 'A') {
                        i4 = i11;
                        iVar = iVar3;
                        float f30 = f29;
                        float f31 = f26;
                        i6 = i10;
                        c9 = c12;
                        int i13 = i4 + 5;
                        int i14 = i4 + 6;
                        a(path, f30, f31, fArr2[i13], fArr2[i14], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f ? 1 : i12, fArr2[i4 + 4] != 0.0f ? 1 : i12);
                        f22 = fArr2[i13];
                        f2 = fArr2[i14];
                        f23 = f2;
                        f9 = f22;
                    } else if (c12 == 'C') {
                        i4 = i11;
                        i6 = i10;
                        iVar = iVar3;
                        c9 = c12;
                        int i15 = i4 + 2;
                        int i16 = i4 + 3;
                        int i17 = i4 + 4;
                        int i18 = i4 + 5;
                        path2.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                        float f32 = fArr2[i17];
                        float f33 = fArr2[i18];
                        f22 = fArr2[i15];
                        f23 = fArr2[i16];
                        f2 = f33;
                        f9 = f32;
                    } else if (c12 != 'H') {
                        if (c12 == 'Q') {
                            i4 = i11;
                            i6 = i10;
                            iVar = iVar3;
                            c9 = c12;
                            int i19 = i4 + 1;
                            int i20 = i4 + 2;
                            int i21 = i4 + 3;
                            path2.quadTo(fArr2[i4], fArr2[i19], fArr2[i20], fArr2[i21]);
                            f10 = fArr2[i4];
                            float f34 = fArr2[i19];
                            f11 = fArr2[i20];
                            f23 = f34;
                            f2 = fArr2[i21];
                        } else if (c12 == 'V') {
                            i4 = i11;
                            i6 = i10;
                            iVar = iVar3;
                            f9 = f29;
                            c9 = c12;
                            path2.lineTo(f9, fArr2[i4]);
                            f2 = fArr2[i4];
                        } else if (c12 != 'a') {
                            if (c12 == 'c') {
                                i4 = i11;
                                int i22 = i4 + 2;
                                int i23 = i4 + 3;
                                int i24 = i4 + 4;
                                int i25 = i4 + 5;
                                path2.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                float f35 = fArr2[i22] + f29;
                                float f36 = f26 + fArr2[i23];
                                f29 += fArr2[i24];
                                f26 += fArr2[i25];
                                f22 = f35;
                                f23 = f36;
                            } else if (c12 != 'h') {
                                if (c12 != 'q') {
                                    if (c12 != 'v') {
                                        if (c12 == 'L') {
                                            i4 = i11;
                                            int i26 = i4 + 1;
                                            path2.lineTo(fArr2[i4], fArr2[i26]);
                                            f9 = fArr2[i4];
                                            f2 = fArr2[i26];
                                        } else if (c12 == 'M') {
                                            i4 = i11;
                                            f9 = fArr2[i4];
                                            f2 = fArr2[i4 + 1];
                                            if (i4 > 0) {
                                                path2.lineTo(f9, f2);
                                            } else {
                                                path2.moveTo(f9, f2);
                                                f27 = f9;
                                                f28 = f2;
                                            }
                                        } else if (c12 == 'S') {
                                            i4 = i11;
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                f29 = (f29 * 2.0f) - f22;
                                                f26 = (f26 * 2.0f) - f23;
                                            }
                                            float f37 = f29;
                                            float f38 = f26;
                                            int i27 = i4 + 1;
                                            int i28 = i4 + 2;
                                            int i29 = i4 + 3;
                                            path2.cubicTo(f37, f38, fArr2[i4], fArr2[i27], fArr2[i28], fArr2[i29]);
                                            f10 = fArr2[i4];
                                            float f39 = fArr2[i27];
                                            f11 = fArr2[i28];
                                            f23 = f39;
                                            f2 = fArr2[i29];
                                            i6 = i10;
                                            iVar = iVar3;
                                            c9 = c12;
                                        } else if (c12 == 'T') {
                                            i4 = i11;
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f29 = (f29 * 2.0f) - f22;
                                                f26 = (f26 * 2.0f) - f23;
                                            }
                                            float f40 = f26;
                                            float f41 = fArr2[i4];
                                            int i30 = i4 + 1;
                                            path2.quadTo(f29, f40, f41, fArr2[i30]);
                                            f23 = f40;
                                            f9 = fArr2[i4];
                                            f2 = fArr2[i30];
                                            i6 = i10;
                                            iVar = iVar3;
                                            f22 = f29;
                                            c9 = c12;
                                        } else if (c12 == 'l') {
                                            i4 = i11;
                                            int i31 = i4 + 1;
                                            path2.rLineTo(fArr2[i4], fArr2[i31]);
                                            f29 += fArr2[i4];
                                            f15 = fArr2[i31];
                                        } else if (c12 == c10) {
                                            i4 = i11;
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
                                                f2 = f26;
                                                f28 = f2;
                                                i6 = i10;
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
                                            int i32 = i11 + 1;
                                            int i33 = i11 + 2;
                                            int i34 = i11 + 3;
                                            i4 = i11;
                                            path2.rCubicTo(f17, f16, fArr2[i11], fArr2[i32], fArr2[i33], fArr2[i34]);
                                            f12 = fArr2[i4] + f29;
                                            f13 = f26 + fArr2[i32];
                                            f29 += fArr2[i33];
                                            f14 = fArr2[i34];
                                        } else if (c12 != 't') {
                                            i4 = i11;
                                        } else {
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f18 = f29 - f22;
                                                f19 = f26 - f23;
                                            } else {
                                                f19 = 0.0f;
                                                f18 = 0.0f;
                                            }
                                            int i35 = i11 + 1;
                                            path2.rQuadTo(f18, f19, fArr2[i11], fArr2[i35]);
                                            float f44 = f18 + f29;
                                            float f45 = f26 + f19;
                                            float f46 = f29 + fArr2[i11];
                                            f26 += fArr2[i35];
                                            f23 = f45;
                                            i4 = i11;
                                            iVar = iVar3;
                                            f9 = f46;
                                            f22 = f44;
                                            f2 = f26;
                                            i6 = i10;
                                            c9 = c12;
                                        }
                                        i6 = i10;
                                        iVar = iVar3;
                                        c9 = c12;
                                    } else {
                                        i4 = i11;
                                        path2.rLineTo(0.0f, fArr2[i4]);
                                        f15 = fArr2[i4];
                                    }
                                    f26 += f15;
                                } else {
                                    i4 = i11;
                                    int i36 = i4 + 1;
                                    int i37 = i4 + 2;
                                    int i38 = i4 + 3;
                                    path2.rQuadTo(fArr2[i4], fArr2[i36], fArr2[i37], fArr2[i38]);
                                    f12 = fArr2[i4] + f29;
                                    f13 = f26 + fArr2[i36];
                                    f29 += fArr2[i37];
                                    f14 = fArr2[i38];
                                }
                                f26 += f14;
                                f22 = f12;
                                f23 = f13;
                            } else {
                                i4 = i11;
                                path2.rLineTo(fArr2[i4], 0.0f);
                                f29 += fArr2[i4];
                            }
                            iVar = iVar3;
                            f9 = f29;
                            f2 = f26;
                            i6 = i10;
                            c9 = c12;
                        } else {
                            i4 = i11;
                            int i39 = i4 + 5;
                            float f47 = fArr2[i39] + f29;
                            int i40 = i4 + 6;
                            float f48 = fArr2[i40] + f26;
                            float f49 = fArr2[i4];
                            float f50 = fArr2[i4 + 1];
                            float f51 = fArr2[i4 + 2];
                            if (fArr2[i4 + 3] != 0.0f) {
                                iVar2 = iVar3;
                                z6 = 1;
                            } else {
                                iVar2 = iVar3;
                                z6 = i12;
                            }
                            iVar = iVar2;
                            float f52 = f29;
                            c9 = c12;
                            float f53 = f26;
                            i6 = i10;
                            a(path, f52, f53, f47, f48, f49, f50, f51, z6, fArr2[i4 + 4] != 0.0f ? 1 : i12);
                            f9 = f52 + fArr2[i39];
                            f2 = f53 + fArr2[i40];
                            f22 = f9;
                            f23 = f2;
                        }
                        f22 = f10;
                        f9 = f11;
                    } else {
                        i4 = i11;
                        iVar = iVar3;
                        c9 = c12;
                        f2 = f26;
                        i6 = i10;
                        path2.lineTo(fArr2[i4], f2);
                        f9 = fArr2[i4];
                    }
                    c12 = c9;
                    iVar3 = iVar;
                    i10 = i6;
                    i9 = i12;
                    c10 = 'm';
                    f29 = f9;
                    f26 = f2;
                    c11 = c12;
                    i11 = i4 + i;
                    path2 = path;
                }
            }
            int i41 = i9;
            fArr[i41] = f29;
            fArr[1] = f26;
            fArr[2] = f22;
            fArr[3] = f23;
            fArr[4] = f27;
            fArr[5] = f28;
            c11 = iVar3.f1036a;
            i10++;
            path2 = path;
            i9 = i41;
            c10 = 'm';
        }
    }

    public i(i iVar) {
        this.f1036a = iVar.f1036a;
        float[] fArr = iVar.f1037b;
        this.f1037b = C.C(fArr, fArr.length);
    }
}
