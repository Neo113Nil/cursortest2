package com.squareup.cash.calendar.views;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.android.CanvasCompatO;
import com.squareup.cash.moneybot.viewmodels.chat.InChatPromptViewModel;
import com.squareup.cash.moneybot.views.chat.PromptPillMotion;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.payments.views.UtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class CalendarRowKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda11(Modifier modifier, InChatPromptViewModel inChatPromptViewModel, boolean z, boolean z2, boolean z3, PromptPillMotion promptPillMotion, Function0 function0, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = inChatPromptViewModel;
        this.f$2 = z;
        this.f$4 = z2;
        this.f$7 = z3;
        this.f$5 = promptPillMotion;
        this.f$6 = function0;
        this.f$8 = i;
        this.f$9 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$8;
        Object obj3 = this.f$5;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                CanvasCompatO.CalendarDateItem(this.f$0, (ScheduleCalendarDate) obj4, this.f$2, this.f$4, (CalendarDateItemStyle) obj3, this.f$6, this.f$7, (Composer) obj, updateChangedFlags, this.f$9);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                ViewfinderDefaults.InChatPromptPill(this.f$0, (InChatPromptViewModel) obj4, this.f$2, this.f$4, this.f$7, (PromptPillMotion) obj3, this.f$6, (Composer) obj, updateChangedFlags2, this.f$9);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                UtilKt.PersonalizePaymentReactionButton(this.f$0, this.f$2, (String) obj4, this.f$6, this.f$4, this.f$7, (Function2) obj3, (Composer) obj, updateChangedFlags3, this.f$9);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda11(Modifier modifier, ScheduleCalendarDate scheduleCalendarDate, boolean z, boolean z2, CalendarDateItemStyle calendarDateItemStyle, Function0 function0, boolean z3, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = scheduleCalendarDate;
        this.f$2 = z;
        this.f$4 = z2;
        this.f$5 = calendarDateItemStyle;
        this.f$6 = function0;
        this.f$7 = z3;
        this.f$8 = i;
        this.f$9 = i2;
    }

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda11(Modifier modifier, boolean z, String str, Function0 function0, boolean z2, boolean z3, Function2 function2, int i, int i2) {
        this.f$0 = modifier;
        this.f$2 = z;
        this.f$1 = str;
        this.f$6 = function0;
        this.f$4 = z2;
        this.f$7 = z3;
        this.f$5 = function2;
        this.f$8 = i;
        this.f$9 = i2;
    }
}
