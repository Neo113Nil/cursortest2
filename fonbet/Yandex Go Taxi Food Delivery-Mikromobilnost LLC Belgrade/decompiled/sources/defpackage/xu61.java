package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public final class xu61 extends InputStream {
    public final FileInputStream a;
    public final FileChannel b;
    public long c;
    public IOException w;

    public xu61(FileInputStream fileInputStream) {
        this.a = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.b = channel;
        this.c = channel.position();
    }

    @Override // java.io.InputStream
    public final int available() {
        IOException iOException = this.w;
        if (iOException == null) {
            return this.a.available();
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (this.w != null) {
            return;
        }
        try {
            this.c = this.b.position();
        } catch (IOException e) {
            this.w = e;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        IOException iOException = this.w;
        if (iOException == null) {
            return this.a.read();
        }
        throw iOException;
    }

    @Override // java.io.InputStream
    public final void reset() {
        if (this.w != null) {
            return;
        }
        try {
            this.b.position(this.c);
        } catch (IOException e) {
            this.w = e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        IOException iOException = this.w;
        if (iOException == null) {
            return this.a.skip(j);
        }
        throw iOException;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        IOException iOException = this.w;
        if (iOException == null) {
            return this.a.read(bArr);
        }
        throw iOException;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        IOException iOException = this.w;
        if (iOException == null) {
            return this.a.read(bArr, i, i2);
        }
        throw iOException;
    }
}
