package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.squareup.cash.R;
import com.stripe.hcaptcha.HCaptcha;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class YearGridAdapter extends RecyclerView.Adapter {
    public final MaterialCalendar materialCalendar;

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView textView;

        public ViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }

    public YearGridAdapter(MaterialCalendar materialCalendar) {
        this.materialCalendar = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.materialCalendar.calendarConstraints.yearSpan;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        MaterialCalendar materialCalendar = this.materialCalendar;
        final int i2 = materialCalendar.calendarConstraints.start.year + i;
        viewHolder2.textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = viewHolder2.textView;
        Context context = textView.getContext();
        textView.setContentDescription(UtcDates.getTodayCalendar().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        HCaptcha hCaptcha = materialCalendar.calendarStyle;
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        AdapterHelper adapterHelper = (AdapterHelper) (todayCalendar.get(1) == i2 ? hCaptcha.handler : hCaptcha.onFailureListeners);
        Iterator it = materialCalendar.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            todayCalendar.setTimeInMillis(((Long) it.next()).longValue());
            if (todayCalendar.get(1) == i2) {
                adapterHelper = (AdapterHelper) hCaptcha.onOpenListeners;
            }
        }
        adapterHelper.styleItem(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Context context2 = textView.getContext();
            Drawable foreground = textView.getForeground();
            ColorDrawable colorDrawable = FocusRingDrawable.EMPTY_DRAWABLE;
            if (MaterialAttributes.resolveBoolean(context2.getTheme(), R.attr.focusRingsEnabled, false)) {
                foreground = new FocusRingDrawable(context2, foreground);
            }
            if (foreground instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) foreground;
                ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) adapterHelper.mOpReorderer;
                FocusRingDrawable.FocusRingState focusRingState = focusRingDrawable.state;
                focusRingState.ringShapeAppearance = shapeAppearanceModel;
                focusRingState.ringInset = ((Rect) adapterHelper.mUpdateOpPool).top;
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(adapterHelper == ((AdapterHelper) hCaptcha.onOpenListeners));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialCalendar materialCalendar2 = YearGridAdapter.this.materialCalendar;
                Month create = Month.create(i2, materialCalendar2.current.month);
                CalendarConstraints calendarConstraints = materialCalendar2.calendarConstraints;
                Month month = calendarConstraints.end;
                Month month2 = calendarConstraints.start;
                if (create.compareTo(month2) < 0) {
                    create = month2;
                } else if (create.compareTo(month) > 0) {
                    create = month;
                }
                materialCalendar2.setCurrentMonth(create);
                materialCalendar2.setSelector$1(1);
                MaterialButton materialButton = materialCalendar2.monthDropSelect;
                if (materialButton != null) {
                    materialButton.sendAccessibilityEvent(8);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
