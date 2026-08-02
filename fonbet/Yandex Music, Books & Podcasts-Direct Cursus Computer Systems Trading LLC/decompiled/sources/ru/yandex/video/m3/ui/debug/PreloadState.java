package ru.yandex.video.m3.ui.debug;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ui/debug/PreloadState;", "", "NONE", "SUCCESS", "CANCELED", "ERROR", "STARTED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class PreloadState {
    private static final /* synthetic */ PreloadState[] $VALUES;
    public static final PreloadState CANCELED;
    public static final PreloadState ERROR;
    public static final PreloadState NONE;
    public static final PreloadState STARTED;
    public static final PreloadState SUCCESS;

    static {
        PreloadState preloadState = new PreloadState("NONE", 0);
        NONE = preloadState;
        PreloadState preloadState2 = new PreloadState("SUCCESS", 1);
        SUCCESS = preloadState2;
        PreloadState preloadState3 = new PreloadState("CANCELED", 2);
        CANCELED = preloadState3;
        PreloadState preloadState4 = new PreloadState("ERROR", 3);
        ERROR = preloadState4;
        PreloadState preloadState5 = new PreloadState("STARTED", 4);
        STARTED = preloadState5;
        $VALUES = new PreloadState[]{preloadState, preloadState2, preloadState3, preloadState4, preloadState5};
    }

    public static PreloadState valueOf(String str) {
        return (PreloadState) Enum.valueOf(PreloadState.class, str);
    }

    public static PreloadState[] values() {
        return (PreloadState[]) $VALUES.clone();
    }
}
