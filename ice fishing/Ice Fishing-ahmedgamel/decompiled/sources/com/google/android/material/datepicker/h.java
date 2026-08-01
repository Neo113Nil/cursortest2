package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.AbstractC4987B;

/* loaded from: classes2.dex */
public final class h extends AbstractC4987B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f35954a;

    public h(j jVar) {
        this.f35954a = jVar;
        v.c(null);
        v.c(null);
    }

    @Override // t0.AbstractC4987B
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f35954a.getClass();
            throw null;
        }
    }
}
