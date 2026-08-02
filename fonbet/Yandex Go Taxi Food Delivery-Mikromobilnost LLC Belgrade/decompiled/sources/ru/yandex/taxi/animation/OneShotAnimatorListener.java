package ru.yandex.taxi.animation;

import android.animation.Animator;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001Bg\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\fR$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/animation/OneShotAnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "Lkotlin/Function1;", "Landroid/animation/Animator;", "Lzy11;", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "<init>", "(Ltls;Ltls;Ltls;Ltls;)V", "animation", "(Landroid/animation/Animator;)V", "animationStart", "Ltls;", "animationEnd", "animationCancel", "animationRepeat", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneShotAnimatorListener implements Animator.AnimatorListener {
    private tls animationCancel;
    private tls animationEnd;
    private tls animationRepeat;
    private tls animationStart;

    public /* synthetic */ OneShotAnimatorListener(tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tlsVar, (i & 2) != 0 ? null : tlsVar2, (i & 4) != 0 ? null : tlsVar3, (i & 8) != 0 ? null : tlsVar4);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        tls tlsVar = this.animationCancel;
        this.animationCancel = null;
        if (tlsVar != null) {
            tlsVar.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        tls tlsVar = this.animationEnd;
        this.animationEnd = null;
        if (tlsVar != null) {
            tlsVar.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        tls tlsVar = this.animationRepeat;
        this.animationRepeat = null;
        if (tlsVar != null) {
            tlsVar.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        tls tlsVar = this.animationStart;
        this.animationStart = null;
        if (tlsVar != null) {
            tlsVar.invoke(animation);
        }
    }

    public OneShotAnimatorListener(tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4) {
        this.animationStart = tlsVar;
        this.animationEnd = tlsVar2;
        this.animationCancel = tlsVar3;
        this.animationRepeat = tlsVar4;
    }

    public OneShotAnimatorListener() {
        this(null, null, null, null, 15, null);
    }
}
