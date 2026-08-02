package ru.yandex.taxi.communications.ticket.ui.component;

import defpackage.f4z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.vti0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.ticket.ui.component.TicketTimerKt$TicketTimer$1$1", f = "TicketTimer.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TicketTimerKt$TicketTimer$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $currentTime$delegate;
    final /* synthetic */ Calendar $endDate;
    final /* synthetic */ oz40 $isExpired$delegate;
    final /* synthetic */ oz40 $isVisible$delegate;
    final /* synthetic */ f4z0 $timer;
    long J$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketTimerKt$TicketTimer$1$1(f4z0 f4z0Var, Calendar calendar, oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3, Continuation continuation) {
        super(2, continuation);
        this.$timer = f4z0Var;
        this.$endDate = calendar;
        this.$currentTime$delegate = oz40Var;
        this.$isVisible$delegate = oz40Var2;
        this.$isExpired$delegate = oz40Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketTimerKt$TicketTimer$1$1(this.$timer, this.$endDate, this.$currentTime$delegate, this.$isVisible$delegate, this.$isExpired$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketTimerKt$TicketTimer$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kotlin.b.b(obj);
        do {
            this.$currentTime$delegate.setValue(Calendar.getInstance());
            if (!((Boolean) this.$isVisible$delegate.getValue()).booleanValue() && ((Calendar) this.$currentTime$delegate.getValue()).after(this.$timer.a)) {
                this.$isVisible$delegate.setValue(Boolean.TRUE);
            }
            if (((Boolean) this.$isVisible$delegate.getValue()).booleanValue() && ((Calendar) this.$currentTime$delegate.getValue()).after(this.$endDate)) {
                this.$isExpired$delegate.setValue(Boolean.TRUE);
                return zy11.a;
            }
            vti0 j2 = b.j((Calendar) this.$currentTime$delegate.getValue(), this.$endDate);
            j = 1000;
            if (j2.a <= 0 && j2.b <= 0) {
                j = 100;
            }
            this.L$0 = null;
            this.J$0 = j;
            this.label = 1;
        } while (kotlinx.coroutines.a.i(j, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
