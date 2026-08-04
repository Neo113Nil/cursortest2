package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1vSDK extends FilterInputStream {
    private static final short AFAdRevenueData = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getMonetizationNetwork;
    private int getRevenue;
    private int hashCode;
    private int toString;
    private int valueOf;

    public AFk1vSDK(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4) {
        this(inputStream, iArr, i2, bArr, i3, i4, (byte) 0);
    }

    private int getMediationNetwork() throws IOException {
        if (this.areAllFieldsValid == Integer.MAX_VALUE) {
            this.areAllFieldsValid = ((FilterInputStream) this).in.read();
        }
        if (this.getRevenue == 8) {
            byte[] bArr = this.getMediationNetwork;
            int i2 = this.areAllFieldsValid;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.getMediationNetwork, i3, 8 - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < 8);
            if (i3 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.equals;
            if (i5 == this.copydefault) {
                getRevenue();
            } else {
                if (this.valueOf <= i5) {
                    getRevenue();
                }
                int i6 = this.valueOf;
                if (i6 < this.copydefault) {
                    this.valueOf = i6 + 1;
                } else {
                    this.valueOf = 1;
                }
            }
            int i7 = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = i7;
            this.getRevenue = 0;
            this.component2 = i7 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
        }
        return this.component2;
    }

    private void getRevenue() {
        if (this.component4 == 3) {
            byte[] bArr = this.getMediationNetwork;
            System.arraycopy(bArr, 0, this.getCurrencyIso4217Code, 0, bArr.length);
        }
        byte[] bArr2 = this.getMediationNetwork;
        int i2 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i3 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i4 = 0;
        while (true) {
            int i5 = this.component1;
            if (i4 >= i5) {
                break;
            }
            short s = AFAdRevenueData;
            i3 -= ((((i5 - i4) * s) + i2) ^ ((i2 << 4) + this.copy)) ^ ((i2 >>> 5) + this.toString);
            i2 -= (((i3 << 4) + this.component3) ^ (((i5 - i4) * s) + i3)) ^ ((i3 >>> 5) + this.hashCode);
            i4++;
        }
        byte[] bArr3 = this.getMediationNetwork;
        bArr3[0] = (byte) (i2 >> 24);
        bArr3[1] = (byte) (i2 >> 16);
        bArr3[2] = (byte) (i2 >> 8);
        bArr3[3] = (byte) i2;
        bArr3[4] = (byte) (i3 >> 24);
        bArr3[5] = (byte) (i3 >> 16);
        bArr3[6] = (byte) (i3 >> 8);
        bArr3[7] = (byte) i3;
        if (this.component4 == 3) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.getMediationNetwork;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.getMonetizationNetwork[i6]);
            }
            byte[] bArr5 = this.getCurrencyIso4217Code;
            System.arraycopy(bArr5, 0, this.getMonetizationNetwork, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMediationNetwork();
        return this.component2 - this.getRevenue;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i2 = this.getRevenue;
        if (i2 >= this.component2) {
            return -1;
        }
        byte[] bArr = this.getMediationNetwork;
        this.getRevenue = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
        }
        return j3;
    }

    private AFk1vSDK(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4, byte b2) {
        int i5;
        super(new BufferedInputStream(inputStream, 4096));
        this.areAllFieldsValid = Integer.MAX_VALUE;
        this.valueOf = 1;
        this.getMediationNetwork = new byte[8];
        this.getMonetizationNetwork = new byte[8];
        this.getCurrencyIso4217Code = new byte[8];
        this.getRevenue = 8;
        this.component2 = 8;
        this.component1 = Math.min(Math.max(i3, 5), 16);
        this.component4 = i4;
        if (i4 == 3) {
            System.arraycopy(bArr, 0, this.getMonetizationNetwork, 0, 8);
        }
        long j2 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i2 == 0) {
            this.component3 = (int) j2;
            long j3 = j2 >> 3;
            short s = AFAdRevenueData;
            this.hashCode = (int) ((((long) s) * j3) >> 32);
            this.copy = (int) (j2 >> 32);
            i5 = (int) (j3 + ((long) s));
        } else {
            int i6 = (int) j2;
            this.component3 = i6;
            this.hashCode = i6 * i2;
            this.copy = i2 ^ i6;
            i5 = (int) (j2 >> 32);
        }
        this.toString = i5;
        this.equals = 100;
        this.copydefault = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            getMediationNetwork();
            int i6 = this.getRevenue;
            if (i6 >= this.component2) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.getMediationNetwork;
            this.getRevenue = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i3;
    }
}
