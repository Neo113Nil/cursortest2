package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class VideoDecoder$ByteBufferInitializer$1 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer val$data;

    public VideoDecoder$ByteBufferInitializer$1(ByteBuffer byteBuffer) {
        this.val$data = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.val$data.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.val$data;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }
}
