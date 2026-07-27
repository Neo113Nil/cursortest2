package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes4.dex */
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFk1xSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        this(inputStream, iArr, bArr, i, false, i2, (byte) 0);
    }

    private AFk1xSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMediationNetwork = 1;
        this.hashCode = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.AFAdRevenueData = min;
        this.component3 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component4 = bArr2;
        this.component2 = new byte[8];
        this.areAllFieldsValid = new int[2];
        this.component1 = 8;
        this.copydefault = 8;
        this.toString = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getCurrencyIso4217Code = new AFj1aSDK(iArr, min, true, false);
        this.getRevenue = 100;
        this.getMonetizationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getRevenue();
        int i = this.component1;
        if (i >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component3;
        this.component1 = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getRevenue();
            int i5 = this.component1;
            if (i5 >= this.copydefault) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.component3;
            this.component1 = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getRevenue();
        return this.copydefault - this.component1;
    }

    private void getMonetizationNetwork() {
        if (this.toString == 2) {
            byte[] bArr = this.component3;
            System.arraycopy(bArr, 0, this.component2, 0, bArr.length);
        }
        byte[] bArr2 = this.component3;
        AFk1ySDK.getRevenue(((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & UByte.MAX_VALUE), ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UByte.MAX_VALUE), false, this.AFAdRevenueData, this.getCurrencyIso4217Code.getRevenue, this.getCurrencyIso4217Code.getMonetizationNetwork, this.areAllFieldsValid);
        int[] iArr = this.areAllFieldsValid;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.component3;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.toString == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.component3;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.component4[i3]);
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
            int i = this.hashCode;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component3, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = this.getRevenue;
            if (i3 == this.getMonetizationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getMediationNetwork <= i3) {
                    getMonetizationNetwork();
                }
                int i4 = this.getMediationNetwork;
                if (i4 < this.getMonetizationNetwork) {
                    this.getMediationNetwork = i4 + 1;
                } else {
                    this.getMediationNetwork = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.hashCode = read2;
            this.component1 = 0;
            this.copydefault = read2 < 0 ? 8 - (this.component3[7] & UByte.MAX_VALUE) : 8;
        }
        return this.copydefault;
    }
}
