package u;

import com.icefishing.icefishinglive2.AbstractC4404f;
import j4.g;
import java.util.Arrays;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5045a {

    /* renamed from: b, reason: collision with root package name */
    public final C5046b f40939b;

    /* renamed from: c, reason: collision with root package name */
    public final g f40940c;

    /* renamed from: a, reason: collision with root package name */
    public int f40938a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f40941d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f40942e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f40943f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f40944g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f40945h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40946j = false;

    public C5045a(C5046b c5046b, g gVar) {
        this.f40939b = c5046b;
        this.f40940c = gVar;
    }

    public final void a(C5050f c5050f, float f3, boolean z3) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i = this.f40945h;
            C5046b c5046b = this.f40939b;
            if (i == -1) {
                this.f40945h = 0;
                this.f40944g[0] = f3;
                this.f40942e[0] = c5050f.f40978u;
                this.f40943f[0] = -1;
                c5050f.f40975D++;
                c5050f.a(c5046b);
                this.f40938a++;
                if (this.f40946j) {
                    return;
                }
                int i6 = this.i + 1;
                this.i = i6;
                int[] iArr = this.f40942e;
                if (i6 >= iArr.length) {
                    this.f40946j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i != -1 && i10 < this.f40938a; i10++) {
                int i11 = this.f40942e[i];
                int i12 = c5050f.f40978u;
                if (i11 == i12) {
                    float[] fArr = this.f40944g;
                    float f9 = fArr[i] + f3;
                    if (f9 > -0.001f && f9 < 0.001f) {
                        f9 = 0.0f;
                    }
                    fArr[i] = f9;
                    if (f9 == 0.0f) {
                        if (i == this.f40945h) {
                            this.f40945h = this.f40943f[i];
                        } else {
                            int[] iArr2 = this.f40943f;
                            iArr2[i9] = iArr2[i];
                        }
                        if (z3) {
                            c5050f.b(c5046b);
                        }
                        if (this.f40946j) {
                            this.i = i;
                        }
                        c5050f.f40975D--;
                        this.f40938a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i;
                }
                i = this.f40943f[i];
            }
            int i13 = this.i;
            int i14 = i13 + 1;
            if (this.f40946j) {
                int[] iArr3 = this.f40942e;
                if (iArr3[i13] != -1) {
                    i13 = iArr3.length;
                }
            } else {
                i13 = i14;
            }
            int[] iArr4 = this.f40942e;
            if (i13 >= iArr4.length && this.f40938a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f40942e;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f40942e;
            if (i13 >= iArr6.length) {
                i13 = iArr6.length;
                int i16 = this.f40941d * 2;
                this.f40941d = i16;
                this.f40946j = false;
                this.i = i13 - 1;
                this.f40944g = Arrays.copyOf(this.f40944g, i16);
                this.f40942e = Arrays.copyOf(this.f40942e, this.f40941d);
                this.f40943f = Arrays.copyOf(this.f40943f, this.f40941d);
            }
            this.f40942e[i13] = c5050f.f40978u;
            this.f40944g[i13] = f3;
            if (i9 != -1) {
                int[] iArr7 = this.f40943f;
                iArr7[i13] = iArr7[i9];
                iArr7[i9] = i13;
            } else {
                this.f40943f[i13] = this.f40945h;
                this.f40945h = i13;
            }
            c5050f.f40975D++;
            c5050f.a(c5046b);
            this.f40938a++;
            if (!this.f40946j) {
                this.i++;
            }
            int i17 = this.i;
            int[] iArr8 = this.f40942e;
            if (i17 >= iArr8.length) {
                this.f40946j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f40945h;
        for (int i6 = 0; i != -1 && i6 < this.f40938a; i6++) {
            C5050f c5050f = ((C5050f[]) this.f40940c.f38406w)[this.f40942e[i]];
            if (c5050f != null) {
                c5050f.b(this.f40939b);
            }
            i = this.f40943f[i];
        }
        this.f40945h = -1;
        this.i = -1;
        this.f40946j = false;
        this.f40938a = 0;
    }

    public final float c(C5050f c5050f) {
        int i = this.f40945h;
        for (int i6 = 0; i != -1 && i6 < this.f40938a; i6++) {
            if (this.f40942e[i] == c5050f.f40978u) {
                return this.f40944g[i];
            }
            i = this.f40943f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f40938a;
    }

    public final C5050f e(int i) {
        int i6 = this.f40945h;
        for (int i9 = 0; i6 != -1 && i9 < this.f40938a; i9++) {
            if (i9 == i) {
                return ((C5050f[]) this.f40940c.f38406w)[this.f40942e[i6]];
            }
            i6 = this.f40943f[i6];
        }
        return null;
    }

    public final float f(int i) {
        int i6 = this.f40945h;
        for (int i9 = 0; i6 != -1 && i9 < this.f40938a; i9++) {
            if (i9 == i) {
                return this.f40944g[i6];
            }
            i6 = this.f40943f[i6];
        }
        return 0.0f;
    }

    public final void g(C5050f c5050f, float f3) {
        if (f3 == 0.0f) {
            h(c5050f, true);
            return;
        }
        int i = this.f40945h;
        C5046b c5046b = this.f40939b;
        if (i == -1) {
            this.f40945h = 0;
            this.f40944g[0] = f3;
            this.f40942e[0] = c5050f.f40978u;
            this.f40943f[0] = -1;
            c5050f.f40975D++;
            c5050f.a(c5046b);
            this.f40938a++;
            if (this.f40946j) {
                return;
            }
            int i6 = this.i + 1;
            this.i = i6;
            int[] iArr = this.f40942e;
            if (i6 >= iArr.length) {
                this.f40946j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i != -1 && i10 < this.f40938a; i10++) {
            int i11 = this.f40942e[i];
            int i12 = c5050f.f40978u;
            if (i11 == i12) {
                this.f40944g[i] = f3;
                return;
            }
            if (i11 < i12) {
                i9 = i;
            }
            i = this.f40943f[i];
        }
        int i13 = this.i;
        int i14 = i13 + 1;
        if (this.f40946j) {
            int[] iArr2 = this.f40942e;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f40942e;
        if (i13 >= iArr3.length && this.f40938a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f40942e;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f40942e;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.f40941d * 2;
            this.f40941d = i16;
            this.f40946j = false;
            this.i = i13 - 1;
            this.f40944g = Arrays.copyOf(this.f40944g, i16);
            this.f40942e = Arrays.copyOf(this.f40942e, this.f40941d);
            this.f40943f = Arrays.copyOf(this.f40943f, this.f40941d);
        }
        this.f40942e[i13] = c5050f.f40978u;
        this.f40944g[i13] = f3;
        if (i9 != -1) {
            int[] iArr6 = this.f40943f;
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            this.f40943f[i13] = this.f40945h;
            this.f40945h = i13;
        }
        c5050f.f40975D++;
        c5050f.a(c5046b);
        int i17 = this.f40938a + 1;
        this.f40938a = i17;
        if (!this.f40946j) {
            this.i++;
        }
        int[] iArr7 = this.f40942e;
        if (i17 >= iArr7.length) {
            this.f40946j = true;
        }
        if (this.i >= iArr7.length) {
            this.f40946j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C5050f c5050f, boolean z3) {
        int i = this.f40945h;
        if (i == -1) {
            return 0.0f;
        }
        int i6 = 0;
        int i9 = -1;
        while (i != -1 && i6 < this.f40938a) {
            if (this.f40942e[i] == c5050f.f40978u) {
                if (i == this.f40945h) {
                    this.f40945h = this.f40943f[i];
                } else {
                    int[] iArr = this.f40943f;
                    iArr[i9] = iArr[i];
                }
                if (z3) {
                    c5050f.b(this.f40939b);
                }
                c5050f.f40975D--;
                this.f40938a--;
                this.f40942e[i] = -1;
                if (this.f40946j) {
                    this.i = i;
                }
                return this.f40944g[i];
            }
            i6++;
            i9 = i;
            i = this.f40943f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f40945h;
        String str = "";
        for (int i6 = 0; i != -1 && i6 < this.f40938a; i6++) {
            StringBuilder b9 = AbstractC5049e.b(AbstractC4404f.f(str, " -> "));
            b9.append(this.f40944g[i]);
            b9.append(" : ");
            StringBuilder b10 = AbstractC5049e.b(b9.toString());
            b10.append(((C5050f[]) this.f40940c.f38406w)[this.f40942e[i]]);
            str = b10.toString();
            i = this.f40943f[i];
        }
        return str;
    }
}
