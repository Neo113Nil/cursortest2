package P1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final long f2354n;

    /* renamed from: u, reason: collision with root package name */
    public int f2355u;

    public d(InputStream inputStream, long j6) {
        super(inputStream);
        this.f2354n = j6;
    }

    public final void a(int i) {
        if (i >= 0) {
            this.f2355u += i;
            return;
        }
        long j6 = this.f2355u;
        long j9 = this.f2354n;
        if (j9 - j6 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j9 + ", but read: " + this.f2355u);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f2354n - this.f2355u, ((FilterInputStream) this).in.available());
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
    public final synchronized int read(byte[] bArr, int i, int i4) {
        int read;
        read = super.read(bArr, i, i4);
        a(read);
        return read;
    }
}
