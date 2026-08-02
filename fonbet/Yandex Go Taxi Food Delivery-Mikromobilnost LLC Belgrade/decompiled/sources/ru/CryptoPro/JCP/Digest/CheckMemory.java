package ru.CryptoPro.JCP.Digest;

/* loaded from: classes4.dex */
public class CheckMemory {
    public int a = 846573270;
    public int b = -286331156;
    public int c = 0;

    public static int a(int i) {
        int i2 = i & 1;
        int i3 = i >>> 1;
        return i2 == 0 ? i3 : i3 ^ (-1297246683);
    }

    public static int checkMem32(int[] iArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = 846573270;
        int i4 = -286331156;
        for (int i5 = 0; i5 < (i2 >> 1); i5++) {
            int i6 = i + 1;
            i3 = (a(i3) ^ i4) ^ iArr[i];
            i += 2;
            i4 = (a(i4) ^ i3) ^ iArr[i6];
        }
        if ((i2 & 1) != 0) {
            i3 = (a(i3) ^ i4) ^ iArr[i];
        }
        return i3 + i4;
    }

    public static boolean verifyMem32(int[] iArr, int i, int i2, int i3) {
        if (i2 != 0) {
            int i4 = 846573270;
            int i5 = -286331156;
            for (int i6 = 0; i6 < (i2 >> 1); i6++) {
                int i7 = i + 1;
                i4 = (a(i4) ^ i5) ^ iArr[i];
                i += 2;
                i5 = (a(i5) ^ i4) ^ iArr[i7];
            }
            if ((i2 & 1) != 0) {
                i4 = (a(i4) ^ i5) ^ iArr[i];
            }
            if (i3 == i4 + i5) {
                return true;
            }
        }
        return false;
    }

    public int get() {
        if (this.c == 0) {
            return 0;
        }
        return this.a + this.b;
    }

    public void reset() {
        this.a = 846573270;
        this.b = -286331156;
        this.c = 0;
    }

    public void update(int[] iArr, int i, int i2) {
        if ((this.c & 1) != 0 && i2 != 0) {
            this.b = iArr[i] ^ (a(this.b) ^ this.a);
            this.c++;
            i2--;
            i++;
        }
        for (int i3 = 0; i3 < (i2 >> 1); i3++) {
            int a = a(this.a);
            int i4 = this.b;
            int i5 = i + 1;
            this.a = (a ^ i4) ^ iArr[i];
            i += 2;
            this.b = (a(i4) ^ this.a) ^ iArr[i5];
            this.c += 2;
        }
        if ((i2 & 1) != 0) {
            this.a = iArr[i] ^ (a(this.a) ^ this.b);
            this.c++;
        }
    }
}
