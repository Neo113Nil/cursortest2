package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class DC {

    /* renamed from: a, reason: collision with root package name */
    public final String f24357a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f24358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24359c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24360d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24361e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24362f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f24363g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f24364h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DC(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c4 = cArr[i];
            if (!(c4 < 128)) {
                throw new IllegalArgumentException(AbstractC3194fG.u("Non-ASCII character: %s", Character.valueOf(c4)));
            }
            if (!(bArr[c4] == -1)) {
                throw new IllegalArgumentException(AbstractC3194fG.u("Duplicate character: %s", Character.valueOf(c4)));
            }
            bArr[c4] = (byte) i;
        }
    }

    public final int a(char c4) {
        if (c4 > 127) {
            throw new GC("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c4))));
        }
        byte b9 = this.f24363g[c4];
        if (b9 != -1) {
            return b9;
        }
        if (c4 <= ' ' || c4 == 127) {
            throw new GC("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c4))));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c4).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c4);
        throw new GC(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DC)) {
            return false;
        }
        DC dc = (DC) obj;
        return this.i == dc.i && Arrays.equals(this.f24358b, dc.f24358b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24358b) + (true != this.i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f24357a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[LOOP:0: B:13:0x0063->B:15:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DC(String str, char[] cArr, byte[] bArr, boolean z8) {
        int numberOfLeadingZeros;
        this.f24357a = str;
        cArr.getClass();
        this.f24358b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (RC.f27318a[roundingMode.ordinal()]) {
                    case 1:
                        PA.v(((length + (-1)) & length) == 0);
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f24360d = numberOfLeadingZeros;
                        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i = 1 << (3 - numberOfTrailingZeros);
                        this.f24361e = i;
                        this.f24362f = numberOfLeadingZeros >> numberOfTrailingZeros;
                        this.f24359c = length - 1;
                        this.f24363g = bArr;
                        boolean[] zArr = new boolean[i];
                        for (int i4 = 0; i4 < this.f24362f; i4++) {
                            int i9 = this.f24360d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[AbstractC2655Lg.n(i4 * 8, i9)] = true;
                        }
                        this.f24364h = zArr;
                        this.i = z8;
                        return;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f24360d = numberOfLeadingZeros;
                        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i10 = 1 << (3 - numberOfTrailingZeros2);
                        this.f24361e = i10;
                        this.f24362f = numberOfLeadingZeros >> numberOfTrailingZeros2;
                        this.f24359c = length - 1;
                        this.f24363g = bArr;
                        boolean[] zArr2 = new boolean[i10];
                        while (i4 < this.f24362f) {
                        }
                        this.f24364h = zArr2;
                        this.i = z8;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        this.f24360d = numberOfLeadingZeros;
                        int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i102 = 1 << (3 - numberOfTrailingZeros22);
                        this.f24361e = i102;
                        this.f24362f = numberOfLeadingZeros >> numberOfTrailingZeros22;
                        this.f24359c = length - 1;
                        this.f24363g = bArr;
                        boolean[] zArr22 = new boolean[i102];
                        while (i4 < this.f24362f) {
                        }
                        this.f24364h = zArr22;
                        this.i = z8;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e6) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(D.y.j(length2, "Illegal alphabet length ", new StringBuilder(String.valueOf(length2).length() + 24)), e6);
        }
    }
}
