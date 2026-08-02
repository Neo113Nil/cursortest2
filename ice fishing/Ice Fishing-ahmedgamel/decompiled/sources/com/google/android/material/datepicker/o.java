package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class o extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f36772d = v.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f36773e = (v.c(null).getMaximum(7) + v.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final n f36774a;

    /* renamed from: b, reason: collision with root package name */
    public c f36775b;

    /* renamed from: c, reason: collision with root package name */
    public final b f36776c;

    public o(n nVar, b bVar) {
        this.f36774a = nVar;
        this.f36776c = bVar;
        throw null;
    }

    public final int a() {
        int i = this.f36776c.f36707x;
        n nVar = this.f36774a;
        Calendar calendar = nVar.f36765n;
        int i4 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i6 = i4 - i;
        return i6 < 0 ? i6 + nVar.f36768w : i6;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a9 = (i - a()) + 1;
        Calendar a10 = v.a(this.f36774a.f36765n);
        a10.set(5, a9);
        return Long.valueOf(a10.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f36774a.f36769x) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f36773e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f36774a.f36768w;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f36775b == null) {
            this.f36775b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5248R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a9 = i - a();
        if (a9 >= 0) {
            n nVar = this.f36774a;
            if (a9 < nVar.f36769x) {
                textView.setTag(nVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a9 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                v.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            v.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
