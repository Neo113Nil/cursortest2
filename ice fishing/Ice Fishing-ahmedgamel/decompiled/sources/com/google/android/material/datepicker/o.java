package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.icefishingapp.icefishing.C5275R;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class o extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f36004d = v.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f36005e = (v.c(null).getMaximum(7) + v.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final n f36006a;

    /* renamed from: b, reason: collision with root package name */
    public c f36007b;

    /* renamed from: c, reason: collision with root package name */
    public final b f36008c;

    public o(n nVar, b bVar) {
        this.f36006a = nVar;
        this.f36008c = bVar;
        throw null;
    }

    public final int a() {
        int i = this.f36008c.f35939x;
        n nVar = this.f36006a;
        Calendar calendar = nVar.f35997n;
        int i6 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i9 = i6 - i;
        return i9 < 0 ? i9 + nVar.f36000w : i9;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a9 = (i - a()) + 1;
        Calendar a10 = v.a(this.f36006a.f35997n);
        a10.set(5, a9);
        return Long.valueOf(a10.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f36006a.f36001x) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f36005e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f36006a.f36000w;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f36007b == null) {
            this.f36007b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5275R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a9 = i - a();
        if (a9 >= 0) {
            n nVar = this.f36006a;
            if (a9 < nVar.f36001x) {
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
