package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private int AFInAppEventParameterName;
    private final byte[][] areAllFieldsValid;
    private final byte[] component1;
    private final int component2;
    private final int[] component3;
    private final int[] component4;
    private int copy;
    private int copydefault;
    private final byte[] equals;
    private final int hashCode;
    private final int toString;
    private int values;
    private static final byte[] getMediationNetwork = AFk1uSDK.getRevenue;
    private static final int[] getRevenue = AFk1uSDK.getMonetizationNetwork;
    private static final int[] AFAdRevenueData = AFk1uSDK.getCurrencyIso4217Code;
    private static final int[] getMonetizationNetwork = AFk1uSDK.getMediationNetwork;
    private static final int[] getCurrencyIso4217Code = AFk1uSDK.AFAdRevenueData;

    public AFk1tSDK(InputStream inputStream, int i2, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i2, bArr, bArr2, (byte) 0);
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component3;
        char c2 = 1;
        int i2 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component4;
        iArr[0] = i2 ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i3 = 4;
        int i4 = 1;
        while (i4 < this.component2) {
            int[] iArr3 = getRevenue;
            int[] iArr4 = this.component3;
            byte[][] bArr3 = this.areAllFieldsValid;
            byte[] bArr4 = bArr3[0];
            int i5 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFAdRevenueData;
            byte[] bArr5 = bArr3[c2];
            int i6 = i5 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getMonetizationNetwork;
            byte[] bArr6 = bArr3[2];
            int i7 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i6;
            int[] iArr7 = getCurrencyIso4217Code;
            byte[] bArr7 = bArr3[3];
            int i8 = iArr7[iArr4[bArr7[0]] & 255] ^ i7;
            int[] iArr8 = this.component4;
            int i9 = i8 ^ iArr8[i3];
            int i10 = ((iArr6[(iArr4[bArr6[c2]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c2]] >>> 24] ^ iArr5[(iArr4[bArr5[c2]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c2]] & 255]) ^ iArr8[i3 + 1];
            int i11 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i3 + 2];
            int i12 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i3 + 3];
            iArr4[0] = i9;
            iArr4[1] = i10;
            iArr4[2] = i11;
            iArr4[3] = i12;
            i4++;
            i3 += 4;
            c2 = 1;
        }
        int[] iArr9 = this.component4;
        int i13 = iArr9[i3];
        byte[] bArr8 = getMediationNetwork;
        int[] iArr10 = this.component3;
        byte[][] bArr9 = this.areAllFieldsValid;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i13 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i13 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i13 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i13);
        int i14 = iArr9[i3 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i14 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[7] = (byte) (i14 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i15 = iArr9[i3 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i15 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[11] = (byte) (i15 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i16 = iArr9[i3 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i16 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i16 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i16 >>> 8));
        bArr2[15] = (byte) (i16 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private int getMediationNetwork() throws IOException {
        if (this.copydefault == Integer.MAX_VALUE) {
            this.copydefault = ((FilterInputStream) this).in.read();
        }
        if (this.values == 16) {
            byte[] bArr = this.component1;
            int i2 = this.copydefault;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.component1, i3, 16 - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < 16);
            if (i3 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.hashCode;
            if (i5 == this.toString) {
                AFAdRevenueData(this.component1, this.equals);
            } else {
                if (this.copy <= i5) {
                    AFAdRevenueData(this.component1, this.equals);
                } else {
                    byte[] bArr2 = this.component1;
                    System.arraycopy(bArr2, 0, this.equals, 0, bArr2.length);
                }
                int i6 = this.copy;
                if (i6 < this.toString) {
                    this.copy = i6 + 1;
                } else {
                    this.copy = 1;
                }
            }
            int i7 = ((FilterInputStream) this).in.read();
            this.copydefault = i7;
            this.values = 0;
            this.AFInAppEventParameterName = i7 < 0 ? 16 - (this.equals[15] & 255) : 16;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMediationNetwork();
        return this.AFInAppEventParameterName - this.values;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i2 = this.values;
        if (i2 >= this.AFInAppEventParameterName) {
            return -1;
        }
        byte[] bArr = this.equals;
        this.values = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
        }
        return j3;
    }

    private AFk1tSDK(InputStream inputStream, int i2, byte[] bArr, byte[][] bArr2, byte b2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component3 = new int[4];
        this.component1 = new byte[16];
        this.equals = new byte[16];
        this.copy = 1;
        this.copydefault = Integer.MAX_VALUE;
        this.values = 16;
        this.AFInAppEventParameterName = 16;
        this.component2 = i2;
        this.component4 = AFk1uSDK.getMediationNetwork(bArr, i2);
        this.areAllFieldsValid = AFAdRevenueData(bArr2);
        this.hashCode = 100;
        this.toString = 100;
    }

    private static byte[][] AFAdRevenueData(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = new byte[bArr[i2].length];
            int i3 = 0;
            while (true) {
                byte[] bArr3 = bArr[i2];
                if (i3 < bArr3.length) {
                    bArr2[i2][bArr3[i3]] = (byte) i3;
                    i3++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            getMediationNetwork();
            int i6 = this.values;
            if (i6 >= this.AFInAppEventParameterName) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.equals;
            this.values = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i3;
    }
}
