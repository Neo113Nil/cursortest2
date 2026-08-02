package ru.CryptoPro.ssl;

import java.io.IOException;
import java.io.InputStream;
import javax.net.ssl.SSLException;

/* loaded from: classes4.dex */
public class cl_46 extends InputStream {
    public cl_69 a;

    public final void a() {
        this.a.G();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.available();
    }

    public byte[] b(int i) throws IOException {
        int c = c();
        int c2 = c();
        int i2 = (c << 8) | c2;
        if (i2 <= available() && (i2 == 64 || i2 == 128)) {
            byte[] bArr = new byte[i2];
            read(bArr, 0, i2);
            return bArr;
        }
        int i3 = i - 2;
        byte[] bArr2 = new byte[i];
        bArr2[0] = (byte) c;
        bArr2[1] = (byte) c2;
        read(bArr2, 2, i3);
        return bArr2;
    }

    public final int c() {
        e(1);
        return read();
    }

    public final int d() {
        e(2);
        return c() | (c() << 8);
    }

    public final void e(int i) {
        if (i > available()) {
            throw new SSLException("Not enough data to fill declared vector size");
        }
    }

    public byte[] g() throws IOException {
        int d = d();
        e(d);
        byte[] bArr = new byte[d];
        read(bArr, 0, d);
        return bArr;
    }

    public final int k() {
        e(3);
        return c() | (c() << 16) | (c() << 8);
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public final byte[] n() {
        int c = c();
        e(c);
        byte[] bArr = new byte[c];
        read(bArr, 0, c);
        return bArr;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.a.read();
        if (read != -1) {
            return read;
        }
        throw new SSLException("Unexpected end of handshake data");
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.a.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.a.read(bArr, i, i2);
        if (read == i2) {
            return read;
        }
        throw new SSLException("Unexpected end of handshake data");
    }
}
