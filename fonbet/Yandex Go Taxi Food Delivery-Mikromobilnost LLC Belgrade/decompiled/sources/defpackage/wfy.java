package defpackage;

import java.io.InputStream;

/* loaded from: classes4.dex */
public final class wfy extends InputStream {
    public final InputStream a;
    public final long b;
    public long c;

    public wfy(InputStream inputStream, long j) {
        this.a = inputStream;
        this.b = j;
    }

    public final void a(int i) {
        long j = this.c + i;
        this.c = j;
        long j2 = this.b;
        if (j <= j2) {
            return;
        }
        ny61.v(qv10.k(j2, "InputStream exceeded maximum size ", " bytes"));
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.a.read();
        if (read >= 0) {
            a(1);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read >= 0) {
            a(read);
        }
        return read;
    }
}
