package F;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f531a;

    public m0(FileOutputStream fileOutputStream) {
        this.f531a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f531a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f531a.write(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b2) {
        kotlin.jvm.internal.i.e(b2, "b");
        this.f531a.write(b2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i2, int i3) {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        this.f531a.write(bytes, i2, i3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
