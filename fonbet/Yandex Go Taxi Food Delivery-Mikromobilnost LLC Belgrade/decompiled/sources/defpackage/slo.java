package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class slo extends InputStream {
    public final InputStream a;
    public int b = 1073741824;

    public slo(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.a.read();
        if (read == -1) {
            this.b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.a.read(bArr);
        if (read == -1) {
            this.b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read == -1) {
            this.b = 0;
        }
        return read;
    }
}
