package com.appsflyer.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private long[] AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private int component1;
    private short component2;
    private int component3;
    private long[] component4;
    private int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private int hashCode;

    private AFk1tSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getCurrencyIso4217Code = 1;
        this.component1 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.getMonetizationNetwork = min;
        this.areAllFieldsValid = new byte[min];
        this.AFAdRevenueData = new long[4];
        this.component4 = new long[4];
        this.component3 = min;
        this.hashCode = min;
        this.AFAdRevenueData = AFk1sSDK.getCurrencyIso4217Code(i ^ i4, min ^ i4);
        this.component4 = AFk1sSDK.getCurrencyIso4217Code(i2 ^ i4, i3 ^ i4);
        this.getRevenue = 100;
        this.getMediationNetwork = 100;
    }

    private int AFAdRevenueData() {
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.component3 == this.getMonetizationNetwork) {
            byte[] bArr = this.areAllFieldsValid;
            int i = this.component1;
            bArr[0] = (byte) i;
            if (i < 0) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i2, this.getMonetizationNetwork - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < this.getMonetizationNetwork);
            if (i2 < this.getMonetizationNetwork) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected block size");
                return 0;
            }
            int i3 = this.getRevenue;
            if (i3 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getCurrencyIso4217Code <= i3) {
                    getMonetizationNetwork();
                }
                int i4 = this.getCurrencyIso4217Code;
                if (i4 < this.getMediationNetwork) {
                    this.getCurrencyIso4217Code = i4 + 1;
                } else {
                    this.getCurrencyIso4217Code = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.component3 = 0;
            int i5 = this.getMonetizationNetwork;
            if (read2 < 0) {
                i5 -= this.areAllFieldsValid[i5 - 1] & 255;
            }
            this.hashCode = i5;
        }
        return this.hashCode;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.AFAdRevenueData;
        long[] jArr2 = this.component4;
        short s = this.component2;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.getMonetizationNetwork; i2++) {
            this.areAllFieldsValid[i2] = (byte) (r1[i2] ^ ((this.AFAdRevenueData[this.component2] >> (i2 << 3)) & 255));
        }
        this.component2 = (short) ((this.component2 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFAdRevenueData();
        return this.hashCode - this.component3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFAdRevenueData();
            int i5 = this.component3;
            if (i5 >= this.hashCode) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component3 = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFAdRevenueData();
        int i = this.component3;
        if (i >= this.hashCode) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component3 = i + 1;
        return bArr[i] & 255;
    }

    public AFk1tSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }
}
