package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class w8 implements Closeable {
    public abstract void D(ByteBuffer byteBuffer);

    public abstract void H(byte[] bArr, int i, int i2);

    public abstract int I();

    public abstract int N();

    public abstract void P(int i);

    public final void a(int i) {
        if (N() >= i) {
            return;
        }
        rj7.m();
    }

    public boolean g() {
        return this instanceof zjn;
    }

    public abstract w8 o(int i);

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public abstract void z(OutputStream outputStream, int i);

    public void b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
