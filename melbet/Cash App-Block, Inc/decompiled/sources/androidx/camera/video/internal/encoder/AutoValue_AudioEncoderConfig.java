package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.core.impl.Timebase;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_AudioEncoderConfig implements EncoderConfig {
    public final int bitrate;
    public final int captureSampleRate;
    public final int channelCount;
    public final int encodeSampleRate;
    public final Timebase inputTimebase;
    public final String mimeType;
    public final int profile;

    public AutoValue_AudioEncoderConfig(String str, int i, Timebase timebase, int i2, int i3, int i4, int i5) {
        this.mimeType = str;
        this.profile = i;
        this.inputTimebase = timebase;
        this.bitrate = i2;
        this.captureSampleRate = i3;
        this.encodeSampleRate = i4;
        this.channelCount = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_AudioEncoderConfig) {
            AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig = (AutoValue_AudioEncoderConfig) obj;
            if (this.mimeType.equals(autoValue_AudioEncoderConfig.mimeType) && this.profile == autoValue_AudioEncoderConfig.profile && this.inputTimebase.equals(autoValue_AudioEncoderConfig.inputTimebase) && this.bitrate == autoValue_AudioEncoderConfig.bitrate && this.captureSampleRate == autoValue_AudioEncoderConfig.captureSampleRate && this.encodeSampleRate == autoValue_AudioEncoderConfig.encodeSampleRate && this.channelCount == autoValue_AudioEncoderConfig.channelCount) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final Timebase getInputTimebase() {
        return this.inputTimebase;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final String getMimeType() {
        return this.mimeType;
    }

    public final int hashCode() {
        return this.channelCount ^ ((((((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003) ^ this.inputTimebase.hashCode()) * 1000003) ^ this.bitrate) * 1000003) ^ this.captureSampleRate) * 1000003) ^ this.encodeSampleRate) * 1000003);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final MediaFormat toMediaFormat() {
        int i = this.encodeSampleRate;
        int i2 = this.channelCount;
        String str = this.mimeType;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
        createAudioFormat.setInteger("bitrate", this.bitrate);
        int i3 = this.profile;
        if (i3 != -1) {
            if (str.equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", i3);
                return createAudioFormat;
            }
            createAudioFormat.setInteger("profile", i3);
        }
        return createAudioFormat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.mimeType);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", inputTimebase=");
        sb.append(this.inputTimebase);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", captureSampleRate=");
        sb.append(this.captureSampleRate);
        sb.append(", encodeSampleRate=");
        sb.append(this.encodeSampleRate);
        sb.append(", channelCount=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.channelCount, "}", sb);
    }
}
