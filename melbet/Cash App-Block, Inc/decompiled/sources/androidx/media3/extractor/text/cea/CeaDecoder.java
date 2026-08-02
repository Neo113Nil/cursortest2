package androidx.media3.extractor.text.cea;

import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.extractor.text.SimpleSubtitleDecoder$1;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.tracing.Trace;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class CeaDecoder implements SubtitleDecoder {
    public final ArrayDeque availableInputBuffers = new ArrayDeque();
    public final ArrayDeque availableOutputBuffers;
    public CeaInputBuffer dequeuedInputBuffer;
    public long outputStartTimeUs;
    public long playbackPositionUs;
    public long queuedInputBufferCount;
    public final ArrayDeque queuedInputBuffers;

    public final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable {
        public long queuedInputBufferCount;

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) obj;
            if (getFlag(4) != ceaInputBuffer.getFlag(4)) {
                return getFlag(4) ? 1 : -1;
            }
            long j = this.timeUs - ceaInputBuffer.timeUs;
            if (j == 0) {
                j = this.queuedInputBufferCount - ceaInputBuffer.queuedInputBufferCount;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public CeaDecoder() {
        for (int i = 0; i < 10; i++) {
            this.availableInputBuffers.add(new CeaInputBuffer(1));
        }
        this.availableOutputBuffers = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.availableOutputBuffers;
            ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 12);
            SimpleSubtitleDecoder$1 simpleSubtitleDecoder$1 = new SimpleSubtitleDecoder$1();
            simpleSubtitleDecoder$1.this$0 = exoPlayerImplInternal$$ExternalSyntheticLambda2;
            arrayDeque.add(simpleSubtitleDecoder$1);
        }
        this.queuedInputBuffers = new ArrayDeque();
        this.outputStartTimeUs = -9223372036854775807L;
    }

    public abstract Toolbar.AnonymousClass1 createSubtitle();

    public abstract void decode(CeaInputBuffer ceaInputBuffer);

    @Override // androidx.media3.decoder.Decoder
    public final Object dequeueInputBuffer() {
        Trace.checkState(this.dequeuedInputBuffer == null);
        ArrayDeque arrayDeque = this.availableInputBuffers;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque.pollFirst();
        this.dequeuedInputBuffer = ceaInputBuffer;
        return ceaInputBuffer;
    }

    @Override // androidx.media3.decoder.Decoder
    public SimpleSubtitleDecoder$1 dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.availableOutputBuffers;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.queuedInputBuffers;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque2.peek();
            String str = Util.DEVICE_DEBUG_INFO;
            if (ceaInputBuffer.timeUs > this.playbackPositionUs) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer2 = (CeaInputBuffer) arrayDeque2.poll();
            boolean flag = ceaInputBuffer2.getFlag(4);
            ArrayDeque arrayDeque3 = this.availableInputBuffers;
            if (flag) {
                SimpleSubtitleDecoder$1 simpleSubtitleDecoder$1 = (SimpleSubtitleDecoder$1) arrayDeque.pollFirst();
                simpleSubtitleDecoder$1.addFlag(4);
                ceaInputBuffer2.clear();
                arrayDeque3.add(ceaInputBuffer2);
                return simpleSubtitleDecoder$1;
            }
            decode(ceaInputBuffer2);
            if (isNewSubtitleDataAvailable()) {
                Toolbar.AnonymousClass1 createSubtitle = createSubtitle();
                SimpleSubtitleDecoder$1 simpleSubtitleDecoder$12 = (SimpleSubtitleDecoder$1) arrayDeque.pollFirst();
                long j = ceaInputBuffer2.timeUs;
                simpleSubtitleDecoder$12.timeUs = j;
                simpleSubtitleDecoder$12.subtitle = createSubtitle;
                simpleSubtitleDecoder$12.subsampleOffsetUs = j;
                ceaInputBuffer2.clear();
                arrayDeque3.add(ceaInputBuffer2);
                return simpleSubtitleDecoder$12;
            }
            ceaInputBuffer2.clear();
            arrayDeque3.add(ceaInputBuffer2);
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        ArrayDeque arrayDeque;
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.queuedInputBuffers;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.availableInputBuffers;
            if (isEmpty) {
                break;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque2.poll();
            String str = Util.DEVICE_DEBUG_INFO;
            ceaInputBuffer.clear();
            arrayDeque.add(ceaInputBuffer);
        }
        CeaInputBuffer ceaInputBuffer2 = this.dequeuedInputBuffer;
        if (ceaInputBuffer2 != null) {
            ceaInputBuffer2.clear();
            arrayDeque.add(ceaInputBuffer2);
            this.dequeuedInputBuffer = null;
        }
    }

    public abstract boolean isNewSubtitleDataAvailable();

    @Override // androidx.media3.decoder.Decoder
    public final void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) {
        Trace.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) subtitleInputBuffer;
        if (!ceaInputBuffer.getFlag(4)) {
            long j = ceaInputBuffer.timeUs;
            if (j != Long.MIN_VALUE) {
                long j2 = this.outputStartTimeUs;
                if (j2 != -9223372036854775807L && j < j2) {
                    ceaInputBuffer.clear();
                    this.availableInputBuffers.add(ceaInputBuffer);
                    this.dequeuedInputBuffer = null;
                }
            }
        }
        long j3 = this.queuedInputBufferCount;
        this.queuedInputBufferCount = 1 + j3;
        ceaInputBuffer.queuedInputBufferCount = j3;
        this.queuedInputBuffers.add(ceaInputBuffer);
        this.dequeuedInputBuffer = null;
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j) {
        this.outputStartTimeUs = j;
    }

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    public final void setPositionUs(long j) {
        this.playbackPositionUs = j;
    }
}
