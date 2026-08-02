package com.miteksystems.misnap.workflow.a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.miteksystems.misnap.workflow.view.CountdownTimerView;
import com.miteksystems.misnap.workflow.view.GuideView;
import com.miteksystems.misnap.workflow.view.HintView;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.miteksystems.misnap.workflow.view.RecordingIconView;
import com.miteksystems.misnap.workflow.view.SuccessView;
import com.miteksystems.misnap.workflow.view.TorchView;

/* loaded from: classes4.dex */
public final class e implements ViewBinding {
    public final ConstraintLayout a;
    public final AppCompatImageView c;
    public final CountdownTimerView d;
    public final GuideView e;
    public final AppCompatImageView i;
    public final HintView j;
    public final AppCompatImageView k;
    public final o l;
    public final MiSnapView m;
    public final RecordingIconView n;
    public final SuccessView o;
    public final TorchView p;

    public e(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, CountdownTimerView countdownTimerView, GuideView guideView, AppCompatImageView appCompatImageView2, HintView hintView, AppCompatImageView appCompatImageView3, o oVar, MiSnapView miSnapView, RecordingIconView recordingIconView, SuccessView successView, TorchView torchView) {
        this.a = constraintLayout;
        this.c = appCompatImageView;
        this.d = countdownTimerView;
        this.e = guideView;
        this.i = appCompatImageView2;
        this.j = hintView;
        this.k = appCompatImageView3;
        this.l = oVar;
        this.m = miSnapView;
        this.n = recordingIconView;
        this.o = successView;
        this.p = torchView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
