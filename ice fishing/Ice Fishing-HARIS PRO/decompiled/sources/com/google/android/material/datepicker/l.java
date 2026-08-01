package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class l extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2534d = r.c(null).getMaximum(4);
    public static final int e = (r.c(null).getMaximum(7) + r.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final k f2535a;

    /* renamed from: b, reason: collision with root package name */
    public c f2536b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2537c;

    public l(k kVar, b bVar) {
        this.f2535a = kVar;
        this.f2537c = bVar;
        throw null;
    }

    public final int a() {
        int i = this.f2537c.e;
        k kVar = this.f2535a;
        Calendar calendar = kVar.f2528a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + kVar.f2531d : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a2 = (i - a()) + 1;
        Calendar a3 = r.a(this.f2535a.f2528a);
        a3.set(5, a2);
        return Long.valueOf(a3.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f2535a.e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f2535a.f2531d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f2536b == null) {
            this.f2536b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a2 = i - a();
        if (a2 >= 0) {
            k kVar = this.f2535a;
            if (a2 < kVar.e) {
                textView.setTag(kVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a2 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                r.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            r.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
