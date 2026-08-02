package ru.yandex.taxi.widget.timeline;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/widget/timeline/TimelineOrientation;", "", "HORIZONTAL", "VERTICAL", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimelineOrientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimelineOrientation[] $VALUES;
    public static final TimelineOrientation HORIZONTAL;
    public static final TimelineOrientation VERTICAL;

    static {
        TimelineOrientation timelineOrientation = new TimelineOrientation("HORIZONTAL", 0);
        HORIZONTAL = timelineOrientation;
        TimelineOrientation timelineOrientation2 = new TimelineOrientation("VERTICAL", 1);
        VERTICAL = timelineOrientation2;
        TimelineOrientation[] timelineOrientationArr = {timelineOrientation, timelineOrientation2};
        $VALUES = timelineOrientationArr;
        $ENTRIES = kotlin.enums.a.a(timelineOrientationArr);
    }

    public static TimelineOrientation valueOf(String str) {
        return (TimelineOrientation) Enum.valueOf(TimelineOrientation.class, str);
    }

    public static TimelineOrientation[] values() {
        return (TimelineOrientation[]) $VALUES.clone();
    }
}
