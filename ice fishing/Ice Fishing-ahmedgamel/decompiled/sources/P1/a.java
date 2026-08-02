package P1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: n, reason: collision with root package name */
    public final ByteBuffer f2350n;

    /* renamed from: u, reason: collision with root package name */
    public int f2351u = -1;

    public a(ByteBuffer byteBuffer) {
        this.f2350n = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2350n.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f2351u = this.f2350n.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f2350n;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f2351u;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f2350n.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        ByteBuffer byteBuffer = this.f2350n;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j6, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        ByteBuffer byteBuffer = this.f2350n;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i4, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }
}
