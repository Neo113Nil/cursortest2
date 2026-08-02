package androidx.media3.decoder;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class DecoderInputBuffer extends Buffer {
    public final int bufferReplacementMode;
    public final CryptoInfo cryptoInfo;
    public ByteBuffer data;

    /* renamed from: format, reason: collision with root package name */
    public Format f875format;
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    public final class InsufficientCapacityException extends IllegalStateException {
    }

    static {
        MediaLibraryInfo.registerModule("media3.decoder");
    }

    public DecoderInputBuffer(int i) {
        super((byte) 0, 0);
        this.cryptoInfo = new CryptoInfo();
        this.bufferReplacementMode = i;
    }

    public void clear() {
        this.flags = 0;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }

    public final ByteBuffer createReplacementByteBuffer(int i) {
        int i2 = this.bufferReplacementMode;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.data;
        throw new InsufficientCapacityException(Recorder$$ExternalSyntheticOutline2.m(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }

    public final void ensureSpaceForWrite(int i) {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.data = byteBuffer;
            return;
        }
        ByteBuffer createReplacementByteBuffer = createReplacementByteBuffer(i2);
        createReplacementByteBuffer.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            createReplacementByteBuffer.put(byteBuffer);
        }
        this.data = createReplacementByteBuffer;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
