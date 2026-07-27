package N1;

import java.io.FilterInputStream;

/* loaded from: classes.dex */
public final class m extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public int f1927n;

    public m(e eVar) {
        super(eVar);
        this.f1927n = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f1927n;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long j(long j6) {
        int i = this.f1927n;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j6 <= ((long) i)) ? j6 : i;
    }

    public final void k(long j6) {
        int i = this.f1927n;
        if (i == Integer.MIN_VALUE || j6 == -1) {
            return;
        }
        this.f1927n = (int) (i - j6);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f1927n = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (j(1L) == -1) {
            return -1;
        }
        int read = super.read();
        k(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f1927n = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) {
        long j9 = j(j6);
        if (j9 == -1) {
            return 0L;
        }
        long skip = super.skip(j9);
        k(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) {
        int j6 = (int) j(i6);
        if (j6 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, j6);
        k(read);
        return read;
    }
}
