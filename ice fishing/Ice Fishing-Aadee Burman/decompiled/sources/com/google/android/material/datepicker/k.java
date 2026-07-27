package com.google.android.material.datepicker;

import O.A0;
import O.InterfaceC0345u;
import android.view.View;

/* loaded from: classes2.dex */
public final class k implements InterfaceC0345u {

    /* renamed from: n, reason: collision with root package name */
    public final View f35968n;

    /* renamed from: u, reason: collision with root package name */
    public int f35969u;

    /* renamed from: v, reason: collision with root package name */
    public int f35970v;

    public k(View view) {
        this.f35968n = view;
    }

    @Override // O.InterfaceC0345u
    public A0 q(View view, A0 a02) {
        int i = a02.f2027a.f(7).f1006b;
        View view2 = this.f35968n;
        int i6 = this.f35969u;
        if (i6 >= 0) {
            view2.getLayoutParams().height = i6 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f35970v + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return a02;
    }

    public k(int i, int i6, View view) {
        this.f35969u = i;
        this.f35968n = view;
        this.f35970v = i6;
    }
}
