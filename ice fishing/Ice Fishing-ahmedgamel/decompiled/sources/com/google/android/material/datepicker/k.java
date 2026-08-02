package com.google.android.material.datepicker;

import O.A0;
import O.InterfaceC0350u;
import android.view.View;

/* loaded from: classes2.dex */
public final class k implements InterfaceC0350u {

    /* renamed from: n, reason: collision with root package name */
    public final View f36736n;

    /* renamed from: u, reason: collision with root package name */
    public int f36737u;

    /* renamed from: v, reason: collision with root package name */
    public int f36738v;

    public k(View view) {
        this.f36736n = view;
    }

    @Override // O.InterfaceC0350u
    public A0 p(View view, A0 a02) {
        int i = a02.f2115a.f(7).f1032b;
        View view2 = this.f36736n;
        int i4 = this.f36737u;
        if (i4 >= 0) {
            view2.getLayoutParams().height = i4 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f36738v + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return a02;
    }

    public k(int i, int i4, View view) {
        this.f36737u = i;
        this.f36736n = view;
        this.f36738v = i4;
    }
}
