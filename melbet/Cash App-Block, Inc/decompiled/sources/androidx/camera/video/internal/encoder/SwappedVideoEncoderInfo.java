package androidx.camera.video.internal.encoder;

import android.util.Range;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SwappedVideoEncoderInfo implements VideoEncoderInfo {
    public final VideoEncoderInfo videoEncoderInfo;

    public SwappedVideoEncoderInfo(VideoEncoderInfo videoEncoderInfo) {
        this.videoEncoderInfo = videoEncoderInfo;
        if (videoEncoderInfo.canSwapWidthHeight()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        throw null;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return this.videoEncoderInfo.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.videoEncoderInfo.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedBitrateRange() {
        return this.videoEncoderInfo.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeights() {
        return this.videoEncoderInfo.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeightsFor(int i) {
        return this.videoEncoderInfo.getSupportedWidthsFor(i);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidths() {
        return this.videoEncoderInfo.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidthsFor(int i) {
        return this.videoEncoderInfo.getSupportedHeightsFor(i);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.videoEncoderInfo.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int i, int i2) {
        return this.videoEncoderInfo.isSizeSupported(i2, i);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupportedAllowSwapping(int i, int i2) {
        return this.videoEncoderInfo.isSizeSupportedAllowSwapping(i2, i);
    }
}
