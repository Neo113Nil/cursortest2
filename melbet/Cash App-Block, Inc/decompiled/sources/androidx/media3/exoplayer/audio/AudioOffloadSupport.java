package androidx.media3.exoplayer.audio;

import androidx.media3.extractor.mp4.BoxParser;

/* loaded from: classes3.dex */
public final class AudioOffloadSupport {
    public static final AudioOffloadSupport DEFAULT_UNSUPPORTED = new BoxParser.StriData().build();
    public final boolean isFormatSupported;
    public final boolean isGaplessSupported;
    public final boolean isSpeedChangeSupported;

    public AudioOffloadSupport(BoxParser.StriData striData) {
        this.isFormatSupported = striData.hasLeftEyeView;
        this.isGaplessSupported = striData.hasRightEyeView;
        this.isSpeedChangeSupported = striData.eyeViewsReversed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioOffloadSupport.class != obj.getClass()) {
            return false;
        }
        AudioOffloadSupport audioOffloadSupport = (AudioOffloadSupport) obj;
        return this.isFormatSupported == audioOffloadSupport.isFormatSupported && this.isGaplessSupported == audioOffloadSupport.isGaplessSupported && this.isSpeedChangeSupported == audioOffloadSupport.isSpeedChangeSupported;
    }

    public final int hashCode() {
        return ((this.isFormatSupported ? 1 : 0) << 2) + ((this.isGaplessSupported ? 1 : 0) << 1) + (this.isSpeedChangeSupported ? 1 : 0);
    }
}
