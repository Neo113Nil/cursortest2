package ru.yandex.taxi.design;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.vpa;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/design/NotificationStackComponent$showInternal$2", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationStackComponent$showInternal$2 extends AnimatorListenerAdapter {
    final /* synthetic */ NotificationStackComponent this$0;

    public NotificationStackComponent$showInternal$2(NotificationStackComponent notificationStackComponent) {
        this.this$0 = notificationStackComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        this.this$0.isHidden = false;
        this.this$0.moveToStackedState(null);
        this.this$0.cancelAnimationTask = new vpa(18);
    }
}
