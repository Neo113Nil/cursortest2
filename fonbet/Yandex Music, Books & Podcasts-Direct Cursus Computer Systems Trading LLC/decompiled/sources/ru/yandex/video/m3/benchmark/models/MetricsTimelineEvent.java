package ru.yandex.video.m3.benchmark.models;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/benchmark/models/MetricsTimelineEvent;", "", "START_PREPARE", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class MetricsTimelineEvent {
    private static final /* synthetic */ MetricsTimelineEvent[] $VALUES;
    public static final MetricsTimelineEvent START_PREPARE;

    static {
        MetricsTimelineEvent metricsTimelineEvent = new MetricsTimelineEvent("START_PREPARE", 0);
        START_PREPARE = metricsTimelineEvent;
        $VALUES = new MetricsTimelineEvent[]{metricsTimelineEvent};
    }

    public static MetricsTimelineEvent valueOf(String str) {
        return (MetricsTimelineEvent) Enum.valueOf(MetricsTimelineEvent.class, str);
    }

    public static MetricsTimelineEvent[] values() {
        return (MetricsTimelineEvent[]) $VALUES.clone();
    }
}
