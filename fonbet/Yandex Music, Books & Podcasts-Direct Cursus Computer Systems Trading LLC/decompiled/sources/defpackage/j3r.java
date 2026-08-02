package defpackage;

import java.util.Arrays;
import kotlin.KotlinVersion;
import ru.yandex.quasar.glagol.impl.ConversationImpl;

/* loaded from: classes.dex */
public final class j3r {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public double w;

    public j3r(float f, float f2, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        this.j = new short[i5 * i2];
        this.l = new short[i5 * i2];
        this.n = new short[i5 * i2];
    }

    public static void e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        short[] c = c(this.l, this.m, i2);
        this.l = c;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, c, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    public final void f() {
        float f;
        double d;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        int i9 = this.m;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i10 = this.a;
        int i11 = 1;
        int i12 = this.b;
        int i13 = 0;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i14 = this.k;
            int i15 = this.h;
            if (i14 >= i15) {
                int i16 = 0;
                while (true) {
                    int i17 = this.r;
                    if (i17 > 0) {
                        int min = Math.min(i15, i17);
                        a(this.j, i16, min);
                        this.r -= min;
                        i16 += min;
                        f = f4;
                        d = d2;
                        i3 = i15;
                    } else {
                        short[] sArr = this.j;
                        int i18 = i10 > 4000 ? i10 / ConversationImpl.INCORRECT_TOKEN : i11;
                        int i19 = this.g;
                        int i20 = this.f;
                        if (i12 == i11 && i18 == i11) {
                            i = d(sArr, i16, i20, i19);
                            f = f4;
                            d = d2;
                        } else {
                            b(sArr, i16, i18);
                            f = f4;
                            d = d2;
                            short[] sArr2 = this.i;
                            int d3 = d(sArr2, i13, i20 / i18, i19 / i18);
                            if (i18 != 1) {
                                int i21 = d3 * i18;
                                int i22 = i18 * 4;
                                int i23 = i21 - i22;
                                int i24 = i21 + i22;
                                if (i23 >= i20) {
                                    i20 = i23;
                                }
                                if (i24 <= i19) {
                                    i19 = i24;
                                }
                                if (i12 == 1) {
                                    i = d(sArr, i16, i20, i19);
                                } else {
                                    b(sArr, i16, 1);
                                    i = d(sArr2, i13, i20, i19);
                                }
                            } else {
                                i = d3;
                            }
                        }
                        int i25 = this.u;
                        int i26 = this.v;
                        if (i25 == 0 || (i2 = this.s) == 0 || i26 > i25 * 3 || i25 * 2 <= this.t * 3) {
                            i2 = i;
                        }
                        this.t = i25;
                        this.s = i;
                        short[] sArr3 = this.j;
                        double d4 = this.w;
                        if (d > 1.0d) {
                            if (d >= 2.0d) {
                                i3 = i15;
                                double d5 = (i2 / (d - 1.0d)) + d4;
                                i5 = (int) Math.round(d5);
                                this.w = d5 - i5;
                            } else {
                                i3 = i15;
                                double d6 = (((2.0d - d) * i2) / (d - 1.0d)) + d4;
                                int round = (int) Math.round(d6);
                                this.r = round;
                                this.w = d6 - round;
                                i5 = i2;
                            }
                            short[] c = c(this.l, this.m, i5);
                            this.l = c;
                            int i27 = i16 + i2;
                            int i28 = i16;
                            int i29 = i5;
                            e(i29, this.b, c, this.m, sArr3, i28, sArr3, i27);
                            this.m += i29;
                            i16 = i2 + i29 + i28;
                        } else {
                            i3 = i15;
                            int i30 = i16;
                            if (d < 0.5d) {
                                double d7 = ((i2 * d) / (1.0d - d)) + d4;
                                int round2 = (int) Math.round(d7);
                                this.w = d7 - round2;
                                i4 = round2;
                            } else {
                                double d8 = ((((2.0d * d) - 1.0d) * i2) / (1.0d - d)) + d4;
                                int round3 = (int) Math.round(d8);
                                this.r = round3;
                                this.w = d8 - round3;
                                i4 = i2;
                            }
                            int i31 = i2 + i4;
                            short[] c2 = c(this.l, this.m, i31);
                            this.l = c2;
                            System.arraycopy(sArr3, i30 * i12, c2, this.m * i12, i2 * i12);
                            e(i4, this.b, this.l, this.m + i2, sArr3, i30 + i2, sArr3, i30);
                            this.m += i31;
                            i16 = i30 + i4;
                        }
                    }
                    if (i16 + i3 > i14) {
                        break;
                    }
                    i13 = 0;
                    i15 = i3;
                    i11 = 1;
                    f4 = f;
                    d2 = d;
                }
                int i32 = this.k - i16;
                short[] sArr4 = this.j;
                System.arraycopy(sArr4, i16 * i12, sArr4, 0, i32 * i12);
                this.k = i32;
                if (f != 1.0f || this.m == i9) {
                }
                long j3 = (long) (i10 / f);
                long j4 = i10;
                while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                    j3 /= 2;
                    j4 /= 2;
                }
                int i33 = this.m - i9;
                short[] c3 = c(this.n, this.o, i33);
                this.n = c3;
                System.arraycopy(this.l, i9 * i12, c3, this.o * i12, i33 * i12);
                this.m = i9;
                this.o += i33;
                int i34 = 0;
                while (true) {
                    i6 = this.o;
                    i7 = i6 - 1;
                    if (i34 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.p + 1;
                        j = i8;
                        long j5 = j * j3;
                        j2 = this.q;
                        if (j5 <= j2 * j4) {
                            break;
                        }
                        this.l = c(this.l, this.m, 1);
                        int i35 = 0;
                        while (i35 < i12) {
                            short[] sArr5 = this.l;
                            int i36 = (this.m * i12) + i35;
                            short[] sArr6 = this.n;
                            int i37 = (i34 * i12) + i35;
                            short s = sArr6[i37];
                            short s2 = sArr6[i37 + i12];
                            long j6 = j3;
                            int i38 = i34;
                            long j7 = (r12 + 1) * j6;
                            long j8 = j7 - (this.q * j4);
                            long j9 = j7 - (this.p * j6);
                            sArr5[i36] = (short) ((((j9 - j8) * s2) + (s * j8)) / j9);
                            i35++;
                            i34 = i38;
                            j3 = j6;
                        }
                        this.q++;
                        this.m++;
                        i34 = i34;
                        j3 = j3;
                    }
                    long j10 = j3;
                    int i39 = i34;
                    this.p = i8;
                    if (j == j4) {
                        this.p = 0;
                        vq1.A(j2 == j10);
                        this.q = 0;
                    }
                    i34 = i39 + 1;
                    j3 = j10;
                }
                if (i7 == 0) {
                    return;
                }
                short[] sArr7 = this.n;
                System.arraycopy(sArr7, i7 * i12, sArr7, 0, (i6 - i7) * i12);
                this.o -= i7;
                return;
            }
        } else {
            a(this.j, 0, this.k);
            this.k = 0;
        }
        f = f4;
        if (f != 1.0f) {
        }
    }
}
