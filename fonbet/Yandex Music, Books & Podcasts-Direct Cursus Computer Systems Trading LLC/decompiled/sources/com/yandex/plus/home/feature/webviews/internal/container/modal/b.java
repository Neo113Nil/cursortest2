package com.yandex.plus.home.feature.webviews.internal.container.modal;

import android.animation.ValueAnimator;

/* loaded from: classes5.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ModalViewBehavior a;

    public b(ModalViewBehavior modalViewBehavior) {
        this.a = modalViewBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        com.google.android.material.shape.a aVar;
        com.google.android.material.shape.a aVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ModalViewBehavior modalViewBehavior = this.a;
        aVar = modalViewBehavior.materialShapeDrawable;
        if (aVar != null) {
            aVar2 = modalViewBehavior.materialShapeDrawable;
            aVar2.s(floatValue);
        }
    }
}
