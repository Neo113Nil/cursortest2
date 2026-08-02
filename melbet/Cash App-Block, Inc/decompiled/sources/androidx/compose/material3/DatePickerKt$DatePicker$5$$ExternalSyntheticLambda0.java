package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.CalendarMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$DatePicker$5$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DatePickerStateImpl f$0;

    public /* synthetic */ DatePickerKt$DatePicker$5$$ExternalSyntheticLambda0(DatePickerStateImpl datePickerStateImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = datePickerStateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        DatePickerStateImpl datePickerStateImpl = this.f$0;
        switch (i) {
            case 0:
                CalendarModelImpl calendarModelImpl = datePickerStateImpl.calendarModel;
                int i2 = ((DisplayMode) obj).value;
                Long selectedDateMillis = datePickerStateImpl.getSelectedDateMillis();
                if (selectedDateMillis != null) {
                    CalendarMonth month = calendarModelImpl.getMonth(calendarModelImpl.getMonth(selectedDateMillis.longValue()).startUtcTimeMillis);
                    if (datePickerStateImpl.yearRange.contains(month.year)) {
                        datePickerStateImpl._displayedMonth.setValue(month);
                    }
                }
                datePickerStateImpl._displayMode.setValue(new DisplayMode(i2));
                break;
            case 1:
                datePickerStateImpl.setSelectedDateMillis((Long) obj);
                break;
            default:
                CalendarMonth month2 = datePickerStateImpl.calendarModel.getMonth(((Long) obj).longValue());
                if (datePickerStateImpl.yearRange.contains(month2.year)) {
                    datePickerStateImpl._displayedMonth.setValue(month2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
