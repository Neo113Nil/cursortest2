package com.miteksystems.misnap.workflow.a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.workflow.view.ProgressTrackerView;
import com.miteksystems.misnap.workflow.view.VisualizerView;

/* loaded from: classes4.dex */
public final class n implements ViewBinding {
    public final ConstraintLayout a;
    public final Group b;
    public final Group e;
    public final MaterialTextView g;
    public final AppCompatImageView l;
    public final TextView m;
    public final MaterialButton n;
    public final TextView o;
    public final ProgressTrackerView p;
    public final MaterialButton s;
    public final MaterialButton u;
    public final VisualizerView v;

    public n(ConstraintLayout constraintLayout, Group group, Group group2, MaterialTextView materialTextView, AppCompatImageView appCompatImageView, TextView textView, MaterialButton materialButton, TextView textView2, ProgressTrackerView progressTrackerView, MaterialButton materialButton2, MaterialButton materialButton3, VisualizerView visualizerView) {
        this.a = constraintLayout;
        this.b = group;
        this.e = group2;
        this.g = materialTextView;
        this.l = appCompatImageView;
        this.m = textView;
        this.n = materialButton;
        this.o = textView2;
        this.p = progressTrackerView;
        this.s = materialButton2;
        this.u = materialButton3;
        this.v = visualizerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
