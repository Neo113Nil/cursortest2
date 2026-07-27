package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class p extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f36169d = w.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f36170e = (w.c(null).getMaximum(7) + w.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final o f36171a;

    /* renamed from: b, reason: collision with root package name */
    public c f36172b;

    /* renamed from: c, reason: collision with root package name */
    public final b f36173c;

    public p(o oVar, b bVar) {
        this.f36171a = oVar;
        this.f36173c = bVar;
        throw null;
    }

    public final int a() {
        int i = this.f36173c.f36102x;
        o oVar = this.f36171a;
        Calendar calendar = oVar.f36162n;
        int i4 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i9 = i4 - i;
        return i9 < 0 ? i9 + oVar.f36165w : i9;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a9 = (i - a()) + 1;
        Calendar a10 = w.a(this.f36171a.f36162n);
        a10.set(5, a9);
        return Long.valueOf(a10.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f36171a.f36166x) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f36170e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f36171a.f36165w;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f36172b == null) {
            this.f36172b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5284R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a9 = i - a();
        if (a9 >= 0) {
            o oVar = this.f36171a;
            if (a9 < oVar.f36166x) {
                textView.setTag(oVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a9 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                w.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            w.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
