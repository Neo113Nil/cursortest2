package org.msgpack.core.buffer;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class MessageBufferBE extends MessageBuffer {
    public MessageBufferBE(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final int d(int i) {
        return MessageBuffer.f.getInt(this.a, this.b + i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final long e(int i) {
        return MessageBuffer.f.getLong(this.a, this.b + i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final short f(int i) {
        return MessageBuffer.f.getShort(this.a, this.b + i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final void j(int i, int i2) {
        MessageBuffer.f.putInt(this.a, this.b + i, i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final void l(int i, short s) {
        MessageBuffer.f.putShort(this.a, this.b + i, s);
    }

    public MessageBufferBE(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    private MessageBufferBE(Object obj, long j, int i) {
        super(obj, j, i);
    }
}
