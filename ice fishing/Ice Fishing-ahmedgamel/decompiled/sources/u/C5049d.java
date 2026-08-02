package u;

import A3.o;
import java.util.Arrays;
import o1.C4797a;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5049d extends C5047b {

    /* renamed from: f, reason: collision with root package name */
    public C5051f[] f40933f;

    /* renamed from: g, reason: collision with root package name */
    public C5051f[] f40934g;

    /* renamed from: h, reason: collision with root package name */
    public int f40935h;
    public C4797a i;

    @Override // u.C5047b
    public final C5051f d(boolean[] zArr) {
        int i = -1;
        for (int i4 = 0; i4 < this.f40935h; i4++) {
            C5051f[] c5051fArr = this.f40933f;
            C5051f c5051f = c5051fArr[i4];
            if (!zArr[c5051f.f40943u]) {
                C4797a c4797a = this.i;
                c4797a.f39715b = c5051f;
                int i6 = 8;
                if (i == -1) {
                    while (i6 >= 0) {
                        float f2 = ((C5051f) c4797a.f39715b).f40937A[i6];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i4;
                                break;
                            }
                            i6--;
                        }
                    }
                } else {
                    C5051f c5051f2 = c5051fArr[i];
                    while (true) {
                        if (i6 >= 0) {
                            float f9 = c5051f2.f40937A[i6];
                            float f10 = ((C5051f) c4797a.f39715b).f40937A[i6];
                            if (f10 == f9) {
                                i6--;
                            } else if (f10 >= f9) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f40933f[i];
    }

    @Override // u.C5047b
    public final boolean e() {
        return this.f40935h == 0;
    }

    @Override // u.C5047b
    public final void i(C5048c c5048c, C5047b c5047b, boolean z6) {
        C5051f c5051f = c5047b.f40912a;
        if (c5051f == null) {
            return;
        }
        C5046a c5046a = c5047b.f40915d;
        int d9 = c5046a.d();
        for (int i = 0; i < d9; i++) {
            C5051f e9 = c5046a.e(i);
            float f2 = c5046a.f(i);
            C4797a c4797a = this.i;
            c4797a.f39715b = e9;
            boolean z9 = e9.f40942n;
            float[] fArr = c5051f.f40937A;
            if (z9) {
                boolean z10 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = ((C5051f) c4797a.f39715b).f40937A;
                    float f9 = (fArr[i4] * f2) + fArr2[i4];
                    fArr2[i4] = f9;
                    if (Math.abs(f9) < 1.0E-4f) {
                        ((C5051f) c4797a.f39715b).f40937A[i4] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((C5049d) c4797a.f39716c).k((C5051f) c4797a.f39715b);
                }
            } else {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f10 = fArr[i6];
                    if (f10 != 0.0f) {
                        float f11 = f10 * f2;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        ((C5051f) c4797a.f39715b).f40937A[i6] = f11;
                    } else {
                        ((C5051f) c4797a.f39715b).f40937A[i6] = 0.0f;
                    }
                }
                j(e9);
            }
            this.f40913b = (c5047b.f40913b * f2) + this.f40913b;
        }
        k(c5051f);
    }

    public final void j(C5051f c5051f) {
        int i;
        int i4 = this.f40935h + 1;
        C5051f[] c5051fArr = this.f40933f;
        if (i4 > c5051fArr.length) {
            C5051f[] c5051fArr2 = (C5051f[]) Arrays.copyOf(c5051fArr, c5051fArr.length * 2);
            this.f40933f = c5051fArr2;
            this.f40934g = (C5051f[]) Arrays.copyOf(c5051fArr2, c5051fArr2.length * 2);
        }
        C5051f[] c5051fArr3 = this.f40933f;
        int i6 = this.f40935h;
        c5051fArr3[i6] = c5051f;
        int i9 = i6 + 1;
        this.f40935h = i9;
        if (i9 > 1 && c5051fArr3[i6].f40943u > c5051f.f40943u) {
            int i10 = 0;
            while (true) {
                i = this.f40935h;
                if (i10 >= i) {
                    break;
                }
                this.f40934g[i10] = this.f40933f[i10];
                i10++;
            }
            Arrays.sort(this.f40934g, 0, i, new o(6));
            for (int i11 = 0; i11 < this.f40935h; i11++) {
                this.f40933f[i11] = this.f40934g[i11];
            }
        }
        c5051f.f40942n = true;
        c5051f.a(this);
    }

    public final void k(C5051f c5051f) {
        int i = 0;
        while (i < this.f40935h) {
            if (this.f40933f[i] == c5051f) {
                while (true) {
                    int i4 = this.f40935h;
                    if (i >= i4 - 1) {
                        this.f40935h = i4 - 1;
                        c5051f.f40942n = false;
                        return;
                    } else {
                        C5051f[] c5051fArr = this.f40933f;
                        int i6 = i + 1;
                        c5051fArr[i] = c5051fArr[i6];
                        i = i6;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // u.C5047b
    public final String toString() {
        String str = " goal -> (" + this.f40913b + ") : ";
        for (int i = 0; i < this.f40935h; i++) {
            C5051f c5051f = this.f40933f[i];
            C4797a c4797a = this.i;
            c4797a.f39715b = c5051f;
            str = str + c4797a + " ";
        }
        return str;
    }
}
