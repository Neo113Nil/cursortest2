package defpackage;

import androidx.core.app.q;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mkt {
    public static final mkt f = new mkt(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public mkt(int i, int[] iArr, Object[] objArr, boolean z) {
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
        int h;
        int j;
        int h2;
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
                    h2 = xr4.h(i5) + 8;
                } else if (i6 == 2) {
                    h2 = xr4.f(i5, (qn3) this.c[i3]);
                } else if (i6 == 3) {
                    h = xr4.h(i5) * 2;
                    j = ((mkt) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        wvs.m(cye.b());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    h2 = xr4.h(i5) + 4;
                }
                i2 = h2 + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                h = xr4.h(i5);
                j = xr4.j(longValue);
            }
            i2 = j + h + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            q.i();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(jzi jziVar) {
        if (this.a == 0) {
            return;
        }
        jziVar.getClass();
        xr4 xr4Var = (xr4) jziVar.a;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                xr4Var.B(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                xr4Var.r(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                xr4Var.o(i3, (qn3) obj);
            } else if (i4 == 3) {
                xr4Var.y(i3, 3);
                ((mkt) obj).d(jziVar);
                xr4Var.y(i3, 4);
            } else {
                if (i4 != 5) {
                    b6e.q(cye.b());
                    return;
                }
                xr4Var.p(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mkt)) {
            return false;
        }
        mkt mktVar = (mkt) obj;
        int i = this.a;
        if (i == mktVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = mktVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = mktVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
