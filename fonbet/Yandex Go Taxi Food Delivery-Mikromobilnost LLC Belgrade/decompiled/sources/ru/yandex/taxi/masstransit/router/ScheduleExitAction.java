package ru.yandex.taxi.masstransit.router;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/router/ScheduleExitAction;", "", "GoBack", "OpenThreadVariants", "OpenRoute", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScheduleExitAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScheduleExitAction[] $VALUES;
    public static final ScheduleExitAction GoBack;
    public static final ScheduleExitAction OpenRoute;
    public static final ScheduleExitAction OpenThreadVariants;

    static {
        ScheduleExitAction scheduleExitAction = new ScheduleExitAction("GoBack", 0);
        GoBack = scheduleExitAction;
        ScheduleExitAction scheduleExitAction2 = new ScheduleExitAction("OpenThreadVariants", 1);
        OpenThreadVariants = scheduleExitAction2;
        ScheduleExitAction scheduleExitAction3 = new ScheduleExitAction("OpenRoute", 2);
        OpenRoute = scheduleExitAction3;
        ScheduleExitAction[] scheduleExitActionArr = {scheduleExitAction, scheduleExitAction2, scheduleExitAction3};
        $VALUES = scheduleExitActionArr;
        $ENTRIES = kotlin.enums.a.a(scheduleExitActionArr);
    }

    public static ScheduleExitAction valueOf(String str) {
        return (ScheduleExitAction) Enum.valueOf(ScheduleExitAction.class, str);
    }

    public static ScheduleExitAction[] values() {
        return (ScheduleExitAction[]) $VALUES.clone();
    }
}
