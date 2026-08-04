package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1xSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int[] areAllFieldsValid;
    private int component1;
    private byte[] component2;
    private byte[] component3;
    private byte[] component4;
    private int copydefault;
    private AFj1aSDK getCurrencyIso4217Code;
    private int getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private int hashCode;
    private int toString;

    public AFk1xSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z, int i3) {
        this(inputStream, iArr, bArr, i2, false, i3, (byte) 0);
    }

    private void getMonetizationNetwork() {
        if (this.toString == 2) {
            byte[] bArr = this.component3;
            System.arraycopy(bArr, 0, this.component2, 0, bArr.length);
        }
        byte[] bArr2 = this.component3;
        int i2 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i3 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i4 = this.AFAdRevenueData;
        AFj1aSDK aFj1aSDK = this.getCurrencyIso4217Code;
        AFk1ySDK.getRevenue(i2, i3, false, i4, aFj1aSDK.getRevenue, aFj1aSDK.getMonetizationNetwork, this.areAllFieldsValid);
        int[] iArr = this.areAllFieldsValid;
        int i5 = iArr[0];
        int i6 = iArr[1];
        byte[] bArr3 = this.component3;
        bArr3[0] = (byte) (i5 >> 24);
        bArr3[1] = (byte) (i5 >> 16);
        bArr3[2] = (byte) (i5 >> 8);
        bArr3[3] = (byte) i5;
        bArr3[4] = (byte) (i6 >> 24);
        bArr3[5] = (byte) (i6 >> 16);
        bArr3[6] = (byte) (i6 >> 8);
        bArr3[7] = (byte) i6;
        if (this.toString == 2) {
            for (int i7 = 0; i7 < 8; i7++) {
                byte[] bArr4 = this.component3;
                bArr4[i7] = (byte) (bArr4[i7] ^ this.component4[i7]);
            }
            byte[] bArr5 = this.component2;
            System.arraycopy(bArr5, 0, this.component4, 0, bArr5.length);
        }
    }

    private int getRevenue() throws IOException {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.component1 == 8) {
            byte[] bArr = this.component3;
            int i2 = this.hashCode;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.component3, i3, 8 - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < 8);
            if (i3 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.getRevenue;
            if (i5 == this.getMonetizationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getMediationNetwork <= i5) {
                    getMonetizationNetwork();
                }
                int i6 = this.getMediationNetwork;
                if (i6 < this.getMonetizationNetwork) {
                    this.getMediationNetwork = i6 + 1;
                } else {
                    this.getMediationNetwork = 1;
                }
            }
            int i7 = ((FilterInputStream) this).in.read();
            this.hashCode = i7;
            this.component1 = 0;
            this.copydefault = i7 < 0 ? 8 - (this.component3[7] & 255) : 8;
        }
        return this.copydefault;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getRevenue();
        return this.copydefault - this.component1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getRevenue();
        int i2 = this.component1;
        if (i2 >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component3;
        this.component1 = i2 + 1;
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

    private AFk1xSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z, int i3, byte b2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMediationNetwork = 1;
        this.hashCode = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i2, 3), 16);
        this.AFAdRevenueData = iMin;
        this.component3 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component4 = bArr2;
        this.component2 = new byte[8];
        this.areAllFieldsValid = new int[2];
        this.component1 = 8;
        this.copydefault = 8;
        this.toString = i3;
        if (i3 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getCurrencyIso4217Code = new AFj1aSDK(iArr, iMin, true, false);
        this.getRevenue = 100;
        this.getMonetizationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            getRevenue();
            int i6 = this.component1;
            if (i6 >= this.copydefault) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.component3;
            this.component1 = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i3;
    }
}
