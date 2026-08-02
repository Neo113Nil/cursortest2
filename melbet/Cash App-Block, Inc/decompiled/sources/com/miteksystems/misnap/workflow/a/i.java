package com.miteksystems.misnap.workflow.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public final class i implements ViewBinding {
    public final ScrollView a;
    public final TextInputEditText c;
    public final TextInputLayout d;
    public final TextInputEditText e;
    public final TextInputLayout f;
    public final TextInputEditText g;
    public final TextInputLayout h;
    public final TextInputEditText i;
    public final TextInputLayout j;
    public final TextInputEditText k;
    public final TextInputLayout l;
    public final LinearLayout m;
    public final MaterialButton n;
    public final MaterialButton o;
    public final MaterialButton p;
    public final TextView q;

    public i(ScrollView scrollView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout4, TextInputEditText textInputEditText5, TextInputLayout textInputLayout5, LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TextView textView) {
        this.a = scrollView;
        this.c = textInputEditText;
        this.d = textInputLayout;
        this.e = textInputEditText2;
        this.f = textInputLayout2;
        this.g = textInputEditText3;
        this.h = textInputLayout3;
        this.i = textInputEditText4;
        this.j = textInputLayout4;
        this.k = textInputEditText5;
        this.l = textInputLayout5;
        this.m = linearLayout;
        this.n = materialButton;
        this.o = materialButton2;
        this.p = materialButton3;
        this.q = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
