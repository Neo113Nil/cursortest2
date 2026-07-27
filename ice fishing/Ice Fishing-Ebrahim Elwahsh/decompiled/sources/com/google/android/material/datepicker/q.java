package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f36174n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s f36175u;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f36175u = sVar;
        this.f36174n = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j9) {
        MaterialCalendarGridView materialCalendarGridView = this.f36174n;
        p a9 = materialCalendarGridView.a();
        if (i < a9.a() || i > a9.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((k) this.f36175u.f36179d.f1233u).f36124B0.f36100v.f36107n) {
            throw null;
        }
    }
}
