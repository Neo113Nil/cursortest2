package com.bumptech.glide.util;

import java.io.FilterInputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class MarkEnforcingInputStream extends FilterInputStream {
    public int availableBytes;

    public MarkEnforcingInputStream(ExceptionPassthroughInputStream exceptionPassthroughInputStream) {
        super(exceptionPassthroughInputStream);
        this.availableBytes = PKIFailureInfo.systemUnavail;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.availableBytes;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long getBytesToRead(long j) {
        int i = this.availableBytes;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.availableBytes = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (getBytesToRead(1L) == -1) {
            return -1;
        }
        int read = super.read();
        updateAvailableBytesAfterRead(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.availableBytes = PKIFailureInfo.systemUnavail;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long bytesToRead = getBytesToRead(j);
        if (bytesToRead == -1) {
            return 0L;
        }
        long skip = super.skip(bytesToRead);
        updateAvailableBytesAfterRead(skip);
        return skip;
    }

    public final void updateAvailableBytesAfterRead(long j) {
        int i = this.availableBytes;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.availableBytes = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int bytesToRead = (int) getBytesToRead(i2);
        if (bytesToRead == -1) {
            return -1;
        }
        int read = super.read(bArr, i, bytesToRead);
        updateAvailableBytesAfterRead(read);
        return read;
    }
}
