package com.miteksystems.misnap.workflow.a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes4.dex */
public final class j implements ViewBinding {
    public final ConstraintLayout a;
    public final MaterialButton h;
    public final LinearProgressIndicator i;
    public final MaterialTextView j;
    public final AppCompatImageView k;
    public final MaterialTextView l;
    public final MaterialButton m;
    public final MaterialButton n;

    public j(ConstraintLayout constraintLayout, MaterialButton materialButton, LinearProgressIndicator linearProgressIndicator, MaterialTextView materialTextView, AppCompatImageView appCompatImageView, MaterialTextView materialTextView2, MaterialButton materialButton2, MaterialButton materialButton3) {
        this.a = constraintLayout;
        this.h = materialButton;
        this.i = linearProgressIndicator;
        this.j = materialTextView;
        this.k = appCompatImageView;
        this.l = materialTextView2;
        this.m = materialButton2;
        this.n = materialButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
