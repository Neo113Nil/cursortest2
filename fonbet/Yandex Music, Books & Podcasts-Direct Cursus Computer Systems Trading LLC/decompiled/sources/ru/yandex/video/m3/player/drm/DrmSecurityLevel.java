package ru.yandex.video.m3.player.drm;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "", "Low", "Default", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class DrmSecurityLevel {
    private static final /* synthetic */ DrmSecurityLevel[] $VALUES;
    public static final DrmSecurityLevel Default;
    public static final DrmSecurityLevel Low;

    static {
        DrmSecurityLevel drmSecurityLevel = new DrmSecurityLevel("Low", 0);
        Low = drmSecurityLevel;
        DrmSecurityLevel drmSecurityLevel2 = new DrmSecurityLevel("Default", 1);
        Default = drmSecurityLevel2;
        $VALUES = new DrmSecurityLevel[]{drmSecurityLevel, drmSecurityLevel2};
    }

    public static DrmSecurityLevel valueOf(String str) {
        return (DrmSecurityLevel) Enum.valueOf(DrmSecurityLevel.class, str);
    }

    public static DrmSecurityLevel[] values() {
        return (DrmSecurityLevel[]) $VALUES.clone();
    }
}
