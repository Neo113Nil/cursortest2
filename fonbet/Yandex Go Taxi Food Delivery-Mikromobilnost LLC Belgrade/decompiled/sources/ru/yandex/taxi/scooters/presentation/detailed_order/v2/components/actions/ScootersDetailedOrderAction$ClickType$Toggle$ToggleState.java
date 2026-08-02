package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersDetailedOrderAction$ClickType$Toggle$ToggleState", "", "Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;", "TURNING_ON", "ON", "TURNING_OFF", "OFF", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersDetailedOrderAction$ClickType$Toggle$ToggleState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDetailedOrderAction$ClickType$Toggle$ToggleState[] $VALUES;
    public static final ScootersDetailedOrderAction$ClickType$Toggle$ToggleState OFF;
    public static final ScootersDetailedOrderAction$ClickType$Toggle$ToggleState ON;
    public static final ScootersDetailedOrderAction$ClickType$Toggle$ToggleState TURNING_OFF;
    public static final ScootersDetailedOrderAction$ClickType$Toggle$ToggleState TURNING_ON;

    static {
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState = new ScootersDetailedOrderAction$ClickType$Toggle$ToggleState("TURNING_ON", 0);
        TURNING_ON = scootersDetailedOrderAction$ClickType$Toggle$ToggleState;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState2 = new ScootersDetailedOrderAction$ClickType$Toggle$ToggleState("ON", 1);
        ON = scootersDetailedOrderAction$ClickType$Toggle$ToggleState2;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState3 = new ScootersDetailedOrderAction$ClickType$Toggle$ToggleState("TURNING_OFF", 2);
        TURNING_OFF = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState4 = new ScootersDetailedOrderAction$ClickType$Toggle$ToggleState("OFF", 3);
        OFF = scootersDetailedOrderAction$ClickType$Toggle$ToggleState4;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState[] scootersDetailedOrderAction$ClickType$Toggle$ToggleStateArr = {scootersDetailedOrderAction$ClickType$Toggle$ToggleState, scootersDetailedOrderAction$ClickType$Toggle$ToggleState2, scootersDetailedOrderAction$ClickType$Toggle$ToggleState3, scootersDetailedOrderAction$ClickType$Toggle$ToggleState4};
        $VALUES = scootersDetailedOrderAction$ClickType$Toggle$ToggleStateArr;
        $ENTRIES = kotlin.enums.a.a(scootersDetailedOrderAction$ClickType$Toggle$ToggleStateArr);
    }

    public static ScootersDetailedOrderAction$ClickType$Toggle$ToggleState valueOf(String str) {
        return (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) Enum.valueOf(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.class, str);
    }

    public static ScootersDetailedOrderAction$ClickType$Toggle$ToggleState[] values() {
        return (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState[]) $VALUES.clone();
    }
}
