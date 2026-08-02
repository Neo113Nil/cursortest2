package defpackage;

import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class uro0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.values().length];
        try {
            iArr[ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.TURNING_ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.TURNING_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.OFF.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
