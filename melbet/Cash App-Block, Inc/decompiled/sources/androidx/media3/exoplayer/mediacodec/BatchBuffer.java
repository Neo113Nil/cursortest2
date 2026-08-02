package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.tracing.Trace;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class BatchBuffer extends DecoderInputBuffer {
    public long lastSampleTimeUs;
    public int maxSampleCount;
    public int sampleCount;

    public final boolean append(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        Trace.checkArgument(!decoderInputBuffer.getFlag(1073741824));
        Trace.checkArgument(!decoderInputBuffer.getFlag(268435456));
        Trace.checkArgument(!decoderInputBuffer.getFlag(4));
        if (hasSamples()) {
            if (this.sampleCount >= this.maxSampleCount) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.data;
            if (byteBuffer2 != null && (byteBuffer = this.data) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.sampleCount;
        this.sampleCount = i + 1;
        if (i == 0) {
            this.timeUs = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.getFlag(1)) {
                this.flags = 1;
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.data;
        if (byteBuffer3 != null) {
            ensureSpaceForWrite(byteBuffer3.remaining());
            this.data.put(byteBuffer3);
        }
        this.lastSampleTimeUs = decoderInputBuffer.timeUs;
        return true;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer
    public final void clear() {
        super.clear();
        this.sampleCount = 0;
    }

    public final boolean hasSamples() {
        return this.sampleCount > 0;
    }
}
