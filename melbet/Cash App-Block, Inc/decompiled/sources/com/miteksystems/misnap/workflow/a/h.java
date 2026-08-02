package com.miteksystems.misnap.workflow.a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public final class h implements ViewBinding {
    public final ConstraintLayout a;
    public final TextInputEditText c;
    public final TextInputLayout d;
    public final MaterialButton e;
    public final MaterialButton f;
    public final MaterialButton g;
    public final TextView h;

    public h(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TextView textView) {
        this.a = constraintLayout;
        this.c = textInputEditText;
        this.d = textInputLayout;
        this.e = materialButton;
        this.f = materialButton2;
        this.g = materialButton3;
        this.h = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
