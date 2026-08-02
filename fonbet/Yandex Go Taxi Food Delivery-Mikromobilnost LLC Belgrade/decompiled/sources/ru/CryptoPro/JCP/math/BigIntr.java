package ru.CryptoPro.JCP.math;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.c6a1;
import defpackage.ny61;
import defpackage.r5a1;
import defpackage.w511;
import java.util.Arrays;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public class BigIntr {
    public static final BigIntr FOUR;
    public static final BigIntr ONE;
    public static final BigIntr TWO;
    public static final BigIntr ZERO;
    public static final BigIntr[] b = new BigIntr[17];
    public static final int[] c;
    public static final int[] d;
    public static final long[] e;
    public int[] a;

    static {
        for (int i = 1; i <= 16; i++) {
            b[i] = new BigIntr(new int[]{i});
        }
        ZERO = new BigIntr(new int[0]);
        BigIntr[] bigIntrArr = b;
        ONE = bigIntrArr[1];
        TWO = bigIntrArr[2];
        FOUR = bigIntrArr[4];
        c = new int[]{0, 0, 30, 19, 15, 13, 11, 11, 10, 9, 9, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 5};
        d = new int[]{0, 0, 1073741824, 1162261467, 1073741824, 1220703125, 362797056, 1977326743, 1073741824, 387420489, 1000000000, 214358881, 429981696, 815730721, 1475789056, 170859375, SelfTester_JCP.IMITA, 410338673, 612220032, 893871739, 1280000000, 1801088541, 113379904, 148035889, 191102976, 244140625, 308915776, 387420489, 481890304, 594823321, 729000000, 887503681, 1073741824, 1291467969, 1544804416, 1838265625, 60466176};
        e = new long[]{0, 0, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, 1624, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, 2378, 2648, 2875, 3072, 3247, 3402, 3543, 3672, 3790, 3899, 4001, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, 4186, 4271, 4350, 4426, 4498, 4567, 4633, 4696, 4756, 4814, 4870, 4923, 4975, 5025, 5074, 5120, 5166, 5210, 5253, 5295};
    }

    public BigIntr(String str, int i) {
        this.a = new int[0];
        int length = str.length();
        if (i < 2 || i > 36) {
            throw new NumberFormatException("Radix out of range");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("Zero length BigIntr");
        }
        if (str.indexOf(45) != -1) {
            throw new NumberFormatException("Illegal embedded minus sign");
        }
        int i2 = 0;
        while (i2 < length && Character.digit(str.charAt(i2), i) == 0) {
            i2++;
        }
        if (i2 == length) {
            this.a = new int[]{0};
            return;
        }
        int i3 = length - i2;
        this.a = new int[(((int) (((i3 * e[i]) >>> 10) + 1)) + 31) >> 5];
        int[] iArr = c;
        int i4 = iArr[i];
        int i5 = i3 % i4;
        int i6 = (i5 != 0 ? i5 : i4) + i2;
        String substring = str.substring(i2, i6);
        int[] iArr2 = this.a;
        iArr2[iArr2.length - 1] = Integer.parseInt(substring, i);
        int[] iArr3 = this.a;
        if (iArr3[iArr3.length - 1] < 0) {
            throw new NumberFormatException("Illegal digit");
        }
        int i7 = d[i];
        while (i6 < str.length()) {
            int i8 = iArr[i] + i6;
            int parseInt = Integer.parseInt(str.substring(i6, i8), i);
            if (parseInt < 0) {
                throw new NumberFormatException("Illegal digit");
            }
            int[] iArr4 = this.a;
            long a = a(i7);
            long a2 = a(parseInt);
            int length2 = iArr4.length;
            int i9 = length2 - 1;
            long j = 0;
            int i10 = i9;
            while (i10 >= 0) {
                long a3 = (a(iArr4[i10]) * a) + j;
                iArr4[i10] = (int) a3;
                j = a3 >>> 32;
                i10--;
                i7 = i7;
            }
            int i11 = i7;
            long a4 = a(iArr4[i9]) + a2;
            iArr4[i9] = (int) a4;
            long j2 = a4 >>> 32;
            for (int i12 = length2 - 2; i12 >= 0; i12--) {
                long a5 = a(iArr4[i12]) + j2;
                iArr4[i12] = (int) a5;
                j2 = a5 >>> 32;
            }
            i6 = i8;
            i7 = i11;
        }
        int[] iArr5 = this.a;
        int i13 = 0;
        while (i13 < iArr5.length && iArr5[i13] == 0) {
            i13++;
        }
        if (i13 > 0) {
            int[] iArr6 = new int[iArr5.length - i13];
            System.arraycopy(iArr5, i13, iArr6, 0, iArr5.length - i13);
            iArr5 = iArr6;
        }
        this.a = iArr5;
        this.a = Array.intOrderI(iArr5);
    }

    public static long a(int i) {
        return (i << 32) >>> 32;
    }

    public static void b(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3) {
        int[] iArr = bigIntr.a;
        int[] iArr2 = bigIntr2.a;
        r5a1.i(iArr, iArr2, iArr2, bigIntr3.a);
    }

    public static void c(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, int i, long[] jArr) {
        int[] iArr = bigIntr2.a;
        int length = iArr.length;
        int[] iArr2 = bigIntr.a;
        int length2 = iArr2.length;
        if (length == 1) {
            int i2 = iArr[0];
            if (i2 == 0) {
                Arrays.fill(iArr2, 0, length2, 0);
                return;
            } else if (i2 == 1) {
                Arrays.fill(iArr2, 1, length2, 0);
                iArr2[0] = 1;
                return;
            }
        }
        if (length < length2) {
            int[] iArr3 = new int[length2];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            Arrays.fill(iArr3, length, length2, 0);
            iArr = iArr3;
        }
        if (length > length2) {
            w511.w("");
            return;
        }
        int[] iArr4 = bigIntr3.a;
        if (length2 == 8) {
            r5a1.h(iArr2, iArr, iArr4, i, jArr);
        } else {
            r5a1.n(iArr2, iArr, iArr4, i, jArr);
        }
    }

    public static void d(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, BigIntr bigIntr4) {
        r5a1.o(bigIntr.a, bigIntr2.a, bigIntr3.a, bigIntr4.a);
    }

    public static void e(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, BigIntr bigIntr4, int i, long[] jArr) {
        int[] iArr = bigIntr.a;
        int[] iArr2 = bigIntr2.a;
        int length = iArr2.length;
        int[] iArr3 = bigIntr3.a;
        int length2 = iArr3.length;
        int[] iArr4 = bigIntr4.a;
        int length3 = iArr.length;
        if (length == 1) {
            int i2 = iArr2[0];
            if (i2 == 0) {
                Arrays.fill(iArr, 0, length3, 0);
                return;
            } else if (i2 == 1) {
                System.arraycopy(iArr3, 0, iArr, 0, length2);
                Arrays.fill(iArr, length2, length3, 0);
                return;
            }
        }
        if (length2 == 1) {
            int i3 = iArr3[0];
            if (i3 == 0) {
                Arrays.fill(iArr, 0, length3, 0);
                return;
            } else if (i3 == 1) {
                System.arraycopy(iArr2, 0, iArr, 0, length);
                Arrays.fill(iArr, length, length3, 0);
                return;
            }
        }
        if (length < length3) {
            int[] iArr5 = new int[length3];
            System.arraycopy(iArr2, 0, iArr5, 0, length);
            Arrays.fill(iArr5, length, length3, 0);
            iArr2 = iArr5;
        }
        if (length2 < length3) {
            int[] iArr6 = new int[length3];
            System.arraycopy(iArr3, 0, iArr6, 0, length2);
            Arrays.fill(iArr6, length2, length3, 0);
            iArr3 = iArr6;
        }
        if (length2 > length3 || length > length3) {
            w511.w("");
        } else if (length3 == 8) {
            r5a1.j(iArr, iArr2, iArr3, iArr4, i, jArr);
        } else {
            r5a1.p(iArr, iArr2, iArr3, iArr4, i, jArr);
        }
    }

    public static void f(BigIntr bigIntr, int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int[] iArr4 = bigIntr.a;
        int length = iArr4.length << 5;
        iArr3[0] = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i2 >= length) {
                break;
            }
            if (i3 == (i2 >= length ? 0 : (iArr4[i2 >>> 5] >>> (i2 % 32)) & 1)) {
                i4++;
                i2++;
            } else {
                int i6 = 0;
                while (i6 < 6 && (i = i2 + i6) < length) {
                    i3 |= i >= length ? 0 : ((iArr4[i >>> 5] >>> (i % 32)) & 1) << i6;
                    i6++;
                }
                int i7 = i2 + i6;
                if (i7 < length || i6 >= 6) {
                    int i8 = i2 + 6;
                    if ((i8 >= length ? 0 : (iArr4[i8 >>> 5] >>> (i8 % 32)) & 1) == 0) {
                        iArr2[iArr3[0]] = i3;
                        iArr[iArr3[0]] = i4;
                        iArr3[0] = iArr3[0] + 1;
                    } else {
                        iArr2[iArr3[0]] = i3 - 64;
                        iArr[iArr3[0]] = i4;
                        int i9 = iArr3[0] + 1;
                        iArr3[0] = i9;
                        if (i7 >= length) {
                            iArr2[i9] = 1;
                            iArr[iArr3[0]] = 1;
                            iArr3[0] = iArr3[0] + 1;
                        }
                        i2 += 7;
                        i3 = i5;
                    }
                    i5 = 0;
                    i2 += 7;
                    i3 = i5;
                } else {
                    iArr[iArr3[0]] = i4;
                    iArr2[iArr3[0]] = i3;
                    iArr3[0] = iArr3[0] + 1;
                    i2 = length;
                    i3 = 0;
                }
                i4 = 7;
            }
        }
        if (i3 == 1) {
            iArr2[iArr3[0]] = 1;
            iArr[iArr3[0]] = i4;
            iArr3[0] = iArr3[0] + 1;
        }
    }

    public static int[] g(BigIntr bigIntr, int[] iArr, int i) {
        int[] iArr2 = new int[i];
        Arrays.fill(iArr2, 0);
        int[] iArr3 = bigIntr.a;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        int i2 = i << 5;
        int i3 = i == 8 ? 4 : 8;
        int i4 = (i2 / i3) + 1;
        int[] iArr4 = new int[i4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                int i10 = (i7 * i3) + i9;
                i8 |= i10 >= i2 ? 0 : ((iArr2[i10 >>> 5] >>> (i10 % 32)) & 1) << i9;
            }
            int i11 = i8 + i6;
            int i12 = 1 << i3;
            if (i11 == i12) {
                iArr4[i7] = 0;
                i6 = 1;
            } else {
                if ((i11 >>> (i3 - 1)) == 0) {
                    iArr4[i7] = i11;
                    i6 = 0;
                } else {
                    i11 = i12 - i11;
                    iArr4[i7] = -i11;
                    i6 = 1;
                }
                if (i5 < i11) {
                    i5 = i11;
                }
            }
        }
        iArr[0] = i5;
        Arrays.fill(iArr2, 0);
        return iArr4;
    }

    public static void h(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3) {
        int[] iArr = bigIntr.a;
        int[] iArr2 = bigIntr2.a;
        int[] iArr3 = bigIntr3.a;
        r5a1.i(iArr, iArr2, iArr2, iArr3);
        r5a1.i(iArr, iArr, iArr, iArr3);
        r5a1.i(iArr, iArr, iArr, iArr3);
    }

    public static void i(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, BigIntr bigIntr4) {
        r5a1.i(bigIntr.a, bigIntr2.a, bigIntr3.a, bigIntr4.a);
    }

    public static boolean isZero(int[] iArr, int i, int i2) {
        if (i2 == 0) {
            return true;
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigIntr valueOf(long j, int i) {
        if (j > 0 && j <= 16) {
            int i2 = i + 1;
            int[] iArr = new int[i2];
            iArr[0] = b[(int) j].a[0];
            Arrays.fill(iArr, 1, i2, 0);
            return new BigIntr(iArr);
        }
        BigIntr bigIntr = new BigIntr();
        bigIntr.a = new int[0];
        int i3 = (int) (j >>> 32);
        if (i3 == 0) {
            int i4 = i + 1;
            int[] iArr2 = new int[i4];
            bigIntr.a = iArr2;
            iArr2[0] = (int) j;
            Arrays.fill(iArr2, 1, i4, 0);
            return bigIntr;
        }
        int i5 = i + 2;
        int[] iArr3 = new int[i5];
        bigIntr.a = iArr3;
        iArr3[1] = i3;
        iArr3[0] = (int) j;
        Arrays.fill(iArr3, 2, i5, 0);
        return bigIntr;
    }

    public BigIntr addCSP(BigIntr bigIntr, BigIntr bigIntr2) {
        int[] iArr = this.a;
        int[] iArr2 = bigIntr.a;
        int[] iArr3 = bigIntr2.a;
        int length = iArr.length;
        int length2 = iArr2.length;
        int length3 = iArr3.length;
        int[] iArr4 = new int[length3];
        if (length2 < length3) {
            iArr2 = Array.addFollowingZeros(iArr2, length3 - length2);
        }
        if (length < length3) {
            iArr = Array.addFollowingZeros(this.a, length3 - length);
        }
        r5a1.i(iArr4, iArr, iArr2, iArr3);
        if (iArr2 != bigIntr.a) {
            Arrays.fill(iArr2, 0);
        }
        if (iArr != this.a) {
            Arrays.fill(iArr, 0);
        }
        return new BigIntr(iArr4);
    }

    public void clear() {
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }

    public int compareTo(BigIntr bigIntr) {
        int[] iArr = this.a;
        int[] iArr2 = bigIntr.a;
        int d2 = c6a1.d(iArr.length, iArr);
        int d3 = c6a1.d(iArr2.length, iArr2);
        if (d2 < d3) {
            return -1;
        }
        if (d3 >= d2) {
            for (int i = d2 - 1; i >= 0; i--) {
                long a = a(iArr[i]);
                long a2 = a(iArr2[i]);
                if (a < a2) {
                    return -1;
                }
                if (a <= a2) {
                }
            }
            return 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BigIntr)) {
            return false;
        }
        int[] iArr = ((BigIntr) obj).a;
        if (iArr.length != this.a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.a;
            if (i >= iArr2.length) {
                return true;
            }
            if (iArr[i] != iArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public BigIntr euclidInverse(BigIntr bigIntr) {
        boolean z;
        if (isZero()) {
            w511.w("Cannot invert zero point");
            return null;
        }
        if (bigIntr.isZero()) {
            w511.w("Cannot invert by zero modulus");
            return null;
        }
        int[] iArr = bigIntr.a;
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = this.a;
        if (iArr3.length < iArr.length) {
            int[] iArr4 = new int[iArr.length];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            Arrays.fill(iArr4, this.a.length, bigIntr.a.length, 0);
            clear();
            this.a = iArr4;
        }
        int[] iArr5 = bigIntr.a;
        int length = iArr5.length;
        int[] iArr6 = this.a;
        if (length == 8) {
            r5a1.r(iArr2, iArr6, iArr5);
        } else if (iArr5.length == 16) {
            r5a1.t(iArr2, iArr6, iArr5);
        } else {
            int length2 = iArr5.length;
            int[] iArr7 = new int[68];
            int[] iArr8 = new int[68];
            int[] iArr9 = new int[68];
            int[] iArr10 = new int[68];
            int[] iArr11 = new int[68];
            int[] iArr12 = new int[68];
            int[] iArr13 = new int[68];
            int[] iArr14 = new int[68];
            int i = length2 + 1;
            Arrays.fill(iArr11, 1, i, 0);
            Arrays.fill(iArr12, 0, i, 0);
            Arrays.fill(iArr13, 0, i, 0);
            Arrays.fill(iArr14, 0, i, 0);
            iArr14[0] = 1;
            iArr11[0] = 1;
            System.arraycopy(iArr5, 0, iArr10, 0, length2);
            System.arraycopy(iArr5, 0, iArr8, 0, length2);
            iArr8[length2] = 0;
            iArr10[length2] = 0;
            if (c6a1.c(0, iArr6.length, iArr6.length, iArr6, iArr5) == 1) {
                int[] modCSP = modCSP(iArr6, iArr5);
                System.arraycopy(modCSP, 0, iArr7, 0, modCSP.length);
                System.arraycopy(modCSP, 0, iArr9, 0, modCSP.length);
                z = true;
                for (int i2 = 0; i2 < modCSP.length; i2++) {
                    if (iArr7[i2] != 0) {
                        z = false;
                    }
                }
                Arrays.fill(iArr7, modCSP.length, i, 0);
                Arrays.fill(iArr9, modCSP.length, i, 0);
            } else {
                System.arraycopy(iArr6, 0, iArr7, 0, iArr6.length);
                System.arraycopy(iArr6, 0, iArr9, 0, iArr6.length);
                boolean z2 = true;
                for (int i3 = 0; i3 < iArr6.length; i3++) {
                    if (iArr7[i3] != 0) {
                        z2 = false;
                    }
                }
                Arrays.fill(iArr7, iArr6.length, i, 0);
                Arrays.fill(iArr9, iArr6.length, i, 0);
                z = z2;
            }
            if (z || c6a1.c(0, i, i, iArr7, iArr8) == 0) {
                w511.w("try to find 0^(-1)");
                return null;
            }
            while (true) {
                if ((iArr9[0] & 1) != 0) {
                    while ((iArr10[0] & 1) == 0) {
                        c6a1.l(i, iArr10);
                        if ((iArr13[0] & 1) != 0 || (iArr14[0] & 1) != 0) {
                            c6a1.g(iArr13, iArr13, iArr8, 0, i);
                            c6a1.f(iArr14, iArr14, iArr7, i);
                        }
                        c6a1.l(i, iArr13);
                        c6a1.l(i, iArr14);
                    }
                    if (c6a1.c(0, i, i, iArr9, iArr10) >= 0) {
                        c6a1.f(iArr9, iArr9, iArr10, i);
                        c6a1.f(iArr11, iArr11, iArr13, i);
                        c6a1.f(iArr12, iArr12, iArr14, i);
                    } else {
                        c6a1.f(iArr10, iArr10, iArr9, i);
                        c6a1.f(iArr13, iArr13, iArr11, i);
                        c6a1.f(iArr14, iArr14, iArr12, i);
                    }
                    if (c6a1.d(i, iArr9) == 0) {
                        break;
                    }
                } else {
                    c6a1.l(i, iArr9);
                    if ((iArr11[0] & 1) != 0 || (iArr12[0] & 1) != 0) {
                        c6a1.g(iArr11, iArr11, iArr8, 0, i);
                        c6a1.f(iArr12, iArr12, iArr7, i);
                    }
                    c6a1.l(i, iArr11);
                    c6a1.l(i, iArr12);
                }
            }
            while (iArr13[length2] < 0) {
                c6a1.g(iArr13, iArr13, iArr8, 0, i);
            }
            while (c6a1.c(0, i, i, iArr13, iArr8) >= 0) {
                c6a1.f(iArr13, iArr13, iArr8, i);
            }
            System.arraycopy(iArr13, 0, iArr2, 0, length2);
        }
        BigIntr bigIntr2 = new BigIntr(iArr2);
        selfInverseCheck(bigIntr2, bigIntr);
        return bigIntr2;
    }

    public void finalize() throws Throwable {
        clear();
        super.finalize();
    }

    public int getIntLength() {
        return this.a.length;
    }

    public int[] getMag() {
        return Array.copy(this.a);
    }

    public int[] getMagWithoutCopy() {
        return this.a;
    }

    public BigIntr max(BigIntr bigIntr) {
        return compareTo(bigIntr) > 0 ? this : bigIntr;
    }

    public BigIntr min(BigIntr bigIntr) {
        return compareTo(bigIntr) < 0 ? this : bigIntr;
    }

    public BigIntr modCSP(BigIntr bigIntr) {
        return new BigIntr(modCSP(this.a, bigIntr.a));
    }

    public BigIntr mulCSP(BigIntr bigIntr, BigIntr bigIntr2) {
        int[] iArr = this.a;
        int[] iArr2 = bigIntr.a;
        int[] iArr3 = bigIntr2.a;
        int length = iArr2.length;
        int length2 = iArr.length;
        int length3 = iArr3.length;
        int[] iArr4 = new int[length3];
        if (length < length3) {
            iArr2 = Array.addFollowingZeros(iArr2, length3 - length);
        }
        int[] iArr5 = iArr2;
        if (length2 < length3) {
            iArr = Array.addFollowingZeros(this.a, length3 - length2);
        }
        int[] iArr6 = iArr;
        c6a1.j(iArr4, iArr6, iArr5, iArr3, 0, 0, 0, 0, length3);
        if (iArr5 != bigIntr.a) {
            Arrays.fill(iArr5, 0);
        }
        if (iArr6 != this.a) {
            Arrays.fill(iArr6, 0);
        }
        return new BigIntr(iArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BigIntr powCSP(BigIntr bigIntr, BigIntr bigIntr2) {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3 = this.a;
        int[] iArr4 = bigIntr.a;
        int[] iArr5 = bigIntr2.a;
        int length = iArr3.length;
        int length2 = iArr4.length;
        int length3 = iArr5.length;
        int[] iArr6 = new int[length3];
        if (length < length3) {
            iArr3 = Array.addFollowingZeros(iArr3, length3 - length);
        }
        int[] iArr7 = iArr3;
        int[] iArr8 = {0, 0, 8, 4, 2, 1};
        int i5 = length3 - 1;
        while (i5 >= 0 && iArr5[i5] == 0) {
            i5--;
        }
        if (i5 < 0) {
            ny61.g("Unable to raise");
            return null;
        }
        int i6 = 1;
        iArr6[0] = 1;
        Arrays.fill(iArr6, 1, length3, 0);
        int i7 = iArr5[0];
        if ((i7 & 1) == 0) {
            i = 0;
        } else {
            long n = c6a1.n(i7);
            for (int i8 = 0; i8 < 30; i8++) {
                n = ((c6a1.n(i7) * (((n * n) << 32) >>> 32)) << 32) >>> 32;
            }
            i = (int) (0 - n);
        }
        int[] iArr9 = new int[578];
        int i9 = i;
        c6a1.m(iArr9, iArr7, iArr5, 544, i9, length3);
        c6a1.m(iArr6, iArr6, iArr5, 0, i9, length3);
        int[] iArr10 = iArr6;
        c6a1.j(iArr9, iArr9, iArr9, iArr5, 0, 544, 544, i, length3);
        c6a1.j(iArr9, iArr9, iArr9, iArr5, 0, 0, 0, i, length3);
        c6a1.j(iArr9, iArr9, iArr9, iArr5, 0, 0, 0, i, length3);
        c6a1.j(iArr9, iArr9, iArr9, iArr5, 0, 0, 0, i, length3);
        for (int i10 = 1; i10 < 16; i10++) {
            c6a1.j(iArr9, iArr9, iArr9, iArr5, i10 * 34, (i10 - 1) * 34, 544, i, length3);
        }
        int[] iArr11 = iArr9;
        int i11 = 34;
        int i12 = length2 - 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z = true;
        while (i12 >= 0) {
            int i16 = 31;
            int i17 = i13;
            int i18 = i14;
            int i19 = i15;
            boolean z2 = z;
            while (i16 >= 0) {
                if (i18 != 0) {
                    i2 = i6;
                    iArr = iArr10;
                    i3 = i16;
                    c6a1.j(iArr, iArr10, iArr10, iArr5, 0, 0, 0, i, length3);
                } else {
                    i2 = i6;
                    iArr = iArr10;
                    i3 = i16;
                }
                if ((iArr4[i12] & (i2 << i3)) == 0) {
                    iArr2 = iArr11;
                    if (i17 > 0) {
                        i17++;
                    }
                } else if (i17 == 0) {
                    if (i12 != 0 || i3 >= 4) {
                        iArr2 = iArr11;
                        i4 = i2;
                        i19 = 0;
                    } else {
                        iArr2 = iArr11;
                        c6a1.j(iArr, iArr, iArr2, iArr5, 0, 0, 544, i, length3);
                        i18 = i2;
                        i4 = 0;
                        i19 = 0;
                    }
                    if (i4 != 5) {
                        if (z2) {
                            c6a1.e(0, i19 * 34, length3, iArr, iArr2);
                            i18 = i2;
                            z2 = false;
                        } else {
                            c6a1.j(iArr, iArr, iArr2, iArr5, 0, 0, i19 * 34, i, length3);
                        }
                        i17 = 0;
                    } else {
                        i17 = i4;
                    }
                    i16 = i3 - 1;
                    i6 = i2;
                    iArr10 = iArr;
                    iArr11 = iArr2;
                    i11 = 34;
                } else {
                    iArr2 = iArr11;
                    i17++;
                    i19 += iArr8[i17];
                }
                i4 = i17;
                if (i4 != 5) {
                }
                i16 = i3 - 1;
                i6 = i2;
                iArr10 = iArr;
                iArr11 = iArr2;
                i11 = 34;
            }
            i12--;
            i13 = i17;
            i14 = i18;
            i15 = i19;
            z = z2;
            i11 = 34;
        }
        int i20 = i6;
        int[] iArr12 = iArr10;
        int[] iArr13 = new int[i11];
        iArr13[0] = i20;
        Arrays.fill(iArr13, i20, length3, 0);
        c6a1.j(iArr12, iArr12, iArr13, iArr5, 0, 0, 0, i, length3);
        if (iArr7 != this.a) {
            Arrays.fill(iArr7, 0);
        }
        return new BigIntr(iArr12);
    }

    public void selfInverseCheck(BigIntr bigIntr, BigIntr bigIntr2) {
        BigIntr mulCSP = mulCSP(bigIntr, bigIntr2);
        boolean z = mulCSP.a[0] == 1;
        int i = 1;
        while (true) {
            int[] iArr = mulCSP.a;
            if (i >= iArr.length) {
                break;
            }
            z &= iArr[i] == 0;
            i++;
        }
        if (z) {
            return;
        }
        JCPLogger.warning("Error in inversion:\nbase value: " + Array.toHexString(this.a) + "\npmod value: " + Array.toHexString(bigIntr2.a) + "\ninversion result value: " + Array.toHexString(bigIntr.a) + "\ncheck result value: " + Array.toHexString(mulCSP.a));
        w511.w("Error in inversion func");
    }

    public void setMag(BigIntr bigIntr) {
        if (this.a.length != bigIntr.a.length) {
            clear();
            this.a = new int[bigIntr.a.length];
        }
        int[] iArr = bigIntr.a;
        System.arraycopy(iArr, 0, this.a, 0, iArr.length);
    }

    public BigIntr subCSP(BigIntr bigIntr, BigIntr bigIntr2) {
        int[] iArr = this.a;
        int[] iArr2 = bigIntr.a;
        int[] iArr3 = bigIntr2.a;
        int length = iArr.length;
        int length2 = iArr2.length;
        int length3 = iArr3.length;
        int[] iArr4 = new int[length3];
        if (length2 < length3) {
            iArr2 = Array.addFollowingZeros(iArr2, length3 - length2);
        }
        if (length < length3) {
            iArr = Array.addFollowingZeros(this.a, length3 - length);
        }
        r5a1.o(iArr4, iArr, iArr2, iArr3);
        if (iArr2 != bigIntr.a) {
            Arrays.fill(iArr2, 0);
        }
        if (iArr != this.a) {
            Arrays.fill(iArr, 0);
        }
        return new BigIntr(iArr4);
    }

    public byte[] toByteArray() {
        return Array.toByteArray(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        if (this.a.length == 0) {
            sb.append("ZERO");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return sb.toString();
            }
            sb.append(iArr[i]);
            sb.append('\n');
            i++;
        }
    }

    public static int[] modCSP(int[] iArr, int[] iArr2) {
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        c6a1.h(iArr3, iArr, iArr2, 0, length, iArr.length, length);
        return iArr3;
    }

    public boolean isZero() {
        int[] iArr = this.a;
        return isZero(iArr, 0, iArr.length);
    }

    public static BigIntr valueOf(long j) {
        return valueOf(j, 0);
    }

    public BigIntr(int i, RandomInterface randomInterface) {
        this.a = new int[0];
        int[] iArr = new int[i];
        this.a = iArr;
        randomInterface.makeRandom(iArr, 0, i);
    }

    public BigIntr(int i) {
        this.a = new int[0];
        this.a = new int[i];
    }

    public BigIntr(BigIntr bigIntr) {
        this.a = new int[0];
        int[] iArr = new int[bigIntr.a.length];
        this.a = iArr;
        int[] iArr2 = bigIntr.a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
    }

    public BigIntr(BigIntr bigIntr, int i) {
        this.a = new int[0];
        if (bigIntr.a.length > i) {
            ny61.g("Incorrect length");
            throw null;
        }
        int[] iArr = new int[i];
        this.a = iArr;
        int[] iArr2 = bigIntr.a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        Arrays.fill(this.a, bigIntr.a.length, i, 0);
    }

    public BigIntr(byte[] bArr) {
        this.a = new int[0];
        this.a = Array.toIntArray(bArr);
    }

    public BigIntr(int[] iArr) {
        this.a = new int[0];
        int[] iArr2 = new int[iArr.length];
        this.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public BigIntr(int[] iArr, int i, int i2) {
        this.a = new int[0];
        int[] iArr2 = new int[i2];
        this.a = iArr2;
        Array.copy(iArr, i, iArr2, 0, i2);
    }
}
