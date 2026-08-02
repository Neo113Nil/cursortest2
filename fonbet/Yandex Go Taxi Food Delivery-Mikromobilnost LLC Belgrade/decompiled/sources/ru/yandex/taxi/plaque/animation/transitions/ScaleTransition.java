package ru.yandex.taxi.plaque.animation.transitions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import defpackage.mtb1;
import java.util.HashMap;
import kotlin.Metadata;

/* loaded from: classes9.dex */
public final class ScaleTransition extends Transition {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/plaque/animation/transitions/ScaleTransition$ScaleAnimatorListener;", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/view/View;", "startView", "endView", "Landroid/graphics/Rect;", "initBounds", "<init>", "(Lru/yandex/taxi/plaque/animation/transitions/ScaleTransition;Landroid/view/View;Landroid/view/View;Landroid/graphics/Rect;)V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Landroid/animation/ValueAnimator;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Landroid/view/View;", "Landroid/graphics/Rect;", "Landroid/graphics/drawable/BitmapDrawable;", "startViewOverlayDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "endViewOverlayDrawable", "Landroid/view/ViewOverlay;", "kotlin.jvm.PlatformType", "endViewOverlay", "Landroid/view/ViewOverlay;", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public final class ScaleAnimatorListener extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final View endView;
        private final ViewOverlay endViewOverlay;
        private final BitmapDrawable endViewOverlayDrawable;
        private final Rect initBounds;
        private final View startView;
        private final BitmapDrawable startViewOverlayDrawable;

        public ScaleAnimatorListener(View view, View view2, Rect rect) {
            this.startView = view;
            this.endView = view2;
            this.initBounds = rect;
            BitmapDrawable b = mtb1.b(view);
            this.startViewOverlayDrawable = b;
            BitmapDrawable b2 = mtb1.b(view2);
            this.endViewOverlayDrawable = b2;
            ViewOverlay overlay = ((View) view2.getParent()).getOverlay();
            this.endViewOverlay = overlay;
            b.setBounds(rect);
            b2.setBounds(rect);
            b2.setAlpha(0);
            overlay.add(b);
            overlay.add(b2);
            view2.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.endViewOverlay.clear();
            this.endView.setVisibility(0);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            this.endViewOverlayDrawable.setBounds(this.endView.getLeft(), this.endView.getTop(), this.endView.getRight(), this.endView.getBottom());
            this.startViewOverlayDrawable.setBounds(this.endView.getLeft(), this.endView.getTop(), this.endView.getRight(), this.endView.getBottom());
            Object animatedValue = animation.getAnimatedValue();
            int max = Math.max(0, Math.min(255, ((int) (510.0f * ((animatedValue instanceof Float ? (Float) animatedValue : null) != null ? r6.floatValue() : 1.0f))) - 127));
            this.endViewOverlayDrawable.setAlpha(max);
            this.startViewOverlayDrawable.setAlpha(255 - max);
        }
    }

    public static void X(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        if (view.isLaidOut() || view.getWidth() > 0 || view.getHeight() > 0) {
            hashMap.put("yandex:taxi:scaleTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("yandex:taxi:scaleTransform:visibility", Integer.valueOf(transitionValues.b.getVisibility()));
            hashMap.put("yandex:taxi:scaleTransform:content", transitionValues.b.getContentDescription());
        }
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return new String[]{"yandex:taxi:scaleTransform:bounds", "yandex:taxi:scaleTransform:visibility", "yandex:taxi:scaleTransform:content"};
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.b;
        Object obj = transitionValues.a.get("yandex:taxi:scaleTransform:bounds");
        Rect rect = obj instanceof Rect ? (Rect) obj : null;
        if (rect == null) {
            rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        View view2 = transitionValues.b;
        View view3 = transitionValues2.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ScaleAnimatorListener scaleAnimatorListener = new ScaleAnimatorListener(view2, view3, rect);
        ofFloat.addListener(scaleAnimatorListener);
        ofFloat.addUpdateListener(scaleAnimatorListener);
        return ofFloat;
    }
}
