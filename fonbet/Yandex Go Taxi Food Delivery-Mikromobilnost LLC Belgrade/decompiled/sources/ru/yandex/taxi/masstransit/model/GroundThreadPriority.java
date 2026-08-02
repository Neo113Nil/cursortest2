package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/masstransit/model/GroundThreadPriority;", "", "Selected", "HasScheduleAndNoAlerts", "HasScheduleAndLastTrip", "HasSchedule", "NoAlerts", "LastTrip", "Other", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GroundThreadPriority {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GroundThreadPriority[] $VALUES;
    public static final GroundThreadPriority HasSchedule;
    public static final GroundThreadPriority HasScheduleAndLastTrip;
    public static final GroundThreadPriority HasScheduleAndNoAlerts;
    public static final GroundThreadPriority LastTrip;
    public static final GroundThreadPriority NoAlerts;
    public static final GroundThreadPriority Other;
    public static final GroundThreadPriority Selected;

    static {
        GroundThreadPriority groundThreadPriority = new GroundThreadPriority("Selected", 0);
        Selected = groundThreadPriority;
        GroundThreadPriority groundThreadPriority2 = new GroundThreadPriority("HasScheduleAndNoAlerts", 1);
        HasScheduleAndNoAlerts = groundThreadPriority2;
        GroundThreadPriority groundThreadPriority3 = new GroundThreadPriority("HasScheduleAndLastTrip", 2);
        HasScheduleAndLastTrip = groundThreadPriority3;
        GroundThreadPriority groundThreadPriority4 = new GroundThreadPriority("HasSchedule", 3);
        HasSchedule = groundThreadPriority4;
        GroundThreadPriority groundThreadPriority5 = new GroundThreadPriority("NoAlerts", 4);
        NoAlerts = groundThreadPriority5;
        GroundThreadPriority groundThreadPriority6 = new GroundThreadPriority("LastTrip", 5);
        LastTrip = groundThreadPriority6;
        GroundThreadPriority groundThreadPriority7 = new GroundThreadPriority("Other", 6);
        Other = groundThreadPriority7;
        GroundThreadPriority[] groundThreadPriorityArr = {groundThreadPriority, groundThreadPriority2, groundThreadPriority3, groundThreadPriority4, groundThreadPriority5, groundThreadPriority6, groundThreadPriority7};
        $VALUES = groundThreadPriorityArr;
        $ENTRIES = kotlin.enums.a.a(groundThreadPriorityArr);
    }

    public static GroundThreadPriority valueOf(String str) {
        return (GroundThreadPriority) Enum.valueOf(GroundThreadPriority.class, str);
    }

    public static GroundThreadPriority[] values() {
        return (GroundThreadPriority[]) $VALUES.clone();
    }
}
