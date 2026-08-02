package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.AdapterHelper;
import com.squareup.cash.R;
import com.stripe.hcaptcha.HCaptcha;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class MonthAdapter extends BaseAdapter {
    public final CalendarConstraints calendarConstraints;
    public HCaptcha calendarStyle;
    public final SingleDateSelector dateSelector;
    public final Month month;
    public ArrayList previouslySelectedDates;
    public static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendarOf(null).getMaximum(4);
    public static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendarOf(null).getMaximum(7) + UtcDates.getUtcCalendarOf(null).getMaximum(5)) - 1;

    public MonthAdapter(Month month, SingleDateSelector singleDateSelector, CalendarConstraints calendarConstraints) {
        this.month = month;
        this.dateSelector = singleDateSelector;
        this.calendarConstraints = calendarConstraints;
        this.previouslySelectedDates = singleDateSelector.getSelectedDays();
    }

    public final int findNextValidDayPosition(int i) {
        do {
            i++;
            if (i > lastPositionInMonth()) {
                return -1;
            }
        } while (!isDayPositionValid(i));
        return i;
    }

    public final int findPreviousValidDayPosition(int i) {
        do {
            i--;
            if (i < firstPositionInMonth()) {
                return -1;
            }
        } while (!isDayPositionValid(i));
        return i;
    }

    public final int firstPositionInMonth() {
        int i = this.calendarConstraints.firstDayOfWeek;
        Month month = this.month;
        Calendar calendar = month.firstOfMonth;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + month.daysInWeek : i3;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public final Long getItem(int i) {
        if (i < firstPositionInMonth() || i > lastPositionInMonth()) {
            return null;
        }
        int firstPositionInMonth = (i - firstPositionInMonth()) + 1;
        Calendar dayCopy = UtcDates.getDayCopy(this.month.firstOfMonth);
        dayCopy.set(5, firstPositionInMonth);
        return Long.valueOf(dayCopy.getTimeInMillis());
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.month.daysInWeek;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Long item;
        Context context = viewGroup.getContext();
        if (this.calendarStyle == null) {
            this.calendarStyle = new HCaptcha(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int firstPositionInMonth = i - firstPositionInMonth();
        if (firstPositionInMonth >= 0) {
            Month month = this.month;
            if (firstPositionInMonth < month.daysInMonth) {
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(firstPositionInMonth + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    return textView;
                }
                updateSelectedState(textView, item.longValue());
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        item = getItem(i);
        if (item != null) {
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public final boolean isDayPositionValid(int i) {
        Long item = getItem(i);
        return item != null && this.calendarConstraints.validator.isValid(item.longValue());
    }

    public final int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    public final void updateSelectedState(TextView textView, long j) {
        boolean z;
        boolean z2;
        AdapterHelper adapterHelper;
        boolean z3;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = UtcDates.getTodayCalendar().getTimeInMillis() == j;
        SingleDateSelector singleDateSelector = this.dateSelector;
        singleDateSelector.getClass();
        Iterator it = new ArrayList().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((Pair) it.next()).first;
            if (obj != null && ((Long) obj).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = new ArrayList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj2 = ((Pair) it2.next()).second;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendarOf = UtcDates.getUtcCalendarOf(null);
        utcCalendarOf.setTimeInMillis(j);
        String format2 = todayCalendar.get(1) == utcCalendarOf.get(1) ? UtcDates.getAndroidFormat("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : UtcDates.getAndroidFormat("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z4) {
            format2 = String.format(context.getString(R.string.mtrl_picker_today_description), format2);
        }
        if (z) {
            format2 = String.format(context.getString(R.string.mtrl_picker_start_date_description), format2);
        } else if (z2) {
            format2 = String.format(context.getString(R.string.mtrl_picker_end_date_description), format2);
        }
        textView.setContentDescription(format2);
        if (this.calendarConstraints.validator.isValid(j)) {
            textView.setEnabled(true);
            Iterator it3 = singleDateSelector.getSelectedDays().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (UtcDates.canonicalYearMonthDay(j) == UtcDates.canonicalYearMonthDay(((Long) it3.next()).longValue())) {
                        z3 = true;
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            if (z3) {
                adapterHelper = (AdapterHelper) this.calendarStyle.exception;
            } else {
                boolean z5 = UtcDates.getTodayCalendar().getTimeInMillis() == j;
                HCaptcha hCaptcha = this.calendarStyle;
                adapterHelper = z5 ? (AdapterHelper) hCaptcha.onSuccessListeners : (AdapterHelper) hCaptcha.result;
            }
        } else {
            textView.setEnabled(false);
            adapterHelper = (AdapterHelper) this.calendarStyle.internalConfig;
        }
        adapterHelper.styleItem(textView);
    }

    public final void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month create = Month.create(j);
        Month month = this.month;
        if (create.equals(month)) {
            Calendar dayCopy = UtcDates.getDayCopy(month.firstOfMonth);
            dayCopy.setTimeInMillis(j);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().firstPositionInMonth() + (dayCopy.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }
}
