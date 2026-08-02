package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.icefishingapp.icefishing.C5275R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f35945d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f35946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35948c;

    static {
        f35945d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar c9 = v.c(null);
        this.f35946a = c9;
        this.f35947b = c9.getMaximum(7);
        this.f35948c = c9.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f35947b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i6 = this.f35947b;
        if (i >= i6) {
            return null;
        }
        int i9 = i + this.f35948c;
        if (i9 > i6) {
            i9 -= i6;
        }
        return Integer.valueOf(i9);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5275R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i6 = i + this.f35948c;
        int i9 = this.f35947b;
        if (i6 > i9) {
            i6 -= i9;
        }
        Calendar calendar = this.f35946a;
        calendar.set(7, i6);
        textView.setText(calendar.getDisplayName(7, f35945d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C5275R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar c9 = v.c(null);
        this.f35946a = c9;
        this.f35947b = c9.getMaximum(7);
        this.f35948c = i;
    }
}
