package com.miteksystems.misnap.workflow.a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes4.dex */
public final class l implements ViewBinding {
    public final ConstraintLayout a;
    public final AppCompatImageView l;
    public final MaterialButton m;
    public final MaterialTextView n;
    public final MaterialButton o;

    public l(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialButton materialButton, MaterialTextView materialTextView, MaterialButton materialButton2) {
        this.a = constraintLayout;
        this.l = appCompatImageView;
        this.m = materialButton;
        this.n = materialTextView;
        this.o = materialButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
