package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;

/* renamed from: com.plaid.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0239n5 implements ViewBinding {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final AppCompatButton d;
    public final LinearLayout e;

    public C0239n5(LinearLayout linearLayout, TextView textView, TextView textView2, AppCompatButton appCompatButton, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = appCompatButton;
        this.e = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
