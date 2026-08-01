package u;

import B.i;
import java.util.Arrays;
import m1.C4726a;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5048d extends C5046b {

    /* renamed from: f, reason: collision with root package name */
    public C5050f[] f40971f;

    /* renamed from: g, reason: collision with root package name */
    public C5050f[] f40972g;

    /* renamed from: h, reason: collision with root package name */
    public int f40973h;
    public C4726a i;

    @Override // u.C5046b
    public final C5050f d(boolean[] zArr) {
        int i = -1;
        for (int i6 = 0; i6 < this.f40973h; i6++) {
            C5050f[] c5050fArr = this.f40971f;
            C5050f c5050f = c5050fArr[i6];
            if (!zArr[c5050f.f40981u]) {
                C4726a c4726a = this.i;
                c4726a.f39272u = c5050f;
                int i9 = 8;
                if (i == -1) {
                    while (i9 >= 0) {
                        float f3 = ((C5050f) c4726a.f39272u).f40975A[i9];
                        if (f3 <= 0.0f) {
                            if (f3 < 0.0f) {
                                i = i6;
                                break;
                            }
                            i9--;
                        }
                    }
                } else {
                    C5050f c5050f2 = c5050fArr[i];
                    while (true) {
                        if (i9 >= 0) {
                            float f9 = c5050f2.f40975A[i9];
                            float f10 = ((C5050f) c4726a.f39272u).f40975A[i9];
                            if (f10 == f9) {
                                i9--;
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
        return this.f40971f[i];
    }

    @Override // u.C5046b
    public final boolean e() {
        return this.f40973h == 0;
    }

    @Override // u.C5046b
    public final void i(C5047c c5047c, C5046b c5046b, boolean z3) {
        C5050f c5050f = c5046b.f40950a;
        if (c5050f == null) {
            return;
        }
        C5045a c5045a = c5046b.f40953d;
        int d2 = c5045a.d();
        for (int i = 0; i < d2; i++) {
            C5050f e9 = c5045a.e(i);
            float f3 = c5045a.f(i);
            C4726a c4726a = this.i;
            c4726a.f39272u = e9;
            boolean z6 = e9.f40980n;
            float[] fArr = c5050f.f40975A;
            if (z6) {
                boolean z9 = true;
                for (int i6 = 0; i6 < 9; i6++) {
                    float[] fArr2 = ((C5050f) c4726a.f39272u).f40975A;
                    float f9 = (fArr[i6] * f3) + fArr2[i6];
                    fArr2[i6] = f9;
                    if (Math.abs(f9) < 1.0E-4f) {
                        ((C5050f) c4726a.f39272u).f40975A[i6] = 0.0f;
                    } else {
                        z9 = false;
                    }
                }
                if (z9) {
                    ((C5048d) c4726a.f39273v).k((C5050f) c4726a.f39272u);
                }
            } else {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f10 = fArr[i9];
                    if (f10 != 0.0f) {
                        float f11 = f10 * f3;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        ((C5050f) c4726a.f39272u).f40975A[i9] = f11;
                    } else {
                        ((C5050f) c4726a.f39272u).f40975A[i9] = 0.0f;
                    }
                }
                j(e9);
            }
            this.f40951b = (c5046b.f40951b * f3) + this.f40951b;
        }
        k(c5050f);
    }

    public final void j(C5050f c5050f) {
        int i;
        int i6 = this.f40973h + 1;
        C5050f[] c5050fArr = this.f40971f;
        if (i6 > c5050fArr.length) {
            C5050f[] c5050fArr2 = (C5050f[]) Arrays.copyOf(c5050fArr, c5050fArr.length * 2);
            this.f40971f = c5050fArr2;
            this.f40972g = (C5050f[]) Arrays.copyOf(c5050fArr2, c5050fArr2.length * 2);
        }
        C5050f[] c5050fArr3 = this.f40971f;
        int i9 = this.f40973h;
        c5050fArr3[i9] = c5050f;
        int i10 = i9 + 1;
        this.f40973h = i10;
        if (i10 > 1 && c5050fArr3[i9].f40981u > c5050f.f40981u) {
            int i11 = 0;
            while (true) {
                i = this.f40973h;
                if (i11 >= i) {
                    break;
                }
                this.f40972g[i11] = this.f40971f[i11];
                i11++;
            }
            Arrays.sort(this.f40972g, 0, i, new i(5));
            for (int i12 = 0; i12 < this.f40973h; i12++) {
                this.f40971f[i12] = this.f40972g[i12];
            }
        }
        c5050f.f40980n = true;
        c5050f.a(this);
    }

    public final void k(C5050f c5050f) {
        int i = 0;
        while (i < this.f40973h) {
            if (this.f40971f[i] == c5050f) {
                while (true) {
                    int i6 = this.f40973h;
                    if (i >= i6 - 1) {
                        this.f40973h = i6 - 1;
                        c5050f.f40980n = false;
                        return;
                    } else {
                        C5050f[] c5050fArr = this.f40971f;
                        int i9 = i + 1;
                        c5050fArr[i] = c5050fArr[i9];
                        i = i9;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // u.C5046b
    public final String toString() {
        String str = " goal -> (" + this.f40951b + ") : ";
        for (int i = 0; i < this.f40973h; i++) {
            C5050f c5050f = this.f40971f[i];
            C4726a c4726a = this.i;
            c4726a.f39272u = c5050f;
            str = str + c4726a + " ";
        }
        return str;
    }
}
