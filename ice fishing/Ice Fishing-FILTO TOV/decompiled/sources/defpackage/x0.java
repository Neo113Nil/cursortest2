package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x0 {
    public int GWasM1elztuh;
    public Object X1lG3V04pd;
    public Object Yi7zF1RB1;

    public void AvO7iQsrTN(int i, nv nvVar) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.Yi7zF1RB1;
        int i3 = this.GWasM1elztuh;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                nvVar.XnEVoBF0td1l(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public void EljAMC1QTz(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.Yi7zF1RB1;
        long[] jArr2 = (long[]) this.X1lG3V04pd;
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
            int i9 = i8 == 1023 ? this.GWasM1elztuh : (i8 * 3) + i7;
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
                        int i12 = lt0.Yi7zF1RB1;
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

    public j30 GWasM1elztuh(int i) {
        if (i < 0 || i >= this.GWasM1elztuh) {
            StringBuilder rQPn8YBR = mr0.rQPn8YBR("Index ", i, ", size ");
            rQPn8YBR.append(this.GWasM1elztuh);
            w10.xqGvceK5x(rQPn8YBR.toString());
        }
        j30 j30Var = (j30) this.X1lG3V04pd;
        if (j30Var != null) {
            int i2 = j30Var.GWasM1elztuh;
            if (i < j30Var.Yi7zF1RB1 + i2 && i2 <= i) {
                return j30Var;
            }
        }
        rg0 rg0Var = (rg0) this.Yi7zF1RB1;
        j30 j30Var2 = (j30) rg0Var.OOA6hdeuvCS[vc0.JFJ3QoxA(i, rg0Var)];
        this.X1lG3V04pd = j30Var2;
        return j30Var2;
    }

    public void OOA6hdeuvCS(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.Yi7zF1RB1;
        int i3 = this.GWasM1elztuh;
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

    public void X1lG3V04pd(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.Yi7zF1RB1;
        int i8 = this.GWasM1elztuh;
        int i9 = i8 + 3;
        this.GWasM1elztuh = i9;
        int length = jArr.length;
        if (length <= i9) {
            int max = Math.max(length * 2, i9);
            this.Yi7zF1RB1 = Arrays.copyOf(jArr, max);
            this.X1lG3V04pd = Arrays.copyOf((long[]) this.X1lG3V04pd, max);
        }
        long[] jArr2 = (long[]) this.Yi7zF1RB1;
        jArr2[i8] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i8 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i10 << 25) | (i & 33554431);
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = lt0.Yi7zF1RB1;
                jArr2[i12] = (Math.min(i13, 1023) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    public int Yi7zF1RB1(Object obj) {
        zf0 zf0Var = (zf0) this.Yi7zF1RB1;
        int xqGvceK5x = zf0Var.xqGvceK5x(obj);
        if (xqGvceK5x >= 0) {
            return zf0Var.X1lG3V04pd[xqGvceK5x];
        }
        return -1;
    }
}
