package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1uSDK {
    private static byte[] component3 = new byte[256];
    static final byte[] getRevenue = new byte[256];
    static final int[] getMonetizationNetwork = new int[256];
    static final int[] getCurrencyIso4217Code = new int[256];
    static final int[] getMediationNetwork = new int[256];
    static final int[] AFAdRevenueData = new int[256];
    private static int[] component1 = new int[10];

    static {
        byte[] bArr;
        int i2;
        byte b2 = 1;
        byte b3 = 1;
        do {
            b2 = (byte) (((b2 & 128) != 0 ? 27 : 0) ^ ((b2 << 1) ^ b2));
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            b3 = (byte) (b6 ^ ((b6 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = component3;
            i2 = b2 & 255;
            int i3 = b3 & 255;
            bArr[i2] = (byte) (((((b3 ^ 99) ^ ((i3 << 1) | (i3 >> 7))) ^ ((i3 << 2) | (i3 >> 6))) ^ ((i3 << 3) | (i3 >> 5))) ^ ((i3 >> 4) | (i3 << 4)));
        } while (i2 != 1);
        bArr[0] = 99;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = component3[i4] & 255;
            getRevenue[i5] = (byte) i4;
            int i6 = i4 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 << 1;
            if (i8 >= 256) {
                i8 ^= 283;
            }
            int i9 = i8 ^ i4;
            int i10 = ((i6 ^ (i7 ^ i8)) << 24) | (i9 << 16) | ((i9 ^ i7) << 8) | (i9 ^ i6);
            getMonetizationNetwork[i5] = i10;
            getCurrencyIso4217Code[i5] = (i10 >>> 8) | (i10 << 24);
            getMediationNetwork[i5] = (i10 >>> 16) | (i10 << 16);
            AFAdRevenueData[i5] = (i10 << 8) | (i10 >>> 24);
        }
        component1[0] = 16777216;
        int i11 = 1;
        for (int i12 = 1; i12 < 10; i12++) {
            i11 <<= 1;
            if (i11 >= 256) {
                i11 ^= 283;
            }
            component1[i12] = i11 << 24;
        }
    }

    public static int[] getMediationNetwork(byte[] bArr, int i2) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i3 = 4;
        int i4 = (i2 + 1) * 4;
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < 4) {
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = (bArr[i6] << 24) | ((bArr[i7] & 255) << 16);
            int i10 = i8 + 1;
            iArr[i5] = i9 | ((bArr[i8] & 255) << 8) | (bArr[i10] & 255);
            i5++;
            i6 = i10 + 1;
        }
        int i11 = 4;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i4) {
            int i14 = iArr[i11 - 1];
            if (i12 == 0) {
                byte[] bArr2 = component3;
                i14 = ((bArr2[i14 >>> 24] & 255) | (((bArr2[(i14 >>> 16) & 255] << 24) | ((bArr2[(i14 >>> 8) & 255] & 255) << 16)) | ((bArr2[i14 & 255] & 255) << 8))) ^ component1[i13];
                i12 = 4;
                i13++;
            }
            iArr[i11] = i14 ^ iArr[i11 - 4];
            i11++;
            i12--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i4];
        int i15 = i2 * 4;
        int i16 = i15 + 1;
        iArr2[0] = iArr[i15];
        int i17 = i16 + 1;
        iArr2[1] = iArr[i16];
        int i18 = i17 + 1;
        iArr2[2] = iArr[i17];
        iArr2[3] = iArr[i18];
        int i19 = i18 - 7;
        for (int i20 = 1; i20 < i2; i20++) {
            int i21 = i19 + 1;
            int i22 = iArr[i19];
            int i23 = i3 + 1;
            int[] iArr3 = getMonetizationNetwork;
            byte[] bArr3 = component3;
            int i24 = iArr3[bArr3[i22 >>> 24] & 255];
            int[] iArr4 = getCurrencyIso4217Code;
            int i25 = i24 ^ iArr4[bArr3[(i22 >>> 16) & 255] & 255];
            int[] iArr5 = getMediationNetwork;
            int i26 = i25 ^ iArr5[bArr3[(i22 >>> 8) & 255] & 255];
            int[] iArr6 = AFAdRevenueData;
            iArr2[i3] = iArr6[bArr3[i22 & 255] & 255] ^ i26;
            int i27 = i21 + 1;
            int i28 = iArr[i21];
            int i29 = i23 + 1;
            iArr2[i23] = iArr6[bArr3[i28 & 255] & 255] ^ ((iArr3[bArr3[i28 >>> 24] & 255] ^ iArr4[bArr3[(i28 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i28 >>> 8) & 255] & 255]);
            int i30 = i27 + 1;
            int i31 = iArr[i27];
            int i32 = i29 + 1;
            iArr2[i29] = iArr6[bArr3[i31 & 255] & 255] ^ ((iArr3[bArr3[i31 >>> 24] & 255] ^ iArr4[bArr3[(i31 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i31 >>> 8) & 255] & 255]);
            int i33 = iArr[i30];
            i3 = i32 + 1;
            iArr2[i32] = iArr6[bArr3[i33 & 255] & 255] ^ ((iArr3[bArr3[i33 >>> 24] & 255] ^ iArr4[bArr3[(i33 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i33 >>> 8) & 255] & 255]);
            i19 = i30 - 7;
        }
        int i34 = i3 + 1;
        int i35 = i19 + 1;
        iArr2[i3] = iArr[i19];
        int i36 = i34 + 1;
        int i37 = i35 + 1;
        iArr2[i34] = iArr[i35];
        iArr2[i36] = iArr[i37];
        iArr2[i36 + 1] = iArr[i37 + 1];
        return iArr2;
    }

    public static byte[][] getMonetizationNetwork(int i2) {
        byte[][] bArr = new byte[4][];
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = i2 >>> (i3 << 3);
            bArr[i3] = new byte[]{(byte) (i4 & 3), (byte) ((i4 >> 2) & 3), (byte) ((i4 >> 4) & 3), (byte) ((i4 >> 6) & 3)};
        }
        return bArr;
    }
}
