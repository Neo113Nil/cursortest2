package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.DateInputFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class DateInputValidator {
    public final DateInputFormat dateInputFormat;
    public final String errorDateOutOfYearRange;
    public final String errorDatePattern;
    public final DatePickerDefaults$AllDates$1 selectableDates;
    public final IntRange yearRange;

    public DateInputValidator(IntRange intRange, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, DateInputFormat dateInputFormat, DatePickerFormatterImpl datePickerFormatterImpl, String str, String str2, String str3) {
        this.yearRange = intRange;
        this.selectableDates = datePickerDefaults$AllDates$1;
        this.dateInputFormat = dateInputFormat;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
    }

    /* renamed from: validate-XivgLIo, reason: not valid java name */
    public final String m521validateXivgLIo(CalendarDate calendarDate, Locale locale) {
        if (calendarDate == null) {
            String upperCase = this.dateInputFormat.patternWithDelimiters.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] copyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.errorDatePattern, Arrays.copyOf(copyOf, copyOf.length));
        }
        int i = calendarDate.year;
        IntRange intRange = this.yearRange;
        if (intRange.contains(i)) {
            this.selectableDates.getClass();
            return "";
        }
        Object[] copyOf2 = Arrays.copyOf(new Object[]{CalendarLocale_jvmKt.toLocalString$default(intRange.first, locale), CalendarLocale_jvmKt.toLocalString$default(intRange.last, locale)}, 2);
        return String.format(this.errorDateOutOfYearRange, Arrays.copyOf(copyOf2, copyOf2.length));
    }
}
