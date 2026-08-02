package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class AudioProcessingPipeline {
    public final ImmutableList audioProcessors;
    public boolean inputEnded;
    public final ArrayList activeAudioProcessors = new ArrayList();
    public ByteBuffer[] outputBuffers = new ByteBuffer[0];

    public AudioProcessingPipeline(ImmutableList immutableList) {
        this.audioProcessors = immutableList;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.inputEnded = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        ImmutableList immutableList = ((AudioProcessingPipeline) obj).audioProcessors;
        ImmutableList immutableList2 = this.audioProcessors;
        if (immutableList2.size() != immutableList.size()) {
            return false;
        }
        for (int i = 0; i < immutableList2.size(); i++) {
            if (immutableList2.get(i) != immutableList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void flush() {
        AudioProcessor.StreamMetadata streamMetadata = AudioProcessor.StreamMetadata.DEFAULT;
        ArrayList arrayList = this.activeAudioProcessors;
        arrayList.clear();
        this.inputEnded = false;
        long j = streamMetadata.positionOffsetUs;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.audioProcessors;
            if (i >= immutableList.size()) {
                break;
            }
            AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i);
            audioProcessor.flush(new AudioProcessor.StreamMetadata(j));
            if (audioProcessor.isActive()) {
                j = audioProcessor.getDurationAfterProcessorApplied(j);
                Trace.checkState(j >= 0);
                arrayList.add(audioProcessor);
            }
            i++;
        }
        this.outputBuffers = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= getFinalOutputBufferIndex(); i2++) {
            this.outputBuffers[i2] = ((AudioProcessor) arrayList.get(i2)).getOutput();
        }
    }

    public final int getFinalOutputBufferIndex() {
        return this.outputBuffers.length - 1;
    }

    public final int hashCode() {
        return this.audioProcessors.hashCode();
    }

    public final boolean isEnded() {
        return this.inputEnded && ((AudioProcessor) this.activeAudioProcessors.get(getFinalOutputBufferIndex())).isEnded() && !this.outputBuffers[getFinalOutputBufferIndex()].hasRemaining();
    }

    public final boolean isOperational() {
        return !this.activeAudioProcessors.isEmpty();
    }

    public final void processData(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= getFinalOutputBufferIndex()) {
                if (!this.outputBuffers[i].hasRemaining()) {
                    ArrayList arrayList = this.activeAudioProcessors;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.outputBuffers[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.EMPTY_BUFFER;
                        long remaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.outputBuffers[i] = audioProcessor.getOutput();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.outputBuffers[i].hasRemaining();
                    } else if (!this.outputBuffers[i].hasRemaining() && i < getFinalOutputBufferIndex()) {
                        ((AudioProcessor) arrayList.get(i + 1)).queueEndOfStream();
                    }
                }
                i++;
            }
        }
    }
}
