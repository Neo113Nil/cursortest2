package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class x67 implements y9t0 {
    public final ByteBuffer a;
    public final int b;

    public x67(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.a = slice;
        this.b = slice.capacity();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        ByteBuffer byteBuffer = this.a;
        int position = byteBuffer.position();
        int i = this.b;
        if (position == i) {
            return -1L;
        }
        int position2 = (int) (byteBuffer.position() + j);
        if (position2 <= i) {
            i = position2;
        }
        byteBuffer.limit(i);
        return yp6Var.write(byteBuffer);
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return ydz0.d;
    }
}
