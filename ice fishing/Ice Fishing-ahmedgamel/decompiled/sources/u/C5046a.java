package u;

import com.google.android.gms.internal.ads.Wv;
import java.util.Arrays;
import l4.g;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5046a {

    /* renamed from: b, reason: collision with root package name */
    public final C5047b f40904b;

    /* renamed from: c, reason: collision with root package name */
    public final g f40905c;

    /* renamed from: a, reason: collision with root package name */
    public int f40903a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f40906d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f40907e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f40908f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f40909g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f40910h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40911j = false;

    public C5046a(C5047b c5047b, g gVar) {
        this.f40904b = c5047b;
        this.f40905c = gVar;
    }

    public final void a(C5051f c5051f, float f2, boolean z6) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f40910h;
            C5047b c5047b = this.f40904b;
            if (i == -1) {
                this.f40910h = 0;
                this.f40909g[0] = f2;
                this.f40907e[0] = c5051f.f40943u;
                this.f40908f[0] = -1;
                c5051f.f40940D++;
                c5051f.a(c5047b);
                this.f40903a++;
                if (this.f40911j) {
                    return;
                }
                int i4 = this.i + 1;
                this.i = i4;
                int[] iArr = this.f40907e;
                if (i4 >= iArr.length) {
                    this.f40911j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i9 = 0; i != -1 && i9 < this.f40903a; i9++) {
                int i10 = this.f40907e[i];
                int i11 = c5051f.f40943u;
                if (i10 == i11) {
                    float[] fArr = this.f40909g;
                    float f9 = fArr[i] + f2;
                    if (f9 > -0.001f && f9 < 0.001f) {
                        f9 = 0.0f;
                    }
                    fArr[i] = f9;
                    if (f9 == 0.0f) {
                        if (i == this.f40910h) {
                            this.f40910h = this.f40908f[i];
                        } else {
                            int[] iArr2 = this.f40908f;
                            iArr2[i6] = iArr2[i];
                        }
                        if (z6) {
                            c5051f.b(c5047b);
                        }
                        if (this.f40911j) {
                            this.i = i;
                        }
                        c5051f.f40940D--;
                        this.f40903a--;
                        return;
                    }
                    return;
                }
                if (i10 < i11) {
                    i6 = i;
                }
                i = this.f40908f[i];
            }
            int i12 = this.i;
            int i13 = i12 + 1;
            if (this.f40911j) {
                int[] iArr3 = this.f40907e;
                if (iArr3[i12] != -1) {
                    i12 = iArr3.length;
                }
            } else {
                i12 = i13;
            }
            int[] iArr4 = this.f40907e;
            if (i12 >= iArr4.length && this.f40903a < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.f40907e;
                    if (i14 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i14] == -1) {
                        i12 = i14;
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr6 = this.f40907e;
            if (i12 >= iArr6.length) {
                i12 = iArr6.length;
                int i15 = this.f40906d * 2;
                this.f40906d = i15;
                this.f40911j = false;
                this.i = i12 - 1;
                this.f40909g = Arrays.copyOf(this.f40909g, i15);
                this.f40907e = Arrays.copyOf(this.f40907e, this.f40906d);
                this.f40908f = Arrays.copyOf(this.f40908f, this.f40906d);
            }
            this.f40907e[i12] = c5051f.f40943u;
            this.f40909g[i12] = f2;
            if (i6 != -1) {
                int[] iArr7 = this.f40908f;
                iArr7[i12] = iArr7[i6];
                iArr7[i6] = i12;
            } else {
                this.f40908f[i12] = this.f40910h;
                this.f40910h = i12;
            }
            c5051f.f40940D++;
            c5051f.a(c5047b);
            this.f40903a++;
            if (!this.f40911j) {
                this.i++;
            }
            int i16 = this.i;
            int[] iArr8 = this.f40907e;
            if (i16 >= iArr8.length) {
                this.f40911j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f40910h;
        for (int i4 = 0; i != -1 && i4 < this.f40903a; i4++) {
            C5051f c5051f = ((C5051f[]) this.f40905c.f38918w)[this.f40907e[i]];
            if (c5051f != null) {
                c5051f.b(this.f40904b);
            }
            i = this.f40908f[i];
        }
        this.f40910h = -1;
        this.i = -1;
        this.f40911j = false;
        this.f40903a = 0;
    }

    public final float c(C5051f c5051f) {
        int i = this.f40910h;
        for (int i4 = 0; i != -1 && i4 < this.f40903a; i4++) {
            if (this.f40907e[i] == c5051f.f40943u) {
                return this.f40909g[i];
            }
            i = this.f40908f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f40903a;
    }

    public final C5051f e(int i) {
        int i4 = this.f40910h;
        for (int i6 = 0; i4 != -1 && i6 < this.f40903a; i6++) {
            if (i6 == i) {
                return ((C5051f[]) this.f40905c.f38918w)[this.f40907e[i4]];
            }
            i4 = this.f40908f[i4];
        }
        return null;
    }

    public final float f(int i) {
        int i4 = this.f40910h;
        for (int i6 = 0; i4 != -1 && i6 < this.f40903a; i6++) {
            if (i6 == i) {
                return this.f40909g[i4];
            }
            i4 = this.f40908f[i4];
        }
        return 0.0f;
    }

    public final void g(C5051f c5051f, float f2) {
        if (f2 == 0.0f) {
            h(c5051f, true);
            return;
        }
        int i = this.f40910h;
        C5047b c5047b = this.f40904b;
        if (i == -1) {
            this.f40910h = 0;
            this.f40909g[0] = f2;
            this.f40907e[0] = c5051f.f40943u;
            this.f40908f[0] = -1;
            c5051f.f40940D++;
            c5051f.a(c5047b);
            this.f40903a++;
            if (this.f40911j) {
                return;
            }
            int i4 = this.i + 1;
            this.i = i4;
            int[] iArr = this.f40907e;
            if (i4 >= iArr.length) {
                this.f40911j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i9 = 0; i != -1 && i9 < this.f40903a; i9++) {
            int i10 = this.f40907e[i];
            int i11 = c5051f.f40943u;
            if (i10 == i11) {
                this.f40909g[i] = f2;
                return;
            }
            if (i10 < i11) {
                i6 = i;
            }
            i = this.f40908f[i];
        }
        int i12 = this.i;
        int i13 = i12 + 1;
        if (this.f40911j) {
            int[] iArr2 = this.f40907e;
            if (iArr2[i12] != -1) {
                i12 = iArr2.length;
            }
        } else {
            i12 = i13;
        }
        int[] iArr3 = this.f40907e;
        if (i12 >= iArr3.length && this.f40903a < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f40907e;
                if (i14 >= iArr4.length) {
                    break;
                }
                if (iArr4[i14] == -1) {
                    i12 = i14;
                    break;
                }
                i14++;
            }
        }
        int[] iArr5 = this.f40907e;
        if (i12 >= iArr5.length) {
            i12 = iArr5.length;
            int i15 = this.f40906d * 2;
            this.f40906d = i15;
            this.f40911j = false;
            this.i = i12 - 1;
            this.f40909g = Arrays.copyOf(this.f40909g, i15);
            this.f40907e = Arrays.copyOf(this.f40907e, this.f40906d);
            this.f40908f = Arrays.copyOf(this.f40908f, this.f40906d);
        }
        this.f40907e[i12] = c5051f.f40943u;
        this.f40909g[i12] = f2;
        if (i6 != -1) {
            int[] iArr6 = this.f40908f;
            iArr6[i12] = iArr6[i6];
            iArr6[i6] = i12;
        } else {
            this.f40908f[i12] = this.f40910h;
            this.f40910h = i12;
        }
        c5051f.f40940D++;
        c5051f.a(c5047b);
        int i16 = this.f40903a + 1;
        this.f40903a = i16;
        if (!this.f40911j) {
            this.i++;
        }
        int[] iArr7 = this.f40907e;
        if (i16 >= iArr7.length) {
            this.f40911j = true;
        }
        if (this.i >= iArr7.length) {
            this.f40911j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C5051f c5051f, boolean z6) {
        int i = this.f40910h;
        if (i == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i6 = -1;
        while (i != -1 && i4 < this.f40903a) {
            if (this.f40907e[i] == c5051f.f40943u) {
                if (i == this.f40910h) {
                    this.f40910h = this.f40908f[i];
                } else {
                    int[] iArr = this.f40908f;
                    iArr[i6] = iArr[i];
                }
                if (z6) {
                    c5051f.b(this.f40904b);
                }
                c5051f.f40940D--;
                this.f40903a--;
                this.f40907e[i] = -1;
                if (this.f40911j) {
                    this.i = i;
                }
                return this.f40909g[i];
            }
            i4++;
            i6 = i;
            i = this.f40908f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f40910h;
        String str = "";
        for (int i4 = 0; i != -1 && i4 < this.f40903a; i4++) {
            StringBuilder b9 = AbstractC5050e.b(Wv.g(str, " -> "));
            b9.append(this.f40909g[i]);
            b9.append(" : ");
            StringBuilder b10 = AbstractC5050e.b(b9.toString());
            b10.append(((C5051f[]) this.f40905c.f38918w)[this.f40907e[i]]);
            str = b10.toString();
            i = this.f40908f[i];
        }
        return str;
    }
}
