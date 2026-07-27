package com.anythink.basead.exoplayer.b;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6665a = 65;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6666b = 400;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6667c = 4000;

    /* renamed from: d, reason: collision with root package name */
    private final int f6668d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6669e;

    /* renamed from: f, reason: collision with root package name */
    private final float f6670f;

    /* renamed from: g, reason: collision with root package name */
    private final float f6671g;

    /* renamed from: h, reason: collision with root package name */
    private final float f6672h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final int f6673j;

    /* renamed from: k, reason: collision with root package name */
    private final int f6674k;

    /* renamed from: l, reason: collision with root package name */
    private final short[] f6675l;

    /* renamed from: m, reason: collision with root package name */
    private short[] f6676m;

    /* renamed from: n, reason: collision with root package name */
    private int f6677n;

    /* renamed from: o, reason: collision with root package name */
    private short[] f6678o;

    /* renamed from: p, reason: collision with root package name */
    private int f6679p;

    /* renamed from: q, reason: collision with root package name */
    private short[] f6680q;

    /* renamed from: r, reason: collision with root package name */
    private int f6681r;

    /* renamed from: s, reason: collision with root package name */
    private int f6682s;

    /* renamed from: t, reason: collision with root package name */
    private int f6683t;

    /* renamed from: u, reason: collision with root package name */
    private int f6684u;

    /* renamed from: v, reason: collision with root package name */
    private int f6685v;

    /* renamed from: w, reason: collision with root package name */
    private int f6686w;

    /* renamed from: x, reason: collision with root package name */
    private int f6687x;

    /* renamed from: y, reason: collision with root package name */
    private int f6688y;

    public s(int i, int i6, float f3, float f9, int i9) {
        this.f6668d = i;
        this.f6669e = i6;
        this.f6670f = f3;
        this.f6671g = f9;
        this.f6672h = i / i9;
        this.i = i / f6666b;
        int i10 = i / 65;
        this.f6673j = i10;
        int i11 = i10 * 2;
        this.f6674k = i11;
        this.f6675l = new short[i11];
        this.f6676m = new short[i11 * i6];
        this.f6678o = new short[i11 * i6];
        this.f6680q = new short[i11 * i6];
    }

    private void d(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f6680q;
        int i6 = this.f6669e;
        System.arraycopy(sArr, i * i6, sArr, 0, (this.f6681r - i) * i6);
        this.f6681r -= i;
    }

    public final void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f6669e;
        int i6 = remaining / i;
        short[] a9 = a(this.f6676m, this.f6677n, i6);
        this.f6676m = a9;
        shortBuffer.get(a9, this.f6677n * this.f6669e, ((i * i6) * 2) / 2);
        this.f6677n += i6;
        d();
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f6669e, this.f6679p);
        shortBuffer.put(this.f6678o, 0, this.f6669e * min);
        int i = this.f6679p - min;
        this.f6679p = i;
        short[] sArr = this.f6678o;
        int i6 = this.f6669e;
        System.arraycopy(sArr, min * i6, sArr, 0, i * i6);
    }

    public final int c() {
        return this.f6679p;
    }

    private void c(short[] sArr, int i, int i6) {
        int i9 = this.f6674k / i6;
        int i10 = this.f6669e;
        int i11 = i6 * i10;
        int i12 = i * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f6675l[i13] = (short) (i14 / i11);
        }
    }

    private void d() {
        int i = this.f6679p;
        float f3 = this.f6670f;
        float f9 = this.f6671g;
        float f10 = f3 / f9;
        float f11 = this.f6672h * f9;
        double d2 = f10;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            b(this.f6676m, 0, this.f6677n);
            this.f6677n = 0;
        } else {
            a(f10);
        }
        if (f11 != 1.0f) {
            a(f11, i);
        }
    }

    public final void b() {
        this.f6677n = 0;
        this.f6679p = 0;
        this.f6681r = 0;
        this.f6682s = 0;
        this.f6683t = 0;
        this.f6684u = 0;
        this.f6685v = 0;
        this.f6686w = 0;
        this.f6687x = 0;
        this.f6688y = 0;
    }

    public final void a() {
        int i;
        int i6 = this.f6677n;
        float f3 = this.f6670f;
        float f9 = this.f6671g;
        int i9 = this.f6679p + ((int) ((((i6 / (f3 / f9)) + this.f6681r) / (this.f6672h * f9)) + 0.5f));
        this.f6676m = a(this.f6676m, i6, (this.f6674k * 2) + i6);
        int i10 = 0;
        while (true) {
            i = this.f6674k;
            int i11 = this.f6669e;
            if (i10 >= i * 2 * i11) {
                break;
            }
            this.f6676m[(i11 * i6) + i10] = 0;
            i10++;
        }
        this.f6677n = (i * 2) + this.f6677n;
        d();
        if (this.f6679p > i9) {
            this.f6679p = i9;
        }
        this.f6677n = 0;
        this.f6684u = 0;
        this.f6681r = 0;
    }

    private void c(int i) {
        int i6 = this.f6679p - i;
        short[] a9 = a(this.f6680q, this.f6681r, i6);
        this.f6680q = a9;
        short[] sArr = this.f6678o;
        int i9 = this.f6669e;
        System.arraycopy(sArr, i * i9, a9, this.f6681r * i9, i9 * i6);
        this.f6679p = i;
        this.f6681r += i6;
    }

    private void b(short[] sArr, int i, int i6) {
        short[] a9 = a(this.f6678o, this.f6679p, i6);
        this.f6678o = a9;
        int i9 = this.f6669e;
        System.arraycopy(sArr, i * i9, a9, this.f6679p * i9, i9 * i6);
        this.f6679p += i6;
    }

    private int b(int i) {
        int min = Math.min(this.f6674k, this.f6684u);
        b(this.f6676m, i, min);
        this.f6684u -= min;
        return min;
    }

    private short[] a(short[] sArr, int i, int i6) {
        int length = sArr.length;
        int i9 = this.f6669e;
        int i10 = length / i9;
        return i + i6 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i6) * i9);
    }

    private short b(short[] sArr, int i, int i6, int i9) {
        short s9 = sArr[i];
        short s10 = sArr[i + this.f6669e];
        int i10 = this.f6683t * i6;
        int i11 = this.f6682s;
        int i12 = i11 * i9;
        int i13 = (i11 + 1) * i9;
        int i14 = i13 - i10;
        int i15 = i13 - i12;
        return (short) ((((i15 - i14) * s10) + (s9 * i14)) / i15);
    }

    private void a(int i) {
        int i6 = this.f6677n - i;
        short[] sArr = this.f6676m;
        int i9 = this.f6669e;
        System.arraycopy(sArr, i * i9, sArr, 0, i9 * i6);
        this.f6677n = i6;
    }

    private int b(short[] sArr, int i, float f3, int i6) {
        int i9;
        if (f3 < 0.5f) {
            i9 = (int) ((i6 * f3) / (1.0f - f3));
        } else {
            this.f6684u = (int) ((((2.0f * f3) - 1.0f) * i6) / (1.0f - f3));
            i9 = i6;
        }
        int i10 = i6 + i9;
        short[] a9 = a(this.f6678o, this.f6679p, i10);
        this.f6678o = a9;
        int i11 = this.f6669e;
        System.arraycopy(sArr, i * i11, a9, this.f6679p * i11, i11 * i6);
        a(i9, this.f6669e, this.f6678o, this.f6679p + i6, sArr, i + i6, sArr, i);
        this.f6679p += i10;
        return i9;
    }

    private int a(short[] sArr, int i, int i6, int i9) {
        int i10 = i * this.f6669e;
        int i11 = com.anythink.basead.exoplayer.k.p.f8473b;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i6 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i6; i16++) {
                i15 += Math.abs(sArr[i10 + i16] - sArr[(i10 + i6) + i16]);
            }
            if (i15 * i13 < i12 * i6) {
                i13 = i6;
                i12 = i15;
            }
            if (i15 * i11 > i14 * i6) {
                i11 = i6;
                i14 = i15;
            }
            i6++;
        }
        this.f6687x = i12 / i13;
        this.f6688y = i14 / i11;
        return i13;
    }

    private boolean a(int i, int i6) {
        return i != 0 && this.f6685v != 0 && i6 <= i * 3 && i * 2 > this.f6686w * 3;
    }

    private int a(short[] sArr, int i) {
        int i6;
        int i9;
        int i10 = this.f6668d;
        int i11 = i10 > f6667c ? i10 / f6667c : 1;
        if (this.f6669e == 1 && i11 == 1) {
            i6 = a(sArr, i, this.i, this.f6673j);
        } else {
            c(sArr, i, i11);
            int a9 = a(this.f6675l, 0, this.i / i11, this.f6673j / i11);
            if (i11 != 1) {
                int i12 = a9 * i11;
                int i13 = i11 * 4;
                int i14 = i12 - i13;
                int i15 = i12 + i13;
                int i16 = this.i;
                if (i14 < i16) {
                    i14 = i16;
                }
                int i17 = this.f6673j;
                if (i15 > i17) {
                    i15 = i17;
                }
                if (this.f6669e == 1) {
                    i6 = a(sArr, i, i14, i15);
                } else {
                    c(sArr, i, 1);
                    i6 = a(this.f6675l, 0, i14, i15);
                }
            } else {
                i6 = a9;
            }
        }
        int i18 = this.f6687x;
        int i19 = this.f6688y;
        if (i18 == 0 || (i9 = this.f6685v) == 0 || i19 > i18 * 3 || i18 * 2 <= this.f6686w * 3) {
            i9 = i6;
        }
        this.f6686w = i18;
        this.f6685v = i6;
        return i9;
    }

    private void a(float f3, int i) {
        int i6;
        int i9;
        int i10;
        if (this.f6679p == i) {
            return;
        }
        int i11 = this.f6668d;
        int i12 = (int) (i11 / f3);
        while (true) {
            if (i12 <= 16384 && i11 <= 16384) {
                break;
            }
            i12 /= 2;
            i11 /= 2;
        }
        int i13 = this.f6679p - i;
        short[] a9 = a(this.f6680q, this.f6681r, i13);
        this.f6680q = a9;
        short[] sArr = this.f6678o;
        int i14 = this.f6669e;
        System.arraycopy(sArr, i * i14, a9, this.f6681r * i14, i14 * i13);
        this.f6679p = i;
        this.f6681r += i13;
        int i15 = 0;
        while (true) {
            i6 = this.f6681r;
            if (i15 >= i6 - 1) {
                break;
            }
            while (true) {
                i9 = this.f6682s;
                int i16 = (i9 + 1) * i12;
                i10 = this.f6683t;
                if (i16 <= i10 * i11) {
                    break;
                }
                this.f6678o = a(this.f6678o, this.f6679p, 1);
                int i17 = 0;
                while (true) {
                    int i18 = this.f6669e;
                    if (i17 < i18) {
                        short[] sArr2 = this.f6678o;
                        int i19 = (this.f6679p * i18) + i17;
                        short[] sArr3 = this.f6680q;
                        int i20 = (i15 * i18) + i17;
                        short s9 = sArr3[i20];
                        short s10 = sArr3[i20 + i18];
                        int i21 = this.f6683t * i11;
                        int i22 = this.f6682s;
                        int i23 = i22 * i12;
                        int i24 = (i22 + 1) * i12;
                        int i25 = i24 - i21;
                        int i26 = i24 - i23;
                        sArr2[i19] = (short) ((((i26 - i25) * s10) + (s9 * i25)) / i26);
                        i17++;
                    }
                }
                this.f6683t++;
                this.f6679p++;
            }
            int i27 = i9 + 1;
            this.f6682s = i27;
            if (i27 == i11) {
                this.f6682s = 0;
                com.anythink.basead.exoplayer.k.a.b(i10 == i12);
                this.f6683t = 0;
            }
            i15++;
        }
        int i28 = i6 - 1;
        if (i28 != 0) {
            short[] sArr4 = this.f6680q;
            int i29 = this.f6669e;
            System.arraycopy(sArr4, i28 * i29, sArr4, 0, (i6 - i28) * i29);
            this.f6681r -= i28;
        }
    }

    private int a(short[] sArr, int i, float f3, int i6) {
        int i9;
        if (f3 >= 2.0f) {
            i9 = (int) (i6 / (f3 - 1.0f));
        } else {
            this.f6684u = (int) (((2.0f - f3) * i6) / (f3 - 1.0f));
            i9 = i6;
        }
        short[] a9 = a(this.f6678o, this.f6679p, i9);
        this.f6678o = a9;
        a(i9, this.f6669e, a9, this.f6679p, sArr, i, sArr, i + i6);
        this.f6679p += i9;
        return i9;
    }

    private void a(float f3) {
        int i;
        int i6;
        int i9;
        int i10;
        int i11 = this.f6677n;
        if (i11 < this.f6674k) {
            return;
        }
        int i12 = 0;
        do {
            int i13 = this.f6684u;
            if (i13 > 0) {
                i6 = Math.min(this.f6674k, i13);
                b(this.f6676m, i12, i6);
                this.f6684u -= i6;
            } else {
                short[] sArr = this.f6676m;
                int i14 = this.f6668d;
                int i15 = i14 > f6667c ? i14 / f6667c : 1;
                if (this.f6669e == 1 && i15 == 1) {
                    i = a(sArr, i12, this.i, this.f6673j);
                } else {
                    c(sArr, i12, i15);
                    int a9 = a(this.f6675l, 0, this.i / i15, this.f6673j / i15);
                    if (i15 != 1) {
                        int i16 = a9 * i15;
                        int i17 = i15 * 4;
                        int i18 = i16 - i17;
                        int i19 = i16 + i17;
                        int i20 = this.i;
                        if (i18 < i20) {
                            i18 = i20;
                        }
                        int i21 = this.f6673j;
                        if (i19 > i21) {
                            i19 = i21;
                        }
                        if (this.f6669e == 1) {
                            i = a(sArr, i12, i18, i19);
                        } else {
                            c(sArr, i12, 1);
                            i = a(this.f6675l, 0, i18, i19);
                        }
                    } else {
                        i = a9;
                    }
                }
                int i22 = this.f6687x;
                int i23 = (i22 == 0 || (i10 = this.f6685v) == 0 || this.f6688y > i22 * 3 || i22 * 2 <= this.f6686w * 3) ? i : i10;
                this.f6686w = i22;
                this.f6685v = i;
                if (f3 > 1.0d) {
                    short[] sArr2 = this.f6676m;
                    if (f3 >= 2.0f) {
                        i9 = (int) (i23 / (f3 - 1.0f));
                    } else {
                        this.f6684u = (int) (((2.0f - f3) * i23) / (f3 - 1.0f));
                        i9 = i23;
                    }
                    short[] a10 = a(this.f6678o, this.f6679p, i9);
                    this.f6678o = a10;
                    a(i9, this.f6669e, a10, this.f6679p, sArr2, i12, sArr2, i12 + i23);
                    this.f6679p += i9;
                    i12 = i23 + i9 + i12;
                } else {
                    short[] sArr3 = this.f6676m;
                    if (f3 < 0.5f) {
                        i6 = (int) ((i23 * f3) / (1.0f - f3));
                    } else {
                        this.f6684u = (int) ((((2.0f * f3) - 1.0f) * i23) / (1.0f - f3));
                        i6 = i23;
                    }
                    int i24 = i23 + i6;
                    short[] a11 = a(this.f6678o, this.f6679p, i24);
                    this.f6678o = a11;
                    int i25 = this.f6669e;
                    System.arraycopy(sArr3, i12 * i25, a11, this.f6679p * i25, i25 * i23);
                    int i26 = i12;
                    a(i6, this.f6669e, this.f6678o, this.f6679p + i23, sArr3, i12 + i23, sArr3, i26);
                    i12 = i26;
                    this.f6679p += i24;
                }
            }
            i12 += i6;
        } while (this.f6674k + i12 <= i11);
        int i27 = this.f6677n - i12;
        short[] sArr4 = this.f6676m;
        int i28 = this.f6669e;
        System.arraycopy(sArr4, i12 * i28, sArr4, 0, i28 * i27);
        this.f6677n = i27;
    }

    private static void a(int i, int i6, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i6; i12++) {
            int i13 = (i9 * i6) + i12;
            int i14 = (i11 * i6) + i12;
            int i15 = (i10 * i6) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                sArr[i13] = (short) (((sArr3[i14] * i16) + ((i - i16) * sArr2[i15])) / i);
                i13 += i6;
                i15 += i6;
                i14 += i6;
            }
        }
    }
}
