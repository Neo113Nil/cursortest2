package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.credentials.Credential;

/* loaded from: classes3.dex */
public final class VideoEncoderInfoImpl extends Credential implements VideoEncoderInfo {
    public static final VideoEncoderInfoImpl$$ExternalSyntheticLambda0 FINDER = new VideoEncoderInfoImpl$$ExternalSyntheticLambda0();
    public final MediaCodecInfo.VideoCapabilities videoCapabilities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoEncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        mediaCodecInfo.getClass();
        str.getClass();
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.data).getVideoCapabilities();
        videoCapabilities.getClass();
        this.videoCapabilities = videoCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.videoCapabilities.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedBitrateRange() {
        Range<Integer> bitrateRange = this.videoCapabilities.getBitrateRange();
        bitrateRange.getClass();
        return bitrateRange;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeights() {
        Range<Integer> supportedHeights = this.videoCapabilities.getSupportedHeights();
        supportedHeights.getClass();
        return supportedHeights;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeightsFor(int i) {
        try {
            Range<Integer> supportedHeightsFor = this.videoCapabilities.getSupportedHeightsFor(i);
            supportedHeightsFor.getClass();
            return supportedHeightsFor;
        } finally {
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidths() {
        Range<Integer> supportedWidths = this.videoCapabilities.getSupportedWidths();
        supportedWidths.getClass();
        return supportedWidths;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidthsFor(int i) {
        try {
            Range<Integer> supportedWidthsFor = this.videoCapabilities.getSupportedWidthsFor(i);
            supportedWidthsFor.getClass();
            return supportedWidthsFor;
        } finally {
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.videoCapabilities.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int i, int i2) {
        return this.videoCapabilities.isSizeSupported(i, i2);
    }
}
