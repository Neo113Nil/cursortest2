package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;

/* loaded from: assets/audience_network/classes2.dex */
public final class HU {
    public static String[] A04 = {"xqK2Lo9z9A1fq6AmzHgSANRckQSbvLg7", "r87Jk1TDX4QDRIaoZWvBkBULXd6iRGy1", "O8Rd55zCWOMZlt38o2yZqibVFCpM9qBW", "4N74z6RiBgc3GZHRgJ9RjrwcKA2Sbu4k", "rTO2Tuhk28L6aGO7sMrwgJqOHaARqGQ4", "wV6nIrgfSj92E7JYn8Dcxr40UnK38ksI", "xhpcFCDiO5Y2wtHgWJ12k6gPj7fKn5Nf", "gVHczwThIZ3ivnhVZg4GXcBO3FodCEeQ"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public HU(byte[] bArr, int i, int i6) {
        A08(bArr, i, i6);
    }

    private int A00() {
        int i = 0;
        while (!A0A()) {
            i++;
        }
        int i6 = (1 << i) - 1;
        int leadingZeros = i > 0 ? A05(i) : 0;
        return i6 + leadingZeros;
    }

    private void A01() {
        AbstractC06243y.A08(this.A02 >= 0 && (this.A02 < this.A01 || (this.A02 == this.A01 && this.A00 == 0)));
        String[] strArr = A04;
        if (strArr[5].charAt(17) == strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rbUb6Xt6pPTA8n7h1lny7mpNeejrLbnq";
        strArr2[1] = "r9GQrTTZLq4j6OnUyTd1FCUw4PnbqYK4";
    }

    private boolean A02(int i) {
        if (2 <= i && i < this.A01 && this.A03[i] == 3 && this.A03[i - 2] == 0) {
            byte[] bArr = this.A03;
            String[] strArr = A04;
            if (strArr[3].charAt(14) != strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "mTSOM4VXL5Qz6aHfzfUvwcrlrHOw2Zy6";
            strArr2[6] = "LbZWpLfoz4TupHHNd8RSjDzMBM5OqJ05";
            if (bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int A03() {
        int A00 = A00();
        int codeNum = A00 % 2;
        int i = codeNum == 0 ? -1 : 1;
        int codeNum2 = A00 + 1;
        return i * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i) {
        int i6 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i;
        while (true) {
            int returnValue2 = this.A00;
            if (returnValue2 <= 8) {
                break;
            }
            int returnValue3 = this.A00;
            this.A00 = returnValue3 - 8;
            byte[] bArr = this.A03;
            int returnValue4 = this.A02;
            int i9 = bArr[returnValue4] & p.f8473b;
            int returnValue5 = this.A00;
            i6 |= i9 << returnValue5;
            int i10 = this.A02;
            int returnValue6 = this.A02;
            if (!A02(returnValue6 + 1)) {
                r6 = 1;
            }
            this.A02 = i10 + r6;
        }
        byte[] bArr2 = this.A03;
        int returnValue7 = this.A02;
        int i11 = bArr2[returnValue7] & p.f8473b;
        int returnValue8 = this.A00;
        int i12 = i6 | (i11 >> (8 - returnValue8));
        int i13 = 32 - i;
        String[] strArr = A04;
        String str = strArr[5];
        String str2 = strArr[0];
        int charAt = str.charAt(17);
        int returnValue9 = str2.charAt(17);
        if (charAt == returnValue9) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "RXY6xLJuKIcEz3kUylWDYr6tsmitvphK";
        strArr2[7] = "WXiq34WZkyW8ugzR2g0a8ipZBHhkiRcU";
        int returnValue10 = (-1) >>> i13;
        int i14 = i12 & returnValue10;
        int returnValue11 = this.A00;
        if (returnValue11 == 8) {
            this.A00 = 0;
            int i15 = this.A02;
            int returnValue12 = this.A02;
            int i16 = i15 + (A02(returnValue12 + 1) ? 2 : 1);
            String[] strArr3 = A04;
            String str3 = strArr3[4];
            String str4 = strArr3[1];
            int charAt2 = str3.charAt(0);
            int returnValue13 = str4.charAt(0);
            if (charAt2 != returnValue13) {
                String[] strArr4 = A04;
                strArr4[4] = "rds4vupX8r7j5bNz4Ka4tPduGPmVtsGV";
                strArr4[1] = "rRPYe8lZfiAZtF0hvmlKmZn0YXaVPkJ6";
                this.A02 = i16;
            } else {
                String[] strArr5 = A04;
                strArr5[3] = "oP8krBIP0DDB0MHyD3CqohM2a51fTyLT";
                strArr5[6] = "8dOgzrP5xxQxSwHCAu2NrFg9fwsPMfLi";
                this.A02 = i16;
            }
        }
        A01();
        return i14;
    }

    public final void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            this.A02 += A02(this.A02 + 1) ? 2 : 1;
        }
        A01();
    }

    public final void A07(int i) {
        int i6 = this.A02;
        int i9 = i / 8;
        int oldByteOffset = this.A02;
        this.A02 = oldByteOffset + i9;
        int numBytes = this.A00;
        int oldByteOffset2 = i9 * 8;
        this.A00 = numBytes + (i - oldByteOffset2);
        int numBytes2 = this.A00;
        if (numBytes2 > 7) {
            int oldByteOffset3 = this.A02;
            this.A02 = oldByteOffset3 + 1;
            String[] strArr = A04;
            String str = strArr[3];
            String str2 = strArr[6];
            int numBytes3 = str.charAt(14);
            int oldByteOffset4 = str2.charAt(14);
            if (numBytes3 == oldByteOffset4) {
                String[] strArr2 = A04;
                strArr2[5] = "JMOXq6hG4yZwGcrVKWuSo4mZKx3jwnv0";
                strArr2[0] = "8hcVzozxp8VhJG7sJROCpbfriQIXRjxB";
                int oldByteOffset5 = this.A00;
                this.A00 = oldByteOffset5 - 8;
            }
            throw new RuntimeException();
        }
        while (true) {
            i6++;
            int oldByteOffset6 = this.A02;
            if (i6 <= oldByteOffset6) {
                boolean A02 = A02(i6);
                String[] strArr3 = A04;
                String str3 = strArr3[4];
                String str4 = strArr3[1];
                int numBytes4 = str3.charAt(0);
                int oldByteOffset7 = str4.charAt(0);
                if (numBytes4 != oldByteOffset7) {
                    break;
                }
                String[] strArr4 = A04;
                strArr4[3] = "ItBao4LZOiviF1HOEk7WTyNzP7shwqmG";
                strArr4[6] = "at4dJT6xDps7byHlzjkGtuWM4RrUB1u7";
                if (A02) {
                    int oldByteOffset8 = this.A02;
                    this.A02 = oldByteOffset8 + 1;
                    i6 += 2;
                }
            } else {
                A01();
                return;
            }
        }
    }

    public final void A08(byte[] bArr, int i, int i6) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i6;
        this.A00 = 0;
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A09() {
        int i = this.A02;
        int i6 = this.A00;
        int i9 = 0;
        while (initialBitOffset < initialByteOffset && !A0A()) {
            i9++;
        }
        int i10 = this.A02;
        int initialByteOffset = this.A01;
        int initialByteOffset2 = i10 == initialByteOffset ? 1 : 0;
        this.A02 = i;
        this.A00 = i6;
        if (initialByteOffset2 != 0) {
            return false;
        }
        int initialByteOffset3 = i9 * 2;
        return A0B(initialByteOffset3 + 1);
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    public final boolean A0B(int i) {
        int i6 = this.A02;
        int oldByteOffset = i / 8;
        int i9 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i9++;
            String[] strArr = A04;
            String str = strArr[4];
            String str2 = strArr[1];
            int numBytes = str.charAt(0);
            if (numBytes == str2.charAt(0)) {
                String[] strArr2 = A04;
                strArr2[2] = "4R3sKytGl1afrKMjnsBwna0p74CJayfl";
                strArr2[7] = "DtV04uWRet80XDEpYPrFh03isGofLap7";
                newBitOffset -= 8;
            }
            throw new RuntimeException();
        }
        int i10 = i6 + 1;
        while (i10 <= i9) {
            int i11 = this.A01;
            String[] strArr3 = A04;
            String str3 = strArr3[5];
            String str4 = strArr3[0];
            int numBytes2 = str3.charAt(17);
            if (numBytes2 == str4.charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A04;
            strArr4[4] = "ru8g1XQo0WAy59nUdKAzfoQ85z62h8So";
            strArr4[1] = "rlk5s9hHQFi3gmvg8c7PRJF1MfkgSAIS";
            if (i9 >= i11) {
                break;
            }
            if (A02(i10)) {
                i9++;
                i10 += 2;
            }
            i10++;
        }
        if (i9 >= this.A01) {
            return i9 == this.A01 && newBitOffset == 0;
        }
        return true;
    }
}
