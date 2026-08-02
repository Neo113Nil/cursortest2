package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.transition.ViewUtils;
import coil3.request.OneShotDisposable;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class BaseMotionStrategy {
    public final Context context;
    public MotionSpec defaultMotionSpec;
    public final ExtendedFloatingActionButton fab;
    public final ArrayList listeners = new ArrayList();
    public MotionSpec motionSpec;
    public final OneShotDisposable tracker;

    public BaseMotionStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, OneShotDisposable oneShotDisposable) {
        this.fab = extendedFloatingActionButton;
        this.context = extendedFloatingActionButton.getContext();
        this.tracker = oneShotDisposable;
    }

    public final AnimatorSet createAnimator(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        boolean hasPropertyValues = motionSpec.hasPropertyValues("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.fab;
        if (hasPropertyValues) {
            arrayList.add(motionSpec.getAnimator("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues("scale")) {
            arrayList.add(motionSpec.getAnimator("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", extendedFloatingActionButton, ExtendedFloatingActionButton.WIDTH));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", extendedFloatingActionButton, ExtendedFloatingActionButton.HEIGHT));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.PADDING_START));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.PADDING_END));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", extendedFloatingActionButton, new ViewUtils.AnonymousClass1(9, Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int getDefaultMotionSpecResource();

    public void onAnimationCancel() {
        this.tracker.job = null;
    }

    public abstract void onAnimationEnd();

    public abstract void onAnimationStart(Animator animator);

    public abstract void performNow();

    public abstract boolean shouldCancel();

    public AnimatorSet createAnimator() {
        MotionSpec motionSpec = this.motionSpec;
        if (motionSpec == null) {
            if (this.defaultMotionSpec == null) {
                this.defaultMotionSpec = MotionSpec.createFromResource(this.context, getDefaultMotionSpecResource());
            }
            motionSpec = this.defaultMotionSpec;
            motionSpec.getClass();
        }
        return createAnimator(motionSpec);
    }
}
