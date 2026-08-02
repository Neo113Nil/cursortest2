package com.bumptech.glide.util;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class ContentLengthInputStream extends FilterInputStream {
    public final long contentLength;
    public int readSoFar;

    public ContentLengthInputStream(InputStream inputStream, long j) {
        super(inputStream);
        this.contentLength = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.contentLength - this.readSoFar, ((FilterInputStream) this).in.available());
    }

    public final void checkReadSoFarOrThrow(int i) {
        int i2 = this.readSoFar;
        if (i >= 0) {
            this.readSoFar = i2 + i;
            return;
        }
        long j = this.contentLength;
        if (j - i2 <= 0) {
            return;
        }
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Failed to read all expected data, expected: ", ", but read: ");
        m1149m.append(this.readSoFar);
        throw new IOException(m1149m.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        checkReadSoFarOrThrow(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        checkReadSoFarOrThrow(read);
        return read;
    }
}
