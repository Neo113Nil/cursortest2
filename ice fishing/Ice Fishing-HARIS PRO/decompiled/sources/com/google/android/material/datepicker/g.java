package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k0.X;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f2519E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f2520F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.f2520F = materialCalendar;
        this.f2519E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final void B0(RecyclerView recyclerView, int i) {
        p pVar = new p(recyclerView.getContext());
        pVar.f3614a = i;
        C0(pVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void E0(X x2, int[] iArr) {
        int i = this.f2519E;
        MaterialCalendar materialCalendar = this.f2520F;
        if (i == 0) {
            iArr[0] = materialCalendar.f2472d0.getWidth();
            iArr[1] = materialCalendar.f2472d0.getWidth();
        } else {
            iArr[0] = materialCalendar.f2472d0.getHeight();
            iArr[1] = materialCalendar.f2472d0.getHeight();
        }
    }
}
