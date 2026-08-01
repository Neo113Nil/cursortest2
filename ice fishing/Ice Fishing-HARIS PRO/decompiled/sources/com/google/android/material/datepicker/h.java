package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k0.H;

/* loaded from: classes.dex */
public final class h extends H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f2521a;

    public h(MaterialCalendar materialCalendar) {
        this.f2521a = materialCalendar;
        r.c(null);
        r.c(null);
    }

    @Override // k0.H
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2521a.getClass();
            throw null;
        }
    }
}
