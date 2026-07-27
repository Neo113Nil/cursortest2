package D;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class o0 extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public final FileOutputStream f249f;

    public o0(FileOutputStream fileOutputStream) {
        this.f249f = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f249f.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f249f.write(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        E0.i.e(bArr, "b");
        this.f249f.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        E0.i.e(bArr, "bytes");
        this.f249f.write(bArr, i2, i3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
