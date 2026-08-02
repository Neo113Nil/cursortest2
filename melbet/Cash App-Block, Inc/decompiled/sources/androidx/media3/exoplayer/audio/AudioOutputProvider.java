package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface AudioOutputProvider {

    public final class ConfigurationException extends Exception {
    }

    public final class FormatSupport {
        public final boolean isFormatSupportedForOffload;
        public final boolean isGaplessSupportedForOffload;
        public final boolean isSpeedChangeSupportedForOffload;
        public final int supportLevel;

        static {
            new LinearLayoutManager.LayoutChunkResult().build();
        }

        public FormatSupport(LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
            this.isFormatSupportedForOffload = layoutChunkResult.mFinished;
            this.isGaplessSupportedForOffload = layoutChunkResult.mIgnoreConsumed;
            this.isSpeedChangeSupportedForOffload = layoutChunkResult.mFocusable;
            this.supportLevel = layoutChunkResult.mConsumed;
        }
    }

    public final class InitializationException extends Exception {
    }

    public final class OutputConfig {
        public final AudioAttributes audioAttributes;
        public final int audioSessionId;
        public final int bufferSize;
        public final int channelMask;

        /* renamed from: encoding, reason: collision with root package name */
        public final int f880encoding;
        public final boolean isOffload;
        public final boolean isTunneling;
        public final int sampleRate;
        public final boolean useOffloadGapless;
        public final boolean usePlaybackParameters;
        public final int virtualDeviceId;

        public final class Builder {
            public AudioAttributes audioAttributes;
            public int audioSessionId;
            public int bufferSize;
            public int channelMask;

            /* renamed from: encoding, reason: collision with root package name */
            public int f881encoding;
            public boolean isOffload;
            public boolean isTunneling;
            public int sampleRate;
            public boolean useOffloadGapless;
            public boolean usePlaybackParameters;
            public int virtualDeviceId;
        }

        public OutputConfig(Builder builder) {
            this.f880encoding = builder.f881encoding;
            this.sampleRate = builder.sampleRate;
            this.channelMask = builder.channelMask;
            this.isTunneling = builder.isTunneling;
            this.isOffload = builder.isOffload;
            this.bufferSize = builder.bufferSize;
            this.audioAttributes = builder.audioAttributes;
            this.audioSessionId = builder.audioSessionId;
            this.virtualDeviceId = builder.virtualDeviceId;
            this.usePlaybackParameters = builder.usePlaybackParameters;
            this.useOffloadGapless = builder.useOffloadGapless;
        }

        public final Builder buildUpon() {
            Builder builder = new Builder();
            builder.f881encoding = this.f880encoding;
            builder.sampleRate = this.sampleRate;
            builder.channelMask = this.channelMask;
            builder.isTunneling = this.isTunneling;
            builder.isOffload = this.isOffload;
            builder.bufferSize = this.bufferSize;
            builder.audioAttributes = this.audioAttributes;
            builder.audioSessionId = this.audioSessionId;
            builder.virtualDeviceId = this.virtualDeviceId;
            builder.usePlaybackParameters = this.usePlaybackParameters;
            builder.useOffloadGapless = this.useOffloadGapless;
            return builder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OutputConfig.class != obj.getClass()) {
                return false;
            }
            OutputConfig outputConfig = (OutputConfig) obj;
            return this.f880encoding == outputConfig.f880encoding && this.sampleRate == outputConfig.sampleRate && this.channelMask == outputConfig.channelMask && this.isTunneling == outputConfig.isTunneling && this.isOffload == outputConfig.isOffload && this.bufferSize == outputConfig.bufferSize && this.audioSessionId == outputConfig.audioSessionId && this.virtualDeviceId == outputConfig.virtualDeviceId && this.usePlaybackParameters == outputConfig.usePlaybackParameters && this.useOffloadGapless == outputConfig.useOffloadGapless && this.audioAttributes.equals(outputConfig.audioAttributes);
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f880encoding), Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelMask), Boolean.valueOf(this.isTunneling), Boolean.valueOf(this.isOffload), Integer.valueOf(this.bufferSize), this.audioAttributes, Integer.valueOf(this.audioSessionId), Integer.valueOf(this.virtualDeviceId), Boolean.valueOf(this.useOffloadGapless), Boolean.valueOf(this.usePlaybackParameters));
        }
    }

    public final class FormatConfig {
        public AudioAttributes audioAttributes;
        public int audioSessionId;
        public boolean enableOffload;
        public boolean enableTunneling;

        /* renamed from: format, reason: collision with root package name */
        public final Format f879format;
        public int preferredBufferSize;
        public AudioDeviceInfo preferredDevice;
        public int virtualDeviceId;

        public FormatConfig(FormatConfig formatConfig) {
            this.f879format = formatConfig.f879format;
            this.audioAttributes = formatConfig.audioAttributes;
            this.preferredDevice = formatConfig.preferredDevice;
            this.enableOffload = formatConfig.enableOffload;
            this.audioSessionId = formatConfig.audioSessionId;
            this.virtualDeviceId = formatConfig.virtualDeviceId;
            this.enableTunneling = formatConfig.enableTunneling;
            this.preferredBufferSize = formatConfig.preferredBufferSize;
        }

        public FormatConfig(Format format2) {
            this.f879format = format2;
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.audioSessionId = 0;
            this.virtualDeviceId = -1;
            this.preferredBufferSize = -1;
        }
    }
}
