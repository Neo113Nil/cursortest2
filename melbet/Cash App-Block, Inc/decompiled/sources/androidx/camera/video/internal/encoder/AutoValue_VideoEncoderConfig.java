package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.core.impl.Timebase;
import androidx.media3.common.util.StuckPlayerDetector;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_VideoEncoderConfig implements EncoderConfig {
    public final int IFrameInterval;
    public final int bitrate;
    public final int captureFrameRate;
    public final int colorFormat;
    public final AutoValue_VideoEncoderDataSpace dataSpace;
    public final int encodeFrameRate;
    public final Timebase inputTimebase;
    public final String mimeType;
    public final int profile;
    public final Size resolution;

    public AutoValue_VideoEncoderConfig(String str, int i, Timebase timebase, Size size, int i2, AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace, int i3, int i4, int i5, int i6) {
        this.mimeType = str;
        this.profile = i;
        this.inputTimebase = timebase;
        this.resolution = size;
        this.colorFormat = i2;
        this.dataSpace = autoValue_VideoEncoderDataSpace;
        this.captureFrameRate = i3;
        this.encodeFrameRate = i4;
        this.IFrameInterval = i5;
        this.bitrate = i6;
    }

    public static StuckPlayerDetector builder() {
        StuckPlayerDetector stuckPlayerDetector = new StuckPlayerDetector();
        stuckPlayerDetector.playerListener = -1;
        stuckPlayerDetector.stuckPlayingNotEndingDetector = 1;
        stuckPlayerDetector.period = 2130708361;
        stuckPlayerDetector.handler = AutoValue_VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
        return stuckPlayerDetector;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_VideoEncoderConfig) {
            AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = (AutoValue_VideoEncoderConfig) obj;
            if (this.mimeType.equals(autoValue_VideoEncoderConfig.mimeType) && this.profile == autoValue_VideoEncoderConfig.profile && this.inputTimebase.equals(autoValue_VideoEncoderConfig.inputTimebase) && this.resolution.equals(autoValue_VideoEncoderConfig.resolution) && this.colorFormat == autoValue_VideoEncoderConfig.colorFormat && this.dataSpace.equals(autoValue_VideoEncoderConfig.dataSpace) && this.captureFrameRate == autoValue_VideoEncoderConfig.captureFrameRate && this.encodeFrameRate == autoValue_VideoEncoderConfig.encodeFrameRate && this.IFrameInterval == autoValue_VideoEncoderConfig.IFrameInterval && this.bitrate == autoValue_VideoEncoderConfig.bitrate) {
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
        return this.bitrate ^ ((((((((((((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003) ^ this.inputTimebase.hashCode()) * 1000003) ^ this.resolution.hashCode()) * 1000003) ^ this.colorFormat) * 1000003) ^ this.dataSpace.hashCode()) * 1000003) ^ this.captureFrameRate) * 1000003) ^ this.encodeFrameRate) * 1000003) ^ this.IFrameInterval) * 1000003);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final MediaFormat toMediaFormat() {
        Size size = this.resolution;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.mimeType, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", this.colorFormat);
        createVideoFormat.setInteger("bitrate", this.bitrate);
        int i = this.encodeFrameRate;
        createVideoFormat.setInteger("frame-rate", i);
        int i2 = this.captureFrameRate;
        if (i2 > i) {
            createVideoFormat.setInteger("capture-rate", i2);
            createVideoFormat.setInteger("operating-rate", i2);
            createVideoFormat.setInteger("priority", 0);
        }
        createVideoFormat.setInteger("i-frame-interval", this.IFrameInterval);
        int i3 = this.profile;
        if (i3 != -1) {
            createVideoFormat.setInteger("profile", i3);
        }
        AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace = this.dataSpace;
        int i4 = autoValue_VideoEncoderDataSpace.standard;
        if (i4 != 0) {
            createVideoFormat.setInteger("color-standard", i4);
        }
        int i5 = autoValue_VideoEncoderDataSpace.transfer;
        if (i5 != 0) {
            createVideoFormat.setInteger("color-transfer", i5);
        }
        int i6 = autoValue_VideoEncoderDataSpace.range;
        if (i6 != 0) {
            createVideoFormat.setInteger("color-range", i6);
        }
        return createVideoFormat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.mimeType);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", inputTimebase=");
        sb.append(this.inputTimebase);
        sb.append(", resolution=");
        sb.append(this.resolution);
        sb.append(", colorFormat=");
        sb.append(this.colorFormat);
        sb.append(", dataSpace=");
        sb.append(this.dataSpace);
        sb.append(", captureFrameRate=");
        sb.append(this.captureFrameRate);
        sb.append(", encodeFrameRate=");
        sb.append(this.encodeFrameRate);
        sb.append(", IFrameInterval=");
        sb.append(this.IFrameInterval);
        sb.append(", bitrate=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bitrate, "}", sb);
    }
}
