package com.gamericefishpro.space.q4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public static final y0 f = new y0(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public y0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
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

    public final int b() {
        int iZ0;
        int iB0;
        int iZ1;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iZ1 = i.z0(i5) + 8;
                } else if (i6 == 2) {
                    iZ1 = i.x0(i5, (f) this.c[i3]);
                } else if (i6 == 3) {
                    iZ0 = i.z0(i5) * 2;
                    iB0 = ((y0) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(w.b());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iZ1 = i.z0(i5) + 4;
                }
                i2 = iZ1 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iZ0 = i.z0(i5);
                iB0 = i.B0(jLongValue);
            }
            i2 = iB0 + iZ0 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(c0 c0Var) throws IOException {
        if (this.a == 0) {
            return;
        }
        c0Var.getClass();
        i iVar = (i) c0Var.a;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                iVar.V0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                iVar.L0(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                iVar.H0(i3, (f) obj);
            } else if (i4 == 3) {
                iVar.S0(i3, 3);
                ((y0) obj).d(c0Var);
                iVar.S0(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(w.b());
                }
                iVar.J0(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        int i = this.a;
        if (i == y0Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = y0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = y0Var.c;
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
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
