package com.squareup.cash.music.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PlaybackState {
    public static final /* synthetic */ PlaybackState[] $VALUES;
    public static final PlaybackState BUFFERING;
    public static final PlaybackState IDLE;
    public static final PlaybackState PAUSED;
    public static final PlaybackState PLAYING;
    public static final PlaybackState STOPPED;

    static {
        PlaybackState playbackState = new PlaybackState("IDLE", 0);
        IDLE = playbackState;
        PlaybackState playbackState2 = new PlaybackState("PLAYING", 1);
        PLAYING = playbackState2;
        PlaybackState playbackState3 = new PlaybackState("PAUSED", 2);
        PAUSED = playbackState3;
        PlaybackState playbackState4 = new PlaybackState("BUFFERING", 3);
        BUFFERING = playbackState4;
        PlaybackState playbackState5 = new PlaybackState("STOPPED", 4);
        STOPPED = playbackState5;
        $VALUES = new PlaybackState[]{playbackState, playbackState2, playbackState3, playbackState4, playbackState5};
    }

    public static PlaybackState valueOf(String str) {
        return (PlaybackState) Enum.valueOf(PlaybackState.class, str);
    }

    public static PlaybackState[] values() {
        return (PlaybackState[]) $VALUES.clone();
    }
}
