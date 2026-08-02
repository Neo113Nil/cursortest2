package ru.yandex.taxi.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u0003\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/animation/AnimUtils$AnimationStartEndListener", "Landroid/animation/AnimatorListenerAdapter;", "Ljava/lang/Runnable;", "onAnimationStart", "onAnimationEnd", "<init>", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationCancel", "(Landroid/animation/Animator;)V", "Ljava/lang/Runnable;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AnimUtils$AnimationStartEndListener extends AnimatorListenerAdapter {
    private final Runnable onAnimationEnd;
    private final Runnable onAnimationStart;

    public AnimUtils$AnimationStartEndListener(Runnable runnable, Runnable runnable2) {
        this.onAnimationStart = runnable;
        this.onAnimationEnd = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        this.onAnimationEnd.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        this.onAnimationEnd.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        this.onAnimationStart.run();
    }
}
