package com.miteksystems.misnap.workflow.a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.workflow.view.GuideView;
import com.miteksystems.misnap.workflow.view.HintView;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.miteksystems.misnap.workflow.view.RecordingIconView;
import com.miteksystems.misnap.workflow.view.SuccessView;
import com.miteksystems.misnap.workflow.view.TorchView;

/* loaded from: classes4.dex */
public final class d implements ViewBinding {
    public final ConstraintLayout a;
    public final AppCompatImageView c;
    public final MaterialTextView d;
    public final GuideView e;
    public final AppCompatImageView h;
    public final HintView i;
    public final AppCompatImageView j;
    public final o k;
    public final MiSnapView l;
    public final RecordingIconView m;
    public final SuccessView n;
    public final TorchView o;

    public d(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, GuideView guideView, AppCompatImageView appCompatImageView2, HintView hintView, AppCompatImageView appCompatImageView3, o oVar, MiSnapView miSnapView, RecordingIconView recordingIconView, SuccessView successView, TorchView torchView) {
        this.a = constraintLayout;
        this.c = appCompatImageView;
        this.d = materialTextView;
        this.e = guideView;
        this.h = appCompatImageView2;
        this.i = hintView;
        this.j = appCompatImageView3;
        this.k = oVar;
        this.l = miSnapView;
        this.m = recordingIconView;
        this.n = successView;
        this.o = torchView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
