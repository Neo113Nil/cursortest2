package ru.yandex.taxi.communications.ticket.ui.component;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/ticket/ui/component/TimerFormat;", "", "DAYS_HOURS_MINUTES", "HOURS_MINUTES_SECONDS", "MINUTES_SECONDS_MILLISECONDS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TimerFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimerFormat[] $VALUES;
    public static final TimerFormat DAYS_HOURS_MINUTES;
    public static final TimerFormat HOURS_MINUTES_SECONDS;
    public static final TimerFormat MINUTES_SECONDS_MILLISECONDS;

    static {
        TimerFormat timerFormat = new TimerFormat("DAYS_HOURS_MINUTES", 0);
        DAYS_HOURS_MINUTES = timerFormat;
        TimerFormat timerFormat2 = new TimerFormat("HOURS_MINUTES_SECONDS", 1);
        HOURS_MINUTES_SECONDS = timerFormat2;
        TimerFormat timerFormat3 = new TimerFormat("MINUTES_SECONDS_MILLISECONDS", 2);
        MINUTES_SECONDS_MILLISECONDS = timerFormat3;
        TimerFormat[] timerFormatArr = {timerFormat, timerFormat2, timerFormat3};
        $VALUES = timerFormatArr;
        $ENTRIES = kotlin.enums.a.a(timerFormatArr);
    }

    public static TimerFormat valueOf(String str) {
        return (TimerFormat) Enum.valueOf(TimerFormat.class, str);
    }

    public static TimerFormat[] values() {
        return (TimerFormat[]) $VALUES.clone();
    }
}
