package ru.yandex.taxi.net.tracker;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/net/tracker/TrackerMode;", "", "NORMAL", "FAST", "map_tracker"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackerMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrackerMode[] $VALUES;
    public static final TrackerMode FAST;
    public static final TrackerMode NORMAL;

    static {
        TrackerMode trackerMode = new TrackerMode("NORMAL", 0);
        NORMAL = trackerMode;
        TrackerMode trackerMode2 = new TrackerMode("FAST", 1);
        FAST = trackerMode2;
        TrackerMode[] trackerModeArr = {trackerMode, trackerMode2};
        $VALUES = trackerModeArr;
        $ENTRIES = kotlin.enums.a.a(trackerModeArr);
    }

    public static TrackerMode valueOf(String str) {
        return (TrackerMode) Enum.valueOf(TrackerMode.class, str);
    }

    public static TrackerMode[] values() {
        return (TrackerMode[]) $VALUES.clone();
    }
}
