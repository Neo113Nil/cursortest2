package D1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class F extends MediaDataSource {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f522n;

    public F(ByteBuffer byteBuffer) {
        this.f522n = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f522n.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i, int i4) {
        ByteBuffer byteBuffer = this.f522n;
        if (j6 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j6);
        int min = Math.min(i4, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
