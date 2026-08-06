package defpackage;

/* loaded from: classes.dex */
public final class jk1 extends java.io.OutputStream {
    public final java.io.FileOutputStream adDC3e2L;

    public jk1(java.io.FileOutputStream fileOutputStream) {
        this.adDC3e2L = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.adDC3e2L.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
        this.adDC3e2L.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.adDC3e2L.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.adDC3e2L.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
