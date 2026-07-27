package com.google.android.material.datepicker;

import O.A0;
import O.InterfaceC0358u;
import android.view.View;

/* loaded from: classes2.dex */
public final class l implements InterfaceC0358u {

    /* renamed from: n, reason: collision with root package name */
    public final View f36133n;

    /* renamed from: u, reason: collision with root package name */
    public int f36134u;

    /* renamed from: v, reason: collision with root package name */
    public int f36135v;

    public l(View view) {
        this.f36133n = view;
    }

    @Override // O.InterfaceC0358u
    public A0 k(View view, A0 a02) {
        int i = a02.f2213a.f(7).f1152b;
        View view2 = this.f36133n;
        int i4 = this.f36134u;
        if (i4 >= 0) {
            view2.getLayoutParams().height = i4 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f36135v + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return a02;
    }

    public l(int i, int i4, View view) {
        this.f36134u = i;
        this.f36133n = view;
        this.f36135v = i4;
    }
}
