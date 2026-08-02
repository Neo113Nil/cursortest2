package ru.yandex.video.m3.player.ui.debug.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;", "", "DASH", "HLS", "UNKNOWN", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class CurrentStreamType {
    private static final /* synthetic */ CurrentStreamType[] $VALUES;
    public static final CurrentStreamType DASH;
    public static final CurrentStreamType HLS;
    public static final CurrentStreamType UNKNOWN;

    static {
        CurrentStreamType currentStreamType = new CurrentStreamType("DASH", 0);
        DASH = currentStreamType;
        CurrentStreamType currentStreamType2 = new CurrentStreamType("HLS", 1);
        HLS = currentStreamType2;
        CurrentStreamType currentStreamType3 = new CurrentStreamType("UNKNOWN", 2);
        UNKNOWN = currentStreamType3;
        $VALUES = new CurrentStreamType[]{currentStreamType, currentStreamType2, currentStreamType3};
    }

    public static CurrentStreamType valueOf(String str) {
        return (CurrentStreamType) Enum.valueOf(CurrentStreamType.class, str);
    }

    public static CurrentStreamType[] values() {
        return (CurrentStreamType[]) $VALUES.clone();
    }
}
