package defpackage;

import androidx.core.app.q;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sex {
    public static final sex f = new sex(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public sex(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static sex b() {
        return new sex(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int q;
        int a;
        int q2;
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
                    q2 = kbx.q(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    gbx gbxVar = (gbx) this.c[i3];
                    int q3 = kbx.q(i7);
                    int n = gbxVar.n();
                    i2 = v3w.b(n, n, q3, i2);
                } else if (i6 == 3) {
                    int q4 = kbx.q(i5 << 3);
                    q = q4 + q4;
                    a = ((sex) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        wvs.m(new zcx());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    q2 = kbx.q(i5 << 3) + 4;
                }
                i2 = q2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.c[i3]).longValue();
                q = kbx.q(i8);
                a = kbx.a(longValue);
            }
            i2 = a + q + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            q.i();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(gao gaoVar) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((kbx) gaoVar.a).n(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((kbx) gaoVar.a).f(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((kbx) gaoVar.a).c(i4, (gbx) obj);
                } else if (i3 == 3) {
                    ((kbx) gaoVar.a).k(i4, 3);
                    ((sex) obj).d(gaoVar);
                    ((kbx) gaoVar.a).k(i4, 4);
                } else {
                    if (i3 != 5) {
                        b6e.q(new zcx());
                        return;
                    }
                    ((kbx) gaoVar.a).d(i4, ((Integer) obj).intValue());
                }
            }
        }
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
        if (obj != null && (obj instanceof sex)) {
            sex sexVar = (sex) obj;
            int i = this.a;
            if (i == sexVar.a) {
                int[] iArr = this.b;
                int[] iArr2 = sexVar.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = sexVar.c;
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
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
