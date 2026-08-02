package com.squareup.cash.androidsvg;

/* loaded from: classes4.dex */
public final class NumberParser {
    public int pos;
    public static final double[] positivePowersOf10 = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
    public static final double[] negativePowersOf10 = {1.0d, 0.1d, 0.01d, 0.001d, 1.0E-4d, 1.0E-5d, 1.0E-6d, 1.0E-7d, 1.0E-8d, 1.0E-9d, 1.0E-10d, 1.0E-11d, 1.0E-12d, 1.0E-13d, 1.0E-14d, 1.0E-15d, 1.0E-16d, 1.0E-17d, 1.0E-18d, 1.0E-19d, 1.0E-20d, 1.0E-21d, 1.0E-22d, 1.0E-23d, 1.0E-24d, 1.0E-25d, 1.0E-26d, 1.0E-27d, 1.0E-28d, 1.0E-29d, 1.0E-30d, 1.0E-31d, 1.0E-32d, 1.0E-33d, 1.0E-34d, 1.0E-35d, 1.0E-36d, 1.0E-37d, 1.0E-38d};

    /* JADX WARN: Removed duplicated region for block: B:117:0x008a A[EDGE_INSN: B:117:0x008a->B:47:0x008a BREAK  A[LOOP:0: B:10:0x0034->B:17:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float parseNumber(int i, int i2, String str) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        double d;
        double d2;
        char charAt;
        int i8;
        boolean z3;
        boolean z4;
        char charAt2;
        this.pos = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char charAt3 = str.charAt(i);
        if (charAt3 == '+') {
            z = false;
        } else {
            if (charAt3 != '-') {
                z = false;
                int i9 = this.pos;
                long j = 0;
                i3 = 0;
                i4 = 0;
                int i10 = 0;
                z2 = false;
                int i11 = 0;
                while (true) {
                    i5 = this.pos;
                    if (i5 >= i2) {
                        break;
                    }
                    char charAt4 = str.charAt(i5);
                    if (charAt4 == '0') {
                        if (i3 == 0) {
                            i10++;
                        } else {
                            i4++;
                        }
                    } else if (charAt4 >= '1' && charAt4 <= '9') {
                        int i12 = i3 + i4;
                        while (i4 > 0) {
                            if (j > 922337203685477580L) {
                                return Float.NaN;
                            }
                            j *= 10;
                            i4--;
                        }
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j = (j * 10) + (charAt4 - '0');
                        i3 = i12 + 1;
                        if (j < 0) {
                            return Float.NaN;
                        }
                    } else {
                        if (charAt4 != '.' || z2) {
                            break;
                        }
                        i11 = this.pos - i9;
                        z2 = true;
                    }
                    this.pos++;
                }
                if (!z2 && this.pos == i11 + 1) {
                    return Float.NaN;
                }
                if (i3 == 0) {
                    if (i10 == 0) {
                        return Float.NaN;
                    }
                    i3 = 1;
                }
                if (z2) {
                    i4 = (i11 - i10) - i3;
                }
                i6 = this.pos;
                if (i6 < i2 && ((charAt = str.charAt(i6)) == 'E' || charAt == 'e')) {
                    i8 = this.pos + 1;
                    this.pos = i8;
                    if (i8 != i2) {
                        return Float.NaN;
                    }
                    char charAt5 = str.charAt(i8);
                    if (charAt5 == '+') {
                        z3 = false;
                    } else if (charAt5 != '-') {
                        switch (charAt5) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.pos--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                        if (!z4) {
                            int i13 = this.pos;
                            int i14 = 0;
                            while (true) {
                                int i15 = this.pos;
                                if (i15 < i2 && (charAt2 = str.charAt(i15)) >= '0' && charAt2 <= '9') {
                                    if (i14 > 922337203685477580L) {
                                        return Float.NaN;
                                    }
                                    i14 = (i14 * 10) + (charAt2 - '0');
                                    this.pos++;
                                }
                            }
                            if (this.pos == i13) {
                                return Float.NaN;
                            }
                            i4 = z3 ? i4 - i14 : i4 + i14;
                        }
                    } else {
                        z3 = true;
                    }
                    this.pos++;
                    z4 = false;
                    if (!z4) {
                    }
                }
                i7 = i3 + i4;
                if (i7 <= 39 || i7 < -44) {
                    return Float.NaN;
                }
                float f = j;
                if (j != 0) {
                    if (i4 > 0) {
                        d = f;
                        d2 = positivePowersOf10[i4];
                    } else if (i4 < 0) {
                        if (i4 < -38) {
                            f = (float) (f * 1.0E-20d);
                            i4 += 20;
                        }
                        d = f;
                        d2 = negativePowersOf10[-i4];
                    }
                    f = (float) (d * d2);
                }
                return z ? -f : f;
            }
            z = true;
        }
        this.pos++;
        int i92 = this.pos;
        long j2 = 0;
        i3 = 0;
        i4 = 0;
        int i102 = 0;
        z2 = false;
        int i112 = 0;
        while (true) {
            i5 = this.pos;
            if (i5 >= i2) {
            }
            this.pos++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
        }
        if (z2) {
        }
        i6 = this.pos;
        if (i6 < i2) {
            i8 = this.pos + 1;
            this.pos = i8;
            if (i8 != i2) {
            }
        }
        i7 = i3 + i4;
        if (i7 <= 39) {
        }
        return Float.NaN;
    }
}
