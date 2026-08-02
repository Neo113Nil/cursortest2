package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.Sonic;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class SonicAudioProcessor implements AudioProcessor {
    public ByteBuffer buffer;
    public AudioProcessor.AudioFormat inputAudioFormat;
    public long inputBytes;
    public boolean inputEnded;
    public AudioProcessor.AudioFormat outputAudioFormat;
    public ByteBuffer outputBuffer;
    public long outputBytes;
    public AudioProcessor.AudioFormat pendingInputAudioFormat;
    public AudioProcessor.AudioFormat pendingOutputAudioFormat;
    public int pendingOutputSampleRate;
    public boolean pendingSonicRecreation;
    public float pitch;
    public Sonic sonic;
    public float speed;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) {
        int i = audioFormat.f872encoding;
        if (i != 2 && i != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i2 = this.pendingOutputSampleRate;
        if (i2 == -1) {
            i2 = audioFormat.sampleRate;
        }
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i2, audioFormat.channelCount, i);
        this.pendingOutputAudioFormat = audioFormat2;
        this.pendingSonicRecreation = true;
        return audioFormat2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(AudioProcessor.StreamMetadata streamMetadata) {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.pendingInputAudioFormat;
            this.inputAudioFormat = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.pendingOutputAudioFormat;
            this.outputAudioFormat = audioFormat2;
            if (this.pendingSonicRecreation) {
                this.sonic = new Sonic(audioFormat.sampleRate, audioFormat.channelCount, this.speed, this.pitch, audioFormat2.sampleRate, audioFormat.f872encoding == 4);
            } else {
                Sonic sonic = this.sonic;
                if (sonic != null) {
                    sonic.inputFrameCount = 0;
                    sonic.outputFrameCount = 0;
                    sonic.pitchFrameCount = 0;
                    sonic.oldRatePosition = 0;
                    sonic.newRatePosition = 0;
                    sonic.remainingInputToCopyFrameCount = 0;
                    sonic.prevPeriod = 0;
                    sonic.accumulatedSpeedAdjustmentError = 0.0d;
                    sonic.impl.flush();
                }
            }
        }
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final long getDurationAfterProcessorApplied(long j) {
        if (this.outputBytes < 1024) {
            return (long) (j / this.speed);
        }
        long j2 = this.inputBytes;
        this.sonic.getClass();
        long bytesPerSample = j2 - (r2.impl.bytesPerSample() * (r2.inputFrameCount * r2.channelCount));
        int i = this.outputAudioFormat.sampleRate;
        int i2 = this.inputAudioFormat.sampleRate;
        long j3 = this.outputBytes;
        return i == i2 ? Util.scaleLargeValue(j, j3, bytesPerSample, RoundingMode.DOWN) : Util.scaleLargeValue(j, j3 * i2, bytesPerSample * i, RoundingMode.DOWN);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        Sonic sonic = this.sonic;
        if (sonic != null) {
            Sonic.SonicImpl sonicImpl = sonic.impl;
            int i = sonic.channelCount;
            Trace.checkState(sonic.outputFrameCount >= 0);
            int bytesPerSample = sonicImpl.bytesPerSample() * sonic.outputFrameCount * i;
            if (bytesPerSample > 0) {
                if (this.buffer.capacity() < bytesPerSample) {
                    this.buffer = ByteBuffer.allocateDirect(bytesPerSample).order(ByteOrder.nativeOrder());
                } else {
                    this.buffer.clear();
                }
                ByteBuffer byteBuffer = this.buffer;
                Trace.checkState(sonic.outputFrameCount >= 0);
                int min = Math.min(byteBuffer.remaining() / (sonicImpl.bytesPerSample() * i), sonic.outputFrameCount);
                sonicImpl.copyOutputToByteBuffer(min, byteBuffer);
                sonic.outputFrameCount -= min;
                System.arraycopy(sonicImpl.getOutputBuffer(), min * i, sonicImpl.getOutputBuffer(), 0, sonic.outputFrameCount * i);
                this.buffer.flip();
                this.outputBytes += bytesPerSample;
                this.outputBuffer = this.buffer;
            }
        }
        ByteBuffer byteBuffer2 = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.pendingOutputAudioFormat.sampleRate != -1) {
            return Math.abs(this.speed - 1.0f) >= 1.0E-4f || Math.abs(this.pitch - 1.0f) >= 1.0E-4f || this.pendingOutputAudioFormat.sampleRate != this.pendingInputAudioFormat.sampleRate;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        if (this.inputEnded) {
            Sonic sonic = this.sonic;
            if (sonic != null) {
                Trace.checkState(sonic.outputFrameCount >= 0);
                if (sonic.impl.bytesPerSample() * sonic.outputFrameCount * sonic.channelCount == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        Sonic sonic = this.sonic;
        if (sonic != null) {
            int i = sonic.inputFrameCount;
            float f = sonic.speed;
            float f2 = sonic.pitch;
            double d = f / f2;
            int i2 = sonic.outputFrameCount + ((int) (((((((i - r6) / d) + sonic.remainingInputToCopyFrameCount) + sonic.accumulatedSpeedAdjustmentError) + sonic.pitchFrameCount) / (sonic.rate * f2)) + 0.5d));
            sonic.accumulatedSpeedAdjustmentError = 0.0d;
            Sonic.SonicImpl sonicImpl = sonic.impl;
            int i3 = sonic.maxRequiredFrameCount * 2;
            sonicImpl.ensureAdditionalFramesInInputBuffer(i3 + i);
            sonicImpl.zeroInputBuffer(i * sonic.channelCount, i3);
            sonic.inputFrameCount = i3 + sonic.inputFrameCount;
            sonic.processStreamInput();
            if (sonic.outputFrameCount > i2) {
                sonic.outputFrameCount = Math.max(i2, 0);
            }
            sonic.inputFrameCount = 0;
            sonic.remainingInputToCopyFrameCount = 0;
            sonic.pitchFrameCount = 0;
        }
        this.inputEnded = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic sonic = this.sonic;
            sonic.getClass();
            this.inputBytes += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i = sonic.channelCount;
            Sonic.SonicImpl sonicImpl = sonic.impl;
            int bytesPerSample = remaining / (sonicImpl.bytesPerSample() * i);
            sonicImpl.ensureAdditionalFramesInInputBuffer(bytesPerSample);
            sonicImpl.copyBufferToInputBuffer(remaining, byteBuffer);
            sonic.inputFrameCount += bytesPerSample;
            sonic.processStreamInput();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }
}
