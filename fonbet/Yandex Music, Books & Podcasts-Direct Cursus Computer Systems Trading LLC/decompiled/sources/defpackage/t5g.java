package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class t5g extends InputStream {
    public final InputStream a;
    public final long b;
    public long c;

    public t5g(InputStream inputStream, long j) {
        inputStream.getClass();
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
        kac.f(dfi.e(j2, "InputStream exceeded maximum size ", " bytes"));
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int read = this.a.read(bArr, i, i2);
        if (read >= 0) {
            a(read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        bArr.getClass();
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.a.read();
        if (read >= 0) {
            a(1);
        }
        return read;
    }
}
