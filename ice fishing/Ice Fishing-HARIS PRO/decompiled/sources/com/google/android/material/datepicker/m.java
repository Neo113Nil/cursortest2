package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class m implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2539b;

    public m(o oVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2539b = oVar;
        this.f2538a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f2538a;
        l a2 = materialCalendarGridView.a();
        if (i < a2.a() || i > a2.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((MaterialCalendar) this.f2539b.e.f10b).f2467Y.f2506c.f2512a) {
            throw null;
        }
    }
}
