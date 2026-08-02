package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteBufferInputStream extends InputStream {
    public ByteBuffer a;

    public ByteBufferInputStream(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return byteBuffer.remaining();
        }
        ny61.v("available on a closed InputStream");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a = null;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.a == null) {
            ny61.v("read on a closed InputStream");
            return 0;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            ny61.s();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(this.a.remaining(), i2);
        if (min == 0) {
            return -1;
        }
        this.a.get(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer == null) {
            ny61.v("skip on a closed InputStream");
            return 0L;
        }
        if (j <= 0) {
            return 0L;
        }
        int i = (int) j;
        int min = Math.min(byteBuffer.remaining(), i);
        ByteBuffer byteBuffer2 = this.a;
        byteBuffer2.position(byteBuffer2.position() + min);
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (this.a != null) {
            return read(bArr, 0, bArr.length);
        }
        ny61.v("read on a closed InputStream");
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer == null) {
            ny61.v("read on a closed InputStream");
            return 0;
        }
        if (byteBuffer.remaining() == 0) {
            return -1;
        }
        return this.a.get() & 255;
    }
}
