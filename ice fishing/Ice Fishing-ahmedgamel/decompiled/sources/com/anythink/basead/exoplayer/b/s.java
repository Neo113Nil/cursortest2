package com.anythink.basead.exoplayer.b;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7451a = 65;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7452b = 400;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7453c = 4000;

    /* renamed from: d, reason: collision with root package name */
    private final int f7454d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7455e;

    /* renamed from: f, reason: collision with root package name */
    private final float f7456f;

    /* renamed from: g, reason: collision with root package name */
    private final float f7457g;

    /* renamed from: h, reason: collision with root package name */
    private final float f7458h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7459j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7460k;

    /* renamed from: l, reason: collision with root package name */
    private final short[] f7461l;

    /* renamed from: m, reason: collision with root package name */
    private short[] f7462m;

    /* renamed from: n, reason: collision with root package name */
    private int f7463n;

    /* renamed from: o, reason: collision with root package name */
    private short[] f7464o;

    /* renamed from: p, reason: collision with root package name */
    private int f7465p;

    /* renamed from: q, reason: collision with root package name */
    private short[] f7466q;

    /* renamed from: r, reason: collision with root package name */
    private int f7467r;

    /* renamed from: s, reason: collision with root package name */
    private int f7468s;

    /* renamed from: t, reason: collision with root package name */
    private int f7469t;

    /* renamed from: u, reason: collision with root package name */
    private int f7470u;

    /* renamed from: v, reason: collision with root package name */
    private int f7471v;

    /* renamed from: w, reason: collision with root package name */
    private int f7472w;

    /* renamed from: x, reason: collision with root package name */
    private int f7473x;

    /* renamed from: y, reason: collision with root package name */
    private int f7474y;

    public s(int i, int i4, float f2, float f9, int i6) {
        this.f7454d = i;
        this.f7455e = i4;
        this.f7456f = f2;
        this.f7457g = f9;
        this.f7458h = i / i6;
        this.i = i / f7452b;
        int i9 = i / 65;
        this.f7459j = i9;
        int i10 = i9 * 2;
        this.f7460k = i10;
        this.f7461l = new short[i10];
        this.f7462m = new short[i10 * i4];
        this.f7464o = new short[i10 * i4];
        this.f7466q = new short[i10 * i4];
    }

    private void d(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f7466q;
        int i4 = this.f7455e;
        System.arraycopy(sArr, i * i4, sArr, 0, (this.f7467r - i) * i4);
        this.f7467r -= i;
    }

    public final void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f7455e;
        int i4 = remaining / i;
        short[] a9 = a(this.f7462m, this.f7463n, i4);
        this.f7462m = a9;
        shortBuffer.get(a9, this.f7463n * this.f7455e, ((i * i4) * 2) / 2);
        this.f7463n += i4;
        d();
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f7455e, this.f7465p);
        shortBuffer.put(this.f7464o, 0, this.f7455e * min);
        int i = this.f7465p - min;
        this.f7465p = i;
        short[] sArr = this.f7464o;
        int i4 = this.f7455e;
        System.arraycopy(sArr, min * i4, sArr, 0, i * i4);
    }

    public final int c() {
        return this.f7465p;
    }

    private void c(short[] sArr, int i, int i4) {
        int i6 = this.f7460k / i4;
        int i9 = this.f7455e;
        int i10 = i4 * i9;
        int i11 = i * i9;
        for (int i12 = 0; i12 < i6; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 += sArr[(i12 * i10) + i11 + i14];
            }
            this.f7461l[i12] = (short) (i13 / i10);
        }
    }

    private void d() {
        int i = this.f7465p;
        float f2 = this.f7456f;
        float f9 = this.f7457g;
        float f10 = f2 / f9;
        float f11 = this.f7458h * f9;
        double d9 = f10;
        if (d9 <= 1.00001d && d9 >= 0.99999d) {
            b(this.f7462m, 0, this.f7463n);
            this.f7463n = 0;
        } else {
            a(f10);
        }
        if (f11 != 1.0f) {
            a(f11, i);
        }
    }

    public final void b() {
        this.f7463n = 0;
        this.f7465p = 0;
        this.f7467r = 0;
        this.f7468s = 0;
        this.f7469t = 0;
        this.f7470u = 0;
        this.f7471v = 0;
        this.f7472w = 0;
        this.f7473x = 0;
        this.f7474y = 0;
    }

    public final void a() {
        int i;
        int i4 = this.f7463n;
        float f2 = this.f7456f;
        float f9 = this.f7457g;
        int i6 = this.f7465p + ((int) ((((i4 / (f2 / f9)) + this.f7467r) / (this.f7458h * f9)) + 0.5f));
        this.f7462m = a(this.f7462m, i4, (this.f7460k * 2) + i4);
        int i9 = 0;
        while (true) {
            i = this.f7460k;
            int i10 = this.f7455e;
            if (i9 >= i * 2 * i10) {
                break;
            }
            this.f7462m[(i10 * i4) + i9] = 0;
            i9++;
        }
        this.f7463n = (i * 2) + this.f7463n;
        d();
        if (this.f7465p > i6) {
            this.f7465p = i6;
        }
        this.f7463n = 0;
        this.f7470u = 0;
        this.f7467r = 0;
    }

    private void c(int i) {
        int i4 = this.f7465p - i;
        short[] a9 = a(this.f7466q, this.f7467r, i4);
        this.f7466q = a9;
        short[] sArr = this.f7464o;
        int i6 = this.f7455e;
        System.arraycopy(sArr, i * i6, a9, this.f7467r * i6, i6 * i4);
        this.f7465p = i;
        this.f7467r += i4;
    }

    private void b(short[] sArr, int i, int i4) {
        short[] a9 = a(this.f7464o, this.f7465p, i4);
        this.f7464o = a9;
        int i6 = this.f7455e;
        System.arraycopy(sArr, i * i6, a9, this.f7465p * i6, i6 * i4);
        this.f7465p += i4;
    }

    private int b(int i) {
        int min = Math.min(this.f7460k, this.f7470u);
        b(this.f7462m, i, min);
        this.f7470u -= min;
        return min;
    }

    private short[] a(short[] sArr, int i, int i4) {
        int length = sArr.length;
        int i6 = this.f7455e;
        int i9 = length / i6;
        return i + i4 <= i9 ? sArr : Arrays.copyOf(sArr, (((i9 * 3) / 2) + i4) * i6);
    }

    private short b(short[] sArr, int i, int i4, int i6) {
        short s9 = sArr[i];
        short s10 = sArr[i + this.f7455e];
        int i9 = this.f7469t * i4;
        int i10 = this.f7468s;
        int i11 = i10 * i6;
        int i12 = (i10 + 1) * i6;
        int i13 = i12 - i9;
        int i14 = i12 - i11;
        return (short) ((((i14 - i13) * s10) + (s9 * i13)) / i14);
    }

    private void a(int i) {
        int i4 = this.f7463n - i;
        short[] sArr = this.f7462m;
        int i6 = this.f7455e;
        System.arraycopy(sArr, i * i6, sArr, 0, i6 * i4);
        this.f7463n = i4;
    }

    private int b(short[] sArr, int i, float f2, int i4) {
        int i6;
        if (f2 < 0.5f) {
            i6 = (int) ((i4 * f2) / (1.0f - f2));
        } else {
            this.f7470u = (int) ((((2.0f * f2) - 1.0f) * i4) / (1.0f - f2));
            i6 = i4;
        }
        int i9 = i4 + i6;
        short[] a9 = a(this.f7464o, this.f7465p, i9);
        this.f7464o = a9;
        int i10 = this.f7455e;
        System.arraycopy(sArr, i * i10, a9, this.f7465p * i10, i10 * i4);
        a(i6, this.f7455e, this.f7464o, this.f7465p + i4, sArr, i + i4, sArr, i);
        this.f7465p += i9;
        return i6;
    }

    private int a(short[] sArr, int i, int i4, int i6) {
        int i9 = i * this.f7455e;
        int i10 = com.anythink.basead.exoplayer.k.p.f9259b;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i4 <= i6) {
            int i14 = 0;
            for (int i15 = 0; i15 < i4; i15++) {
                i14 += Math.abs(sArr[i9 + i15] - sArr[(i9 + i4) + i15]);
            }
            if (i14 * i12 < i11 * i4) {
                i12 = i4;
                i11 = i14;
            }
            if (i14 * i10 > i13 * i4) {
                i10 = i4;
                i13 = i14;
            }
            i4++;
        }
        this.f7473x = i11 / i12;
        this.f7474y = i13 / i10;
        return i12;
    }

    private boolean a(int i, int i4) {
        return i != 0 && this.f7471v != 0 && i4 <= i * 3 && i * 2 > this.f7472w * 3;
    }

    private int a(short[] sArr, int i) {
        int i4;
        int i6;
        int i9 = this.f7454d;
        int i10 = i9 > f7453c ? i9 / f7453c : 1;
        if (this.f7455e == 1 && i10 == 1) {
            i4 = a(sArr, i, this.i, this.f7459j);
        } else {
            c(sArr, i, i10);
            int a9 = a(this.f7461l, 0, this.i / i10, this.f7459j / i10);
            if (i10 != 1) {
                int i11 = a9 * i10;
                int i12 = i10 * 4;
                int i13 = i11 - i12;
                int i14 = i11 + i12;
                int i15 = this.i;
                if (i13 < i15) {
                    i13 = i15;
                }
                int i16 = this.f7459j;
                if (i14 > i16) {
                    i14 = i16;
                }
                if (this.f7455e == 1) {
                    i4 = a(sArr, i, i13, i14);
                } else {
                    c(sArr, i, 1);
                    i4 = a(this.f7461l, 0, i13, i14);
                }
            } else {
                i4 = a9;
            }
        }
        int i17 = this.f7473x;
        int i18 = this.f7474y;
        if (i17 == 0 || (i6 = this.f7471v) == 0 || i18 > i17 * 3 || i17 * 2 <= this.f7472w * 3) {
            i6 = i4;
        }
        this.f7472w = i17;
        this.f7471v = i4;
        return i6;
    }

    private void a(float f2, int i) {
        int i4;
        int i6;
        int i9;
        if (this.f7465p == i) {
            return;
        }
        int i10 = this.f7454d;
        int i11 = (int) (i10 / f2);
        while (true) {
            if (i11 <= 16384 && i10 <= 16384) {
                break;
            }
            i11 /= 2;
            i10 /= 2;
        }
        int i12 = this.f7465p - i;
        short[] a9 = a(this.f7466q, this.f7467r, i12);
        this.f7466q = a9;
        short[] sArr = this.f7464o;
        int i13 = this.f7455e;
        System.arraycopy(sArr, i * i13, a9, this.f7467r * i13, i13 * i12);
        this.f7465p = i;
        this.f7467r += i12;
        int i14 = 0;
        while (true) {
            i4 = this.f7467r;
            if (i14 >= i4 - 1) {
                break;
            }
            while (true) {
                i6 = this.f7468s;
                int i15 = (i6 + 1) * i11;
                i9 = this.f7469t;
                if (i15 <= i9 * i10) {
                    break;
                }
                this.f7464o = a(this.f7464o, this.f7465p, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f7455e;
                    if (i16 < i17) {
                        short[] sArr2 = this.f7464o;
                        int i18 = (this.f7465p * i17) + i16;
                        short[] sArr3 = this.f7466q;
                        int i19 = (i14 * i17) + i16;
                        short s9 = sArr3[i19];
                        short s10 = sArr3[i19 + i17];
                        int i20 = this.f7469t * i10;
                        int i21 = this.f7468s;
                        int i22 = i21 * i11;
                        int i23 = (i21 + 1) * i11;
                        int i24 = i23 - i20;
                        int i25 = i23 - i22;
                        sArr2[i18] = (short) ((((i25 - i24) * s10) + (s9 * i24)) / i25);
                        i16++;
                    }
                }
                this.f7469t++;
                this.f7465p++;
            }
            int i26 = i6 + 1;
            this.f7468s = i26;
            if (i26 == i10) {
                this.f7468s = 0;
                com.anythink.basead.exoplayer.k.a.b(i9 == i11);
                this.f7469t = 0;
            }
            i14++;
        }
        int i27 = i4 - 1;
        if (i27 != 0) {
            short[] sArr4 = this.f7466q;
            int i28 = this.f7455e;
            System.arraycopy(sArr4, i27 * i28, sArr4, 0, (i4 - i27) * i28);
            this.f7467r -= i27;
        }
    }

    private int a(short[] sArr, int i, float f2, int i4) {
        int i6;
        if (f2 >= 2.0f) {
            i6 = (int) (i4 / (f2 - 1.0f));
        } else {
            this.f7470u = (int) (((2.0f - f2) * i4) / (f2 - 1.0f));
            i6 = i4;
        }
        short[] a9 = a(this.f7464o, this.f7465p, i6);
        this.f7464o = a9;
        a(i6, this.f7455e, a9, this.f7465p, sArr, i, sArr, i + i4);
        this.f7465p += i6;
        return i6;
    }

    private void a(float f2) {
        int i;
        int i4;
        int i6;
        int i9;
        int i10 = this.f7463n;
        if (i10 < this.f7460k) {
            return;
        }
        int i11 = 0;
        do {
            int i12 = this.f7470u;
            if (i12 > 0) {
                i4 = Math.min(this.f7460k, i12);
                b(this.f7462m, i11, i4);
                this.f7470u -= i4;
            } else {
                short[] sArr = this.f7462m;
                int i13 = this.f7454d;
                int i14 = i13 > f7453c ? i13 / f7453c : 1;
                if (this.f7455e == 1 && i14 == 1) {
                    i = a(sArr, i11, this.i, this.f7459j);
                } else {
                    c(sArr, i11, i14);
                    int a9 = a(this.f7461l, 0, this.i / i14, this.f7459j / i14);
                    if (i14 != 1) {
                        int i15 = a9 * i14;
                        int i16 = i14 * 4;
                        int i17 = i15 - i16;
                        int i18 = i15 + i16;
                        int i19 = this.i;
                        if (i17 < i19) {
                            i17 = i19;
                        }
                        int i20 = this.f7459j;
                        if (i18 > i20) {
                            i18 = i20;
                        }
                        if (this.f7455e == 1) {
                            i = a(sArr, i11, i17, i18);
                        } else {
                            c(sArr, i11, 1);
                            i = a(this.f7461l, 0, i17, i18);
                        }
                    } else {
                        i = a9;
                    }
                }
                int i21 = this.f7473x;
                int i22 = (i21 == 0 || (i9 = this.f7471v) == 0 || this.f7474y > i21 * 3 || i21 * 2 <= this.f7472w * 3) ? i : i9;
                this.f7472w = i21;
                this.f7471v = i;
                if (f2 > 1.0d) {
                    short[] sArr2 = this.f7462m;
                    if (f2 >= 2.0f) {
                        i6 = (int) (i22 / (f2 - 1.0f));
                    } else {
                        this.f7470u = (int) (((2.0f - f2) * i22) / (f2 - 1.0f));
                        i6 = i22;
                    }
                    short[] a10 = a(this.f7464o, this.f7465p, i6);
                    this.f7464o = a10;
                    a(i6, this.f7455e, a10, this.f7465p, sArr2, i11, sArr2, i11 + i22);
                    this.f7465p += i6;
                    i11 = i22 + i6 + i11;
                } else {
                    short[] sArr3 = this.f7462m;
                    if (f2 < 0.5f) {
                        i4 = (int) ((i22 * f2) / (1.0f - f2));
                    } else {
                        this.f7470u = (int) ((((2.0f * f2) - 1.0f) * i22) / (1.0f - f2));
                        i4 = i22;
                    }
                    int i23 = i22 + i4;
                    short[] a11 = a(this.f7464o, this.f7465p, i23);
                    this.f7464o = a11;
                    int i24 = this.f7455e;
                    System.arraycopy(sArr3, i11 * i24, a11, this.f7465p * i24, i24 * i22);
                    int i25 = i11;
                    a(i4, this.f7455e, this.f7464o, this.f7465p + i22, sArr3, i11 + i22, sArr3, i25);
                    i11 = i25;
                    this.f7465p += i23;
                }
            }
            i11 += i4;
        } while (this.f7460k + i11 <= i10);
        int i26 = this.f7463n - i11;
        short[] sArr4 = this.f7462m;
        int i27 = this.f7455e;
        System.arraycopy(sArr4, i11 * i27, sArr4, 0, i27 * i26);
        this.f7463n = i26;
    }

    private static void a(int i, int i4, short[] sArr, int i6, short[] sArr2, int i9, short[] sArr3, int i10) {
        for (int i11 = 0; i11 < i4; i11++) {
            int i12 = (i6 * i4) + i11;
            int i13 = (i10 * i4) + i11;
            int i14 = (i9 * i4) + i11;
            for (int i15 = 0; i15 < i; i15++) {
                sArr[i12] = (short) (((sArr3[i13] * i15) + ((i - i15) * sArr2[i14])) / i);
                i12 += i4;
                i14 += i4;
                i13 += i4;
            }
        }
    }
}
