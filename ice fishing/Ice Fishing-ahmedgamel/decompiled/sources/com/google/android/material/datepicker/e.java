package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f36713d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f36714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36716c;

    static {
        f36713d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar c9 = v.c(null);
        this.f36714a = c9;
        this.f36715b = c9.getMaximum(7);
        this.f36716c = c9.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f36715b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i4 = this.f36715b;
        if (i >= i4) {
            return null;
        }
        int i6 = i + this.f36716c;
        if (i6 > i4) {
            i6 -= i4;
        }
        return Integer.valueOf(i6);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5248R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i4 = i + this.f36716c;
        int i6 = this.f36715b;
        if (i4 > i6) {
            i4 -= i6;
        }
        Calendar calendar = this.f36714a;
        calendar.set(7, i4);
        textView.setText(calendar.getDisplayName(7, f36713d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C5248R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar c9 = v.c(null);
        this.f36714a = c9;
        this.f36715b = c9.getMaximum(7);
        this.f36716c = i;
    }
}
