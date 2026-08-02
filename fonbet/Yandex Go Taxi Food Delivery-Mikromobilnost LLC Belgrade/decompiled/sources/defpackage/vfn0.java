package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.domain.ScootersDetailedOrderFocusInteractor$FocusType;

/* loaded from: classes6.dex */
public final class vfn0 {
    public final r0 a = bvf0.c(ScootersDetailedOrderFocusInteractor$FocusType.FOCUS_ON_USER);

    public final void a(ScootersDetailedOrderFocusInteractor$FocusType scootersDetailedOrderFocusInteractor$FocusType) {
        r0 r0Var = this.a;
        if (((ScootersDetailedOrderFocusInteractor$FocusType) r0Var.getValue()) == scootersDetailedOrderFocusInteractor$FocusType) {
            return;
        }
        r0Var.l(scootersDetailedOrderFocusInteractor$FocusType);
    }
}
