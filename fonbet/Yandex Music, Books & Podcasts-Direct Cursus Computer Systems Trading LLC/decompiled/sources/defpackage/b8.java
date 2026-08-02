package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class b8 extends FilterInputStream {
    public final /* synthetic */ int a = 0;
    public int b;

    public b8(bob bobVar) {
        super(bobVar);
        this.b = Integer.MIN_VALUE;
    }

    public long a(long j) {
        int i = this.b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                return Math.min(super.available(), this.b);
            default:
                int i = this.b;
                return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
        }
    }

    public void b(long j) {
        int i = this.b;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.b = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 1:
                synchronized (this) {
                    super.mark(i);
                    this.b = i;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read < 0) {
                    return read;
                }
                this.b--;
                return read;
            default:
                if (a(1L) == -1) {
                    return -1;
                }
                int read2 = super.read();
                b(1L);
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.a) {
            case 1:
                synchronized (this) {
                    super.reset();
                    this.b = Integer.MIN_VALUE;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        switch (this.a) {
            case 0:
                int skip = (int) super.skip(Math.min(j, this.b));
                if (skip >= 0) {
                    this.b -= skip;
                }
                return skip;
            default:
                long a = a(j);
                if (a == -1) {
                    return 0L;
                }
                long skip2 = super.skip(a);
                b(skip2);
                return skip2;
        }
    }

    public b8(int i, InputStream inputStream) {
        super(inputStream);
        this.b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                int i3 = this.b;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read < 0) {
                    return read;
                }
                this.b -= read;
                return read;
            default:
                int a = (int) a(i2);
                if (a == -1) {
                    return -1;
                }
                int read2 = super.read(bArr, i, a);
                b(read2);
                return read2;
        }
    }
}
