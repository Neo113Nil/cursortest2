package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;

/* loaded from: classes6.dex */
public final class uj30 {
    public final r0 a = bvf0.c(MtFloatingButtonState.FOCUS_USER_LOCATION);

    public final void a() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, MtFloatingButtonState.FOCUS_USER_LOCATION));
    }

    public final void b() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, MtFloatingButtonState.FOCUS_ROUTE));
    }

    public final void c() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, MtFloatingButtonState.FOCUS_ROUTE));
    }
}
