package ru.yandex.taxi.animation;

import android.animation.Animator;
import android.view.View;
import defpackage.fu31;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"ru/yandex/taxi/animation/AnimUtils$CancelAwareAnimationEndListener", "Lfu31;", "Landroid/animation/Animator$AnimatorListener;", "Ljava/lang/Runnable;", "callback", "<init>", "(Ljava/lang/Runnable;)V", "Landroid/view/View;", "view", "Lzy11;", "onAnimationEnd", "(Landroid/view/View;)V", "Landroid/animation/Animator;", "animation", "(Landroid/animation/Animator;)V", "onAnimationCancel", "onAnimationRepeat", "onAnimationStart", "Ljava/lang/Runnable;", "", "cancelled", "Z", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnimUtils$CancelAwareAnimationEndListener extends fu31 implements Animator.AnimatorListener {
    private final Runnable callback;
    private boolean cancelled;

    public AnimUtils$CancelAwareAnimationEndListener(Runnable runnable) {
        this.callback = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        this.cancelled = true;
    }

    @Override // defpackage.fu31, defpackage.eu31
    public void onAnimationEnd(View view) {
        super.onAnimationEnd(view);
        if (this.cancelled) {
            return;
        }
        this.callback.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        if (this.cancelled) {
            return;
        }
        this.callback.run();
    }
}
