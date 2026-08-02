package defpackage;

import androidx.core.app.q;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lkt {
    public static final lkt f = new lkt(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public lkt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static lkt e(lkt lktVar, lkt lktVar2) {
        int i = lktVar.a + lktVar2.a;
        int[] copyOf = Arrays.copyOf(lktVar.b, i);
        System.arraycopy(lktVar2.b, 0, copyOf, lktVar.a, lktVar2.a);
        Object[] copyOf2 = Arrays.copyOf(lktVar.c, i);
        System.arraycopy(lktVar2.c, 0, copyOf2, lktVar.a, lktVar2.a);
        return new lkt(i, copyOf, copyOf2, true);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        q.i();
    }

    public final void b(int i) {
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

    public final int c() {
        int e;
        int g;
        int e2;
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
                    e2 = yr4.e(i5) + 8;
                } else if (i6 == 2) {
                    e2 = yr4.a(i5, (nn3) this.c[i3]);
                } else if (i6 == 3) {
                    e = yr4.e(i5) * 2;
                    g = ((lkt) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        wvs.m(bye.d());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    e2 = yr4.e(i5) + 4;
                }
                i2 = e2 + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                e = yr4.e(i5);
                g = yr4.g(longValue);
            }
            i2 = g + e + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean d(int i, qr4 qr4Var) {
        int z;
        a();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f(i, Long.valueOf(qr4Var.r()));
            return true;
        }
        if (i3 == 1) {
            f(i, Long.valueOf(qr4Var.o()));
            return true;
        }
        if (i3 == 2) {
            f(i, qr4Var.k());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (qr4Var.b == 0) {
                    qr4Var.a(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw bye.d();
            }
            f(i, Integer.valueOf(qr4Var.n()));
            return true;
        }
        lkt lktVar = new lkt();
        do {
            z = qr4Var.z();
            if (z == 0) {
                break;
            }
        } while (lktVar.d(z, qr4Var));
        qr4Var.a((i2 << 3) | 4);
        f(i, lktVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lkt)) {
            return false;
        }
        lkt lktVar = (lkt) obj;
        int i = this.a;
        if (i == lktVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = lktVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = lktVar.c;
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

    public final void f(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void g(rp7 rp7Var) {
        if (this.a == 0) {
            return;
        }
        rp7Var.getClass();
        yr4 yr4Var = (yr4) rp7Var.a;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                yr4Var.B(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                yr4Var.p(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                yr4Var.l(i3, (nn3) obj);
            } else if (i4 == 3) {
                yr4Var.y(i3, 3);
                ((lkt) obj).g(rp7Var);
                yr4Var.y(i3, 4);
            } else {
                if (i4 != 5) {
                    b6e.q(bye.d());
                    return;
                }
                yr4Var.n(i3, ((Integer) obj).intValue());
            }
        }
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

    public lkt() {
        this(0, new int[8], new Object[8], true);
    }
}
