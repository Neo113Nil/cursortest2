package ru.yandex.taxi.battery;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/battery/BatteryStateProvider$PluggedState", "", "Lru/yandex/taxi/battery/BatteryStateProvider$PluggedState;", "", "title", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PLUGGED", "UNPLUGGED", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BatteryStateProvider$PluggedState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BatteryStateProvider$PluggedState[] $VALUES;
    public static final BatteryStateProvider$PluggedState PLUGGED;
    public static final BatteryStateProvider$PluggedState UNPLUGGED;
    private final String title;

    static {
        BatteryStateProvider$PluggedState batteryStateProvider$PluggedState = new BatteryStateProvider$PluggedState("PLUGGED", 0, "charging");
        PLUGGED = batteryStateProvider$PluggedState;
        BatteryStateProvider$PluggedState batteryStateProvider$PluggedState2 = new BatteryStateProvider$PluggedState("UNPLUGGED", 1, "unplugged");
        UNPLUGGED = batteryStateProvider$PluggedState2;
        BatteryStateProvider$PluggedState[] batteryStateProvider$PluggedStateArr = {batteryStateProvider$PluggedState, batteryStateProvider$PluggedState2};
        $VALUES = batteryStateProvider$PluggedStateArr;
        $ENTRIES = a.a(batteryStateProvider$PluggedStateArr);
    }

    public BatteryStateProvider$PluggedState(String str, int i, String str2) {
        this.title = str2;
    }

    public static BatteryStateProvider$PluggedState valueOf(String str) {
        return (BatteryStateProvider$PluggedState) Enum.valueOf(BatteryStateProvider$PluggedState.class, str);
    }

    public static BatteryStateProvider$PluggedState[] values() {
        return (BatteryStateProvider$PluggedState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
