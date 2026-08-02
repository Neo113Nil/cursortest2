package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class uvt extends InputStream {
    public volatile boolean a;

    public final void a() {
        if (this.a) {
            kac.f("Stream closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        a();
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int length = bArr.length;
        if (i >= 0 && i2 >= 0 && length >= 0 && i <= length - i2) {
            if (i2 == 0) {
                return 0;
            }
            a();
            return -1;
        }
        StringBuilder l = dfi.l("Range [", i, i, ", ", " + ");
        l.append(i2);
        l.append(") out of bounds for length ");
        l.append(length);
        throw new IndexOutOfBoundsException(l.toString());
    }

    @Override // java.io.InputStream
    public final byte[] readAllBytes() {
        a();
        return new byte[0];
    }

    @Override // java.io.InputStream
    public final int readNBytes(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int length = bArr.length;
        if (i >= 0 && i2 >= 0 && length >= 0 && i <= length - i2) {
            a();
            return 0;
        }
        StringBuilder l = dfi.l("Range [", i, i, ", ", " + ");
        l.append(i2);
        l.append(") out of bounds for length ");
        l.append(length);
        throw new IndexOutOfBoundsException(l.toString());
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        a();
        return 0L;
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) {
        outputStream.getClass();
        Objects.requireNonNull(outputStream);
        a();
        return 0L;
    }

    @Override // java.io.InputStream
    public final byte[] readNBytes(int i) {
        if (i >= 0) {
            a();
            return new byte[0];
        }
        xq0.x("len < 0");
        return null;
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        return -1;
    }
}
