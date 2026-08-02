package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;

/* loaded from: classes6.dex */
public final class sen0 implements ten0 {
    public final ScootersDetailedOrderAction$ClickType$Toggle$ToggleState a;
    public final boolean b;

    public sen0(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState, boolean z) {
        this.a = scootersDetailedOrderAction$ClickType$Toggle$ToggleState;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sen0)) {
            return false;
        }
        sen0 sen0Var = (sen0) obj;
        return this.a == sen0Var.a && this.b == sen0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Toggle(state=" + this.a + ", isItemClickable=" + this.b + Extension.C_BRAKE;
    }
}
