package X;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m extends OutputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3515n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3516u;

    public m(y8.p pVar) {
        this.f3516u = pVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3515n) {
            case 0:
                break;
            default:
                ((y8.p) this.f3516u).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f3515n) {
            case 0:
                ((FileOutputStream) this.f3516u).flush();
                break;
            default:
                y8.p pVar = (y8.p) this.f3516u;
                if (!pVar.f41979v) {
                    pVar.flush();
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f3515n) {
            case 1:
                return ((y8.p) this.f3516u) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f3515n) {
            case 0:
                ((FileOutputStream) this.f3516u).write(i);
                return;
            default:
                y8.p pVar = (y8.p) this.f3516u;
                if (pVar.f41979v) {
                    throw new IOException("closed");
                }
                pVar.f41978u.X((byte) i);
                pVar.b();
                return;
        }
    }

    public m(FileOutputStream fileOutputStream) {
        this.f3516u = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i, int i6) {
        switch (this.f3515n) {
            case 0:
                kotlin.jvm.internal.h.e(bytes, "bytes");
                ((FileOutputStream) this.f3516u).write(bytes, i, i6);
                return;
            default:
                kotlin.jvm.internal.h.e(bytes, "data");
                y8.p pVar = (y8.p) this.f3516u;
                if (!pVar.f41979v) {
                    pVar.f41978u.V(bytes, i, i6);
                    pVar.b();
                    return;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b9) {
        switch (this.f3515n) {
            case 0:
                kotlin.jvm.internal.h.e(b9, "b");
                ((FileOutputStream) this.f3516u).write(b9);
                break;
            default:
                super.write(b9);
                break;
        }
    }

    private final void b() {
    }
}
