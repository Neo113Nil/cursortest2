package com.squareup.cash.calendar.views;

import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class CalendarRowKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ScheduleCalendarDate f$1;

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda5(Function1 function1, ScheduleCalendarDate scheduleCalendarDate, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = scheduleCalendarDate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(this.f$1);
                break;
            default:
                this.f$0.invoke(this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }
}
