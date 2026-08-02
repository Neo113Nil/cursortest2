package defpackage;

/* loaded from: classes6.dex */
public final class xbl {
    public final boolean a;
    public final boolean b;

    public xbl(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xbl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        xbl xblVar = (xbl) obj;
        return this.a == xblVar.a && this.b == xblVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(Boolean.hashCode(true) * 31, 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, this.a), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, this.b), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerDebugViewFlags(showVsid=true, showVsidLabel=true, showDrm=true, showDrmLabel=true, showVideoTrack=true, showVideoTrackLabel=true, showAudioTrack=true, showAudioTrackLabel=true, showSubtitlesTrack=");
        sb.append(this.a);
        sb.append(", showSubtitlesTrackLabel=true, showViewportSize=true, showViewportSizeLabel=true, showVideoDecoder=true, showVideoDecoderLabel=true, showAudioDecoder=true, showAudioDecoderLabel=true, showVideoDecoderInitsReusesReleases=");
        return ouj.r(sb, this.b, ", showBandwidthEstimation=true, showBandwidthEstimationLabel=true, showBufferSize=true, showBufferSizeLabel=true, showBytesLoaded=true, showBytesLoadedLabel=true, showLatency=true, showLatencyLabel=true, showExtraInfo=true, showExtraInfoLabel=true, showLastError=true, showLastErrorLabel=true, showQrCode=true)");
    }
}
