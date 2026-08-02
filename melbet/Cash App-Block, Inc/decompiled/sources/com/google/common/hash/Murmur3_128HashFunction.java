package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    public static final /* synthetic */ int $r8$clinit = 0;

    public final class Murmur3_128Hasher {
        public final ByteBuffer buffer = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
        public final int bufferSize = 16;
        public final int chunkSize = 16;
        public long h1 = 0;
        public long h2 = 0;
        public int length = 0;

        public final void munch() {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.flip();
            while (byteBuffer.remaining() >= this.chunkSize) {
                process(byteBuffer);
            }
            byteBuffer.compact();
        }

        public final void process(ByteBuffer byteBuffer) {
            long j = byteBuffer.getLong();
            long j2 = byteBuffer.getLong();
            long rotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.h1;
            this.h1 = rotateLeft;
            long rotateLeft2 = Long.rotateLeft(rotateLeft, 27);
            long j3 = this.h2;
            this.h1 = ((rotateLeft2 + j3) * 5) + 1390208809;
            long rotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
            this.h2 = rotateLeft3;
            this.h2 = ((Long.rotateLeft(rotateLeft3, 31) + this.h1) * 5) + 944331445;
            this.length += 16;
        }

        public final Murmur3_128Hasher putBytes(byte[] bArr) {
            ByteBuffer order = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
            int remaining = order.remaining();
            ByteBuffer byteBuffer = this.buffer;
            if (remaining <= byteBuffer.remaining()) {
                byteBuffer.put(order);
                if (byteBuffer.remaining() < 8) {
                    munch();
                }
                return this;
            }
            int position = this.bufferSize - byteBuffer.position();
            for (int i = 0; i < position; i++) {
                byteBuffer.put(order.get());
            }
            munch();
            while (order.remaining() >= this.chunkSize) {
                process(order);
            }
            byteBuffer.put(order);
            return this;
        }
    }

    static {
        int i = Hashing.$r8$clinit;
    }

    public final boolean equals(Object obj) {
        return obj instanceof Murmur3_128HashFunction;
    }

    public final int hashCode() {
        return Murmur3_128HashFunction.class.hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
