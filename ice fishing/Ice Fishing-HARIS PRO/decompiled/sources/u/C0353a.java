package u;

import M0.h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353a {

    /* renamed from: b, reason: collision with root package name */
    public final C0354b f4393b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4394c;

    /* renamed from: a, reason: collision with root package name */
    public int f4392a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4395d = 8;
    public int[] e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f4396f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f4397g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f4398h = -1;
    public int i = -1;
    public boolean j = false;

    public C0353a(C0354b c0354b, h hVar) {
        this.f4393b = c0354b;
        this.f4394c = hVar;
    }

    public final void a(f fVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f4398h;
            C0354b c0354b = this.f4393b;
            if (i == -1) {
                this.f4398h = 0;
                this.f4397g[0] = f2;
                this.e[0] = fVar.f4422b;
                this.f4396f[0] = -1;
                fVar.f4428k++;
                fVar.a(c0354b);
                this.f4392a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f4392a; i4++) {
                int i5 = this.e[i];
                int i6 = fVar.f4422b;
                if (i5 == i6) {
                    float[] fArr = this.f4397g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == RecyclerView.f2111C0) {
                        if (i == this.f4398h) {
                            this.f4398h = this.f4396f[i];
                        } else {
                            int[] iArr2 = this.f4396f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            fVar.b(c0354b);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        fVar.f4428k--;
                        this.f4392a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f4396f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.j) {
                int[] iArr3 = this.e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.e;
            if (i7 >= iArr4.length && this.f4392a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f4395d * 2;
                this.f4395d = i10;
                this.j = false;
                this.i = i7 - 1;
                this.f4397g = Arrays.copyOf(this.f4397g, i10);
                this.e = Arrays.copyOf(this.e, this.f4395d);
                this.f4396f = Arrays.copyOf(this.f4396f, this.f4395d);
            }
            this.e[i7] = fVar.f4422b;
            this.f4397g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f4396f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f4396f[i7] = this.f4398h;
                this.f4398h = i7;
            }
            fVar.f4428k++;
            fVar.a(c0354b);
            this.f4392a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.e;
            if (i11 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f4398h;
        for (int i2 = 0; i != -1 && i2 < this.f4392a; i2++) {
            f fVar = ((f[]) this.f4394c.f618d)[this.e[i]];
            if (fVar != null) {
                fVar.b(this.f4393b);
            }
            i = this.f4396f[i];
        }
        this.f4398h = -1;
        this.i = -1;
        this.j = false;
        this.f4392a = 0;
    }

    public final float c(f fVar) {
        int i = this.f4398h;
        for (int i2 = 0; i != -1 && i2 < this.f4392a; i2++) {
            if (this.e[i] == fVar.f4422b) {
                return this.f4397g[i];
            }
            i = this.f4396f[i];
        }
        return RecyclerView.f2111C0;
    }

    public final int d() {
        return this.f4392a;
    }

    public final f e(int i) {
        int i2 = this.f4398h;
        for (int i3 = 0; i2 != -1 && i3 < this.f4392a; i3++) {
            if (i3 == i) {
                return ((f[]) this.f4394c.f618d)[this.e[i2]];
            }
            i2 = this.f4396f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.f4398h;
        for (int i3 = 0; i2 != -1 && i3 < this.f4392a; i3++) {
            if (i3 == i) {
                return this.f4397g[i2];
            }
            i2 = this.f4396f[i2];
        }
        return RecyclerView.f2111C0;
    }

    public final void g(f fVar, float f2) {
        if (f2 == RecyclerView.f2111C0) {
            h(fVar, true);
            return;
        }
        int i = this.f4398h;
        C0354b c0354b = this.f4393b;
        if (i == -1) {
            this.f4398h = 0;
            this.f4397g[0] = f2;
            this.e[0] = fVar.f4422b;
            this.f4396f[0] = -1;
            fVar.f4428k++;
            fVar.a(c0354b);
            this.f4392a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.e;
            if (i2 >= iArr.length) {
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f4392a; i4++) {
            int i5 = this.e[i];
            int i6 = fVar.f4422b;
            if (i5 == i6) {
                this.f4397g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f4396f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.e;
        if (i7 >= iArr3.length && this.f4392a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f4395d * 2;
            this.f4395d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.f4397g = Arrays.copyOf(this.f4397g, i10);
            this.e = Arrays.copyOf(this.e, this.f4395d);
            this.f4396f = Arrays.copyOf(this.f4396f, this.f4395d);
        }
        this.e[i7] = fVar.f4422b;
        this.f4397g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f4396f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f4396f[i7] = this.f4398h;
            this.f4398h = i7;
        }
        fVar.f4428k++;
        fVar.a(c0354b);
        int i11 = this.f4392a + 1;
        this.f4392a = i11;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i11 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z2) {
        int i = this.f4398h;
        if (i == -1) {
            return RecyclerView.f2111C0;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f4392a) {
            if (this.e[i] == fVar.f4422b) {
                if (i == this.f4398h) {
                    this.f4398h = this.f4396f[i];
                } else {
                    int[] iArr = this.f4396f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    fVar.b(this.f4393b);
                }
                fVar.f4428k--;
                this.f4392a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.f4397g[i];
            }
            i2++;
            i3 = i;
            i = this.f4396f[i];
        }
        return RecyclerView.f2111C0;
    }

    public final String toString() {
        int i = this.f4398h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f4392a; i2++) {
            str = (D1.h.f(str, " -> ") + this.f4397g[i] + " : ") + ((f[]) this.f4394c.f618d)[this.e[i]];
            i = this.f4396f[i];
        }
        return str;
    }
}
