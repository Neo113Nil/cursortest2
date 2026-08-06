package defpackage;

/* loaded from: classes.dex */
public final class p2 {
    public int IHQe1A4L2xu;
    public java.lang.Object oh6vYeIP;
    public java.lang.Object r1MBDhnF;

    public void AARZUJiTa(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.oh6vYeIP;
        long[] jArr2 = (long[]) this.r1MBDhnF;
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
            int i9 = i8 == 1023 ? this.IHQe1A4L2xu : (i8 * 3) + i7;
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
                        int i12 = defpackage.lz0.oh6vYeIP;
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

    public void EXtogiMhuM(int i, defpackage.m00 m00Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.oh6vYeIP;
        int i3 = this.IHQe1A4L2xu;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                m00Var.riuEU0zW4(java.lang.Integer.valueOf((int) (j >> 32)), java.lang.Integer.valueOf((int) j), java.lang.Integer.valueOf((int) (j2 >> 32)), java.lang.Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public void F7NU4MC0GW(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.oh6vYeIP;
        int i8 = this.IHQe1A4L2xu;
        int i9 = i8 + 3;
        this.IHQe1A4L2xu = i9;
        int length = jArr.length;
        if (length <= i9) {
            int max = java.lang.Math.max(length * 2, i9);
            this.oh6vYeIP = java.util.Arrays.copyOf(jArr, max);
            this.r1MBDhnF = java.util.Arrays.copyOf((long[]) this.r1MBDhnF, max);
        }
        long[] jArr2 = (long[]) this.oh6vYeIP;
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
                int i14 = defpackage.lz0.oh6vYeIP;
                jArr2[i12] = (java.lang.Math.min(i13, 1023) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    public void IHQe1A4L2xu(int i, defpackage.v5 v5Var) {
        if (i < 0) {
            defpackage.a60.IHQe1A4L2xu("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        defpackage.r70 r70Var = new defpackage.r70(this.IHQe1A4L2xu, i, v5Var);
        this.IHQe1A4L2xu += i;
        ((defpackage.xl0) this.oh6vYeIP).oh6vYeIP(r70Var);
    }

    public defpackage.r70 oh6vYeIP(int i) {
        if (i < 0 || i >= this.IHQe1A4L2xu) {
            java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "Index ", ", size ");
            JlrlGoKF.append(this.IHQe1A4L2xu);
            defpackage.a60.F7NU4MC0GW(JlrlGoKF.toString());
        }
        defpackage.r70 r70Var = (defpackage.r70) this.r1MBDhnF;
        if (r70Var != null) {
            int i2 = r70Var.IHQe1A4L2xu;
            if (i < r70Var.oh6vYeIP + i2 && i2 <= i) {
                return r70Var;
            }
        }
        defpackage.xl0 xl0Var = (defpackage.xl0) this.oh6vYeIP;
        defpackage.r70 r70Var2 = (defpackage.r70) xl0Var.adDC3e2L[defpackage.s70.adDC3e2L(i, xl0Var)];
        this.r1MBDhnF = r70Var2;
        return r70Var2;
    }

    public int r1MBDhnF(java.lang.Object obj) {
        defpackage.fl0 fl0Var = (defpackage.fl0) this.oh6vYeIP;
        int F7NU4MC0GW = fl0Var.F7NU4MC0GW(obj);
        if (F7NU4MC0GW >= 0) {
            return fl0Var.r1MBDhnF[F7NU4MC0GW];
        }
        return -1;
    }

    public void xiZrDbcSW0(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.oh6vYeIP;
        int i3 = this.IHQe1A4L2xu;
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
}
