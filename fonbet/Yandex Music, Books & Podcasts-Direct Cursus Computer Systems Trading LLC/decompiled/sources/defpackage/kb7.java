package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class kb7 extends InputStream {
    public final db7 a;
    public final nb7 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public kb7(db7 db7Var, nb7 nb7Var) {
        this.a = db7Var;
        this.b = nb7Var;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.a(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        vq1.A(!this.e);
        a();
        int read = this.a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
