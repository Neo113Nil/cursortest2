package ru.yandex.taxi.due_selector.impl.domain.interactor;

import com.yandex.go.due.data.api.dto.ScheduledOrderButton;
import defpackage.bvf0;
import defpackage.bwm;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.hwm;
import defpackage.ike;
import defpackage.iwm;
import defpackage.j7z0;
import defpackage.jl40;
import defpackage.jwm;
import defpackage.m501;
import defpackage.pzt0;
import defpackage.rvm;
import defpackage.sa90;
import defpackage.svm;
import defpackage.swm;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tvm;
import defpackage.uvm;
import defpackage.w511;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.due_selector.impl.domain.entity.ControlButtonState;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonPosition;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonType;
import ru.yandex.taxi.due_selector.impl.domain.interactor.price.e;
import ru.yandex.taxi.due_selector.impl.domain.interactor.price.f;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerStateInfo$PickerState;

/* loaded from: classes5.dex */
public final class a {
    public final uvm a;
    public final tt2 b;
    public final bwm c;
    public final e d;
    public final f e;
    public final rvm f;
    public final ike g = bvf0.b();
    public pzt0 h;
    public pzt0 i;
    public pzt0 j;

    public a(uvm uvmVar, tt2 tt2Var, bwm bwmVar, e eVar, f fVar, rvm rvmVar) {
        this.a = uvmVar;
        this.b = tt2Var;
        this.c = bwmVar;
        this.d = eVar;
        this.e = fVar;
        this.f = rvmVar;
    }

    public static DuePickerButtonType d(ScheduledOrderButton scheduledOrderButton) {
        ScheduledOrderButton.ButtonType buttonType = scheduledOrderButton.a;
        if (buttonType == null) {
            return DuePickerButtonType.UNKNOWN;
        }
        int i = tvm.b[buttonType.ordinal()];
        if (i == 1) {
            return DuePickerButtonType.SCHEDULED_ORDER_BUTTON;
        }
        if (i == 2) {
            return DuePickerButtonType.ON_DEMAND_BUTTON;
        }
        if (i == 3) {
            return DuePickerButtonType.UNAVAILABLE_BUTTON;
        }
        w511.b();
        return null;
    }

    public final void a(DuePickerButtonPosition duePickerButtonPosition, ScheduledOrderButton scheduledOrderButton, swm swmVar) {
        DuePickerButtonType d = d(scheduledOrderButton);
        DuePickerButtonType duePickerButtonType = DuePickerButtonType.ON_DEMAND_BUTTON;
        e eVar = this.d;
        b(duePickerButtonPosition, scheduledOrderButton, swmVar, d == duePickerButtonType ? (jwm) eVar.c.a.getValue() : hwm.c);
        DuePickerButtonType d2 = d(scheduledOrderButton);
        if (swmVar.k) {
            DuePickerStateInfo$PickerState duePickerStateInfo$PickerState = swmVar.a;
            DuePickerButtonType d3 = d(scheduledOrderButton);
            String str = scheduledOrderButton.b;
            if (str == null) {
                str = "";
            }
            String str2 = scheduledOrderButton.c;
            String str3 = str2 != null ? str2 : "";
            if (e(duePickerStateInfo$PickerState, d3, str) || e(duePickerStateInfo$PickerState, d3, str3)) {
                ike ikeVar = this.g;
                if (d2 != duePickerButtonType) {
                    if (d2 == DuePickerButtonType.SCHEDULED_ORDER_BUTTON) {
                        pzt0 pzt0Var = this.i;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        this.i = tje.N(ikeVar, null, null, new DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1(this, duePickerButtonPosition, scheduledOrderButton, swmVar, null), 3);
                        return;
                    }
                    return;
                }
                if (!eVar.c.c.get()) {
                    pzt0 pzt0Var2 = this.j;
                    if (pzt0Var2 != null) {
                        pzt0Var2.a(null);
                    }
                    this.j = com.yandex.go.coroutines.b.h(ikeVar, eVar.a());
                }
                pzt0 pzt0Var3 = this.h;
                if (pzt0Var3 != null) {
                    pzt0Var3.a(null);
                }
                this.h = tje.N(ikeVar, null, null, new DuePickerButtonsInteractor$observeOnDemandButtonPrice$$inlined$safeCollectIn$1(eVar.c.b, null, this, duePickerButtonPosition, scheduledOrderButton, swmVar), 3);
            }
        }
    }

