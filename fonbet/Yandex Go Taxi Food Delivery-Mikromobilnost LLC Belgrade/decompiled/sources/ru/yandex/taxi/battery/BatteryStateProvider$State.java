package ru.yandex.taxi.battery;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/battery/BatteryStateProvider$State", "", "Lru/yandex/taxi/battery/BatteryStateProvider$State;", "FULL", "HALF", "LOW", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BatteryStateProvider$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BatteryStateProvider$State[] $VALUES;
    public static final BatteryStateProvider$State FULL;
    public static final BatteryStateProvider$State HALF;
    public static final BatteryStateProvider$State LOW;

    static {
        BatteryStateProvider$State batteryStateProvider$State = new BatteryStateProvider$State("FULL", 0);
        FULL = batteryStateProvider$State;
        BatteryStateProvider$State batteryStateProvider$State2 = new BatteryStateProvider$State("HALF", 1);
        HALF = batteryStateProvider$State2;
        BatteryStateProvider$State batteryStateProvider$State3 = new BatteryStateProvider$State("LOW", 2);
        LOW = batteryStateProvider$State3;
        BatteryStateProvider$State[] batteryStateProvider$StateArr = {batteryStateProvider$State, batteryStateProvider$State2, batteryStateProvider$State3};
        $VALUES = batteryStateProvider$StateArr;
        $ENTRIES = a.a(batteryStateProvider$StateArr);
    }

    public static BatteryStateProvider$State valueOf(String str) {
        return (BatteryStateProvider$State) Enum.valueOf(BatteryStateProvider$State.class, str);
    }

    public static BatteryStateProvider$State[] values() {
        return (BatteryStateProvider$State[]) $VALUES.clone();
    }
}
