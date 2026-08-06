package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x1 {
    public int ZpBGe2uQfcn8;
    public java.lang.Object fWTAfUmVKrZq;
    public java.lang.Object giKS3J6vZuNy;

    public void QiMR8OkAhezm(int i, defpackage.e20 e20Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.giKS3J6vZuNy;
        int i3 = this.ZpBGe2uQfcn8;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                e20Var.h3m55N1URyyK(java.lang.Integer.valueOf((int) (j >> 32)), java.lang.Integer.valueOf((int) j), java.lang.Integer.valueOf((int) (j2 >> 32)), java.lang.Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public void WDYagTQQm9ns(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.giKS3J6vZuNy;
        int i3 = this.ZpBGe2uQfcn8;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public defpackage.ea0 ZpBGe2uQfcn8(int i) {
        if (i < 0 || i >= this.ZpBGe2uQfcn8) {
            java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Index ", ", size ");
            h3m55N1URyyK.append(this.ZpBGe2uQfcn8);
            defpackage.h80.WDYagTQQm9ns(h3m55N1URyyK.toString());
        }
        defpackage.ea0 ea0Var = (defpackage.ea0) this.fWTAfUmVKrZq;
        if (ea0Var != null) {
            int i2 = ea0Var.ZpBGe2uQfcn8;
            if (i < i2 + 1 && i2 <= i) {
                return ea0Var;
            }
        }
        defpackage.ho0 ho0Var = (defpackage.ho0) this.giKS3J6vZuNy;
        defpackage.ea0 ea0Var2 = (defpackage.ea0) ho0Var.WDYagTQQm9ns[defpackage.n70.e6mdH7fiFuta(i, ho0Var)];
        this.fWTAfUmVKrZq = ea0Var2;
        return ea0Var2;
    }

    public void fWTAfUmVKrZq(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.giKS3J6vZuNy;
        int i8 = this.ZpBGe2uQfcn8;
        int i9 = i8 + 3;
        this.ZpBGe2uQfcn8 = i9;
        int length = jArr.length;
        if (length <= i9) {
            int max = java.lang.Math.max(length * 2, i9);
            this.giKS3J6vZuNy = java.util.Arrays.copyOf(jArr, max);
            this.fWTAfUmVKrZq = java.util.Arrays.copyOf((long[]) this.fWTAfUmVKrZq, max);
        }
        long[] jArr2 = (long[]) this.giKS3J6vZuNy;
        jArr2[i8] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i8 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (java.lang.Math.min(0, 1023) << 50) | (i10 << 25) | (i & 33554431);
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = defpackage.t31.giKS3J6vZuNy;
                jArr2[i12] = (java.lang.Math.min(i13, 1023) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    public int giKS3J6vZuNy(java.lang.Object obj) {
        defpackage.on0 on0Var = (defpackage.on0) this.giKS3J6vZuNy;
        int JhCgjQRTAOCT = on0Var.JhCgjQRTAOCT(obj);
        if (JhCgjQRTAOCT >= 0) {
            return on0Var.fWTAfUmVKrZq[JhCgjQRTAOCT];
        }
        return -1;
    }

    public void oh71FJcDz6S2(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.giKS3J6vZuNy;
        long[] jArr2 = (long[]) this.fWTAfUmVKrZq;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.ZpBGe2uQfcn8 : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = ((((int) j4) + i2) & 4294967295L) | ((((int) (j4 >> 32)) + i) << 32);
                    jArr[i11] = ((((int) j5) + i2) & 4294967295L) | ((((int) (j5 >> 32)) + i) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        int i12 = defpackage.t31.giKS3J6vZuNy;
                        jArr2[i4] = ((-1125899873288193L) & j3) | (((i7 + 3) & i3) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }
}
