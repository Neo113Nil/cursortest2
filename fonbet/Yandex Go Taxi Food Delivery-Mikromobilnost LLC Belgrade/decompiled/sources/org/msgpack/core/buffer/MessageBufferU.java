package org.msgpack.core.buffer;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class MessageBufferU extends MessageBuffer {
    public final ByteBuffer i;

    public MessageBufferU(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.i = ByteBuffer.wrap(bArr, i, i2).slice();
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final byte b(int i) {
        return this.i.get(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final void c(int i, int i2, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.i;
        try {
            byteBuffer2.position(i);
            byteBuffer2.limit(i + i2);
            byteBuffer.put(byteBuffer2);
        } finally {
            n();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final int d(int i) {
        return this.i.getInt(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final long e(int i) {
        return this.i.getLong(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final short f(int i) {
        return this.i.getShort(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final void h(byte b, int i) {
        this.i.put(i, b);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final void i(int i, int i2, int i3, byte[] bArr) {
        ByteBuffer byteBuffer = this.i;
        try {
            byteBuffer.position(i);
            byteBuffer.put(bArr, i2, i3);
        } finally {
            n();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final void j(int i, int i2) {
        this.i.putInt(i, i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final void k(int i, MessageBuffer messageBuffer, int i2, int i3) {
        ByteBuffer m = messageBuffer.m(i2, i3);
        ByteBuffer byteBuffer = this.i;
        if (m.hasArray()) {
            i(i, m.arrayOffset() + m.position(), i3, m.array());
            m.position(m.position() + i3);
            return;
        }
        int limit = m.limit();
        try {
            m.limit(m.position() + i3);
            byteBuffer.position(i);
            byteBuffer.put(m);
        } finally {
            m.limit(limit);
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final void l(int i, short s) {
        this.i.putShort(i, s);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public final ByteBuffer m(int i, int i2) {
        ByteBuffer byteBuffer = this.i;
        try {
            byteBuffer.position(i);
            byteBuffer.limit(i + i2);
            return byteBuffer.slice();
        } finally {
            n();
        }
    }

    public final void n() {
        ByteBuffer byteBuffer = this.i;
        byteBuffer.position(0);
        byteBuffer.limit(this.c);
    }

    public MessageBufferU(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.i = byteBuffer.slice();
    }

    private MessageBufferU(Object obj, long j, int i, ByteBuffer byteBuffer) {
        super(obj, j, i);
        this.i = byteBuffer;
    }
}
