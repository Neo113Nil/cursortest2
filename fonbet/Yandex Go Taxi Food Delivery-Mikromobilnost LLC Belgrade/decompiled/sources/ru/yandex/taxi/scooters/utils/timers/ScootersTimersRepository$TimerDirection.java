package ru.yandex.taxi.scooters.utils.timers;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/scooters/utils/timers/ScootersTimersRepository$TimerDirection", "", "Lru/yandex/taxi/scooters/utils/timers/ScootersTimersRepository$TimerDirection;", "DOWN", "UP", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScootersTimersRepository$TimerDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersTimersRepository$TimerDirection[] $VALUES;
    public static final ScootersTimersRepository$TimerDirection DOWN;
    public static final ScootersTimersRepository$TimerDirection UP;

    static {
        ScootersTimersRepository$TimerDirection scootersTimersRepository$TimerDirection = new ScootersTimersRepository$TimerDirection("DOWN", 0);
        DOWN = scootersTimersRepository$TimerDirection;
        ScootersTimersRepository$TimerDirection scootersTimersRepository$TimerDirection2 = new ScootersTimersRepository$TimerDirection("UP", 1);
        UP = scootersTimersRepository$TimerDirection2;
        ScootersTimersRepository$TimerDirection[] scootersTimersRepository$TimerDirectionArr = {scootersTimersRepository$TimerDirection, scootersTimersRepository$TimerDirection2};
        $VALUES = scootersTimersRepository$TimerDirectionArr;
        $ENTRIES = kotlin.enums.a.a(scootersTimersRepository$TimerDirectionArr);
    }

    public static ScootersTimersRepository$TimerDirection valueOf(String str) {
        return (ScootersTimersRepository$TimerDirection) Enum.valueOf(ScootersTimersRepository$TimerDirection.class, str);
    }

    public static ScootersTimersRepository$TimerDirection[] values() {
        return (ScootersTimersRepository$TimerDirection[]) $VALUES.clone();
    }
}
