package androidx.camera.video.internal.muxer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MediaMuxerImpl$State {
    public static final /* synthetic */ MediaMuxerImpl$State[] $VALUES;
    public static final MediaMuxerImpl$State CONFIGURED;
    public static final MediaMuxerImpl$State IDLE;
    public static final MediaMuxerImpl$State RELEASED;
    public static final MediaMuxerImpl$State STARTED;
    public static final MediaMuxerImpl$State STOPPED;

    static {
        MediaMuxerImpl$State mediaMuxerImpl$State = new MediaMuxerImpl$State("IDLE", 0);
        IDLE = mediaMuxerImpl$State;
        MediaMuxerImpl$State mediaMuxerImpl$State2 = new MediaMuxerImpl$State("CONFIGURED", 1);
        CONFIGURED = mediaMuxerImpl$State2;
        MediaMuxerImpl$State mediaMuxerImpl$State3 = new MediaMuxerImpl$State("STARTED", 2);
        STARTED = mediaMuxerImpl$State3;
        MediaMuxerImpl$State mediaMuxerImpl$State4 = new MediaMuxerImpl$State("STOPPED", 3);
        STOPPED = mediaMuxerImpl$State4;
        MediaMuxerImpl$State mediaMuxerImpl$State5 = new MediaMuxerImpl$State("RELEASED", 4);
        RELEASED = mediaMuxerImpl$State5;
        $VALUES = new MediaMuxerImpl$State[]{mediaMuxerImpl$State, mediaMuxerImpl$State2, mediaMuxerImpl$State3, mediaMuxerImpl$State4, mediaMuxerImpl$State5};
    }

    public static MediaMuxerImpl$State valueOf(String str) {
        return (MediaMuxerImpl$State) Enum.valueOf(MediaMuxerImpl$State.class, str);
    }

    public static MediaMuxerImpl$State[] values() {
        return (MediaMuxerImpl$State[]) $VALUES.clone();
    }
}
