package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class AC {

    /* renamed from: a, reason: collision with root package name */
    public final String f23650a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f23651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23652c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23653d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23654e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23655f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f23656g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f23657h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AC(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c9 = cArr[i];
            if (!(c9 < 128)) {
                throw new IllegalArgumentException(AbstractC2639Kg.x("Non-ASCII character: %s", Character.valueOf(c9)));
            }
            if (!(bArr[c9] == -1)) {
                throw new IllegalArgumentException(AbstractC2639Kg.x("Duplicate character: %s", Character.valueOf(c9)));
            }
            bArr[c9] = (byte) i;
        }
    }

    public final int a(char c9) {
        if (c9 > 127) {
            throw new DC("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c9))));
        }
        byte b9 = this.f23656g[c9];
        if (b9 != -1) {
            return b9;
        }
        if (c9 <= ' ' || c9 == 127) {
            throw new DC("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c9))));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c9).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c9);
        throw new DC(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AC)) {
            return false;
        }
        AC ac = (AC) obj;
        return this.i == ac.i && Arrays.equals(this.f23651b, ac.f23651b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23651b) + (true != this.i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f23650a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[LOOP:0: B:13:0x0063->B:15:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AC(String str, char[] cArr, byte[] bArr, boolean z3) {
        int numberOfLeadingZeros;
        this.f23650a = str;
        cArr.getClass();
        this.f23651b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (NC.f26472a[roundingMode.ordinal()]) {
                    case 1:
                        QC.j(((length + (-1)) & length) == 0);
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f23653d = numberOfLeadingZeros;
                        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i = 1 << (3 - numberOfTrailingZeros);
                        this.f23654e = i;
                        this.f23655f = numberOfLeadingZeros >> numberOfTrailingZeros;
                        this.f23652c = length - 1;
                        this.f23656g = bArr;
                        boolean[] zArr = new boolean[i];
                        for (int i6 = 0; i6 < this.f23655f; i6++) {
                            int i9 = this.f23653d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[AbstractC2968bG.p(i6 * 8, i9)] = true;
                        }
                        this.f23657h = zArr;
                        this.i = z3;
                        return;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f23653d = numberOfLeadingZeros;
                        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i10 = 1 << (3 - numberOfTrailingZeros2);
                        this.f23654e = i10;
                        this.f23655f = numberOfLeadingZeros >> numberOfTrailingZeros2;
                        this.f23652c = length - 1;
                        this.f23656g = bArr;
                        boolean[] zArr2 = new boolean[i10];
                        while (i6 < this.f23655f) {
                        }
                        this.f23657h = zArr2;
                        this.i = z3;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        this.f23653d = numberOfLeadingZeros;
                        int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i102 = 1 << (3 - numberOfTrailingZeros22);
                        this.f23654e = i102;
                        this.f23655f = numberOfLeadingZeros >> numberOfTrailingZeros22;
                        this.f23652c = length - 1;
                        this.f23656g = bArr;
                        boolean[] zArr22 = new boolean[i102];
                        while (i6 < this.f23655f) {
                        }
                        this.f23657h = zArr22;
                        this.i = z3;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e9) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(D.y.m(length2, "Illegal alphabet length ", new StringBuilder(String.valueOf(length2).length() + 24)), e9);
        }
    }
}
