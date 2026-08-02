package ru.yandex.taxi.due_selector.impl.domain.interactor;

import com.yandex.go.due.data.api.dto.AllowedTimeInfo;
import com.yandex.go.due.data.api.dto.PricePrefetch;
import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityResponse;
import com.yandex.go.due.data.api.dto.ScheduledOrderButtons;
import com.yandex.go.due.data.api.dto.UserInfo;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.cjw0;
import defpackage.f7z0;
import defpackage.fwm;
import defpackage.j7z0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.svm;
import defpackage.swm;
import defpackage.vpr;
import defpackage.wiq0;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerStateInfo$PickerState;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DuePickerStateInteractor$fetchState$$inlined$map$1$2$1 duePickerStateInteractor$fetchState$$inlined$map$1$2$1;
        int i;
        Object obj2;
        Object obj3;
        Boolean bool;
        if (continuation instanceof DuePickerStateInteractor$fetchState$$inlined$map$1$2$1) {
            duePickerStateInteractor$fetchState$$inlined$map$1$2$1 = (DuePickerStateInteractor$fetchState$$inlined$map$1$2$1) continuation;
            int i2 = duePickerStateInteractor$fetchState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                duePickerStateInteractor$fetchState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = duePickerStateInteractor$fetchState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = duePickerStateInteractor$fetchState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    ScheduledOrderAvailabilityResponse scheduledOrderAvailabilityResponse = (ScheduledOrderAvailabilityResponse) obj;
                    d dVar = this.b;
                    fwm fwmVar = dVar.g;
                    cjw0 cjw0Var = dVar.b;
                    pex0 m = ((k) ((wiq0) cjw0Var.a)).m();
                    Iterator it = scheduledOrderAvailabilityResponse.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((AllowedTimeInfo) obj2).d, m != null ? m.b : null)) {
                            break;
                        }
                    }
                    AllowedTimeInfo allowedTimeInfo = (AllowedTimeInfo) obj2;
                    if (allowedTimeInfo == null) {
                        allowedTimeInfo = AllowedTimeInfo.i;
                    }
                    j7z0 w = cjw0Var.w(allowedTimeInfo, false);
                    List list = w.a;
                    if (list.isEmpty()) {
                        ny61.g("Empty days received!");
                        return null;
                    }
                    Calendar calendar = ((f7z0) kotlin.collections.a.P(list)).a;
                    UserInfo userInfo = scheduledOrderAvailabilityResponse.c;
                    DuePickerStateInfo$PickerState duePickerStateInfo$PickerState = DuePickerStateInfo$PickerState.VALID_DATE;
                    String str = scheduledOrderAvailabilityResponse.a;
                    List J0 = kotlin.collections.a.J0(userInfo.a);
                    List J02 = kotlin.collections.a.J0(userInfo.b);
                    ScheduledOrderButtons scheduledOrderButtons = userInfo.c;
                    ScheduledOrderButtons scheduledOrderButtons2 = userInfo.d;
                    svm svmVar = svm.f;
                    PricePrefetch a = fwmVar.a(scheduledOrderAvailabilityResponse);
                    boolean z = (a != null ? a.a : null) == PricePrefetch.Type.DONE_BUTTON;
                    PricePrefetch a2 = fwmVar.a(scheduledOrderAvailabilityResponse);
                    boolean booleanValue = (a2 == null || (bool = a2.b) == null) ? false : bool.booleanValue();
                    pex0 m2 = ((k) dVar.i).m();
                    String str2 = m2 != null ? m2.b : null;
                    Iterator it2 = scheduledOrderAvailabilityResponse.b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        if (jl40.l(((AllowedTimeInfo) obj3).d, str2)) {
                            break;
                        }
                    }
                    AllowedTimeInfo allowedTimeInfo2 = (AllowedTimeInfo) obj3;
                    swm b = dVar.b(new swm(duePickerStateInfo$PickerState, str, w, null, J0, J02, scheduledOrderButtons, scheduledOrderButtons2, svmVar, svmVar, z, booleanValue, allowedTimeInfo2 != null ? Integer.valueOf(allowedTimeInfo2.b) : null), calendar, ((Boolean) dVar.h.a.getValue()).booleanValue());
                    duePickerStateInteractor$fetchState$$inlined$map$1$2$1.L$0 = null;
                    duePickerStateInteractor$fetchState$$inlined$map$1$2$1.L$1 = null;
                    duePickerStateInteractor$fetchState$$inlined$map$1$2$1.L$2 = null;
                    duePickerStateInteractor$fetchState$$inlined$map$1$2$1.L$3 = null;
                    duePickerStateInteractor$fetchState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, duePickerStateInteractor$fetchState$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj4);
                }
                return zy11.a;
            }
        }
        duePickerStateInteractor$fetchState$$inlined$map$1$2$1 = new DuePickerStateInteractor$fetchState$$inlined$map$1$2$1(this, continuation);
        Object obj42 = duePickerStateInteractor$fetchState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = duePickerStateInteractor$fetchState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
