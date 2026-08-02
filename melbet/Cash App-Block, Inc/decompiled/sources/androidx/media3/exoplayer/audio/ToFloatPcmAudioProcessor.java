package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ToFloatPcmAudioProcessor extends BaseAudioProcessor {
    public static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(Float.NaN);

    public static void writePcm32BitFloat(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == FLOAT_NAN_AS_INT) {
            floatToIntBits = Float.floatToIntBits(RecyclerView.DECELERATION_RATE);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        int i = audioFormat.f872encoding;
        if (Util.isEncodingHighResolutionPcm(i) || i == 2) {
            return i != 4 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer replaceOutputBuffer;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.inputAudioFormat.f872encoding;
        if (i2 == 2) {
            replaceOutputBuffer = replaceOutputBuffer(i * 2);
            while (position < limit) {
                writePcm32BitFloat(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), replaceOutputBuffer);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            replaceOutputBuffer = replaceOutputBuffer((i / 3) * 4);
            while (position < limit) {
                writePcm32BitFloat(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), replaceOutputBuffer);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            replaceOutputBuffer = replaceOutputBuffer(i);
            while (position < limit) {
                writePcm32BitFloat((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), replaceOutputBuffer);
                position += 4;
            }
        } else if (i2 == 1879048192) {
            replaceOutputBuffer = replaceOutputBuffer(i / 2);
            while (position < limit) {
                replaceOutputBuffer.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i2 == 21) {
            replaceOutputBuffer = replaceOutputBuffer((i / 3) * 4);
            while (position < limit) {
                writePcm32BitFloat(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), replaceOutputBuffer);
                position += 3;
            }
        } else {
            if (i2 != 22) {
                Path$$ExternalSyntheticBUOutline0.m();
                return;
            }
            replaceOutputBuffer = replaceOutputBuffer(i);
            while (position < limit) {
                writePcm32BitFloat((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), replaceOutputBuffer);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
    }
}
