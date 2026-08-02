package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class zoe extends InputStream {
    public final InputStream a;
    public final ByteArrayOutputStream b;

    public zoe(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        this.a = inputStream;
        this.b = byteArrayOutputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.b.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        ByteArrayOutputStream byteArrayOutputStream = this.b;
        if (read == -1) {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return read;
        }
        if (read > 0) {
            byteArrayOutputStream.write(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.a.read();
        ByteArrayOutputStream byteArrayOutputStream = this.b;
        if (read == -1) {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return read;
        }
        byteArrayOutputStream.write(read);
        return read;
    }
}
