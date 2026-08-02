package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class ByteBufferRewinder implements DefaultImageHeaderParser.Reader, DataRewinder {
    public final ByteBuffer buffer;

    public ByteBufferRewinder(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
    public int getUInt16() {
        return getUInt8() | (getUInt8() << 8);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
    public short getUInt8() {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser.Reader.EndOfFileException();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
    public int read(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.buffer;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public Object rewindAndGet() {
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
    public long skip(long j) {
        ByteBuffer byteBuffer = this.buffer;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }
}
