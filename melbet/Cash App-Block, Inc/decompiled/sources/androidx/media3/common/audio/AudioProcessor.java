package androidx.media3.common.audio;

import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public final class AudioFormat {
        public static final AudioFormat NOT_SET = new AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;

        /* renamed from: encoding, reason: collision with root package name */
        public final int f872encoding;
        public final int sampleRate;

        public AudioFormat(int i, int i2, int i3) {
            this.sampleRate = i;
            this.channelCount = i2;
            this.f872encoding = i3;
            this.bytesPerFrame = Util.isEncodingLinearPcm(i3) ? Util.getByteDepth(i3) * i2 : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.f872encoding == audioFormat.f872encoding;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelCount), Integer.valueOf(this.f872encoding));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.sampleRate);
            sb.append(", channelCount=");
            sb.append(this.channelCount);
            sb.append(", encoding=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.f872encoding, ']');
        }
    }

    public final class StreamMetadata {
        public static final StreamMetadata DEFAULT = new StreamMetadata(0);
        public final long positionOffsetUs;

        public StreamMetadata(long j) {
            Trace.checkArgument(j >= 0);
            this.positionOffsetUs = j;
        }
    }

    AudioFormat configure(AudioFormat audioFormat);

    void flush(StreamMetadata streamMetadata);

    default long getDurationAfterProcessorApplied(long j) {
        return j;
    }

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();

    public final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(String str, AudioFormat audioFormat) {
            super(str + " " + audioFormat);
        }

        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }
    }
}
