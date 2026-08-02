package com.google.android.material.datepicker;

import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.startup.RumStartupScenario;
import com.datadog.android.rum.internal.startup.RumTTIDInfo;
import com.google.android.filament.Box;
import com.google.android.material.datepicker.SingleDateSelector;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
public final /* synthetic */ class DateFormatTextWatcher$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ DateFormatTextWatcher$$ExternalSyntheticLambda1(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        long j = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                SingleDateSelector.AnonymousClass1 anonymousClass1 = (SingleDateSelector.AnonymousClass1) obj;
                Calendar todayCalendar = UtcDates.getTodayCalendar();
                Calendar utcCalendarOf = UtcDates.getUtcCalendarOf(null);
                utcCalendarOf.setTimeInMillis(j);
                anonymousClass1.textInputLayout.setError(String.format(anonymousClass1.outOfRange, (todayCalendar.get(1) == utcCalendarOf.get(1) ? UtcDates.getAndroidFormat("MMMd", Locale.getDefault()).format(new Date(j)) : DateStrings.getYearMonthDay(j)).replace(' ', (char) 160)));
                SingleDateSelector singleDateSelector = SingleDateSelector.this;
                anonymousClass1.val$dateTextInput.getError();
                singleDateSelector.getClass();
                anonymousClass1.val$listener.onIncompleteSelectionChanged();
                break;
            default:
                Box box = (Box) obj;
                RumStartupScenario rumStartupScenario = (RumStartupScenario) box.mCenter;
                ((AdvancedRumMonitor) box.mHalfExtent).sendTTIDEvent(new RumTTIDInfo(rumStartupScenario, j - rumStartupScenario.getInitialTime().nanoTime));
                break;
        }
    }
}
