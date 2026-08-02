package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final class p implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f36777n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f36778u;

    public p(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f36778u = rVar;
        this.f36777n = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.f36777n;
        o a9 = materialCalendarGridView.a();
        if (i < a9.a() || i > a9.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((j) this.f36778u.f36782d.f1291u).f36732w0.f36705v.f36712n) {
            throw null;
        }
    }
}
