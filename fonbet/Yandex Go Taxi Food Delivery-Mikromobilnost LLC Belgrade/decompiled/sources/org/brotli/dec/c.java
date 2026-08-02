package org.brotli.dec;

import com.google.ar.core.ImageMetadata;
import defpackage.c991;
import defpackage.dw01;
import defpackage.e7a1;
import defpackage.i3u0;
import defpackage.jhj;
import defpackage.n891;
import defpackage.ny61;
import defpackage.o3;
import defpackage.po91;
import defpackage.t2b1;
import java.io.IOException;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes4.dex */
public abstract class c {
    public static final int[] a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public static final int[] b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    public static final int[] c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    public static final int[] d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, ImageMetadata.FLASH_STATE};

    public static void a(i3u0 i3u0Var, int i) {
        a aVar = i3u0Var.c;
        int[] iArr = i3u0Var.p;
        int i2 = i * 2;
        a.b(aVar);
        int i3 = i * 1080;
        int f = f(i3u0Var.e, i3, aVar);
        int[] iArr2 = i3u0Var.n;
        int[] iArr3 = i3u0Var.f;
        a.b(aVar);
        int f2 = f(iArr3, i3, aVar);
        iArr2[i] = a.d(aVar, po91.b[f2]) + po91.a[f2];
        int i4 = f == 1 ? iArr[i2 + 1] + 1 : f == 0 ? iArr[i2] : f - 2;
        int i5 = i3u0Var.o[i];
        if (i4 >= i5) {
            i4 -= i5;
        }
        int i6 = i2 + 1;
        iArr[i2] = iArr[i6];
        iArr[i6] = i4;
    }

    public static int b(int i, byte[] bArr, a aVar) {
        int i2;
        a.e(aVar);
        if (a.d(aVar, 1) != 0) {
            int d2 = a.d(aVar, 3);
            i2 = d2 == 0 ? 1 : a.d(aVar, d2) + (1 << d2);
        } else {
            i2 = 0;
        }
        int i3 = i2 + 1;
        if (i3 == 1) {
            int i4 = 0;
            while (i4 < i) {
                int min = Math.min(i4 + 1024, i) - i4;
                System.arraycopy(e7a1.a, 0, bArr, i4, min);
                i4 += min;
            }
        } else {
            int d3 = a.d(aVar, 1) == 1 ? a.d(aVar, 4) + 1 : 0;
            int[] iArr = new int[1080];
            e(i3 + d3, iArr, 0, aVar);
            int i5 = 0;
            while (i5 < i) {
                a.e(aVar);
                a.b(aVar);
                int f = f(iArr, 0, aVar);
                if (f == 0) {
                    bArr[i5] = 0;
                } else if (f <= d3) {
                    for (int d4 = a.d(aVar, f) + (1 << f); d4 != 0; d4--) {
                        if (i5 >= i) {
                            d.a("Corrupted context map");
                            return 0;
                        }
                        bArr[i5] = 0;
                        i5++;
                    }
                } else {
                    bArr[i5] = (byte) (f - d3);
                }
                i5++;
            }
            if (a.d(aVar, 1) == 1) {
                int[] iArr2 = new int[256];
                for (int i6 = 0; i6 < 256; i6++) {
                    iArr2[i6] = i6;
                }
                for (int i7 = 0; i7 < i; i7++) {
                    int i8 = bArr[i7] & 255;
                    int i9 = iArr2[i8];
                    bArr[i7] = (byte) i9;
                    if (i8 != 0) {
                        while (i8 > 0) {
                            iArr2[i8] = iArr2[i8 - 1];
                            i8--;
                        }
                        iArr2[0] = i9;
                    }
                }
            }
        }
        return i3;
    }

    public static void c(i3u0 i3u0Var) {
        a(i3u0Var, 0);
        int i = i3u0Var.p[1];
        int i2 = i << 6;
        i3u0Var.A = i2;
        i3u0Var.v = ((int[]) i3u0Var.k.c)[i3u0Var.z[i2] & 255];
        byte b2 = i3u0Var.y[i];
        int[] iArr = n891.b;
        i3u0Var.C = iArr[b2];
        i3u0Var.D = iArr[b2 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
    
        org.brotli.dec.d.a("Invalid backward reference");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014c, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0603 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0435 A[LOOP:7: B:108:0x0435->B:115:0x047e, LOOP_START, PHI: r8
      0x0435: PHI (r8v113 char) = (r8v70 char), (r8v121 char) binds: [B:107:0x0433, B:115:0x047e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x060b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(i3u0 i3u0Var) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i3u0Var.a;
        int[] iArr = i3u0Var.p;
        o3 o3Var = i3u0Var.m;
        o3 o3Var2 = i3u0Var.k;
        o3 o3Var3 = i3u0Var.l;
        a aVar = i3u0Var.c;
        int[] iArr2 = i3u0Var.n;
        if (i11 == 0) {
            ny61.r("Can't decompress until initialized");
            return;
        }
        if (i11 == 11) {
            ny61.r("Can't decompress after close");
            return;
        }
        int i12 = 1;
        int i13 = i3u0Var.P - 1;
        byte[] bArr2 = i3u0Var.d;
        while (true) {
            int i14 = i3u0Var.a;
            int i15 = i12;
            if (i14 == 10) {
                if (i14 == 10) {
                    if (i3u0Var.g < 0) {
                        d.a("Invalid metablock length");
                        return;
                    }
                    int i16 = (64 - aVar.g) & 7;
                    if (i16 == 0 || a.d(aVar, i16) == 0) {
                        a.a(aVar, true);
                        return;
                    } else {
                        d.a("Corrupted padding bits");
                        return;
                    }
                }
                return;
            }
            if (i14 != 12) {
                switch (i14) {
                    case 1:
                        if (i3u0Var.g < 0) {
                            d.a("Invalid metablock length");
                            return;
                        }
                        if (i3u0Var.h) {
                            i3u0Var.b = 10;
                            i3u0Var.X = i3u0Var.r;
                            i3u0Var.W = 0;
                            i3u0Var.a = 12;
                        } else {
                            o3Var2.w = null;
                            o3Var2.c = null;
                            o3Var3.w = null;
                            o3Var3.c = null;
                            o3Var.w = null;
                            o3Var.c = null;
                            a.e(aVar);
                            boolean z = a.d(aVar, 1) == 1;
                            i3u0Var.h = z;
                            i3u0Var.g = 0;
                            i3u0Var.i = false;
                            i3u0Var.j = false;
                            if (!z || a.d(aVar, 1) == 0) {
                                int d2 = a.d(aVar, 2) + 4;
                                if (d2 == 7) {
                                    i3u0Var.j = true;
                                    if (a.d(aVar, 1) != 0) {
                                        d.a("Corrupted reserved bit");
                                        return;
                                    }
                                    int d3 = a.d(aVar, 2);
                                    if (d3 != 0) {
                                        for (int i17 = 0; i17 < d3; i17++) {
                                            int d4 = a.d(aVar, 8);
                                            if (d4 == 0 && i17 + 1 == d3 && d3 > 1) {
                                                d.a("Exuberant nibble");
                                                return;
                                            }
                                            i3u0Var.g = (d4 << (i17 * 8)) | i3u0Var.g;
                                        }
                                    }
                                } else {
                                    for (int i18 = 0; i18 < d2; i18++) {
                                        int d5 = a.d(aVar, 4);
                                        if (d5 == 0 && i18 + 1 == d2 && d2 > 4) {
                                            d.a("Exuberant nibble");
                                            return;
                                        }
                                        i3u0Var.g = (d5 << (i18 * 4)) | i3u0Var.g;
                                    }
                                }
                                i3u0Var.g++;
                                if (!i3u0Var.h) {
                                    i3u0Var.i = a.d(aVar, 1) == 1;
                                }
                            }
                            if (i3u0Var.g != 0 || i3u0Var.j) {
                                if (i3u0Var.i || i3u0Var.j) {
                                    int i19 = (64 - aVar.g) & 7;
                                    if (i19 != 0 && a.d(aVar, i19) != 0) {
                                        d.a("Corrupted padding bits");
                                        return;
                                    }
                                    i3u0Var.a = i3u0Var.j ? 4 : 5;
                                } else {
                                    i3u0Var.a = 2;
                                }
                                if (!i3u0Var.j) {
                                    long j = i3u0Var.Q + i3u0Var.g;
                                    i3u0Var.Q = j;
                                    int i20 = i3u0Var.P;
                                    int i21 = i3u0Var.O;
                                    if (i20 < i21) {
                                        if (i21 > j) {
                                            int length = ((int) j) + i3u0Var.R.length;
                                            while (true) {
                                                int i22 = i21 >> 1;
                                                if (i22 > length) {
                                                    i21 = i22;
                                                } else if (!i3u0Var.h && i21 < 16384 && i3u0Var.O >= 16384) {
                                                    i21 = 16384;
                                                }
                                            }
                                        }
                                        int i23 = i3u0Var.P;
                                        if (i21 > i23) {
                                            byte[] bArr3 = new byte[i21 + 37];
                                            byte[] bArr4 = i3u0Var.d;
                                            if (bArr4 != null) {
                                                System.arraycopy(bArr4, 0, bArr3, 0, i23);
                                            } else {
                                                byte[] bArr5 = i3u0Var.R;
                                                if (bArr5.length != 0) {
                                                    int length2 = bArr5.length;
                                                    int i24 = i3u0Var.N;
                                                    if (length2 > i24) {
                                                        int i25 = length2 - i24;
                                                        length2 = i24;
                                                        i = i25;
                                                    } else {
                                                        i = 0;
                                                    }
                                                    System.arraycopy(bArr5, i, bArr3, 0, length2);
                                                    i3u0Var.r = length2;
                                                    i3u0Var.S = length2;
                                                }
                                            }
                                            i3u0Var.d = bArr3;
                                            i3u0Var.P = i21;
                                        }
                                    }
                                }
                            }
                        }
                        i13 = i3u0Var.P - 1;
                        bArr2 = i3u0Var.d;
                        i12 = 1;
                        break;
                    case 2:
                        bArr = bArr2;
                        int i26 = i15;
                        int[] iArr3 = i3u0Var.f;
                        int[] iArr4 = i3u0Var.o;
                        int i27 = 0;
                        while (i27 < 3) {
                            if (a.d(aVar, i26) != 0) {
                                int d6 = a.d(aVar, 3);
                                i3 = d6 == 0 ? i26 : a.d(aVar, d6) + (i26 << d6);
                            } else {
                                i3 = 0;
                            }
                            iArr4[i27] = i3 + 1;
                            iArr2[i27] = 268435456;
                            int i28 = iArr4[i27];
                            if (i28 > i26) {
                                int i29 = i27 * 1080;
                                e(i28 + 2, i3u0Var.e, i29, aVar);
                                e(26, iArr3, i29, aVar);
                                a.b(aVar);
                                int f = f(iArr3, i29, aVar);
                                iArr2[i27] = a.d(aVar, po91.b[f]) + po91.a[f];
                            }
                            i27++;
                            i26 = 1;
                        }
                        a.e(aVar);
                        i3u0Var.J = a.d(aVar, 2);
                        int d7 = a.d(aVar, 4);
                        int i30 = i3u0Var.J;
                        int i31 = (d7 << i30) + 16;
                        i3u0Var.H = i31;
                        i3u0Var.I = (1 << i30) - 1;
                        int i32 = i31 + (48 << i30);
                        char c3 = 0;
                        i3u0Var.y = new byte[iArr4[0]];
                        int i33 = 0;
                        while (true) {
                            int i34 = iArr4[c3];
                            if (i33 < i34) {
                                int min = Math.min(i33 + 96, i34);
                                while (i33 < min) {
                                    i3u0Var.y[i33] = (byte) (a.d(aVar, 2) << 1);
                                    i33++;
                                }
                                a.e(aVar);
                                c3 = 0;
                            } else {
                                int i35 = i34 << 6;
                                byte[] bArr6 = new byte[i35];
                                i3u0Var.z = bArr6;
                                int b2 = b(i35, bArr6, aVar);
                                i3u0Var.u = true;
                                int i36 = 0;
                                while (true) {
                                    if (i36 < (iArr4[0] << 6)) {
                                        if (i3u0Var.z[i36] != (i36 >> 6)) {
                                            i3u0Var.u = false;
                                        } else {
                                            i36++;
                                        }
                                    }
                                }
                                int i37 = iArr4[2] << 2;
                                byte[] bArr7 = new byte[i37];
                                i3u0Var.G = bArr7;
                                int b3 = b(i37, bArr7, aVar);
                                o3Var2.b = 256;
                                o3Var2.w = new int[b2 * 1080];
                                o3Var2.c = new int[b2];
                                int i38 = iArr4[1];
                                o3Var3.b = 704;
                                o3Var3.w = new int[i38 * 1080];
                                o3Var3.c = new int[i38];
                                o3Var.b = i32;
                                o3Var.w = new int[b3 * 1080];
                                o3Var.c = new int[b3];
                                o3.r(o3Var2, aVar);
                                o3.r(o3Var3, aVar);
                                o3.r(o3Var, aVar);
                                i3u0Var.A = 0;
                                i3u0Var.B = 0;
                                byte b4 = i3u0Var.y[0];
                                int[] iArr5 = n891.b;
                                i3u0Var.C = iArr5[b4];
                                i2 = 1;
                                i3u0Var.D = iArr5[b4 + 1];
                                i3u0Var.v = ((int[]) o3Var2.c)[0];
                                i3u0Var.E = ((int[]) o3Var3.c)[0];
                                iArr[4] = 1;
                                iArr[2] = 1;
                                iArr[0] = 1;
                                iArr[5] = 0;
                                iArr[3] = 0;
                                iArr[1] = 0;
                                i3u0Var.a = 3;
                                if (i3u0Var.g > 0) {
                                    i3u0Var.a = i2;
                                    break;
                                } else {
                                    a.e(aVar);
                                    if (iArr2[i2] == 0) {
                                        a(i3u0Var, i2);
                                        i3u0Var.E = ((int[]) o3Var3.c)[iArr[3]];
                                    }
                                    iArr2[i2] = iArr2[i2] - i2;
                                    a.b(aVar);
                                    int f2 = f((int[]) o3Var3.w, i3u0Var.E, aVar);
                                    int i39 = f2 >>> 6;
                                    i3u0Var.F = 0;
                                    if (i39 >= 2) {
                                        i39 -= 2;
                                        i3u0Var.F = -1;
                                    }
                                    int i40 = po91.g[i39] + ((f2 >>> 3) & 7);
                                    int i41 = po91.h[i39] + (f2 & 7);
                                    i3u0Var.x = a.d(aVar, po91.d[i40]) + po91.c[i40];
                                    i3u0Var.L = a.d(aVar, po91.f[i41]) + po91.e[i41];
                                    c2 = 0;
                                    i3u0Var.w = 0;
                                    i3u0Var.a = 6;
                                    if (i3u0Var.u) {
                                        int i42 = i3u0Var.r;
                                        int i43 = bArr[(i42 - 1) & i13] & 255;
                                        int i44 = bArr[(i42 - 2) & i13] & 255;
                                        while (i3u0Var.w < i3u0Var.x) {
                                            a.e(aVar);
                                            if (iArr2[0] == 0) {
                                                c(i3u0Var);
                                            }
                                            byte[] bArr8 = i3u0Var.z;
                                            int i45 = i3u0Var.A;
                                            int i46 = i3u0Var.C + i43;
                                            int[] iArr6 = n891.a;
                                            int i47 = bArr8[i45 + (iArr6[i3u0Var.D + i44] | iArr6[i46])] & 255;
                                            iArr2[0] = iArr2[0] - 1;
                                            a.b(aVar);
                                            int f3 = f((int[]) o3Var2.w, ((int[]) o3Var2.c)[i47], aVar);
                                            int i48 = i3u0Var.r;
                                            bArr[i48] = (byte) f3;
                                            i3u0Var.w++;
                                            i3u0Var.r = i48 + 1;
                                            if (i48 == i13) {
                                                i4 = 6;
                                                i3u0Var.b = 6;
                                                i3u0Var.X = i3u0Var.P;
                                                i3u0Var.W = 0;
                                                i3u0Var.a = 12;
                                                if (i3u0Var.a == i4) {
                                                    int i49 = i3u0Var.g - i3u0Var.x;
                                                    i3u0Var.g = i49;
                                                    if (i49 <= 0) {
                                                        i3u0Var.a = 3;
                                                        break;
                                                    } else {
                                                        if (i3u0Var.F < 0) {
                                                            a.e(aVar);
                                                            if (iArr2[2] == 0) {
                                                                a(i3u0Var, 2);
                                                                i3u0Var.B = iArr[5] << 2;
                                                            }
                                                            iArr2[2] = iArr2[2] - 1;
                                                            a.b(aVar);
                                                            int[] iArr7 = (int[]) o3Var.w;
                                                            int[] iArr8 = (int[]) o3Var.c;
                                                            byte[] bArr9 = i3u0Var.G;
                                                            int i50 = i3u0Var.B;
                                                            int i51 = i3u0Var.L;
                                                            int f4 = f(iArr7, iArr8[bArr9[i50 + (i51 > 4 ? 3 : i51 - 2)] & 255], aVar);
                                                            i3u0Var.F = f4;
                                                            int i52 = i3u0Var.H;
                                                            if (f4 >= i52) {
                                                                int i53 = f4 - i52;
                                                                int i54 = i3u0Var.I & i53;
                                                                int i55 = i53 >>> i3u0Var.J;
                                                                i3u0Var.F = i55;
                                                                int i56 = (i55 >>> 1) + 1;
                                                                i3u0Var.F = i52 + i54 + ((a.d(aVar, i56) + ((((i55 & 1) + 2) << i56) - 4)) << i3u0Var.J);
                                                            }
                                                        }
                                                        int i57 = i3u0Var.F;
                                                        int[] iArr9 = i3u0Var.q;
                                                        int i58 = i3u0Var.t;
                                                        int i59 = i57 < 16 ? iArr9[(b[i57] + i58) & 3] + c[i57] : i57 - 15;
                                                        i3u0Var.K = i59;
                                                        if (i59 < 0) {
                                                            d.a("Negative distance");
                                                            return;
                                                        }
                                                        int i60 = i3u0Var.s;
                                                        int i61 = i3u0Var.N;
                                                        if (i60 == i61 || (i5 = i3u0Var.r) >= i61) {
                                                            i3u0Var.s = i61;
                                                        } else {
                                                            i3u0Var.s = i5;
                                                        }
                                                        i3u0Var.M = i3u0Var.r;
                                                        if (i59 > i3u0Var.s) {
                                                            i3u0Var.a = 9;
                                                            break;
                                                        } else {
                                                            if (i57 > 0) {
                                                                iArr9[i58 & 3] = i59;
                                                                i3u0Var.t = i58 + 1;
                                                            }
                                                            if (i3u0Var.L > i3u0Var.g) {
                                                                d.a("Invalid backward reference");
                                                                return;
                                                            }
                                                            i3u0Var.w = 0;
                                                            i3u0Var.a = 7;
                                                            int i62 = i3u0Var.r;
                                                            i6 = (i62 - i3u0Var.K) & i13;
                                                            i7 = i3u0Var.L - i3u0Var.w;
                                                            if (i6 + i7 < i13 || i62 + i7 >= i13) {
                                                                do {
                                                                    i8 = i3u0Var.w;
                                                                    if (i8 >= i3u0Var.L) {
                                                                        i9 = i3u0Var.r;
                                                                        bArr[i9] = bArr[(i9 - i3u0Var.K) & i13];
                                                                        i3u0Var.g--;
                                                                        i3u0Var.w = i8 + 1;
                                                                        i3u0Var.r = i9 + 1;
                                                                    }
                                                                } while (i9 != i13);
                                                                i10 = 7;
                                                                i3u0Var.b = 7;
                                                                i3u0Var.X = i3u0Var.P;
                                                                i3u0Var.W = 0;
                                                                i3u0Var.a = 12;
                                                                if (i3u0Var.a == i10) {
                                                                    i3u0Var.a = 3;
                                                                    break;
                                                                }
                                                            } else {
                                                                int i63 = 0;
                                                                while (i63 < i7) {
                                                                    bArr[i62] = bArr[i6];
                                                                    i63++;
                                                                    i62++;
                                                                    i6++;
                                                                }
                                                                i3u0Var.w += i7;
                                                                i3u0Var.g -= i7;
                                                                i3u0Var.r += i7;
                                                            }
                                                            i10 = 7;
                                                            if (i3u0Var.a == i10) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i64 = i43;
                                                i43 = f3;
                                                i44 = i64;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (i3u0Var.w < i3u0Var.x) {
                                                a.e(aVar);
                                                if (iArr2[c2] == 0) {
                                                    c(i3u0Var);
                                                }
                                                iArr2[c2] = iArr2[c2] - 1;
                                                a.b(aVar);
                                                bArr[i3u0Var.r] = (byte) f((int[]) o3Var2.w, i3u0Var.v, aVar);
                                                i3u0Var.w++;
                                                int i65 = i3u0Var.r;
                                                i3u0Var.r = i65 + 1;
                                                if (i65 == i13) {
                                                    i3u0Var.b = 6;
                                                    i3u0Var.X = i3u0Var.P;
                                                    i3u0Var.W = 0;
                                                    i3u0Var.a = 12;
                                                } else {
                                                    c2 = 0;
                                                }
                                            }
                                        }
                                    }
                                    i4 = 6;
                                    if (i3u0Var.a == i4) {
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        bArr = bArr2;
                        i2 = i15;
                        if (i3u0Var.g > 0) {
                        }
                        break;
                    case 4:
                        bArr = bArr2;
                        while (i3u0Var.g > 0) {
                            a.e(aVar);
                            a.d(aVar, 8);
                            i3u0Var.g--;
                        }
                        i3u0Var.a = 1;
                        break;
                    case 5:
                        byte[] bArr10 = i3u0Var.d;
                        int i66 = i3u0Var.g;
                        if (i66 > 0) {
                            int min2 = Math.min(i3u0Var.P - i3u0Var.r, i66);
                            int i67 = i3u0Var.r;
                            if ((aVar.g & 7) != 0) {
                                d.a("Unaligned copyBytes");
                                return;
                            }
                            int i68 = min2;
                            while (true) {
                                int i69 = aVar.g;
                                if (i69 != 64 && i68 != 0) {
                                    bArr10[i67] = (byte) (aVar.f >>> i69);
                                    aVar.g = i69 + 8;
                                    i68--;
                                    i67++;
                                    bArr2 = bArr2;
                                }
                            }
                            bArr = bArr2;
                            if (i68 != 0) {
                                int min3 = Math.min(a.c(aVar), i68 >> 2);
                                if (min3 > 0) {
                                    int i70 = min3 << 2;
                                    System.arraycopy(aVar.a, aVar.h << 2, bArr10, i67, i70);
                                    i67 += i70;
                                    i68 -= i70;
                                    aVar.h += min3;
                                }
                                if (i68 != 0) {
                                    if (a.c(aVar) > 0) {
                                        a.b(aVar);
                                        while (i68 != 0) {
                                            long j2 = aVar.f;
                                            int i71 = aVar.g;
                                            bArr10[i67] = (byte) (j2 >>> i71);
                                            aVar.g = i71 + 8;
                                            i68--;
                                            i67++;
                                        }
                                        a.a(aVar, false);
                                    } else {
                                        while (i68 > 0) {
                                            try {
                                                int read = aVar.d.read(bArr10, i67, i68);
                                                if (read == -1) {
                                                    throw new BrotliRuntimeException("Unexpected end of input");
                                                }
                                                i67 += read;
                                                i68 -= read;
                                            } catch (IOException e) {
                                                throw new BrotliRuntimeException("Failed to read input", e);
                                            }
                                        }
                                    }
                                }
                            }
                            i3u0Var.g -= min2;
                            int i72 = i3u0Var.r + min2;
                            i3u0Var.r = i72;
                            int i73 = i3u0Var.P;
                            if (i72 == i73) {
                                i3u0Var.b = 5;
                                i3u0Var.X = i73;
                                i3u0Var.W = 0;
                                i3u0Var.a = 12;
                                break;
                            } else {
                                if (aVar.g == 64) {
                                    a.e(aVar);
                                    a.a(aVar, false);
                                    a.b(aVar);
                                    a.b(aVar);
                                }
                                i3u0Var.a = 1;
                                break;
                            }
                        } else {
                            if (aVar.g == 64) {
                                a.e(aVar);
                                a.a(aVar, false);
                                a.b(aVar);
                                a.b(aVar);
                            }
                            i3u0Var.a = i15;
                            bArr = bArr2;
                            break;
                        }
                        break;
                    case 6:
                        bArr = bArr2;
                        c2 = 0;
                        if (i3u0Var.u) {
                        }
                        i4 = 6;
                        if (i3u0Var.a == i4) {
                        }
                        break;
                    case 7:
                        bArr = bArr2;
                        int i622 = i3u0Var.r;
                        i6 = (i622 - i3u0Var.K) & i13;
                        i7 = i3u0Var.L - i3u0Var.w;
                        if (i6 + i7 < i13) {
                            break;
                        }
                        do {
                            i8 = i3u0Var.w;
                            if (i8 >= i3u0Var.L) {
                            }
                        } while (i9 != i13);
                        i10 = 7;
                        i3u0Var.b = 7;
                        i3u0Var.X = i3u0Var.P;
                        i3u0Var.W = 0;
                        i3u0Var.a = 12;
                        if (i3u0Var.a == i10) {
                        }
                        break;
                    case 8:
                        int i74 = i3u0Var.P;
                        System.arraycopy(bArr2, i74, bArr2, 0, i3u0Var.M - i74);
                        i3u0Var.a = 3;
                        bArr = bArr2;
                        break;
                    case 9:
                        int i75 = i3u0Var.L;
                        if (i75 >= 4 && i75 <= 24) {
                            int i76 = c991.a[i75];
                            int i77 = (i3u0Var.K - i3u0Var.s) - 1;
                            int i78 = i77 & ((i15 << r15) - 1);
                            int i79 = i77 >>> c991.b[i75];
                            int i80 = (i78 * i75) + i76;
                            dw01[] dw01VarArr = dw01.d;
                            if (i79 >= dw01VarArr.length) {
                                d.a("Invalid backward reference");
                                return;
                            }
                            int i81 = i3u0Var.M;
                            byte[] bArr11 = jhj.a;
                            dw01 dw01Var = dw01VarArr[i79];
                            int i82 = i81;
                            for (byte b5 : dw01Var.a) {
                                bArr2[i82] = b5;
                                i82++;
                            }
                            int i83 = dw01Var.b;
                            int i84 = i83 >= 12 ? i83 - 11 : 0;
                            if (i84 > i75) {
                                i84 = i75;
                            }
                            int i85 = i80 + i84;
                            int i86 = (i75 - i84) - (i83 <= 9 ? i83 : 0);
                            int i87 = i86;
                            while (i87 > 0) {
                                bArr2[i82] = bArr11[i85];
                                i87--;
                                i82++;
                                i85++;
                            }
                            if (i83 == 11 || i83 == 10) {
                                int i88 = i82 - i86;
                                if (i83 == 10) {
                                    i86 = i15;
                                }
                                while (i86 > 0) {
                                    byte b6 = bArr2[i88];
                                    int i89 = b6 & 255;
                                    if (i89 < 192) {
                                        if (i89 >= 97 && i89 <= 122) {
                                            bArr2[i88] = (byte) (b6 ^ BlobHeaderStructure.BLOB_VERSION);
                                        }
                                        i88++;
                                        i86--;
                                    } else if (i89 < 224) {
                                        int i90 = i88 + 1;
                                        bArr2[i90] = (byte) (bArr2[i90] ^ BlobHeaderStructure.BLOB_VERSION);
                                        i88 += 2;
                                        i86 -= 2;
                                    } else {
                                        int i91 = i88 + 2;
                                        bArr2[i91] = (byte) (bArr2[i91] ^ 5);
                                        i88 += 3;
                                        i86 -= 3;
                                    }
                                }
                            }
                            byte[] bArr12 = dw01Var.c;
                            for (byte b7 : bArr12) {
                                bArr2[i82] = b7;
                                i82++;
                            }
                            int i92 = i82 - i81;
                            int i93 = i3u0Var.M + i92;
                            i3u0Var.M = i93;
                            i3u0Var.r += i92;
                            i3u0Var.g -= i92;
                            int i94 = i3u0Var.P;
                            if (i93 >= i94) {
                                i3u0Var.b = 8;
                                i3u0Var.X = i94;
                                i3u0Var.W = 0;
                                i3u0Var.a = 12;
                            } else {
                                i3u0Var.a = 3;
                            }
                            bArr = bArr2;
                            break;
                        }
                        break;
                    default:
                        throw new BrotliRuntimeException("Unexpected state " + i3u0Var.a);
                }
            } else {
                bArr = bArr2;
                int i95 = i3u0Var.S;
                if (i95 != 0) {
                    i3u0Var.W += i95;
                    i3u0Var.S = 0;
                }
                int min4 = Math.min(i3u0Var.U - i3u0Var.V, i3u0Var.X - i3u0Var.W);
                if (min4 != 0) {
                    System.arraycopy(i3u0Var.d, i3u0Var.W, i3u0Var.Y, i3u0Var.T + i3u0Var.V, min4);
                    i3u0Var.V += min4;
                    i3u0Var.W += min4;
                }
                if (i3u0Var.V >= i3u0Var.U) {
                    return;
                }
                int i96 = i3u0Var.r;
                int i97 = i3u0Var.N;
                if (i96 >= i97) {
                    i3u0Var.s = i97;
                }
                i3u0Var.r = i96 & i13;
                i3u0Var.a = i3u0Var.b;
            }
            bArr2 = bArr;
            i12 = 1;
        }
    }

    public static void e(int i, int[] iArr, int i2, a aVar) {
        int i3;
        int i4;
        int i5;
        a.e(aVar);
        int[] iArr2 = new int[i];
        int d2 = a.d(aVar, 2);
        char c2 = 3;
        boolean z = true;
        if (d2 == 1) {
            int i6 = i - 1;
            int[] iArr3 = new int[4];
            int d3 = a.d(aVar, 2) + 1;
            int i7 = 0;
            while (i6 != 0) {
                i6 >>= 1;
                i7++;
            }
            for (int i8 = 0; i8 < d3; i8++) {
                int d4 = a.d(aVar, i7) % i;
                iArr3[i8] = d4;
                iArr2[d4] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (d3 != 1) {
                if (d3 == 2) {
                    int i9 = iArr3[0];
                    int i10 = iArr3[1];
                    r7 = i9 != i10;
                    iArr2[i10] = 1;
                } else if (d3 != 3) {
                    int i11 = iArr3[0];
                    int i12 = iArr3[1];
                    boolean z2 = (i11 == i12 || i11 == (i4 = iArr3[2]) || i11 == (i5 = iArr3[3]) || i12 == i4 || i12 == i5 || i4 == i5) ? false : true;
                    if (a.d(aVar, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z = z2;
                } else {
                    int i13 = iArr3[0];
                    int i14 = iArr3[1];
                    if (i13 != i14 && i13 != (i3 = iArr3[2]) && i14 != i3) {
                        r7 = true;
                    }
                }
                z = r7;
            }
        } else {
            int[] iArr4 = new int[18];
            int i15 = 0;
            int i16 = 32;
            while (d2 < 18 && i16 > 0) {
                int i17 = a[d2];
                a.b(aVar);
                long j = aVar.f;
                char c3 = c2;
                int i18 = aVar.g;
                int i19 = d[((int) (j >>> i18)) & 15];
                aVar.g = i18 + (i19 >> 16);
                int i20 = i19 & 65535;
                iArr4[i17] = i20;
                if (i20 != 0) {
                    i16 -= 32 >> i20;
                    i15++;
                }
                d2++;
                c2 = c3;
            }
            if (i15 != 1 && i16 != 0) {
                z = false;
            }
            int[] iArr5 = new int[32];
            t2b1.h(0, 5, 18, iArr5, iArr4);
            int i21 = 8;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 32768;
            while (i22 < i && i25 > 0) {
                a.e(aVar);
                a.b(aVar);
                long j2 = aVar.f;
                int i26 = aVar.g;
                int i27 = iArr5[((int) (j2 >>> i26)) & 31];
                aVar.g = i26 + (i27 >> 16);
                int i28 = i27 & 65535;
                if (i28 < 16) {
                    int i29 = i22 + 1;
                    iArr2[i22] = i28;
                    if (i28 != 0) {
                        i25 -= 32768 >> i28;
                        i21 = i28;
                    }
                    i22 = i29;
                    i24 = 0;
                } else {
                    int i30 = i28 - 14;
                    int i31 = i28 == 16 ? i21 : 0;
                    if (i23 != i31) {
                        i23 = i31;
                        i24 = 0;
                    }
                    int d5 = a.d(aVar, i30) + 3 + (i24 > 0 ? (i24 - 2) << i30 : i24);
                    int i32 = d5 - i24;
                    if (i22 + i32 > i) {
                        d.a("symbol + repeatDelta > numSymbols");
                        return;
                    }
                    int i33 = 0;
                    while (i33 < i32) {
                        iArr2[i22] = i23;
                        i33++;
                        i22++;
                    }
                    if (i23 != 0) {
                        i25 -= i32 << (15 - i23);
                    }
                    i24 = d5;
                }
            }
            if (i25 != 0) {
                d.a("Unused space");
                return;
            }
            int i34 = i - i22;
            int i35 = 0;
            while (i35 < i34) {
                int min = Math.min(i35 + 1024, i34) - i35;
                System.arraycopy(e7a1.b, 0, iArr2, i22 + i35, min);
                i35 += min;
            }
        }
        if (z) {
            t2b1.h(i2, 8, i, iArr, iArr2);
        } else {
            d.a("Can't readHuffmanCode");
        }
    }

    public static int f(int[] iArr, int i, a aVar) {
        long j = aVar.f;
        int i2 = aVar.g;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & 255);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        int i7 = i5 & 65535;
        if (i6 <= 8) {
            aVar.g = i2 + i6;
            return i7;
        }
        int i8 = iArr[i4 + i7 + ((i3 & ((1 << i6) - 1)) >>> 8)];
        aVar.g = (i8 >> 16) + 8 + i2;
        return i8 & 65535;
    }
}
