package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class get extends FilterInputStream {
    private final int ThreeDS2Service;
    private byte[] ThreeDS2ServiceInitializationCallback;
    private final int ThreeDS2ServiceInstance;
    private int cleanup;
    private short createTransaction;
    private long[] get;
    private int getParamValue;
    private long[] getSDKInfo;
    private int getSDKVersion;
    private final int getWarnings;
    private int initialize;

    public get(InputStream inputStream, int i, int i2, short s, int i3, int i4, int i5, int i6) {
        super(new BufferedInputStream(inputStream, 4096));
        this.initialize = 1;
        this.cleanup = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.ThreeDS2ServiceInstance = min;
        this.ThreeDS2ServiceInitializationCallback = new byte[min];
        this.get = new long[4];
        this.getSDKInfo = new long[4];
        this.getSDKVersion = min;
        this.getParamValue = min;
        this.get = ThreeDS2ServiceInstance.initialize(i ^ i4, min ^ i4);
        this.getSDKInfo = ThreeDS2ServiceInstance.initialize(i2 ^ i4, i3 ^ i4);
        this.ThreeDS2Service = i5;
        this.getWarnings = i6;
    }

    private int ThreeDS2Service() {
        if (this.cleanup == Integer.MAX_VALUE) {
            this.cleanup = ((FilterInputStream) this).in.read();
        }
        if (this.getSDKVersion == this.ThreeDS2ServiceInstance) {
            byte[] bArr = this.ThreeDS2ServiceInitializationCallback;
            int i = this.cleanup;
            bArr[0] = (byte) i;
            if (i < 0) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.ThreeDS2ServiceInitializationCallback, i2, this.ThreeDS2ServiceInstance - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < this.ThreeDS2ServiceInstance);
            if (i2 < this.ThreeDS2ServiceInstance) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected block size");
                return 0;
            }
            int i3 = this.ThreeDS2Service;
            if (i3 == this.getWarnings) {
                ThreeDS2ServiceInstance();
            } else {
                if (this.initialize <= i3) {
                    ThreeDS2ServiceInstance();
                }
                initialize();
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.cleanup = read2;
            this.getSDKVersion = 0;
            int i4 = this.ThreeDS2ServiceInstance;
            if (read2 < 0) {
                i4 -= this.ThreeDS2ServiceInitializationCallback[i4 - 1] & 255;
            }
            this.getParamValue = i4;
        }
        return this.getParamValue;
    }

    private void ThreeDS2ServiceInstance() {
        ThreeDS2ServiceInstance.ThreeDS2Service(this.get, this.getSDKInfo, this.createTransaction);
        for (int i = 0; i < this.ThreeDS2ServiceInstance; i++) {
            this.ThreeDS2ServiceInitializationCallback[i] = (byte) (r1[i] ^ ((this.get[this.createTransaction] >> (i * 8)) & 255));
        }
        this.createTransaction = (short) ((this.createTransaction + 1) % 4);
    }

    private void initialize() {
        int i = this.initialize;
        if (i < this.getWarnings) {
            this.initialize = i + 1;
        } else {
            this.initialize = 1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        ThreeDS2Service();
        return this.getParamValue - this.getSDKVersion;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            ThreeDS2Service();
            int i5 = this.getSDKVersion;
            if (i5 >= this.getParamValue) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.ThreeDS2ServiceInitializationCallback;
            this.getSDKVersion = i5 + 1;
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
        ThreeDS2Service();
        int i = this.getSDKVersion;
        if (i >= this.getParamValue) {
            return -1;
        }
        byte[] bArr = this.ThreeDS2ServiceInitializationCallback;
        this.getSDKVersion = i + 1;
        return bArr[i] & 255;
    }

    public get(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        this(inputStream, i, i2, s, i3, i4, 100, 100);
    }
}
