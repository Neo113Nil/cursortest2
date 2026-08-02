package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class izh extends FilterInputStream {
    public final int a;
    public final qgr b;
    public long c;
    public long d;
    public long e;

    public izh(InputStream inputStream, int i, qgr qgrVar) {
        super(inputStream);
        this.e = -1L;
        this.a = i;
        this.b = qgrVar;
    }

    public final void a() {
        long j = this.d;
        long j2 = this.c;
        if (j > j2) {
            this.b.a(j - j2);
            this.c = this.d;
        }
    }

    public final void b() {
        long j = this.d;
        int i = this.a;
        if (j <= i) {
            return;
        }
        throw sgr.l.i("Decompressed gRPC message exceeds maximum size " + i).b();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.d += skip;
        b();
        a();
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            this.d += read;
        }
        b();
        a();
        return read;
    }
}
