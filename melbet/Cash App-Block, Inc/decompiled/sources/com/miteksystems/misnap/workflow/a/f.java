package com.miteksystems.misnap.workflow.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes4.dex */
public final class f implements ViewBinding {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final FrameLayout c;
    public final MaterialTextView d;
    public final LinearLayout e;
    public final MaterialButton n;

    public f(ConstraintLayout constraintLayout, MaterialButton materialButton, FrameLayout frameLayout, MaterialTextView materialTextView, LinearLayout linearLayout, MaterialButton materialButton2) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = frameLayout;
        this.d = materialTextView;
        this.e = linearLayout;
        this.n = materialButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
