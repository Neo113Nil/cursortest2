package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class getWarnings extends FilterInputStream {
    private int ConfigParameters;
    private ThreeDS2Service ThreeDS2Service;
    private int[] ThreeDS2ServiceInitializationCallback;
    private final int ThreeDS2ServiceInstance;
    private int addParam;
    private byte[] cleanup;
    private byte[] createTransaction;
    private int get;
    private int getSDKInfo;
    private byte[] getSDKVersion;
    private final int getWarnings;
    private final int initialize;
    private int onError;

    public getWarnings(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2, int i3, int i4) {
        super(new BufferedInputStream(inputStream, 4096));
        this.get = 1;
        this.onError = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.getWarnings = min;
        this.getSDKVersion = new byte[8];
        byte[] bArr2 = new byte[8];
        this.createTransaction = bArr2;
        this.cleanup = new byte[8];
        this.ThreeDS2ServiceInitializationCallback = new int[2];
        this.getSDKInfo = 8;
        this.addParam = 8;
        this.ConfigParameters = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.ThreeDS2Service = new ThreeDS2Service(iArr, min, true, z);
        this.initialize = i3;
        this.ThreeDS2ServiceInstance = i4;
    }

    private void ThreeDS2Service() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.getSDKVersion;
            bArr[i] = (byte) (bArr[i] ^ this.createTransaction[i]);
        }
    }

    private void ThreeDS2ServiceInstance() {
        if (this.ConfigParameters == 2) {
            byte[] bArr = this.getSDKVersion;
            System.arraycopy(bArr, 0, this.cleanup, 0, bArr.length);
        }
        byte[] bArr2 = this.getSDKVersion;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = this.getWarnings;
        ThreeDS2Service threeDS2Service = this.ThreeDS2Service;
        initialize.ThreeDS2ServiceInstance(i, i2, false, i3, threeDS2Service.initialize, threeDS2Service.getWarnings, this.ThreeDS2ServiceInitializationCallback);
        int[] iArr = this.ThreeDS2ServiceInitializationCallback;
        int i4 = iArr[0];
        int i5 = iArr[1];
        byte[] bArr3 = this.getSDKVersion;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[1] = (byte) (i4 >> 16);
        bArr3[2] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.ConfigParameters == 2) {
            ThreeDS2Service();
            byte[] bArr4 = this.cleanup;
            System.arraycopy(bArr4, 0, this.createTransaction, 0, bArr4.length);
        }
    }

    private int getWarnings() {
        if (this.onError == Integer.MAX_VALUE) {
            this.onError = ((FilterInputStream) this).in.read();
        }
        if (this.getSDKInfo == 8) {
            byte[] bArr = this.getSDKVersion;
            int i = this.onError;
            bArr[0] = (byte) i;
            if (i < 0) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.getSDKVersion, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected block size");
                return 0;
            }
            int i3 = this.initialize;
            if (i3 == this.ThreeDS2ServiceInstance) {
                ThreeDS2ServiceInstance();
            } else {
                if (this.get <= i3) {
                    ThreeDS2ServiceInstance();
                }
                initialize();
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.onError = read2;
            this.getSDKInfo = 0;
            this.addParam = read2 < 0 ? 8 - (this.getSDKVersion[7] & 255) : 8;
        }
        return this.addParam;
    }

    private void initialize() {
        int i = this.get;
        if (i < this.ThreeDS2ServiceInstance) {
            this.get = i + 1;
        } else {
            this.get = 1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        getWarnings();
        return this.addParam - this.getSDKInfo;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getWarnings();
            int i5 = this.getSDKInfo;
            if (i5 >= this.addParam) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.getSDKVersion;
            this.getSDKInfo = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        getWarnings();
        int i = this.getSDKInfo;
        if (i >= this.addParam) {
            return -1;
        }
        byte[] bArr = this.getSDKVersion;
        this.getSDKInfo = i + 1;
        return bArr[i] & 255;
    }

    public getWarnings(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) {
        this(inputStream, iArr, bArr, i, z, i2, 100, 100);
    }
}
