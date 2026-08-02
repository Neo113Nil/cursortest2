package androidx.camera.video.internal.muxer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Media3MuxerImpl$State {
    public static final /* synthetic */ Media3MuxerImpl$State[] $VALUES;
    public static final Media3MuxerImpl$State CONFIGURED;
    public static final Media3MuxerImpl$State IDLE;
    public static final Media3MuxerImpl$State RELEASED;
    public static final Media3MuxerImpl$State STARTED;
    public static final Media3MuxerImpl$State STOPPED;

    static {
        Media3MuxerImpl$State media3MuxerImpl$State = new Media3MuxerImpl$State("IDLE", 0);
        IDLE = media3MuxerImpl$State;
        Media3MuxerImpl$State media3MuxerImpl$State2 = new Media3MuxerImpl$State("CONFIGURED", 1);
        CONFIGURED = media3MuxerImpl$State2;
        Media3MuxerImpl$State media3MuxerImpl$State3 = new Media3MuxerImpl$State("STARTED", 2);
        STARTED = media3MuxerImpl$State3;
        Media3MuxerImpl$State media3MuxerImpl$State4 = new Media3MuxerImpl$State("STOPPED", 3);
        STOPPED = media3MuxerImpl$State4;
        Media3MuxerImpl$State media3MuxerImpl$State5 = new Media3MuxerImpl$State("RELEASED", 4);
        RELEASED = media3MuxerImpl$State5;
        $VALUES = new Media3MuxerImpl$State[]{media3MuxerImpl$State, media3MuxerImpl$State2, media3MuxerImpl$State3, media3MuxerImpl$State4, media3MuxerImpl$State5};
    }

    public static Media3MuxerImpl$State valueOf(String str) {
        return (Media3MuxerImpl$State) Enum.valueOf(Media3MuxerImpl$State.class, str);
    }

    public static Media3MuxerImpl$State[] values() {
        return (Media3MuxerImpl$State[]) $VALUES.clone();
    }
}
