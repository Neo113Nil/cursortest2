package com.miteksystems.misnap.workflow.a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.workflow.view.GuideView;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.miteksystems.misnap.workflow.view.RecordingIconView;
import com.miteksystems.misnap.workflow.view.SuccessView;
import com.miteksystems.misnap.workflow.view.TorchView;

/* loaded from: classes4.dex */
public final class c implements ViewBinding {
    public final ConstraintLayout a;
    public final MaterialTextView b;
    public final AppCompatImageView d;
    public final GuideView e;
    public final AppCompatImageView h;
    public final AppCompatImageView i;
    public final o j;
    public final MiSnapView k;
    public final RecordingIconView l;
    public final SuccessView m;
    public final TorchView n;

    public c(ConstraintLayout constraintLayout, MaterialTextView materialTextView, AppCompatImageView appCompatImageView, GuideView guideView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, o oVar, MiSnapView miSnapView, RecordingIconView recordingIconView, SuccessView successView, TorchView torchView) {
        this.a = constraintLayout;
        this.b = materialTextView;
        this.d = appCompatImageView;
        this.e = guideView;
        this.h = appCompatImageView2;
        this.i = appCompatImageView3;
        this.j = oVar;
        this.k = miSnapView;
        this.l = recordingIconView;
        this.m = successView;
        this.n = torchView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
