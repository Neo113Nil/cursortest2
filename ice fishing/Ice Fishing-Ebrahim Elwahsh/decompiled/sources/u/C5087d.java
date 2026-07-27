package u;

import B.i;
import java.util.Arrays;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5087d extends C5085b {

    /* renamed from: f, reason: collision with root package name */
    public C5089f[] f40985f;

    /* renamed from: g, reason: collision with root package name */
    public C5089f[] f40986g;

    /* renamed from: h, reason: collision with root package name */
    public int f40987h;
    public S0.e i;

    @Override // u.C5085b
    public final C5089f d(boolean[] zArr) {
        int i = -1;
        for (int i4 = 0; i4 < this.f40987h; i4++) {
            C5089f[] c5089fArr = this.f40985f;
            C5089f c5089f = c5089fArr[i4];
            if (!zArr[c5089f.f40995u]) {
                S0.e eVar = this.i;
                eVar.f2891u = c5089f;
                int i9 = 8;
                if (i == -1) {
                    while (i9 >= 0) {
                        float f6 = ((C5089f) eVar.f2891u).f40989A[i9];
                        if (f6 <= 0.0f) {
                            if (f6 < 0.0f) {
                                i = i4;
                                break;
                            }
                            i9--;
                        }
                    }
                } else {
                    C5089f c5089f2 = c5089fArr[i];
                    while (true) {
                        if (i9 >= 0) {
                            float f9 = c5089f2.f40989A[i9];
                            float f10 = ((C5089f) eVar.f2891u).f40989A[i9];
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
        return this.f40985f[i];
    }

    @Override // u.C5085b
    public final boolean e() {
        return this.f40987h == 0;
    }

    @Override // u.C5085b
    public final void i(C5086c c5086c, C5085b c5085b, boolean z8) {
        C5089f c5089f = c5085b.f40964a;
        if (c5089f == null) {
            return;
        }
        C5084a c5084a = c5085b.f40967d;
        int d2 = c5084a.d();
        for (int i = 0; i < d2; i++) {
            C5089f e6 = c5084a.e(i);
            float f6 = c5084a.f(i);
            S0.e eVar = this.i;
            eVar.f2891u = e6;
            boolean z9 = e6.f40994n;
            float[] fArr = c5089f.f40989A;
            if (z9) {
                boolean z10 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = ((C5089f) eVar.f2891u).f40989A;
                    float f9 = (fArr[i4] * f6) + fArr2[i4];
                    fArr2[i4] = f9;
                    if (Math.abs(f9) < 1.0E-4f) {
                        ((C5089f) eVar.f2891u).f40989A[i4] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((C5087d) eVar.f2892v).k((C5089f) eVar.f2891u);
                }
            } else {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f10 = fArr[i9];
                    if (f10 != 0.0f) {
                        float f11 = f10 * f6;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        ((C5089f) eVar.f2891u).f40989A[i9] = f11;
                    } else {
                        ((C5089f) eVar.f2891u).f40989A[i9] = 0.0f;
                    }
                }
                j(e6);
            }
            this.f40965b = (c5085b.f40965b * f6) + this.f40965b;
        }
        k(c5089f);
    }

    public final void j(C5089f c5089f) {
        int i;
        int i4 = this.f40987h + 1;
        C5089f[] c5089fArr = this.f40985f;
        if (i4 > c5089fArr.length) {
            C5089f[] c5089fArr2 = (C5089f[]) Arrays.copyOf(c5089fArr, c5089fArr.length * 2);
            this.f40985f = c5089fArr2;
            this.f40986g = (C5089f[]) Arrays.copyOf(c5089fArr2, c5089fArr2.length * 2);
        }
        C5089f[] c5089fArr3 = this.f40985f;
        int i9 = this.f40987h;
        c5089fArr3[i9] = c5089f;
        int i10 = i9 + 1;
        this.f40987h = i10;
        if (i10 > 1 && c5089fArr3[i9].f40995u > c5089f.f40995u) {
            int i11 = 0;
            while (true) {
                i = this.f40987h;
                if (i11 >= i) {
                    break;
                }
                this.f40986g[i11] = this.f40985f[i11];
                i11++;
            }
            Arrays.sort(this.f40986g, 0, i, new i(5));
            for (int i12 = 0; i12 < this.f40987h; i12++) {
                this.f40985f[i12] = this.f40986g[i12];
            }
        }
        c5089f.f40994n = true;
        c5089f.a(this);
    }

    public final void k(C5089f c5089f) {
        int i = 0;
        while (i < this.f40987h) {
            if (this.f40985f[i] == c5089f) {
                while (true) {
                    int i4 = this.f40987h;
                    if (i >= i4 - 1) {
                        this.f40987h = i4 - 1;
                        c5089f.f40994n = false;
                        return;
                    } else {
                        C5089f[] c5089fArr = this.f40985f;
                        int i9 = i + 1;
                        c5089fArr[i] = c5089fArr[i9];
                        i = i9;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // u.C5085b
    public final String toString() {
        String str = " goal -> (" + this.f40965b + ") : ";
        for (int i = 0; i < this.f40987h; i++) {
            C5089f c5089f = this.f40985f[i];
            S0.e eVar = this.i;
            eVar.f2891u = c5089f;
            str = str + eVar + " ";
        }
        return str;
    }
}
