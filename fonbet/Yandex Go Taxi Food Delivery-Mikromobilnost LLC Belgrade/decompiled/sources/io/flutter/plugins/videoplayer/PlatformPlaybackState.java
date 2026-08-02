package io.flutter.plugins.videoplayer;

import defpackage.k4o;
import defpackage.vvc0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/flutter/plugins/videoplayer/PlatformPlaybackState;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "vvc0", "IDLE", "BUFFERING", "READY", "ENDED", "UNKNOWN", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlatformPlaybackState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlatformPlaybackState[] $VALUES;
    public static final PlatformPlaybackState BUFFERING;
    public static final vvc0 Companion;
    public static final PlatformPlaybackState ENDED;
    public static final PlatformPlaybackState IDLE;
    public static final PlatformPlaybackState READY;
    public static final PlatformPlaybackState UNKNOWN;
    private final int raw;

    static {
        PlatformPlaybackState platformPlaybackState = new PlatformPlaybackState("IDLE", 0, 0);
        IDLE = platformPlaybackState;
        PlatformPlaybackState platformPlaybackState2 = new PlatformPlaybackState("BUFFERING", 1, 1);
        BUFFERING = platformPlaybackState2;
        PlatformPlaybackState platformPlaybackState3 = new PlatformPlaybackState("READY", 2, 2);
        READY = platformPlaybackState3;
        PlatformPlaybackState platformPlaybackState4 = new PlatformPlaybackState("ENDED", 3, 3);
        ENDED = platformPlaybackState4;
        PlatformPlaybackState platformPlaybackState5 = new PlatformPlaybackState("UNKNOWN", 4, 4);
        UNKNOWN = platformPlaybackState5;
        PlatformPlaybackState[] platformPlaybackStateArr = {platformPlaybackState, platformPlaybackState2, platformPlaybackState3, platformPlaybackState4, platformPlaybackState5};
        $VALUES = platformPlaybackStateArr;
        $ENTRIES = kotlin.enums.a.a(platformPlaybackStateArr);
        Companion = new vvc0();
    }

    public PlatformPlaybackState(String str, int i, int i2) {
        this.raw = i2;
    }

    public static PlatformPlaybackState valueOf(String str) {
        return (PlatformPlaybackState) Enum.valueOf(PlatformPlaybackState.class, str);
    }

    public static PlatformPlaybackState[] values() {
        return (PlatformPlaybackState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
