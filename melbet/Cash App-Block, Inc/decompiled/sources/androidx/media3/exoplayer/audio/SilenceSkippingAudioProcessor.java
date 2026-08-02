package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import java.nio.ByteBuffer;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {
    public int bytesPerFrame;
    public byte[] contiguousOutputBuffer;
    public boolean enabled;
    public byte[] maybeSilenceBuffer;
    public long skippedFrames;
    public int state;
    public int outputSilenceFramesSinceNoise = 0;
    public int maybeSilenceBufferStartIndex = 0;
    public int maybeSilenceBufferContentsSize = 0;
    public final long minimumSilenceDurationUs = 100000;
    public final float silenceRetentionRatio = 0.2f;
    public final long maxSilenceToKeepDurationUs = 2000000;
    public final int minVolumeToKeepPercentageWhenMuting = 10;
    public final short silenceThresholdLevel = 1024;

    public SilenceSkippingAudioProcessor() {
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    public final int calculateShortenedSilenceLength(int i) {
        int length = ((((int) ((this.maxSilenceToKeepDurationUs * this.inputAudioFormat.sampleRate) / 1000000)) - this.outputSilenceFramesSinceNoise) * this.bytesPerFrame) - (this.maybeSilenceBuffer.length / 2);
        Trace.checkState(length >= 0);
        int min = (int) Math.min((i * this.silenceRetentionRatio) + 0.5f, length);
        int i2 = this.bytesPerFrame;
        return (min / i2) * i2;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return super.isActive() && this.enabled;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.f872encoding == 2) {
            return audioFormat.sampleRate == -1 ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onFlush$1() {
        if (isActive()) {
            int i = this.inputAudioFormat.channelCount * 2;
            this.bytesPerFrame = i;
            int i2 = ((((int) ((this.minimumSilenceDurationUs * r0.sampleRate) / 1000000)) / 2) / i) * i * 2;
            if (this.maybeSilenceBuffer.length != i2) {
                this.maybeSilenceBuffer = new byte[i2];
                this.contiguousOutputBuffer = new byte[i2];
            }
        }
        this.state = 0;
        this.skippedFrames = 0L;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onQueueEndOfStream() {
        if (this.maybeSilenceBufferContentsSize > 0) {
            outputShortenedSilenceBuffer(true);
            this.outputSilenceFramesSinceNoise = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onReset() {
        this.enabled = false;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    public final void outputShortenedSilenceBuffer(boolean z) {
        int length;
        int calculateShortenedSilenceLength;
        int i = this.maybeSilenceBufferContentsSize;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i == bArr.length || z) {
            if (this.outputSilenceFramesSinceNoise == 0) {
                if (z) {
                    outputSilence(i, 3);
                    length = i;
                } else {
                    Trace.checkState(i >= bArr.length / 2);
                    length = this.maybeSilenceBuffer.length / 2;
                    outputSilence(length, 0);
                }
                calculateShortenedSilenceLength = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int calculateShortenedSilenceLength2 = calculateShortenedSilenceLength(length2) + (this.maybeSilenceBuffer.length / 2);
                outputSilence(calculateShortenedSilenceLength2, 2);
                calculateShortenedSilenceLength = calculateShortenedSilenceLength2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                calculateShortenedSilenceLength = calculateShortenedSilenceLength(length);
                outputSilence(calculateShortenedSilenceLength, 1);
            }
            Trace.checkState("bytesConsumed is not aligned to frame size: %s", length, length % this.bytesPerFrame == 0);
            Trace.checkState(i >= calculateShortenedSilenceLength);
            this.maybeSilenceBufferContentsSize -= length;
            int i2 = this.maybeSilenceBufferStartIndex + length;
            this.maybeSilenceBufferStartIndex = i2;
            this.maybeSilenceBufferStartIndex = i2 % this.maybeSilenceBuffer.length;
            this.outputSilenceFramesSinceNoise = (calculateShortenedSilenceLength / this.bytesPerFrame) + this.outputSilenceFramesSinceNoise;
            this.skippedFrames += (length - calculateShortenedSilenceLength) / r2;
        }
    }

    public final void outputSilence(int i, int i2) {
        if (i == 0) {
            return;
        }
        Trace.checkArgument(this.maybeSilenceBufferContentsSize >= i);
        int i3 = this.maybeSilenceBufferStartIndex;
        if (i2 == 2) {
            int i4 = this.maybeSilenceBufferContentsSize;
            int i5 = i3 + i4;
            byte[] bArr = this.maybeSilenceBuffer;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.contiguousOutputBuffer, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.contiguousOutputBuffer;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.maybeSilenceBuffer;
            int length2 = bArr3.length;
            byte[] bArr4 = this.contiguousOutputBuffer;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, length3, i - length3);
            }
        }
        Trace.checkArgument("sizeToOutput is not aligned to frame size: %s", i, i % this.bytesPerFrame == 0);
        Trace.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        byte[] bArr5 = this.contiguousOutputBuffer;
        Trace.checkArgument("byteOutput size is not aligned to frame size %s", i, i % this.bytesPerFrame == 0);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & 255);
                int i11 = this.minVolumeToKeepPercentageWhenMuting;
                if (i2 == 0) {
                    i11 = ((((i8 * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) / (i - 1)) * (i11 - 100)) / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) * (100 - i11)) / (i - 1)) / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = Byte.MAX_VALUE;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = Byte.MIN_VALUE;
                } else {
                    bArr5[i8] = (byte) (i12 & 255);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        replaceOutputBuffer(i).put(bArr5, 0, i).flip();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.outputBuffer.hasRemaining()) {
            int i = this.state;
            short s = this.silenceThresholdLevel;
            if (i == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.maybeSilenceBuffer.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i2 = this.bytesPerFrame;
                        position = Boxes$$ExternalSyntheticOutline1.m$1(limit3, i2, i2, i2);
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.state = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    replaceOutputBuffer(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i != 1) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return;
                }
                Trace.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i3 = this.bytesPerFrame;
                        limit = (position2 / i3) * i3;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.maybeSilenceBufferStartIndex;
                int i5 = this.maybeSilenceBufferContentsSize;
                int i6 = i4 + i5;
                byte[] bArr = this.maybeSilenceBuffer;
                if (i6 < bArr.length) {
                    i4 = bArr.length;
                } else {
                    i6 = i5 - (bArr.length - i4);
                }
                int i7 = i4 - i6;
                boolean z = limit < limit4;
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.maybeSilenceBuffer, i6, min);
                int i8 = this.maybeSilenceBufferContentsSize + min;
                this.maybeSilenceBufferContentsSize = i8;
                Trace.checkState(i8 <= this.maybeSilenceBuffer.length);
                boolean z2 = z && position3 < i7;
                outputShortenedSilenceBuffer(z2);
                if (z2) {
                    this.state = 0;
                    this.outputSilenceFramesSinceNoise = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }
}
