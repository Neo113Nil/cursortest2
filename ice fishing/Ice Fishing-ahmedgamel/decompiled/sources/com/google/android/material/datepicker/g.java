package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.C4997M;

/* loaded from: classes2.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f36720E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ j f36721F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, int i, int i4) {
        super(i);
        this.f36721F = jVar;
        this.f36720E = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(C4997M c4997m, int[] iArr) {
        int i = this.f36720E;
        j jVar = this.f36721F;
        if (i == 0) {
            iArr[0] = jVar.f36727B0.getWidth();
            iArr[1] = jVar.f36727B0.getWidth();
        } else {
            iArr[0] = jVar.f36727B0.getHeight();
            iArr[1] = jVar.f36727B0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4987C
    public final void x0(RecyclerView recyclerView, int i) {
        t tVar = new t(recyclerView.getContext());
        tVar.f40807a = i;
        y0(tVar);
    }
}
