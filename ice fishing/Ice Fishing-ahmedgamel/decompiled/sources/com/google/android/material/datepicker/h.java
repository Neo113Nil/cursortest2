package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.AbstractC4985A;

/* loaded from: classes2.dex */
public final class h extends AbstractC4985A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f36722a;

    public h(j jVar) {
        this.f36722a = jVar;
        v.c(null);
        v.c(null);
    }

    @Override // t0.AbstractC4985A
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f36722a.getClass();
            throw null;
        }
    }
}
