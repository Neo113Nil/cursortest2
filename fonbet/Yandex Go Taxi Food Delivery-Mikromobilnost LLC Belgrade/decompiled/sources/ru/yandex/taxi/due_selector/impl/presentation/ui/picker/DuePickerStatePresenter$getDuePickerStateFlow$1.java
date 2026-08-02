package ru.yandex.taxi.due_selector.impl.presentation.ui.picker;

import com.yandex.go.due.data.api.dto.ScheduledOrderButton;
import com.yandex.go.due.data.api.dto.ScheduledOrderButtons;
import defpackage.avj0;
import defpackage.bms;
import defpackage.bwm;
import defpackage.j7z0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.m501;
import defpackage.mvg;
import defpackage.mxm;
import defpackage.ny61;
import defpackage.py91;
import defpackage.pzt0;
import defpackage.rvm;
import defpackage.rwm;
import defpackage.sa90;
import defpackage.swm;
import defpackage.zy11;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonPosition;
import ru.yandex.taxi.due_selector.impl.domain.interactor.d;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lswm;", ClidProvider.STATE, "Ljava/util/Calendar;", "due", "", "isTimeSlotPressed", "<anonymous>", "(Lswm;Ljava/util/Calendar;Z)Lswm;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerStatePresenter$getDuePickerStateFlow$1", f = "DuePickerStatePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DuePickerStatePresenter$getDuePickerStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuePickerStatePresenter$getDuePickerStateFlow$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        DuePickerStatePresenter$getDuePickerStateFlow$1 duePickerStatePresenter$getDuePickerStateFlow$1 = new DuePickerStatePresenter$getDuePickerStateFlow$1(this.this$0, (Continuation) obj4);
        duePickerStatePresenter$getDuePickerStateFlow$1.L$0 = (swm) obj;
        duePickerStatePresenter$getDuePickerStateFlow$1.L$1 = (Calendar) obj2;
        duePickerStatePresenter$getDuePickerStateFlow$1.Z$0 = booleanValue;
        return duePickerStatePresenter$getDuePickerStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        swm swmVar = (swm) this.L$0;
        Calendar calendar = (Calendar) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        py91 py91Var = aVar.y;
        d dVar = aVar.A;
        if ((py91Var instanceof mxm) && !aVar.F.getAndSet(true)) {
            swmVar = dVar.b(swmVar, ((mxm) py91Var).a, z);
        } else if (calendar != null) {
            swmVar = dVar.b(swmVar, calendar, z);
        }
        ru.yandex.taxi.due_selector.impl.domain.interactor.a aVar2 = this.this$0.D;
        rvm rvmVar = aVar2.f;
        pzt0 pzt0Var = aVar2.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = aVar2.h;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        DuePickerStateInfo$PickerState duePickerStateInfo$PickerState = swmVar.a;
        ScheduledOrderButtons scheduledOrderButtons = swmVar.g;
        ScheduledOrderButtons scheduledOrderButtons2 = swmVar.h;
        int[] iArr = rwm.a;
        int i = iArr[duePickerStateInfo$PickerState.ordinal()];
        ScheduledOrderButton scheduledOrderButton = i != 1 ? i != 2 ? null : scheduledOrderButtons2.a : scheduledOrderButtons.a;
        if ((scheduledOrderButton != null ? scheduledOrderButton.a : null) == null) {
            ScheduledOrderButton.Companion.getClass();
            scheduledOrderButton = ScheduledOrderButton.f;
        }
        int i2 = iArr[duePickerStateInfo$PickerState.ordinal()];
        ScheduledOrderButton scheduledOrderButton2 = i2 != 1 ? i2 != 2 ? null : scheduledOrderButtons2.b : scheduledOrderButtons.b;
        if ((scheduledOrderButton2 != null ? scheduledOrderButton2.a : null) == null) {
            ScheduledOrderButton.Companion.getClass();
            scheduledOrderButton2 = ScheduledOrderButton.f;
        }
        ScheduledOrderButton.Companion.getClass();
        ScheduledOrderButton scheduledOrderButton3 = ScheduledOrderButton.f;
        if (jl40.l(scheduledOrderButton, scheduledOrderButton3) && jl40.l(scheduledOrderButton2, scheduledOrderButton3)) {
            if (duePickerStateInfo$PickerState == DuePickerStateInfo$PickerState.VALID_DATE) {
                rvmVar.getClass();
                scheduledOrderButton = new ScheduledOrderButton(ScheduledOrderButton.ButtonType.CONFIRM_PREORDER, ((avj0) rvmVar.a.a).h(kyh0.common_done), "$PRICE$", ScheduledOrderButton.ButtonStyle.MAIN);
            } else if (duePickerStateInfo$PickerState == DuePickerStateInfo$PickerState.INVALID_DATE) {
                Calendar calendar2 = swmVar.d;
                j7z0 j7z0Var = swmVar.c;
                rvmVar.getClass();
                ScheduledOrderButton.ButtonType buttonType = ScheduledOrderButton.ButtonType.PREORDER_UNAVAILABLE;
                bwm bwmVar = rvmVar.a;
                bwmVar.getClass();
                if (calendar2 != null) {
                    TimeZone timeZone = calendar2.getTimeZone();
                    boolean z2 = timeZone.getRawOffset() == TimeZone.getDefault().getRawOffset();
                    Pattern pattern = bwm.c;
                    sa90 t = m501.t(calendar2, j7z0Var, timeZone);
                    Calendar calendar3 = (Calendar) t.a;
                    Calendar calendar4 = (Calendar) t.b;
                    if (calendar3 != null && calendar4 != null) {
                        str = ((avj0) bwmVar.a).i(z2 ? kyh0.due_select_driver_arrive_not_available : kyh0.due_select_driver_arrive_not_available_local_time, m501.w(calendar3), m501.w(calendar4));
                        scheduledOrderButton = new ScheduledOrderButton(buttonType, str, "", ScheduledOrderButton.ButtonStyle.MAIN);
                    }
                }
                str = "";
                scheduledOrderButton = new ScheduledOrderButton(buttonType, str, "", ScheduledOrderButton.ButtonStyle.MAIN);
            }
        }
        aVar2.a(DuePickerButtonPosition.LEADING_BUTTON, scheduledOrderButton, swmVar);
        aVar2.a(DuePickerButtonPosition.TRAILING_BUTTON, scheduledOrderButton2, swmVar);
        return swmVar;
    }
}
