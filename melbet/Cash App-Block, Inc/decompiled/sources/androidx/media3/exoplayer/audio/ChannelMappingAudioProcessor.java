package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ChannelMappingAudioProcessor extends BaseAudioProcessor {
    public int[] outputChannels;
    public int[] pendingOutputChannels;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        int i = audioFormat.f872encoding;
        int[] iArr = this.pendingOutputChannels;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        int i2 = audioFormat.channelCount;
        if (!Util.isEncodingLinearPcm(i)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", audioFormat);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, iArr.length, i) : AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onFlush$1() {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.outputChannels;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer replaceOutputBuffer = replaceOutputBuffer(((limit - position) / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        while (position < limit) {
            for (int i : iArr) {
                int byteDepth = (Util.getByteDepth(this.inputAudioFormat.f872encoding) * i) + position;
                int i2 = this.inputAudioFormat.f872encoding;
                if (i2 != 2) {
                    if (i2 == 3) {
                        replaceOutputBuffer.put(byteBuffer.get(byteDepth));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            if (i2 != 1879048192) {
                                                JWK$$ExternalSyntheticBUOutline0.m(this.inputAudioFormat.f872encoding, "Unexpected encoding: ");
                                                return;
                                            }
                                            replaceOutputBuffer.putDouble(byteBuffer.getDouble(byteDepth));
                                        }
                                    }
                                }
                            }
                            replaceOutputBuffer.putInt(byteBuffer.getInt(byteDepth));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b = byteBuffer.get(order == byteOrder ? byteDepth : byteDepth + 2);
                        byte b2 = byteBuffer.get(byteDepth + 1);
                        if (byteBuffer.order() == byteOrder) {
                            byteDepth += 2;
                        }
                        int i3 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(byteDepth) << 8) & 65280)) >> 8;
                        Trace.checkArgument("Value out of range of 24-bit integer: %s", Integer.toHexString(i3), (i3 & (-16777216)) == 0 || (i3 & (-8388608)) == -8388608);
                        Trace.checkArgument(replaceOutputBuffer.remaining() >= 3);
                        replaceOutputBuffer.put((byte) (replaceOutputBuffer.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & 255)).put((byte) ((i3 & 65280) >> 8)).put((byte) (replaceOutputBuffer.order() == byteOrder ? i3 & 255 : (i3 & 16711680) >> 16));
                    } else {
                        replaceOutputBuffer.putFloat(byteBuffer.getFloat(byteDepth));
                    }
                }
                replaceOutputBuffer.putShort(byteBuffer.getShort(byteDepth));
            }
            position += this.inputAudioFormat.bytesPerFrame;
        }
        byteBuffer.position(limit);
        replaceOutputBuffer.flip();
    }
}
