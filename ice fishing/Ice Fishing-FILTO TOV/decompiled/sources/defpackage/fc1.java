package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fc1 extends OutputStream {
    public final FileOutputStream OOA6hdeuvCS;

    public fc1(FileOutputStream fileOutputStream) {
        this.OOA6hdeuvCS = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.OOA6hdeuvCS.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
        this.OOA6hdeuvCS.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.OOA6hdeuvCS.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.OOA6hdeuvCS.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
