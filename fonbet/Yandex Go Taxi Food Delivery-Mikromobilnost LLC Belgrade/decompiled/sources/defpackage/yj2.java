package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.yj2;

/* loaded from: classes6.dex */
public final class yj2 {
    public final j63 a = new j63(0);

    public final void a(Animator animator) {
        if (this.a.add(animator)) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.animation.AnimatorCanceller$add$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    yj2.this.a.remove(animation);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    yj2.this.a.remove(animation);
                }
            });
        }
    }
}
