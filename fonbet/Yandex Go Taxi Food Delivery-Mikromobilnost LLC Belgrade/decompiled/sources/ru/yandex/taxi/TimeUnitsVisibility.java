package ru.yandex.taxi;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/TimeUnitsVisibility;", "", "", "count", CA20Status.STATUS_USER_I, "a", "()I", "ONE_TIME_UNIT", "TWO_TIME_UNITS", "ALL_TIME_UNITS", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimeUnitsVisibility {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimeUnitsVisibility[] $VALUES;
    public static final TimeUnitsVisibility ALL_TIME_UNITS;
    public static final TimeUnitsVisibility ONE_TIME_UNIT;
    public static final TimeUnitsVisibility TWO_TIME_UNITS;
    private final int count;

    static {
        TimeUnitsVisibility timeUnitsVisibility = new TimeUnitsVisibility("ONE_TIME_UNIT", 0, 1);
        ONE_TIME_UNIT = timeUnitsVisibility;
        TimeUnitsVisibility timeUnitsVisibility2 = new TimeUnitsVisibility("TWO_TIME_UNITS", 1, 2);
        TWO_TIME_UNITS = timeUnitsVisibility2;
        TimeUnitsVisibility timeUnitsVisibility3 = new TimeUnitsVisibility("ALL_TIME_UNITS", 2, 3);
        ALL_TIME_UNITS = timeUnitsVisibility3;
        TimeUnitsVisibility[] timeUnitsVisibilityArr = {timeUnitsVisibility, timeUnitsVisibility2, timeUnitsVisibility3};
        $VALUES = timeUnitsVisibilityArr;
        $ENTRIES = kotlin.enums.a.a(timeUnitsVisibilityArr);
    }

    public TimeUnitsVisibility(String str, int i, int i2) {
        this.count = i2;
    }

    public static TimeUnitsVisibility valueOf(String str) {
        return (TimeUnitsVisibility) Enum.valueOf(TimeUnitsVisibility.class, str);
    }

    public static TimeUnitsVisibility[] values() {
        return (TimeUnitsVisibility[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }
}
