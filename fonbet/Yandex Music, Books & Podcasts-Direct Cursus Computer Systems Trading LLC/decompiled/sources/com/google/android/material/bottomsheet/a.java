package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.ref.Reference;

/* loaded from: classes3.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomSheetBehavior a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        bottomSheetBehavior.setStateInternal(5);
        Reference reference = bottomSheetBehavior.viewRef;
        if (reference == null || reference.get() == null) {
            return;
        }
        ((View) bottomSheetBehavior.viewRef.get()).requestLayout();
    }
}
