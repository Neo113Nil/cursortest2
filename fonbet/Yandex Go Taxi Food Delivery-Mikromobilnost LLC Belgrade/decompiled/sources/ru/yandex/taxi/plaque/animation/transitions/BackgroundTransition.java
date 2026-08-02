package ru.yandex.taxi.plaque.animation.transitions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import defpackage.ou;
import defpackage.sls;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.plaque.api.models.display.MicroWidgetDrawable;

/* loaded from: classes9.dex */
public final class BackgroundTransition extends Transition {
    public static final String[] h0 = {"yandex:taxi:background"};

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"Lru/yandex/taxi/plaque/animation/transitions/BackgroundTransition$AnimationStateListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/AnimatorListenerAdapter;", "", "needAnimateAlpha", "needAnimateCorners", "Landroid/graphics/drawable/Drawable;", "animationDrawable", "Lru/yandex/taxi/plaque/api/models/display/MicroWidgetDrawable;", "startBackground", "endBackground", "Lkotlin/Function0;", "Lzy11;", "onEnd", "<init>", "(ZZLandroid/graphics/drawable/Drawable;Lru/yandex/taxi/plaque/api/models/display/MicroWidgetDrawable;Lru/yandex/taxi/plaque/api/models/display/MicroWidgetDrawable;Lsls;)V", "Landroid/animation/ValueAnimator;", "animation", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Landroid/animation/Animator;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Z", "Landroid/graphics/drawable/Drawable;", "Lru/yandex/taxi/plaque/api/models/display/MicroWidgetDrawable;", "Lsls;", "", "", "diffCornerRadii", "Ljava/util/List;", "getDiffCornerRadii", "()Ljava/util/List;", "", "startCornerRadii", "[F", "getStartCornerRadii", "()[F", "endCornerRadii", "getEndCornerRadii", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class AnimationStateListener extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final Drawable animationDrawable;
        private final List<Float> diffCornerRadii = new ArrayList();
        private final MicroWidgetDrawable endBackground;
        private final float[] endCornerRadii;
        private final boolean needAnimateAlpha;
        private final boolean needAnimateCorners;
        private final sls onEnd;
        private final MicroWidgetDrawable startBackground;
        private final float[] startCornerRadii;

        public AnimationStateListener(boolean z, boolean z2, Drawable drawable, MicroWidgetDrawable microWidgetDrawable, MicroWidgetDrawable microWidgetDrawable2, sls slsVar) {
            this.needAnimateAlpha = z;
            this.needAnimateCorners = z2;
            this.animationDrawable = drawable;
            this.startBackground = microWidgetDrawable;
            this.endBackground = microWidgetDrawable2;
            this.onEnd = slsVar;
            float[] initialCornerRadii = microWidgetDrawable.getInitialCornerRadii();
            this.startCornerRadii = initialCornerRadii;
            float[] initialCornerRadii2 = microWidgetDrawable2.getInitialCornerRadii();
            this.endCornerRadii = initialCornerRadii2;
            int min = Math.min(initialCornerRadii.length, initialCornerRadii2.length);
            for (int i = 0; i < min; i++) {
                this.diffCornerRadii.add(Float.valueOf(this.endCornerRadii[i] - this.startCornerRadii[i]));
            }
            this.endBackground.setCornerRadii(this.startCornerRadii);
            this.endBackground.setAlpha(255);
        }

        public final List<Float> getDiffCornerRadii() {
            return this.diffCornerRadii;
        }

        public final float[] getEndCornerRadii() {
            return this.endCornerRadii;
        }

        public final float[] getStartCornerRadii() {
            return this.startCornerRadii;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            this.onEnd.invoke();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            Object animatedValue = animation.getAnimatedValue();
            Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
            int intValue = num != null ? num.intValue() : 255;
            if (this.needAnimateAlpha) {
                this.startBackground.setAlpha(255 - intValue);
            }
            if (this.needAnimateCorners && this.diffCornerRadii.size() == 8) {
                float[] fArr = this.startCornerRadii;
                ArrayList arrayList = new ArrayList(fArr.length);
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    arrayList.add(Float.valueOf((this.diffCornerRadii.get(i2).floatValue() * (intValue / 255.0f)) + fArr[i]));
                    i++;
                    i2++;
                }
                float[] G0 = kotlin.collections.a.G0(arrayList);
                this.startBackground.setCornerRadii(G0);
                this.endBackground.setCornerRadii(G0);
            }
            this.animationDrawable.invalidateSelf();
        }
    }

    public static void X(TransitionValues transitionValues) {
        View view = transitionValues.b;
        if (view.isLaidOut() || view.getWidth() > 0 || view.getHeight() > 0) {
            transitionValues.a.put("yandex:taxi:background", view.getBackground());
        }
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return h0;
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        MicroWidgetDrawable microWidgetDrawable;
        MicroWidgetDrawable microWidgetDrawable2;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.b;
        Object obj = transitionValues.a.get("yandex:taxi:background");
        if (!(obj instanceof MicroWidgetDrawable)) {
            if (obj instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) obj;
                if (layerDrawable.getNumberOfLayers() != 0) {
                    Drawable drawable = layerDrawable.getDrawable(0);
                    if (drawable instanceof MicroWidgetDrawable) {
                        microWidgetDrawable2 = (MicroWidgetDrawable) drawable;
                    }
                }
            }
            microWidgetDrawable = null;
            Object obj2 = transitionValues2.a.get("yandex:taxi:background");
            MicroWidgetDrawable microWidgetDrawable3 = !(obj2 instanceof MicroWidgetDrawable) ? (MicroWidgetDrawable) obj2 : null;
            if (microWidgetDrawable == null && microWidgetDrawable3 != null) {
                boolean hasSameGradient = microWidgetDrawable.hasSameGradient(microWidgetDrawable3);
                boolean z = !hasSameGradient;
                boolean hasSameShape = microWidgetDrawable.hasSameShape(microWidgetDrawable3);
                boolean z2 = !hasSameShape;
                if (hasSameGradient && hasSameShape) {
                    return null;
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(new MicroWidgetDrawable[]{microWidgetDrawable3, microWidgetDrawable});
                ou ouVar = new ou(4, microWidgetDrawable3, view);
                view.setBackground(layerDrawable2);
                AnimationStateListener animationStateListener = new AnimationStateListener(z, z2, layerDrawable2, microWidgetDrawable, microWidgetDrawable3, ouVar);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                ofInt.addUpdateListener(animationStateListener);
                ofInt.addListener(animationStateListener);
                return ofInt;
            }
        }
        microWidgetDrawable2 = (MicroWidgetDrawable) obj;
        microWidgetDrawable = microWidgetDrawable2;
        Object obj22 = transitionValues2.a.get("yandex:taxi:background");
        if (!(obj22 instanceof MicroWidgetDrawable)) {
        }
        return microWidgetDrawable == null ? null : null;
    }
}
