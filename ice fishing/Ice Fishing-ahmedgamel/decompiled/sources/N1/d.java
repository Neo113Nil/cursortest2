package N1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final long f1910n;

    /* renamed from: u, reason: collision with root package name */
    public int f1911u;

    public d(InputStream inputStream, long j6) {
        super(inputStream);
        this.f1910n = j6;
    }

    public final void a(int i) {
        if (i >= 0) {
            this.f1911u += i;
            return;
        }
        long j6 = this.f1911u;
        long j9 = this.f1910n;
        if (j9 - j6 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j9 + ", but read: " + this.f1911u);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f1910n - this.f1911u, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i6) {
        int read;
        read = super.read(bArr, i, i6);
        a(read);
        return read;
    }
}
