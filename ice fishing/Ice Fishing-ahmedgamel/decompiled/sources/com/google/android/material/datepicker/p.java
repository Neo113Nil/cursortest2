package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final class p implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f36009n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f36010u;

    public p(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f36010u = rVar;
        this.f36009n = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.f36009n;
        o a9 = materialCalendarGridView.a();
        if (i < a9.a() || i > a9.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((j) this.f36010u.f36014d.f1264u).f35959B0.f35937v.f35944n) {
            throw null;
        }
    }
}
