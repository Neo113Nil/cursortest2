package ru.yandex.video.m3.player.report;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/report/DebugReportReason;", "", "ON_PLAYER_RELEASE", "ON_PLAYER_FATAL", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class DebugReportReason {
    private static final /* synthetic */ DebugReportReason[] $VALUES;
    public static final DebugReportReason ON_PLAYER_FATAL;
    public static final DebugReportReason ON_PLAYER_RELEASE;

    static {
        DebugReportReason debugReportReason = new DebugReportReason("ON_PLAYER_RELEASE", 0);
        ON_PLAYER_RELEASE = debugReportReason;
        DebugReportReason debugReportReason2 = new DebugReportReason("ON_PLAYER_FATAL", 1);
        ON_PLAYER_FATAL = debugReportReason2;
        $VALUES = new DebugReportReason[]{debugReportReason, debugReportReason2};
    }

    public static DebugReportReason valueOf(String str) {
        return (DebugReportReason) Enum.valueOf(DebugReportReason.class, str);
    }

    public static DebugReportReason[] values() {
        return (DebugReportReason[]) $VALUES.clone();
    }
}
