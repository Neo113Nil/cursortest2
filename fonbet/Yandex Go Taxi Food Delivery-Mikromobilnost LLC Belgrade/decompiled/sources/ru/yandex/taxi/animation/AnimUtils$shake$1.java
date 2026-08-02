package ru.yandex.taxi.animation;

import android.animation.Animator;
import android.view.View;
import defpackage.cma1;
import defpackage.zd2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/animation/AnimUtils$shake$1", "Lru/yandex/taxi/animation/BaseAnimatorListener;", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnimUtils$shake$1 extends BaseAnimatorListener {
    final /* synthetic */ int $firstStepDuration;
    final /* synthetic */ View $view;

    public AnimUtils$shake$1(View view, int i) {
        this.$view = view;
        this.$firstStepDuration = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float onAnimationEnd$lambda$0(float f) {
        double d = f;
        return (float) (1.0d - (Math.cos(d * 1.5707963267948966d) * Math.cos(20.420352248333657d * d)));
    }

    @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        cma1.c(this.$view).translationX(0.0f).setDuration(600 - this.$firstStepDuration).setInterpolator(new zd2()).start();
    }
}
