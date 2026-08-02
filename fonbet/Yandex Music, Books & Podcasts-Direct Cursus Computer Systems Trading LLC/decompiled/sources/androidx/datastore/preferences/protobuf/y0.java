package androidx.datastore.preferences.protobuf;

import defpackage.b6e;
import defpackage.wvs;
import java.util.Arrays;

/* loaded from: classes.dex */
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

    public static y0 b() {
        return new y0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i;
        int k;
        int e;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.c[i4]).getClass();
                    e = j.e(i6);
                } else if (i7 == 2) {
                    e = j.b(i6, (g) this.c[i4]);
                } else if (i7 == 3) {
                    i = j.i(i6) * 2;
                    k = ((y0) this.c[i4]).a();
                } else {
                    if (i7 != 5) {
                        wvs.m(v.b());
                        return 0;
                    }
                    ((Integer) this.c[i4]).getClass();
                    e = j.d(i6);
                }
                i3 = e + i3;
            } else {
                long longValue = ((Long) this.c[i4]).longValue();
                i = j.i(i6);
                k = j.k(longValue);
            }
            i3 = k + i + i3;
        }
        this.d = i3;
        return i3;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            androidx.core.app.q.i();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void d(d1 d1Var) {
        if (this.a == 0) {
            return;
        }
        d1Var.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((k) d1Var).a.D(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((k) d1Var).a.s(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((k) d1Var).a(i3, (g) obj);
            } else if (i4 == 3) {
                j jVar = ((k) d1Var).a;
                jVar.A(i3, 3);
                ((y0) obj).d(d1Var);
                jVar.A(i3, 4);
            } else {
                if (i4 != 5) {
                    b6e.q(v.b());
                    return;
                }
                ((k) d1Var).a.q(i3, ((Integer) obj).intValue());
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
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = y0Var.c;
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
