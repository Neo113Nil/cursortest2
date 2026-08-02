package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class yjn extends InputStream implements cif {
    public w8 a;

    @Override // java.io.InputStream
    public final int available() {
        return this.a.N();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.g();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        w8 w8Var = this.a;
        if (w8Var.N() == 0) {
            return -1;
        }
        int min = Math.min(w8Var.N(), i2);
        w8Var.H(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        w8 w8Var = this.a;
        int min = (int) Math.min(w8Var.N(), j);
        w8Var.P(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read() {
        w8 w8Var = this.a;
        if (w8Var.N() == 0) {
            return -1;
        }
        return w8Var.I();
    }
}
