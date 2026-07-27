package N1;

import java.io.FilterInputStream;

/* loaded from: classes.dex */
public final class m extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public int f1971n;

    public m(e eVar) {
        super(eVar);
        this.f1971n = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f1971n;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long g(long j9) {
        int i = this.f1971n;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j9 <= ((long) i)) ? j9 : i;
    }

    public final void j(long j9) {
        int i = this.f1971n;
        if (i == Integer.MIN_VALUE || j9 == -1) {
            return;
        }
        this.f1971n = (int) (i - j9);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f1971n = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (g(1L) == -1) {
            return -1;
        }
        int read = super.read();
        j(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f1971n = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j9) {
        long g9 = g(j9);
        if (g9 == -1) {
            return 0L;
        }
        long skip = super.skip(g9);
        j(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        int g9 = (int) g(i4);
        if (g9 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, g9);
        j(read);
        return read;
    }
}
