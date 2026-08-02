package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import java.time.LocalDate;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class DatePickerStateImpl {
    public final ParcelableSnapshotMutableState _displayMode;
    public final ParcelableSnapshotMutableState _displayedMonth;
    public final ParcelableSnapshotMutableState _selectedDate;
    public final CalendarModelImpl calendarModel;
    public final Locale locale;
    public final ParcelableSnapshotMutableState selectableDates$delegate;
    public final IntRange yearRange;

    public DatePickerStateImpl(Long l, Long l2, IntRange intRange, int i, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, Locale locale) {
        CalendarMonth month;
        this.yearRange = intRange;
        this.locale = locale;
        CalendarModelImpl calendarModelImpl = new CalendarModelImpl(locale);
        this.calendarModel = calendarModelImpl;
        this.selectableDates$delegate = Updater.mutableStateOf$default(datePickerDefaults$AllDates$1);
        if (l2 != null) {
            month = calendarModelImpl.getMonth(l2.longValue());
            if (!intRange.contains(month.year)) {
                CalendarDate today = calendarModelImpl.getToday();
                month = calendarModelImpl.getMonth(LocalDate.of(today.year, today.month, 1));
            }
        } else {
            CalendarDate today2 = calendarModelImpl.getToday();
            month = calendarModelImpl.getMonth(LocalDate.of(today2.year, today2.month, 1));
        }
        this._displayedMonth = Updater.mutableStateOf$default(month);
        CalendarDate calendarDate = null;
        if (l != null) {
            CalendarDate canonicalDate = this.calendarModel.getCanonicalDate(l.longValue());
            if (intRange.contains(canonicalDate.year)) {
                calendarDate = canonicalDate;
            }
        }
        this._selectedDate = Updater.mutableStateOf$default(calendarDate);
        this._displayMode = Updater.mutableStateOf$default(new DisplayMode(i));
    }

    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    public final int m529getDisplayModejFl4v0() {
        return ((DisplayMode) this._displayMode.getValue()).value;
    }

    public final Long getSelectedDateMillis() {
        CalendarDate calendarDate = (CalendarDate) this._selectedDate.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.utcTimeMillis);
        }
        return null;
    }

    public final void setSelectedDateMillis(Long l) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this._selectedDate;
        if (l == null) {
            parcelableSnapshotMutableState.setValue(null);
        } else {
            CalendarDate canonicalDate = this.calendarModel.getCanonicalDate(l.longValue());
            parcelableSnapshotMutableState.setValue(this.yearRange.contains(canonicalDate.year) ? canonicalDate : null);
        }
    }
}
