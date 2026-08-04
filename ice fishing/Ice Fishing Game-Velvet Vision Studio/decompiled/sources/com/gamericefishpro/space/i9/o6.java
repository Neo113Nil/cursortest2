package com.gamericefishpro.space.i9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o6 {
    public static final o6 f = new o6(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public o6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static o6 a() {
        return new o6(0, new int[8], new Object[8], true);
    }

    public final void b(v5 v5Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((x4) v5Var.d).V(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((x4) v5Var.d).W(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    x4 x4Var = (x4) v5Var.d;
                    x4Var.a0((i4 << 3) | 2);
                    x4Var.X((w4) obj);
                } else if (i3 == 3) {
                    ((x4) v5Var.d).R(i4, 3);
                    ((o6) obj).b(v5Var);
                    ((x4) v5Var.d).R(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new o5());
                    }
                    ((x4) v5Var.d).U(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iG0;
        int iP;
        int iG1;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        w4 w4Var = (w4) this.c[i2];
                        int iG2 = x4.g0(i6);
                        int iD2 = w4Var.d();
                        iD = com.gamericefishpro.space.m5.a.d(iD2, iD2, iG2, iD);
                    } else if (i5 == 3) {
                        int iG3 = x4.g0(i4 << 3);
                        iG0 = iG3 + iG3;
                        iP = ((o6) this.c[i2]).c();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new o5());
                        }
                        ((Integer) this.c[i2]).getClass();
                        iG1 = x4.g0(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iG1 = x4.g0(i4 << 3) + 8;
                }
                iD = iG1 + iD;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iG0 = x4.g0(i7);
                iP = x4.P(jLongValue);
            }
            iD = iP + iG0 + iD;
        }
        this.d = iD;
        return iD;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        int i = this.a;
        if (i == o6Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = o6Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = o6Var.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
