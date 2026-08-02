package androidx.camera.core.impl.stabilization;

import androidx.media3.extractor.text.CueEncoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class VideoStabilization {
    public static final /* synthetic */ VideoStabilization[] $VALUES;
    public static final CueEncoder Companion;
    public static final VideoStabilization OFF;
    public static final VideoStabilization ON;
    public static final VideoStabilization PREVIEW;
    public static final VideoStabilization UNSPECIFIED;

    static {
        VideoStabilization videoStabilization = new VideoStabilization("UNSPECIFIED", 0);
        UNSPECIFIED = videoStabilization;
        VideoStabilization videoStabilization2 = new VideoStabilization("OFF", 1);
        OFF = videoStabilization2;
        VideoStabilization videoStabilization3 = new VideoStabilization("ON", 2);
        ON = videoStabilization3;
        VideoStabilization videoStabilization4 = new VideoStabilization("PREVIEW", 3);
        PREVIEW = videoStabilization4;
        $VALUES = new VideoStabilization[]{videoStabilization, videoStabilization2, videoStabilization3, videoStabilization4};
        Companion = new CueEncoder(6);
    }

    public static VideoStabilization valueOf(String str) {
        return (VideoStabilization) Enum.valueOf(VideoStabilization.class, str);
    }

    public static VideoStabilization[] values() {
        return (VideoStabilization[]) $VALUES.clone();
    }
}
