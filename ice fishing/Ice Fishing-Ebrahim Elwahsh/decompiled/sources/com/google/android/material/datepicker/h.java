package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.AbstractC5017A;

/* loaded from: classes2.dex */
public final class h extends AbstractC5017A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f36117a;

    public h(k kVar) {
        this.f36117a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // t0.AbstractC5017A
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f36117a.getClass();
            throw null;
        }
    }
}
