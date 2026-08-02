package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzb;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class MonthsPagerAdapter extends RecyclerView.Adapter {
    public final CalendarConstraints calendarConstraints;
    public final SingleDateSelector dateSelector;
    public final int itemHeight;
    public int keyboardFocusDirection = 0;
    public final zzb onDayClickListener;
    public final zzr onMonthNavigationListener;
    public Month visibleMonth;

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public final MaterialCalendarGridView monthGrid;
        public final TextView monthTitle;

        public ViewHolder(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.monthTitle = textView;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            new ViewCompat.AnonymousClass3(1).set(textView, Boolean.TRUE);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter(ContextThemeWrapper contextThemeWrapper, SingleDateSelector singleDateSelector, CalendarConstraints calendarConstraints, zzb zzbVar, zzr zzrVar) {
        Month month = calendarConstraints.start;
        Month month2 = calendarConstraints.end;
        Month month3 = calendarConstraints.openAt;
        if (month.compareTo(month3) > 0) {
            a$$ExternalSyntheticBUOutline0.m$3("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.compareTo(month2) > 0) {
            a$$ExternalSyntheticBUOutline0.m$3("currentPage cannot be after lastPage");
            throw null;
        }
        this.itemHeight = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * MonthAdapter.MAXIMUM_WEEKS) + (MaterialDatePicker.readMaterialCalendarStyleBoolean(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.calendarConstraints = calendarConstraints;
        this.dateSelector = singleDateSelector;
        this.onDayClickListener = zzbVar;
        this.onMonthNavigationListener = zzrVar;
        this.visibleMonth = month3;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.calendarConstraints.monthSpan;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Calendar dayCopy = UtcDates.getDayCopy(this.calendarConstraints.start.firstOfMonth);
        dayCopy.add(2, i);
        dayCopy.set(5, 1);
        Calendar dayCopy2 = UtcDates.getDayCopy(dayCopy);
        dayCopy2.get(2);
        dayCopy2.get(1);
        dayCopy2.getMaximum(7);
        dayCopy2.getActualMaximum(5);
        dayCopy2.getTimeInMillis();
        return dayCopy2.getTimeInMillis();
    }

    public final Month getPageMonth(int i) {
        Calendar dayCopy = UtcDates.getDayCopy(this.calendarConstraints.start.firstOfMonth);
        dayCopy.add(2, i);
        return new Month(dayCopy);
    }

    public final int getPosition(Month month) {
        return this.calendarConstraints.start.monthsUntil(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        CalendarConstraints calendarConstraints = this.calendarConstraints;
        Calendar dayCopy = UtcDates.getDayCopy(calendarConstraints.start.firstOfMonth);
        dayCopy.add(2, i);
        Month month = new Month(dayCopy);
        viewHolder2.monthTitle.setText(month.getLongName());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder2.monthGrid.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !month.equals(materialCalendarGridView.getAdapter().month)) {
            MonthAdapter monthAdapter = new MonthAdapter(month, this.dateSelector, calendarConstraints);
            materialCalendarGridView.setNumColumns(month.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            MonthAdapter adapter = materialCalendarGridView.getAdapter();
            SingleDateSelector singleDateSelector = adapter.dateSelector;
            Iterator it = adapter.previouslySelectedDates.iterator();
            while (it.hasNext()) {
                adapter.updateSelectedStateForDate(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (singleDateSelector != null) {
                Iterator it2 = singleDateSelector.getSelectedDays().iterator();
                while (it2.hasNext()) {
                    adapter.updateSelectedStateForDate(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                adapter.previouslySelectedDates = singleDateSelector.getSelectedDays();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new AlertController.AlertParams.AnonymousClass3(1, this, materialCalendarGridView));
        materialCalendarGridView.onMonthNavigationListener = this.onMonthNavigationListener;
        boolean readMaterialCalendarStyleBoolean = MaterialDatePicker.readMaterialCalendarStyleBoolean(viewHolder2.itemView.getContext(), android.R.attr.windowFullscreen);
        if (readMaterialCalendarStyleBoolean || month.equals(this.visibleMonth)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(PKIFailureInfo.unsupportedVersion);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(393216);
        }
        if (readMaterialCalendarStyleBoolean || !month.equals(this.visibleMonth)) {
            return;
        }
        int i2 = this.keyboardFocusDirection;
        this.keyboardFocusDirection = 0;
        materialCalendarGridView.post(new Recorder$$ExternalSyntheticLambda14(this, materialCalendarGridView, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.readMaterialCalendarStyleBoolean(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.itemHeight));
        return new ViewHolder(linearLayout, true);
    }
}
