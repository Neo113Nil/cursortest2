package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes15.dex */
public final class rb3 extends OutputStream {
    public final File a;
    public final File b;
    public final FileOutputStream c;

    public rb3(File file, File file2, FileOutputStream fileOutputStream) {
        this.a = file;
        this.b = file2;
        this.c = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.c;
        fileOutputStream.flush();
        fileOutputStream.close();
        if (this.b.renameTo(this.a)) {
            return;
        }
        ny61.v("File writing can't be synchronized");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.c.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.c.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.c.write(bArr, i, i2);
    }
}
