package com.squareup.cash.onboarding.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MediaLoadState {
    public static final /* synthetic */ MediaLoadState[] $VALUES;
    public static final MediaLoadState Failed;
    public static final MediaLoadState Loaded;
    public static final MediaLoadState Loading;

    static {
        MediaLoadState mediaLoadState = new MediaLoadState("Loading", 0);
        Loading = mediaLoadState;
        MediaLoadState mediaLoadState2 = new MediaLoadState("Loaded", 1);
        Loaded = mediaLoadState2;
        MediaLoadState mediaLoadState3 = new MediaLoadState("Failed", 2);
        Failed = mediaLoadState3;
        $VALUES = new MediaLoadState[]{mediaLoadState, mediaLoadState2, mediaLoadState3};
    }

    public static MediaLoadState valueOf(String str) {
        return (MediaLoadState) Enum.valueOf(MediaLoadState.class, str);
    }

    public static MediaLoadState[] values() {
        return (MediaLoadState[]) $VALUES.clone();
    }
}
