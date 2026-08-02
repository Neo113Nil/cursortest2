package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class qx91 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[LOOP:0: B:13:0x005d->B:15:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qx91(String str, char[] cArr, byte[] bArr, boolean z) {
        int numberOfLeadingZeros;
        int i;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length <= 0) {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
            switch (uy91.a[roundingMode.ordinal()]) {
                case 1:
                    if (((length - 1) & length) != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                case 3:
                    numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                    this.d = numberOfLeadingZeros;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i2 = 1 << (3 - numberOfTrailingZeros);
                    this.e = i2;
                    this.f = numberOfLeadingZeros >> numberOfTrailingZeros;
                    this.c = length - 1;
                    this.g = bArr;
                    boolean[] zArr = new boolean[i2];
                    for (i = 0; i < this.f; i++) {
                        int i3 = this.d;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[xva1.f(i * 8, i3)] = true;
                    }
                    this.h = z;
                    return;
                case 4:
                case 5:
                    numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                    this.d = numberOfLeadingZeros;
                    int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i22 = 1 << (3 - numberOfTrailingZeros2);
                    this.e = i22;
                    this.f = numberOfLeadingZeros >> numberOfTrailingZeros2;
                    this.c = length - 1;
                    this.g = bArr;
                    boolean[] zArr2 = new boolean[i22];
                    while (i < this.f) {
                    }
                    this.h = z;
                    return;
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                    numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                    this.d = numberOfLeadingZeros;
                    int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i222 = 1 << (3 - numberOfTrailingZeros22);
                    this.e = i222;
                    this.f = numberOfLeadingZeros >> numberOfTrailingZeros22;
                    this.c = length - 1;
                    this.g = bArr;
                    boolean[] zArr22 = new boolean[i222];
                    while (i < this.f) {
                    }
                    this.h = z;
                    return;
                default:
                    throw new AssertionError();
            }
        } catch (ArithmeticException e) {
            yci0.p(oyr.i(cArr.length, "Illegal alphabet length "), e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qx91)) {
            return false;
        }
        qx91 qx91Var = (qx91) obj;
        return this.h == qx91Var.h && Arrays.equals(this.b, qx91Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qx91(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    ny61.g(jsa1.h("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                ny61.g(jsa1.h("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
    }
}
