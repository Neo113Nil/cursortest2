package com.squareup.cash.calendar.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.android.CanvasCompatO;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class CalendarRowKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ ScheduleCalendarDate f$2;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ CalendarDateItemStyle f$5;
    public final /* synthetic */ Function1 f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda6(Modifier modifier, List list, ScheduleCalendarDate scheduleCalendarDate, boolean z, CalendarDateItemStyle calendarDateItemStyle, Function1 function1, boolean z2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = list;
        this.f$2 = scheduleCalendarDate;
        this.f$4 = z;
        this.f$5 = calendarDateItemStyle;
        this.f$6 = function1;
        this.f$7 = z2;
        this.f$8 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                CanvasCompatO.DateRow(this.f$0, this.f$1, this.f$2, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, Updater.updateChangedFlags(this.f$8 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                CanvasCompatO.AnimatedDateRow(this.f$0, this.f$1, this.f$2, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, Updater.updateChangedFlags(this.f$8 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
