package defpackage;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.qrcode.decoder.b;
import com.google.zxing.qrcode.detector.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class r5g0 {
    public static final wzj0[] b = new wzj0[0];
    public final b a = new b();

    /* JADX WARN: Removed duplicated region for block: B:242:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0689  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q6c0 a(h0w h0wVar, Map map) {
        int i;
        ArrayList arrayList;
        d8r d8rVar;
        d8r d8rVar2;
        d8r d8rVar3;
        float f;
        float f2;
        ot1 ot1Var;
        float f3;
        float f4;
        float f5;
        int i2;
        wzj0[] wzj0VarArr;
        pyg a;
        wzj0[] wzj0VarArr2;
        boolean z;
        double d;
        double abs;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int[] iArr2;
        int[] iArr3;
        float f6;
        int i10 = 3;
        b bVar = this.a;
        int i11 = 1;
        int i12 = 0;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            vz5 k = h0wVar.k();
            yzh yzhVar = new yzh(k);
            if (map != null && map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK) != null) {
                ny61.u();
                return null;
            }
            a aVar = new a(k);
            boolean z2 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
            int i13 = k.b;
            int i14 = k.a;
            int i15 = (i13 * 3) / 388;
            if (i15 < 3 || z2) {
                i15 = 3;
            }
            int[] iArr4 = new int[5];
            int i16 = i15 - 1;
            boolean z3 = false;
            while (true) {
                i = i10;
                arrayList = aVar.b;
                if (i16 >= i13 || z3) {
                    break;
                }
                Arrays.fill(iArr4, i12);
                int i17 = i12;
                while (i17 < i14) {
                    if (k.b(i17, i16)) {
                        if ((i12 & 1) == i11) {
                            i12++;
                        }
                        iArr4[i12] = iArr4[i12] + i11;
                    } else {
                        if ((i12 & 1) != 0) {
                            i3 = i17;
                            iArr4[i12] = iArr4[i12] + 1;
                        } else if (i12 == 4) {
                            if (!a.b(iArr4)) {
                                i3 = i17;
                                int i18 = i11;
                                iArr4[0] = iArr4[2];
                                iArr4[i18] = iArr4[i];
                                iArr4[2] = iArr4[4];
                                iArr4[i] = i18;
                                iArr4[4] = 0;
                            } else if (aVar.c(iArr4, i16, i17)) {
                                if (aVar.c) {
                                    z3 = aVar.d();
                                    i5 = 2;
                                } else {
                                    if (arrayList.size() > i11) {
                                        Iterator it = arrayList.iterator();
                                        d8r d8rVar4 = null;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i4 = i17;
                                                i5 = 2;
                                                i6 = 0;
                                                break;
                                            }
                                            d8r d8rVar5 = (d8r) it.next();
                                            i4 = i17;
                                            if (d8rVar5.d >= 2) {
                                                if (d8rVar4 != null) {
                                                    aVar.c = true;
                                                    i5 = 2;
                                                    i6 = ((int) (Math.abs(d8rVar4.a - d8rVar5.a) - Math.abs(d8rVar4.b - d8rVar5.b))) / 2;
                                                    break;
                                                }
                                                d8rVar4 = d8rVar5;
                                            }
                                            i17 = i4;
                                        }
                                    } else {
                                        i4 = i17;
                                        i6 = 0;
                                        i5 = 2;
                                    }
                                    if (i6 > iArr4[i5]) {
                                        i16 += (i6 - r6) - 2;
                                        i17 = i14 - 1;
                                    } else {
                                        i17 = i4;
                                    }
                                }
                                Arrays.fill(iArr4, 0);
                                i12 = 0;
                                i15 = i5;
                            } else {
                                i3 = i17;
                                iArr4[0] = iArr4[2];
                                iArr4[1] = iArr4[i];
                                iArr4[2] = iArr4[4];
                                iArr4[i] = 1;
                                iArr4[4] = 0;
                            }
                            i12 = i;
                        } else {
                            i3 = i17;
                            int i19 = i12 + 1;
                            iArr4[i19] = iArr4[i19] + 1;
                            i12 = i19;
                        }
                        i17 = i3;
                    }
                    i17++;
                    i11 = 1;
                }
                if (a.b(iArr4) && aVar.c(iArr4, i16, i14)) {
                    int i20 = iArr4[0];
                    if (aVar.c) {
                        i15 = i20;
                        z3 = aVar.d();
                    } else {
                        i15 = i20;
                    }
                }
                i16 += i15;
                i10 = i;
                i11 = 1;
                i12 = 0;
            }
            if (arrayList.size() < i) {
                throw NotFoundException.a();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((d8r) it2.next()).d < 2) {
                    it2.remove();
                }
            }
            Collections.sort(arrayList, a.e);
            d8r[] d8rVarArr = new d8r[3];
            int i21 = 0;
            double d2 = Double.MAX_VALUE;
            for (int i22 = 2; i21 < arrayList.size() - i22; i22 = 2) {
                d8r d8rVar6 = (d8r) arrayList.get(i21);
                float f7 = d8rVar6.c;
                i21++;
                int i23 = i21;
                while (i23 < arrayList.size() - 1) {
                    d8r d8rVar7 = (d8r) arrayList.get(i23);
                    double e = a.e(d8rVar6, d8rVar7);
                    i23++;
                    int i24 = i23;
                    while (i24 < arrayList.size()) {
                        d8r d8rVar8 = (d8r) arrayList.get(i24);
                        d8r[] d8rVarArr2 = d8rVarArr;
                        if (d8rVar8.c <= 1.4f * f7) {
                            double e2 = a.e(d8rVar7, d8rVar8);
                            double e3 = a.e(d8rVar6, d8rVar8);
                            if (e < e2) {
                                if (e2 <= e3) {
                                    e3 = e2;
                                    e2 = e3;
                                } else if (e >= e3) {
                                    d = e3;
                                    e3 = e;
                                    abs = Math.abs(e2 - (d * 2.0d)) + Math.abs(e2 - (e3 * 2.0d));
                                    if (abs >= d2) {
                                        d8rVarArr2[0] = d8rVar6;
                                        d8rVarArr2[1] = d8rVar7;
                                        d8rVarArr2[2] = d8rVar8;
                                        d2 = abs;
                                    }
                                }
                                d = e;
                                abs = Math.abs(e2 - (d * 2.0d)) + Math.abs(e2 - (e3 * 2.0d));
                                if (abs >= d2) {
                                }
                            } else {
                                if (e2 >= e3) {
                                    d = e3;
                                    e3 = e2;
                                } else if (e < e3) {
                                    d = e2;
                                    e2 = e3;
                                    e3 = e;
                                    abs = Math.abs(e2 - (d * 2.0d)) + Math.abs(e2 - (e3 * 2.0d));
                                    if (abs >= d2) {
                                    }
                                } else {
                                    d = e2;
                                }
                                e2 = e;
                                abs = Math.abs(e2 - (d * 2.0d)) + Math.abs(e2 - (e3 * 2.0d));
                                if (abs >= d2) {
                                }
                            }
                        }
                        i24++;
                        d8rVarArr = d8rVarArr2;
                    }
                }
            }
            d8r[] d8rVarArr3 = d8rVarArr;
            if (d2 == Double.MAX_VALUE) {
                throw NotFoundException.a();
            }
            float a2 = wzj0.a(d8rVarArr3[0], d8rVarArr3[1]);
            float a3 = wzj0.a(d8rVarArr3[1], d8rVarArr3[2]);
            float a4 = wzj0.a(d8rVarArr3[0], d8rVarArr3[2]);
            if (a3 >= a2 && a3 >= a4) {
                d8rVar = d8rVarArr3[0];
                d8rVar2 = d8rVarArr3[1];
                d8rVar3 = d8rVarArr3[2];
            } else if (a4 < a3 || a4 < a2) {
                d8rVar = d8rVarArr3[2];
                d8rVar2 = d8rVarArr3[0];
                d8rVar3 = d8rVarArr3[1];
            } else {
                d8rVar = d8rVarArr3[1];
                d8rVar2 = d8rVarArr3[0];
                d8rVar3 = d8rVarArr3[2];
            }
            float f8 = d8rVar.a;
            float f9 = d8rVar.b;
            if (((d8rVar2.b - f9) * (d8rVar3.a - f8)) - ((d8rVar2.a - f8) * (d8rVar3.b - f9)) < 0.0f) {
                d8r d8rVar9 = d8rVar3;
                d8rVar3 = d8rVar2;
                d8rVar2 = d8rVar9;
            }
            d8rVarArr3[0] = d8rVar2;
            d8rVarArr3[1] = d8rVar;
            d8rVarArr3[2] = d8rVar3;
            float b2 = yzhVar.b(d8rVar, d8rVar3);
            float f10 = d8rVar.a;
            float f11 = d8rVar3.b;
            float f12 = d8rVar3.a;
            float b3 = yzhVar.b(d8rVar, d8rVar2);
            float f13 = d8rVar2.b;
            float f14 = d8rVar2.a;
            float f15 = (b3 + b2) / 2.0f;
            if (f15 < 1.0f) {
                throw NotFoundException.a();
            }
            float a5 = wzj0.a(d8rVar, d8rVar3) / f15;
            int i25 = (int) (a5 + (a5 < 0.0f ? -0.5f : 0.5f));
            float a6 = wzj0.a(d8rVar, d8rVar2) / f15;
            int i26 = (((int) (a6 + (a6 >= 0.0f ? 0.5f : -0.5f))) + i25) / 2;
            int i27 = i26 + 7;
            int i28 = i27 & 3;
            if (i28 == 0) {
                i27 = i26 + 8;
            } else if (i28 == 2) {
                i27 = i26 + 6;
            } else if (i28 == 3) {
                throw NotFoundException.a();
            }
            int i29 = i27;
            int[] iArr5 = aa31.e;
            if (i29 % 4 != 1) {
                throw FormatException.a();
            }
            try {
                aa31 c = aa31.c((i29 - 17) / 4);
                int i30 = (c.a * 4) + 10;
                if (c.b.length > 0) {
                    float f16 = (f12 - f10) + f14;
                    f2 = f12;
                    float f17 = (f11 - f9) + f13;
                    float f18 = 1.0f - (3.0f / i30);
                    int b4 = (int) g8e.b(f16, f10, f18, f10);
                    int b5 = (int) g8e.b(f17, f9, f18, f9);
                    f = f9;
                    for (int i31 = 4; i31 <= 16; i31 <<= 1) {
                        try {
                            ot1Var = yzhVar.l(f15, i31, b4, b5);
                            break;
                        } catch (NotFoundException unused) {
                        }
                    }
                } else {
                    f = f9;
                    f2 = f12;
                }
                ot1Var = null;
                float f19 = i29 - 3.5f;
                if (ot1Var != null) {
                    f3 = ot1Var.a;
                    f4 = ot1Var.b;
                    f5 = f19 - 3.0f;
                } else {
                    f3 = (f2 - f10) + f14;
                    f4 = (f11 - f) + f13;
                    f5 = f19;
                }
                float f20 = f4;
                float f21 = d8rVar.a;
                float f22 = d8rVar.b;
                float f23 = d8rVar3.a;
                float f24 = d8rVar3.b;
                float f25 = d8rVar2.a;
                float f26 = d8rVar2.b;
                d8r d8rVar10 = d8rVar;
                m8b0 a7 = m8b0.a(3.5f, 3.5f, f19, 3.5f, f5, f5, 3.5f, f19);
                d8r d8rVar11 = d8rVar2;
                float f27 = a7.e;
                float f28 = a7.i;
                float f29 = f27 * f28;
                float f30 = a7.f;
                float f31 = a7.h;
                float f32 = f29 - (f30 * f31);
                float f33 = a7.g;
                float f34 = f30 * f33;
                float f35 = a7.d;
                float f36 = f34 - (f35 * f28);
                float f37 = (f35 * f31) - (f27 * f33);
                float f38 = a7.c;
                float f39 = f38 * f31;
                float f40 = a7.b;
                float f41 = f39 - (f40 * f28);
                float f42 = a7.a;
                float f43 = (f28 * f42) - (f38 * f33);
                float f44 = (f33 * f40) - (f31 * f42);
                float f45 = (f40 * f30) - (f38 * f27);
                float f46 = (f38 * f35) - (f30 * f42);
                float f47 = (f42 * f27) - (f40 * f35);
                m8b0 a8 = m8b0.a(f21, f22, f23, f24, f3, f20, f25, f26);
                float f48 = a8.a;
                float f49 = a8.d;
                float f50 = a8.g;
                float f51 = (f50 * f45) + (f49 * f41) + (f48 * f32);
                float f52 = (f50 * f46) + (f49 * f43) + (f48 * f36);
                float f53 = (f50 * f47) + (f49 * f44) + (f48 * f37);
                float f54 = a8.b;
                float f55 = a8.e;
                float f56 = a8.h;
                float f57 = (f56 * f45) + (f55 * f41) + (f54 * f32);
                float f58 = (f56 * f46) + (f55 * f43) + (f54 * f36);
                float f59 = (f56 * f47) + (f55 * f44) + (f54 * f37);
                float f60 = a8.c;
                float f61 = a8.f;
                float f62 = a8.i;
                float f63 = (f45 * f62) + (f41 * f61) + (f32 * f60);
                float f64 = (f46 * f62) + (f43 * f61) + (f36 * f60);
                float f65 = (f62 * f47) + (f61 * f44) + (f60 * f37);
                r1u.a.getClass();
                if (i29 <= 0 || i29 <= 0) {
                    throw NotFoundException.a();
                }
                vz5 vz5Var = new vz5(i29, i29);
                int i32 = i29 * 2;
                float[] fArr = new float[i32];
                int i33 = 0;
                while (i33 < i29) {
                    d8r d8rVar12 = d8rVar3;
                    float f66 = i33 + 0.5f;
                    int i34 = 0;
                    while (i34 < i32) {
                        int i35 = i34;
                        fArr[i35] = (i35 / 2) + 0.5f;
                        fArr[i35 + 1] = f66;
                        i34 = i35 + 2;
                    }
                    int i36 = i32 - 1;
                    int i37 = i29;
                    for (int i38 = 0; i38 < i36; i38 += 2) {
                        float f67 = fArr[i38];
                        int i39 = i38 + 1;
                        float f68 = fArr[i39];
                        float f69 = (f64 * f68) + (f63 * f67) + f65;
                        fArr[i38] = (((f52 * f68) + (f51 * f67)) + f53) / f69;
                        fArr[i39] = (((f68 * f58) + (f67 * f57)) + f59) / f69;
                    }
                    int i40 = k.b;
                    ot1 ot1Var2 = ot1Var;
                    float f70 = f53;
                    int i41 = 0;
                    boolean z4 = true;
                    while (i41 < i36 && z4) {
                        int i42 = (int) fArr[i41];
                        int i43 = i41 + 1;
                        int i44 = i36;
                        int i45 = (int) fArr[i43];
                        int i46 = i41;
                        if (i42 < -1 || i42 > i14 || i45 < -1 || i45 > i40) {
                            throw NotFoundException.a();
                        }
                        if (i42 == -1) {
                            fArr[i46] = 0.0f;
                        } else if (i42 == i14) {
                            fArr[i46] = i14 - 1;
                        } else {
                            z = false;
                            if (i45 != -1) {
                                fArr[i43] = 0.0f;
                            } else if (i45 == i40) {
                                fArr[i43] = i40 - 1;
                            } else {
                                z4 = z;
                                i41 = i46 + 2;
                                i36 = i44;
                            }
                            z4 = true;
                            i41 = i46 + 2;
                            i36 = i44;
                        }
                        z = true;
                        if (i45 != -1) {
                        }
                        z4 = true;
                        i41 = i46 + 2;
                        i36 = i44;
                    }
                    int i47 = i32 - 2;
                    boolean z5 = true;
                    while (i47 >= 0 && z5) {
                        int i48 = (int) fArr[i47];
                        int i49 = i47 + 1;
                        int i50 = i47;
                        int i51 = (int) fArr[i49];
                        if (i48 < -1 || i48 > i14 || i51 < -1 || i51 > i40) {
                            throw NotFoundException.a();
                        }
                        if (i48 == -1) {
                            fArr[i50] = 0.0f;
                        } else if (i48 == i14) {
                            fArr[i50] = i14 - 1;
                        } else {
                            z5 = false;
                            if (i51 != -1) {
                                fArr[i49] = 0.0f;
                            } else if (i51 == i40) {
                                fArr[i49] = i40 - 1;
                            } else {
                                i47 = i50 - 2;
                            }
                            z5 = true;
                            i47 = i50 - 2;
                        }
                        z5 = true;
                        if (i51 != -1) {
                        }
                        z5 = true;
                        i47 = i50 - 2;
                    }
                    for (int i52 = 0; i52 < i32; i52 += 2) {
                        try {
                            if (k.b((int) fArr[i52], (int) fArr[i52 + 1])) {
                                vz5Var.c(i52 / 2, i33);
                            }
                        } catch (ArrayIndexOutOfBoundsException unused2) {
                            throw NotFoundException.a();
                        }
                    }
                    i33++;
                    d8rVar3 = d8rVar12;
                    i29 = i37;
                    ot1Var = ot1Var2;
                    f53 = f70;
                }
                d8r d8rVar13 = d8rVar3;
                ot1 ot1Var3 = ot1Var;
                if (ot1Var3 == null) {
                    i2 = 3;
                    wzj0VarArr = new wzj0[]{d8rVar11, d8rVar10, d8rVar13};
                } else {
                    i2 = 3;
                    wzj0VarArr = new wzj0[]{d8rVar11, d8rVar10, d8rVar13, ot1Var3};
                }
                a = bVar.a(vz5Var, map);
                wzj0VarArr2 = wzj0VarArr;
            } catch (IllegalArgumentException unused3) {
                throw FormatException.a();
            }
        } else {
            vz5 k2 = h0wVar.k();
            int i53 = 0;
            while (true) {
                iArr = k2.w;
                i8 = k2.a;
                i9 = k2.c;
                if (i53 >= iArr.length || iArr[i53] != 0) {
                    break;
                }
                i53++;
            }
            if (i53 == iArr.length) {
                iArr2 = null;
            } else {
                int i54 = i53 / i9;
                int i55 = (i53 % i9) * 32;
                int i56 = iArr[i53];
                int i57 = 0;
                while ((i56 << (31 - i57)) == 0) {
                    i57++;
                }
                iArr2 = new int[]{i55 + i57, i54};
            }
            int[] iArr6 = k2.w;
            int length = iArr6.length - 1;
            while (length >= 0 && iArr6[length] == 0) {
                length--;
            }
            if (length < 0) {
                iArr3 = null;
            } else {
                int i58 = length / i9;
                int i59 = (length % i9) * 32;
                int i60 = iArr6[length];
                int i61 = 31;
                while ((i60 >>> i61) == 0) {
                    i61--;
                }
                iArr3 = new int[]{i59 + i61, i58};
            }
            if (iArr2 == null || iArr3 == null) {
                throw NotFoundException.a();
            }
            int i62 = k2.b;
            int i63 = iArr2[0];
            int i64 = iArr2[1];
            boolean z6 = true;
            int i65 = 0;
            while (i63 < i8 && i64 < i62) {
                f6 = 2.0f;
                if (z6 != k2.b(i63, i64)) {
                    int i66 = i65 + 1;
                    if (i66 == 5) {
                        break;
                    }
                    z6 = !z6;
                    i65 = i66;
                }
                i63++;
                i64++;
            }
            f6 = 2.0f;
            if (i63 == i8 || i64 == i62) {
                throw NotFoundException.a();
            }
            int i67 = iArr2[0];
            float f71 = (i63 - i67) / 7.0f;
            int i68 = iArr2[1];
            int i69 = iArr3[1];
            int i70 = iArr3[0];
            if (i67 >= i70 || i68 >= i69) {
                throw NotFoundException.a();
            }
            int i71 = i69 - i68;
            if (i71 != i70 - i67 && (i70 = i67 + i71) >= i8) {
                throw NotFoundException.a();
            }
            int round = Math.round(((i70 - i67) + 1) / f71);
            int round2 = Math.round((i71 + 1) / f71);
            if (round <= 0 || round2 <= 0) {
                throw NotFoundException.a();
            }
            if (round2 != round) {
                throw NotFoundException.a();
            }
            int i72 = (int) (f71 / f6);
            int i73 = i68 + i72;
            int i74 = i67 + i72;
            int i75 = (((int) ((round - 1) * f71)) + i74) - i70;
            if (i75 > 0) {
                if (i75 > i72) {
                    throw NotFoundException.a();
                }
                i74 -= i75;
            }
            int i76 = (((int) ((round2 - 1) * f71)) + i73) - i69;
            if (i76 > 0) {
                if (i76 > i72) {
                    throw NotFoundException.a();
                }
                i73 -= i76;
            }
            vz5 vz5Var2 = new vz5(round, round2);
            for (int i77 = 0; i77 < round2; i77++) {
                int i78 = ((int) (i77 * f71)) + i73;
                for (int i79 = 0; i79 < round; i79++) {
                    if (k2.b(((int) (i79 * f71)) + i74, i78)) {
                        vz5Var2.c(i79, i77);
                    }
                }
            }
            a = bVar.a(vz5Var2, map);
            wzj0VarArr2 = b;
            i2 = 3;
        }
        int i80 = a.f;
        if (a.e != null && wzj0VarArr2.length >= i2) {
            wzj0 wzj0Var = wzj0VarArr2[0];
            wzj0VarArr2[0] = wzj0VarArr2[2];
            wzj0VarArr2[2] = wzj0Var;
        }
        q6c0 q6c0Var = new q6c0(a.a, wzj0VarArr2);
        List list = a.b;
        if (list != null) {
            q6c0Var.O(ResultMetadataType.BYTE_SEGMENTS, list);
        }
        String str = a.c;
        if (str != null) {
            q6c0Var.O(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
        }
        if (i80 >= 0 && (i7 = a.g) >= 0) {
            q6c0Var.O(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(i7));
            q6c0Var.O(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(i80));
        }
        q6c0Var.O(ResultMetadataType.ERRORS_CORRECTED, a.d);
        q6c0Var.O(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]Q" + a.h);
        return q6c0Var;
    }
}
