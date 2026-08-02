package defpackage;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class gi3 extends OutputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gi3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        switch (this.a) {
            case 0:
                break;
            default:
                super.flush();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((hi3) this.b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.a) {
            case 0:
                ((hi3) this.b).M0(i);
                break;
            default:
                write(new byte[]{(byte) i}, 0, 1);
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                ((hi3) this.b).write(bArr, i, i2);
                break;
            default:
                ((pzh) this.b).c(bArr, i, i2);
                break;
        }
    }
}