    public final void b(DuePickerButtonPosition duePickerButtonPosition, ScheduledOrderButton scheduledOrderButton, swm swmVar, jwm jwmVar) {
        DuePickerButtonType d = d(scheduledOrderButton);
        boolean z = scheduledOrderButton.d == ScheduledOrderButton.ButtonStyle.MINOR;
        ScheduledOrderButton.ButtonType buttonType = scheduledOrderButton.a;
        int i = buttonType == null ? -1 : tvm.b[buttonType.ordinal()];
        ControlButtonState controlButtonState = (i == 1 || i == 2) ? z ? ControlButtonState.ACTIVE_MINOR : ControlButtonState.ACTIVE_MAIN : i != 3 ? ControlButtonState.ACTIVE_MAIN : z ? ControlButtonState.INVALID_MINOR : ControlButtonState.INVALID_MAIN;
        String str = scheduledOrderButton.b;
        if (str == null) {
            str = "";
        }
        String c = c(scheduledOrderButton, swmVar, jwmVar, str);
        String str2 = scheduledOrderButton.c;
        String c2 = c(scheduledOrderButton, swmVar, jwmVar, str2 != null ? str2 : "");
        boolean l = jl40.l(jwmVar, hwm.b);
        int i2 = tvm.a[duePickerButtonPosition.ordinal()];
        uvm uvmVar = this.a;
        if (i2 == 1) {
            svm svmVar = new svm(d, controlButtonState, c, c2, l);
            r0 r0Var = uvmVar.a;
            r0Var.getClass();
            r0Var.m(null, svmVar);
            return;
        }
        if (i2 != 2) {
            w511.b();
            return;
        }
        svm svmVar2 = new svm(d, controlButtonState, c, c2, l);
        r0 r0Var2 = uvmVar.c;
        r0Var2.getClass();
        r0Var2.m(null, svmVar2);
    }

    public final String c(ScheduledOrderButton scheduledOrderButton, swm swmVar, jwm jwmVar, String str) {
        DuePickerStateInfo$PickerState duePickerStateInfo$PickerState = swmVar.a;
        DuePickerButtonType d = d(scheduledOrderButton);
        boolean e = e(duePickerStateInfo$PickerState, d, str);
        bwm bwmVar = this.c;
        if (e) {
            String str2 = jwmVar instanceof iwm ? ((iwm) jwmVar).a : "";
            bwmVar.getClass();
            if (str.length() > 0 && str2.length() > 0 && evu0.y(str, "$PRICE$", false)) {
                return cvu0.v(str, "$PRICE$", str2, false);
            }
        } else {
            bwmVar.getClass();
            if (evu0.y(str, "$START_TIME$", false) && evu0.y(str, "$END_TIME$", false) && d == DuePickerButtonType.UNAVAILABLE_BUTTON && duePickerStateInfo$PickerState == DuePickerStateInfo$PickerState.INVALID_DATE) {
                Calendar calendar = swmVar.d;
                j7z0 j7z0Var = swmVar.c;
                if (calendar != null) {
                    TimeZone timeZone = calendar.getTimeZone();
                    Pattern pattern = bwm.c;
                    sa90 t = m501.t(calendar, j7z0Var, timeZone);
                    Calendar calendar2 = (Calendar) t.a;
                    Calendar calendar3 = (Calendar) t.b;
                    if (calendar2 != null && calendar3 != null && str.length() > 0 && evu0.y(str, "$START_TIME$", false) && evu0.y(str, "$END_TIME$", false)) {
                        return cvu0.v(cvu0.v(str, "$START_TIME$", m501.w(calendar2), false), "$END_TIME$", m501.w(calendar3), false);
                    }
                }
            } else if (!bwm.c.matcher(str).matches()) {
                return str;
            }
        }
        return "";
    }

    public final boolean e(DuePickerStateInfo$PickerState duePickerStateInfo$PickerState, DuePickerButtonType duePickerButtonType, String str) {
        this.c.getClass();
        return evu0.y(str, "$PRICE$", false) && ((duePickerButtonType == DuePickerButtonType.SCHEDULED_ORDER_BUTTON && duePickerStateInfo$PickerState == DuePickerStateInfo$PickerState.VALID_DATE) || (duePickerButtonType == DuePickerButtonType.ON_DEMAND_BUTTON && (duePickerStateInfo$PickerState == DuePickerStateInfo$PickerState.VALID_DATE || duePickerStateInfo$PickerState == DuePickerStateInfo$PickerState.INVALID_DATE)));
    }
}
