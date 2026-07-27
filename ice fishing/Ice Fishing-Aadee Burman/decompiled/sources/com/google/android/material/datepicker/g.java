package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.C5000O;

/* loaded from: classes2.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f35952E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ j f35953F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, int i, int i6) {
        super(i);
        this.f35953F = jVar;
        this.f35952E = i6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(C5000O c5000o, int[] iArr) {
        int i = this.f35952E;
        j jVar = this.f35953F;
        if (i == 0) {
            iArr[0] = jVar.f35963G0.getWidth();
            iArr[1] = jVar.f35963G0.getWidth();
        } else {
            iArr[0] = jVar.f35963G0.getHeight();
            iArr[1] = jVar.f35963G0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC4990E
    public final void x0(RecyclerView recyclerView, int i) {
        t tVar = new t(recyclerView.getContext());
        tVar.f40757a = i;
        y0(tVar);
    }
}
